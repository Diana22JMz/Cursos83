public class TestGerente3 {
    public static void main(String[] args){

        Gerente2 geremte = new Gerente2();
       // geremte.setSalario(5000);

        Funcionario0 geremnte = new Contador7();
        geremte.setSalario(6000);

        geremte.setClave("AluraCursosOnLine");
        geremte.setTipo(1);


        System.out.println(geremte.getBonificacion());
        System.out.println(geremte.iniciarSesion("AluraCursosOnLine"));

    }
}
