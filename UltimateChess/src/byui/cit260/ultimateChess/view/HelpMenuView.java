/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

import java.util.Scanner;

/**
 *
 * @author Zero
 */
public class HelpMenuView {
    
    private String help;

    public HelpMenuView() {
      this.help = "\n"
                + "\n-----------------------------------------"
                + "\n| Help Menu                             |"
                + "\n-----------------------------------------"
                + "\nW - How To Win"
                + "\nM - How To Move"
                + "\nQ - Quit"
                + "\n------------------------------------------";
    }
    

    void displayMenu() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the program
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);
    }

    private String getMenuOption() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) {  // loop while an invalid value is entered          
            System.out.println("\n\n" + this.help);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(String choice) {
       
        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "W": // create and start a new game
                this.gameHelp();
                break;
            case "M": // get and start an existing game
                this.moveHelp();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void moveHelp() {
        System.out.println("\nIn order to move, enter a coordinate in the format of a point"
                         + "\nFor example: in order to move to coordinate (2, 3) enter"
                         + "the following: 2 , 3");
    }

    private void gameHelp() {
        System.out.println("The objective is to traverse through the castle and rescue the Queen");
    }
    
}
