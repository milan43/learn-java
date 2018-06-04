package nestedclass;

public class LocalInnerClass {

    public static void main(String[] args) {
     Outer1 out = new Outer1();
     out.getPerson();
    }

}

class Outer1{
    void getPerson(){
            class LocalClass{//local class cannot have any modifier
            private int i;
            public LocalClass(int i){
            this.i = i;
            }

            public int getI() {
                return i;
            }

            public void setI(int i) {
                this.i = i;
            }
        }
        LocalClass lc = new LocalClass(10);
        System.out.println(lc.getI());
    }
}
