public class IllegalTriangleException {
    public static void main(String args[])  {
        try {
            Triangle triangle=new Triangle(1,2,0);
        } catch (IlegalTriangle e) {
            throw new RuntimeException(e);
        }

    }
}
