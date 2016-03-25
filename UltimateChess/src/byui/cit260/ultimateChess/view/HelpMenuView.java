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
public class HelpMenuView extends View{
    
    public HelpMenuView() {
       super("\n"
                + "\n-----------------------------------------"
                + "\n| Help Menu                             |"
                + "\n-----------------------------------------"
                + "\nW - How To Win"
                + "\nM - How To Move"
                + "\nQ - Quit"
                + "\n------------------------------------------");
    }
    
 
    @Override
    public boolean doAction(String choice) {      
        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "W": // create and start a new game
                this.gameHelp();
                break;
            case "M": // get and start an existing game
                this.moveHelp();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void moveHelp() {
        this.console.println("\nIn order to move, enter a coordinate in the format of a point"
                         + "\nFor example: in order to move to coordinate (2, 3) enter"
                         + "the following: 2 , 3");
    }

    private void gameHelp() {
        this.console.println("The objective is to traverse through the castle and rescue the Queen");
    }
    
}
