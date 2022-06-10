public class twosumsorted {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int a = 0;
        int b = 0;
        int j = numbers.length - 1;
        for(int x =0;x<numbers.length;x++){
            if(numbers[i] + numbers[j] == target){
                a = i+1;
                b = j+1;
            }
            else if(numbers[i] + numbers[j] > target){
                j--;
            }
            else i++;
        }
        int[] r = new int[2];
        r[0] = a;
        r[1] = b;
        return r;
    }
}