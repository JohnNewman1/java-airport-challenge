public class Plane {
    boolean flying = true;

    public void land() {
    this.flying = false;
    }

    public void takeOff() {
        this.flying = true;
    }
}
