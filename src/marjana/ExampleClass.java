package marjana;

public class ExampleClass {
    public int x;
    ExampleClass(){
        x = 0;
        System.out.println("an object");
    }
    ExampleClass(int x){
        this.x = x;
        x = 10;

    }
    void showValue (ExampleClass e){
        System.out.println("X = " +e.x);
    }
    public class TestClass{

        public static void main(String [] args){
            ExampleClass a, b, c;
            a = new ExampleClass();
            b = new ExampleClass(5);
            c = a;
            c.x = 15;
            a.showValue(b);
            b.showValue(c);
            System.out.println("X= " +a.x);
        }
    }
}
