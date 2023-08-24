public class AutoboxingInteger {
    public static void main(String[] args){
        /*Ejemplo de autoboxing de un tipo Integer de referencia cuando se convierte en un primitivo y viceversa.
        *

        * *Autoboxing : Viene de de empaquetar o Wrapper anidar, entonces autoconvertir o anidar un primitivo en la clase Integer
        * y viceversa  */

       Integer[] enteros = {Integer.valueOf(1), 2,3,4,5,6,7,8,9,10,11,12,13,14,15}; //Integer con arreglos de enteros
        /*De partida de forma automática ya tenemos AUTOBOXING estamos convirtiendo primitivos en la literal, en tipos de referencia
        * y no marca ningún error.
        *  */

        int suma = 0;//Vamos a tener un suma del tipo primitiva y la idea de ir sumando solamente los valores que sean pares


        //Entonces lo podemos recorrer con un for each del tipo Integer, del tipo referencia , no del tipo primitivo si no de referencia
        for(Integer i: enteros){
           if(i.intValue() % 2 == 0) {//condicion
               suma += i.intValue();

               /*De forma explicita hay que empezar a peguntar si el entero, pero en este caso primitivo de cada objeto "i"
                * y intvalue() si le calculamos el módulo de dos es igual 0 , entonces par  y sumamos , vamos sumando.
                * suma más igual recordemos que se puede abreviar y punto y le sumamos el intvalue(el valor primitivo, suvalor)
                *recordar que esto sera de operar compuesto seria lo mismo que"  suma += suma + i.intValue(); "
                *
                *
                * Entonces recorre u arreglo del tipo Integer del objeto, bueno y sumamos su valor primitivo el número
                * siempre y cuando sea par,
                *
                *
                * Recordemos que retorna en Integer como Int */

           }
        }

        System.out.println("suma = " + suma);



        suma = 0;//Se inicia la suma en 0 por el siguiente for each,
        // que si no en la siguiente suma2 sale contando lo de la suma anterior



        //De forma automatica se hace el boxing, Lo contrario, convertir un objeto Integer a un primitivo int
        /*Esta seria la fora explícita, pero tambien se puede hacer de forma implícita.
        * Es decir puedo puedo compara el objeto mismo Integer, calcular el módulo y comparar con 0 de forma automática, cuando
        * hay operaciones aritméticas de promedio sea una suma, resta el módulo multiplicacion, división.
        * Cualquier operación aritmética con objeto de Integer de referencia y no solamente con el Integer si no
        * con cualquier clase wrapper de un número primitivo, ya sea Integer, Short, byte, long, double, float
        * cualquiera de forma automática se convierte hace un autoboxing al primitivo.
        *
        * Es decir el compilador de java por detras de escena se le invoca el método value , intvalue, entonces seria exacmente
        * lo mismo   */
        for(Integer i: enteros){
            if(i % 2 == 0) {
                suma += i;



            }
        }

        System.out.println("suma2 = " + suma);
        
        }
}
