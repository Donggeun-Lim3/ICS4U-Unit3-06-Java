/**
* This class is the superclass of Jet class.
*
* @author  Donggeun Lim
* @version 1.0
* @since   2022-01-02
*/

public class Airplane {
    /** Private field speed.*/
    private int speed;

    /**
    * Class constructor.
    */
    public Airplane() {
    }

    /**
    * This method returns current speed.
    *
    * @return speed
    */
    public int getSpeed() {
        return this.speed;
    }

    /**
    * This method sets new speed.
    *
    * @param newSpeed new speed
    */
    public void setSpeed(final int newSpeed) {
        this.speed = newSpeed;
    }
}
