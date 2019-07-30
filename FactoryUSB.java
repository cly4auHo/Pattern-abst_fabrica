package abstractfabrica;

public class FactoryUSB implements AbstractFactory {

    @Override
    public Mouse createMouse() {
        return new MouseUSB();
    }

    @Override
    public Keyboard createKeyboard() {
        return new KeyboardUSB();
    }

    @Override
    public Joystick createJoystick() {
        return new JoystickUSB();
    }
}
