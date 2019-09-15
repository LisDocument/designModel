package f_adapter;

public class RadioAdapter implements IRadioPlayer {

    private IRadioMachine machine = null;

    private String type;

    public RadioAdapter() {
        if("avi".equalsIgnoreCase(type)){
            machine = new AviRadioMachine();
        }else if ("mp4".equalsIgnoreCase(type)){
            machine = new Mp4RadioMachine();
        }
    }

    @Override
    public void play() {
        machine.playOne();
    }
}
