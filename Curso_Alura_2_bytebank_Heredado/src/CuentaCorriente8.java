//CLASE HIJA DE CUENTA_POO_01

public class CuentaCorriente8 extends Cuenta_POO_01 {

    public CuentaCorriente8(int agencia, int numero){
        super(agencia, numero);
    }


    /*Super: Lo que hace es llamar a este constructor que usa estos dos parametros
* los mismo que se tiene en cuenta */

    @Override
    public boolean retirar(double valor) {
        double comision = 0.2;
        return super.retirar(valor + comision);
    }

    @Override
    public void depositar(double valor) {//Metodo instanciado de una clase abstracta
        this.saldo = this.saldo += valor;

    }

}
