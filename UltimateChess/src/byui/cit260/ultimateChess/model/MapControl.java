/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ultimateChess.model;

import citbyui.cit260.ultimatechess.exceptions.MapControlException;
import java.awt.Point;
import java.util.Scanner;
import ultimatechess.UltimateChess;

/**
 *
 * @author Zero
 */
public class MapControl {

    static Map createMap() {
        // create the map
        Map map = new Map(7, 7);

        // create a list of the different scenes in the game
        Scene[] scenes = createScenes();

        // assign the different scenes to locations in the map
        assignScenesToLocations(map, scenes);

        return map;
    }

    public static void moveActorToLocation(Actor actor, Point coordinates) throws MapControlException {

        Map map = UltimateChess.getCurrentGame().getMap();
        int newRow = coordinates.x - 1;
        int newColumn = coordinates.y - 1;

        if (newRow < 0 || newRow >= map.getRowCount()
                || newColumn < 0 || newColumn >= map.getColumnCount()) {
            throw new MapControlException("Can no move actor to location "
                    + coordinates.x + ", " + coordinates.y
                    + " because that location is outside "
                    + " the bounds of the map");
        }

    }

    static void moveActorsToStartingLocation(Map map) throws MapControlException {
        Actor[] actors = Actor.values();
        // for every actor
        for (Actor actor : actors) {
            Point coordinates = actor.getCoordinates();
            MapControl.moveActorToLocation(actor, coordinates);
        }
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

        //start point
        locations[0][0].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.fightScene.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.puzzleScene.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.fightScene.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.fightScene.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.puzzleScene.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[1][6].setScene(scenes[SceneType.fightScene.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.fightScene.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.puzzleScene.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[2][6].setScene(scenes[SceneType.fightScene.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.fightScene.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.puzzleScene.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[3][6].setScene(scenes[SceneType.fightScene.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.fightScene.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.puzzleScene.ordinal()]);
        locations[4][5].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[4][6].setScene(scenes[SceneType.fightScene.ordinal()]);
        locations[5][0].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.fightScene.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.puzzleScene.ordinal()]);
        locations[5][5].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[5][6].setScene(scenes[SceneType.fightScene.ordinal()]);
        locations[6][0].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[6][1].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[6][2].setScene(scenes[SceneType.fightScene.ordinal()]);
        locations[6][3].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[6][4].setScene(scenes[SceneType.puzzleScene.ordinal()]);
        locations[6][5].setScene(scenes[SceneType.safeScene.ordinal()]);
        locations[6][6].setScene(scenes[SceneType.fightScene.ordinal()]);
    }

    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];

        Scene fightScene = new Scene();
        fightScene.setDescription("\nThis is a fight scene. In order to move on"
                + "to the next location you must defeat your enemy.");
        fightScene.setType("FT");
        fightScene.setBlocked(false);
        scenes[SceneType.fightScene.ordinal()] = fightScene;

        Scene puzzleScene = new Scene();
        puzzleScene.setDescription("\nThis is a puzzle scene. In order to move on"
                + "to the next location you must figure out this puzzle.");
        puzzleScene.setType("PZ");
        puzzleScene.setBlocked(false);
        scenes[SceneType.puzzleScene.ordinal()] = puzzleScene;

        Scene safeScene = new Scene();
        safeScene.setDescription("\nThis is a safe scene. This is an intermediate scene."
                + "This is a place to relax and not worry about anything else");
        safeScene.setType("SF");
        safeScene.setBlocked(false);
        scenes[SceneType.safeScene.ordinal()] = safeScene;

        return scenes;
    }

    public enum SceneType {
        fightScene,
        puzzleScene,
        safeScene;
    }

    // determines where to move
    public int moveLocation(Actor actor, Point coordinates) throws MapControlException {

        // initialize variables
        double x = coordinates.getX();
        double y = coordinates.getY();

        int row = (int) x;
        int column = (int) y;

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
        moveActorToLocation(actor, coordinates);
        return 0;
    }
}
