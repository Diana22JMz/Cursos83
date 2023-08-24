/*While :
Es de iteeracion va a repetir un bloque de codigo mientras se cumpla una condicion, mientras sea true
* Cuando cambie esta variable a false automaticamente termina el lucro y siempre primero se evalua
* esta expresion y luego ejecuta este codigo la sentencia.
*Entonces el while es pre-prueba, por lo tanto primero evalua,por eso es pre-prueba o pre-evaluacion.
*****En analogia primero PIENSA/EVALUA y despues HABLA/EJECUTA


* A diferencia del do while priero ejecuta un codigo y despues   se evalua siempre el do while, al menos se ejecuta
una vez el bucle o este fragmento de codigo al menos se ejecuta una sola vez.
y el do while es post-evaluacion primero ejecuta y despues evalua
 *****En analogia primero habla y despues piensa
*/

public class SentenciaWhile {
    public static void main(String[] args){

        /*La idea es iterar usando un while mientras este mientras este contador i sea menor que un valor limite
        En este caso seria similar al for iterar conciendo limites, pero simpre se evalua
        Al principio se utiliza while la palabra clave  con los() y dentro la expresion
        Es muy parecido al for

        Entre usar un "FOR"  Y UN "WHILE"
        SIEMPRE SERA MEJOR USAR EL "FOR" ES MÁS RAPIDO SOBRE T0DO CUANDO QUEREMOS ITERAR LIMITES CON UN CONTADOR

        La idea de while es ejecutar algo, un bloque mientras se cumpla una condicion
        * */
        int i = 0;//Varaible iniciada en 0//Contador//SE INICIALIZA
        while(i <= 5){ // i menor que 5(de 0 a 4 (llega al 4))// i menor o igual que 5 ( 0 al 5 (llega/incluye al 5))
            // Evalua la condicion//Se evalua esta variable que sea menor que un limite y
            // luego de cada iteracion, despues de que se ejecuta el bloque incrementamos
            //Entonces el cual primero evalua una condicion por eso es primero prueba y luego ejecuta el codigo
            System.out.println("i es igual a : " + i);
            i++;//Lo importante es incremetar el contador//Incremento

        }

        //2do Ejemplo //Va llegar del 0 al 7 al llegar a 7 se va a detener, en total son 8 iteraciones
        i=0;//Contador inicializado en 0
        boolean prueba = true;
        while(prueba) {//Este while va ir iterando como un bucle hasta llegar a un false

            if( i == 7){
                prueba = false;
            }
            System.out.println("prueba = " + i);
            i++;  //Incrementar a i el contador

        }
        //3er Ejemplo con do while
        prueba = false;
        do{
            System.out.println("Se ejecuta al menos una vez");
        }while (prueba);//Es muy util cuando se quiere hacer alguna  implementacion o alguna tarea dentro del dub y
        //cambiar esta bandera, esta prueba a true para volver a iterar, es decir, cuandos e quiere hacer
        // algo al menos una vez pero segun una condicion podriamos volver a repetir este codigo, entonces si seria muy
        //util usar un do while, la difeencia es un post prueba primero ejecuta y después evalua a diferencia del while

        //4to ejemplo do while

        prueba = true;
        i = 0; //El contador tambien iniciara en 0

        do{//T0do esta en true, si se ejecuta sera como un bucle por eso se incluye un if para que lo detenga
            if(i == 10){ //Cuando llegue a 10 se va detenener
                prueba = false;//Entonces  va a cambiar a false cuando 10 y se sale automaticamente evalua que es falso
                // y sale seguira iterando
            }
            System.out.println("i = " + i);
            i++;

        }while(prueba);

    }
}
