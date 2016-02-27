/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.model;

import java.awt.Point;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zero
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of moveLocation method, of class MapControl.
     */
    @Test
    public void testMoveLocation() {
        
        Actor actor = new Actor();
        Point coordinates = new Point();
        System.out.println("moveLocation");
        
        /**************
         * TEST CASE #1
         **************/
        System.out.println("\tTest Case #1");
        
        // input values for test case #1
        int row = 15;
        int column = 30;
        coordinates.setLocation(row, column);
        
        int expResult = 0; // expected output
        
        // create an instance of the MapControl class
        MapControl instance = new MapControl();
        
        // call function to run test
        int result = instance.moveLocation(actor, coordinates);
        
        // compare expected result with actual result
        assertEquals(expResult, result, 0.0001);
        
        /**************
         * TEST CASE #2
         **************/
        System.out.println("\tTest Case #2");
        
        // input values for test case #1
        row = 55;
        column = 15;
        coordinates.setLocation(row, column);
        
        expResult = -1; // expected output
               
        // call function to run test
        result = instance.moveLocation(actor, coordinates);
        
        // compare expected result with actual result
        assertEquals(expResult, result, 0.0001);
        
         /**************
         * TEST CASE #3
         **************/
        System.out.println("\tTest Case #3");
        
        // input values for test case #1
        row = -1;
        column = 25;
        coordinates.setLocation(row, column);
        
        expResult = -1; // expected output
               
        // call function to run test
        result = instance.moveLocation(actor, coordinates);
        
        // compare expected result with actual result
        assertEquals(expResult, result, 0.0001);
        
        /**************
         * TEST CASE #4
         **************/
        System.out.println("\tTest Case #4");
        
        // input values for test case #1
        row = 0;
        column = -30;
        coordinates.setLocation(row, column);
        
        expResult = -1; // expected output
               
        // call function to run test
        result = instance.moveLocation(actor, coordinates);
        
        // compare expected result with actual result
        assertEquals(expResult, result, 0.0001);
        
        /**************
         * TEST CASE #5
         **************/
        System.out.println("\tTest Case #5");
        
        // input values for test case #1
        row = 50;
        column = 50;
        coordinates.setLocation(row, column);
        
        expResult = -1; // expected output
               
        // call function to run test
        result = instance.moveLocation(actor, coordinates);
        
        // compare expected result with actual result
        assertEquals(expResult, result, 0.0001);
        
        /**************
         * TEST CASE #6
         **************/
        System.out.println("\tTest Case #6");
        
        // input values for test case #1
        row = 0;
        column = 36;
        coordinates.setLocation(row, column);
        
        expResult = 0; // expected output
               
        // call function to run test
        result = instance.moveLocation(actor, coordinates);
        
        // compare expected result with actual result
        assertEquals(expResult, result, 0.0001);
        
        /**************
         * TEST CASE #7
         **************/
        System.out.println("\tTest Case #7");
        
        // input values for test case #1
        row = 36;
        column = 36;
        coordinates.setLocation(row, column);
        
        expResult = 0; // expected output
               
        // call function to run test
        result = instance.moveLocation(actor, coordinates);
        
        // compare expected result with actual result
        assertEquals(expResult, result, 0.0001);
        
        /**************
         * TEST CASE #8
         **************/
        System.out.println("\tTest Case #8");
        
        // input values for test case #1
        row = 36;
        column = 0;
        coordinates.setLocation(row, column);
        
        expResult = 0; // expected output
               
        // call function to run test
        result = instance.moveLocation(actor, coordinates);
        
        // compare expected result with actual result
        assertEquals(expResult, result, 0.0001);
    }
        
}
