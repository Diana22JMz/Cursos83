import java.util.Scanner;

/*
* Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
* Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1,
* ademas mostrar el promedio total.

Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos
*  (contadores, sumas).

Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
* */
public class SistemaDeNotasDeAlumnos {
    public static void main(String[] args){

        //Ingresar las notas finales
        //int maximopalabra4 = pamlabra4.length();

        Scanner n = new Scanner(System.in);


        double minota;
        int contanotas = 0;
        int notac5 =  0;
        int notac4 = 0;
        double notam5 = 0;
        double notam4 = 0;
        double notai4 = 0;
        double sumanotast = 0;

        double smnotamyr5 = 0;
        int contanotasmyr5 = 0;
        double  smnotasmnr4 = 0;
        int contanotasmnr4 = 0;

        double promedio = 0;
        double promnotasmayores5 , promnotasmenor4 ;

        boolean error = false;



        for(int i = 0; i < 20; i++){
            System.out.println("\nIngresa la nota dentro del rango de 1-7 en enteros o con sus respectivos decimales ("  + (i + 1) + ")" + " : ");
            minota = n.nextDouble();

            if(minota == 0){
                error = true;
                break;
            }
            if(minota == 1){
                contanotas++;

            }

            else{
                if(minota > 5){
                    notam5++;
                    sumanotast += minota;

                }else if (minota < 4){
                    notam4++;
                    sumanotast += minota;
                }
            }
            promedio += minota;


        }
        if(error){
            System.err.println("ERROR!!! " + "No se pueden introducir notas que esten en 0, finalizo el programa. " +
                    "\nIntentelo de nuevo.");
            System.exit(1);
        }

        // mostramos la cantidad de notas 1
        System.out.println("El número de notas 1 es de: " + contanotas);
        //trabajamos con las notas superiores a 5
        if (notam5 == 0) {
            System.out.println("No se puede calcular el promedio de notas sobre 5");
        } else {
            promnotasmayores5 = smnotamyr5 / contanotasmyr5;
            System.out.println("Promedio de notas mayores a 5: " + promnotasmayores5);
        }

        // trabajamos con las notas inferiores a 4
        if (notai4 == 0) {
            System.out.println("No se puede calcular el promedio de notas bajo 4");
        } else {
            promnotasmenor4 = smnotasmnr4 / contanotasmnr4;
            System.out.println("Promedio de notas menores a 3: " + promnotasmenor4);
        }

        // promedio total de las notas
        double promedioTotalNotas = promedio / 20;
        System.out.println("Promedio total de notas: " + promedioTotalNotas);




/*
        Scanner scanner = new Scanner(System.in);

        double nota; // la nota a ingresar
        int contNotas1 = 0; // el contador de notas 1
        int contNotasMayoresA5 = 0; // contador de notas mayores a 5
        int contNotasMenoresA4 = 0; // contador de notas menores a 4
        double sumaNotasMayoresA5 = 0; // suma de notas mayores a 5
        double sumaNotasMenoresA4 = 0; // suma de notas menores a 4
        double sumaTotal = 0; // suma total de notas

        double promedioNotasMayoresA5, promedioNotasMenoresA4; // los promedios de notas mayores a 5 y menores a 4

        boolean error = false;

        for (int i = 0; i < 20; i++) {
            System.out.println("Introduce una nota (entre 1 y 7) N" + (i + 1) + ": ");
            nota = scanner.nextDouble();

            if (nota == 0) {
                error = true;
                break;
            }

            if (nota == 1) {
                contNotas1++;
            } else {
                if (nota > 5) {
                    contNotasMayoresA5++;
                    sumaNotasMayoresA5 += nota;
                } else if (nota < 4) {
                    contNotasMenoresA4++;
                    sumaNotasMenoresA4 += nota;
                }
            }
            sumaTotal += nota;
        }
        if (error) {
            System.err.println("Error: No pueden haber notas con valor 0, ha finalizado la ejecución del programa.");
            System.exit(1);
        }
        // mostramos la cantidad de notas 1
        System.out.println("El número de notas 1 es de: " + contNotas1);
        //trabajamos con las notas superiores a 5
        if (contNotasMayoresA5 == 0) {
            System.out.println("No se puede calcular el promedio de notas sobre 5");
        } else {
            promedioNotasMayoresA5 = sumaNotasMayoresA5 / contNotasMayoresA5;
            System.out.println("Promedio de notas mayores a 5: " + promedioNotasMayoresA5);
        }

        // trabajamos con las notas inferiores a 4
        if (contNotasMenoresA4 == 0) {
            System.out.println("No se puede calcular el promedio de notas bajo 4");
        } else {
            promedioNotasMenoresA4 = sumaNotasMenoresA4 / contNotasMenoresA4;
            System.out.println("Promedio de notas menores a 3: " + promedioNotasMenoresA4);
        }

        // promedio total de las notas
        double promedioTotalNotas = sumaTotal / 20;
        System.out.println("Promedio total de notas: " + promedioTotalNotas);*/
    }
}









