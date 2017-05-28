package domein;

public class Television {

    private Iterator surfer;

    public Television(int maxChannel) {
        surfer = new ChannelSurfer(maxChannel);
    }

    public Program getNextProgram() {
        return surfer.nextChannel().getCurrentProgram();
    }

    public Program getPrevProgram() {
        return surfer.previousChannel().getCurrentProgram();
    }

}
