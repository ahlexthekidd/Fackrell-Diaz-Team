/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.model;

import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author Zero
 */
public class MapControl {

    // determines where to move
    public int moveLocation(Actor actor, Point coordinates) {

        // initialize variables
        double x = coordinates.getX();
        double y = coordinates.getY();

        int row = (int)x;
        int column = (int)y;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a row:");
        row = input.nextInt();
        if (row < 0 || row > 36) {
            System.out.println("You have entered an invalid row");
            System.out.println("Please enter a row:");
            row = input.nextInt();
            //return -1;
        }

        System.out.println("Please enter a column:");
        column = input.nextInt();
        if (column < 0 || column > 36) {
            System.out.println("You have entered an invalid column");
            System.out.println("Please enter a column:");
            column = input.nextInt();
            //return -1;
        }

        coordinates.setLocation(new Point(row, column));
        return 0;
    }

}
