package domein;

public class ChannelSurfer implements Iterator {

    private int maxChannel;
    private int currentChannel;

    public ChannelSurfer(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    @Override
    public Channel nextChannel() {
        currentChannel = (currentChannel + 1) % maxChannel;
        return new Channel(currentChannel);
    }

    @Override
    public Channel previousChannel() {
        currentChannel = (currentChannel - 1 + maxChannel) % maxChannel;
        return new Channel(currentChannel);
    }

}
