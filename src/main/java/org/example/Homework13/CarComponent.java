package org.example.Homework13;

class CarComponent implements Runnable {
    private final Component component;
    private final CarBuilder carBuilder;

    public CarComponent(Component component, CarBuilder carBuilder) {
        this.component = component;
        this.carBuilder = carBuilder;
    }

    @Override
    public void run() {
        int buildTime = getBuildTime(component);
        try {
            Thread.sleep(buildTime);
            carBuilder.componentBuilt(component);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private int getBuildTime(Component component) {
        switch (component) {
            case TIRE:
                return 2000; // 2 seconds in milliseconds
            case SEATS:
                return 3000; // 3 seconds in milliseconds
            case ENGINE:
                return 7000; // 7 seconds in milliseconds
            case FRAME:
                return 5000; // 5 seconds in milliseconds
            default:
                return 0;
        }
    }
}

