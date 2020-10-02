package B4_Class_And_Object_Java.Bai_Tap.StopWatch;

public class StopWatch {
    private long startTime = 0;
    private long stopTime = 0;

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void end() {
        this.stopTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.stopTime - this.startTime;
    }
}
