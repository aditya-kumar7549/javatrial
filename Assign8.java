package pack1;

public class A {
    public void displayA() {
        System.out.println("Hello from class A in package pack1!");
    }
}


package pack1;

public class B {
    public void displayB() {
        System.out.println("Hello from class B in package pack1!");
    }
}

package pack2;

public class X {
    public void displayX() {
        System.out.println("Hello from class X in package pack2!");
    }
}

package pack2;

public class Y {
    public void displayY() {
        System.out.println("Hello from class Y in package pack2!");
    }
}


import pack1.A;
import pack2.X;

public class Main{
	public static void main(String[] args){
		A a =new A();
		a.displayA();

		X x =new X();
		x.displayX();
	}
}
