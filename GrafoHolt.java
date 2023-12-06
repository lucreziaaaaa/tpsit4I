package it.edu.iisgubbio.grafo;

public class GrafoHolt {
	int processi;
	int risorse;
	int grafo[][];
	
	GrafoHolt(int processi, int risorse ){
		
		this.processi = processi;
		this.risorse = risorse;
		grafo = new int[processi][risorse];
		
		for(int p=0; p<processi;p++) {
			for(int r=0; r<risorse;r++) {
				grafo[p][r]=0;
			}
		}
	}
	public void richiesta(int processo, int risorsa) {
		boolean occupta = false;
		for (int i=0; i<this.processi;i++) {
			if (grafo[i][risorsa-1]==1) {
				occupta = true;
			}
		}
		if(occupta) {
			grafo[processo-1][risorsa-1]=2;
		}else {
			grafo[processo-1][risorsa-1]=1;
		}
	}
	public String print(int x, int y) {
		return ""+grafo[x-1][y-1];
	}
	
	public void print() {
		String line[] = new String[processi];
		for(int p=0; p<processi;p++) {
			line[p]="";
			for(int r=0; r<risorse;r++) {
				line[p]+=grafo[p][r]+" ";
			}
			System.out.println(line[p]);
		}
	}
	public boolean isRiducibile(){
		int errori=0;
		boolean ridu=false;
		for(int p=0; p<processi;p++) {
			errori=0;
			for(int r=0; r<risorse;r++) {
				if(2==grafo[p][r]) {
					errori++;
				}
			}
			ridu=errori==0;
			if(ridu) {
				break;
			}
		}
		return ridu;
	}
	public static void main(String[] args) {
		GrafoHolt g1 = new GrafoHolt(3,3);
		g1.richiesta(2, 1);
		g1.richiesta(2, 2);
		g1.richiesta(2, 3);
		g1.richiesta(3, 1);
		g1.richiesta(1, 2);
		g1.print();
		System.out.println(g1.isRiducibile());
	}
}
