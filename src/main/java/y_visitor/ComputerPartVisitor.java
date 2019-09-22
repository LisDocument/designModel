package y_visitor;

/**
 * <br>-lastModify:2019/9/22 10:16
 *
 * @author Lixiaoban
 * @version 1.0
 */
public interface ComputerPartVisitor {

    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
