public class Car implements Runnable {
    private float capacity = 20f;
    private float cons = 2.5f;
    private String uniqueNumber;
    private FuelStation fuelStation;

    public Car(String uniqueNumber, FuelStation fuelStation) {
        this.uniqueNumber = uniqueNumber;
        this.fuelStation = fuelStation;
    }

    public void drive(){
        try {
            while(capacity > 0) {
                System.out.println(String.format("[%s] has fuel : %s", uniqueNumber,capacity));
                Thread.sleep(1500);
                capacity = capacity - cons;
            }
            float neededGasAmount = 20 - capacity;
            float refuel = fuelStation.refuel(neededGasAmount);
            if(refuel == 0){
                return;
            }
            capacity = capacity + refuel;
            drive();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        drive();
    }
}
