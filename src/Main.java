import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> integers = new HashMap<>();
        integers.put(2,"two");
        integers.put(3,"three");
        integers.put(4,"four");
        integers.put(5,"five");
        integers.put(6,"six");
        System.out.println(integers);
        for (Map.Entry a: integers.entrySet()){
            Integer b = (Integer) a.getKey();
            String c = (String) a.getValue();
            System.out.print(b);
            System.out.println(c);
        }
        for (Map.Entry integer : integers.entrySet()) {
            System.out.println(integer.getKey()+ " " + integer.getValue());
        }
            

    }
}