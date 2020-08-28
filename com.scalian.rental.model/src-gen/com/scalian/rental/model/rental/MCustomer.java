/**
 */
package com.scalian.rental.model.rental;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.scalian.rental.model.rental.MCustomer#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MCustomer#getName <em>Name</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MCustomer#getAddress <em>Address</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MCustomer#getLicenses <em>Licenses</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MCustomer#getParentAgency <em>Parent Agency</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.MCustomer#getRemarque <em>Remarque</em>}</li>
 * </ul>
 *
 * @see com.scalian.rental.model.rental.MRentalPackage#getCustomer()
 * @model
 * @generated
 */
public interface MCustomer extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getCustomer_FirstName()
	 * @model
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MCustomer#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getCustomer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MCustomer#getName <em>Name</em>}' attribute.
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
	 * @see com.scalian.rental.model.rental.MRentalPackage#getCustomer_Address()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MCustomer#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Licenses</b></em>' containment reference list.
	 * The list contents are of type {@link com.scalian.rental.model.rental.License}.
	 * It is bidirectional and its opposite is '{@link com.scalian.rental.model.rental.MLicense#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Licenses</em>' containment reference list.
	 * @see com.scalian.rental.model.rental.MRentalPackage#getCustomer_Licenses()
	 * @see com.scalian.rental.model.rental.MLicense#getOwner
	 * @model opposite="owner" containment="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	EList<License> getLicenses();

	/**
	 * Returns the value of the '<em><b>Parent Agency</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.scalian.rental.model.rental.MRentalAgency#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Agency</em>' container reference.
	 * @see #setParentAgency(RentalAgency)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getCustomer_ParentAgency()
	 * @see com.scalian.rental.model.rental.MRentalAgency#getCustomers
	 * @model opposite="customers" required="true" transient="false"
	 * @generated
	 */
	RentalAgency getParentAgency();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MCustomer#getParentAgency <em>Parent Agency</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Agency</em>' container reference.
	 * @see #getParentAgency()
	 * @generated
	 */
	void setParentAgency(RentalAgency value);

	/**
	 * Returns the value of the '<em><b>Remarque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remarque</em>' attribute.
	 * @see #setRemarque(String)
	 * @see com.scalian.rental.model.rental.MRentalPackage#getCustomer_Remarque()
	 * @model
	 * @generated
	 */
	String getRemarque();

	/**
	 * Sets the value of the '{@link com.scalian.rental.model.rental.MCustomer#getRemarque <em>Remarque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarque</em>' attribute.
	 * @see #getRemarque()
	 * @generated
	 */
	void setRemarque(String value);

} // MCustomer
