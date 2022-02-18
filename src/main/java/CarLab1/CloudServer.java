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
public class CloudServer implements SelfCheckCapable {

	private String computingservice;
	
	public void showupdates() {
		// it shows updates available 
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "CloudServer";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.7);
	}
}
