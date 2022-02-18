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
public class Lights implements SelfCheckCapable {

	private String ledlights;
	
	public void changecolor() {
		// it changes the color of the light on the car
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Lights";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}
}
