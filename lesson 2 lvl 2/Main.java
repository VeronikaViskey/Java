public class Main {

    public static void main(String[] args) {
        String[][] stringArray = {{"1","2","3","4"},{"5","6","7","8"},{"9","10","11","12"},{"13","14","15","16"}};
	do_task(stringArray);
    }
    public static void do_task(String[][] stringArray){
// проверяем размер массива
            for (int i = 0; i < stringArray.length ; i++){
                try {
                    if (stringArray[i].length != stringArray.length || stringArray.length !=4)
                        throw new MyArraySizeException();
                }
                catch (MyArraySizeException e){
                    System.out.println("AAAAAAAA размер массива должен быть 4х4");

                }

            }


        int summ=0;
        for(int i = 0; i < stringArray.length ; i++){
            for(int j = 0; j < stringArray.length ; j++) {
                int k = 0;
                try {
                    if (!(isDigit(i,j,stringArray)))
                    throw new MyArrayDataException();


                } catch (MyArrayDataException e) {
                    System.out.println("Данные неверного типа в ячейке массива" + "["+ i +"]"+"["+ j +"]");

                }
                k = Integer.parseInt(stringArray[i][j]);
                summ = summ + k;
            }

        }
        System.out.println(summ);




    }
    private static boolean isDigit(int i, int j,String[][] stringArray) throws NumberFormatException {
        try {
            Integer.parseInt(stringArray[i][j]);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
