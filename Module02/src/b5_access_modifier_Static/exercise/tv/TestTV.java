package b5_access_modifier_Static.exercise.tv;

public class TestTV {
    public static void main(String[] args) {
        TV tv_1 = new TV();
        System.out.println(tv_1.getStatus());
        System.out.println(tv_1.getVolumeLevel());
        System.out.println(tv_1.getChannel());

        System.out.println("=========");

        TV tv_2 = new TV(20, 10, false);
        tv_2.setOn();
        System.out.println(tv_2.getStatus());
        tv_2.setChannel(10);
        System.out.println(tv_2.getChannel());
        tv_2.channelUp();
        System.out.println("Sau khi tang: "+ tv_2.getChannel());
        tv_2.setVolumeLevel(50);
        System.out.println(tv_2.getVolumeLevel());
        tv_2.volumeDown();
        System.out.println("Sau khi tang volume: " + tv_2.getVolumeLevel());
    }
}
