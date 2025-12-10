package Interface;

import java.util.Scanner;

public class Interface_Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal = null;
        System.out.println("Enter your choice\n1.Dog sound\n2.Cat sound\n3.Horse sound");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                animal = new Dog();
                animal.sound();
                break;
            case 2:
                animal = new Cat();
                animal.sound();
                break;
            case 3:
                animal = new Horse();
                animal.sound();
                break;
                
            default:
                System.err.println("Invalid choice!!!");
                break;
        }
        sc.close();
    }
}
interface Animal{
    void sound();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Bhwaaa Bhwaaa");
    }
}
class Cat implements Animal{
    public void sound(){
        System.out.println("Mewwoo Mewwoo");
    }
}
class Horse implements Animal{
    public void sound(){
        System.out.println("Hurrrr Hurrrr");
    }
}