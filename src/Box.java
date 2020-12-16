import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitsList;


    public Box(ArrayList<T> fruitsList) {
        this.fruitsList = fruitsList;
    }

    public ArrayList<T> getFruitsList() {
        return fruitsList;
    }

    public float getWeight() {
        //!!!
        // Моя идея состояла в том, что мы у любого элемента arraylist берем значение поля fruitWight (так как мы знаем что у нас
        // либо только яблоки, либо только апельсины)
        // Я билась очень долго и НЕ понимаю, как объяснить это программе. Значение генерируется 0.0. Наверное потому что обращение
        // идет в класс Fruit и там оно не инициальзировано...
        // Вообщем здесь я застряла))
        float weightOfTheFruit = fruitsList.get(0).getFruitWeight;
        //!!!
        int fruitsNumber = fruitsList.size();
        float boxWeight = fruitsNumber * weightOfTheFruit;
        return boxWeight;
    }
}