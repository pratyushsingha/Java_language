package exercise;


class base{
	 base() {
		// TODO Auto-generated constructor stub
		System.out.println("I am a constructor");
	}
	 base(int a) {
			// TODO Auto-generated constructor stub
			System.out.println("I am a constructor with value of a as:"+ a);
		}
	
	public int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}
class derived1 extends base{
	 derived1() {
//		 super(x);		// TODO Auto-generated constructor stub
		System.out.println("I am a derived class constructor");
		
	 }
	 derived1(int a, int b){
			System.out.println("I am a overloaded constructor with value of  b as :"+ b);
		}
	
}








public class ConstructorsInINharitance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		base base = new base();
		derived1 derived = new derived1();
	}

}
