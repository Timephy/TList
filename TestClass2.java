/**
 * This class is only for testing!
 */

public class TestClass2 implements TListObject <String> {

    public String name;
    public int key;

    public TestClass2(String name, int key)
    {
        this.name = name;
        this.key = key;
    }

    public String key()
    {
        return name;
    }

}
