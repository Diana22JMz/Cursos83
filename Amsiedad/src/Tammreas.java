import javax.swing.*;
import java.util.Scanner;
/*Calcular el numero menor de multiples valores*/
public class Tammreas {
    public static void main(String[] args){
/*
         Scanner s = new Scanner(System.in);
         System.out.println("Ingrese los valores: ");
        int valor = s.nextInt();

        for(int i = 0; i <= 10; i ++){


        }
        */



        /* TAMREA 1
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese los valores que se van a comparar: ");
        int valores = s.nextInt();


        if (valores < 10) {
            System.out.println("Se tienen que ingresar minimos 10 números enteros");
        } else {
            int menor = Integer.MAX_VALUE;
            int cifra;

            for (int i = 0; i < valores; i++) {
                System.out.println("Ingrese el numero " + (i + 1) + ": ");
                cifra = s.nextInt();
                menor = (cifra < menor) ? cifra : menor;
            }

            System.out.println("El número es menor: " + menor);

            if (menor < 10) {
                System.out.println("El número " + menor + " es menor a 10");
            } else {
                System.out.println("El número " + menor + " es igual/mayor que 10");
            }
        }



*/

        /*Tamrea 3
        Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar
         el símbolo de multiplicación (*).
      Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por
       menos es positivo.
         */


        //INTRODUCCION DE DATOS
        Scanner a = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo o negativo ñwñ");
        int num1 = a.nextInt();

        System.out.println("Ingrese un numero entero positivo o negativo ñwñ");
        int num2 = a.nextInt();
        int resdo = 0;



        //Proceso
        // verificamos los signos de cada uno, si es positivo o negativo
        boolean positivonum2 = num2 > -1;
        boolean positivonum1 = num1 > -1;


        // calculamos el valor absoluto de a
        int absolutonum1 = positivonum1? num1: -num1; // equivalente a Math.abs(a);

        // sumamos tantas veces el valor de b, segun el valor de a.
        for(int i = 0; i < absolutonum1; i++){
            resdo = resdo + num2;
        }

        // si ambos son negativos o si solo a es negativo damos vuelta el signo
        if((!positivonum1 && !positivonum2) || !positivonum1){
            resdo = -resdo;
        }


        System.out.println("el resultado es " + resdo);

        
    }
}
// String buscar = JOptionPane.showInputDialog("Ingrese un valor: ");
//  System.out.println("el valor a buscar es = " + buscar);