package abstractfabrica;

public class FactoryCom implements AbstractFactory {

    @Override
    public Mouse createMouse() {
        return new MouseCom();
    }

    @Override
    public Keyboard createKeyboard() {
        return new KeyboardCom();
    }

    @Override
    public Joystick createJoystick() {
        return new JoystickCom();
    }

}
