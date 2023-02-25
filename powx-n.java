class Solution {
    public double myPow(double x, int n) {
        
        double power = 1;

        if(n==0) {
            return power;
        }

        if(n>0) {

            double temp=x;

            for(int i = 1; i<n ;i++ )
            {
                temp = temp * x ;
            }
            power = temp;
        }

        if(n<0) {
           double temp=x;

            for(int i = 1; i<n*-1 ;i++ )
            {
                temp = temp * x ;
            }
            power = 1/temp;
        }

        return power;
    }
}
