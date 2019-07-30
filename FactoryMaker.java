package abstractfabrica;

public class FactoryMaker {

    public static AbstractFactory getFactory(String type) {
        if (type.equals("USB")) {
            return new FactoryUSB();
        }
        if (type.equals("COM")) {
            return new FactoryCom();
        }
        throw new IllegalArgumentException("Allo");
    }

}
