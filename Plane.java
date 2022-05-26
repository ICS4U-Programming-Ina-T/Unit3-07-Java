/**
 * The Plane program implements an application that
 * inherits characteristics from the Vehicle class.
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-5-20
 */

class Plane extends Vehicle {
    /**
     * Property for _tailNum.
     */
    private String _tailNum;
    /**
     * Property for _colour.
     */
    private String _colour;
    /**
     * Property for _doorNum.
     */
    private int _doorNum;
    /**
     * Property for _wheelNum.
     */
    private int _wheelNum;
    /**
     * Property for _seatNum.
     */
    private int _seatNum;
    /**
     * Property for _length.
     */
    private int _length;
    /**
     * Property for _speed.
     */
    private int _speed;
    /**
     * Property for _maxSpeed.
     */
    private int _maxSpeed;

    /**
     * Constructor for class.
     *
     * @param tailNum passed in
     * @param colour passed in
     * @param doorNum passed in
     * @param wheelNum passed in
     * @param seatNum passed in
     * @param length passed in
     * @param speed passed in
     * @param maxSpeed passed in
     */
    public Plane(String tailNum, String colour, int doorNum,
        int wheelNum, int seatNum, int length, int speed, int maxSpeed) {
        // super("", colour, doorNum, seatNum, length, speed, maxSpeed);
        this._tailNum = tailNum;
        this._colour = colour;
        this._doorNum = doorNum;
        this._wheelNum = wheelNum;
        this._seatNum = seatNum;
        this._length = length;
        this._speed = speed;
        this._maxSpeed = maxSpeed;
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
        System.out.println("Tail number: " + _tailNum);
        System.out.println("Colour: " + _colour);
        System.out.println("Number of doors: " + _doorNum);
        System.out.println("Number of wheels: " + _wheelNum);
        System.out.println("Number of seats: " + _seatNum);
        System.out.println("Length: " + _length + " ft");
        System.out.println("Speed: " + _speed + " km/h");
        System.out.println("Max speed: " + _maxSpeed + " km/h");
    }
}
