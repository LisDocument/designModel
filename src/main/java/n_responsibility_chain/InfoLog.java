package n_responsibility_chain;

public class InfoLog extends LogFactory {

    public InfoLog(){
        this.level  = LogFactory.MES_INFO;
    }

    @Override
    protected void write(String message) {
        System.out.println("info:->" + message);
    }
}
