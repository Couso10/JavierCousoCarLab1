/**
 * 
 */
package CarLab1;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * @author JavierC
 *
 */
public class IRremote implements SelfCheckCapable {

	private int size;
	private String infrared;
	private String color;
	
	public void turnon() {
		// it turns on the car
	}
	
	public void turnoff() {
		// it turns off the car
	}
	
	public void turnright() {
		// it turns the car to the right
	}
	
	public void turnleft() {
		// it turns the car to the left
	}
	
	public void turnback() {
		// it can turn the car around
	}
	
	public void gostraight() {
		// it makes the car go straight
	}
	public void itbrakes() {
		// it makes the car stop
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "IRremote";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.7);
	}
	

	
}
