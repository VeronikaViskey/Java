import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook = new HashMap<>();

public void add(String name, String number) {
    if (phoneBook.containsKey(name)){
        phoneBook.get(name).add(number);

    } else {
        Set<String> numbers = new HashSet<>();
        numbers.add(number);
        phoneBook.put(name,numbers);

    }
}
public Set<String> get(String name){
    return phoneBook.get(name);
}
}

