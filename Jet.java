/*
* This class use inheritance.
*
* @author  Donggeun Lim
* @version 1.0
* @since   2022-01-02
*/

/** Airplane class. */
public class Jet extends Airplane {
    /**
    * The subclass can add its own variable to the ones
    * that it inherits from Airplane.
    */
    private static final int MULTIPLIER = 2;

    /**
    * Super is a special keyword. It refers to the class
    * this class has inherited behavior from.
    * So here, this calls the constructor of Airplane, Jet's superclass.
    */
    public Jet() {
    }

    /**
    * This method shows that the subclass can change the behavior of
    * its superclass as well as call the superclass's methods.
    * This called overriding the superclass's bahavior.
    *
    * @param speed speed
    */
    public void setSpeed(final int speed) {
        super.setSpeed(speed * MULTIPLIER);
    }

    /**
    * This method shows that a subclass can add its own
    * methodsto the methods it inherits from its superclass.
    */
    public void accelerate() {
        super.setSpeed(getSpeed() * MULTIPLIER);
    }
}
