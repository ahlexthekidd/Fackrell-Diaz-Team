/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

import byui.cit260.ultimateChess.model.Game;
import byui.cit260.ultimateChess.model.GameControl;
import byui.cit260.ultimateChess.model.InventoryItem;
import ultimatechess.UltimateChess;


/**
 *
 * @author Zero
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n-----------------------------------------"
                + "\n| Game Menu                             |"
                + "\n-----------------------------------------"
                + "\nF - Fight"
                + "\nI - displayInventory"
                + "\nM - Move to Location"
                + "\nC - Castle Menu"
                + "\nH - Help Menu"
                + "\nQ - Quit"
                + "\n------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "V": // display map
                this.displayMap();
                break;
            case "F": // create and start a new game
                this.fight();
                break;
            case "I": // get and start an existing game
                this.displayInventory();
                break;
            case "M": // move to location
                this.moveLocation();
                break;
            case "C": // Castle menu
                this.CastleView();
                break;
            case "H": // help menu
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;

    }

    private void fight() {
        FightView fight = new FightView();
        fight.display();
    }

    private void displayInventory() {
        // get the sorted list of inventory items for the current game
        InventoryItem[] inventory = GameControl.getSortedInventoryList();

        System.out.println("\nList of INventory Items");
        System.out.println("Description" + "\t"
                + "Required" + "\t"
                + "In Stock");

        // for each inventory item
        for (InventoryItem inventoryItem : inventory) {
            // Display the description and the amount in stock
            System.out.println(inventoryItem.getInventoryType() + "\t   "
                    + inventoryItem.getStock());
        }
    }

    private void moveLocation() {
        System.out.println("*** moveLocation function called ***");

        //Actor actor = new Actor();
        //Point coordinates = new Point();
        //MapControl move = new MapControl();
        //move.moveLocation(actor, coordinates);
        //coordinates.setLocation(coordinates);
        //System.out.println("Your current location: " + coordinates);
    }

    private void CastleView() {
        CastleView castleView = new CastleView();
        castleView.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void displayMap() {
        Game locations = UltimateChess.getCurrentGame();

    }
}
