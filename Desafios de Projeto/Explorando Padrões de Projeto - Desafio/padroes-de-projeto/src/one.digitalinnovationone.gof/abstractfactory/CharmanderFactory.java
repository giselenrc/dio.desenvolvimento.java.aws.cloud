package one.digitalinnovationone.gof.abstractfactory;

public class CharmanderFactory implements PokemonFactory{
     public void evoluiPokemon(){
          System.out.println("Evoluiu para Charmeleon.");
     }
     public void executaPoder(){
          System.out.println("Poder Solar.");
     }
}