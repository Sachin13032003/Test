public class CustomStack {
    protected int [] data;
    private static final int default_size=10;
    int ptr=-1;
    public CustomStack(){
        this(default_size);
    }
    public CustomStack(int Size) {
        this.data=new int[Size];
    }
    public boolean push(int item){
        if(isfull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public boolean isfull(){
        return (ptr==data.length-1);
    }
    public int pop() throws Exception{
        if(isEmpty()){
           throw new Exception("cannot pop because the stack is empty ");
        }
        return data[ptr--];
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
    public int peek() throws Exception{
         if(isEmpty()){
           throw new Exception("cannot pop because the stack is empty ");
        }
        return data[ptr];
    }
    public void Display(){
        for (int i = ptr; i >=0; i++) {
            System.out.println(data[i]);
            ptr--;
        }
    }
}
