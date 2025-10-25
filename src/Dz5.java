import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Dz5 {
    public void nomberOne(){
        Map<String, String> book = new HashMap<>();
        book.put("Dostoevski", "Crime and nakazanie");
        book.put("Pushkin", "Evgeni Onegin");
        book.put("Gogol", "Ded souls");
        String nameOfAuthor = "Pushkin";
        if(book.containsKey(nameOfAuthor)){
            System.out.println("У нас есть книга от "+ nameOfAuthor+ " : " + book.get(nameOfAuthor));
            book.remove(nameOfAuthor);
        }
    }
    public void nomberTwo(){
        Map<String, Integer> contact = new LinkedHashMap<>();
        contact.put("Dostoevski", 880055535);
        contact.put("Pushkin", 112);
        contact.put("Gogol", 102);
        String name = "Gogol";
        if (contact.containsKey(name)){
            System.out.println("Номер телефона вашего контакта "
                    + name
                    + " : "
                    + contact.get(name));
        }
    }
    public void nomberThree(){
        Map<String, Integer> students = new TreeMap<>();
        students.put("Dostoevski", 5);
        students.put("Pushkin", 4);
        students.put("Gogol", 3);
        System.out.println(students.entrySet());
    }
}
