package rockpaperscissors;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 999; i++) {
            System.out.println("Choose 1: Rock, 2: Paper, 3:Scissors, 4: End game.");
            int choice = sc.nextInt();

            if (choice == 1 || choice == 2 || choice == 3) {
                int PCchoice = 0;
                if (Math.random() < 0.25) {
                    PCchoice = 1;
                } else if (Math.random() > 0.25 | Math.random() < 0.5) {
                    PCchoice = 2;
                } else if (Math.random() > 0.5) {
                    PCchoice = 3;
                }
                
                if (choice == PCchoice) {
                    System.out.println("Lygiosios1");
                }
                

                System.out.println("good choice");
            }
            
            
            
            
            
            
            if (choice == 4) {
                break;
            }
            if (choice > 4 || choice < 1) {
                System.out.println("Idiot, that's not the option");
            }
        }

        System.out.println("Results:");

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
