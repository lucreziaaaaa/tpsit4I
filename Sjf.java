package it.fcfs;

public class Sjf {

		
		String processo[];
		int tempoArrivo[];
		int tempoEsecuzione[];
		int tempoServizio[];
		int tempoAttesa[];
		
		/**
		 * Takes a number and return its square
		 * @param x The value to square.
		 * @returnThe square root of the given
		 */

		public String Sjn(String x) {
			return x;
		}
		/**
		 * assign a name to process
		 * @param 
		 * @return void
		 */
		
		public void setProcessi() {
			for(int x=0;x<this.processo.length;x++) {
				this.processo[x]+=x;
			}
		}
		/**
		 * I take the arrival time of the processes
		 * @param 
		 * @return arrival time
		 */

		public int[] getTArrivo() {
			for(int x=0;x<tempoArrivo.length;x++) {
				tempoArrivo[x]=x;
			}
			return tempoArrivo;
		}
		
		/**
		 * take the time it takes to execute
		 * @param 
		 * @return void
		 */

		public void setTEsecuzione(int[] tEsecuzione) {
			this.tempoEsecuzione = tEsecuzione;
		}
		
		/**
		 * Calculate the time it takes me to serve the process
		 * @param 
		 * @return Service time
		 */
		
		public int[] getTServizio() {
			for (int x=0;x<tempoServizio.length;x++) {
				tempoServizio[x]=tempoEsecuzione[x]+tempoArrivo[x-1];
			}
			return tempoServizio;
		}
		
	}


