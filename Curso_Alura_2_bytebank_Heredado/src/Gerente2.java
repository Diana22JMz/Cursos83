//                    extiende de
public class Gerente2  extends Funcionario0 implements Auntenticable13{

    /*
    Se quito por que ahora no pertenece a Funcionario0
    pero ahora se extiende a la clase de FA13
    private String clave;

    public void setClave(String clave){
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave){
        return clave == "AluraCursosOnLine";
    }

    */

    //Sobre-Escritura de metodo
    public double getBonificacion(){
        System.out.println("Ejecutando desde Garente: ");
        return 2000;
                // iba con return pero se limino por el cambio de extension de clase super.getSalario() + this.getSalario() * 0.05;
       // super.getBonificacion();
    }
    /*SUPER:Palabra resevada Con super nosotros tenemos acceso a los
        métodos de la clase padre.*/



    @Override
    public void setClave(String clave) {

    }

    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }

}
