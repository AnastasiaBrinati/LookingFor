package logic.controller;

public class PaymentController {
	
	private static PaymentController instance;
	
	public PaymentController() {
		//costruttore
	}
		
	public static synchronized PaymentController getInstance() {
		if(instance==null) {
			instance = new PaymentController();
		}
	
		return instance;
	}
	
	public boolean simulatePayment() {
		return true;
	}
}
