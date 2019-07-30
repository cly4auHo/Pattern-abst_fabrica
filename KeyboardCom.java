package abstractfabrica;

public class KeyboardCom implements Keyboard {

    @Override
    public void print(String s) {
        System.out.println("KeyboardCom is printing" + s);
    }

}
