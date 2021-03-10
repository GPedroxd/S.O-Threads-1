package View;

import Controller.ThreadVetor;

public class Main {
	public static void main(String[] args) {
		int [] vet = new int [1000];
		for (int i = 0; i < vet.length; i++) {
			vet[i] = (int)(Math.random() * 101);
		}
		new ThreadVetor(1, vet).start();
		new ThreadVetor(2, vet).start();
	}
}
