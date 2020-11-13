package _4_class_object.exercise.fan;

public class Fan {

    final public int SLOW = 1;
    final public int MEDIUM = 2;
    final public int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSpeed() {
        return this.speed;
    }
    public void setSpeed(int speed){
        if (speed == SLOW) {
            this.speed = SLOW;
        } else if (speed == MEDIUM) {
            this.speed = MEDIUM;
        } else if (speed == FAST) {
            this.speed = FAST;
        }
    }

    public boolean getOn() {
        return this.on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public Fan() {
        this.setSpeed(SLOW);
        this.setOn(false);
        this.setRadius(5);
        this.setColor("blue");
    }

    public String toString() {
        if (this.getOn()){
            return this.getSpeed() + " - " + this.getColor() + " - " + this.getRadius() + " - fan is on";
        } else {
            return this.getColor() + " - " + this.getRadius() + " - fan is off";
        }
    }

}
