public class Animal {
    private int limitForRun;
    private int limitForSwim;
    private int limitForJump;




    public void Animal(){

    }

    public boolean run(int runLength) {
        System.out.println("Животное бежит");
        return true;
    }
    public boolean swim(int swimLength) {
        System.out.println("Животное плывет");
        return true;
    }
    public boolean jump(int jumpHeight) {
        System.out.println("Животное прыгает");
        return true;
    }

}
