package day62;

public class DesignTV {
    public static void main(String[] args) {
        short max = 5 > 6 ? 5 : 6; // superess warning(Dead code): here is no any expresion only provide non-zero
                                   // value, directly max 6 use kr skte ho.
        System.out.println(max);

        // creted object in heap
        Television t = new Television();

        System.out.println(t.channel = 10);
        System.out.println(t.volume = 50);

        System.out.println(t.getChannel());
        System.out.println(t.getVolume());

        // System.out.println(t.setChannel(1)); // error bcoz setter is return type void
        // System.out.println(t.setVolume(100));
        t.setChannel(8);
        t.setVolume(100);

        System.out.println("\n"+t.getChannel());
        System.out.println(t.getVolume());

    }
}

class Television {

    // properties => non-verbs
    int channel;
    int volume;

    // behaviar => all verbs
    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
