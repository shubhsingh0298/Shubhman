package Relationship.Is_A_Relation;

public class multiLevelInheritence {

	public static void main(String[] args) {
		
		M obj = new M();
		System.out.println(obj.i+obj.j); //A class data Parent class [or grandparent class]
		System.out.println(obj.a+obj.b);  //B class data immediate Parent class
		System.out.println(obj.n+obj.m);  //C class data its own class
		

	}

}

 class K{
	int i =10;
	int j=20;
	//total 2
}

 class L extends K
{
	int a=50;
	int b=60;
	//4(2A,2B)
}
 class M extends L
{
	int n =11;
	int m =21;
	//6(2A,2B,2C)
}
