public class Truck extends Motor {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void doService() {
        super.doService();
        checkTrailer();
    }
}