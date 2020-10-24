public class Track implements Barrier{
    private int length;

    public Track(int length){
        this.length = length;
    }
    public int getLengthOrHeight() {
        return length;
    }
    public void className() {
        String className = this.getClass().getSimpleName();
        System.out.print(className + " : ");
    }
}
