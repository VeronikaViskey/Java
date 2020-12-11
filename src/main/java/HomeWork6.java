public class HomeWork6 {
    public static int[] returnArrayAfterLast4(int [] array) throws RuntimeException{
        for (int i = array.length-1; i > 0; i--) {
            if (array[i] == 4){
                 int [] arrayAfterLast4 = new int[array.length - i-1];
                 System.arraycopy(array,i+1,arrayAfterLast4,0,array.length - i-1);
                 return arrayAfterLast4;
            }
        }

        throw new RuntimeException("4 not fount");
    }

public static boolean checkIfIs4Or1InArray(int [] array){
    for (int i = 0; i < array.length; i++) {
        if (array[i] == 4 || array[i] == 1){
            return true;

        }
    }
    return false;
}
}
