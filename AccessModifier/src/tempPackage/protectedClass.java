package tempPackage;

public class protectedClass {
	protected void protectedMethod()
	{
		System.out.println("Protected Method:\n"
				+ "The access level of a protected modifier is within the package and outside the package through child class.\n"
				+ "If you do not make the child class, it cannot be accessed from outside the package.");
	}
}
