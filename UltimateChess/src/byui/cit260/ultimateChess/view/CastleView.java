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
                 this.console.println("\n*** Invalid selection *** Try again");
                 break;
         }
         return false;
 
     }
     
     private void exploreCastle() {
         this.console.println("*** You are exploring the Castle and gather a few friends and items for the journey. ***");
       
        int ARMY_PER_PLAYER = 6;

        // number of players
        int PLAYERS = 1;

        String[] armyMembers = { "Pawn", "Rook", "Knight", "Bishop","Gold","Potion"  };
        String[] rank = { "1","1", "2","3","4","1","2","1","5" };

        // int 
        int ARMY = armyMembers.length;
        int RANKS = rank.length;
        int TROOPS = ARMY * RANKS;


        if (ARMY_PER_PLAYER * PLAYERS > TROOPS) throw new RuntimeException("Too many players");


        // initialize 
        String[] squadron = new String[TROOPS];
        for (int i = 0; i < RANKS; i++) {
            for (int j = 0; j < ARMY; j++) {
                squadron[ARMY * i + j] = rank[i] + "  " + armyMembers[j];
            }
        }

        // random selection
        for (int i = 0; i < TROOPS; i++) {
            int r = i + (int) (Math.random() * (TROOPS -i));
            //int r = i  * (TROOPS -i);
            String t = squadron[r];
            squadron[r] = squadron[i];
            squadron[i] = t;
        }

        // print 
        for (int i = 0; i < PLAYERS * ARMY_PER_PLAYER; i++) {
            System.out.println(squadron[i]);
            if (i % ARMY_PER_PLAYER == ARMY_PER_PLAYER - 1) System.out.println();
        }
         
     
         /*
         
        String[] armyMembers = { "Pawns", "Knights", "Bishops", "Rooks" };
        String[] rank = {"2","3","4"};

        // initialize 
        int ARMYMEMBERS = armyMembers.length;
        int RANKS = rank.length;
        int N = ARMYMEMBERS * RANKS;

        // initialize army
        String[] army = new String[N];
        for (int i = 0; i < RANKS; i++) {
            for (int j = 0; j < ARMYMEMBERS; j++) {
                army[ARMYMEMBERS * i + j] = rank[i] + "  " + armyMembers[j];
            }
        }

        // random selection you never know who will help 
        for (int i = 0; i < N; i++) {
            int r = i + (int) (Math.random() * (N-i));
            String t = army[r];
            army[r] = army[i];
            army[i] = t;
        }

        // print those who want to help
        for (int i = 0; i < N; i++) {
            System.out.println(army[i]);
         } */
     }
     

     
     private void leaveCastle() {
          this.console.println("*** You left the Castle ***");
     }
 
     private void castleRturn() {
          this.console.println("*** You have returned to the Castle ***");
     }
 
     private void displayHelpMenu() {
         HelpMenuView helpMenu = new HelpMenuView();
         helpMenu.display();
     }
     
 }

