package it.fcfs;

public class Fcfs {
	
	/**
	 * I create all the vectors I need
	 * @param 
	 * @return void
	 */
	
	int processi=0;
	int tEsecuzione=0;
	String pProcessi[];
	int tempi[];
	int attesa[];
	int servizio[];
	int arrivo[];
	

	public void add(String x, int y) {
		pProcessi[processi]=x;
		tempi[tEsecuzione]=y;
		processi++;
		tEsecuzione++;
	}
	public double calcola() {
		servizio[0]=0;
		for(int i=1;i<pProcessi.length ;i++) {
			servizio[i]=servizio[i-1]+tempi[i-1];
		}
		double media=0;
		for(int i=0;i<pProcessi.length;i++) {
			media=media+servizio[i]-arrivo[i];
		}
		return media/pProcessi.length;
	}

}
