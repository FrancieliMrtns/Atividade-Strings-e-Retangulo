package Exercicios_Java;

public class ObjetoContinuacao {
	    public static void main(String[] args) {
	        RetanguloContinuacao retaC = new RetanguloContinuacao(5, 3);

	        System.out.println("Base do retângulo: " + retaC.retornaBase());
	        System.out.println("Altura do retângulo: " + retaC.retornaAltura());
	        retaC.exibeArea();
	        retaC.exibePerimetro();
	    }
	}
	


