class maxcards {
    public int maxScore(int[] cardPoints, int k) {
        int fs = 0;
        int bs = 0;
        int front = 0;
        int back = cardPoints.length-1;
        for(int i = 0; i<k; i++){
            fs += cardPoints[front++];
        }
        int max = fs;
        for(int i = 0; i<k; i++){
            bs += cardPoints[back--];
            fs -= cardPoints[--front];
            max = Integer.max(max,fs+bs);
        }
        return max;
        
    }
}
