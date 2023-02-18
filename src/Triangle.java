import javax.swing.*;

public class Triangle {
    private  int a;
    private int b;
    private int c;
    Triangle(int a,int b,int c) throws IlegalTriangle{
       if(a+b<c||b+c<a||a+c<b) throw new IlegalTriangle();
       else{
           this.a=a;
           this.b=b;
           this.c=c;
        }
    }
}
