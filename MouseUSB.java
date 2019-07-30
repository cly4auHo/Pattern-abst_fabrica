package abstractfabrica;

public class MouseUSB implements Mouse {

    @Override
    public void click() {
        System.out.println("MouseUSB is click");
    }

    @Override
    public void dclick() {
        System.out.println("MouseUSB is double click");
    }

    @Override
    public void scroll() {
        System.out.println("MouseUSB is scrolling");
    }

}
