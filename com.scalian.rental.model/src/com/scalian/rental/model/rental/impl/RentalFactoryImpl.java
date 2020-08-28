package com.scalian.rental.model.rental.impl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.scalian.rental.model.rental.RentalFactory;


// This factory  renames the generated factory interface to use it as an overriden factory
public class RentalFactoryImpl extends MRentalFactoryImpl implements RentalFactory
{
	
	public static RentalFactory init() {
		
		try {
			Object fact = MRentalFactoryImpl.init();
			if ((fact != null) && (fact instanceof RentalFactory))
					return (RentalFactory) fact;
			}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RentalFactoryImpl(); 
		 }
	

}
