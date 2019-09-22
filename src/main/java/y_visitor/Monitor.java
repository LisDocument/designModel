package y_visitor;

/**
 * <br>-lastModify:2019/9/22 10:19
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
