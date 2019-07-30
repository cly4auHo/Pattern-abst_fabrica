package abstractfabrica;

public class KeyboardUSB implements Keyboard {

    @Override
    public void print(String s) {
        System.out.println("KeyboardUSB is printing" + s);
    }

}
