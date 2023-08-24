public class ControlBonificacion5 {

    private double suma;

    public double registrarSalario(Funcionario0 funcionario){

        this.suma = funcionario.getBonificacion() + this.suma;
        System.out.println("Calculo actual : " + this.suma);
        return this.suma;

    }

   /*
   * Se puede seguir  sobreescribiendo el mismo metodo varias veces y cambiar el parametro por ej.
   * de funcionario a gerente, contador y seguira compilando pero para OPTIMIZAR EL CODIGO se puede dejar solo
   * el metodo con funcionario y compila de la misma forma.
   *
   * Esto pasa debido a que las clases gerente, contador(Clases Hijas) se extienden a la clase funcionario(Clase Padre) y asi
   * seguir usando el metodo de bonificación .

   * * * *¨*  * * * *¨*  * * * *¨*  * * * *¨*  * * * *¨*  * * * *¨*  * * * *¨*  * * * *¨*  * * * *¨*  * * * *¨*  * * * *¨*

    public double registrarSalario(Gerente2 gerente){

        this.suma = gerente.getBonificacion() + this.suma;
        System.out.println("Calculo actual (G): " + this.suma);
        return this.suma;

    }


    public double registrarSalario(Contador7 contador){

        this.suma = contador.getBonificacion() + this.suma;
        System.out.println("Calculo actual (G): " + this.suma);
        return this.suma;

    }
*/


}
