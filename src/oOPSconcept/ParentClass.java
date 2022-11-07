package oOPSconcept;

public class ParentClass extends GrandParentClass {
	
	public void parentMethod1() {
		System.out.println("Parent Method-1");
	}
	
	public static void parentMethod2() {
		System.out.println("Parent Method-2");
	}
	
	protected static void protectedMethod(){
		System.out.println("protected method");
	}
	
	static void defaultMethod() {
		System.out.println("Default method");
	}
	
	public void commonMethod() {
		super.commonMethod();
		System.out.println("Common method in parent class");
	}

	public static void main(String[] args) {
		grandParentMethod2();
		ParentClass.grandParentMethod2();
		ParentClass pc = new ParentClass();
		pc.grandParentMethod1();

	}

}
