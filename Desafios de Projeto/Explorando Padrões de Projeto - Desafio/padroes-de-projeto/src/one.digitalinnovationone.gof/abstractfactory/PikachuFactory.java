package one.digitalinnovationone.gof.abstractfactory;
public class PikachuFactory implements PokemonFactory{
    public void evoluiPokemon(){
        System.out.println("Evoluiu para Raichu.");
    }
    public void executaPoder(){
        System.out.println("Raio do trovão.");
    }
}