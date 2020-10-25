package b6_inheritance.Bai_Tap.point_moveable;

public class MoveablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint() {
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arraySpeed = {getXSpeed(), getYSpeed()};
        return arraySpeed;
    }

    public MoveablePoint move() {
        float x = super.getX();
        float y = super.getY();
        setX(x += xSpeed);
        setY(y += ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")" + "\n" + "speed = " + "(" + getXSpeed() + ", " + getYSpeed() + ")";
    }
}
