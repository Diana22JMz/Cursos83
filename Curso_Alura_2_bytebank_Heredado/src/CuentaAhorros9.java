//CLASE HIJA DE CUENTA_POO_01

public class CuentaAhorros9 extends Cuenta_POO_01{

    public CuentaAhorros9(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void depositar(double valor) {//Metodo instanciado de una clase abstracta
        this.saldo = this.saldo += valor;
    }
 /*Como aquí se implementa el metodo abtracto y se trata de una clase hija
 * se agrega el cuerpo.
 *
 * * * *NOTA EXTRA: Como esta en this.saldo  nos da error por que aqui no tenemos
 * el atributo .
 * El atributo solo se encuentra en la clase padre pero esta como "private no se puede
 * acceder entonces para solucionar el error  se realizara el cambio por
 * "protected" ya que asi sera solomante accesible por la clases
 * hijas de la clase padre , siendo de esta forma solucionado el error   */

}
