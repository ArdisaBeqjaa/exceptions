public class fraction {
    private  int n;
    private  int d;
    fraction(int n,int d)throws Null{
        if(d==0)throw new Null();
        else {
            this.d=d;
            this.n=n;
        }
    }
}
