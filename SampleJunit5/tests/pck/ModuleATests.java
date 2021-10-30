package pck;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ModuleATests {

	@Test
	void func1Test() {
		ModuleA a = new ModuleA();
		assertEquals("A1", a.func1());
	}
	
	@Test
	void func2Test() {
		ModuleA a = new ModuleA();
		assertEquals("A2", a.func2());
	}

}
