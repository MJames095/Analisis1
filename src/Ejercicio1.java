import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args)  {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, div;
        System.out.print("Ingrese el primer valor: ");
        num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        num2 = teclado.nextInt();
        div = num1 % num2;
        if (div == 0) {
            System.out.print("Es divisible. El resultado es: ");
            System.out.println(div);
        } else {
            System.out.print("No se puede efectuar la división.");
        }
    }    
}