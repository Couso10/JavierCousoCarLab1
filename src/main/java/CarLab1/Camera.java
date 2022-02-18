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
public class Camera implements SelfCheckCapable {

	private String lens;
	private int size;
	
	public void capturevideo() {
		// it gets the video from the car perspective
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Camera";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.6);
	}
}
