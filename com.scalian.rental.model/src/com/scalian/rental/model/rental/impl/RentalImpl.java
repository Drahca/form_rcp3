package com.scalian.rental.model.rental.impl;

import java.text.SimpleDateFormat;

import com.scalian.rental.model.rental.Customer;
import com.scalian.rental.model.rental.Rental;
import com.scalian.rental.model.rental.RentalObject;

// This class overrides the generated class and will be instantiated by factory
public class RentalImpl extends MRentalImpl implements Rental
{
	@Override
	public String toString() {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		RentalObject o = getRentedObject();
		StringBuffer buf = new StringBuffer((o == null) ? "?" : o.getName());
		Customer c = getCustomer();
		buf.append(" loué par ").append((c == null) ? "?" : c.getName());
		buf.append(" du ").append((getStartDate() == null) ? " ?" : df.format(getStartDate())).append(" au ");
		buf.append((getEndDate() == null) ? " ? " : df.format(getEndDate()));
		return buf.toString();
	}

}
