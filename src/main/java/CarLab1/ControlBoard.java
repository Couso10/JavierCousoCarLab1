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
public class ControlBoard implements SelfCheckCapable {

	private int size;
	private String location;
	private String connections;
	
	public void circulatespower() {
		// controls and circulates the power of the whole car
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "ControlBoard";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.9);
	}
}
