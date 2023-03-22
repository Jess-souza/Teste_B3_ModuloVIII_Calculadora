package service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraServiceTest {
    CalculadoraService calculadoraService;
    int a, b;

    @Before
    public void before() {
        calculadoraService = new CalculadoraService();
        a = 10;
        b = 2;
    }

    @Test
    public void deveSomarCorretamenteDoisValores() {
        //Given
        //When
        int soma = calculadoraService.somar(a, b);
        //Then
        assertTrue(soma == 12);
    }

    @Test
    public void deveSubtrairCorretamenteDoisValores() {
        //Given
        //When
        int subtrair = calculadoraService.subtrair(a, b);
        //Then
        assertFalse(subtrair != 8);
    }

    @Test
    public void deveMultiplicarCorretaemnteDoisValores() {
        //Given
        //When
        int multiplicacao = calculadoraService.multiplicar(a, b);
        //Then
        assertEquals(multiplicacao, 20);
    }

    @Test
    public void deveDividirCorretamenteDoisValores() {
        //Given
        //When
        int divisao = calculadoraService.dividir(a, b);
        //Then
        assertNotEquals(divisao, 7);
    }
}
