package com.scalian.rental.model.rental.impl;

import java.util.Date;

import com.scalian.rental.model.rental.Customer;
import com.scalian.rental.model.rental.Rental;
import com.scalian.rental.model.rental.RentalAgency;
import com.scalian.rental.model.rental.RentalFactory;
import com.scalian.rental.model.rental.RentalObject;

// This class overrides the generated class and will be instantiated by factory
public class RentalAgencyImpl extends MRentalAgencyImpl implements RentalAgency
{
	@Override
	public Rental book(Customer customer, RentalObject rentedObject, Date from, Date to) {
		Rental r = RentalFactory.eINSTANCE.createRental();
		
		r.setCustomer(customer);
		r.setStartDate(from);
		r.setEndDate(to);
		r.setRentedObject(rentedObject);
		
		getRentals().add(r);
		
		return r;
	}
}
