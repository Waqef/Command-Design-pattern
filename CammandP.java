
package cammandp;


public class CammandP {

   
      public static void main( String[] args )
    {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl(lightOnCommand);

        simpleRemoteControl.onButtonWasPressed();
    }
    
}








