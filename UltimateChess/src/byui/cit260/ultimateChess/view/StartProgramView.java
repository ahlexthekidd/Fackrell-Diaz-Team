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
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView(){
        this.promptMessage = "\nPlease enter your name:";
        this.displayBanner();
}

    private void displayBanner() {
        System.out.println(
        "\n**************************************"
       +"\n                                      "
       +"\n This is the game of Ultimate Chess   "
       +"\n                                      "         
       +"\n**************************************"         
        
        
        
        
        
        
        
        
        
        
        );
    }

    public void displayStartProgramView() {
        System.out.println("\n***displayProgramView function called ***");
    }

}
