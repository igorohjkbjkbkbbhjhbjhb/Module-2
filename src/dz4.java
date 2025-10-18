import java.util.*;

public class dz4 {
    //first
    List<String> list = new ArrayList<>();
    String as;

    Scanner scanner = new Scanner(System.in);

    public void add() {
        System.out.println("Введите 2 элемента для добавления: ");
        while (list.size() <= 1) {
            as = scanner.nextLine();
            if (!as.isEmpty()) {
                list.add(as);
            } else {
                System.out.println("no");
            }
        }

        System.out.println(list);
    }

    public void find() {
        System.out.println("Введите элемент, который хотите найти:");

        if (scanner.hasNextLine()) {
            as = scanner.nextLine();
        }

        boolean finish = false;
        for (int ew = 0; ew < list.size(); ew++) {
            if (as.equals(list.get(ew))) {
                System.out.println(list.get(ew) + " найден в списке покупок");
                finish = true;
                break;
            }
        }

        if (!finish) {
            System.out.println("You have not it");
        }
    }

    public void remove() {
        System.out.println("Введите элемент для удаления: ");

        if (scanner.hasNextLine()) {
            as = scanner.nextLine();
        }

        boolean finish = false;
        for (int ew = 0; ew < list.size(); ew++) {
            if (as.equals(list.get(ew))) {
                list.remove(as);
                System.out.println("Список после редактирования:");
                System.out.println(list);
                finish = true;
                break;
            }

        }

        if (!finish) {
            System.out.println("You have not it");
        }
    }
}
    //second
     class Task implements Comparable<Task> {
        int priority;
        String name;

        public Task(String name, int priority) {
            this.priority = priority;
            this.name = name;
        }

        @Override
        public String toString() {
            return String.format("%s (%d)", name, priority);
        }

        @Override
        public int compareTo(Task other) {
            return this.name.compareTo(other.name);
        }

        List<Task> tasks = new ArrayList<>();

        public void sort() {
            tasks.add(new Task("cds", 1));
            tasks.add(new Task("rwet", 2));
            tasks.add(new Task("ewqewq", 3));

            List<Task> taskList = new LinkedList<>(tasks);
            taskList.sort((s1, s2) -> Integer.compare(s2.priority, s1.priority));
            for (Task s : tasks) {
                System.out.println(s);
            }

        }


        Scanner scanner1 = new Scanner(System.in);
        String as1;
//    int as2;
//    public void add2() {
//        System.out.println("Введите 2 элемента для добавления: ");
//        while (tasks.size() <= 1) {
//            as1 = scanner.nextLine();
//            if (!as1.isEmpty()) {
//                tasks.add(as1,);
//            } else {
//                System.out.println("no");
//            }
//        }
//
//        System.out.println(tasks);
//    }


        public void remove2() {
            System.out.println("Введите элемент для удаления: ");

            if (scanner1.hasNextLine()) {
                as1 = scanner1.nextLine();
            }

            boolean finish = false;
            for (int ew = 0; ew < tasks.size(); ew++) {
                if (as1.equals(tasks.get(ew))) {
                    tasks.remove(as1);
                    System.out.println("Список после редактирования:");
                    System.out.println(tasks);
                    finish = true;
                    break;
                }

            }

            if (!finish) {
                System.out.println("You have not it");
            }
        }
    }
//    theerd


class UniqueSortedList {

    public static List<Integer> uniqueSorted(List<Integer> inputList) {
        TreeSet<Integer> sortedUnique = new TreeSet<>(inputList);
        return new ArrayList<>(sortedUnique);
    }

    public void print() {
        List<Integer> numbers = List.of(5, 3, 8, 3, 1, 5, 7, 8);
        System.out.println("Исходный список: " + numbers);
        System.out.println("Отсортированный уникальный список: " + uniqueSorted(numbers));
    }
}
