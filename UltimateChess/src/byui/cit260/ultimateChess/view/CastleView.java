/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

/**
 *
 * @author mfackrell1
 */

    public class CastleView extends View {
    
      public CastleView() {
         super("\n"
                 + "\n-----------------------------------------"
                 + "\n| Castle Menu                           |"
                 + "\n-----------------------------------------"
                 + "\n                                         "
                 + "\nX - Explore Castle"
                 + "\nL - Leave Castle"
                 + "\nC - Return to Castle"
                 + "\nH - Help Menu"
                 + "\nQ - Quit to Game Menu"
                 + "\n------------------------------------------");
     }
 
     @Override
     public boolean doAction(String choice) {
 
         choice = choice.toUpperCase(); // convert to upper case
 
         switch (choice) {
             case "X": // Explore Castle
                 this.exploreCastle();
                 break;
             case "L": // Leave Castle
                 this.leaveCastle();
                 break;
             case "C": // Return to Castle
                 this.castleRturn();
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
     
     private void exploreCastle() {
         System.out.println("*** You are exploring the Castle ***");
     }
     
     private void leaveCastle() {
          System.out.println("*** You left the Castle ***");
     }
 
     private void castleRturn() {
          System.out.println("*** You have returned to the Castle ***");
     }
 
     private void displayHelpMenu() {
         HelpMenuView helpMenu = new HelpMenuView();
         helpMenu.display();
     }
     
 }

