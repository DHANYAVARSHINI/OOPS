class vehicle{
    String brand,color;
    int wheels,seats;
    
    void brake(){
        System.out.println("Brake is applied");
    }
    void accelerator(){
        System.out.println("Accelerator is applied");
    }
}

class car extends vehicle{
    void airbag(){
        System.out.println("Airbag is applied");
    }
    void ac(){
        System.out.println("AC is applied");
    }
}

public class Single_Inheritance{
    public static void main(String args[])
    {
        car car1=new car();
        System.out.println("Car Details:\n");
        car1.airbag();
        car1.ac();
        car1.brake();
        car1.accelerator();
        car1.brand="BMW";
        car1.color="Blue";
        car1.wheels=4;
        car1.seats=5;
        System.out.println("Car Brand: "+car1.brand);
        System.out.println("Car Colour: "+car1.color);
        System.out.println("Car Wheels: "+car1.wheels);
        System.out.println("Car Seats: "+car1.seats);
    }
}