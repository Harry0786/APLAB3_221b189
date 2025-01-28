package prob1;
class Mother {
 
    int x = 10;


    public void show() {
        System.out.println("Mother's show method. x = " + x);
    }
}


class Child extends Mother {
  
}


public class Q1 {
    public static void main(String args[]) {
        
        Mother m = new Mother();
        m.show();  


        Child ch = new Child();
        ch.show();  
    }
}
