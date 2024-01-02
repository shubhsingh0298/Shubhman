package Relationship.Is_A_Relation;

public class WhatsappController {

	public static void main(String[] args) {
		OldVersionWhatsapp ov= new OldVersionWhatsapp();
		System.out.println(ov.chat);
		System.out.println(ov.shareContact);
		System.out.println(ov.photos);
		
		System.out.println("=======================================");
		
		NewVersionWhatsapp nv= new NewVersionWhatsapp();
		System.out.println(nv.paymentMode);
		System.out.println(nv.deleteMsg);
		System.err.println(nv.editText);
		System.out.println(nv.chat);
		System.out.println(nv.photos);
		System.out.println(nv.shareContact);
		

	}

}
