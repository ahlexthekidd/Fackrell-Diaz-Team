/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.model;

/**
 *
 * @author Zero
 */
public class TrialsControl {
    // how to handle a fight scene
    public int fightScene(Actor hero, Actor enemy, int type) {

        // initialize variables
        int a = hero.getHealth();
        int b = hero.getLevel();
        int w = enemy.getHealth();
        int x = enemy.getLevel();
      
        if (a <= 0 || w <= 0 || b < 0 || x < 0) {
            return -1;
        }
        if (type == 3) {            
            if (b >= x){
              //int damage = ((b * c)/2 * (y * z)/2);
              //w -= damage;
               return 0;
            }
            if (b < x) {
                a = 0;
                return -1;
            }
        }
        return 0;
    }
}
