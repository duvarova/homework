import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassString()
    {
        String a = this.getClassString();
        if (a == "hello" || a == "Hello") {
            System.out.println("Test pass");
        }else
        {
            System.out.println("Test fail");
        }
    }
}
