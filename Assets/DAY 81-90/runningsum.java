
public class runningsum {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        for(int i =1;i<a.length;i++){
            a[i] = a[i] + a[i-1];
        }
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
        
    }
}