package y_visitor;

/**
 * <br>-lastModify:2019/9/22 10:14
 *
 * @author Lixiaoban
 * @version 1.0
 */
public interface ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor);
}
