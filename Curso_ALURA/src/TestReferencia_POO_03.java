public class TestReferencia_POO_03 {

    public static void main (String[] args){
        //        Variable        \\      Valor
        Cuenta_POO_01 primeraCuenta = new Cuenta_POO_01(90);
        primeraCuenta.depositar(200);

        Cuenta_POO_01 segundaCuenta = primeraCuenta;
        segundaCuenta.depositar(100);

        System.out.println("Saldo primera cuenta: " + primeraCuenta.getSaldo());

        System.out.println("Saldo segunda cuenta: " + segundaCuenta.getSaldo());

        segundaCuenta.depositar( 400);

        System.out.println("Saldo primera cuenta: " + primeraCuenta.getSaldo());

        /*
        ¿Son objetos iguales ?
        R=Si porque hacen referencia entre si,
         creando una misma instancia a lo cual ocupan el mismo espacio de memoria.
         Aparte de que solo hace que crea una nueva instancia pero a apesar de que
         el valor es difefrente  se llaman entre creando una sola.
         */

        System.out.println("\nUbicación PRIMERA cuenta: " + primeraCuenta);
        System.out.println("Ubicación SEGUNDA cuenta: " + segundaCuenta);

        if( primeraCuenta == segundaCuenta){
            System.out.println("Son iguales !!" +
                    "Ocupan el MISMO espacio en la memoria");
        }




    }
}
