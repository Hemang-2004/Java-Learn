import java.util.*;

public class RandomGenAndMath
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(0,100); //last number is exclusive 
        // so if you want till 100 then write 99
        System.out.println(number);
        System.out.println(Math.PI);
        System.out.println(Math.E);
        double pi = Math.PI;
        System.out.println(pi);
        double res = Math.pow(2,12);
        System.out.println(res);
        System.out.println("Enter the radius");
        int radius  = sc.nextInt();
        double circum = 0;
        System.out.println("The circumference is = "+ 2*Math.PI*radius);

    }
}