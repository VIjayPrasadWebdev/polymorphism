class marks
{
    int m1, m2, m3, m4, total;
    void process(int mark1, int mark2)
    {
        m1=mark1;
        m2=mark2;
        total =m1 + m2;
        System.out.println("First function answer is " + total);
    }
    void process(int mark1 , int mark2, int mark3)
    {
        m1=mark1;
        m2=mark2;
        m3=mark3;
        total=m1 + m2 + m3;
        System.out.println("Second function answer is  " + total);
    }

    void process(int mark1, int mark2, int mark3, int mark4)
    {
        m1=mark1;
        m2=mark2;
        m3=mark3;
        m4=mark4;
        total=m1+ m2+ m3+ m4;
        System.out.println("Third function answer is  " + total);
    }
}


public class Polymorphism_overloading {
    public static void main(String []x)
    {
        marks m=new marks();
        m. process(90,100);
       m. process(100, 97, 98);
       m. process(89, 100, 89, 89);
    }
}

