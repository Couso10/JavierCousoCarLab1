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
public class Tires extends Component implements SelfCheckCapable {

	private int size;
	private String location;
	private String color;
	
	public void moveforward() {
		// it helps the car move forward
	}
	
	public void moveleft() {
		// it helps the car move to the left
	}
	
	public void moveright() { 
		// it helps the car move to the right
	}
	
	public void movebackwards() {
		// it helps the car move backwards
	}
	
	public void spin() {
		// it helps the car spin around
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Tires";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.7);
	}
}
