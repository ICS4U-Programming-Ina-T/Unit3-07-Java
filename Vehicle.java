/**
 * The Vehicle program implements an application that
 * acts as an abstract class to create a template for
 * necessary functions in any subclasses.
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-5-20
 */

public abstract class Vehicle {
    /**
     * Method that adds acceleration to the current speed.
     *
     * @param accelNum passed in
     */
    protected abstract void accelerate(int accelNum);

    /**
     * Method that alters the speed by applying brakes.
     *
     * @param brakeNum passed in
     */
    protected abstract void brake(int brakeNum);

    /**
     * Method that tells the user the current speed.
     */
    protected abstract void getSpeed();

    /**
     * Method that tells the user what the max speed of a vehicle is.
     */
    protected abstract void getMaxSpeed();

    /**
     * Method that tells user information and characteristics about a vehicle.
     */
    protected abstract void getInfo();
}
