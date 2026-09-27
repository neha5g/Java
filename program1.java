/*
understanding the diff between static and public classes
can be private y/n:
  Top-level class → no, only public or unmarked
  Nested class (class inside a class) → yes
  Field (variable) → yes
  Method → yes
  Constructor → yes (less common, but legal — used when you want to force object creation only through certain other methods, e.g. a factory method)
*/

public class program1 {
  public static void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
    //cannot access keys here bcs it isnt static
    //cant access non-static element from static element
  }
  
  public void speed(int maxSpeed) {
    keys();
    System.out.println("Max speed is: " + maxSpeed);
    
  }

  private void keys() {
        System.out.println("Keys accessed");
  }
  
  public static void main(String[] args) {
      fullThrottle();
      Main car = new Main();
      car.speed(200);
  }
}
