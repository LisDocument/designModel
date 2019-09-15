package q_iterator;

/**
 * <br>-lastModify:2019/9/15 17:40
 *
 * @author Lixiaoban
 * @version 1.0
 */
public interface Iterator<T> {
    /**
     * 是否有下一个元素
     * @return 是否
     */
    boolean hasNext();

    /**
     * 下一个元素
     * @return 元素
     */
    T next();
}
