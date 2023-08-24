/*
Al utilizar un  "break" o "continue" etiquetado podemos indicar que bucle se va interrumpir o continuar
 * su ejecucion (Tambien aplica para el for).
NOTA DEL INICIO<><><><><> * */

public class SentenciaBucleEtiquetas {
    public static void main(String[] args) {


        //1er Ejemplo.
        /*for(tipo d dato(int) nombre d la variable(i) igual(=) inicia en 0; variable(i) menor que 5; variable(i)
        incremento(++){

        if(si la variable(i) es igual(==) a 2){
        continuar con la ejecucion pero en el siguiente loop o iteracion  nos saltamos la actual;


           }

           imprime lo anterior

        }   >>>>VA A IMPRIMIR DEL 0 AL 4 PERO EL 2 SE LO VA A SALTAR.
        >Recordemos que va a imprimir primero el for y despues tiene un if el cual tiene la condicion de i igual a 2
        >Despues pasa con el continue que va acontinuar despues de la iteracion
         >En pocas palabras el for normal de 0 a 1 pero,
        >la combinacion de la condicion de if con el continue va a saltar el dos pasando a la siguiente
        >iteracion de 3 a 4 finalizando con la impresion en pantalla de:
                             (R=   i = 0 , i = 1 , i = 3 , i = 4 )





        */
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }


            System.out.println("i = " + i);
        }
        //2do Ejemplo ¿Cómo se pueden dar etiquetas a las sentencias, a los bucles ?
        /*(R=): Puede ser arriba, justamente aaarriba del for o del while, con un nombre o cualquier nombre,
        * un identificador.
        * Mismas reglas que un nombre variable, un nombre de metodo comenzando en minuscula palabra camellcase
        * separada con mayuscula, palabra compuesta que no tenga caracter especiales.
        *
        *
        * ETIQUETA (bucle1:): Va con dos puntos(:) y siempre tiene que ir justo pegado al de abajo o a lado(Nos referimos
        * al for puede ir como esta o pegado donde comienza el for).
        *
        * Entonces este for esta etiquetado con esta etiqueta identificador bucle 1 n o continue o en el break se
        * puede hacer referencia a esta etiqueta
        *
        * EL RESULTADO SERA EL MISMO, PERO ESTA ETIQUETADO.Etiqueta= 0
                                                           Etiqueta= 1
                                                           Etiqueta= 3
                                                           Etiqueta= 4
                                                           *
                                                           *

       *Se tuvo que poner el ejemplo en comentario por el 3er ejemplo,>>>>>>>>>>>
       *
        bucle1: for(int j = 0 ; j < 5 ; j++){
            if( j == 2){
                continue bucle1;
            }

            System.out.println("Etiqueta= " + j);
        }

*/


        //3er Ejemplo ¿Pero qué pasa si tengo otro bucle? (Con otro for anidado)
        /*Despues de pegar el ej. anterior tal cual esta se incluira otro for el que va con la variable k,
         * el siguiente paso sera dirigirnos a "Code" y se elegira "Reformat Code", es necesario hacerlo porque
         * si a continue le quitamos la etiqueta blucle1 se sale del segundo(K) for automaticamente ,
         *  no es que lo saque se salta la iteracion ,
         * la va a ejecutar pero la (K) cuando (j) valga 2 no lo va a ejecutar, no va
         * a alterar esta secuencia, este segundo for entonces por eso la etiqueta importante,
         * Porque de esa forma indico hago referencia  a que bucle quiero continuar
         * con la siguiente iteracion o a que bucle quiero salirme completamente
         *
         *
         *
         *
         *
         *IMPRESION DE PANTALLA SIN LLAVES, Y EL SOUT DESPUESDEL PRIMER FOR, Entonces por cada 0 que comienza k del
         * 0 al 4, Pero si se fija a mas detalle se salto completmente la iteracion del segundo for
         *de este segundo for para que j igualarlos cuando el indice es 2,pero continuo con el 3 y luego con el 4

*Etiqueta "j" = 0Etiqueta "k" = 0
Etiqueta "j" = 0Etiqueta "k" = 1
Etiqueta "j" = 0Etiqueta "k" = 2
Etiqueta "j" = 0Etiqueta "k" = 3
Etiqueta "j" = 0Etiqueta "k" = 4
Etiqueta "j" = 1Etiqueta "k" = 0
Etiqueta "j" = 1Etiqueta "k" = 1
Etiqueta "j" = 1Etiqueta "k" = 2
Etiqueta "j" = 1Etiqueta "k" = 3
Etiqueta "j" = 1Etiqueta "k" = 4
Etiqueta "j" = 3Etiqueta "k" = 0
Etiqueta "j" = 3Etiqueta "k" = 1
Etiqueta "j" = 3Etiqueta "k" = 2
Etiqueta "j" = 3Etiqueta "k" = 3
Etiqueta "j" = 3Etiqueta "k" = 4
Etiqueta "j" = 4Etiqueta "k" = 0
Etiqueta "j" = 4Etiqueta "k" = 1
Etiqueta "j" = 4Etiqueta "k" = 2
Etiqueta "j" = 4Etiqueta "k" = 3
Etiqueta "j" = 4Etiqueta "k" = 4

*
* IMPRESION DE PANTALLA con LLAVES, Y EL SOUT DESPUES DEL PRIMER FOR:

* [Etiqueta "j" = 0, Etiqueta "k" = 0], [Etiqueta "j" = 0, Etiqueta "k" = 1], [Etiqueta "j" = 0, Etiqueta "k" = 2], [Etiqueta "j" = 0, Etiqueta "k" = 3], [Etiqueta "j" = 0, Etiqueta "k" = 4],
[Etiqueta "j" = 1, Etiqueta "k" = 0], [Etiqueta "j" = 1, Etiqueta "k" = 1], [Etiqueta "j" = 1, Etiqueta "k" = 2], [Etiqueta "j" = 1, Etiqueta "k" = 3], [Etiqueta "j" = 1, Etiqueta "k" = 4],

[Etiqueta "j" = 3, Etiqueta "k" = 0], [Etiqueta "j" = 3, Etiqueta "k" = 1], [Etiqueta "j" = 3, Etiqueta "k" = 2], [Etiqueta "j" = 3, Etiqueta "k" = 3], [Etiqueta "j" = 3, Etiqueta "k" = 4],
[Etiqueta "j" = 4, Etiqueta "k" = 0], [Etiqueta "j" = 4, Etiqueta "k" = 1], [Etiqueta "j" = 4, Etiqueta "k" = 2], [Etiqueta "j" = 4, Etiqueta "k" = 3], [Etiqueta "j" = 4, Etiqueta "k" = 4],

Asi es el bucle lo muestra hacia el lado el segundo for (K), pero el primer for(J) hacia abajo.
* Por cada j que va de 0 a 4 de arriba hacia abajo a lado esta k que tambien inicia de 0 a 4, pero que
* repite unos de los numero por cada j , solo que j se salta 2 pero k lo incluye para igualarlo(por cada num de j tenemos un num k
* que se va repetier el mismo numero y las mismas veces que j).
*
*
*
*
*
*
** CHECAR QUE EL FOR QUE CUMPLIO CON LA CONDICION DEL DEL IF, ES EL FOR QUE TIENE ETIQUETA Y EL CONTINUE TAMBIEN COMO EL 1ER
* EJ. SOO QUE ESTAN ETIQUETADOS Y VEMOS COMO SE ENTIENE LA NOTA DEL INICIO.

*
         *
         * */
        bucle1://Etiqueta
        for (int j = 0; j < 5; j++) {

            System.out.println();//Solo es para dar salto de linea y aparezca de lado
            for (int k = 0; k < 5; k++) { //FOR 2
                if (j == 2) {
                    continue bucle1;
                }

                System.out.print("[Etiqueta \"j\" = " + j + ", Etiqueta \"k\" = " + k + "], ");
                //Las llaves solo se usan para el tema visulal []
            }
        }



        //4to Ejemplo pero con break y se cambia bucle por etiqueta
        /* * Entonces de esa forma podemos hacer un continue en un for en especifico, en un padrE, por ejmplo que esta con una etiqueta
* y eso tambien aplica por ejemplo al break:

*
*
* [Etiquemta "j" = 0, Etiquemta "k" = 0], [Etiquemta "j" = 0, Etiquemta "k" = 1], [Etiquemta "j" = 0, Etiquemta "k" = 2], [Etiquemta "j" = 0, Etiquemta "k" = 3], [Etiquemta "j" = 0, Etiquemta "k" = 4],
[Etiquemta "j" = 1, Etiquemta "k" = 0], [Etiquemta "j" = 1, Etiquemta "k" = 1], [Etiquemta "j" = 1, Etiquemta "k" = 2], [Etiquemta "j" = 1, Etiquemta "k" = 3], [Etiquemta "j" = 1, Etiquemta "k" = 4],
}
*
* Va a imprimir esto nomás:
*  porque despues se sale del for, se deja, no continua .
*Es muy similar al 3er ej. pero va imprimir eso
*
* Como se usa un break y cuando se cumple la condicion al llegar a 2 se para quedando solo el 0,1 y para
* el segundo for igualarlo lo vemos asi con la misma secuencia per repitiendose con las mismas veces que el primer for
*
* */
        System.out.println("\n>( w¨°0°) Soy un salmon xD | >( w¨°0°) Soy un salmon xD | >( w¨°0°) Soy un salmon xD | >( w¨°0°) Soy un salmon xD | >( w¨°0°) Soy un salmon xD | >( w¨°0°) Soy un salmon xD | >( w¨°0°) Soy un salmon xD |");
        etiqueta2://Etiqueta
        for (int j = 0; j < 5; j++) {

            System.out.println();//Solo es para dar salto de linea y aparezca de lado
            for (int k = 0; k < 5; k++) { //FOR 2
                if (j == 2) {
                    break etiqueta2;
                }

                System.out.print("[Etiquemta \"j\" = " + j + ", Etiquemta \"k\" = " + k + "], ");
                //Las llaves solo se usan para el tema visulal []
            }
        }

        //5to Ejemplo pero con un while y dentro un for
        /*Podemos ver que si hay un for pero desarmado y recordemos que es,while es pre-prueba, por lo tanto primero
        evalua,por eso es pre-prueba o pre-evaluacion.
        Es como tener un while dentro d eun for*/
        bucle3://Etiqueta
        for (int j = 0; j < 5; j++) {

            System.out.println();//Solo es para dar salto de linea y aparezca de lado
            int k = 0;//Inicia
            while(k < 5) { //Evalua
                if (j == 2) {
                    continue bucle3;
                }

                System.out.print("[EtiquetaWHILE \"j\" = " + j + ", EtiquetaWHILE \"k\" = " + k + "], ");
                //Las llaves solo se usan para el tema visulal []

                k++;//Incremento
            }
        }



        //Otro Ejemplo. Iterar por los dias de la semana y la semana 8 horas de trabajo
        /*Por lo tanto una persona puede trabajar cada dia durante 8 horas, pero menos el sabado y domingo.

       * Entonces se puede recorrer con un for por cada dia y por cada hora  */


        System.out.println("\n>( w¨°0°) Soy un salmon xD | >( w¨°0°) Soy un salmon xD | >( w¨°0°) Soy un salmon xD | >( w¨°0°) Soy un salmon xD | >( w¨°0°) Soy un salmon xD ");

        bucle4://Etiqueta
        for (int j = 0; j <= 7; j++) {  //j menor o igual a los 7 dias de la semana
            int k = 0;//Inicia
            while( k <= 8) { //Evalua / k menor o igual a 8 horas laborales
                if (j == 6 || j == 7) {  //si( j es igual a el dia 6to/sabado  O j es igual a el dia 7mo/domingo) SE SALTA (no trabaja ese dia)
                    System.out.println("El dia " + j + ": fin de semana de mimir ñwñ");
                    continue bucle4;
                }

                System.out.println("Dia de " + j + " haciendo la trabajamcion a las  " + k + "homras xd");


                k++;//Incremento
            }
        }



        /**/ /**/



    }
}
