/*Marvin Rosas Ojeda
Numero de control: 23580069
29/10/2023
Practica No.8
Obtener el promedio de 8 calificaciones.
 */
package practicano8;
import java.util.Scanner;
/*
 */
public class Practicano8 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float n1, n2, n3, n4, n5, n6, n7, n8;
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Selecciona una calificacion");
        n1 =Scanner.nextInt();
        System.out.println("Selecciona una calificacion");
        n2 =Scanner.nextInt();
        System.out.println("Selecciona una calificacion");
        n3 =Scanner.nextInt();
        System.out.println("Selecciona una calificacion");
        n4 =Scanner.nextInt();
        System.out.println("Selecciona una calificacion");
        n5 =Scanner.nextInt();
        System.out.println("Selecciona una calificacion");
        n6 =Scanner.nextInt();
        System.out.println("Selecciona una calificacion");
        n7 =Scanner.nextInt();
        System.out.println("Selecciona una calificacion");
        n8 =Scanner.nextInt();
        System.out.println("El promedio de las 8 califacaciones es:" + (n1+n2+n3+n4+n5+n6+n7+n8)/8);
}
}
