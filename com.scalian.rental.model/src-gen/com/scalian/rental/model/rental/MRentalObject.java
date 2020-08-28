/**
 */
package com.scalian.rental.model.rental;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.scalian.rental.model.rental.MRentalObject#getID <em>ID</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MRentalObject#getName <em>Name</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MRentalObject#getParentAgency <em>Parent Agency</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MRentalObject#isAvailable <em>Available</em>}</li>
 * </ul>
 *
 * @see com.scalian.rental.model.rental.MRentalPackage#getRentalObject()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface MRentalObject extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(long)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getRentalObject_ID()
	 * @model id="true"
	 * @generated
	 */
	long getID();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MRentalObject#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(long value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getRentalObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MRentalObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent Agency</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.scalian.rental.model.rental.MRentalAgency#getObjectsToRent <em>Objects To Rent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Agency</em>' container reference.
	 * @see #setParentAgency(RentalAgency)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getRentalObject_ParentAgency()
	 * @see com.scalian.rental.model.rental.MRentalAgency#getObjectsToRent
	 * @model opposite="objectsToRent" required="true" transient="false"
	 * @generated
	 */
	RentalAgency getParentAgency();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MRentalObject#getParentAgency <em>Parent Agency</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Agency</em>' container reference.
	 * @see #getParentAgency()
	 * @generated
	 */
	void setParentAgency(RentalAgency value);

	/**
	 * Returns the value of the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available</em>' attribute.
	 * @see #setAvailable(boolean)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getRentalObject_Available()
	 * @model
	 * @generated
	 */
	boolean isAvailable();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MRentalObject#isAvailable <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available</em>' attribute.
	 * @see #isAvailable()
	 * @generated
	 */
	void setAvailable(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Rental rent(Customer customer);

} // MRentalObject
