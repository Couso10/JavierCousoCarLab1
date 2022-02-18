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
public class ComputerApp implements SelfCheckCapable {

	private String wirelessconnection;
	
	public void showfootage() {
		// shows what the camera is seeing
	}
	
	public void movecar() {
		// can control the car
	}
	
	public void showbattery() {
		// it tells how much battery you have left
	}
	
	public void showinformation() {
		// shows other important information about car
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "ComputerApp";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.7);
	}
}
