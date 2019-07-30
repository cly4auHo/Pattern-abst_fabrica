package abstractfabrica;

public interface AbstractFactory {

    Mouse createMouse();
    Keyboard createKeyboard();
    Joystick createJoystick();
}
