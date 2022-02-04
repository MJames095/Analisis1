import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int aprobados = 0;
        int reprobados = 0;
        float calificacion = 0;
        int n = 1;
        while (n <= 10) {
            System.out.print("Ingrese una calificación del 0 al 10: ");
            calificacion = teclado.nextFloat();
            if (calificacion >= 7) {
                aprobados++;
            } else 
                reprobados++;
              n++;
        }
        System.out.println("La cantidad de aprobados es: " + aprobados);
        System.out.println("La cantidad de reprobados es: " + reprobados);
    }
}
