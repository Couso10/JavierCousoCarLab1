/**
 * 
 */
package CarLab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

/**
 * My car model class
 * @author JavierC
 *
 */
public class CarModel implements GenericComponent {

	private String color;
	private String model;
	private String brand;
	private double price;
	private String bluetooth;
	private Tires myTires;
	private Battery myBattery;
	private Button myButton;
	private Camera myCamera;
	private ComputerApp myComputerApp;
	private ControlBoard myControlBoard;
	private Display myDisplay;
	private IRremote myIRremote;
	private Lights myLights;
	private LightTracing myLightTracing;
	private ObstacleAvoidance myObstacleAvoidance;
	private CloudServer myCloudServer;
	
	public CarModel() {
		myTires = new Tires();
		myBattery = new Battery();
		myButton = new Button();
		myCamera = new Camera();
		myComputerApp = new ComputerApp();
		myControlBoard = new ControlBoard();
		myDisplay = new Display();
		myIRremote = new IRremote();
		myLights = new Lights();
		myLightTracing = new LightTracing();
		myObstacleAvoidance = new ObstacleAvoidance();
		myCloudServer = new CloudServer();
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Freenove";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public List<SelfCheckCapable> getSubComponents() {
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, myTires, myBattery, myButton, myCamera, myComputerApp, myControlBoard, myDisplay, myIRremote, myLights, myLightTracing, myObstacleAvoidance, myCloudServer); // add all your sub components
		return internalComponents;
	}

}
