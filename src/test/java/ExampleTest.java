import org.junit.*;


public class ExampleTest{

    @Test
    public void test1(){
        Integer a = new Integer(1);
        Assert.assertEquals(a.intValue(),1);
    }
}