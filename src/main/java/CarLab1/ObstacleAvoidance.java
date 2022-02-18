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
public class ObstacleAvoidance extends sensor implements SelfCheckCapable {

	private String object;
	
	public void detectobject() {
		// it can detect an object nearby
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "ObstacleAvoidance";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.6);
	}
}
