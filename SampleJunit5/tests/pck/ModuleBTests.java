package pck;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ModuleBTests {

	@Test
	void func1Test() {
		ModuleB b = new ModuleB();
		assertEquals("B1", b.func1());
	}
	
	@Test
	void func2Test() {
		ModuleB b = new ModuleB();
		assertEquals("B2", b.func2());
	}

}
