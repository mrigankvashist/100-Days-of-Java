import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        System.out.println(st);
        st.push(30);
        System.out.println(st);
        st.push(40);
        System.out.println(st.peek() + " " + st.size() + " " + st);
        st.pop();
        System.out.println(st.peek() + " " + st.size() + " " + st);
        st.pop();
        System.out.println(st.peek() + " " + st.size() + " " + st);
        st.pop();
        System.out.println(st.peek() + " " + st.size() + " " + st);
        st.pop();
        System.out.println( " " + st.size()+ " " + st);

    }
}
