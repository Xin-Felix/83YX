package weathermachine;


public class WeatherData {


    public void measurementsChanged(int temp, int humidity, int windPower) {
        if (temp < 0) {
            return;
        }
        BaseComment.MACHINE.forEach(item -> {
            if (item instanceof WateringMachine) {
                item.start();
            }
            if (humidity > BaseComment.HUMIDITY) {
                if (item instanceof ReapingMachine) {
                    item.start();
                }
            }
            if (windPower < BaseComment.POWER) {
                if (item instanceof SeedingMachine) {
                    item.start();
                }
            }
        });
    }
}

