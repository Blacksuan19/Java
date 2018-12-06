public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    String color = "blue";
    public Fan() {
    }
    public int getSpeed() {
        return speed;
    }
    public boolean getStatus() {
        if (on) {
            return true;
        } else
            return false;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setStatus(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        if (on) {
            return ("Fan is on\nFan color: " + this.color + " \nFan speed: " + this.speed + "\nFan radius: " + this.radius);
        } else
            return ("Fan is Off");
        }
}
