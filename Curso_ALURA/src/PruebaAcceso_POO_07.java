public class PruebaAcceso_POO_07 {
    public static void main (String[] args){
        Cuenta_POO_01 cuentash = new Cuenta_POO_01(10);
       // cuentash.setAgencia(-22); //Se elimino el metodo set y solo quedo el getagencia
         cuentash.depositar(400);
        cuentash.retirar(300);

        System.out.println(cuentash.getSaldo());
        System.out.println(cuentash.getAgencia());

    }
}
