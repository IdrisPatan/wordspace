import java.util.*;
import java.util.stream.Collectors;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Map {
    public static List<String>  evenOrOdd(List<Integer> input) {

        if (null == input ) {
            throw new IllegalArgumentException("Should not be null or empty");
        }

        if(input.isEmpty()) {
            return Collections.emptyList();
        }

        return input.stream().map((i)-> i%2 == 0 ? "Even" : "Odd").collect(Collectors.toList());
    }


    public static List<String> pluck(List<HashMap<String,String>> input, String property) {

        List<String> results = new ArrayList<>();

        if(null == input || null == property || property.isEmpty() || input.isEmpty()){
            throw new IllegalArgumentException("Should not be null");
        }


        return input.stream()
                .filter((hash) -> hash.containsKey(property))
                .map((hash) -> hash.get(property)).collect(Collectors.toList());


//        for(HashMap<String,String> i : input)
//        {
//            if (null == i.get(property)) {
//                throw new IllegalArgumentException("Property does not exist in List");
//            }
//            results.add(i.get(property));
//
//        }
//


    }



















}