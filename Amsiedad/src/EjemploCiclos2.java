public class EjemploCiclos2 {
    public static void main(String[] args) {

        int contador = 0;
        int total = 0;


        while( contador <= 10){

            total = total + contador;
           System.out.println(total);
            //Si sout esta adentro mostrara todas las sumas

            contador ++;

        }

        System.out.println("Solo el valor el final de la suma: " + "\n" +total);
        //Si sout esta afuera
    }
}
