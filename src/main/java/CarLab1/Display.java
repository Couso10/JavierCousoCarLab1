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
public class Display extends Component implements SelfCheckCapable {

	private String color;
	private String dotmatrix;
	
	public void showmessage() {
		// it shows the expression being done
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Display";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.6);
	}
}
