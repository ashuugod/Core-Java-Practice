package Interface;

import java.util.Scanner;

public class Interface_Variables {
    public static void main(String[] args) {
        
        System.out.println("Bullets: " + Gun.BULLET);
        Gun.GunRule(); // static method
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Gun Type: 1. SMG  2. ShotGun  3. Rifle");
        
        int choice = sc.nextInt();
        Gun gun = null;

        switch(choice){
            case 1:
                gun = new SMG();
                break;

            case 2:
                gun = new ShotGun();
                break;

            case 3:
                gun = new Rifle();
                break;

            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        // Print gun details
        System.out.println("Color: " + gun.getColor());
        System.out.println("Weight: " + gun.getWeight());
        System.out.println("Range: " + gun.getRange());

        sc.close();
    }
}

interface Gun{
    int BULLET = 40;

    int getRange();
    double getWeight();
    String getColor();

    static void GunRule(){
        System.out.println("Use only for Self-Defense");
    }
}

class SMG implements Gun{
    public int getRange(){ return 4; }
    public double getWeight(){ return 3.4; }
    public String getColor(){ return "Matt Black"; }
}

class ShotGun implements Gun{
    public int getRange(){ return 16; }
    public double getWeight(){ return 2.0; }
    public String getColor(){ return "Grey"; }
}

class Rifle implements Gun{
    public int getRange(){ return 12; }
    public double getWeight(){ return 3.0; }
    public String getColor(){ return "Black"; }
}
