package testmodeljw;

import org.npc.testmodel.models.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product varN = new Product();
		
		varN.setCount(3);
		varN.setLookupCode("abc");

		varN.save();

	}

}
