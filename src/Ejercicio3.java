import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args)  {
        Scanner teclado = new Scanner(System.in);
        int numero, tam;
        System.out.print("Ingrese la cantidad de números que va a ingresar: ");
        tam = teclado.nextInt();

        System.out.print("Ingrese los números: ");
        for (int i = 0; i < tam; i++) { 
            numero = teclado.nextInt();
            if (numero % 2 == 0) {
                System.out.println("El numero " + numero + " es par");

            } else {
                System.out.println("El numero " + numero + " es impar");
            }
        }    
    }
}