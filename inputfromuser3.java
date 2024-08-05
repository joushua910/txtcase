import java.util.Scanner;
class inputfromuser3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("The enter integer is:" + a);
        in.nextLine();
        String h =in.nextLine();
        System.out.println("The data to be entered is:" + h);
    }
}