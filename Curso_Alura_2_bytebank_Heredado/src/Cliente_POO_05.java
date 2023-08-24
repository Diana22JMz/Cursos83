public class Cliente_POO_05 implements Auntenticable13{

    private String nombre;
    private String documento;
    private String telefono;


    private AutenticacionUtil15 util;

    public Cliente_POO_05(){
        this.util = new AutenticacionUtil15();

    }



    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }



    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


   @Override
    public boolean iniciarSesion(String clave){
       return this.util.iniciarSesion(clave);
       // return this.clave == clave; ESTO es Igual a =>
      /* => ESTO
        if (this.clave == clave){
            return true;
        }

        return false;
        */
    }

    @Override
    public void setClave(String clave) {
        this.setClave(clave);

    }

}
