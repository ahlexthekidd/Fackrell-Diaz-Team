/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

import byui.cit260.ultimateChess.model.Game;
import byui.cit260.ultimateChess.model.Location;
import byui.cit260.ultimateChess.model.Map;
import byui.cit260.ultimateChess.model.PrintControl;
import ultimatechess.UltimateChess;

/**
 *
 * @author Zero
 */
public class PrintMenuView extends View {

    private String menu;

    public PrintMenuView() {
        super("\n"
                + "\n-----------------------------------------"
                + "\n| Print Menu                             |"
                + "\n-----------------------------------------"
                + "\nM - Print Map"
                + "\nQ - Quit"
                + "\n------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "M": // Print Map
                this.printMap();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void printMap() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for the file where the map "
                + "is to be saved");
        String filePath = this.getInput();
        try {
            // save the game to the specified file
            PrintControl.printMap(UltimateChess.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("PrintMenuView", ex.getMessage());
        }
    }
}
