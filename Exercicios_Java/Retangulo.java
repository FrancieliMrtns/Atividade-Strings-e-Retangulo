package Exercicios_Java;

public class Retangulo {
    private int base;
    private int altura;

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int retornaBase() {
        return base;
    }

    public int retornaAltura() {
        return altura;
    }

    public int calculaArea() {
        return base * altura;
    }

    public int calculaPerimetro() {
        return 2 * (base + altura);
    }
    
}
