public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        food -= n;
        if ( food<0 ){
            System.out.print("Кот не поел, в миске недостаточно еды: ");
            food +=n;
            return false;
        }
        else{
            return true;
        }
    }
    public void addFood(){
        food = 100;
        System.out.println("Наполним миску : plate: " + food);
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}