import java.util.Scanner;

public class Materias {
    public static void main(String[] args){

        int TotalMterias = 40;



        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el semestre que cursa: ");
       float nsemestre = s.nextInt();

        float materias = nsemestre * 5;
        System.out.println("Llevas un total de " + materias + " materias");



        float creditos = ( materias / TotalMterias) * 100;
        System.out.println("Usted tiene el "+ creditos + "%"+ " de creditos ");







    }
}
