public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] arrayCats = {new Cat("Barsik", 10), new Cat("Murzik", 50),
                new Cat("Shiva", 30), new Cat("Polka", 50), new Cat("Winston", 50)};
        plate.info();
        for (int i = 0; i< arrayCats.length; i++){
            arrayCats[i].eat(plate);
            plate.info();
            if (!(arrayCats[i].isFull())){
                plate.addFood();
                arrayCats[i].eat(plate);
                plate.info();

            }
        }

    }

}
