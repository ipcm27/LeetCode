public class Richest_Customer_Wealth_1672 {


        public static int maximumWealth(int[][] accounts) {
            int maxWealthSoFar =0;

            for (int[] customer : accounts){
                int currentCustomerWealth =0;
                for(int bank : customer){
                    currentCustomerWealth += bank;
                }

                maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);
            }
            return maxWealthSoFar;

        };


        public static void main(String args[]){

    }
}
