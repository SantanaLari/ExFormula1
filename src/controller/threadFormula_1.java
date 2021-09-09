package controller;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.Arrays;

public class threadFormula_1 extends Thread{
	
	private int escudeira;
	private static int carros;
	private int pista = 1000;
	private int velocidade;
	private int vetor1[] = new int [7];
	private int vetor2[] = new int [7];
	private int vetor3[] = new int [7];
	private Semaphore semaforo;
	
	public threadFormula_1(int escudeira, Semaphore semaforo) {
		this.escudeira = escudeira;
		this.semaforo = semaforo;
	}
	
	public void run() {
		mostrarCarros();
		carrosNaPista();
		primeiraVolta();
		segundaVolta();
		terceiraVolta();
		
	}
	
	public void mostrarCarros() {
		Random aleatorio = new Random();
		carros = aleatorio.nextInt(6);
		if(carros < 2) {
			carros = 2;
		}
		System.out.println("Escudeira " + escudeira + " está com " + carros + " carros.");
		try {
			sleep(75);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void carrosNaPista() {
		System.out.println("O carro da escudeira " + escudeira + " entrou na pista");
		
		try {
			sleep(75);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void primeiraVolta() {
		int distanciaPercorrida = 0;
		int tempo = 0;
		
		Random aleatorio = new Random();
		
		while(distanciaPercorrida < pista) {
			velocidade = aleatorio.nextInt(160);
			System.out.println("O carro da escudeira " + escudeira + " percorreu " + velocidade + " km.");
			distanciaPercorrida += velocidade;
			tempo++;
			
			try {
				sleep(75);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("O carro da escudeira " + escudeira + " levou: " + tempo + "s. na primeira"
				+ " volta");
		vetor1[escudeira] = tempo;
		
	}
	
	public void segundaVolta() {
		int distanciaPercorrida = 0;
		int tempo = 0;
		
		Random aleatorio = new Random();
		
		while(distanciaPercorrida < pista) {
			velocidade = aleatorio.nextInt(160);
			System.out.println("O carro da escudeira " + escudeira + " percorreu " + velocidade + " km.");
			distanciaPercorrida += velocidade;
			tempo++;
			
			try {
				sleep(75);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("O carro da escudeira " + escudeira + " levou: " + tempo + "s. na segunda"
				+ " volta");
		vetor2[escudeira] = tempo;
	}
	
	public void terceiraVolta() {
		int distanciaPercorrida = 0;
		int tempo = 0;
		
		Random aleatorio = new Random();
		
		while(distanciaPercorrida < pista) {
			velocidade = aleatorio.nextInt(160);
			System.out.println("O carro da escudeira " + escudeira + " percorreu " + velocidade + " km.");
			distanciaPercorrida += velocidade;
			tempo++;
			
			try {
				sleep(75);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("O carro da escudeira " + escudeira + " levou: " + tempo + "s. na terceira"
				+ " volta");
		vetor3[escudeira] = tempo;
	}
	
	
	
}
