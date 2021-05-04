package rockpaperscissors;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int win = 0;
        int lose = 0;
        int draw = 0;

        do {
            System.out.println("Choose 1: Rock, 2: Paper, 3:Scissors, 4: End game.");
            choice = sc.nextInt();
            if (choice > 4 || choice < 1) {
                System.out.println("Idiot, that's not the option");

            } else if (choice < 4) {
                int PCchoice = (int) (Math.random() * 3 + 1);

                if (choice == PCchoice) {
                    System.out.println("Draw");
                    draw++;
                } else if (choice == 1) {
                    if (PCchoice == 3) {
                        System.out.println("You win");
                        win++;
                    } else {
                        System.out.println("You lose :(");
                        lose++;
                    }
                } else if (choice == 2) {
                    if (PCchoice == 1) {
                        System.out.println("You win");
                        win++;
                    } else {
                        System.out.println("You lose :(");
                        lose++;
                    }
                } else if (choice == 3) {
                    if (PCchoice == 2) {
                        System.out.println("You win");
                        win++;
                    } else {
                        System.out.println("You lose :(");
                        lose++;
                    }
                }
            }
        } while (choice != 4);
        System.out.println("Results:");
        System.out.println("Times you won:" + win);
        System.out.println("Times you lost:" + lose);
        System.out.println("Draws:" + draw);


        /*
    Akmuo - popierius - zirkles
   
    Programa leidzia vartotojui pasirinkti:
   
    1. Akmuo                    1 + 2 = 2  1+3 = 1
    2. Popierius                2 + 3 = 3
    3. Zirkles
    0. Pabaiga
   
    Jei ne pabaiga:
    Kompiuteris atsitiktinai pasirenka
    palyginam ir parasom kas laimejo
   
    ir vel spausdinam meniu
    jei vartotojas pasirinko ne 0..3 - pavadinikit vartotjoa mulkiu ir vel meniu
   
    ****
    Programa paklausia kiek kartu reikia suzaist
   
    Kompiuteris zaidzia su savim
   
    Pabaigoj atsapausdinti statistika:
   
    comp1 laimejo: XXXX
    comp2 laimejo: XXXX
    lygiosios: XXXX
   
    comp1:
    pasirino akmeni: XX
    pasirinko popieriu: XX
    pasirinko zirkles: XX
   
    comp2:
    pasirino akmeni: XX
    pasirinko popieriu: XX
    pasirinko zirkles: XX
   
         */
    }

}
