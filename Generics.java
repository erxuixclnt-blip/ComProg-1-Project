public class TriPrism<E extends Numbers>  {

    private T length;
    private T base;
    private T height;

    // Setter methods
    public void setLength(T length) {
        this.length = length;
    }

    public void setBase(T base) {
        this.base = base;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    // Getter methods
    public T getLength() {
        return length;
    }

    public T getBase() {
        return base;
    }

    public T getHeight() {
        return height;
    }

    // Volume computation
    public double getVolume() {
        return length.doubleValue() *
               (0.5 * base.doubleValue() * height.doubleValue());
    }

    // Main method
    public static void main(String[] args) {

        TriPrism<Double> prism = new TriPrism<>();

        prism.setLength(10.0);
        prism.setBase(5.0);
        prism.setHeight(4.0);

        System.out.println("Length: " + prism.getLength());
        System.out.println("Base: " + prism.getBase());
        System.out.println("Height: " + prism.getHeight());
        System.out.println("Volume: " + prism.getVolume());
    }
}
