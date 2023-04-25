package Exercicios_Java;

public class Objeto {
    public static void main(String[] args) {
        Retangulo r = new Retangulo(5, 3);

        System.out.println("Base: " + r.retornaBase());
        System.out.println("Altura: " + r.retornaAltura());
        System.out.println("Área: " + r.calculaArea());
        System.out.println("Perímetro: " + r.calculaPerimetro());
    }
}







