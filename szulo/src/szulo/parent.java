package szulo;
public class parent{
public class Parent {
	public void works() 
	{
		System.out.println("parent");
	};
}

class Child extends Parent
{
	public void studies() 
	{
		System.out.println("child");
	};
};

public static void main(String[] args)
{
	parent p = new parent();
	
	Parent parent = p.new Child();
	Parent child = p.new Child();
	
	//parent.studies();
	child.works();
	
}

}