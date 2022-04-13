package Control_statements;

public class NestedLOOP {

	public static void main(String[] args) {
		String requirements="VADAPAV";
		String modeofpayment ="ONLINE";
		int price =15;
		if(requirements =="VADAPAV") {
			System.out.println("THE REQUIMENTS IS CORRECT.PLEASE SELECT THE MODE OF PAYMENT");
		
			if(modeofpayment=="ONLINE") {
				System.out.println("THE MODE OF PAYMENTS IS CORRECT.PLEASE PAY THE MONEY");
			
				if(price==15) {
					System.out.println("THE PRICE IS CORRECT. COME AGAIN ");
				}
					
					else {
						System.out.println("THE PRICE IS INCORRECT. PLEASE PAY CORRECT PRICE SIR");
					}
			}
					
					else{
						System.out.println("THE MODE OF PAYMENTS IS NOTCORRECT.PLEASE PAY THE CORRECT MODE OF PAYMENTS SIR");
					}
		}
					else{
						System.out.println("THE REQUIMENTS IS INCORRECT.PLEASE SELECT THE CORRECT REQUIEMENTS");
					}
	}

				
}
					



			
		
		
		
		
		

	


