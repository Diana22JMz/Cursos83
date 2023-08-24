//CLASE PADRE de las demas clases xD
public abstract class Funcionario0 {
    /*Como ahora funcionario se vuelve una clase abstracta y para ser referenciado
    * se nmcesita d eun objeto fisico o real pero como lo volvimos un objeto abstracto
    * ya no lo reconoce cuando creamos new lo hemos de cambiar por contador.
    *
    *  Contador se extiende hasta funcionario y asi nos permite usarlo como referencia
    * y eliminando los errores y sigue compilando de forma normal
    * */

    //ATRIBUTOS

    private String nombre;
    private String documento;
    private double salario;
    private  int tipo;

    //CONSTRUCTOR
    public Funcionario0(){

    }


    //GETTER Y SETTER


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //°°°°°°°°°°°°°°

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    //°°°°°°°°°°°°°°

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double getBonificacion();
   /*
    Ya no ocupa retorna nada por que ahora e sun metodo abstracto
    y ahora este metodo sera instanciado a partir de las clases hijas
    {
        return this.salario * 0.05;
        //Si tipo = 1 es gerente
        //Si tipo = 0 es funcionario
        //Se limpia el codigo por que usamos super (Se tenia que eliminar pero yo lo quise solo comentar)
        if(this.tipo == 0) {
            return this.salario * 0.10;
       }
        else if(this.tipo == 1){
            return this.salario;
        }
        else{
            return 0;
        }
    }*/

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }


}
