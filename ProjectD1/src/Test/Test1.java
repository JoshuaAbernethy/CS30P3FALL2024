package Test;


//Add Phidgets Library
import com.phidget22.*;

public class Test1 {
  public static void main(String[] args) throws Exception {

      //Connect to wireless rover
      Net.addServer("", "192.168.100.1", 5661, "", 0);

      //Create
      
      DCMotor leftMotors = new DCMotor();
      DCMotor rightMotors = new DCMotor();

      //Address
      leftMotors.setChannel(0);
      rightMotors.setChannel(1);

      //Open
      leftMotors.open(5000);
      rightMotors.open(5000);

      //Turn in one direction
     
      leftMotors.setTargetVelocity(0.5);
      rightMotors.setTargetVelocity(-0.5);

      //How long the rovr will run for
      Thread.sleep(2200);
      
      leftMotors.setTargetVelocity(0);
      rightMotors.setTargetVelocity(0);

      //How long the rovr will run for
      Thread.sleep(1000);
      //
      
      
      
      
      
      
      
      
      
  
  
  
  
  
  
  }
}