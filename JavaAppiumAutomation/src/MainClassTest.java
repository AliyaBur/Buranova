import org.junit.Test;

public class MainClassTest
{
    @Test
    public void testGetLocalNumber()
    {
        MainClass object = new MainClass();
        int a = object.getLocalNumber();
        if (a == 14)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
