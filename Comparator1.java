import java.util.Comparator;
import java.util.Map;

public class Comparator1 implements Comparator<String> {

    private final Map<String, Integer> map;

    public Comparator1( Map<String, Integer> map ){
this.map = map;

    }

    @Override
    public int compare(String o1, String o2) {
        return map.get(o1)- map.get(o2);
    }
}
