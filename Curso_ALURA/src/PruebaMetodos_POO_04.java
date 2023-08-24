public class PruebaMetodos_POO_04 {

    public static void main (String[] args){

        Cuenta_POO_01 miKiwiCuenta = new Cuenta_POO_01(100);
        miKiwiCuenta.depositar(300);

        miKiwiCuenta.depositar(200);
        System.out.println("\nMiKiwiCuenta"+"(C/Deposito)El saldo es: "+ miKiwiCuenta.getSaldo());

        miKiwiCuenta.retirar(100);
        System.out.println("MiKiwiCuenta"+"(C/Retiro)El saldo es: "+ miKiwiCuenta.getSaldo());

        //Cuenta pero con el metodo transferir

        Cuenta_POO_01 cuentaDeMerlina = new Cuenta_POO_01(200);
        cuentaDeMerlina.depositar(1000);
        boolean puedeTransferir = cuentaDeMerlina.transferir(400, miKiwiCuenta);

        if(puedeTransferir){
            System.out.println("\nTransferencia exitosa :3");
        }else{
            System.out.println("No es posible :'(");
        }

        System.out.println("Saldo de cuentaMerlina: "+cuentaDeMerlina.getSaldo());
        System.out.println("Saldo de cuenta miKiwi: "+miKiwiCuenta.getSaldo());

    }
}
