package Interface;


public class interface_Methods {
    public static void main(String[] args) {
         // static method calling 
        Vehical.Rules();

        Vehical v = null; 

        v = new Car();
        v.Start();
        v.Music();
        // Down Casting  
        ((Car)v).SeatBelt(); 
        v = new Bike();
        v.Start();
        v.Music();
    }
}

interface Vehical{
    // Abstract method : Method in Interface are by default public abstract  
    void Start();

    // Default method : use when method have common logic and don't need to override compulsary
    default void Music() {
        System.out.println("Music Feature is upcoming!!!");
    }

    // static method : Call by interface name class level method
    static void Rules(){
        System.out.println("Speed under 30");
    }
}
class Car implements Vehical{
    public void Start(){
        System.out.println("Car Starting!!!");
    }
    public void Music(){
        System.out.println("Hale dil music is playying");
    }
    public void SeatBelt(){
        System.out.println("Having Seatbelt");
    }
}
class Bike implements Vehical{
    public void Start(){
        System.out.println("Bike Starting!!!");
    }
    
}