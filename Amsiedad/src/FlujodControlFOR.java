/*FOR
* Nos permiete implementar bucles o ciclos en JAVA, sus sentencia de control repetitivas iteraciones
* que modifican el flujo secuencial  de nuestr aplicacion pero ejecutando una o mas veces de un mismo bloque
* de codigo de forma reiterativa, en donde se tienen que conocer los limites  del ciclo for, el valor inicial
* de la iteracion, cuando comienza y cuando termina, Es decir cuantas veces se va a repetir este fragmento de
* codigo.
* Cuando se usa FOR  se tienen que conocer los limites, pero tambien en java hay otros flujo de contro de ciclo o
* bucle, que se veran más adelante.
* Con el FOR mas alla de evaluar una expresion, se tiene que conocer los limites vaya el valor inicial y el valor
*  final es decir reiterar hasta cierta cantidad de veces la que necesitamos implementar.
*  */
public class FlujodControlFOR {
    public static void main(String[] args){

        //LO IDEAL
        //for(int i = 0; i <= 5; i++){
        //System.out.println("Las iteraciones de i: "+i);
        // }

        //Resumen del For
        /*La palabra clave/reservda sera FOR que esta separada por tres partes con puntos y comas y opcionalmente lleva llaves

        * *-La 1ra parte es la inicializacion del FOR aqui se inicializa la variable con la cual debera comenzar la
        iteracion(Esto se ejecuta una sola vez en tdo el cicl0 de vida del FOR una sola vez, Al comienzo.) °(i = 0)°
        Se puede poner i o cual quier letra para iniciar la variable.

        *--La 2da parte es donde se evalua una expresion de termino, es decir cuando esta expresión boleana es falsa
         ,termina el FOR y va ejecutando cada iteracion mientras sea verdadera, por ej. si "i es menor o igual que
         un valor, un valor limite,°( i < 5)° en este caso va a reiterar de 0 hasta 4, porque el 5 no es inclusivo/e,
         °( i <= 5)° pero si lo colocamos así se incluye.

        *---La 3ra parte sería el incremento de la variable "i", por ej. i es igual +1 °(i = i +1)°,
         pero tambien se puede escribir con un postincremento °(i++)°, Se ejecuta al final de cada iteracion
         Cuando termina cada club o cada iteracion se incrementa al final.

         Se evalua vaya va preguntando por ej. ¿si i vale cero?, ¿cero es menor o igual que 5? y la respuesta es SI
         Entonces el codigo incrementa i y después vuelve a preguntar ¿si i vale uno?(porque ahora vale 1),
          ¿1 es menor o igual que 5? , SI entonces ejecuta el codigo y vuelve a incrementar ahora i vale 2 y vuelve
          a preguntar ¿si i vale 2?, ¿2 es menor o igual que 5?  la respuesta es SI ejecuta el codigo
     al final del codigo vuelve a incrementar y asi hasta llegar a 5, entonces 5 es menor o igual que 5 si es igual
     que 5,por lo tanto, ejecutar el codigo con el incremento i vale 6 , 6 es menor que 5 o igual que 5 No lo es
     entonces termina se sale.

     CUANDO SE MANDA A IMPRIMIR ITERA 6 VECES CONTANDO DESDE EL 0 HASTA EL 5.

     Si solo es una linea se pueden omitir las llaves
                           for(int i=0; i <= 5; i++)
                         System.out.println("Las iteraciones de i: "+i);

       pero si se tienen varias lineas entonces debera de tener las
     llaves, pero de ser preferible es mejor que tenga las llaves( {} )


*/

        //EjEMPLO CON LA INICIALIZACION AFUERA DEL FOR
              /*Tambien se puede poner la inicializacion afuera teniendo un mayor alcanze,
 ya que cuando lo ponemos dentro del for su alcanze es hasta donde cierren las llaves
        int i = 0 ;
        for( ; i <= 5 ; i++){
            System.out.println("Las iteraciones de i dentro del for: "+i);
         }//Aun estando la iniciaizacion afuera el for llama a la variable e imprime las iteraciones del 0 al 5

        System.out.println("i fuera del for " + i);//Imprimira el 6. Ya que estando fuera su alcanze es mayor y
                                                 //Puede imprimir el incremento

        Imprime lo siguiente :

        Las iteraciones de i dentro del for: 0
        Las iteraciones de i dentro del for: 1
        Las iteraciones de i dentro del for: 2
        Las iteraciones de i dentro del for: 3
        Las iteraciones de i dentro del for: 4
        Las iteraciones de i dentro del for: 5
        i fuera del for 6

                */

        //EJEMPLO CON EL INCREMENTO AFUERA DEL FOR
      /*  Funciona exactamente igual
        for(int i=0; i <= 5; ){
            System.out.println("Las iteraciones de i SIN: "+i);
            i++;
        }
        */

        //SE PUEDEN TENER VARIOS FOR
/*Tambien se pueden tener varios for y no causa conflicto,
Como se explico anteriormente el for tienes tres partes (inicializador, menor/mayor o igual que, post-incremento)
mientras estas tres se encuentran dentro del for su limite es dentro de las llaves, con lo cual se puede
entender que aunque tengamos varios for y la variable se llame igual asi como tdo lo demas sen iguales,
  no se confunde por que por el for son  tomadas como diferentes for, asi que si podemos tener tantos for como
  se desee.

   for(int i=0; i <= 5; i++){
          System.out.println("Las iteraciones de i: "+i);}
    }

       for(int i=0; i <= 5; i++){
          System.out.println("Las iteraciones de i: "+i);}
    }

       for(int i=0; i <= 5; i++){
          System.out.println("Las iteraciones de i: "+i);}
    }

       for(int i=0; i <= 5; i++){
          System.out.println("Las iteraciones de i: "+i);}
    }
*/

        //EJEMPLO CON i FUERA DEL FOR Y UN if
       /*
        int i=0;//Inicializador afuera con mayor alcanze

        for(; ; ){//Debe de llevar la comillas si no lo tomara como error


            //ADVERTENCIA: CUANDO SE ASI NO PONER (<= ) POR QUE SI NO SE HARAN VARIAS ITERACIONES, COMO UN BUCLE
            // SE PUEDE (>=) PERO CON BREAK.
            if(i > 5) {//Va como si fuera condicion.>MAYOR QUE

                break; //Se ocupara un break para salirse cuando llegue a 5
            }

        System.out.println("Las iteraciones de i desarmado: " + i);

            i++;//Sigue siendo valido el post-incremento
        }
*/

        //EJEMPLO DONDE INICIARA DE UN NUMERO MAYOR HASTA LLEGAR A UNO MENOR , CON DECREMENTOR
        /* inicia en 10 ; >mayor(Hasta donde va a llegar ya sea mayor o menor<)
        o igual=(con igual se incluye el numero hasta donde va a llegar) a 0;
        Post-decremento va ir disminuyendo -1, i--

        for(int i = 10; i >= 0; i--){
        System.out.println("Las iteraciones de DECREMENTANDO i: "+i);
        }
        */

        //TAMBIEN SE PUEDEN HACER COMBINACIONES CON EL INCREMENTO Y DECREMENTO EN UN SOLO FOR
        /*Va a parar cuando llegue i a 5 y j a 6, ya que no son iguales y recordemos que van a parar cuando
                i sea menor que j, con el 5 es menor que 6, tambien se observa como
                estan en un mismo for pero i va partiendo de 1 y se incrementa mientras que en j parte de 10 y
            se va decrementando


        for(int i = 1 , j = 10; i < j; i++ , j--){
        System.out.println(i + "<+i = j->" + j);
       }
*/

        //EJEMPLO DE UN FOR QUE SOLO IMPRIMIRA NUMEROS INPAR Y PAR
        /*
        * if(i % 2 == 0){  //TOMARA LA ITERACION DE I MIENTRAS SE INCREMENTA LA DIVIDE ENTRE 2 Y SI DA 0 ES PAR,
               // PERO ENTONCES SI ES PAR SALTAMOS O TERMINAMOS LA ITERACION, PERO NO EL FOR EL FOR CONTINUA,
               // TERMINA LA ITERACION ACTUAL, INCREMENTA AHI Y VUEL VE CON LA SIGUIENTE INTERACION INCREMENTANDO
               // PERO SE LA SALTA NO IMPRIME EL VALOR PARA ESO SE USARA UN CONTINUE
               *
               *


       for(int i=0; i <= 10; i++){
           //if(i % 2 == 0){  //ENTONCES CADA VEZ QUE SEA PARA SE SALE Y SOLAMENTE VA  IMPRIMIR NUMERO IMPARES
           if(i % 2 != 0){  //(!)NEGACION PARA QUE IMPRIMA SOLO PARES
               //if(!(i % 2 == 0) ){  TAMBIEN PARA NEGAR LA EXPRESION VA ANTES ! Y SE CIERRA LA EXPRESION LA NIEGA

               continue;//CON EL CONTINUE NO SE SALE DEL FOR LO QUE HACE ES SALIRSE DE LA ITERACION
               // Y CONTINUA CON LA SIGUIENTE ITERACION
           }

       // System.out.println("Las iteraciones de i IMPAR : "+ i);}
           System.out.println("Las iteraciones de i PAR : "+ i);
       }
       */


       //RECORDATORIO::Que el for es mas utilizado para iterar sobre arreglos y es justamente lo que se desea hacer


    }
}
