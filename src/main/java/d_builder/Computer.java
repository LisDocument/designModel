package d_builder;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Libin
 */
public class Computer {

    private String name;

    private String size;

    public String getName() {
        return name;
    }

    public Computer setName(String name) {
        this.name = name;
        return this;
    }

    public String getSize() {
        return size;
    }

    public Computer setSize(String size) {
        this.size = size;
        return this;
    }
}
