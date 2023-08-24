public class TestSistemaInterno14 {
    public static void main(String[] args) {

        SistemaInterno12 sistema = new SistemaInterno12();
        Gerente2 geremte1 = new Gerente2();
        Administrador11 admin = new Administrador11();

        sistema.autentica(geremte1);
        sistema.autentica(admin);


    }
}
