public class SaldoInsuficienteException_15 extends Exception{
    /*La clase se crea para lanzar una exception y se extiende como hija de la clase padre
    RuntimeException


    +Pero al extenderse solo a excepcion nos obligara a tener que tratar ala bomba.
     Recordemos que ahora sera checked*/


    public SaldoInsuficienteException_15(String mensaje){
        super(mensaje);
    }
    /* Aquí se pueden llamar a los constructores de la clase padre,
   * para el caso de aquí se va a llamar al contructor que envie un mensaje
   *
   * -Se declara el contructor de "SaldoInsuficienteException" y cada vez que
   * se lanze esta excepcion va a enviar un mensaje y él mediante el constructor
   * de la clase padre que es RuntimeExceptin, él va a setear ese mensaje. */
}
