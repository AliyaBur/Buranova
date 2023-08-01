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

    @Test
    public void testGetClassNumber()
    {
        MainClass object = new MainClass(); // собздание объекта класса MainClass
        int b = object.getClassNumber(); // вызов метода для объекта
        if (b > 45)
            System.out.println("Value greater than 45");
        else
            System.out.println("Value less than 45");
    }
}
