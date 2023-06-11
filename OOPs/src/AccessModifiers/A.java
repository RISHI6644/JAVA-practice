package AccessModifiers;

public class A {
    private int id;
    String name;
    int[] arr;
    protected int num;

    // We can use getter and setter methods to access the private properties
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public A(int id, String name, int[] arr, int num) {
        this.id = id;
        this.name = name;
        this.arr = arr;
        this.num = num;
    }
}
