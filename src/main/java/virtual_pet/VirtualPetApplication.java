package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method
        introduction();
        instructions();

        VirtualPet guineaBelle = new VirtualPet(0, 0, 0, 0);

        while (guineaBelle.getAlive()) {
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            if (userInput == 1) {
                guineaBelle.feedMe();
            } else if (userInput == 2) {
                guineaBelle.giveMeWater();
            } else if (userInput == 3) {
                guineaBelle.bathroomBreak();
            } else if (userInput == 4) {
                guineaBelle.playWithMe();
            } else if (userInput == 5) {
                System.out.println("My needs are growing...");
            } else if (userInput == 6) {
                System.out.println("Thank you for playing!");
                System.exit(0);
            } else if (userInput == 0) {
                instructions();
            }
            guineaBelle.tick();
        }

    }

    public static void introduction() {
        System.out.println("(^._.^)()~");
        System.out.println(" `   ` `` ");
        System.out.println("Hi, I am Belle, an Abyssinian Guinea Pig.");
        System.out.println("I hope you can keep me happy. I love my hideout and will go there when I'm not being taken care of well.");
        System.out.println("In this game you are trying to keep my needs below a level of 8. If any one of my needs exceed 8 I will hide.");
        System.out.println("Let's get started!");
        System.out.println(" ");
    }

    public static void instructions() {
        System.out.println("Press 1 to feed me");
        System.out.println("Press 2 to give me water");
        System.out.println("Press 3 for a bathroom break");
        System.out.println("Press 4 to play with me");
        System.out.println("Press 5 to do nothing");
        System.out.println("Press 6 to exit the game");
        System.out.println(" ");
        System.out.println("What would you like to do?");
    }
}