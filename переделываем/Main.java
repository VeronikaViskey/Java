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

        Box box1 = new Box(new ArrayList<Orange>());
        box1.addFruitsToBox(new Orange(),5);

        Box box2 = new Box(new ArrayList<Orange>()
        );
        box2.addFruitsToBox(new Orange(),2);

        Box box3 = new Box(new ArrayList<Apple>());
        box3.addFruitsToBox(new Apple(),4);

        Box box4 = new Box(new ArrayList<Apple>());
        box4.addFruitsToBox(new Apple(),3);

        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box3.getWeight());
        System.out.println(box4.getWeight());

        System.out.println(box1.compare(box3));
        System.out.println(box4.compare(box2));


        try {
            box2.fromOneBoxToAnother(box1);
            box4.fromOneBoxToAnother(box3);
            box3.fromOneBoxToAnother(box1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
