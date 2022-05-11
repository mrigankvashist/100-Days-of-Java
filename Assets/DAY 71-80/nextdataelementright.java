import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class nextdataelementright{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
   // solve
   Stack<Integer> st = new Stack<>(); // creating new stack
   int[] nge = new int[arr.length]; // next greatest element array to be returned
   st.push(arr[arr.length-1]);  //  pushing the rightmost element of the array in the stack since its NGE = -1 (since nothing on its right)
   nge[arr.length-1] = -1; 
   for (int i = arr.length-2; i >=0; i--) { // last spot of nge is filled with -1 
       // pop / ans / push => only three things possible
       while(st.size()>0 && arr[i] >= st.peek()){  // stack will keep popping till stack size is not zero and till a larger number is not found
           st.pop();
       }
       if(st.size()==0){ // if stack size becomes zero => the element in stack is largest therefore its NGE will be -1
           nge[i] = -1;
       }
       else{
           nge[i] = st.peek();  // if a larger element is found, then that element is its NGE
       }
       st.push(arr[i]); // the array number is then pushed in the stack for checking for the other leftward lying elements
   }



   
   return nge;
 }

}
