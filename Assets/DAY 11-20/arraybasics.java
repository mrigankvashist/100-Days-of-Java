public class arraybasics {
    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {    
        int[] arr;
        // array has no effect on perfomrance depending on the address given
        arr = new int[5];
        arr[0] = 33;
        arr[1] = 30;
        arr[2] = 31;
        arr[3] = 53;
        arr[4] = 99;

        swap(arr,0,4);

        // System.out.println(arr.length);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        // both arr,two arrays will point at same heap memory since "new" is not used, therefore arr is shallow copied and change in any one will result in change in values of both

        int [] two = arr;
        two[2] = 590;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); 
            
        }
    }

}
