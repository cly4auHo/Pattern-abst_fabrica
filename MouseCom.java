package abstractfabrica;

public class MouseCom implements Mouse {

    @Override
    public void click() {
        System.out.println("MouseCom is click");
    }

    @Override
    public void dclick() {
        System.out.println("MouseCom is dclick");
    }

    @Override
    public void scroll() {
        System.out.println("MouseCom is scrolling");
    }

}
