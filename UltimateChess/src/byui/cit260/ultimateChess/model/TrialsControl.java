/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.model;

import citbyui.cit260.ultimatechess.exceptions.TrialsControlException;

/**
 *
 * @author Zero
 */
public class TrialsControl {

    // how to handle a fight scene
    public void fightScene(Actor hero, Actor enemy, int type) throws TrialsControlException {

        // initialize variables
        int a = hero.getHealth();
        int b = hero.getLevel();
        int c = hero.getAttack();
        int d = hero.getDefense();
        int w = enemy.getHealth();
        int x = enemy.getLevel();
        int y = enemy.getAttack();
        int z = enemy.getDefense();

        if (a <= 0 || w <= 0 || b < 0 || x < 0) {
            throw new TrialsControlException("The actors cannot"
                    + " be engaged in a fight because they have"
                    + " invalid values");
        }
        
        if (type == 3) {
            if (b >= x) {
                int damage = ((b * c)/2 * (y * z)/2);
                w -= damage;
            }
            if (b < x) {
                a = 0;
            }
        }
    }
}
