package q_iterator;

/**
 * <br>-lastModify:2019/9/15 18:09
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        var nameRepository = new NameRepository();
        var iterator = nameRepository.getIterator();
        while (iterator.hasNext()){
            var next = iterator.next();
            System.out.println(next);
        }
    }
}
