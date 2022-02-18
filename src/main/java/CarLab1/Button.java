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
public class Button extends Component implements SelfCheckCapable {

	private boolean onoffstate;
	
	public void turnon() {
		// turn on the lights
	}
	
	public void turnoff() {
		// turn off the lights
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Button";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}
	

}