import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // 1 задание
        Task1<Integer> task1 = new Task1<Integer>(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(Arrays.asList(task1.getArray()));
        task1.changePlaces(4,5);
        System.out.println(Arrays.asList(task1.getArray()));
        // 2 задание
        System.out.println(task1.fromArrayToArrayList());
        // 3 задание
 //       ArrayList<Cat> cats = new ArrayList<Cat>();
        Box box1 = new Box(
                new ArrayList<Orange>(
                )
        );
        box1.getFruitsList().add(new Orange());
        box1.getFruitsList().add(new Orange());
        box1.getFruitsList().add(new Orange());
        box1.getFruitsList().add(new Orange());

        Box box2 = new Box(
                new ArrayList<Apple>(
                )
        );
        box2.getFruitsList().add(new Apple());
        box2.getFruitsList().add(new Apple());
        box2.getFruitsList().add(new Apple());
        box2.getFruitsList().add(new Apple());

        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());











    }
}
