public class Cat implements Run_and_Jump {
    private int runlimit;
    private int jumplimit;

    public Cat(int runlimit, int jumplimit){
        this.runlimit = runlimit;
        this.jumplimit = jumplimit;
    }
    public void runOrJump(int j) {
        String className = this.getClass().getSimpleName();
        if (j == 0) {
            System.out.println(className + " running ");
        } else {
            System.out.println(className + " jumping");
        }
    }

    public int getLimit(int j) {
        if (j == 0) {
            return runlimit;
        }
        else {
            return jumplimit;
        }
    }
}