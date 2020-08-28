package com.scalian.rental.adapters;

import org.eclipse.core.runtime.IAdapterFactory;

import com.scalian.rental.model.rental.Customer;
import com.scalian.rental.model.rental.Rental;

public class RentalAdapterFactory implements IAdapterFactory {

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
		
		T result = null;
		if(adaptableObject instanceof Rental && adapterType == Customer.class) {
			result = (T) ((Rental) adaptableObject).getCustomer();
		}
		
		return result;
	}

	@Override
	public Class<?>[] getAdapterList() {
		// TODO Auto-generated method stub
		return new Class[] { Customer.class };
	}

}
