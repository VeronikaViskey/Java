import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        do_task_one();
        do_task_two();

    }

    // 1 задание

    public static void do_task_one() {

        ArrayList<String> words = new ArrayList<>();
        words.add("Стол");
        words.add("Стул");
        words.add("Кровать");
        words.add("Стена");
        words.add("Одеяло");
        words.add("Одеяло");
        words.add("Одеяло");
        words.add("Кровать");
        words.add("Книга");
        words.add("Свет");
        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>(words);
        System.out.println(uniqueWords);

        Map<String, Integer> repeatOfWords = new HashMap<>();


        int size = words.size();
        
        for (int i = 0; i < size; i++) {
            String word1 = words.get(i);
            int count = 0 ;
            for (int j = 0; j < size; j++) {
                String word2 = words.get(j);
                if(word1.equals(word2)){
                    count++;
                }
                if (j == size-1){
                    repeatOfWords.put(word1,count);
                }

            }

        }
        System.out.println(repeatOfWords);
    }

    // 2 задание
    public static void do_task_two(){

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Бобина","+79643926494");
        phoneBook.add("Бобина","+79117622276");
        phoneBook.add("Теренте","+79658965478");
        phoneBook.add("Агафонцев","+79896589658");
        phoneBook.add("Иванов","+79589632541");
        phoneBook.add("Иванов","+79123654789");
        phoneBook.add("Иванов","+79159753684");

        System.out.println(phoneBook.get("Бобина"));
        System.out.println(phoneBook.get("Иванов"));


    }
}



