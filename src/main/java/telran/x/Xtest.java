package telran.x;

import telran.reflect.*;

public class Xtest {
	@BeforeEach
	void setUp1() {
		System.out.println("Hello");
	}
	@Test
	void f1() {
		System.out.println("test 1");
	}
	int sum(int op1, int op2) {
		return op1 + op2;
	}
	int subtract(int op1, int op2) {
		return op1 - op2;
	}
	@Test
	void f2() {
		System.out.println("test 2");
	}
	@BeforeEach
	void setUp2() {
		System.out.println("Hello World");
	}
}
