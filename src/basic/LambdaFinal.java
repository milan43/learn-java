package basic;

interface Printable {
    void printNumber();
}

public class LambdaFinal{
        int i =10;
    public void printValue(){
        int j = 20; //here j will be effectively final
        String []s = {"Hi", "Hey", "What's up"};
        Printable p = ()->{
            s[0] = "Hello";
            i=30;
           // j=50; variable used inside lambda should be final or effectively final

            System.out.println(i);
            System.out.println(j);
            System.out.println(s.length);
        };
        p.printNumber();
    }

    public static void main(String[] args) {
        LambdaFinal lf = new LambdaFinal();
        lf.printValue();
    }

}
