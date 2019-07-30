package abstractfabrica;

public class MainApp {

    public static void main(String[] args) {
        AbstractFactory factory = FactoryMaker.getFactory("COM");

        Mouse mouse = factory.createMouse();
        Keyboard keyboard = factory.createKeyboard();
        Joystick jp = factory.createJoystick();

        mouse.click();
        keyboard.print(" P");
        jp.click();

        AbstractFactory factory1 = FactoryMaker.getFactory("USB");
        Mouse mouse1 = factory1.createMouse();
        Keyboard keyboard1 = factory1.createKeyboard();

        mouse1.click();
        keyboard1.print(" P");
    }

}
