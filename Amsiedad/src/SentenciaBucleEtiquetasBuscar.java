public class SentenciaBucleEtiquetasBuscar {
    public static void main(String[] args){
        /*Con el siguiente ejercicio va a buscar un caracter dentro de una frase y nos dira cuantas veces se repite el mismo caracter

        * * */
        String framse = "tres tristes tigres tragan trigo en un trigal";//La frase

        int maximo = framse.length();//Se crea variable y el length se usa para contar cuantos son
        //  Nos ayudara a determiar el maximo de carateres dentro de la frase

        int cantidad = 0;//Cantidad va a iniciar en 0

        char letra = 'g';//(***)Variabledecaracter a buscar/Tambien se puede agregar como variable  y asi llamarse la variable en el if

        for(int i = 0 ; i < maximo ; i++){//Llevara un for(tipo dedato i inia en 0; i menor que el maximo; i incrementa)/Pero estamos
            //rrecorriendo con un for cada indice del String

          if(framse.charAt(i) != letra) {  /*Va a buscar y preguntar
              / con la variable de la frase(framse).Buscara el caracter con char porque se refiere al caracter
              / y con ayuda del for (i) rrecorriendo con un for cada indice del String
              /Si es = es porque encontro el caracter (t) pero si es distinto ! que continue.

              continue: Se usa claro porque son distintos no tiene sentido contabilizar ,
               porque lo que queremos hacer es contar la cantidad pero si es distinto no se podra hacer esto

               if(framse.charAt(i) != 't') TAMBIEN PUEDE PONERSE ASI LA LETRA Y FUNCIONA BIEN O CREAR LA VARIABLE REF (***)
               Y MANDARSE A LLAMAR  DENTRO LA VARIABLE
              */
              continue;
          }
         cantidad++; //Le vamos sumando una cantidad igual cantidad +1 o la incrementamos en 1 cada vez que coincide y encuentra este caracter
            //Pero si es distinto , continua a la siguiente generacion

          }
        System.out.println("Se encontro < " + cantidad + " > veces el caracter < " + letra +" > en la frase");


        //Ejemplo 2 Si se desea BUSCAR una PALABRA dentro de una FRASE
        /*Aunque parece similar sera diferente debidoa que aqui se busca una palabra, para ello se necesitan dos for
        * Uno para rrecorrer la frase todod el string y otra por cada caracter.
        * Ir comparando cada caracter de la palabra entonces seria un for par frase y un for con j para la palabra
        *
        * Un for rrecorre la frase completa y el otro la palabra  y la frase j la palabra
        *
        * Compara cada caracter de la palabra , entonces compara 0 a 0
        *
        * Los que llevan el 2 a lado hacen referencia a que se usaron en el ej. anterior y con el 2 como nuevo en este ejmplo
        * y el 3 los nuevo que se crean en este ejemplo*/

        String framse2 = "salmon soy un salmon sin amsiedad xD";//La frase
        String pamlabra3 = "salmon";


        int maximoframse2 = framse2.length();
        int maximopalabra3 = pamlabra3.length();

        int cantidad2 = 0;//Cantidad va a iniciar en 0

        char letra2 = 's';

        buscar://etiqueta
        for(int i = 0 ; i < maximoframse2 ; i++){//1er for va sobre la frase(for padre)
            int k = i;
            for(int j = 0 ; j < maximopalabra3 ; j++) {//2do for anidado

            if(framse2.charAt(k++) != pamlabra3.charAt(j)) {
                continue buscar;/* continue etiquetado que ira con for padre etiquetado
                y si no son iguales se hace un continue pero estara en el for padre,
                 para eso se utilizaran etiquetas, claro se tiene que ir a la siguiente iteracion,
                 pero de la frase ir al sig. caracter
                */
            }
            }
            cantidad2++;

        }
        System.out.println("Se encontro < " + cantidad2 + " > veces la palabra <° " + pamlabra3 +" °> en la frase");

//Ejemplo3.
        /*Con el sig. ej. busca hace los mismo que el ejemplo 2 solo con unas minimas difeencias que son para
        * que se rrecorre con los for hasta lo ultimo de String , busque la palabra que se desea encontrar
        *
        *
        * Esta mucho más optimizado, busca al final del String*/
        String framse3 = "salmon tres azules osos tragan salmonsalmon en un bosquesalmon";//La frase
        String pamlabra4 = "salmon";



        int maximopalabra4 = pamlabra4.length();/*El largo de la frase menos el largo de la palabra
        //Con esta forma va a abuscar hasta aca <salmon tres azules osos tragan salmonsalmon en un bosques> y lo que continue
        lo omitiraya que no sera necesario buscarlo*/
        int maximoframse3 = framse3.length() - maximopalabra4 +1;
        /*Se puede poner asi
        int maximoframse3 = framse3.length() - maximopalabra4
        pero tendra que ir asi
        for(int i = 0 ; i <= maximoframse3 ; i++)
        Al poner lo asi con el <= es para que se incluya que sea incluve el ultimo

        = : inclusive

        O

        Asi tambien
        int maximoframse3 = framse3.length() - maximopalabra4 +1;
        y se puede omitir el igual aquí
         for(int i = 0 ; i < maximoframse3 ; i++)
         */


        int cantidad3 = 0;//Cantidad va a iniciar en 0

        char letra3 = 's';

        buscar://etiqueta
        for(int i = 0 ; i <= maximoframse3 ; ){//1er for va sobre la frase(for padre)
            int k = i;
            for(int j = 0 ; j < maximopalabra4 ; j++) {//2do for anidado

                if(framse3.charAt(k++) != pamlabra4.charAt(j)) {
                    i++; //TAMBIEN SE PUEDE CAMBIAR EL INCREMENTO(incremento del for padre) DE FORMA MANUAL PONIENDOLO ACA
                    /*Entonces cada vez que sea distinto incrementa en 1 y continua con el for principal y aca se quita
                    * y se agrega aquí (el parrafo continua con °°°°°)*/
                    continue buscar;/* continue etiquetado que ira con for padre etiquetado
                y si no son iguales se hace un continue pero estara en el for padre,
                 para eso se utilizaran etiquetas, claro se tiene que ir a la siguiente iteracion,
                 pero de la frase ir al sig. caracter
                */
                }
            }
            cantidad3++;
           i = i + maximopalabra4; /*°°°°°Pero cuando lo encuentra el i va a ser igual al valor ley que tenia mas la cantidad
            de caracteres de la palabra, por que supuestamente, una vez que rrecorrió salmon lo encontro,
            lo ideal es que compare con ese caracter y no con el siguiente, entonces cambiamos y sumamos la cantidad caracteres
            de la palabra cuando encuentra la maximopalabra, palabra quq queria un poco mejor, un poco más optimizado,
            pero obviamente no cambia el funcionamiento es igual ,pero rrecorre menos veces y de forma más optimizada el for.
            Cada que encuentra una palabra, no comienza en el siguiente, si no comienza aca,
            después de la palabra encontrada al final en la frase.*/

        }
        System.out.println("Se encontro < " + cantidad3 + " > veces la palabra <° " + pamlabra4 +" °> en la frase");



    }
}
