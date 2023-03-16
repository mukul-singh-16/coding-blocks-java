package lec1;

public class Stack {
    private int arr[];
    private int tos;
    
    public Stack(){
        arr=new int[5];
        tos=-1;
    }
    public Stack(int n){
        arr=new int[n];
        tos=-1;
    }
    public boolean isEmpty()
    {
        return tos == -1;
    }
    public void push(int n) throws Exception
    {
        if(isFull())
            throw new Exception("Stack Is Full");
        tos++;
        arr[tos]=n;
    }

    public boolean isFull()
    {
        if(tos==arr.length -1)
            return true;
        return false;
    }

    public int pop() throws Exception
    {
        if(isEmpty())
        throw new Exception("Stack Is Empty");
        tos--;
        return arr[tos+1];
    }
    public int size()
    {
        return tos+1;
    }
    
    public int peek()throws Exception
    {
        if(isEmpty())
            throw new Exception("Stack Is Empty");
        return arr[tos];
    }
    public void display()
    {
        for(int i=0;i<=tos;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }


}
