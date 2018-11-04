import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random(); Scanner sc = new Scanner(System.in);

        int intelligenceRand = 10; //preset for probability purposes

        //System.out.print("Desired Intelligence (enter desired difference between intelligence and 11): ");
        //int intelligenceRand = sc.nextInt();


        int utility = 17 - intelligenceRand;
        int strengthRand = rand.nextInt(utility);
        utility -= strengthRand;
        int dexterityRand = utility;
        int intelligence = 11 + intelligenceRand;
        int strength = 11 + strengthRand;
        int dexterity = 11 + dexterityRand;

        System.out.printf("Strength: %d\nDexterity: %d\nIntelligence: %d\n", strength, dexterity, intelligence);

        double orcHealth = 1000;

        for(int i = 0; i < 10; i++) {
            double damage = intelligence * 5 * (rand.nextDouble() + 0.5);
            orcHealth -= damage;
        }

        System.out.printf("\nFinal Orc HP: %2f ", orcHealth);

    }
}
