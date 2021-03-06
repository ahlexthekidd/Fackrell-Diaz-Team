/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

import static byui.cit260.ultimateChess.model.Actor.Pawn;
import byui.cit260.ultimateChess.model.Game;
import byui.cit260.ultimateChess.model.GameControl;
import byui.cit260.ultimateChess.model.InventoryItem;
import byui.cit260.ultimateChess.model.Location;
import byui.cit260.ultimateChess.model.Map;
import byui.cit260.ultimateChess.model.MapControl;
import citbyui.cit260.ultimatechess.exceptions.GameControlException;
import citbyui.cit260.ultimatechess.exceptions.MapControlException;
import java.awt.Point;
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
                + "\nV - Display the Map"
                + "\nI - Display The Inventory"
                + "\nM - Move to Location"
                + "\nC - Castle Menu"
                + "\nH - Help Menu"
                + "\nP - Print Menu"
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
            case "F":
                this.fight();
                break;
            case "I": // get and start an existing game
                this.displayInventory();
                break;
            case "M": {
                try {
                    // move to location
                    this.moveLocation();
                } catch (MapControlException ex) {
                    this.console.print(ex.getMessage());
                }
            }
            break;
            case "C": // Castle menu
                this.CastleView();
                break;
            case "H": // help menu
                this.displayHelpMenu();
                break;
            case "P": // print menu
                try {
                    this.print();
                } catch (GameControlException ex) {
                    this.console.println(ex.getMessage());
                }
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
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

        this.console.println("\nList of INventory Items");
        this.console.println("Description" + "\t"
                + "Required" + "\t"
                + "In Stock");

        // for each inventory item
        for (InventoryItem inventoryItem : inventory) {
            // Display the description and the amount in stock
            this.console.println(inventoryItem.getInventoryType() + "\t   "
                    + inventoryItem.getStock());
        }
    }

    private void moveLocation() throws MapControlException {
        Point coordinates = new Point();
        MapControl move = new MapControl();
        move.moveLocation(Pawn, coordinates);
        coordinates.setLocation(coordinates);
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
        Map map = locations.getMap();
        Location places[][] = map.getLocations();

        int rowCount = map.getRowCount();
        int columnCount = map.getColumnCount();

        this.console.println("\n\n\t\t-----------------------------------------"
                + "\n\t\t|            The Kingdom                |"
                + "\n\t\t-----------------------------------------");
        this.console.print("\n\t| 0  |  | 1  |  | 2  |  | 3  |  | 4  |  | 5  |  | 6  |\n");

        for (int row = 0; row < rowCount; row++) {
            this.console.print("\n\t-----------------------------------------------------\n");
            this.console.print("| " + row + " |");
            for (int column = 0; column < columnCount; column++) {
                Location place = places[row][column];
                if (place.isVisited()) {
                    this.console.print(" | " + place.getScene().getType());
                } else {
                    this.console.print("\t| ??");
                }
                this.console.print(" | ");
            }
        }
        this.console.print("\n\t-----------------------------------------------------\n");
    }

    private void print() throws GameControlException {
        // display the game menu
        PrintMenuView printMenu = new PrintMenuView();
        printMenu.display();
    }
}
