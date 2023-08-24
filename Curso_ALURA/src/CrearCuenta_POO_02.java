public class CrearCuenta_POO_02 {
    public static void main (String[] args){

        Cuenta_POO_01 primeraCuenta = new Cuenta_POO_01(3);
        primeraCuenta.depositar(1000);
        System.out.println(primeraCuenta.getSaldo());

        Cuenta_POO_01 segundaCuenta = new Cuenta_POO_01(4);
        segundaCuenta.depositar(1000);
        System.out.println(segundaCuenta.getSaldo());
      //  System.out.println(primeraCuenta.agencia);


        /*
        * ¿Son iguales ?
        * R= No, Porque las cuentas fueron creadas con new a lo cual son nuevas y
        * ocupan diferentes espacios en la memoria, asi que son diferentes estancias.
        * Siendo diferentes estancias ocupan espacios diferentes en la memoria.
        *
        * Pero si les ponemos el mismo valor
        * a las dos cuentas/instancias y  preguntamos si son iguales,
        * R=Si, seran iguales por que no las comparamos por instancias si no por el valor.
        * */

        System.out.println("\nUbicacion en la memoria " + "PRIMERA cuenta: "
                + primeraCuenta);

        System.out.println("Ubicacion en la memoria " + "SEGUNDA cuenta: "
                + segundaCuenta);



        if( primeraCuenta == segundaCuenta){
            System.out.println("\nSon IGUALES !!! Tienen la MISMA ubicación");
        }
        else{
            System.out.println("Tienen DIFERENTE ubicación");
        }




        if(primeraCuenta.getSaldo()== segundaCuenta.getSaldo()){
            System.out.println("\nTienen el mismo Valor");
        }
        else{
            System.out.println("\nEl valor es diferente");
        }



    }
}
