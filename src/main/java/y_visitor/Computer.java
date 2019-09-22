package y_visitor;

/**
 * <br>-lastModify:2019/9/22 10:28
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class Computer implements ComputerPart{

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
