import java.util.Scanner;
public class main {
    public static void main(String[] args){
        float num1;
        float num2;
        float result;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = reader.nextFloat();
        num2 = reader.nextFloat();
        float plus = num1 + num2;
        float minus = num1 - num2;
        float del = num1 / num2;
        float cos = num1 * num2;
        System.out.print("result"+ plus);
        System.out.print("result"+ minus);
        System.out.print("result"+ del);
        System.out.print("result"+ cos);
    }
}
