import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Random random  = new Random();
	theGame(scanner, random);
    }
    public static void theGame(Scanner scanner, Random random){
//        int size ;

        int size = askSize(scanner);
        char[][] field = doGameField(size);

        drawGameField(field, size);
        do {
            doPlayerMove(field, scanner, size);
            if (isFinal(field, 'X')) {
                break;
            }
            doComputerMove(random, field, size);
            if (isFinal(field, 'O')) {
                break;
            }
            drawGameField(field, size);
        }while (true);
       System.out.println("Итоговый результат: ");
       drawGameField(field,size);
    }


    static int askSize(Scanner scanner){
        System.out.println("Задайте размер поля:");
        int number = scanner.nextInt();
        return number;

    }

    static boolean isFinal(char[][] field, char sign) {
        if (isWin(field, sign)) {
            String name = sign == 'X' ? "Игрок" : "Компьютер";
            System.out.println(String.format("%s победил", name));
            return true;
        }
        if (isDraw(field)) {
            System.out.println("Ничья");
            return true;
        }
        return false;
    }

static boolean isWin(char[][] field,char sign){
// проверка по горизонтали
    for (int i = 0; i < field.length; i++) {
        for (int j = 0; j < field.length-2; j++) {
            if (field[i][j] == sign && field[i][j+1] == sign && field[i][j+2] == sign) {
                return true;
            }
        }
    }
    // проверка по вертикли
    for (int i = 0; i < field.length; i++) {
        for (int j = 0; j < field.length-2; j++) {
            if (field[j][i] == sign && field[j+1][i] == sign && field[j+2][i] == sign) {
                return true;
            }
        }
    }
// проверка по первой диагонали
    for (int i = field.length-3; i > 0; i--) {
        for (int j = 0 ; j < field.length - 2 ; j++) {
            if (field[i][j] == sign && field[i + 1][j + 1] == sign && field[i + 2][j + 2] == sign) {
                return true;
            }
        }
    }
    if(field.length>3) {
        for (int i = field.length - 3; i < field.length - 2; i++) {
            for (int j = field.length - 1; j > 1; j--) {
                if (field[i][j] == sign && field[i - 1][j - 1] == sign && field[i - 2][j - 2] == sign) {
                    return true;
                }
            }
        }
    }

    // проверка по другой диагонали
    for (int i = 0; i < field.length-2; i++) {
        for (int j = field.length-1 ; j >1 ; j--) {
            if (field[i][j] == sign && field[i + 1][j - 1] == sign && field[i + 2][j - 2] == sign) {
                return true;
            }
        }
    }
    return false;

}

    static boolean isDraw(char[][] field){
        int count = field.length* field.length;
        for(int i = 0; i < field.length; i ++){
            for (int j = 0; j < field.length; j ++){
                if(field[i][j] != '•'){
                    count--;

                }
            }

        }
        return count ==0;

    }
    static char[][]  doGameField(int size) {
        char [][] gameField = new char[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                gameField[i][j] = '•';
            }
        }
        return gameField;
    }
    static void drawGameField(char[][] field, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
     static void doPlayerMove(char[][] field, Scanner scanner,int size){
        int x;
        int y;
        do {
            x = askCoordinats(scanner,'X',size);
            y = askCoordinats(scanner,'Y',size);
        }
        while(field[x][y] != '•');
        field[x][y] = 'X';

     }


     static void doComputerMove (Random random, char[][] field, int size){
         int x, y;
         do {
             x = random.nextInt(size);
             y = random.nextInt(size);
         } while (field[x][y] != '•');
         field[x][y] = 'O';

     }



     static int askCoordinats(Scanner scanner, char coordName, int size) {
        int coord;
        do {
            System.out.println(String.format("Введите координату %s в диапазоне от 1 до %s", coordName, size));
            coord= scanner.nextInt() - 1;
        } while (coord < 0 || coord > size);
        return coord;

    }

}
