import ds.stack.array.Operation;
import ds.stack.array.stackArray;
public class Main {
    public static void main(String[] args) {
        stackArray s = new stackArray();
        Operation o = System.out::println;
        s.push(5);
        s.push(6);
        s.push(7);
        s.traverse(o);
    }
}
