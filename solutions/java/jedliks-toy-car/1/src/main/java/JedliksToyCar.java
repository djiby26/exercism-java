public class JedliksToyCar {
    private int distanceDriven;
    private int batteryPercentage;

    public JedliksToyCar() {
        this.batteryPercentage = 100;
        this.distanceDriven = 0;
    }

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", this.distanceDriven);
    }

    public String batteryDisplay() {
        return String.format("Battery at %d%%", this.batteryPercentage);

    }

    public void drive() {
        if (this.batteryPercentage > 0) {
            this.distanceDriven += 20;
            this.batteryPercentage -= 1;
        }
    }
}
