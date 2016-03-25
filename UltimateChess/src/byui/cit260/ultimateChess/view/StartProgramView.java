/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

import byui.cit260.ultimateChess.model.GameControl;
import byui.cit260.ultimateChess.model.Player;
import java.util.Scanner;

/**
 *
 * @author Zero
 */
public class StartProgramView {

    private String promptMessage;

    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                "\n************************************************************"
                + "\n*                                                        *"
                + "\n* The game Ultimate Chess is going to be a text based    *"
                + "\n* role playing game.                                     *"
                + "\n*                                                        *"            
                + "\n* In this game you have a chess piece                    *"
                + "\n* who will be the main character or leader               *"
                + "\n* of the story. The premise of the game is The Queen     *"
                + "\n* has been taken from the board and the other chess      *"
                + "\n* pieces must work together to return The Queen back     *"
                + "\n* to The King. The Hero will need to travel through      *"
                + "\n* the Chess Board in order to reach the location where   *"
                + "\n* The Queen is being held captive. The Hero will be      *"
                + "\n* helped along the way by other chess pieces collecting *"
                + "\n* resources and receiving help to overcome trials. The   *"
                + "\n* chess pieces have become distraught so they need to be *"
                + "\n* brought back together with the help of The Hero.       *"
                + "\n*                                                        *"
                + "\n**********************************************************"
        );

    }

    public void displayStartProgramView() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the program
            
            // do the requested action and display the next view
            done = this.doAction(playersName);

        } while (!done);
    }

    private String getPlayersName() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) {  // loop while an invalid value is entered          
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                ErrorView.display(this.getClass().getName(), "\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(String playersName) {
       
        if (playersName.length() < 2) {
            ErrorView.display(this.getClass().getName(), "\nInvalid players name: "
                     + "This name must be greater than one character in length");
            return false;
        }
        
        // call createPlayer() control 
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { // if unsuccessfull
            ErrorView.display(this.getClass().getName(), "\nError creating the player.");
            return false;
        }
        
        // display next view
        this.displayNextView(player);
        
        return true;
    }

    private void displayNextView(Player player) {
        
        // display a custom welcome message
        System.out.println("\n==================================="
                        +  "\n Welcome to the game " + player.getName()
                        +  "\n We hope you have a lot of fun!"
                        +  "\n==================================="
                        );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the main menu view
        mainMenuView.display();
    }

}
