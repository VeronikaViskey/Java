import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        // 1 задание
        ClientWindow clientWindow = new ClientWindow();

        // 2 задание

        Map <String, Integer> map = new TreeMap<>();
        map.put("666", 66);
        map.put("458", 13);
        map.put("852", -1000);
        map.put("0", -10);
        map.put("55", 89);
        map.put("159", 0);

        Comparator comparator = new Comparator1(map);
        Map <String, Integer> mapSorted = new TreeMap<>(comparator);
mapSorted.putAll(map);
        System.out.println(mapSorted);
    }
}
