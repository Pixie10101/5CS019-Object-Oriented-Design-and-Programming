public class Question4 {
    public static void main(String[] args) {
        int a=6;
        int b=8;
        int c=10;
        double s=(a+b+c)/2.0;
        System.out.println("Semiperimeter:" +s);
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area:" +area);
    }
}
