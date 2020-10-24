public class Main {

    public static void main(String[] args) {
		Run_and_Jump[] run_and_jump = {new Cat(20, 5), new Robot(300,1),new Human(100,2)};
		Barrier[] barrier = {new Track(30), new Wall(3)};
		do_task(run_and_jump,barrier);

    }
    public static void do_task(Run_and_Jump[] run_and_jump,Barrier[] barrier ) {

		for (int i = 0; i < run_and_jump.length; i++) {
			for (int j = 0; j < barrier.length; j++){
				// выводим в консоль название совершающего + действие
					run_and_jump[i].runOrJump(j);
					// сообщаем название препятствия + пройдено оно или нет
				int lengthOrHeight = barrier[j].getLengthOrHeight();
				int limit = run_and_jump[i].getLimit(j);

				if (lengthOrHeight < limit ){
					barrier[j].className();
					System.out.println("Success");

				}
				else  {
					barrier[j].className();
					System.out.println("Fail");
					// если участник не выполнил задание то дальше он не идет
					break;


				}

			}

		}
	}
}
