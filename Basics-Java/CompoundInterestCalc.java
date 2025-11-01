import java.util.*;
public class CompoundInterestCalc
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount");
        double prin = Double.parseDouble(sc.nextLine());
        System.out.println("Enter Time to be taken");
        int time = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Rate Of interest ");
        double rate = Double.parseDouble(sc.nextLine());
        double temp = 1 + rate/100;
        double man = Math.pow(temp,time);
        double answer = prin*man;
        System.out.printf("The final amount is %.3f\n",answer);
    }
}