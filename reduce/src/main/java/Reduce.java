import java.util.List;
import java.util.Map;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Reduce {
    public static String join(List<String> input, String delimiter) {

        if(null == input) {
            throw new IllegalArgumentException("Input must not be null");
        }
//        if (input.isEmpty()) {
//            return "";
//        }

        return input
                .stream()
                .reduce((result,currentString)->result + delimiter +currentString).orElse("");

    }

    public static String join(List<String> input)
    {
        return join(input, " ");
    }



    public static Map<String,Integer> wordCounts(String inputString) {

        throw new IllegalArgumentException("InputString should not be NULL.");


    }











}
