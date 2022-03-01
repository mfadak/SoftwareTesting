package pkt;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AlanServisTest {
	public AlanServis As;
	
	@BeforeEach
	public void setUp() {
		ISekil isek = Mockito.mock(ISekil.class);
		Mockito.when(isek.Alan()).thenReturn(50.0);
		As = new AlanServis();
		As.setISekil(isek);
	}
	
	@Test
	public void alanTest() {
		assertEquals(50.0,As.AlanHesapla());
	}

}
