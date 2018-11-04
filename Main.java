import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Random rand = new Random();

    public static void main(String[] args) {
        System.out.printf("The following intelligence values yield the desired success probablity.\n\n");
        for (int intelligence = 10; intelligence <= 30; intelligence++) {
            if (simulator(intelligence) >= 600000 && simulator(intelligence) <= 700000){
                System.out.printf("Intelligence: %d\n", intelligence);
            }
        }
    }

    public static int simulator(int intelligence) {
        int successfulRuns = 0;
        for (int i = 0; i < 1000000; i++) { //1,000,000 simulations per intelligence value
            double orcHealth = 1000;

            for (int j = 0; j < 10; j++) { //10 randomized attacks per simulation
                double damage = intelligence * 5 * (rand.nextDouble() + 0.5);
                orcHealth -= damage;
            }

            if (orcHealth <= 0) {
                successfulRuns++;
            }
        }
        return successfulRuns;
    }
}



/*Scanner sc = new Scanner(System.in);

        int intelligence = 10; //preset for probability purposes

        //System.out.print("Desired Intelligence (enter desired difference between intelligence and 11): ");
        //int intelligenceRand = sc.nextInt();


        int utility = 20 - intelligenceRand;
        int strengthRand = rand.nextInt(utility);
        utility -= strengthRand;
        int dexterityRand = utility;
        int intelligence = 10 + intelligenceRand;
        int strength = 10 + strengthRand;
        int dexterity = 10 + dexterityRand;

        System.out.printf("Strength: %d\nDexterity: %d\nIntelligence: %d\n", strength, dexterity, intelligence);  */
