import java.awt.*;

public class Asteroid {

    public String name;                //holds the name of the hero
    public int xpos;                //the x position
    public int ypos;                //the y position
    public int dx;                    //the speed of the hero in the x direction
    public int dy;                    //the speed of the hero in the y direction
    public int width;
    public int height;
    public boolean isAlive;//a boolean to denote if the hero is alive or dead.
    public Rectangle hitbox;

    public Asteroid(int pXpos, int pYpos) {
        xpos = pXpos;
        ypos = pYpos;
        dx =-20;
        dy =-20;
        width = 80;
        height = 80;
        isAlive = true;
        hitbox = new Rectangle(xpos,ypos,width,height);

    } // constructor

    //The move method.  Everytime this is run (or "called") the hero's x position and y position change by dx and dy
    public void move() {


        if (xpos < -90) {//bounce off left wall


            xpos = 1000;

        }
        if (ypos < -70) { //bounce off top wall

            ypos= 700;

        }
        if (xpos > 1100-width) { //bounce off right  wall
            xpos = 10;

        }
        if (ypos > 800-height) { //bounce off bottom wall
            ypos = 10;

        }

        xpos = xpos + dx;
        ypos = ypos + dy;
        hitbox = new Rectangle(xpos,ypos,width,height);

    }
}


