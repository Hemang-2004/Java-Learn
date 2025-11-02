import java.util.*;
record Person(String name){};
public class MapsBasics {
    public static void main(String[] args) {
        Map<Integer, Person> mp = new HashMap<>();
        mp.put(1,new Person("Alice"));
        mp.put(2,new Person("Bob"));
        mp.put(3,new Person("Abel"));
        mp.put(3,new Person("Ola"));
        System.out.println(mp.size());
        System.out.println(mp.entrySet());
        System.out.println(mp.keySet());
        System.out.println(mp.containsKey(1));
        System.out.println(mp);
    }    
}
