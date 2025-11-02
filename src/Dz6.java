import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Dz6 {
    Set<String> employer = new HashSet<>();

    public void add() {
        Scanner scanner = new Scanner(System.in);
        while (employer.size() <= 5) {
            String newEmployer = scanner.nextLine();

            if (scanner.hasNextLine()) {
                if (!newEmployer.isEmpty()) {
                    employer.add(newEmployer);
                } else {
                    System.out.println("no");
                }
            }
        }
    }


    public void watchAll() {
        System.out.println(employer);
    }

    public void found() {


        System.out.println("Введите имя");
        Scanner scanner = new Scanner(System.in);
        String example = scanner.nextLine();
        if (employer.contains(example)) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }
//2
public static void T10() {
    TreeSet<String> t10 = new TreeSet<>();
    String text = "Это пример текста. Это предложение предложение состоит из повторяющихся слов";
    StringBuilder word = new StringBuilder();

    for (int i = 0; i < text.length(); i++) {
        char ch = text.charAt(i);

        if (ch != ' ') {
            word.append(ch);
        } else if (word.length() > 0) {
            t10.add(word.toString());
            word.setLength(0);
        }
    }

    if (word.length() > 0) {
        t10.add(word.toString());
    }

    System.out.println(t10);
}
}

//    3
class UnicListOfPeople {
    public void sa () {
        Set<String> aas = new HashSet<>();
        aas.add("das");
        System.out.println(aas);
    }

}

