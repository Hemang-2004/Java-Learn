import java.util.*;
public class UseOfprintf
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double n1= 234.3412,n2 = 9876542345.23435,n3=876543.237654;
        System.out.printf("The numbers are %.2f\t , %.4f\n",n1,n2);
        int a=1,b=23,c=276,d=957;
        System.out.printf("%040d\n",a);
        System.out.printf("%04d\n",b);
        System.out.printf("%04d\n",c);
        System.out.printf("%04d\n",d);
        String day = sc.nextLine();
        switch(day)
        {
            case "Monday" -> System.out.println("Day 1");
            case "Tuesday" -> System.out.println("Day 2");
            case "Wednesday" -> System.out.println("Day 3");
            case "Thursday" -> System.out.println("Day 4");
            case "Friday" -> System.out.println("Day 5");
            case "Saturday" -> System.out.println("Day 6");
            case "Sunday" -> System.out.println("Day 7");
        }
    }
}