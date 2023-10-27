public class CustomQueue {
    protected int []data;
    private static  final int Default_size=10;
    int end =-1;
    int st=0;
    public CustomQueue(int size){
        this.data= new int[size];
    }
    public CustomQueue(){
        this(Default_size);
    }
    public boolean isEmpty(){
        return end==-1;
    }
    public boolean isfull(){
        return (end==data.length-1);
    }
    public boolean Insert(int item){
        if(isfull()){
            System.out.println("Queue is full");
            return false;
        }
        end++;
        data[end]=item;
        return true;
    }
    public int delete() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[st++];
    }
}
