public class Administrador11 extends Funcionario0 implements Auntenticable13 {

    /*
    private String clave;

    public void setClave(String clave){
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave){
        return clave == "AluraCursosOnLine";
    }

    //Como ya se extiende a otra clase se borra esto , porque esto es de funcionario0


*/

  private AutenticacionUtil15 util;

  public Administrador11(){
      this.util = new AutenticacionUtil15();
  }
   @Override
    public double getBonificacion() {
        return this.getSalario();
    }

    @Override
    public void setClave(String clave) {
       this.util.setClave(clave);

    }

    @Override
    public boolean iniciarSesion(String clave) {
       return this.util.iniciarSesion(clave);

       /*
       * Como las lineas de codigo son iguales en setClave e iniciarSesion de Cliente
       * y Administrador,Es un antipatron que aunque ahorita no cause
       * problema no se desea repetir y el codigo se quiere reutilizar en lo más posible
       * y no es bueno repetir el codigo entre metodos.
       *
       *  Se crea una nueva clase, que va a ser una clase UTIL.Por clase util se refiere a
       *  utilitario, digamos metodos que no le pertenecen a ninguna clase pero que tienen
       * cierta funcionalidad  pues para ayudar a ahorrar codigo y no repetir el codigo
       *  por ejemplo :
       *
       * Un utlitario puede ser : Obtener la fecha actual
       * Si tú necesitas obtener la fecha actual en múltiples partes de tu sistema,
       *  entonces tú no amarras el método de obtener fecha actual a un objeto.
       * Lo amarras a una clase útil. ¿Por qué? Porque el útil va a estar disponible
       *  para todos, es como un utilitario, es como una caja de herramientas.
       * Entonces, al ser una caja de herramientas común, cada uno agarra la
       * herramienta que necesite. */


    }
}
