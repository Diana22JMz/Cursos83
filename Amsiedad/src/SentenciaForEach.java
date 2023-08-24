public class SentenciaForEach {
    public static void main(String[] args){
        //ForEach : Es exclusivo solo para arreglos

        //Se define el arreglo 1ro que sera de tipo primitvos con num. impares
        int[] numerosimp = {1, 3, 5, 7, 9, 11, 13, 15};

        /*Se va iterar sobre el arreglo, es similar al for pero la estructura interna cambia
        Solomente se recorre el arreglo elemento por elemento
        Entonces cuando comienza parte del primer elemento 1 y lo asigna a "num" esta variable local del tipo integer
        porque el arreglo del tipo entero lo asigna y hace cualquier tarea. En este caso solamente vamos a imprimir
        luego de esta forma automatica mueve el curso en este for y se posiciona en el siguiente elemento y el siguiente
         elemento se guarda en esta variable en el local de for(num) y se empieza a recorrer cada elemento se guarda y
         se pasa en cada iteracion a esta variable(num) y se hace algo con este valor */
        for( int num: numerosimp){
            System.out.println("num = " + num);
            
            
            //2do Ejemplo con un arreglo de tipo STRING
            String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Beto", "Kiko", "Pato" };
            for(String nommbre : nombres){
                System.out.println("nommbre = " + nommbre);
            }
        }
    }
}
