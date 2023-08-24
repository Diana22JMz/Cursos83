public class TestCuenta10 {
    public static void main(String[] args){
        CuentaCorriente8 cuco = new CuentaCorriente8(1, 1);
        CuentaAhorros9 cuack = new CuentaAhorros9(2, 3);
        cuco.depositar(2000);
        cuco.transferir(1000, cuack);

        System.out.println("cuco: "+ cuco.getSaldo());
        System.out.println("cuack: "+ cuack.getSaldo());

    }
}
