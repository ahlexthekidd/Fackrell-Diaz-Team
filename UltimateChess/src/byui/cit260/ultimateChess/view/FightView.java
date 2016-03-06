/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

/**
 *
 * @author Zero
 */
public class FightView extends View {
    
     public FightView() {
        super("\n"
                + "\n-----------------------------------------"
                + "\n| Fight Menu                             |"
                + "\n-----------------------------------------"
                + "\nA - Attack"
                + "\nD - Defend"
                + "\nR - Run Away"
                + "\nH - Help Menu"
                + "\nQ - Quit"
                + "\n------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "A": // initiate an attack
                this.attack();
                break;
            case "D": // initiate defend
                this.defend();
                break;
            case "R": // initiate running away
                this.run();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;

    }
    
    private void attack() {
        System.out.println("*** You have attempted to attack ***");
    }
    
    private void defend() {
         System.out.println("*** You have attempted to defend ***");
    }

    private void run() {
         System.out.println("*** You have attempted to run ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
}
