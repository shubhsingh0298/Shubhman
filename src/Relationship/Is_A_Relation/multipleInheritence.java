package Relationship.Is_A_Relation;

public class multipleInheritence {

	
	class Test1{
		void dance()
		{
			System.out.println("Kathak...........");
		}
	}
	
	class Test2{
		void dance(){
			System.out.println("Hip-hop");
		}
	}
	
	class Test3 extends Test1,Test2{  //Syntax is not allowed in classes
		//Test1 and Test2
	}
}
