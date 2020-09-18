public class Main {


    public static void main(String[] args) {
// 2 задание
	byte value_1 = 127;
	short value_2 = -31111;
	int value_3 = 12345678;
	long value_4 = -896548789;
	float value_5 = 1.23f;
	double value_6 = -123.123;
	boolean value_7 = true;
	char value_8 = 'a';

	String str = "Hello knoweledge";

	// 3 задание
	calculate(1,2,6,3);
	// 4 задание
	if_from_10_to_20( 10,20);
	// 5 задание
	System.out.println(is_it_positive_or_negative(-159));
	// 6 задание
	System.out.println(negative_number(-1));
	// 7 задание
	System.out.println(my_name("Лиза"));
	// 8* задание
	System.out.println(special_year(2000));


    }
    // 3 задание
public static int calculate(int a, int b, int c, int d){
    	int result = a * (b + (c / d));
    	System.out.println("Результат:" + result);
    	return result;
}
// 4 задание
public static boolean if_from_10_to_20(int a, int b) {
    	boolean result;
    	if (a <= 20 && a >= 10 && b >= 10 && b <= 20) {
    		result = true;
    		System.out.println("Эти числа в диапазоне от 10 до 20 , значит : " + result);
    		return result;
}
    	else {
			result = false;
			System.out.println("Эти числа НЕ попадают в  диапозон от 10 до 20 , значит : " + result);
    		return result;
    	}
}
// 5 задание
public static String is_it_positive_or_negative(int a){
	String positive = "Было передано положительное число";
	String negative = "Было передано отрицательное число";
    	if (a >= 0){
			return positive;
		}

			return negative;
}
// 6 задание
public static boolean negative_number (int a){
    	boolean result;
    	if (a < 0){
    		result = true;
    		return result;
		}
    	result = false;
    	return result;
}
// 7 задание
public static String my_name(String name){
    	return "Привет, " + name;

}
// 8* задание
public static String special_year(int a){
        if ((a % 4) == 0 || (a % 400) == 0 || (a % 100) != 0) {
			return "Год " + a + " - високосный";
		}
			return "Год " + a + " - НЕ високосный";
}

	}
