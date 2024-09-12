package pe.edu.unfv.calculate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class CalculadoraTest {

	@Mock
	ICalculadoraGoogle iCalculadoraGoogle;
	
	@InjectMocks
	Calculadora calculadora;	
	
	@BeforeEach
	public void init() {
		
		MockitoAnnotations.initMocks(this);
		
		when(iCalculadoraGoogle.sumar(10, 15)).thenReturn(25);
	}	
	
	@Test
	void testSumaGoogle() {
		
		assertEquals(25, calculadora.sumaGoogle(10, 15));
	}

}
