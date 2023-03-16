package lec1;

public class Stack_client {
    public static void main(String[] args) throws Exception {
        Stack st=new Stack(10); //constructor by defult call hoga
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.display();
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        st.display();
        
    }
    
}
