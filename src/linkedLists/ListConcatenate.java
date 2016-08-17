package linkedLists;

/**
 * Created by Justin on 3/11/2016.
 */
public class ListConcatenate
{
    public static void main(String[] args)
    {
        try
        {
            List<Integer> list1 = new List<>("list1");
            list1.insertAtFront(10);
            list1.insertAtBack(20);
            list1.insertAtBack(30);
            list1.print();

            List<Integer> list2 = new List<>("list2");
            list2.insertAtFront(-10);
            list2.insertAtBack(-20);
            list2.insertAtBack(-30);
            list2.print();

            concatenate(list1, list2);
            list1.print();
            list2.print();
        }
        catch (EmptyListException e)
        {
            e.printStackTrace();
        }
    }

    public static <T> void concatenate(List<T> list1, List<T> list2){
        while (!list2.isEmpty()) {
            list1.insertAtBack(list2.getFirstNode().getData());
            list2.removeFromFront();
        }
        System.out.println("Concatenating lists...");
    }
}
