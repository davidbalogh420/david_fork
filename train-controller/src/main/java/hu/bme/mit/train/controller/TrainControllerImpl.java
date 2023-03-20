package hu.bme.mit.train.controller;

import hu.bme.mit.train.interfaces.TrainController;

public class TrainControllerImpl implements TrainController {

	private int step = 0;
	private int referenceSpeed = 0;
	private int speedLimit = 0;
	//private int emergencySpeed=0;
	//private boolean obstacle=false;

	@Override
	public void followSpeed() {

		
			emergencyBreakOff();
		if (referenceSpeed < 0) {
			referenceSpeed = 0;
		} else {
		    if(referenceSpeed+step > 0) {
                referenceSpeed += step;
            } else {
		        referenceSpeed = 0;
            }
		}

		enforceSpeedLimit();
	}
	

	@Override
	public int getReferenceSpeed() {
		return referenceSpeed;
	}

	public void setReferenceSpeed(int a){
		referenceSpeed=a;
	}

	
	@Override
	public void setSpeedLimit(int speedLimit) {
		this.speedLimit = speedLimit;
		enforceSpeedLimit();
		
	}

	private void enforceSpeedLimit() {
		if (referenceSpeed > speedLimit) {
			referenceSpeed = speedLimit;
		}
	}

	@Override
	public void setJoystickPosition(int joystickPosition) {
		this.step = joystickPosition;		
	}

	public void toggleObstacle(boolean ob){
		if(ob==false){
			obstacle=true;
			return;
		}

		obstacle=false;
		return;


	}





}
