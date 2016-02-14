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
public class TrialsControlTest {
    
    public TrialsControlTest() {
    }

    /**
     * Test of fightScene method, of class TrialsControl.
     */
    @Test
    public void testFightScene() {
        Actor hero = new Actor();
        Actor enemy = new Actor();
        System.out.println("moveLocation");
        
        /**************
         * TEST CASE #1
         **************/
        System.out.println("\tTest Case #1");
        
        // input values for test case #1
        int type = 3;
        int hHealth = 30;
        int hLevel = 7;
        int eHealth = 30;
        int eLevel = 6;
        
        hero.setHealth(hHealth);
        hero.setLevel(hLevel);
        enemy.setHealth(eHealth);
        enemy.setLevel(eLevel);
        
        int expResult = 0; // expected output
        
        // create an instance of the TrialsControl class
        TrialsControl instance = new TrialsControl();
        
        // call function to run test
        int result = instance.fightScene(hero, enemy, type);
        
        // compare expected result with actual result
        assertEquals(expResult, result, 0.0001);
        
         /**************
         * TEST CASE #2
         **************/
        System.out.println("\tTest Case #2");
        
        // input values for test case #1
        type = 3;
        hHealth = -1;
        hLevel = 1;
        eHealth = 30;
        eLevel = 6;
        
        hero.setHealth(hHealth);
        hero.setLevel(hLevel);
        enemy.setHealth(eHealth);
        enemy.setLevel(eLevel);
        
        expResult = -1; // expected output
        
        // call function to run test
        result = instance.fightScene(hero, enemy, type);
        
        // compare expected result with actual result
        assertEquals(expResult, result, 0.0001);
        
        /**************
         * TEST CASE #3
         **************/
        System.out.println("\tTest Case #3");
        
        // input values for test case #1
        type = 3;
        hHealth = -30;
        hLevel = 15;
        eHealth = 30;
        eLevel = 6;
        
        hero.setHealth(hHealth);
        hero.setLevel(hLevel);
        enemy.setHealth(eHealth);
        enemy.setLevel(eLevel);
        
        expResult = -1; // expected output
        
        // call function to run test
        result = instance.fightScene(hero, enemy, type);
        
        // compare expected result with actual result
        assertEquals(expResult, result, 0.0001);
        
        /**************
         * TEST CASE #4
         **************/
        System.out.println("\tTest Case #4");
        
        // input values for test case #1
        type = 3;
        hHealth = 25;
        hLevel = -30;
        eHealth = 30;
        eLevel = 6;
        
        hero.setHealth(hHealth);
        hero.setLevel(hLevel);
        enemy.setHealth(eHealth);
        enemy.setLevel(eLevel);
        
        expResult = -1; // expected output
        
        // call function to run test
        result = instance.fightScene(hero, enemy, type);
        
        // compare expected result with actual result
        assertEquals(expResult, result, 0.0001);
        
        /**************
         * TEST CASE #5
         **************/
        System.out.println("\tTest Case #5");
        
        // input values for test case #1
        type = 3;
        hHealth = 30;
        hLevel = 0;
        eHealth = 30;
        eLevel = 6;
        
        hero.setHealth(hHealth);
        hero.setLevel(hLevel);
        enemy.setHealth(eHealth);
        enemy.setLevel(eLevel);
        
        expResult = -1; // expected output
        
        // call function to run test
        result = instance.fightScene(hero, enemy, type);
        
        // compare expected result with actual result
        assertEquals(expResult, result, 0.0001);
        
         /**************
         * TEST CASE #6
         **************/
        System.out.println("\tTest Case #6");
        
        // input values for test case #1
        type = 3;
        hHealth = 255;
        hLevel = 50;
        eHealth = 30;
        eLevel = 6;
        
        hero.setHealth(hHealth);
        hero.setLevel(hLevel);
        enemy.setHealth(eHealth);
        enemy.setLevel(eLevel);
        
        expResult = 0; // expected output
        
        // call function to run test
        result = instance.fightScene(hero, enemy, type);
        
        // compare expected result with actual result
        assertEquals(expResult, result, 0.0001);
        
        /**************
         * TEST CASE #7
         **************/
        System.out.println("\tTest Case #7");
        
        // input values for test case #1
        type = 3;
        hHealth = 0;
        hLevel = 0;
        eHealth = 30;
        eLevel = 6;
        
        hero.setHealth(hHealth);
        hero.setLevel(hLevel);
        enemy.setHealth(eHealth);
        enemy.setLevel(eLevel);
        
        expResult = -1; // expected output
        
        // call function to run test
        result = instance.fightScene(hero, enemy, type);
        
        // compare expected result with actual result
        assertEquals(expResult, result, 0.0001);
        
         /**************
         * TEST CASE #8
         **************/
        System.out.println("\tTest Case #8");
        
        // input values for test case #1
        type = 3;
        hHealth = 255;
        hLevel = 1;
        eHealth = 30;
        eLevel = 6;
        
        hero.setHealth(hHealth);
        hero.setLevel(hLevel);
        enemy.setHealth(eHealth);
        enemy.setLevel(eLevel);
        
        expResult = -1; // expected output
        
        // call function to run test
        result = instance.fightScene(hero, enemy, type);
        
        // compare expected result with actual result
        assertEquals(expResult, result, 0.0001);
    }
    
}
