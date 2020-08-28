/**
 */
package com.scalian.rental.model.rental;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>License</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.scalian.rental.model.rental.MLicense#getNumber <em>Number</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MLicense#getValidityDate <em>Validity Date</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MLicense#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see com.scalian.rental.model.rental.MRentalPackage#getLicense()
 * @model annotation="gmf.node label='number'"
 * @generated
 */
public interface MLicense extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getLicense_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MLicense#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Validity Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity Date</em>' attribute.
	 * @see #setValidityDate(Date)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getLicense_ValidityDate()
	 * @model
	 * @generated
	 */
	Date getValidityDate();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MLicense#getValidityDate <em>Validity Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Date</em>' attribute.
	 * @see #getValidityDate()
	 * @generated
	 */
	void setValidityDate(Date value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.scalian.rental.model.rental.MCustomer#getLicenses <em>Licenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Customer)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getLicense_Owner()
	 * @see com.scalian.rental.model.rental.MCustomer#getLicenses
	 * @model opposite="licenses" transient="false"
	 * @generated
	 */
	Customer getOwner();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MLicense#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Customer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isValid();

} // MLicense
