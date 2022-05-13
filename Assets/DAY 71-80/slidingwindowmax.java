import java.io.*;
import java.util.Stack;

public class slidingwindowmax{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    // code
    Stack<Integer> st = new Stack<>();
    int[] nge = new int[a.length];
    nge[a.length-1] = a.length;
    st.push(a.length-1);
    for(int i = a.length-2;i>=0;i-- ){
        while(st.size()>0 && a[i]>a[st.peek()]){
            st.pop();
        }
        if(st.size()==0){
            nge[i] = a.length;
        }
        else{
            nge[i] = st.peek();
        }
        st.push(i);
    }
    for (int i = 0; i <= a.length-k; i++) {
        // enter loop to find max window starting from i
        int j = i;
        while(nge[j]<i+k){
            j = nge[j];
        }
        System.out.println(a[j]);
    }

 }
}
