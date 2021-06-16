package mainPackage;

import tempPackage.protectedClass;
import tempPackage.publicClass;

public class mainClass extends protectedClass{

	private void privateMethod() {
		System.out.println("Private Method:\n"
				+ "The access level of a private modifier is only within the class.\n"
				+ "It cannot be accessed from outside the class.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainClass priv=new mainClass();
		priv.privateMethod();
		System.out.println("______________________________");
		defaultClass defa=new defaultClass();
		defa.defaultMethod();
		System.out.println("______________________________");
		mainClass prot=new mainClass();
		prot.protectedMethod();
		System.out.println("______________________________");
		publicClass publ=new publicClass();
		publ.publicMethod();
	}

}
