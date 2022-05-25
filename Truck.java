/**
 * The Truck program implements an application that
 * inherts characteristics from the Vehicle class.
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-5-20
 */

class Truck extends Vehicle {
    /**
     * Property for _wheelNum.
     */
    private int _wheelNum;
    /**
     * Property for _plateNum.
     */
    private String _plateNum;
    /**
     * Property for _doorNum.
     */
    private int _doorNum;

    /**
     * Constructor for class.
     *
     * @param plateNum passed in
     * @param colour passed in
     * @param doorNum passed in
     * @param wheelNum passed in
     * @param seatNum passed in
     * @param length passed in
     * @param speed passed in
     * @param maxSpeed passed in
     */
    public Truck(String plateNum, String colour, int doorNum,
        int wheelNum, int seatNum, int length, int speed, int maxSpeed) {
        super(plateNum, colour, doorNum, seatNum, length, speed, maxSpeed);
        _plateNum = plateNum;
        _wheelNum = wheelNum;
        _doorNum = doorNum;
    }

    /**
     * Method that adds acceleration to the current speed.
     *
     * @param accelNum passed in
     */
    protected void accelerate(int accelNum) {
        // adds acceleration
        int newSpeed = _speed + accelNum;

        // checks if speed is at max
        if (_speed == _maxSpeed) {
            System.out.println("Vehicle has reached its max speed.");
        } else {
            _speed = newSpeed;

            // checks if speed is greater than max speed
            if (_speed > _maxSpeed) {
                _speed = _maxSpeed;
            }

            System.out.println("Vehicle has accelerated " + accelNum
                + " km/h");
        }
    }

    /**
     * Method that alters the speed by applying brakes.
     *
     * @param brakeNum passed in
     */
    protected void brake(int brakeNum) {
        // decreases amount of current speed
        int newSpeed = _speed - brakeNum;

        // checks if speed is at zero
        if (_speed == 0) {
            System.out.println("No change. Vehicle is at a speed of 0.");
        } else {
            _speed = newSpeed;

            // checks to make sure speed is not negative
            if (_speed < 0) {
                _speed = 0;
            }

            System.out.println("A brake of "
                + brakeNum + " km/h has been applied.");
        }
    }

    /**
     * Method that tells the user the current speed.
     */
    protected void getSpeed() {
        System.out.println("Current speed: " + _speed + " km/h");
    }

    /**
     * Method that tells the user what the max speed of a vehicle is.
     */
    protected void getMaxSpeed() {
        System.out.println("Max speed: " + _maxSpeed + " km/h");
    }

    /**
     * Method that uses polymorphism to alter format of vehicle info.
     */
    protected void getInfo() {
        System.out.println("License plate: " + _plateNum);
        System.out.println("Colour: " + _colour);
        System.out.println("Number of doors: " + _doorNum);
        System.out.println("Number of wheels: " + _wheelNum);
        System.out.println("Number of seats: " + _seatNum);
        System.out.println("Length: " + _length + " ft");
        System.out.println("Speed: " + _speed + " km/h");
        System.out.println("Max speed: " + _maxSpeed + " km/h");
    }
}
