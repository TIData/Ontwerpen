
import domein.Madonna;

public class StartUp {

    public static void main(String args[]) {
        Madonna madonna1 = Madonna.getInstance();
        Madonna madonna2 = Madonna.getInstance();

        madonna1.zingEenLied();
        madonna2.zingEenLied();
    }
}
