import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitsList;


    public Box(ArrayList<T> fruitsList) {
        this.fruitsList = fruitsList;
    }

    public ArrayList<T> getFruitsList() {
        return fruitsList;
    }

    public float getWeight(){
        float weight = 0.0f;
        for(T o : fruitsList){
            weight += o.getWeight();
        }return weight;
    }

    public boolean compare(Box box){
        if(this.getWeight()==box.getWeight()) {
            return true;
        } else {
            return false;
        }

    }

    public void fromOneBoxToAnother(Box box) throws Exception{
        if (this.fruitsList.get(1).getClass() != box.fruitsList.get(1).getClass() ){
            throw new RuntimeException("You can not mix Apples and Oranges");
        }
        box.fruitsList.addAll(this.fruitsList);
        this.fruitsList.clear();
        System.out.println(this.getWeight());
        System.out.println(box.getWeight());

    }

    public void addFruitsToBox(T typeOfTheFruit,int numberOfFruits){
        for(int i=0;i<numberOfFruits;i++){
            fruitsList.add(typeOfTheFruit);
        }
    }
}