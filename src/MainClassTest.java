import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassString()
    {
        String a = this.getClassString();
        if (a.indexOf("hello") == -1 && a.indexOf("Hello") == -1) {
            System.out.println("Test fail");
        } else
        {
            System.out.println("Test pass");
        }
    }
}
