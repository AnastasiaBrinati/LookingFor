package logic.controller;

public class PaymentController {
	
	private static PaymentController instance;
	
	private PaymentController() {
		//constructor
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
