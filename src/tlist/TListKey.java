
package tlist;

/**
 * List for object with method "K key()" to find the object in an list with a specific key - don't use 'int'!
 */
public class TListKey <T extends TListKeyObject<K>, K> extends TList <T> {

    // /**
    //  * Wenn bereits ein Objekt mit einem Key existiert, kann ein Object mit dem selben Key kein weiteres mal hinzugefügt werden.
    //  */
    // public boolean blockSameKey = true;

    /**
     * Gibt die Id eines Objektes, welchen diesen Schlüssel besitzt, zurück.
     * Existiert sie nicht, so gibt sie -1 zurück.
     *
     * @param K key Der gesuchte Schlüssel
     */
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

    /**
     * Gibt das Objekt, welches diesen Schlüssel besitzt, zurück.
     */
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

    /**
     * Entfernt diesen Schlüssel.
     */
    public void removeKey(K key)
    {
        remove(getIdKey(key));
    }

    /**
     * Gibt das Objekt zurück, das einen bestimmten Schlüssel hat, und entfernt es aus der Liste.
     */
    public T takeKey(K key)
    {
        return take(getIdKey(key));
    }
    
    /**
     * Überprüft, ob die zum Schlüssel gehörige Id existiert (>= 0 ist).
     */
    public boolean containsKey(K key)
    {
        return getIdKey(key) >= 0;
    }

    //// Override TList methods for blockSameKey capabilities ////

    // public void add(T obj)
    // {
    //     if (!containsKey(obj.key()))
    //     {
    //         super.add(obj);
    //     }
    // }
    //
    // public void add(T[] obj)
    // {
    //     for (int i = obj.length - 1; i >= 0; i--) { //for-Schleife zählt i von der Feldlänge von obj bis 0
    //         if (!containsKey(obj[i].key()))
    //         {
    //             super.add(obj[i]);
    //         }
    //     }
    // }
    //
    // public void addLast(T obj)
    // {
    //     if (!containsKey(obj.key()))
    //     {
    //         super.addLast(obj);
    //     }
    // }
    //
    // public void addLast(T[] obj)
    // {
    //     for (int i = 0; i < obj.length; i++)
    //     {
    //         if (!containsKey(obj[i].key()))
    //         {
    //             super.addLast(obj);
    //         }
    //     }
    // }
    //
    // public void insert(T obj, int id)
    // {
    //     if (!containsKey(obj.key()))
    //     {
    //         super.insert(obj, id);
    //     }
    // }
    //
    // public void insert(T[] obj, int id)
    // {
    //     for (int i = obj.length - 1; i >= 0; i--) { //for-Schleife zählt i von der Feldlänge von obj bis 0
    //         if (!containsKey(obj[i].key()))
    //         {
    //             super.insert(obj[i], id);
    //         }
    //     }
    // }

}
