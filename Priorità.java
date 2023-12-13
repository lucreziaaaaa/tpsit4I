package it.fcfs;

public class Priorità {
	
	String processi[];
	int tempoArrivo[];
	int tempoServizio[];
	int tempoEsecuzione[];
	
	
	
	/**
	 * Process declaration
	 * @param 	
	 * @return	returns the name of the process
	 */

	public String[] processo() {
		for(int x=0;x<processi.length;x++) {
			processi[x]+=x;
		}
		return processi;
	}
	
	/**
	 * request for the arrival time
	 * @param arrival time
	 * @return from the arrival times of the processes
	 */
	
	public int[] tempoDiArrivo() {
		for(int x=0;x<tempoArrivo.length;x++) {
			tempoArrivo[x]=x;
		}
		return tempoArrivo;
	}
	
	
	/**
	 * Calculate the time of all processes
	 * @param  tempoServizio
	 * @return returns the service time
	 */ 
	public int[] setServiceTime() {
		int tempo[] = null;
		for (int x=0;x<tempoServizio.length;x++) {
			tempoServizio[x]=tempoServizio[x]+tempo[x-1];
		}
		return tempoServizio;
	}
	
	/**
	 * request for the execution time  
	 * @param  tEsecuzione
	 * @return void
	 */
	public int[] setExecutionTime(int[] tEsecuzione) {
		tempoEsecuzione = tEsecuzione;
		return tEsecuzione;
	}
	
	
}


