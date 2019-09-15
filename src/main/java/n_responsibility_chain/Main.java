package n_responsibility_chain;

public class Main {
    public static void main(String[] args) {
        LogFactory log = new InfoLog();
        log.setNextLogFactory(new DebugLog());
        log.nextLogFactory.setNextLogFactory(new ErrorLog());
    }
}
