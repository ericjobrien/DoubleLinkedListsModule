import org.w3c.dom.Node;

public class Noders {

    public String data;
    private Noders next;
    private Noders previous;

    public Noders(String data) {
        this.data = data;
        this.next = null;
    }

    public void setNextNoder(Noders noder) {
        this.next = noder;
    }

    public void setPreviousNoder(Noders noder) {
        this.previous = noder;
    }

    public Noders getNextNoder() {
        return this.next;
    }

    public Noders getPreviousNoder() {
        return this.previous;
    }
}
