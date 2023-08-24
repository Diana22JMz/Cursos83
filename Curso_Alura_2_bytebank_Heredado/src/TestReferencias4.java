//POLIMORFISMO
public class TestReferencias4 {
    public static void main(String[] args){

        //Elemento mas generico puede ser adaptado
                               // al elemnto más  especifico
        Funcionario0 funcionario = new Gerente2();
        funcionario.setNombre("Esteman");

        Gerente2 gerente = new Gerente2();
        gerente.setNombre("RLeona");

        funcionario.setSalario(2000);
        gerente.setSalario(10000);

        gerente.iniciarSesion("_Disco_");

        /*
        * ¿Cuál es el elemento más genérico? Funcionario.
        * ¿Por qué? Porque es de él de quien están extendiendo.
        *
        * ¿Y quién es el más específico? Gerente.
        *
        * Recordemos que las clases HIJAS pueden heredar los metodos de la clase PADRE
        * ,pero la clase padre no puede heredar los metodos de la clase hija */





    }
}
