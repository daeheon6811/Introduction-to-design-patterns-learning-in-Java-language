package FactoryMethod01;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory{

	private List<Object> owners = new ArrayList();
	
	@Override
	protected void registerProduct(Product p) {
		
		owners.add(((IDCard)p).getOwner());
		
	}

	@Override
	protected Product createProduct(String owner) {
		// TODO Auto-generated method stub
		return new IDCard(owner);
	}

	public List<Object> getOwners() {
		return owners;
	}

	

}
