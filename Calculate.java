public class Calculate{
    private int a;
    private int b;

    public Calculate(int a, int b){
        this.a = a;
        this.b = b;
    }

    int getA(){
        return a;
    }
    int getB(){
        return b;
    }

    public int add(){
        return a + b;
    }
    public int sub(){
        return a - b;
    }
    public int multi(){
        return a * b;
    }
    public int div(){
        return a / b; 
    }
}