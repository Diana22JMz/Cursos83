public class TestControlBonificacion6 {
    public static void main(String[] args){
        Funcionario0 joonHyung = new Contador7();
        joonHyung.setSalario(2000);

        Contador7 jongSuk= new Contador7();
        jongSuk.setSalario(5000);

        Gerente2 bokJoo = new Gerente2();
        bokJoo.setSalario(10000);


        ControlBonificacion5 controlBonificacion = new ControlBonificacion5();

        controlBonificacion.registrarSalario(joonHyung);
        controlBonificacion.registrarSalario(bokJoo);
        controlBonificacion.registrarSalario(jongSuk);


    }
}
