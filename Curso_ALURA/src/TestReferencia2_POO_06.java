public class TestReferencia2_POO_06 {
     public static void main(String[] args){

         Cliente_POO_05 cheemo = new Cliente_POO_05();
         cheemo.setNombre("Cheemo");
         cheemo.setDocumento("45444332");
         cheemo.setTelefono("999922222");

         Cuenta_POO_01 cuentaDeCheemo = new Cuenta_POO_01(8);
        // cuentaDeCheemo.setAgencia(1);//Se elimino al metodo get
         cuentaDeCheemo.setTitular(cheemo);

         System.out.println(cuentaDeCheemo.getTitular().getDocumento());
         System.out.println(cuentaDeCheemo.getTitular());//Imprime el espacio que ocupa en la memoria
         System.out.println(cheemo);//Tambien imprime el espacio  en memoria


     }
}
