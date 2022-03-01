package pkt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MusteriTemsilcisiTest {

	@Mock
	private ADepartman aDepartmanMock;
	
	@InjectMocks
	private MusteriTemsilcisi temsilci;
	
	@Test
	public void musteriEkleTest() {
		Mockito.when(aDepartmanMock.musteriGonder(Mockito.any(Musteri.class))).thenReturn(true);
		Musteri musteri = new Musteri("11111111111");
		assertEquals(true, temsilci.musteriEkle(musteri));
	}	
}
