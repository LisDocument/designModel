package d_builder;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Libin
 */
public class ComputerBuilder {

    private Computer computer = new Computer();

    public ComputerBuilder name(String name){
        computer.setName(name);
        return this;
    }

    public ComputerBuilder size(String size){
        computer.setSize(size);
        return this;
    }

    public Computer builder(){
        return computer;
    }
}
