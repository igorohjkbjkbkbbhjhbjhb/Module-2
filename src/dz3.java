import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeNumberException extends Exception{
    public NegativeNumberException (String message){
        super(message);
    }

}
class Divide {
    public void divide(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите число: ");
                double number = scanner.nextDouble();
                if (number < 0) {
                    throw new NegativeNumberException("use another numbers");
                }
                if (number == 0){
                    throw new ArithmeticException("use another numbers");
                }
                double result = 100 / number;
                System.out.println("Результат деления равен: " + result);
                break;
            } catch (ArithmeticException e) {
                System.out.println("use another numbers");
            }
            catch (InputMismatchException e){
                System.out.println("use another numbers");
            }catch (NegativeNumberException e){
                System.out.println("use another numbers");
            }
        }
        scanner.close();
    }
}

public class dz3 {

}
