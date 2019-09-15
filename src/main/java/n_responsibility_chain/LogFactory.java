package n_responsibility_chain;

public abstract class LogFactory {

    public final static int MES_INFO = 1;

    public final static int MES_DEBUG = 2;

    public final static int MES_ERROR = 3;

    protected int level;

    public LogFactory nextLogFactory;

    public void setNextLogFactory(LogFactory nextLogFactory) {
        this.nextLogFactory = nextLogFactory;
    }

    public final void sendMessage(int level, String message){
        if(level >= this.level){
            write(message);
        }else{
            if(nextLogFactory != null){
                nextLogFactory.sendMessage(level, message);
            }
        }
    }

    abstract protected void write(String message);
}
