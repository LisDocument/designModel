package n_responsibility_chain;

public class ErrorLog extends LogFactory {

    public ErrorLog(){
        this.level = LogFactory.MES_ERROR;
    }

    @Override
    protected void write(String message) {
        System.out.println("error:->" + message);
    }
}
