//CLASE PADRE DE CuentaAhorros, CuentaCorriente
public abstract class Cuenta_POO_01 {//Cuenta-Entidad


       //Atributos
       protected double saldo;
       private int agencia;
       private int numero;
       private  Cliente_POO_05 titular = new Cliente_POO_05();
        /*Cambiamos  String titular; para referenciar (conectar) con  Cliente_poo_05
        Al ponerlo de esta fomra como tipo clase cliente con titular se conecta,
          utiliza los atributos  de esta misma y asi conectandose entre si
          cliente con titular. Se puede ver explicado de forma más explicita en testReferencia2
        */

        private static int total = 0;//Sera de la instancia no de la clase


    //Constructor


       public Cuenta_POO_01(int agencia, int numero){
           this.agencia = agencia;
           this.numero = numero;
           System.out.println("Estoy creado una cuenta: " + numero);

           Cuenta_POO_01.total ++;
       }
       /*
        public Cuenta_POO_01(int agencia){

            if(agencia <= 0){
                System.out.println("No se permite 0");
                this.agencia = 1;

            }
            else{
                this.agencia = agencia;
            }
            total++;
            System.out.println("Se van creando: "+ total + " cuentas");
        }
        */



        //METODOS

    // NO retorna valor
    //Metodo Abstracto
    public abstract void depositar (double valor);
   /*Como se volvio un metodo abstracto ya no necesita tener cuerpo  {
        //Esta cuenta        Esta cuenta
        //This account       This account
        //This object
         this.saldo = this.saldo += valor; //cuerpo
    }*/

    /*Los metodos abstractos pueden vivir SOLO en clases abtractas al ser implementadas
    como metodos abtractos no tendran cuerpo sera solo la firma.
      y para que sean utilizadas una vez abstractas
    *  se usara sobre-escritura para ser instanciadas
    * en otras clases y en en la clases hijas si tendran cuerpo . */


    //RETORNA valor
    public boolean retirar (double valor) {
        if (this.saldo >= valor){ //menor o igual
            this.saldo = this.saldo - valor;
            return true;
        }
        else {
            return false;
        }
    }


    //RETORNA valor
        public boolean transferir(double valor,
                                  Cuenta_POO_01 Cuenta_POO_01 ){

             if (this.saldo >= valor) {
                   this.retirar(valor);
                   Cuenta_POO_01.depositar(valor);
                   return true;

             } else{
                   return false;
             }

        }


        public double getSaldo(){
        return this.saldo;
        }


        /*
        public void setAgencia(int agencia){
             if(agencia > 0 ){
                 this.agencia = agencia;
             }else{
                 System.out.println("No estan permitidos los valores negativos");
             }
        }
        */


    public int getAgencia() {
        return this.agencia;
    }

    public void setTitular(Cliente_POO_05 titular) {
        this.titular = titular;
    }

    public Cliente_POO_05 getTitular() {
        return titular;
    }

    public static int getTotal(){
        return Cuenta_POO_01.total;
    }
}






/*
Cuenta - Objeto
:objetos cuenta era la representación de esta estructura de datos definida en nuestra clase cuenta.


intancia- primeraCuenta
: Es el objeto cuenta y cada uno de estos es una instancia de la cuenta. El objeto cuenta puede tener n instancias y cada una va a representar algo diferente.


* Ocupan el mismo esqueleto pero cada instancia sera diferente y aunque hagamos
*  cambios en una instancia  son idependientes de las otras instancias


<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
--void:  "Yo voy a ejecutar esto y no voy a retornar nada aquí afuera"

--this.: Palabra clave reservada de Java para hacer referencia a este objeto,
 adivina cuál es: el conocido this. This hace referencia a este objeto.
  Tú estás trabajando con este objeto de aquí, entonces aquí sería this.saldo.
  El uso de this es una práctica muy utilizada entre programadores Java.
  Sirve mucho para especificar a qué atributo tú estás haciendo referencia.
  Van a haber casos, van a haber situaciones en las cuales el nombre
  de tu variable sea igual al nombre de alguno de los campos, entonces el uso
  de this hace que tu código sea mucho más fácil de leer e interpretar.
*/
