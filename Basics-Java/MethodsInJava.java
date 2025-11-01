import java.util.*;
// For method overloading refer to one with same name yet different signature
public class MethodsInJava {

    static double calc(double a, double b)
    {
        return a+b;
    }
    static double calc(double a,double b, double c)
    {
        return a+b+c;
    }
    static double calc(double a,double b, double c, double d)
    {
        return a+b+c+d;
    }
    static double calc(double a,double b, double c, double d, double e)
    {
        return a+b+c+d+e;
    }
    static int calcsq(int a)
    {
        return a*a;
    }
    static String concatanateIt(String a,String b)
    {
        String ans = a+b;
        return ans;
    }
    static void printingIt(String a)
    {
        System.out.println("Welcome Back "+a);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for sq");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Square is - " + calcsq(number));
        System.out.println("Enter strings to concatanate");
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println("The concatanated string is " + concatanateIt(a, b));
        System.out.println("Enter string to print");
        String toprint = sc.nextLine();
        printingIt(toprint);
        System.out.println("How many numbers you need sum of");
        int num = Integer.parseInt(sc.nextLine());
        switch(num)
        {
            case 2 -> 
            { 
                int n1 = Integer.parseInt(sc.nextLine());
                int n2 = Integer.parseInt(sc.nextLine());
                System.out.println(calc(n1,n2));
            }
            case 3 -> 
            { 
                int n1 = Integer.parseInt(sc.nextLine());
                int n2 = Integer.parseInt(sc.nextLine());
                int n3 = Integer.parseInt(sc.nextLine());
                System.out.println(calc(n1,n2,n3));
            }
            case 4 -> 
            { 
                int n1 = Integer.parseInt(sc.nextLine());
                int n2 = Integer.parseInt(sc.nextLine());
                int n3 = Integer.parseInt(sc.nextLine());
                int n4 = Integer.parseInt(sc.nextLine());
                System.out.println(calc(n1,n2,n3,n4));
            }
            case 5 -> 
            { 
                int n1 = Integer.parseInt(sc.nextLine());
                int n2 = Integer.parseInt(sc.nextLine());
                int n3 = Integer.parseInt(sc.nextLine());
                int n4 = Integer.parseInt(sc.nextLine());
                int n5 = Integer.parseInt(sc.nextLine());
                System.out.println(calc(n1,n2,n3,n4,n5));
            }
        }

    }
}
