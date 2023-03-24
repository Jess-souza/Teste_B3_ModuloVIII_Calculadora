package service;

import static org.junit.Assert.*;

import model.Quadrado;
import model.Triangulo;
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

    @Test
    public void deveCalcularAreaDeUmQuadrado() {
        //Given
        Quadrado quadrado = new Quadrado(5.0);
        //When
        Double areaQuadrado = calculadoraService.calcularAreaQuadrado(quadrado);
        //Then
        assertFalse(areaQuadrado != 25.0);
    }

    @Test
    public void deveCalcularAreaDeUmTriangulo() {
        //Given
        Triangulo triangulo = new Triangulo(4.0, 6.0);
        //When
        Double areaTriangulo = calculadoraService.calcularAreaTriangulo(triangulo);
        //Then
        assertTrue(areaTriangulo == 12.0);
    }

    @Test
    public void deveCompararAreaDeDoisQuadrados_entaoInformarQualTemMenorArea() {
        //Given
        Quadrado quadradoA = new Quadrado(5.0);
        Quadrado quadradoB = new Quadrado(7.0);
        //When
        Quadrado menorArea = calculadoraService.quadradoDeMenorArea(quadradoA, quadradoB);
        //Then
        assertEquals(menorArea, quadradoA);
    }

    @Test
    public void deveCompararAreaDeDoisTriangulos_entaoInformarQualTemMenorArea() {
        //Given
        Triangulo trianguloA = new Triangulo(7.0, 6.0);
        Triangulo trianguloB = new Triangulo(9.0, 2.0);
        //When
        Triangulo menorArea = calculadoraService.trianguloDeMenorArea(trianguloA, trianguloB);
        //Then
        assertEquals(menorArea, trianguloB);
    }

    @Test
    public void deveCompararAreaDeDoisQuadradosDeMesmoValor_entaoRetornarNull() {
        //Given
        Quadrado quadradoA = new Quadrado(7.0);
        Quadrado quadradoB = new Quadrado(7.0);
        //When
        Quadrado menorArea = calculadoraService.quadradoDeMenorArea(quadradoA, quadradoB);
        //Then
        assertNull(menorArea);
    }

    @Test
    public void deveCompararAreaDeDoisTriangulosDeMesmoValor_entaoRetornarNull() {
        //Given
        Triangulo trianguloA = new Triangulo(2.0, 5.0);
        Triangulo trianguloB = new Triangulo(2.0, 5.0);
        //When
        Triangulo menorArea = calculadoraService.trianguloDeMenorArea(trianguloA, trianguloB);
        //Then
        assertNull(menorArea);
    }
}

