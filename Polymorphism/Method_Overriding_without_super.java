class classA{
    void Vehicle(){
        System.out.println("A person has a Bike");
    }
}
class classB extends classA{
    void Vehicle(){
        System.out.println("A person has a Car");
    }
}
class classC extends classB{
    void Vehicle(){
        System.out.println("A person has a Aeroplane");
    }
}

public class Method_Overriding_without_super{
    public static void main(String args[]){
        classC obj = new classC();
        obj.Vehicle();
    }    
}
