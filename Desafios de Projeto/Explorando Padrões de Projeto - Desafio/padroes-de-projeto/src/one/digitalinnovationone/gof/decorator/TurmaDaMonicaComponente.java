package one.digitalinnovationone.gof.decorator;

public abstract class TurmaDaMonicaComponente implements TurmaDaMonica {
    @Override
    public void correr() {
        System.out.println("Correndo.");
    }

    @Override
    public void brincar() {
        System.out.println("Brincando.");
    }

    @Override
    public void estudar() {
        System.out.println("Estudando.");
    }

    public void tomarBanho(){
        System.out.println("Tomando Banho.");
    }

}
