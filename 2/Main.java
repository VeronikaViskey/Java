import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
doTaskOne();
doTaskTwo(3);
    }
    public static void doTaskOne(){

        try (
                FileOutputStream fout = new FileOutputStream("C:\\Users\\acerpc\\IdeaProjects\\lvl_3_lesson_3(2)\\src\\logger.text",true);
                Scanner scanner = new Scanner(System.in);
        ) {

            String letter = scanner.next();
            fout.write("\n".getBytes());
            fout.write(letter.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void doTaskTwo(int numberOfString){
        try (
                FileInputStream fin = new FileInputStream("C:\\Users\\acerpc\\IdeaProjects\\lvl_3_lesson_3(2)\\src\\logger.text");
        BufferedReader br = new BufferedReader(new InputStreamReader(fin));
                Scanner scanner = new Scanner("C:\\Users\\acerpc\\IdeaProjects\\lvl_3_lesson_3(2)\\src\\logger.text");
        ){
            String line;
            List<String> lines = new ArrayList<>();

            while((line = br.readLine()) != null){
                lines.add(line);
            }

            for (int i = numberOfString; i <lines.size() ; i++) {
                System.out.println(lines.get(i));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
