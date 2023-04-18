package sg.edu.nus.iss;

public class MountainBike extends Bicycle {
    
    public int seatHeight;

    public MountainBike(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return this.seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + seatHeight;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        MountainBike other = (MountainBike) obj;
        if (seatHeight != other.seatHeight)
            return false;
        return true;
    }

    @Override
    public String toString() {
        //return "MountainBike [seatHeight=" + seatHeight +"]";
        return super.toString() + "\nSeat Height=" + seatHeight;
    }
}