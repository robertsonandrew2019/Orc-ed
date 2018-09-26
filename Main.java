import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        //System.out.print("Desired Intelligence (enter desired difference between intelligence and 11): ");
        //int intelligenceRand = sc.nextInt();

        int intelligenceRand = 10;

        //attribute randomizer below

        int utility = 17 - intelligenceRand;
        int strengthRand = rand.nextInt(utility);
        utility = utility - strengthRand;
        int dexterityRand = utility;
        int intelligence = 11 + intelligenceRand;
        int strength = 11 + strengthRand;
        int dexterity = 11 + dexterityRand;

        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Intelligence: " + intelligence);

        double orcHP = 1000;

        double damage = intelligence * 5 * (rand.nextDouble()+0.5);
        orcHP = orcHP - damage;

        damage = intelligence * 5 * (rand.nextDouble()+0.5);
        orcHP = orcHP - damage;

        damage = intelligence * 5 * (rand.nextDouble()+0.5);
        orcHP = orcHP - damage;

        damage = intelligence * 5 * (rand.nextDouble()+0.5);
        orcHP = orcHP - damage;

        damage = intelligence * 5 * (rand.nextDouble()+0.5);
        orcHP = orcHP - damage;

        damage = intelligence * 5 * (rand.nextDouble()+0.5);
        orcHP = orcHP - damage;

        damage = intelligence * 5 * (rand.nextDouble()+0.5);
        orcHP = orcHP - damage;

        damage = intelligence * 5 * (rand.nextDouble()+0.5);
        orcHP = orcHP - damage;

        damage = intelligence * 5 * (rand.nextDouble()+0.5);
        orcHP = orcHP - damage;

        damage = intelligence * 5 * (rand.nextDouble()+0.5);
        orcHP = orcHP - damage;

        System.out.println();
        System.out.println("Final orc HP: " + orcHP);





    }
}
