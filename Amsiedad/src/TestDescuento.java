public class TestDescuento {
    public static void main(String[] args){

        double valordCompra = 295.00;

        double monto1 = 100.00;
        double descuento = 0.0;
        double monto2 = 200.00;

        System.out.println("El valor de tu compra es: "+ valordCompra);



         if(valordCompra < monto1){
            System.out.println("El valor de su compra no tiene descuento");
        }

        //1er if <menor que , >mayor que
        else if(valordCompra == monto1 || valordCompra <= 199.00 ){
            System.out.println("Tiene un descuento del 10%");
            descuento = 10.0;
        }


        //2do if
         else if(valordCompra == monto2 || valordCompra <= 299.99){
            System.out.println("Tiene un descuento del 15%");
             descuento = 15.0;
        }


        //3er if
         else if(valordCompra >= 300.00){
            System.out.println("Tiene un descuento del 20%");
             descuento = 20.0;
        }

         else{
            System.out.println("No hubo compra o error");
        }


        double valorFinal = valordCompra -(valordCompra * (descuento / 100));
        System.out.println("El valor final de la compra es : "+valorFinal);

    }
}
