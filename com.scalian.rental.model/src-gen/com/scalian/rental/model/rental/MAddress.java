/**
 */
package com.scalian.rental.model.rental;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.scalian.rental.model.rental.MAddress#getStreetType <em>Street Type</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MAddress#getNumber <em>Number</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MAddress#getZipCode <em>Zip Code</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MAddress#getCity <em>City</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MAddress#getStreetName <em>Street Name</em>}</li>
 * </ul>
 *
 * @see com.scalian.rental.model.rental.MRentalPackage#getAddress()
 * @model annotation="gmf.node label='city'"
 * @generated
 */
public interface MAddress extends EObject {
	/**
	 * Returns the value of the '<em><b>Street Type</b></em>' attribute.
	 * The default value is <code>"Street"</code>.
	 * The literals are from the enumeration {@link com.scalian.rental.model.rental.StreetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street Type</em>' attribute.
	 * @see com.scalian.rental.model.rental.StreetType
	 * @see #setStreetType(StreetType)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getAddress_StreetType()
	 * @model default="Street"
	 * @generated
	 */
	StreetType getStreetType();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MAddress#getStreetType <em>Street Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street Type</em>' attribute.
	 * @see com.scalian.rental.model.rental.StreetType
	 * @see #getStreetType()
	 * @generated
	 */
	void setStreetType(StreetType value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getAddress_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MAddress#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Zip Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zip Code</em>' attribute.
	 * @see #setZipCode(String)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getAddress_ZipCode()
	 * @model
	 * @generated
	 */
	String getZipCode();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MAddress#getZipCode <em>Zip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip Code</em>' attribute.
	 * @see #getZipCode()
	 * @generated
	 */
	void setZipCode(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getAddress_City()
	 * @model
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MAddress#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Street Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street Name</em>' attribute.
	 * @see #setStreetName(String)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getAddress_StreetName()
	 * @model
	 * @generated
	 */
	String getStreetName();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MAddress#getStreetName <em>Street Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street Name</em>' attribute.
	 * @see #getStreetName()
	 * @generated
	 */
	void setStreetName(String value);

} // MAddress
