package abstractfabrica;

public class JoystickUSB implements Joystick {

    @Override
    public void click() {
        System.out.println("JoystickUSB click");
    }

}
