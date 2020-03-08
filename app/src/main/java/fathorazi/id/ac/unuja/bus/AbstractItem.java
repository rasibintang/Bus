package fathorazi.id.ac.unuja.bus;

public abstract class AbstractItem {
    public static final int TYPE_CENTER = 0;
    public static final int TYPE_EDGE = 1;
    public static final int TYPE_EMPTY = 2;
    private String label;

    public abstract int getType();

    public AbstractItem(String str) {
        this.label = str;
    }

    public String getLabel() {
        return this.label;
    }
}
