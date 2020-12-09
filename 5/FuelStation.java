import java.util.concurrent.Semaphore;

public class FuelStation {
   private GasPool gasPool;
   private Semaphore semaphore;

    public FuelStation() {
        this.gasPool = new GasPool();
        this.semaphore = new Semaphore(3);
    }

    public float refuel(float amount){
        try {
            semaphore.acquire();
            float request = gasPool.request(amount);

            gasPool.info();
          return request;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return 0f;
    }
}
