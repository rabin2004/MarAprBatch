package oOPSconcept;

public class ChildClass extends ParentClass { 
	
	void childMethod() {
		System.out.println("Child class");
	}
	
	public void commonMethod() {
		super.commonMethod();
		System.out.println("Common method in child class");
	}

	public static void main(String[] args) {
		parentMethod2();
		ChildClass.parentMethod2();
		ChildClass cc = new ChildClass(); // object pointing to the same class
		cc.parentMethod1();
		
		grandParentMethod2();
		ChildClass.grandParentMethod2();
		cc.grandParentMethod1();
		
		// Polymorphism
		ParentClass ps = new ChildClass(); // same object pointing to the parent class
		cc.childMethod();
//		ps.childMethod();
		ps.parentMethod1();
		ps.grandParentMethod1();
		GrandParentClass gpc = new ChildClass();
//		gpc.childMethod();
//		gpc.parentMethod1();
		gpc.grandParentMethod1();
		
		// Method overriding
		cc.commonMethod();
		ps.commonMethod();
		gpc.commonMethod();
		
	}
}
