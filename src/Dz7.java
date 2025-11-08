import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dz7 {
    public  void section1 (){
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        List<Integer> filtredIntegers = integers.stream()
                .filter(integer -> integer % 2 == 0)
                .map(n -> n *3)
                .collect(Collectors.toList());
        System.out.println(filtredIntegers);
    }
    public void section2(){
        List<String> words = Arrays.asList("asdswe","qwer");
        List<String> sortedWords = words.stream()
                .filter(word -> word.length() >= 5)
                .collect(Collectors.toList());
        System.out.println(sortedWords);
    }
    public void section3(){
        List<String> names = Arrays.asList("andrey","anton","dima","igor","ira","irina","misha","nastya");
        List<String> sortedNames = names.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
        System.out.println(sortedNames);
    }
}
