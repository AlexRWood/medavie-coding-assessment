public class CeilingFan {
    private int speed;
    private boolean reversed;

    public CeilingFan() {
        speed = 0;
        reversed = false;
    }
    public int getSpeed() {
        return speed;
    }
    public boolean isReversed() {
        return reversed;
    }
    public void pullSpeedCord() {
        speed = (speed+1) % 4;
    }
    public void pullReverseCord() {
        reversed = !reversed;
    }
    public String getStatus() {
        String status = "";
        status += "The fan speed is ";
        if(this.getSpeed() == 0) { status += (this.getSpeed() + " (off)"); }
        else { status += this.getSpeed(); }
        if(this.isReversed()) { status += " and is in reverse mode."; }
        else { status += " and is not in reverse mode."; }
        return status;
    }
}
