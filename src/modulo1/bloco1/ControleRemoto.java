package modulo1.bloco1;

public class ControleRemoto {
		
	
	public void aumentaVolume (Televisao tv) {
		tv.volume++;
		
	}
	
	public void diminuiVolume (Televisao tv) {
		tv.volume--;
		
	}
	
	public void mudaCanal (Televisao tv) {
		tv.canal++; 
		
	}
	public void liga (Televisao tv) {
		tv.ligada = true;
		
	}
	public void desliga (Televisao tv) {
		tv.ligada = false;
	}
	
}
