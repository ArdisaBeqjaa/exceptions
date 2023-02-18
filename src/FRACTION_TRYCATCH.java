import java.util.Scanner;

public class FRACTION_TRYCATCH {
    public  static void main(String args[]){
        int n;
        int d;
        Scanner input=new Scanner(System.in);
        try{
            d=input.nextInt();
            if(d==0)throw new Null();
        }
        catch (Null e){
            System.out.println(e);
        }
    }
}
