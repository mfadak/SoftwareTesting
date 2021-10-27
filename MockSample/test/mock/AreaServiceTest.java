package mock;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

@DisplayName("Area Service Test")
class AreaServiceTest {
	
	public AreaService areaService;
	public IShape iShape;
	
	@BeforeEach
	public void setup() {
		iShape = Mockito.mock(IShape.class);
		areaService = new AreaService();
		areaService.setShape(iShape);
		Mockito.when(iShape.CalculateArea()).thenReturn(50.0);
	}
	
	@Test
	@DisplayName("Calculate Area Service Test")
	void CalculateAreaTest() {
		assertEquals(50.0, areaService.CalculateArea(),0); 
	}

}
