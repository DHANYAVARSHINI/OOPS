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

class bike extends vehicle{
    void handlebar(){
        System.out.println("Handlebar is available");
    }
    void stand(){
        System.out.println("Stand feature is available");
    }
}


public class Hierarchical_Inheritance{
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
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("Bike Details:\n");
        bike bike1=new bike();
        bike1.brake();
        bike1.accelerator();
        bike1.handlebar();
        bike1.stand();
        bike1.brand="Fz";
        bike1.color="Black";
        bike1.wheels=2;
        bike1.seats=2;
        System.out.println("Bike Brand: "+bike1.brand);
        System.out.println("Bike Colour: "+bike1.color);
        System.out.println("Bike Wheels: "+bike1.wheels);
        System.out.println("Bike Seats: "+bike1.seats);
    }
}