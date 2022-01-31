package virtual_pet;

import java.util.Random;

public class VirtualPet {
    private int hunger;
    private int thirst;
    private int waste;
    private int boredom;
    private boolean isAlive = true;

    public int getHunger() {
        return hunger;
    }

    public boolean getAlive() {
        return isAlive;
    }

    public int getThirst() {
        return thirst;
    }

    public int getWaste() {
        return waste;
    }

    public int getBoredom() {
        return boredom;
    }

    public void feedMe() {
        if (hunger != 0) {
            hunger--;
        }
        thirst++;
        waste++;
    }

    public void giveMeWater() {
        if (thirst != 0) {
            thirst--;
        }
        hunger++;
    }

    public void bathroomBreak() {
        waste = 0;
        hunger = hunger + 2;
    }

    public void playWithMe() {
        if (boredom > 2) {
            boredom = boredom - 2;
        } else {
            boredom = 0;
        }
        hunger++;
        thirst++;
    }

    public void tick() {
        boredom++;
        Random rand = new Random();
        int n = rand.nextInt(4);
        if (n == 1) {
            hunger++;
        } else if (n == 2) {
            thirst++;
        } else if (n == 3) {
            waste++;
        } else {
            boredom++;
        }
//        if(boredom>=8||hunger>=8||thirst>=8||waste>=8) {
//            isAlive = false;
//        }
        if (hunger > 8) {
            isAlive = false;
            System.out.println("Oh no! My hunger is too high at " + hunger + ". I'm going to hide.");
        } else if (thirst > 8) {
            isAlive = false;
            System.out.println("Oh no! My thirst is too high at " + thirst + ". I'm going to hide.");
        } else if (waste > 8) {
            isAlive = false;
            System.out.println("Oh no! I've got to poop! I'm going to hide.");
        } else if (boredom > 8) {
            isAlive = false;
            System.out.println("Oh no! My boredom level is too high at " + boredom + ". I'm going to hide.");
        } else {
            System.out.println("My current hunger level is " + hunger);
            System.out.println("My current thirst level is " + thirst);
            System.out.println("My current waste level is " + waste);
            System.out.println("My current boredom level is " + boredom);
        }
    }

    public VirtualPet(int inputHunger, int inputThirst, int inputWaste, int inputBoredom) {
        this.hunger = inputHunger;
        this.thirst = inputThirst;
        this.waste = inputWaste;
        this.boredom = inputBoredom;
    }
}