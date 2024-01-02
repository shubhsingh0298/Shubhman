package Relationship.Is_A_Relation;

public class singleLevelInheritence {

	public static void main(String[] args) {
		
		//Single level inheritance
		A obj = new A();
		System.out.println(obj.i+obj.j +  "its own class member");
		//System.out.println(obj.a+obj.b+"its child members"); //can't access
		
		B obj2= new B();
		System.out.println(obj.i+obj.j +   "its own class member");
		System.out.println(obj2.a+obj2.b+  "its child members");



		
	}

}

class A{
	int i =10;
	int j=20;
}

class B extends A
{
	int a=50;
	int b=60;
	
}