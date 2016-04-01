/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.model;

import citbyui.cit260.ultimatechess.exceptions.GameControlException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import ultimatechess.UltimateChess;

/**
 *
 * @author Zero
 */
public class PrintControl {

    public static void printMap(Game currentGame, String filePath) throws GameControlException {
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            //output.writeObject(currentGame.getMap());
            Game locations = UltimateChess.getCurrentGame();
            Map map = locations.getMap();
            Location places[][] = map.getLocations();

            int rowCount = map.getRowCount();
            int columnCount = map.getColumnCount();

            output.writeObject("\n\n\t\t-----------------------------------------"
                    + "\n\t\t|            The Kingdom                |"
                    + "\n\t\t-----------------------------------------"
                    + "\n\t| 0  |  | 1  |  | 2  |  | 3  |  | 4  |  | 5  |  | 6  |\n");

            for (int row = 0; row < rowCount; row++) {
                output.writeObject("\n        ------------------------------------------------------\n");
                output.writeObject("\n  | " + row + " |");
                for (int column = 0; column < columnCount; column++) {
                    Location place = places[row][column];
                    if (place.isVisited()) {
                        output.writeObject(" | " + place.getScene().getType());
                    } else {
                        output.writeObject("| ??");
                    }
                    output.writeObject(" | ");
                    output.writeObject("\n");
                }
            }
            output.writeObject("\n        ------------------------------------------------------\n");
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

}
