package arrays;/* 
  @created 09/09/22
  @author  manish.mandora
*/

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SkippingIterator1<T> implements Iterator<T> {
    private List<T> list;
    private int size;


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }


    public static void main(String a[]) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}
