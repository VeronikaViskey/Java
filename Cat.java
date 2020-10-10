public class Cat {
    private String name;
    private int appetite;
    boolean fullness;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }
    public void eat(Plate p) {
       if (p.decreaseFood(appetite)){
           fullness = true;
           System.out.println("Кот сыт:" + fullness );
       }
       else {
           System.out.println(fullness);
       }

    }
    public boolean isFull(){
        return fullness;
    }
}

