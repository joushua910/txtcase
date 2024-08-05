import java.util.Scanner;
 class inputfromuser{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        System.out.println("the entered string is:" + a);
        int i = in.nextInt();
        System.out.println("the entered integer is:" + i);
    }
 }