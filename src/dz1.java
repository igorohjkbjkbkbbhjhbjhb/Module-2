class Person{
    private String name;
    private double age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
class Employee extends Person{
   private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


public class dz1 {
    Person myEmployee = new Employee();

}
