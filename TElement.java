abstract public class TElement <T>
{

    //  3.0

//c

    abstract public void _showList(int thisId);
    //cccc

    abstract public int length();

    //abstract public boolean end();

    abstract public TElement<T> insert(T obj, int id, int thisId);

    abstract public T get(int id, int thisId);

    abstract public int getId(T obj, int thisId);

    abstract public TElement<T> remove(int id, int thisId);

}
