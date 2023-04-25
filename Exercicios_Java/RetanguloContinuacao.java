package Exercicios_Java;

public class RetanguloContinuacao {
	    private int base;
	    private int altura;

	    
	    public RetanguloContinuacao(int base, int altura) {
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

	    public void exibeArea() {
	        System.out.println("A área do retângulo é: " + calculaArea());
	    }

	  
	    public void exibePerimetro() {
	        System.out.println("O perímetro do retângulo é: " + calculaPerimetro());
	    }
	}


