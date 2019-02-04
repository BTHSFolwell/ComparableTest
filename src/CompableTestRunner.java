/**
 * Created by Teacher on 2/4/2019.
 */
public class CompableTestRunner {
    public static void main(String args[])
    {
        //Compare two "Gadgets"
        Gadget g1 = new Gadget(1);
        Gadget g2 = new Gadget(2);
        System.out.println("g1.comareTo(g2) = "+g1.compareTo(g2));

        //Make a sorted array of "Gadgets"
        Comparable[] sortedArr = {new Gadget(10),
                              new Gadget(20),
                              new Gadget(30),
                              new Gadget(40)};
        //Check if it's sorted
        System.out.println("isSorted(sortedArr) = "+ isSorted(sortedArr));
    }

    //returns true if array "arr" is sorted false if not
    public static boolean isSorted(Comparable[] arr)
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            if (arr[i].compareTo(arr[i + 1]) > 0)
                return false;
        }
        return true;
    }
}
