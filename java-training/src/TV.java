public class TV {
    private int channelNumber;
    private boolean on;
    private int volume;

    TV(int _channelNumber, boolean _on, int _volume){
        channelNumber=_channelNumber;
        on=_on;
        volume=_volume;
    }
    public void setChannel(int _channelNumber){
        channelNumber=_channelNumber;
    }
    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on=false;
    }
    public void setVolume(int _volume){
        volume=_volume;
    }
}
