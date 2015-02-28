import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Class1Test {

    Class1 class1 = new Class1();

    @Test
    public void testGetSomeString() throws Exception {
        Assert.assertEquals(class1.getSomeString(), "yawn");
    }

    @Test
    public void testGetBark() throws Exception {
        Assert.assertEquals(class1.getBark(), "Woof");
    }
}