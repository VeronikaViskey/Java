public class Dog extends Animal {

    private int limitForRun = 500;
    private int limitForSwim = 10;
    private double limitForJump = 0.5;

    @Override
    public boolean run(int runLength) {
        if ( runLength < limitForRun){
            System.out.print("run: ");
            return true;
        }
        else {
            System.out.print("run: ");
            return false;
        }
    }

    @Override
    public boolean swim(int swimLength) {
        if ( swimLength < limitForSwim){
            System.out.print("swim: ");
            return true;
        }
        else {
            System.out.print("swim: ");
            return false;
        }
    }

    @Override
    public boolean jump(int jumpHeight) {
        if ( jumpHeight < limitForJump){
            System.out.print(" jump: ");
            return true;
        } else {
            System.out.print("jump: ");
            return false;
        }

    }
}
