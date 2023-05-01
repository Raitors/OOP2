public class Transport implements Service {
    private final String modelName;
    private final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void doService() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}
