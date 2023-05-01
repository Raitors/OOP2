public  class Motor extends Transport {
    public Motor(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void doService() {
        super.doService();
        checkEngine();
    }
}
