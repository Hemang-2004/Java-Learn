import java.util.*; 
class ItemsofMarket
{
    int number;
    String name;
    ItemsofMarket(int number, String name) 
    {
        this.number = number;
        this.name = name;
    }

    public void display()
    {
        System.out.println(name + "-" + number);
    }
    @Override
    public String toString() {
        return number + " - " + name;
    } // this override over here tells how to describe my data type that I have made 
    //This will tell how to access it properly 
}
public class QueueBasics {
    public static void main(String[] args) {
        Queue<ItemsofMarket> market = new LinkedList<>();
        market.add(new ItemsofMarket(1,"apple"));
        market.add(new ItemsofMarket(2,"banana"));
        market.add(new ItemsofMarket(3,"orange"));
        market.add(new ItemsofMarket(4,"eggs"));
        System.out.println(market.peek().toString());
        market.peek().display();
        // market.peek();
        System.out.println(market.peek());
        System.out.println(market.poll());
        System.out.println(market.peek());
    }
}
