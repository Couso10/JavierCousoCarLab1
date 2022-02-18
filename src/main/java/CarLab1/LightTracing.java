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
public class LightTracing extends sensor implements SelfCheckCapable {

	private String color;
	private String light;
	
	public void detectlight() {
		// it can detect the light near it
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "LightTracing";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.7);
	}
}
