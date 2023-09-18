import one.digitalinnovationone.gof.abstractfactory.CharmanderFactory;
import one.digitalinnovationone.gof.abstractfactory.PikachuFactory;

public class Main {
     public static void main(String[] args) {

        CharmanderFactory facotryCharmander = new CharmanderFactory();
        PikachuFactory factoryPikachu = new PikachuFactory();

        System.out.println("Exemplo chamada implementação padrão Abstract Factory");
        factoryPikachu.executaPoder();
        factoryPikachu.evoluiPokemon();
        System.out.println("");
        facotryCharmander.executaPoder();
        facotryCharmander.evoluiPokemon();

    }
}