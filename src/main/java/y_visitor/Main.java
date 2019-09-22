package y_visitor;

/**
 * <br>-lastModify:2019/9/22 10:49
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
