import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//1 задание//
        do_task_1();
//2 задание
        do_task_2();
        //3 задание
        do_task_3();
        //4 задание
        do_task_4();
        //5* задание
        do_task_5();
        // 6** задание
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте размер массива :");
        int size = scanner.nextInt();
        System.out.println("Вы выбрали размер: " + size);


        System.out.println(do_task_6(size));

        }


// 1 задание
    public static void do_task_1() {
    int b = new Random().nextInt(10); // рандомно генерируем размер массива
    while (b == 0) {                        // это чтобы размер массива не был 0, а то не видно, как все работает
         b = new Random().nextInt(10);
        }
        int a[] = new int[b];
        System.out.println("Создадим массив с рандомно выбранным размером : " + b );
        int i;
        System.out.println("Заполним его числами от 0 до 1 : ");
        for (i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(2);
            System.out.println(String.format("[%s] => %s", i, a[i]));
        }
        System.out.println("Заменим 0 на 1, а 1 на 0 : ");
        for (i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
                System.out.println(String.format("[%s] => %s", i, a[i]));
            }
            else if (a[i] == 1) {
                a[i] = 0;
                System.out.println(String.format("[%s] => %s", i, a[i]));
            }
        }
    }
// 2 задание
    public static void do_task_2() {
        int a[] = new int[8];
        for (int i = 0; i < a.length; i++) {
            a[i]= i*3;
            System.out.println(String.format("[%s] => %s", i, a[i]));
        }
    }
// 3 задание
    public static void do_task_3(){
        int a[]= {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a.length; i++) {

            if (a[i] < 6){
                a[i] = a[i]*2;
            }
            System.out.println(String.format("[%s] => %s", i, a[i]));
        }
    }
//4 задание
    // Я сделала, чтобы единицами заполнялись обе диагонали
    public static void do_task_4(){
        int b = new Random().nextInt(10); // рандомно генерируем размер массива
        while (b == 0) {                        // это чтобы размер массива не был 0, а то не видно, как все работает
            b = new Random().nextInt(10);
        }
        int a[][] = new int[b][b];
        int x = 0;
        int y = b-1;
        for (int i=0; i < a.length; i++){
            for (int j=0; j < a.length; j++) {
                a[i][j] = new Random().nextInt(10);
                if(i==j){ // заполнение единицами первой диагонали
                    a[i][j] = 1;
                }
                if (i == x && j== y){ // заполнение единицами второй диагонали
                    a[i][j] = 1;
                    x= x+1;
                    y = y-1;
                }
            }
        }
        for(int i = 0;i < a.length;i++){
            for (int j=0;j<a.length;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void do_task_5() {
        System.out.println("Сгенерируем одномерный массив :");
        int b = new Random().nextInt(10); // рандомно генерируем размер массива
        while (b == 0) {                        // это чтобы размер массива не был 0, а то не видно, как все работает
            b = new Random().nextInt(10);
        }
         int a[] = new int[b];
         int from_to = 10; // диапазон чисел, помещенных в массив
         for (int i = 0; i < a.length ; i++){
             a[i] = new Random().nextInt(from_to);
             System.out.print(a[i] + " ");
         }
        System.out.println(" ");
        System.out.println("Найдем максимальное и минимальное значение :");
        boolean way_out = false;
         while (from_to - 1 >= 0 ) {
             for (int i = 0; i < a.length; i++) {
                 if (a[i] == from_to-1) {
                     System.out.print("max = " + a[i] + " ");
                     way_out = true;      ///Единсвенный способ, который нашла, чтобы выйти из адского круга)))
                 }
                 if (way_out){

                     break;
                 }
             }
             if (way_out){
                 break;
             }
             from_to = from_to - 1;
         }
         int min = 0;
         way_out = false;
        while ( min <= from_to - 1 ) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == min) {

                    System.out.print("min = " + a[i]);
                    way_out = true;
                }
                if (way_out){
                    break;
                }
            }
            if (way_out){
                break;
            }
            min = min + 1;
        }
    }
    // Задание 6**
    //Спрашивает размер массива, просит ввести числа массив выбранного размера, говорит есть или нет место,где равны правая и левая часть и показывает это место:)
    public static boolean do_task_6(int size){
        Scanner scanner1 = new Scanner(System.in);
        int mass[]= new int[size];
        boolean result = false;
        int summa = 0;

        for (int i = 0; i<= size-1;i++){
            System.out.println(String.format("Введите %s-e число массива", i+1));
            int number = scanner1.nextInt();
            mass[i]=number;
            if ( i >= size-1){
                System.out.println( "Ваш массив : ");
                for ( i = 0; i<= size-1;i++){
                    System.out.print( "[" + mass[i] +"]");
                }
                for (i = 0; i<=size-1; i++){
                    summa = summa + mass[i];
                }
                int a=0;
                for (i = 0; i<mass.length-1; i++) {
                    summa = summa - mass[i];
                    if (summa == mass[i]+a){
                        System.out.println(" ");
                        result = true;
                        System.out.println("В массиве ЕСТЬ место, где равны правая и левая часть : " );
                        int count = i;
                        for ( i = 0; i<= mass.length-1;i++){
                            System.out.print( "[" + mass[i] +"]");
                            if (count == i){
                                System.out.print("||");
                            }
                        }


                    }
                    if (i < mass.length) {
                        a = a + mass[i];
                    }

                }


            }
        }
        System.out.println(" ");
        if (!result) {
            System.out.println("В массиве НЕТ места, где равны правая и левая часть :  ");
        }
        return result;
    }
}



