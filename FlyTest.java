/*
* This program uses Airplane and Jet class.
*
* @author  Donggeun Lim
* @version 1.0
* @since   2022-01-02
*/

/** FlyTest class. */
public final class FlyTest {
    /**
    * Prevents instantiation.
    * Throw an exception IllegalStateException when called.
    *
    * @throws IllegalStateException
    *
    */
    private FlyTest() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /** Initial speed of a biplane. */
    public static final int BIPLANE_SPEED = 212;
    /** Initial speed of a boeing. */
    public static final int BOEING_SPEED = 422;
    /** Speed limit. */
    public static final int SPEED_LIMIT = 5000;

    /**
    * This method is main stub.
    *
    * @param args will be not used
    */
    public static void main(final String[] args) {
        final Airplane biplane = new Airplane();
        biplane.setSpeed(BIPLANE_SPEED);
        System.out.println(biplane.getSpeed());
        final Jet boeing = new Jet();
        boeing.setSpeed(BOEING_SPEED);
        System.out.println(boeing.getSpeed());
        int counter = 0;
        while (counter < 2 + 2) {
            boeing.accelerate();
            System.out.println(boeing.getSpeed());
            if (boeing.getSpeed() > SPEED_LIMIT) {
                biplane.setSpeed(biplane.getSpeed() * 2);
            }
            else {
                boeing.accelerate();
            }
            counter++;
        }
        System.out.println(biplane.getSpeed());
    }
}
