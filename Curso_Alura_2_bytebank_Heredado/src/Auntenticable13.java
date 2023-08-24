public interface Auntenticable13 {
    //Toda interface es Abstracta , se omite poner el abstract (public abstract interface )



    public void setClave(String clave);

    public boolean iniciarSesion(String clave);

   /*
   **Como ahora es una interface entonces los metodo se vuelven abstractos y por buena
   * practica ya no se pone el "abstract" pero se elimina el cuerpo que tenian los metodos
   *
   *
   *  public void setClave(String clave){
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave){
        return clave == "AluraCursosOnLine";
    }
    *
    *
    ** Tambien como no hay metodos privados se quita el atributo:
    *
    * private String clave;
    *
    *
    *
    *
    *
   **Este se quito porque la sobre escitura que estaba
   * por el extend, pero ahora  ya no se extiende con funcionario
   * y ahora es interface porn lo cual si se deja seria detectado como error:
   *
   *
   @Override
    public double getBonificacion() {
        return 0;


    }*/
}
