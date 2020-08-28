/**
 */
package com.scalian.rental.model.rental;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.scalian.rental.model.rental.MRentalAgency#getName <em>Name</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MRentalAgency#getAddress <em>Address</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MRentalAgency#getObjectsToRent <em>Objects To Rent</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MRentalAgency#getCustomers <em>Customers</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MRentalAgency#getRentals <em>Rentals</em>}</li>
 * </ul>
 *
 * @see com.scalian.rental.model.rental.MRentalPackage#getRentalAgency()
 * @model
 * @generated
 */
public interface MRentalAgency extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getRentalAgency_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MRentalAgency#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Address)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getRentalAgency_Address()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MRentalAgency#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Objects To Rent</b></em>' containment reference list.
	 * The list contents are of type {@link com.scalian.rental.model.rental.RentalObject}.
	 * It is bidirectional and its opposite is '{@link com.scalian.rental.model.rental.MRentalObject#getParentAgency <em>Parent Agency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects To Rent</em>' containment reference list.
	 * @see com.scalian.rental.model.rental.MRentalPackage#getRentalAgency_ObjectsToRent()
	 * @see com.scalian.rental.model.rental.MRentalObject#getParentAgency
	 * @model opposite="parentAgency" containment="true"
	 * @generated
	 */
	EList<RentalObject> getObjectsToRent();

	/**
	 * Returns the value of the '<em><b>Customers</b></em>' containment reference list.
	 * The list contents are of type {@link com.scalian.rental.model.rental.Customer}.
	 * It is bidirectional and its opposite is '{@link com.scalian.rental.model.rental.MCustomer#getParentAgency <em>Parent Agency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' containment reference list.
	 * @see com.scalian.rental.model.rental.MRentalPackage#getRentalAgency_Customers()
	 * @see com.scalian.rental.model.rental.MCustomer#getParentAgency
	 * @model opposite="parentAgency" containment="true"
	 * @generated
	 */
	EList<Customer> getCustomers();

	/**
	 * Returns the value of the '<em><b>Rentals</b></em>' containment reference list.
	 * The list contents are of type {@link com.scalian.rental.model.rental.Rental}.
	 * It is bidirectional and its opposite is '{@link com.scalian.rental.model.rental.MRental#getParentAgency <em>Parent Agency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rentals</em>' containment reference list.
	 * @see com.scalian.rental.model.rental.MRentalPackage#getRentalAgency_Rentals()
	 * @see com.scalian.rental.model.rental.MRental#getParentAgency
	 * @model opposite="parentAgency" containment="true"
	 * @generated
	 */
	EList<Rental> getRentals();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Rental book(Customer customer, RentalObject rentedObject, Date from, Date to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAvailable(RentalObject rentedObject, Date from, Date to);

} // MRentalAgency
