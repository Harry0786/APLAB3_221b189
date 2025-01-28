package prob3;
class Mother {
   
    public void show() {
        System.out.println("Hello World");
    }

    
    public static void showStatic() {
        System.out.println("Static Hello World");
    }
}

class Child extends Mother {
   
    @Override
    public void show() {
        System.out.println("Hello JUET");
    }

    
    public static void showStatic() {
        System.out.println("Static Hello JUET");
    }
}

public class Q3 {
    public static void main(String[] args) {
       
        System.out.println("Test 1: Polymorphism with non-static show() method:");
        Mother m1 = new Child();
        m1.show();  

        
        System.out.println("\nTest 2: Static method in Mother only:");
        m1.showStatic();  

        
        System.out.println("\nTest 3: Static method in Child only:");
        m1.showStatic();  

        
        System.out.println("\nTest 4: Static method in both Mother and Child:");
        Mother.showStatic();  
        Child.showStatic();   

        
        System.out.println("\nTest 5: Polymorphism with static methods (should call Mother's static):");
        Mother m2 = new Child();
        m2.showStatic();  
    }
}
