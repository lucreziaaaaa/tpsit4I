package it.edu.iisgubbio.semaforo;

import java.util.concurrent.Semaphore;

public class WorkerThread extends Thread{
	Semaphore sem;
	RisorsaCondivisa ris;

	public WorkerThread(Semaphore sem, RisorsaCondivisa ris, String threadName) {
		super(threadName);
		this.sem=sem;
		this.ris=ris;
		
	}
	@Override
	public void run() {
		if(this.getName().equals("P")) {
			System.out.println("ciao, sono il Produttore");
			try {
				System.out.println("ciao, sono sempre io il Produttore, sto aspettando il permesso di scrivere");
				sem.acquire();
				System.out.println("permesso accordato");
				for(int i=0;i<5;i++) {
					ris.contatore++;
					System.out.println(getName()+":"+ris.contatore);
					Thread.sleep(10);
				}
			}catch(InterruptedException exc) {
				System.out.println(exc);
			}
			System.out.println("il produttore rialscia il permesso");
			sem.release();
			
		}else {
			
			System.out.println("ciao, sono il consumatore");
			try {
				
				System.out.println("ciao, sono sempre io il consumatore, sto aspettando il permesso di scrivere");
				sem.acquire();
				System.out.println("permesso accordato");
				
				for(int i=0;i<5;i++) {
					ris.contatore--;
					System.out.println(getName()+":"+ris.contatore);
					Thread.sleep(10);
				}
				
			}catch(InterruptedException exc) {
				System.out.println(exc);
			}
			
			System.out.println("il consumatore rialscia il permesso");
			sem.release();
			
		}
	}
}     
