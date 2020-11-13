package _5_access_modifier_Static.exercise.tv;

public class TV {
    private int channel;
    private int volumeLevel;
    private boolean on;

    public TV() {
        channel = 1;
        volumeLevel = 1;
        on = false;
    }

    public TV(int channel, int volumeLevel, boolean on) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    public void setOn() {
        this.on = !this.on;
    }

    public boolean getStatus() {
        if (this.on) {
            return true;
        } else {
            return false;
        }
    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120) {
            this.channel = newChannel;
        }
    }

    public int getChannel() {
        return this.channel;
    }

    public void setVolumeLevel(int newVolume) {
        if (on && volumeLevel >= 1 && volumeLevel <= 100) {
            this.volumeLevel = newVolume;
        }
    }

    public int getVolumeLevel() {
        return this.volumeLevel;
    }

    public void channelUp() {
        if (on && channel <= 120) {
            channel++;
        }
    }

    public void channelDown() {
        if (on && channel >= 1) {
            channel--;
        }
    }

    public void volumeUp(){
        if (on && volumeLevel <= 100){
            volumeLevel++;
        }
    }

    public void volumeDown() {
        if (on && volumeLevel >= 1) {
            volumeLevel--;
        }
    }
}
