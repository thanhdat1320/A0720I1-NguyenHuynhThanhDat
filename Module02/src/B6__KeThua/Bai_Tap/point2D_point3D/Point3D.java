package B6__KeThua.Bai_Tap.point2D_point3D;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        z = 0.0f;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arrayXYZ = {getX(), getY(), getZ()};
        return arrayXYZ;
    }

    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D: " + "(" + getX() + ", " + getY() + ", " + getZ() + ")";
    }
}
