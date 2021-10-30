package pck;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ModuleCTests {

	@Test
	void func1Test() {
		ModuleC c = new ModuleC();
		assertEquals("C1", c.func1());
	}
	
	@Test
	void func2Test() {
		ModuleC c = new ModuleC();
		assertEquals("C2", c.func2());
	}

}
