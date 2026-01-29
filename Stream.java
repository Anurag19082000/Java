
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple","Banana","mango","Cheery");
        System.out.println(fruits.size());
        
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        fruits.stream().forEach(action);
    }
}
