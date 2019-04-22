package adapter;

/**
 * 此处应用新增的适配器radioAdapter，
 * 部分格式不规范，但是能够正常表现意思
 */
public class RadioAdapterOlder implements IRadioPlayer {

    private IRadioPlayer radioAdapter;

    public RadioAdapterOlder(){
        radioAdapter = new RadioAdapter();
    }

    @Override
    public void play() {
        if("原始功能".equalsIgnoreCase("")){
            System.out.println("Older自带的功能实现");
        }else if("avi".equalsIgnoreCase("")){
            radioAdapter.play();
        }
    }
}
