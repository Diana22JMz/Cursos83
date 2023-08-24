public class WrapperOperadoresRelacionales {
    public static void main(String[] args){

        /*
        * A esta variable del tipo Integer en el num2 le pasa la referencia del objeto num1
        *
        * A pesar de que iprimen de forma similar son más objetos que numeros.
        * Son objetos que contienen un valor anidado encapsulado dentro de la instancia del Integer
        *
        *
        *Son el mismo Objeto?  true   : Por que el num2 contiene la instancia del num1 la referencia, el objeto apunta hacía el mismo
        * objeto, por lo tanto ambas instancias son exactamente iguales en la misma.
        * Es decir, es un objeto que está asignado a dos variables del tipo Integer.
        *  */
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo Objeto?  " + (num1 == num2));
        //Va a imprimir para saber si son iguales, entonces son el mismo objeto

        


        //Cambio de numeros
        /*
        * Son el mismo Objeto?  false   : A pesar de que ambos son mil pero "false" no son el mismo Objeto, es decir, contiene
        * el mismo valor, pero no la misma instancia.
        * Ya que num2 se le asignaotro objeto, otra instancia que contiene el mismo valor y acaba con el igual igual cuando son tipos
        * de referencias o clase wrapper compara el objeto y no por su valor.
        *
        * A difeerencia de lo primitivo, lo primitivo  siempre va a comparar por valor,
        * por que lo primitivo no  son objetos, son valores.
        *
        *Entonces cuando usamos el igual, igual en primitivos compara el valor,
        * pero cuando usamos el igual de igual en objetos,
        *  compara por la instancia compara si estas dos instancias corresponden lo mismo.
        * O dicho de otra forma, si estos dos objetos corresponde a la misma instancia
        *
        *
        * Entonces, cómo puede comparar ahora un objeto de referencia como el Integer o cualquier wrapper?
        * Esto se aplica exactamente igual al Integer, al float, al double, al long, al short, al byte, A cualquier tipo
        * númerico o número de referencia se aplica exactamente igual, incluso también para el String.
        *
        *
        *  <><><><><><> CON EL == COMPARA POR EL OBJETO  <><><><><><>
        * °%°%°%°%°%°%°%°%  CON  .equals COMPARA POR EL VALOR °%°%°%°%°%°%°%°%
        *
        *Recordar que el == es para comparar primitivos por valor y el equals valores en tipos de referencia.
        * Cuando usamos el == en tipos de refrencia compara la instancia y no su valor.
        *
        *
        * Hay una excepcion muy particular en java : Esto se aplica solamente a tipos o números que sean mayor a 128 .
        * Por ejemplo, si colocamos 128, bueno, mayor o igual a 128, 128 e igual.
        * Pero si en el valor a ambos le ponemos un valor de 127
        *
        * Va  a dar a t0d0 true.
        *
        * ¿Por qué?
        * Bueno, porque lleva hasta 127 como máximo.
        * Va a comparar de forma automática por el valor, a pesar de que esa instancia, a pesar de que sean instancia,
        * el num1 , num2 del tipo Integer, cuando comparamos con igual, automáticamente hace el autoboxing con el .intValue
        *  por debajo  y lo convierte en primitivos y lo compara, pero solamente hasta 127.Es una particularidad que tiene java.
        *
        *
        * Entonces, si es en 37 o menor, va a comparar siempre por valor y no por la instancia, pero si es mayor a 127, 128, tal
        * como vimos, llega tambien. Ya cambia el escenario siemore va a comparar el == por la instancia del objeto .
        * Esto solamente se aplica con el operador de relacion == cuando comparamos si son igual, pero  ¿que pasa con el mayor y menor
        * de que son numeros ?
        * son enteros
        *
        *
        * NOTA EXTRA::
        * AUTOBOXING: Es cuando empaquetamos o convertimos un primitivo en una clase wrapper.
        * AUNBOXING:: dESEMPAQUETAR ES DECIR , PASAR DE REFERENCIA A UN VALOR PRIMITIVO O CONVERTIR DE REFERENCIA A PRIMITIVO.*/

        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo Objeto?  " + (num1 == num2));

        //¿Cómo puede comparar valor?
        /*Bueno con el método equals
        * Se pregunta, se concatena y se compara con el equals, recordar que es de referencia con el equals comparamos valor
        * con el num2*/
       System.out.println("Tienen el mismo valor??? " + (num1.equals(num2)));

        //Forma alternativa
        /*En vez de usar un equals, podemos convertir de forma implícita cada uno a un primitivo
         * En vez de usar el equals se quita y se cambia por un .intvalue en las dos variables y se agrega un ==
         * como se ve en el siguiente ejemplo*/
        System.out.println("(2)Tienen el mismo valor ?" + (num1.intValue() == num2.intValue()));


        num2 = 500;//NUEVA INSTANCIA AL NUM2

        //Quiero saber si num1 es mayor que num2
        Boolean condicion = num1 > num2;
        System.out.println("la condicion xD: " + condicion);
        /*Cuando usamos el mayor (>) o mayor igual que (>=), igual (=) o menor(-) o menor igual (<=) ,
         igual que los operadores aritméticos de suma, multiplicación, resta, división, calcular el resto .
         Cualquier operación aritmética y relacional, excepto el igual igual.
         De forma automática también puedo trabajar con tipos de referencia y por debajo se convierten usando boxing

         * Al final lo que esta haciendo en el ejmplo. aca por debajo es invocando el intvalue a cada uno y lo compara,
         condicion, ambos son iguales, excepto en valor , en valor no en instancia, por lo tanto sera false

         **Recordar esto hace exactamente lo mismo, ya que hace auto inboxing


         */

        Boolean condicion2 = num1.intValue() > num2.intValue();
        System.out.println("(2)la condicion xD: " + condicion2);
        //**Recordar esto hace exactamente lo mismo, ya que hace auto inboxing


        /*Entonces ppodemos utilizar operadores relacionales mayor, menor o mayor que menor que en tipos de referencia tipos
        * wrapper
        * Pero el igual , igual, no a menos que sea menor que 127.
        * Pero si es ayor tenemos que comparar con iguales o con el igual igual, pero convertido a primitivo forma explícita.*/



    }
}
