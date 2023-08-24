import com.sun.jdi.IntegerValue;

public class WrapperInteger1 {//wrapper - (Anidar)
    public static void main(String[] args){
/*La clase Integer comenzando con mayuscula  representa un valor primitivo y podemos trabajar con este dato lo podemos
* convertir, por ejemplo, a un String.
* Pero tambie se pueden convertir a otros tipos numerico, yasea un cgort, un byte, un long.
*
*
* >>>>>>>> <-> WRAPPER significa ANIDAR en ingles. <-> <<<<<<<<<<<<<
* Por lo tanto esta clase Integer anida un valor primitivo del tipo Integer.(Por eso el nombre de la clase)
*
* Entonces el tipo de REFERENCIA es Integer.
* por lo tanto es un objeto. La INSTANCIA sin importar el tipo de dato primitivo comenzara con mayuscula

*
*
        Integer intObjeto = new Integer(32768); //Aprece rayado porque esta forma ya es considerdo INSTANCIA OBSOLETO, desde el java 7 se dejo de usar asi.
        * REferencia Objeto = nueva Instancia (Constructor);
*/
        //Version Actual
        //Como convertir un primitivo en un integer
         //DE ESTO
        /*

        int primitivo = 32768;
        Integer intObjeto = Integer.valueOf(32768);
        Integer intObjeto2 = 32768;

        //Toma el primitivo y lo convierte en el objeto autoboxing, entonces
        // Es la forma de convertir un primitivo o una literal integer entera en un objeto  referencia integer en una clase wrapper

        Ya no se ponen los valores solo se manda a llamar a la variable.
         */
        //A ESTO

        int intprimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intprimitivo);
        Integer intObjeto2 = intprimitivo;

        System.out.println("intObjeto = " + intObjeto);

        //Convertir al reves -  Un OBJETO del TIPO DE REFERENCIA  a un ENTERO PRIMITIVO
        /* Tiene dos formas :

        *1.- LA AUTOMATICA IMPLICITA: Esta forma , se toma el objeto integer y automaticamente se convierte en un primitivo sin
        * hacer nada simplemente se asigna un integer de referencia aun entero primitivo
        *
        *
        * 2.-LA EXPLICÍTA:Con el metodo inValue, etonces este método retorna al entero primitivo del objeto */

        int numI = intObjeto;//Forma = AUTOMATICA IMPLICITA
        System.out.println("Forma  AUTOMATICA IMPLICITA (numI) = " + numI);

        int numE = intObjeto.intValue();//Forma = EXPLICÍTA
        System.out.println("Forma EXPLICÍTA (numE) = " + numE);

        //Como CONVERTIR un String a un ENTERO
        /*Es importante recordar que si se hagra una conversion asi el valor del String tiene que ser númerico,
        * Un entero integer valor igual, utilizando la clase integer .valueof tambien recibe un String aparte del primitivo */

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("Convertir de un String a un valor entero:  = " + valor);


        //CONVERTIR un Short/byte/Long
        /*Short es de la clase Short no primitivo, recordar que el chort como maximo soporta hasta el 32767,ahí perfecto sin error
        entonces de forma automática va a tomar de la literal el entero primitivoy lo convierte a un Short, pero siempre y cuando
        este dentro del rango del mínimo y el máximo.

         El mínimo es: -32768
          El máximo es : 32767

          Eso es cuando se convierte de forma automática, tomando un valor de la literal.


           Si el valor que tiene intObjeto es 32768 claro que se puede convertir con short pero se tendria una perdida de informacion
           porque lo va a pasar a -32768, incluso si es 52768 en la impresion saldra como  -12768 aun es ambigua y seguimos perdiendo
            informacion.

            Pero si es con 22768 entonces imprime tal cual lo que dice que ya no hay perdida de informacion, lo convierte
            sin problemas, mientras sea menor al valor.
             Menor al valor del que soporta el maximo que soporta el short*/
        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        //BYTE
        /*Tambien s epuede convertir, puede convertirse a intobjeto como intobjeto2, tienen el mismo valor y ambos son de
        * referencia
        *
        *
        * Tambien permite usar .byteValue();  pero voy a tener perdida de informacion
        *
        * Byte byteObjeto = intObjeto.byteValue();
        *
        * Byte MAXIMO : 127
        *
        * Entonces en general no puedo convertir un objeto con mayor capacidad como un integer a un objeto con menor capacidad
        * en bits como los Short o los bits, pero si puede competir hacia arriba un entero a un tipo Long o convertir un Short
        * a un tipo Integer, o un Byte a un tipo Short ,o un  byte a un tipo Integer, un short a un tipo Long sin ningun problema
        *
        * Pero hacía abajo se puede  mientras el valor esté dentro de los rangos */

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        //Long

        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);

        /*Entonces la clase WRAPPER como el Integer, se aplica a cualquiera  tanto al Short, al byte, al long, también
        *a los tipos decimales como el float y el double nos permite dar mayor funcionalidad a nuestros números.
        * Poder convertir de un tipo a otro dentro de lo númerico, por supuesto, y también  a String y viceversa.
        * Tmbién soportan el autoboxing, se pueden convertir de forma automática desde un primitivo a un tipo de referencia
        * de forma automática y también vicersa.
        * Un primitivo a partir de un tipo dereferencia.  */

        






    }
}
