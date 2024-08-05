import java.util.Scanner;
 class firstinput{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("The number we get:" + n);
        in.nextLine();
        String s =in.nextLine();
        System.out.println("The data we get after encoding" + s);
        float f1 = 2.3f;
        float f2 = 4.8f;
        float p = f1*f2;
        System.out.println(" The output is " + p);

    }   
 }