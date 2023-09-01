public class TestCuentaExceptionSaldo_16 {
    public static void main(String[] args) {

        CuentaAhorros9 cuenta1 = new CuentaAhorros9(456, 789);
        cuenta1.depositar(550);
        try {
            cuenta1.retirar(600);
        } catch (SaldoInsuficienteException_15 e) {
            throw new RuntimeException(e);
        }

        /*Aquí no agregamos la firma de throws por que estaria en el metodo main y
        eso ya es una mala practica, por que si el metodo main lanza eso throws saldoexception
         quien va a tratar esa excepcion nuestra aplicacion simplemente va a morir en el acto,
         si esa excepcion fuera tratada.


         Para eso se va a tratar con un "try y catch" recordemos que lo que quede abajo del
         "try catch" lo va a marcar como error por que su alcanze llega hasta donde este ese bloque
         y donde acaben las llaves del try catch .
          Para que este a su control se debran de tratr las lineas dentro del try para ser trataadas y ejecute
           de forma normal.
           Es como un paraguas . lo que este dentro de su contexto estara protegido , pero
           lo que no alcanze esta fuera de su control y manejo.

          ** Recordemos que se esta haciendo el tratamiento de la excepcion.




         */


    }

}
