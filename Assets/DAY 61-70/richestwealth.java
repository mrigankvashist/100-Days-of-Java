public class richestwealth {
        public int maximumWealth(int[][] accounts) {
            int wealth = 0;
            
            for(int i =0;i<accounts.length;i++){
                int sumrow = 0;
                for(int j =0;j<accounts[0].length;j++){
                    sumrow += accounts[i][j];
                }
                wealth = Integer.max(wealth,sumrow);
            }
            return wealth;
            
        }
    }
