import java.util.*;


public class Basics
{
    static int ok = 234;
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        // String name = scanner.nextLine();
        // System.out.println(name);
        // int age = scanner.nextInt();
        // System.out.println(age);
        // double gpa = scanner.nextDouble();
        // System.out.println(gpa);


        //problem of buffer
        System.out.println("Enter phone");
        int phone = scanner.nextInt(); // APPLIES with nextDouble or nextFloat
        // Buffer -> comes over here so take a nextLine input 
        // or do parseInt
        // int phone = Integer.parseInt(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Enter bhai code");
        String booz = scanner.nextLine();
        System.out.println(booz);
        scanner.close();
    }
}