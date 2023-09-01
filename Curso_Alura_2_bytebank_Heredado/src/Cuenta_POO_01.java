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

    public Cuenta_POO_01(){//Construstor que pusimos por defecto

    }



       public Cuenta_POO_01(int agencia, int numero){//Constructor con parametros
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
    public void retirar (double valor) throws SaldoInsuficienteException_15{
                                        //Con exception para tratar a la bomba
        /*Al incluir excepciones se agrega esto metodo.
       Primero se define el metodo que se va a autilizar aquí , esto es
        por que "retirar" era un boleano que nos decia si se podía retirar o no
        ,pero también podría ser que "retirar" sea un void que nos diga genial
        'si retiraste tu efectivo' o si no logras retirar el efectivo te diga
         'por que no lo retiraste con una excepcion o un error'

       *De esta forma es como se consiguio tener un control de  de errores a través
       *de las excepciones.
        *¿Por qué lo puse aquí arriba y no aquí abajo? Porque generalmente
        una buena práctica es t0do lo que sea control de errores, validaciones,
        va al inicio del método.


        **** Entonces, antes de yo efectuar cualquier operación, yo tengo que
        validar que los parámetros que yo tengo actualmente sean válidos.
        Tengo que verificar en este caso que tengo el saldo suficiente para
         retirar el dinero que yo estoy especificando en valor. Y bueno, con
         esto tendríamos, pues ya terminado terminado este refactor.
         Refactor es la reconstrucción del código para mejorarlo.

         <se pueden agregar más excepciones o mejor dicho reglas de negocios>


         //Esto es cuando se extiende en runtimeException no es necesario agregar
         la firma de throws con saldo insuficiente, pero con exception si es necesario para tratatar a la bomba.



      Añadir la declaración throws SaldoInsuficienteException, entonces yo aquí estoy
      alertando, este método saca lanza esta bomba.
     El método saca va a lanzar la bomba , del tipo SaldoInsuficienteException
     entonces quienquiera que llame a este método, prepárate porque vas a recibir una bomba
      del tipo SaldoInsuficienteException. ¿Y quién fue el primer afectado? Transfiere.

 ¿Por qué? Porque transfiere llama al método saca.
 Y ya vimos, diversas formas en las que yo puedo atrapar este error.
  Puede ser simplemente diciendo: "por si acaso, este método también va a lanzar
  un SaldoInsuficienteException". Y paso el problema para un nivel más arriba.
  O si no quiero hacer eso, lo que puedo hacer es simplemente un try/catch.

 Y quedaría así, simplemente yo no necesito avisarle al método que me va a llamar, que va
  a recibir una bomba del tipo de SaldoInsuficienteException, porque yo ya estoy atrapando
   esa bomba aquí y esa bomba ya no va a subir más en la pila de ejecución, sino
   simplemente va a quedar ahí.
         */


        if(this.saldo < valor){ //>=: igual o mayor. Pero estamos preguntado si el tiene menos del saldo que quiere retirar
            throw new SaldoInsuficienteException_15("No tienes saldo xc"); //Si la condicion es verdadera se va a lanzar la excepcion con el siguiente mensaje
        }

        this.saldo -= valor;

    }
        /*
        Se elimino esta parte por que se va a implementar excepciones
       y para eso se va a comenzar a definir un metodo, tambien se elimino
       (boolean retirar) a cambio se coloco (void retirar).

        if (this.saldo >= valor){ //menor o igual
            this.saldo = this.saldo - valor;
            return true;
        } //Else if (cuenta bloqueada)
        else {
            return false;
        }
        */



    //RETORNA valor
        public boolean transferir(double valor,
                                  Cuenta_POO_01 Cuenta_POO_01 ){

             if (this.saldo >= valor) {
                 try {
                     this.retirar(valor);
                 } catch (SaldoInsuficienteException_15 e) {
                     e.printStackTrace();
                 }
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
