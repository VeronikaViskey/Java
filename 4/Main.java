public class Main {

        public static void main(String[] args) {
            new Thread(new Task1('A', 'B')).start();
            new Thread(new Task1('B', 'C')).start();
            new Thread(new Task1('C', 'A')).start();
        }
}
