class classA{
    void Vehicle(){
        System.out.println("A person has a Bike");
    }
}
class classB extends classA{
    void Vehicle(){
        System.out.println("A person has a Car");
        super.Vehicle();
    }
}
class classC extends classB{
    void Vehicle(){
        System.out.println("A person has a Aeroplane");
    }
}

public class Method_Overriding_with_super_1{
    public static void main(String args[]){
        classB obj = new classB();
        obj.Vehicle();
        
    }    
}
