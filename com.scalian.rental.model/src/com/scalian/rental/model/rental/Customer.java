package com.scalian.rental.model.rental;

// This interface overrides the generated interface and will be returned by factory
public interface Customer extends MCustomer
{
	// You can write additional methods using an empty default java 8 notation 
	// because the generated implemented class extends this interface and is not abstract
	//
	// For instance : 
	// default public void addSomething(Something foo) {} ;
	default public String getDisplayName() {
		return null;
	};
}
