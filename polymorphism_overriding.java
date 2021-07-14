class father
{
    void earning()
    {
        System.out.println("50,000 earning");
    }
}


class son extends father
{
    void earning()
    {
        System.out.println("100,000 earning");
    }
}


public class polymorphism_overriding {
    public static void main(String []x)
    {
        son s=new son();
        s.earning();
    }
}
