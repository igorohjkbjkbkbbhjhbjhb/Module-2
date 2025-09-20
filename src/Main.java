
public class Main {
    public static void main(String[] args) {
        Lesson1 l1 = new Lesson1();
        l1.section1();
        dz1 dz = new dz1();
        Person person = new Person();
        person.setAge(12);
        person.setName("dcw");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        Employee employee = new Employee();
        employee.setSalary(123);
        System.out.println(employee.getSalary());

    }
}