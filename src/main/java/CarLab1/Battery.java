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
public class Battery implements SelfCheckCapable {

	private String type;
	private int amountofpower;
	
	public void fullcharge() {
		// the battery is charged fully
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Battery";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.7);
	}
}
