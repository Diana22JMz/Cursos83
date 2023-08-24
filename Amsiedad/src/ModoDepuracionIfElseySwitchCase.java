public class ModoDepuracionIfElseySwitchCase {
    public static void main(String[] args){
        float promedio = 5.5f;

        if(promedio >= 6.5){
            System.out.println("Femlicidades gran promedio!!! ");
        }else if (promedio >= 6.0){
            System.out.println(" Que buen promedio ñwñ");
        }else if (promedio >= 5.5){
            System.out.println("Ahí vamos xd");
        }else if (promedio >= 5.0){
            System.out.println("Lo normal, ocupas más esfuerzo");
        }else if (promedio >= 4.0){
            System.out.println("Uyyy , como que si le estudias en serio....");
        }else {
            System.out.println("Ya valiste queso!");
        }

        System.out.println("El promedio obtenido es = " + promedio);
    }
}

/*En este clase podemos ver como usar el metodo depuracion /debugg.
Recordemos que siempre se pondra el punto rojo en la primera linea del codigo a ejecutar.

* primero se toma la primera que seria el if con la condicion se le pone el punto rojo y se continua a dar click derecho,
* donde se da click en la opcion debug, donde nos apaecera como un menu con opciones, checamos en el debugger donde se mostrara
*  como se procedera y si le damos step over se ira ejecutando linea por linea, y si nos vamos a consola veremos como con el
* step over veremos lo mismo de como se ve la ejecucion por lineas y podemos continuar seguir presionando la opcion hasta que se
* sigua ejecutando hasta finalizar el proceso.
*
* Incluso si lo vemos en otros ejemplos que tengan scanner al ponerlo con step over igual se ejecutara pero si no se meten
* los datos que se piden entonces no podra continuar ejecutandose y se desactivaran las opciones, Para realizar
* la entrada de datos nos pasamos a la consola y se hace de forma nomal la introducción de los datos
* una vez que se metan los datos continuara
* la ejecucion de forma normal, en la parte del debugger veremos como se ve ejecutada cada linea y ala pasarnos a la consola
* veremos la ejecucion de forma normal.
*Esto aplica  tanto para el if, else y switch case
*
* Incluso si notamos en esto veremos que cuando son con casos o con muchos if,else se vera que cuando metemos una opcion
* seguira ejecutando pero ignora la opciones no elegidas hasta llegar a la opcion que si se escogio la cual ejecutara y
* mostrara de forma normal en el debugger y la consola de forma normal.
 *
 *
 *
 * */


/*MODO DEPURACION/DEBUG EN SENTENCIAS FOR Y FOREACH
(El punto rojo - Se llama PUNTO DE QUIEBRE)
Ejemplo que se utiliza sera "SENTENCIAFOR"
*Recordemos que siempre se pondra el punto rojo en la primera linea del codigo a ejecutar.
* Una vez realizada la elección de la primera linea y puesto el punto rojo se procede a dar click derecho escoger la opcion
* "debug" , una vez posicionado todavia no ejecuta el for, todavia no se inicializa ninguna  variable, no existe en el
* contexto del programa todavía.
* Se ejecutara hasta que se de click en el "step over" .
* Cuano este en el for se hara esto del step over per se dara un step over por cada paso , ocea nnos referimos a que se dara
* un click por cada parte que tiene el for , que son el inicializador, el contador e incrementador un total de tres click en el
* for y despues se sequira a la siguiente linea.
* Se ejecutara la linea y se mostrara en consola la impresion, despues de habre hecho los tres clicks anteriores entonces ,
* se continuara con la intercalacion entre un click en el for y el sistem hasta llegar a 10, despues de llegar así se continua
*con el siguiente parrafo del for y se vuelve a repetir la misma secuencia.
*Si usamos un ejemplo que tenga que ver con un for con un arreglo entonces lo que podemos hacer es posicionar el punto rojo
en el inicio del arreglo o en el for y hacer la misma secuencia, pero si en programa tenemos que salte ciertos elementos de programa
 entonces no los imprimira, pero si es un parrafo que contega tdo para la secuencia se tendra que repetir
 las mismas veces que los elementos del arreglo.

 Ahora si es el ejemplo del for each entonces  s eposiciona el punto de quiebre en el arreglo y procede con el for y se sigue
 intercalando entre el for y el sistem hasta a acabar de imprimir el arreglo , asi se va a continuar saltando hasta finalizar el codigo
 */
