package br.com.projeto;

public class Teste {

	public static void main(String[] args) {
		
		Prioridade pMin = Prioridade.MIN;
		System.out.println("O valor da prioridade " + pMin.name() + " é: " + pMin.getValor());
		
		Prioridade pNormal = Prioridade.NORMAL;
		System.out.println("O valor da prioridade " + pNormal.name() + " é: " + pNormal.getValor());
		
		Prioridade pMax = Prioridade.MAX;
		System.out.println("O valor da prioridade " + pMax.name() + " é: " + pMax.getValor());
	}

}
