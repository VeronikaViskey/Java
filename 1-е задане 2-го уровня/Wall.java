public class Wall implements Barrier {
    private int height;

    public Wall(int height){
        this.height = height;
    }
    public int getLengthOrHeight() {
        return height;
    }
    public void className() {
        String className = this.getClass().getSimpleName();
        System.out.print(className + " : ");
    }
}
