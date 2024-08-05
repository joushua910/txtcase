class gfg2{
    static void swapValuesUsingThirdVariable(int m,int n){
        int temp = m;
        m=n;
        n=temp;
        System.out.println(" The value of m is " + m + " the value of n is " + n);

    }
    public static void main(String[]args){
        int m = 4;
        int n = 6;
        swapValuesUsingThirdVariable(m,n);
    }
}