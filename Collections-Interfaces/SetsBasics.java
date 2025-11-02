import java.util.*;

class Balls
{
    String color;    
    Balls(String color)
    {
        this.color = color;
    }
    // @Override
    public String printIt()
    {
        return color ;
    }
};
public class SetsBasics {
    public static void main(String[] args) {
        Set<Balls> balls = new HashSet<>();
        balls.add(new Balls("red"));
        balls.add(new Balls("orange"));
        balls.add(new Balls("black"));
        balls.add(new Balls("black"));
        // System.out.println(balls.);
    }
}
