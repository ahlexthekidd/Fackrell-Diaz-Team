/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

import byui.cit260.ultimateChess.model.Actor;
import byui.cit260.ultimateChess.model.MapControl;
import java.awt.Point;
import java.util.Scanner;


/**
 *
 * @author Zero
 */
public class GameMenuView {

    private String gameMenu;

    public GameMenuView() {
        this.gameMenu = "\n"
                + "\n-----------------------------------------"
                + "\n| Game Menu                             |"
                + "\n-----------------------------------------"
                + "\nF - Fight"
                + "\nP - Use Power Up"
                + "\nM - Move to Location"
                + "\nH - Help Menu"
                + "\nQ - Quit"
                + "\n------------------------------------------";
    }

    void displayGameMenu() {
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
            {
                return; // exit the program
            }
            // do the requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) {  // loop while an invalid value is entered          
            System.out.println("\n\n" + this.gameMenu);

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
            case "F": // create and start a new game
                this.fight();
                break;
            case "P": // get and start an existing game
                this.powerUp();
                break;
            case "M": // display the help menu
                this.moveLocation();
                break;
            case "H": // save the current game
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;

    }

    private void fight() {
        System.out.println("*** fight function called ***");
    }

    private void powerUp() {
        System.out.println("*** powerUp function called ***");
    }

    private void moveLocation() {
        Actor actor = new Actor();
        Point coordinates = new Point();
        MapControl move = new MapControl();
        move.moveLocation(actor, coordinates);
    }

    private void displayHelpMenu() { 
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }
}

