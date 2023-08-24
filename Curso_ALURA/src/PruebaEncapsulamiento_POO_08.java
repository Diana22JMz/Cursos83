import java.sql.SQLOutput;

public class PruebaEncapsulamiento_POO_08 {
    public static void main(String[] args){

        Cuenta_POO_01 cuention = new Cuenta_POO_01(600);
        Cliente_POO_05 cliemnte = new Cliente_POO_05();

        cliemnte.setNombre("Sol");
        cliemnte.setDocumento("fdfd343434");

        cuention.setTitular(cliemnte);

        System.out.println(cliemnte.getNombre());
        System.out.println(cuention.getTitular().getNombre());
        System.out.println(cuention.getTitular());


    }
}
