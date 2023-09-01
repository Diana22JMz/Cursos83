//CLASE HIJA DE CUENTA_POO_01

public class CuentaCorriente8 extends Cuenta_POO_01 {

    public CuentaCorriente8(int agencia, int numero){
        super(agencia, numero);
    }


    /*Super: Lo que hace es llamar a este constructor que usa estos dos parametros
* los mismo que se tiene en cuenta */

    @Override
    public void retirar(double valor) throws SaldoInsuficienteException_15{
        double comision = 0.2;
        super.retirar(valor + comision);/*Asi ya puede llamar al metodo
         de la clase padre y ejecutar de forma normal y en la clase padre al ser llamado va
        a efectuar el metodo con la excepcion en caso de que no tenga saldo y va a dar la
        excepcion.

        *****Como es void no retorna un valor y al dejarlo asi ejecuta de forma normal
        */
    }
    /*USAMOS LOS "try y catch" EN TRANSFERIR Y RETIRAR POR QUE COMO AHORA EXTENDIMOS
    * LA CLASE A "Exception" , ESTO NOS OBLIGA A TRATAR A LAS BOMBAS TAMBIEN SE AGREGO
    * LA FIRMA DE THROWS : "throws SaldoInsuficienteException_15"
    *
    * */
    /*Se modifica  es sobre escritura ,
     y porque modificamos para excepcion en la clase padre en el metodo "retirar"

            @Override
    public boolean retirar(double valor) {
        double comision = 0.2;
        return super.retirar(valor + comision);

        */


    @Override
    public void depositar(double valor) {//Metodo instanciado de una clase abstracta
        this.saldo = this.saldo += valor;

    }

}
