/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatechess;

import byui.cit260.ultimateChess.model.Game;
import byui.cit260.ultimateChess.model.Player;
import byui.cit260.ultimateChess.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zero
 */
public class UltimateChess {

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        UltimateChess.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        UltimateChess.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        UltimateChess.inFile = inFile;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setCurrentGame(Game currentGame) {
        UltimateChess.currentGame = currentGame;
    }

    public static void setPlayer(Player player) {
        UltimateChess.player = player;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // open character stream files for end user input and output
            UltimateChess.inFile
                    = new BufferedReader(new InputStreamReader(System.in));
            UltimateChess.outFile
                    = new PrintWriter(System.out, true);
            
            // open log file
            String filePath = "log.txt";
            UltimateChess.logFile = new PrintWriter(filePath);
            
         
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();
            return;

        } catch (Exception e) {

            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());

            e.printStackTrace();
        } finally {
            try {
                if (UltimateChess.inFile != null) {
                    UltimateChess.inFile.close();
                }
                if (UltimateChess.outFile != null) {
                    UltimateChess.outFile.close();
                }
                if (UltimateChess.logFile != null) {
                    UltimateChess.logFile.close();
                }
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }
}
