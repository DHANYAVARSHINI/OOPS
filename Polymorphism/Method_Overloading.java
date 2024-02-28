public class Method_Overloading{
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a, float b){
        System.out.println(a+b);
    }
    void add(float a, float b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void add(float a, float b, float c){
        System.out.println(a+b+c);
    }
    
    public static void main(String args[]){
        Method_Overloading obj = new Method_Overloading();
        obj.add(2,3); // first method
        obj.add(2,3.5f); // second method
        obj.add(4.5f,7.6f); //third method
        obj.add(3,8,9); // fourth method
        obj.add(6.4f,5.3f,8.6f); // fifth method
    }
    
} 