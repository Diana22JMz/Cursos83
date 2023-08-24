public class SistemaInterno12 {

    private String clave = "AluraCursosOnLine";

    public boolean autentica(Auntenticable13 gerente){
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
        if(puedeIniciarSesion){
            System.out.println("Login exitoso");
            return true;
        } else{
            System.out.println("Error Login");
            return false;

        }
    }
}
