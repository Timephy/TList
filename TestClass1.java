/**
 * This class is only for testing!
 */

public class TestClass1 {

    public static void main(String[] args) {

        TListKey<TestClass2, String> list = new TListKey<TestClass2, String>();
        TestClass2[] arr = {new TestClass2("Tim", 17), new TestClass2("Mo", 18), new TestClass2("player", 1)};
        list.add(arr);
        System.out.println(list.getIdWithKey("Mo"));

    }

}