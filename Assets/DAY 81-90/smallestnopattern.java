import java.io.*;
import java.util.Stack;

public class smallestnopattern {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // code
        Stack<Integer> st = new Stack<>();
        int num = 1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'd') { // for d, num is entered, pushed in stack and increased. stack fills in reverse
                             // from i to d towards the left
                st.push(num);
                num++;
            } else { // if i is there in the string
                st.push(num); // for i, num is entered, pushed in stack and increased. stack fills in reverse
                              // from i to d towards the left
                num++;
                while (st.size() > 0) {
                    System.out.print(st.pop()); // stack is popped whenever i comes up in the stack, reflling starts
                                                // from the next i towards the left
                }
            }
        }

        st.push(num); // the last number towards the right of the last present i, since the stack
                      // fills towards the left of the i
        while (st.size() > 0) {
            System.out.print(st.pop());
        }

    }
}