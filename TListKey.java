
// List for object with method "int key()" to find the object in an list with one key
public class TListKey <T, K> extends TList <T> {

    public int getIdWithKey(K key)
    {
        int l = length();
        for (int i = 0; i < l; i++) {
            TListObject<K> obj = (TListObject<K>) get(i);
            if (obj.key() == key) {
                return i;
            }
        }
        return -1;
    }

    public T getWithKey(K key)
    {
        int l = length();
        for (int i = 0; i < l; i++) {
            T obj = get(i);
            if (((TListObject) obj).key() == key) {
                return obj;
            }
        }
        return null;
    }

}
