package view;

import java.util.concurrent.Semaphore;

import controller.threadFormula_1;

public class Main {

	public static void main(String[] args) {
		
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);
		
		for(int escudeira = 0; escudeira < 7; escudeira++) {
			threadFormula_1 cars = new threadFormula_1(escudeira, semaforo);
			cars.start();
		}
		

	}

}
