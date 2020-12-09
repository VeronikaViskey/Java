
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class GasPool {
    private float capacity = 200f;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public float request(float amount){
        lock.writeLock().lock();
        try {
            if (amount > capacity) {
                return 0f;
            }
            Thread.sleep(5000);
            capacity = capacity - amount;
            return amount;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.writeLock().unlock();
        }
        return 0f;
    }

    public void info(){
        System.out.println("Rest of the fuel : "+ capacity);
    }

    @Override
    public String toString() {
        return "GasPool{" +
                "capacity=" + capacity +
                '}';
    }
}
