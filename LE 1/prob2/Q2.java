package prob2;
class Mother {
   
    public void show() {
        System.out.println("Hello World");
    }
}

class Child extends Mother {
    
    @Override
    public void show() {
        System.out.println("Hello JUET");
    }
}

public class Q2 {
    public static void main(String[] args) {
        
        Mother obj = new Child();
        
        
        obj.show();  
    }
}
