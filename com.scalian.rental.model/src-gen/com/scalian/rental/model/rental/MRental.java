/**
 */
package com.scalian.rental.model.rental;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rental</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.scalian.rental.model.rental.MRental#getCustomer <em>Customer</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MRental#getRentedObject <em>Rented Object</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MRental#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MRental#getEndDate <em>End Date</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MRental#getParentAgency <em>Parent Agency</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MRental#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see com.scalian.rental.model.rental.MRentalPackage#getRental()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='startDateBeforeEndDate'"
 *        annotation="gmf.node label='startDate'"
 * @generated
 */
public interface MRental extends EObject {
	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getRental_Customer()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MRental#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Rented Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rented Object</em>' reference.
	 * @see #setRentedObject(RentalObject)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getRental_RentedObject()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='solid'"
	 * @generated
	 */
	RentalObject getRentedObject();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MRental#getRentedObject <em>Rented Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rented Object</em>' reference.
	 * @see #getRentedObject()
	 * @generated
	 */
	void setRentedObject(RentalObject value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getRental_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MRental#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getRental_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MRental#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Parent Agency</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.scalian.rental.model.rental.MRentalAgency#getRentals <em>Rentals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Agency</em>' container reference.
	 * @see #setParentAgency(RentalAgency)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getRental_ParentAgency()
	 * @see com.scalian.rental.model.rental.MRentalAgency#getRentals
	 * @model opposite="rentals" required="true" transient="false"
	 * @generated
	 */
	RentalAgency getParentAgency();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MRental#getParentAgency <em>Parent Agency</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Agency</em>' container reference.
	 * @see #getParentAgency()
	 * @generated
	 */
	void setParentAgency(RentalAgency value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(String)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getRental_Note()
	 * @model
	 * @generated
	 */
	String getNote();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MRental#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int nbDaysBooked();

} // MRental
