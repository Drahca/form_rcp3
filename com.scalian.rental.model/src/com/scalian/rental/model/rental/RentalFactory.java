package com.scalian.rental.model.rental;

import com.scalian.rental.model.rental.impl.RentalFactoryImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface RentalFactory extends MRentalFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	RentalFactory eINSTANCE = RentalFactoryImpl.init();
				
}
