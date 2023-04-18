public class Bicycle {
    private int gear;
    private int speed;


    public Bicycle() {
    }

    public int getGear() {
        return this.gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void applyBrake(int decreaseValue) {
        speed = speed - decreaseValue;
    }

    public void speedUp(int increaseValue) {
        speed += increaseValue;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Bicycle)) {
            return false;
        }
        Bicycle bicycle = (Bicycle) o;
        return gear == bicycle.gear && speed == bicycle.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gear, speed);
    }

    
}
