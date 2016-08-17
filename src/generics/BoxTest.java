package generics;

/**
 * Created by Justin on 3/6/2016.
 */
public class BoxTest {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();

        box1.setBoxed(123);
        System.out.print(box1.getBoxed());
    }
}
