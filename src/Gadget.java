/**
 * Created by Teacher on 2/4/2019.
 */
public class Gadget implements Comparable<Gadget> {
    private int value;

    public Gadget(int value)
    {
        this.value = value;
    }

    public int compareTo(Gadget other)
    {
        return this.value-other.value;
    }
}
