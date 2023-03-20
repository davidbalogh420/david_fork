package hu.bme.mit.train.interfaces;

public interface TrainController {

	void followSpeeeed();

	int getReferenceSpeed();

	void setSpeedLimit(int speedLimit);

	void setJoystickPosition(int joystickPosition);
	

}
