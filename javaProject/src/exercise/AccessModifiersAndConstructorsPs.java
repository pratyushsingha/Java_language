package exercise;


//1.
class cylinder {
  private int radius;
  private int height;


  public int getHeight() {
      return height;
  }

  public void setHeight(int height) {
      this.height = height;
  }

  public int getRadius() {
      return radius;
  }

  public void setRadius(int radius) {
      this.radius = radius;
  }
//2.
  public double volume(){

      return Math.PI*(radius*radius)*height;
  }

  public double surface(){

      return ((2*Math.PI*radius*height)+(2*Math.PI*radius*radius));
  }
//3.

//constructor
  public cylinder(int myRadius, int myHeight){
radius = myRadius;
height = myHeight;
  }
}
//4.
class rectangle{
  private int length;
  private int breath;

  public rectangle(){
      this.length =10;
      this.breath = 5;
  }
  public rectangle(int length, int breadth) {
      this.length = length;
      this.breath = breadth;
  }

  public int getLength() {
      return length;
  }

  public void setLength(int length) {
      this.length = length;
  }

  public void setBreath(int breath) {
      this.breath = breath;
  }

  public int getBreath() {
      return breath;
  }
}
class circle{
  private int radius;

  public int getRadius() {
      return radius;
  }

  public void setRadius(int radius) {
      this.radius = radius;
  }
}

class AccessModifiersAndConstructorsPs {
	 public static void main(String[] args) {
//       1.create a class cylinder and use getter and setters to set its radius and height
       cylinder cl = new cylinder(9,12);

//      cl.setRadius(9);
//       cl.setHeight(12);
//       System.out.println(cl.getHeight());
//       System.out.println(cl.getRadius());
////       use ➊ to calculate surface and volume of the cylinder
//       System.out.println(cl.volume());
//       System.out.println(cl.surface());
//Use a constructor and repeat ➊
       System.out.println(cl.getRadius());
       System.out.println(cl.getHeight());
//4. Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters
rectangle rl = new rectangle();
System.out.println(rl.getLength());
       System.out.println(rl.getBreath());
//5.Repeat ➊ for a sphere
circle c = new circle();
c.setRadius(25);
System.out.println(c.getRadius());
   }

}
