package br.com.senacrs.alp.aulas.minhalista;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MinhaListaImpTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMinhaListaImp() {
		
		MinhaListaImp<String> obj = null;
		String arg = null;
		
		arg = "valor valido";
		obj = new MinhaListaImp<String>(arg);
		Assert.assertNotNull(obj);		
	}
	
	@Test
	public void testMinhaListaImpNull() {
		
		MinhaListaImp<String> obj = null;
		
		try{
			obj = new MinhaListaImp<String>(null);
			fail();
		} catch (IllegalArgumentException e) {
			Assert.assertTrue(true);
		}
		Assert.assertNull(obj);		
	}

	@Test
	public void testGetInicio() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetInicio() {
		fail("Not yet implemented");
	}

	@Test
	public void testBuscar() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrefixar(){
		double esperado = 0.0;
		double resultado = 0.0;
		int comparacao = 0;

		int nro_elementos = 0;
		
		MinhaListaImp<String> obj = null;
		String arg = null;
		
		arg = "valor inicial";
		obj = new MinhaListaImp<String>(arg);
		
		arg = "valor para prefixar";
		obj.prefixar(arg);
		
		nro_elementos = 2;
		
		esperado = nro_elementos;
		resultado = obj.tamanho();
		comparacao = Double.compare(resultado, esperado);
		Assert.assertEquals(
				"Passando-se dois elementos para a lista o tamanho deve ser " + String.valueOf(esperado) 
				+ ", valor retornando: " + String.valueOf(resultado),
				comparacao, 0);				
	}
	
	@Test
	public void testSufixar() {
		double esperado = 0.0;
		double resultado = 0.0;
		int comparacao = 0;
		
		int nro_elementos = 0;
		
		MinhaListaImp<String> obj = null;
		String arg = null;
		
		arg = "valor inicial";
		obj = new MinhaListaImp<String>(arg);
		
		arg = "valor para sufixar";
		obj.sufixar(arg);
		
		nro_elementos = 2;
		
		esperado = nro_elementos;
		resultado = obj.tamanho();
		comparacao = Double.compare(resultado, esperado);
		Assert.assertEquals(
				"Passando-se " + nro_elementos + " elementos para a lista o tamanho deve ser " + String.valueOf(esperado) 
				+ ", valor retornando: " + String.valueOf(resultado),
				comparacao, 0);				
	}
	
	@Test
	public void testInserir() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testRemover() {
		fail("Not yet implemented");		
	}
	
	@Test
	public void testTamanho() {
		double esperado = 0.0;
		double resultado = 0.0;
		int comparacao = 0;
		
		int nro_elementos = 0;
		
		MinhaListaImp<String> obj = null;
		String arg = null;
		
		arg = "valor inicial";
		obj = new MinhaListaImp<String>(arg);
		nro_elementos += 1;
		
		arg = "valor para prefixar";
		obj.prefixar(arg);
		nro_elementos += 1;
		
		arg = "valor para sufixar";
		obj.sufixar(arg);
		nro_elementos += 1;
		
		esperado = nro_elementos;
		resultado = obj.tamanho();
		comparacao = Double.compare(resultado, esperado);
		Assert.assertEquals(
				"Passando-se  " + nro_elementos + " elementos para a lista o tamanho deve ser " + String.valueOf(esperado) 
				+ ", valor retornando: " + String.valueOf(resultado),
				comparacao, 0);		
		
	}
	
}
