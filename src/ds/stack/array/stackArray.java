package ds.stack.array;

public class stackArray{

   private  int top , size;
   private final int[] arr ;
   private final int MAXSIZE = 5;
    public stackArray(){
        top = -1;
        size = 0;
        arr = new int[MAXSIZE];
    }
    public void push(int element){
        arr[++top] = element;
        size++;
    }
    public int pop() {
        size--;
        return arr[top--];
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return MAXSIZE==top-1;
    }
    public int getSize(){
        return size;
    }
    public void clear(){
        top = 0;
        size = 0;
    }
    public void traverse(Operation op){
        for (int i = top; i >=0 ; i--)
            op.fun(arr[i]);
    }

}
