import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args)  {
        System.out.println(biggestNr());
    }
    public static int biggestNr(){

        int x,y,z;
        int max=0;
        Scanner input=new Scanner(System.in);

        try{
            x=input.nextInt();
            y=input.nextInt();
            z=input.nextInt();

            if(x<=0||y<=0||z<=0){
                throw new Invalid();
            }
//            find max
            else if(x>y&&x>z)max=x;
            else if(y>x&&y>z)max=y;
            else max=z;
        }
        catch (InputMismatchException e){
            System.out.println("enter only integer");
        } catch (Invalid e) {
            throw new RuntimeException(e);
        }
        finally {
            if(max>0) System.out.println("everything is going great!");
            else System.out.println("an error occured!!");
        }
        return max;
    }
}
