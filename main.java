import java.util.Scanner;
	
class Main {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("P1:");
		double P1= sc.nextDouble();
		System.out.println("P2:");
		double P2 = sc.nextDouble();
		System.out.println("P3:");
		double P3= sc.nextDouble();
		System.out.println("P4:");
		double P4 = sc.nextDouble();
		
		double N1 = (P1+P2)/2;
		double N2 = (P3+P4)/2;
		double NS = (N1+N2)/2;
			
			if (NS >= 7) {	
				System.out.println("Aprovado, nota final: "+NS);
			}
		
			else {
				if (NS > 4) {
					System.out.println("PF: ");
					double PF = sc.nextDouble();
					double NF = (NS + PF)/2;
										
					if(NF > 5){
						System.out.println("Aprovado, nota final: "+NF);
							
					}else {
						System.out.println("Reprovado, nota final: "+NF);
					}
						
				}else {
					System.out.println("Reprovado, nota final: "+NS);
				}
		   }
			
		sc.close();	
	}
			
}