 class gfg{
    static void swapValuesUsingThirdVariable(int m,int n){
        int temp = m;
        m=n;
        n=temp;
        System.out.println(" Value of m is " + m + " value of n is " + n);
    }
        public static void main(String[]args){
            int m = 9; 
            int n = 8;
            swapValuesUsingThirdVariable(m,n);
        }
    }
 