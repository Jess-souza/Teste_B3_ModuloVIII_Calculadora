package service;

import model.Quadrado;
import model.Triangulo;

public class CalculadoraService {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int dividir(int a, int b) {
        return a / b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }


    public Double calcularAreaQuadrado(Quadrado quadrado) {
        if (quadrado != null) {
            return quadrado.getLado() * quadrado.getLado();
        } else {
            System.err.println("Esse quadrado não é válido");
            return null;
        }
    }

    public Double calcularAreaTriangulo(Triangulo triangulo) {
        if (triangulo != null) {
            return (triangulo.getBase() * triangulo.getAltura()) / 2;
        } else {
            System.err.println("Esse triângulo não é válido");
            return null;
        }
    }

    public Quadrado quadradoDeMenorArea(Quadrado quadradoA, Quadrado quadradoB) {
        if (calcularAreaQuadrado(quadradoA) < calcularAreaQuadrado(quadradoB)) {
            return quadradoA;
        } else if (calcularAreaQuadrado(quadradoB) < calcularAreaQuadrado(quadradoA)) {
            return quadradoB;
        } else {
            return null;
        }
    }

    public Triangulo trianguloDeMenorArea(Triangulo trianguloA, Triangulo trianguloB) {
        if (calcularAreaTriangulo(trianguloB) < calcularAreaTriangulo(trianguloA)) {
            return trianguloB;
        } else if (calcularAreaTriangulo(trianguloA) < calcularAreaTriangulo(trianguloB)) {
            return trianguloA;
        } else {
            return null;
        }
    }
}