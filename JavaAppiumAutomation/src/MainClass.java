public class MainClass
{
    final private int class_number = 20;
    final private String class_string = "Hello, world";

    public int getLocalNumber()
    {
        int number = 14;
        //System.out.println(number);
        return number;
    }
    public int getClassNumber()
    {
        return this.class_number;
    }
    public String getClassString()
    {
        return class_string;
    }
}