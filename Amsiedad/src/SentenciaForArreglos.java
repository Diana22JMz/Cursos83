import javax.swing.*;

public class SentenciaForArreglos {
    public static void main(String[] args){
        /*Simpre para definir el arreglo sera de esta forma sin importar el tipo de dato,

          ASI IDENTIFICAMOS QUE ES UN ARREGLO                 tipo de dato[]
         ya sea un arreglo string, enteros primitivos, enteros de referencia o cualquiera  incluso puede ser
        de una clase propia creada por nosotros, con atributos, con metodo de igual forma se vera más adelante.
        */


        /*String[] nombres = new String[6];

        //Tipo de arreglo[] Nombre de la varible = nuevo Tipo de dato[total de elementos del arreglo]
        //El corchete tambien se puede poner asi String nombres [] = new String[6];
        //puede cambiar su posicion pero no se pueden poner dos si no sera error

        Otra forma de utilizar llaves en vez del operario y dentro de las llaves se agrega
        de forma indirecta explicita los elementos, si creamos con el new el objeto del arreglo el objeto, tenemos que
        agregar estos elementos utilizando el corchete y el indice */

        //Por el momento se pondra así el arreglo, tambien es valido
        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Beto", "Kiko", "Pato" };
        
        //Se usara un for
        //Inicia en el 0 por que el arreglo inicia desde el indice 0, con < nombres.length(se usa asi en caso que nuestr arreglo
        // crezca y ya no es necesario poner los numeros length(contara y dira el numero de elementos que contega) )
        // menor que la cantidad de elementos de nombre que contenga

        //i < count;  --- Mientras que i sea menor que count(lacantidad de elementos) va iterar
        //i <= count;   pero si se pone con el igual se a a icrementar, eso quiere decir que el arreglo
        // que parte originalmente del 0 s
        //entonces el elemnto que estaba en la posicion 7  se incrementa pasando a la 8
        //Dando como pregunta 8 es menor o igual que la cantidad de elemento que 8 ?
        // R= Si es igual,
        // por lo tanto va a entrar y va a tratar de ingresar al arreglo , al indice,
        // al elemento 8 pero el elemento 8 pero el elemento 8 como tal no existe,
        // porque el ultimo elemento el maximo es el 7
        //A pesar de que son 8 elementos , pero el maximo es el 7 porque PARTEN DEL 0, entonces va a lanzar un
        //ERROR de que el arreglo se desbordo no existe o no encuentra el elemento en la posicion 8 del indice

        //for(int i = 0; i <= count-1; i++)
        // Entonces si se desea y evitar ell error se utilizaria asi , donde seria -1 a la variable count , le resta 1
        //Asi quitando el limte de 8 y regresandolo a 7 y restando los valores que quitamos con el if
        //  mientras sea menor o igual al total menos uno, no habra ningun problema/error
        int count = nombres.length;
        //Se pone afuera como variable para estar optimizado y solo llamar la variable en el for, buena practica

        for(int i = 0; i < count; i++){

            //Se utlizara un if para omitir ciertos elementos del arreglo acompañado de la palabra continue
            /*
            -con el equal a secas sera necesario poner el caso ignarodo tal cual esta escrito dentro del arreglo

            if(nombres[i].equals("Andres") ||
            nombres[i].equals("Pato")){

            -pero con equalsignorecase podemos ignorar el caso y tambien ignora como esta escrito
             asi que no importa si lo escribimos en mayusculas o minusculas igual funciona

             if(nombres[i].equalsIgnoreCase("andres") ||
            nombres[i].equalsIgnoreCase("pato")){



             -Tambien funciona con la palabra "contains", esta significa contiene y en el arreglo seria como diciendo

             si (contiene.(estapalabra))

             Nota:En el caso de este arreglo se refierre a que la palabra que contenga es a la que va a ignorar

              if(nombres[i].contains("Andres") ||
            nombres[i].contains("Pato")){

            -Tambien se puede usar un toLowerCase que significa minusculas y aunque en el if escribamos con mayusculas
            y minusculas en nombre del arreglo con el toLowerCase lo va a comparar e igual va funcion para despues de
            comparar conituar con el nombre del arreglo e imprimirlo(seria como si lo convirtiera a minusculas)

             if(nombres[i].toLowerCase().contains("AnDres".toLowerCase()) ||
            nombres[i].toLowerCase().contains("Pato".toLowerCase())){

     -Si se cumple las condiciones dentro del if se seguira con la palabra continue la cual permite que despues
             de cumplirse la condicion continua iterando

              continue;

            if(arreglo[con for].igual ignoraelcaso("el caso que va a ignorar") or
            arreglo[con for].igual ignoraelcaso("el caso que va a ignorar")){

            continuar;
            }

            */
            if(nombres[i].toLowerCase().contains("AnDres".toLowerCase()) ||
            nombres[i].toLowerCase().contains("PatO".toLowerCase())){
                continue;
            }

            // System.out.println(nombres[i]);
            // Va a imprimir pero para tener acceso al arreglo se ponen los []
            // y lleva la i adentro por que asi va usando el for y va iniciando de cero e imcrementando,
            // pasando de andres0, pepe1, maria2 etc..

            System.out.println(i + ".-"+ nombres[i]);//Asi lo imprime con numeros del lugar que ocupan en el arreglo
        }

        //Esto es para BUSCAR UN NOMBRE con una ventana de dialogo
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\": ");
        //Para el mensaje que va a aparecer en la ventana de dialogo y queremos que la frase tambien aparezca con
        // comillas en alguna/s frase/s se debe usar dobles comillas se usa una combinacion de (\"bla\")
        // para que lo detecte bien, ya que sin esta combinacion (\"bla\") mostrara error
        System.out.println("Buscar nombre = " + buscar);


        boolean encontrado = false;//Nueva variable tipo boolean
        for(int i = 0; i < count; i++){// for normal con la variable anteriormente creada don i es menor que count
            if(nombres[i].equalsIgnoreCase(buscar)){//si(arreglo)[llama a for].igual ignoraelcaso
                // (yaseaen mayusculas o minusculas(la variable que nos va a pedir con una ventana de dialogo
                // de la cual va a buscar y sin importar como escribamos el nombre ya sea en mayusculas o minusculas
                // y lo va buscar )
                encontrado = true;//Si lo encuentra es igual a true
                break;//Con esto se va a detener, dejara de iterar despues de encontrar el nombre que buscamos, se sale del for

            }
        }

        if(encontrado){//Si lo encuentra mostrara lo siguiente
            JOptionPane.showMessageDialog(null, buscar + "\nFue encontrado!");

        }else{//Si no lo encuentra mostrara lo siguiente
            JOptionPane.showMessageDialog(null, buscar + " \nNo existe el nombre!");
        }

    }
}
