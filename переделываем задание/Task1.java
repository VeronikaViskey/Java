import java.util.ArrayList;

public class Task1 <T> {
    private T[] array;

    public T[] getArray() {
        return array;
    }

    public Task1(T... array) {
        this.array = array;
    }

    public ArrayList<T> fromArrayToArrayList(){
        ArrayList<T> arrayList = new ArrayList<T>();
        T value;
        for (int i = 0; i < array.length; i++) {
            value = array[i];
            arrayList.add(value);
        }
        return arrayList;
    }

    public T[] changePlaces(int firstPlace, int secondPlace){
        T firstPlaceValue;
        T secondPlaceValue;
        for (int i = 0; i < array.length ; i++) {
            firstPlaceValue = array[firstPlace];
            secondPlaceValue = array[secondPlace];
            array[firstPlace] = secondPlaceValue;
            array[secondPlace] = firstPlaceValue;
        }
        return array;
    }
}
