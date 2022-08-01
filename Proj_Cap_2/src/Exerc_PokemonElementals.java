import java.util.Scanner;

public class Exerc_PokemonElementals {
    public static void main(String[] args) {
        //Variables
        String pokeType;

        //Getting data
        Scanner getData = new Scanner(System.in);
        pokeType = getData.nextLine();

        //Printing data
        switch (pokeType){
            case "Fogo":
                System.out.printf("Pokemon tipo: %s. Fraqueza: Agua", pokeType);
                break;

            case "Agua":
                System.out.printf("Pokemon tipo: %s. Fraqueza: Eletrico", pokeType);
                break;

            case "Eletrico":
                System.out.printf("Pokemon tipo: %s. Fraqueza: Pedra", pokeType);
                break;

            case "Pedra":
                System.out.printf("Pokemon tipo: %s. Fraqueza: Gelo", pokeType);
                break;

            case "Gelo":
                System.out.printf("Pokemon tipo: %s. Fraqueza: Fogo", pokeType);
                break;

            case "Planta":
                System.out.printf("Pokemon tipo: %s. Fraqueza: Fogo", pokeType);
                break;

            default:
                System.out.println("Insira um valor valido.");
        }
    }
}
