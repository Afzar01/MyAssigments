package week1.day1;

public class Mobile {

	public static void main(String[] args) {
		// className objectName = new className();
		Mobile vivo = new Mobile();
		// objectName.MethodName(related)
		vivo.sendMessage();
		vivo.shareDocument();
		vivo.makecall();

	}

	public void sendMessage() {
		System.out.println("Message is sent");
	}
	
	public void shareDocument() {
		System.out.println("Document is shared");
	}
	
	public void makecall() {
		System.out.println("call is made");
	}

}
