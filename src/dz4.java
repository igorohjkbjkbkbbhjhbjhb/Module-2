import java.util.*;

public class dz4 {
    //first
    List<String> list = new ArrayList<>();
    String as;

    public void add() {
        Scanner scanner = new Scanner(System.in);
        while (list.size() <= 1) {
            as = scanner.nextLine();
            if (!as.isEmpty()) {
                list.add(as);
            } else {
                System.out.println("no");
            }
        }

        scanner.close();
        System.out.println(list);
    }

    public void find() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String as = scanner.nextLine();
        }
        boolean finish = false;
        for (int ew = 0; ew < list.size(); ew++) {
            if (as.equals(list.get(ew))) {
                System.out.println(list.get(ew));
                finish = true;
                break;
            }

        }
        if (!finish) {
            System.out.println("You have not it");
        }
        scanner.close();
    }

    public void remove() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String as = scanner.nextLine();
        }
        boolean finish = false;
        for (int ew = 0; ew < list.size(); ew++) {
            if (as.equals(list.get(ew))) {
                list.remove(as);
                System.out.println(list);
                finish = true;
                break;
            }

        }
        if (!finish) {
            System.out.println("You have not it");
        }
        scanner.close();

    }
    //second
    List<String> list2 = new ArrayList<>();
    Queue<List<String>> queue = new PriorityQueue<List<String>>();
    public void add2() {
        Scanner scanner = new Scanner(System.in);
        while (list2.size() <= 5) {
            as = scanner.nextLine();
            if (!as.isEmpty()) {
                list2.add(as);
            } else {
                System.out.println("no");
            }
        }

        scanner.close();
        System.out.println(list2);
    }

    public void sort() {
        queue.add(list2);
    }

    public void remove2() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String as = scanner.nextLine();
        }
        boolean finish = false;
        for (int ew = 0; ew < list2.size(); ew++) {
            if (as.equals(list2.get(ew))) {
                list2.remove(as);
                System.out.println(list2);
                finish = true;
                break;
            }

        }
        if (!finish) {
            System.out.println("You have not it");
        }
        scanner.close();

    }
}
