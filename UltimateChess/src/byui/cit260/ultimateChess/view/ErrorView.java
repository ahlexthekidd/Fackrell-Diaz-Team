/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.view;

import java.io.PrintWriter;
import ultimatechess.UltimateChess;

/**
 *
 * @author Zero
 */
public class ErrorView {

    private static final PrintWriter errorFile = UltimateChess.getOutFile();
    private static final PrintWriter logFile = UltimateChess.getLogFile();
    
    public static void display(String className, String errorMessage) {

        errorFile.println(
                "-----------------------------------------------------"
                + "\n- ERROR - " + errorMessage
                + "\n-----------------------------------------------------");
        
        // log error
        logFile.println(className + " - " + errorMessage);
    }
}
