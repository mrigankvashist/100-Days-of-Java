import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

// next greatest element on the left

public class stockspan{
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

    int[] span = solve(a);
    display(span);
 }

 public static int[] solve(int[] arr){

   // Steps: 1. Pop     2. Find answer      3. push
   
   Stack<Integer> st = new Stack<>();  
   int[] span = new int[arr.length];  // stock span value
   // stack is storing th values of index this time so as to compare easily the differences between the stock ranges. ( simply subtracting the higher and lower index to find the span between them)
   st.push(0);   // pushing the first index in the stack
   span[0] = 1;  // initialising the span of first index as 1, since its span is i+1, as in for 0th index it would be 1 (spanning over that day's stock price)
   for(int i =1;i<span.length;i++){ // loop starting from 2nd index
       while(st.size() >0 && arr[i]>arr[st.peek()]){  // conditions of stack i.e. till stack size is non zero and the number in stack is less than the array number, the stack keeps popping
           st.pop();
       }
       if(st.size() == 0){  // if size zero i.e. the number is the greatest therefore its span would range till the 0th index i.e. i+1
           span[i] = i + 1;
       }
       else{
           span[i] = i - st.peek();  // if a larger number is found, its span would be i - larger number in stack(since indexes are stored in stack)
       }
       st.push(i); // pushing the index for further comparisons in the stack
   }
   return span;

 }

}
