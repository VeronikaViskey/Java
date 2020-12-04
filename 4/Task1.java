public class Task1 implements Runnable {
        static private char letter = 'A';
        static Object mon = new Object();

        private char currentLetter;
        private char nextLetter;

        public Task1(char currentLetter, char nextLetter) {
            this.currentLetter = currentLetter;
            this.nextLetter = nextLetter;
        }

        @Override
        public void run() {
            synchronized (mon) {
            for (int i = 0; i < 5; i++) {
                    try {
                        while (letter != currentLetter){
                            mon.wait();
                        }
                        System.out.print(currentLetter);
                        letter = nextLetter;
                        mon.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }