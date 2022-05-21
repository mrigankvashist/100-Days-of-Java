import java.io.*;
import java.util.Stack;

public class postvalconv{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Integer> vs = new Stack<>();
    Stack<String> is = new Stack<>();
    Stack<String> pre = new Stack<>();

    for(int i =0;i<exp.length();i++){
        char ch = exp.charAt(i);
        if(ch == '+' || ch == '/'||  ch == '*' || ch == '-'){
            int v2 = vs.pop();
            int v1 = vs.pop();
            int val = operation(ch,v1,v2);
            vs.push(val);

            String iv2 = is.pop();
            String iv1 = is.pop();
            String ival = "(" + iv1 + ch + iv2 + ")";
            is.push(ival);

            String pv2 = pre.pop();
            String pv1 = pre.pop();
            String pval = ch + pv1 +  pv2;
            pre.push(pval);
        }
        else{
            vs.push(ch-'0');
            is.push(ch+"");
            pre.push(ch+"");
        }
    }
    System.out.println(vs.pop());
    System.out.println(is.pop());
    System.out.println(pre.pop());
 }
 public static int operation(char op,int v1, int v2){
     if(op == '+'){
         return v1 + v2;
     }
     else if(op == '-'){
         return v1 - v2;
     }
     else if(op == '*'){
         return v1 * v2;
     }
     else if(op == '/'){
         return v1 / v2;
     }
     else return 0;
 }
}
