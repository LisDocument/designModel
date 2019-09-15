package n_responsibility_chain;

public class DebugLog extends LogFactory {

    public DebugLog(){
        this.level = LogFactory.MES_DEBUG;
    }

    @Override
    protected void write(String message) {
        System.out.println("debug:->" + message);
    }
}
