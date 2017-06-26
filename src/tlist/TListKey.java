
package tlist;

/**
 * List for object with method "K key()" to find the object in an list with a specific key - don't use 'int'!
 */
public class TListKey <T extends TListKeyObject<K>, K> extends TList <T> {

    @SuppressWarnings("unchecked")
    public int getIdKey(K key)
    {
        int l = length();
        for (int i = 0; i < l; i++) {
            if ((get(i)).key() == key) {
                return i;
            }
        }
        return -1;
    }

    public T getKey(K key)
    {
        int l = length();
        /*for (int i = 0; i < l; i++) {
            T obj = get(i);
            if (((TListKeyObject) obj).key() == key) {
                return obj;
            }
        }*/
        for (T obj : this)
        {
            if (((TListKeyObject) obj).key() == key) {
                return obj;
            }
        }
        return null;
    }

    public void removeKey(K key)
    {
        remove(getIdKey(key));
    }

    public T takeKey(K key)
    {
        return take(getIdKey(key));
    }

}
