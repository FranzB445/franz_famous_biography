
package franz_famous_biography;

import java.util.Scanner;


public class Franz_Famous_Biography {
    public static void main(String[] args) {
     
       Scanner scanner = new Scanner (System.in);
       
       System.out.println("Enter the name of the famous person");
       String Name = scanner.nextLine();
       System.out.println(Name + ": is a one and only 8 division world boxing champion.");
       System.out.println("--------------------------");
       
       System.out.println("More information");
       System.out.println("Age ,Height,Place of birth,Birthdate,Boxing Record");
       String Age = scanner.nextLine();
       System.out.println(Age  + ": 45 years old");
       String Height = scanner.nextLine();
       System.out.println(Height + ": 1.66m");
       String PlaceofBirth  = scanner.nextLine();
       System.out.println(PlaceofBirth + ": Kibawe");
       String Birthdate = scanner.nextLine();
       System.out.println(Birthdate + ": December 17,1978" );
       String BoxingRecord = scanner.nextLine();
       System.out.println(BoxingRecord + ": 62w - 8L - 2D" );
       System.out.println("--------------------------------" );
       
       System.out.println("More information");
       System.out.println("Wife, Kids, Mother,Weight,Coach");
       String Wife = scanner.nextLine();
       System.out.println(Wife + ": Jinkee Pacquiao" );
       String Kids = scanner.nextLine();
       System.out.println(Kids+ ": 4 kids" );
       String Mother = scanner.nextLine();
       System.out.println(Mother + ": Dionesia Pacquiao");
        String Weight = scanner.nextLine();
        System.out.println(Weight + ": 66kg");
        String Coach = scanner.nextLine();
        System.out.println(Coach + ": Freddie Roach and Buboy Fernandez");
        
        
       
       
       
       
    }
    
}
