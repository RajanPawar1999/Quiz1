
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class Quiz01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City Rajan = new City();
        Robot bob = new Robot(Rajan, 4, 0, Direction.EAST);
        
        new Wall(Rajan, 4, 2, Direction.WEST);
        new Wall(Rajan, 4, 2, Direction.NORTH);
        new Wall(Rajan, 3, 3, Direction.WEST);
        new Wall(Rajan, 3, 3, Direction.NORTH);
        new Wall(Rajan, 2, 4, Direction.WEST);
        new Wall(Rajan, 2, 4, Direction.NORTH);
        new Wall(Rajan, 2, 5, Direction.NORTH);
        new Wall(Rajan, 2, 5, Direction.EAST);
        new Wall(Rajan, 3, 6, Direction.NORTH);
        new Wall(Rajan, 3, 6, Direction.EAST);
        new Wall(Rajan, 4, 7, Direction.NORTH);
        new Wall(Rajan, 4, 7, Direction.EAST);
        new Thing(Rajan, 4, 1);
        new Thing(Rajan, 3, 2);
        new Thing(Rajan, 2, 3);
        new Thing(Rajan, 1, 4);
        
        bob.move();
        bob.pickThing();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.pickThing();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.pickThing();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.pickThing();
        bob.move();
        bob.putThing();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.putThing();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.putThing();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.putThing();
        bob.turnLeft();
        bob.move();
    }
}
