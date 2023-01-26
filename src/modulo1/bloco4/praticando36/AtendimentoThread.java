package modulo1.bloco4.praticando36;

import java.util.Queue;

public class AtendimentoThread implements Runnable{
	
	private Queue<String> preferencial;
	private Queue<String> normal; 
	
	public AtendimentoThread(Queue<String> preferencial, Queue<String> normal) {
		this.preferencial = preferencial;
		this.normal = normal;
	}

	@Override
	public void run() {
		
		try {
			
			while(true) {
				Thread.sleep(2000);
				if (!normal.isEmpty()) {
					System.out.println("================ Atendendo cliente normal " + normal.poll());
					Thread.sleep(10000);
				}
				
				for(int i = 0; i < 3; i++) {
					if(!preferencial.isEmpty()) {
						System.out.println("================ Atendendo cliente preferencial " + preferencial.poll());
						Thread.sleep(10000);
					} else {
						break;
					}
					
				}
				
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
	
	
	
	
	
}
