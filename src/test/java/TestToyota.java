import org.junit.Assert;
import org.junit.Test;
import toyota.Toyota;

public class TestToyota {

    Toyota camry =new Toyota(3.5,"Black","camry70","2021", false,35000.0, "auto");

    @Test

    public void testEngine(){
        Assert.assertEquals(3.5, camry.getEngine(),0);
    }

    @Test

    public void testColor(){
        Assert.assertTrue(camry.getColor().equals("Black"));
    }
}