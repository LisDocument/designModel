package q_iterator;

/**
 * <br>-lastModify:2019/9/15 18:04
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class NameRepository implements Container<String> {

    public String names[] = {"Li","Lis","Lisf"};

    private class NameIterator implements Iterator<String>{
        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            if(this.hasNext()){
                return names[index ++];
            }
            return null;
        }
    }

    @Override
    public Iterator<String> getIterator() {
        return new NameIterator();
    }
}
