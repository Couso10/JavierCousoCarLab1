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
public class LineTracking extends sensor  implements SelfCheckCapable {

	private String light;
	
	public void detectline() {
		//it can detect a line that it can see with light
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "LineTracking";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.6);
	}
}
