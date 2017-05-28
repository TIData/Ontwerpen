package domein;

import java.util.Date;

public class Program {

    private Channel channel;
    private Date date;

    public Program(Date date, Channel channel) {
        this.channel = channel;
    }

    public int getNrChannel() {
        return channel.getNumberChannel();
    }
}
