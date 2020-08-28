/**
 */
package com.scalian.rental.model.rental;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.scalian.rental.model.rental.MRentalFactory
 * @model kind="package"
 * @generated
 */
public interface MRentalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rental";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.scalian.rental/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rental";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MRentalPackage eINSTANCE = com.scalian.rental.model.rental.impl.MRentalPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.scalian.rental.model.rental.impl.MRentalAgencyImpl <em>Agency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.scalian.rental.model.rental.impl.MRentalAgencyImpl
	 * @see com.scalian.rental.model.rental.impl.MRentalPackageImpl#getRentalAgency()
	 * @generated
	 */
	int RENTAL_AGENCY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_AGENCY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_AGENCY__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Objects To Rent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_AGENCY__OBJECTS_TO_RENT = 2;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_AGENCY__CUSTOMERS = 3;

	/**
	 * The feature id for the '<em><b>Rentals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_AGENCY__RENTALS = 4;

	/**
	 * The number of structural features of the '<em>Agency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_AGENCY_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Book</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_AGENCY___BOOK__MCUSTOMER_MRENTALOBJECT_DATE_DATE = 0;

	/**
	 * The operation id for the '<em>Is Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_AGENCY___IS_AVAILABLE__MRENTALOBJECT_DATE_DATE = 1;

	/**
	 * The number of operations of the '<em>Agency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_AGENCY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.scalian.rental.model.rental.impl.MCustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.scalian.rental.model.rental.impl.MCustomerImpl
	 * @see com.scalian.rental.model.rental.impl.MRentalPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 1;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Licenses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__LICENSES = 3;

	/**
	 * The feature id for the '<em><b>Parent Agency</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PARENT_AGENCY = 4;

	/**
	 * The feature id for the '<em><b>Remarque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__REMARQUE = 5;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.scalian.rental.model.rental.impl.MAddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.scalian.rental.model.rental.impl.MAddressImpl
	 * @see com.scalian.rental.model.rental.impl.MRentalPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Street Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STREET_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Zip Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ZIP_CODE = 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = 3;

	/**
	 * The feature id for the '<em><b>Street Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STREET_NAME = 4;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.scalian.rental.model.rental.impl.MRentalObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.scalian.rental.model.rental.impl.MRentalObjectImpl
	 * @see com.scalian.rental.model.rental.impl.MRentalPackageImpl#getRentalObject()
	 * @generated
	 */
	int RENTAL_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_OBJECT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_OBJECT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Parent Agency</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_OBJECT__PARENT_AGENCY = 2;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_OBJECT__AVAILABLE = 3;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_OBJECT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Rent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_OBJECT___RENT__MCUSTOMER = 0;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_OBJECT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.scalian.rental.model.rental.impl.MLicenseImpl <em>License</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.scalian.rental.model.rental.impl.MLicenseImpl
	 * @see com.scalian.rental.model.rental.impl.MRentalPackageImpl#getLicense()
	 * @generated
	 */
	int LICENSE = 4;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Validity Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__VALIDITY_DATE = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__OWNER = 2;

	/**
	 * The number of structural features of the '<em>License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE___IS_VALID = 0;

	/**
	 * The number of operations of the '<em>License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.scalian.rental.model.rental.impl.MRentalImpl <em>Rental</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.scalian.rental.model.rental.impl.MRentalImpl
	 * @see com.scalian.rental.model.rental.impl.MRentalPackageImpl#getRental()
	 * @generated
	 */
	int RENTAL = 5;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL__CUSTOMER = 0;

	/**
	 * The feature id for the '<em><b>Rented Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL__RENTED_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL__START_DATE = 2;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL__END_DATE = 3;

	/**
	 * The feature id for the '<em><b>Parent Agency</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL__PARENT_AGENCY = 4;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL__NOTE = 5;

	/**
	 * The number of structural features of the '<em>Rental</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Nb Days Booked</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL___NB_DAYS_BOOKED = 0;

	/**
	 * The number of operations of the '<em>Rental</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.scalian.rental.model.rental.StreetType <em>Street Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.scalian.rental.model.rental.StreetType
	 * @see com.scalian.rental.model.rental.impl.MRentalPackageImpl#getStreetType()
	 * @generated
	 */
	int STREET_TYPE = 6;

	/**
	 * Returns the meta object for class '{@link com.scalian.rental.model.rental.MRentalAgency <em>Agency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agency</em>'.
	 * @see com.scalian.rental.model.rental.MRentalAgency
	 * @generated
	 */
	EClass getRentalAgency();

	/**
	 * Returns the meta object for the attribute '{@link com.scalian.rental.model.rental.MRentalAgency#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.scalian.rental.model.rental.MRentalAgency#getName()
	 * @see #getRentalAgency()
	 * @generated
	 */
	EAttribute getRentalAgency_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.scalian.rental.model.rental.MRentalAgency#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see com.scalian.rental.model.rental.MRentalAgency#getAddress()
	 * @see #getRentalAgency()
	 * @generated
	 */
	EReference getRentalAgency_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link com.scalian.rental.model.rental.MRentalAgency#getObjectsToRent <em>Objects To Rent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects To Rent</em>'.
	 * @see com.scalian.rental.model.rental.MRentalAgency#getObjectsToRent()
	 * @see #getRentalAgency()
	 * @generated
	 */
	EReference getRentalAgency_ObjectsToRent();

	/**
	 * Returns the meta object for the containment reference list '{@link com.scalian.rental.model.rental.MRentalAgency#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customers</em>'.
	 * @see com.scalian.rental.model.rental.MRentalAgency#getCustomers()
	 * @see #getRentalAgency()
	 * @generated
	 */
	EReference getRentalAgency_Customers();

	/**
	 * Returns the meta object for the containment reference list '{@link com.scalian.rental.model.rental.MRentalAgency#getRentals <em>Rentals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rentals</em>'.
	 * @see com.scalian.rental.model.rental.MRentalAgency#getRentals()
	 * @see #getRentalAgency()
	 * @generated
	 */
	EReference getRentalAgency_Rentals();

	/**
	 * Returns the meta object for the '{@link com.scalian.rental.model.rental.MRentalAgency#book(com.scalian.rental.model.rental.MCustomer, com.scalian.rental.model.rental.MRentalObject, java.util.Date, java.util.Date) <em>Book</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Book</em>' operation.
	 * @see com.scalian.rental.model.rental.MRentalAgency#book(com.scalian.rental.model.rental.MCustomer, com.scalian.rental.model.rental.MRentalObject, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getRentalAgency__Book__MCustomer_MRentalObject_Date_Date();

	/**
	 * Returns the meta object for the '{@link com.scalian.rental.model.rental.MRentalAgency#isAvailable(com.scalian.rental.model.rental.MRentalObject, java.util.Date, java.util.Date) <em>Is Available</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Available</em>' operation.
	 * @see com.scalian.rental.model.rental.MRentalAgency#isAvailable(com.scalian.rental.model.rental.MRentalObject, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getRentalAgency__IsAvailable__MRentalObject_Date_Date();

	/**
	 * Returns the meta object for class '{@link com.scalian.rental.model.rental.MCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see com.scalian.rental.model.rental.MCustomer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link com.scalian.rental.model.rental.MCustomer#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see com.scalian.rental.model.rental.MCustomer#getFirstName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link com.scalian.rental.model.rental.MCustomer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.scalian.rental.model.rental.MCustomer#getName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.scalian.rental.model.rental.MCustomer#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see com.scalian.rental.model.rental.MCustomer#getAddress()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link com.scalian.rental.model.rental.MCustomer#getLicenses <em>Licenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Licenses</em>'.
	 * @see com.scalian.rental.model.rental.MCustomer#getLicenses()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Licenses();

	/**
	 * Returns the meta object for the container reference '{@link com.scalian.rental.model.rental.MCustomer#getParentAgency <em>Parent Agency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Agency</em>'.
	 * @see com.scalian.rental.model.rental.MCustomer#getParentAgency()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_ParentAgency();

	/**
	 * Returns the meta object for the attribute '{@link com.scalian.rental.model.rental.MCustomer#getRemarque <em>Remarque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarque</em>'.
	 * @see com.scalian.rental.model.rental.MCustomer#getRemarque()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Remarque();

	/**
	 * Returns the meta object for class '{@link com.scalian.rental.model.rental.MAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see com.scalian.rental.model.rental.MAddress
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link com.scalian.rental.model.rental.MAddress#getStreetType <em>Street Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street Type</em>'.
	 * @see com.scalian.rental.model.rental.MAddress#getStreetType()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_StreetType();

	/**
	 * Returns the meta object for the attribute '{@link com.scalian.rental.model.rental.MAddress#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see com.scalian.rental.model.rental.MAddress#getNumber()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Number();

	/**
	 * Returns the meta object for the attribute '{@link com.scalian.rental.model.rental.MAddress#getZipCode <em>Zip Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip Code</em>'.
	 * @see com.scalian.rental.model.rental.MAddress#getZipCode()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_ZipCode();

	/**
	 * Returns the meta object for the attribute '{@link com.scalian.rental.model.rental.MAddress#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see com.scalian.rental.model.rental.MAddress#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link com.scalian.rental.model.rental.MAddress#getStreetName <em>Street Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street Name</em>'.
	 * @see com.scalian.rental.model.rental.MAddress#getStreetName()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_StreetName();

	/**
	 * Returns the meta object for class '{@link com.scalian.rental.model.rental.MRentalObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see com.scalian.rental.model.rental.MRentalObject
	 * @generated
	 */
	EClass getRentalObject();

	/**
	 * Returns the meta object for the attribute '{@link com.scalian.rental.model.rental.MRentalObject#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see com.scalian.rental.model.rental.MRentalObject#getID()
	 * @see #getRentalObject()
	 * @generated
	 */
	EAttribute getRentalObject_ID();

	/**
	 * Returns the meta object for the attribute '{@link com.scalian.rental.model.rental.MRentalObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.scalian.rental.model.rental.MRentalObject#getName()
	 * @see #getRentalObject()
	 * @generated
	 */
	EAttribute getRentalObject_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.scalian.rental.model.rental.MRentalObject#getParentAgency <em>Parent Agency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Agency</em>'.
	 * @see com.scalian.rental.model.rental.MRentalObject#getParentAgency()
	 * @see #getRentalObject()
	 * @generated
	 */
	EReference getRentalObject_ParentAgency();

	/**
	 * Returns the meta object for the attribute '{@link com.scalian.rental.model.rental.MRentalObject#isAvailable <em>Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available</em>'.
	 * @see com.scalian.rental.model.rental.MRentalObject#isAvailable()
	 * @see #getRentalObject()
	 * @generated
	 */
	EAttribute getRentalObject_Available();

	/**
	 * Returns the meta object for the '{@link com.scalian.rental.model.rental.MRentalObject#rent(com.scalian.rental.model.rental.MCustomer) <em>Rent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rent</em>' operation.
	 * @see com.scalian.rental.model.rental.MRentalObject#rent(com.scalian.rental.model.rental.MCustomer)
	 * @generated
	 */
	EOperation getRentalObject__Rent__MCustomer();

	/**
	 * Returns the meta object for class '{@link com.scalian.rental.model.rental.MLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License</em>'.
	 * @see com.scalian.rental.model.rental.MLicense
	 * @generated
	 */
	EClass getLicense();

	/**
	 * Returns the meta object for the attribute '{@link com.scalian.rental.model.rental.MLicense#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see com.scalian.rental.model.rental.MLicense#getNumber()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Number();

	/**
	 * Returns the meta object for the attribute '{@link com.scalian.rental.model.rental.MLicense#getValidityDate <em>Validity Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validity Date</em>'.
	 * @see com.scalian.rental.model.rental.MLicense#getValidityDate()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_ValidityDate();

	/**
	 * Returns the meta object for the container reference '{@link com.scalian.rental.model.rental.MLicense#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see com.scalian.rental.model.rental.MLicense#getOwner()
	 * @see #getLicense()
	 * @generated
	 */
	EReference getLicense_Owner();

	/**
	 * Returns the meta object for the '{@link com.scalian.rental.model.rental.MLicense#isValid() <em>Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid</em>' operation.
	 * @see com.scalian.rental.model.rental.MLicense#isValid()
	 * @generated
	 */
	EOperation getLicense__IsValid();

	/**
	 * Returns the meta object for class '{@link com.scalian.rental.model.rental.MRental <em>Rental</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rental</em>'.
	 * @see com.scalian.rental.model.rental.MRental
	 * @generated
	 */
	EClass getRental();

	/**
	 * Returns the meta object for the reference '{@link com.scalian.rental.model.rental.MRental#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see com.scalian.rental.model.rental.MRental#getCustomer()
	 * @see #getRental()
	 * @generated
	 */
	EReference getRental_Customer();

	/**
	 * Returns the meta object for the reference '{@link com.scalian.rental.model.rental.MRental#getRentedObject <em>Rented Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rented Object</em>'.
	 * @see com.scalian.rental.model.rental.MRental#getRentedObject()
	 * @see #getRental()
	 * @generated
	 */
	EReference getRental_RentedObject();

	/**
	 * Returns the meta object for the attribute '{@link com.scalian.rental.model.rental.MRental#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see com.scalian.rental.model.rental.MRental#getStartDate()
	 * @see #getRental()
	 * @generated
	 */
	EAttribute getRental_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link com.scalian.rental.model.rental.MRental#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see com.scalian.rental.model.rental.MRental#getEndDate()
	 * @see #getRental()
	 * @generated
	 */
	EAttribute getRental_EndDate();

	/**
	 * Returns the meta object for the container reference '{@link com.scalian.rental.model.rental.MRental#getParentAgency <em>Parent Agency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Agency</em>'.
	 * @see com.scalian.rental.model.rental.MRental#getParentAgency()
	 * @see #getRental()
	 * @generated
	 */
	EReference getRental_ParentAgency();

	/**
	 * Returns the meta object for the attribute '{@link com.scalian.rental.model.rental.MRental#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see com.scalian.rental.model.rental.MRental#getNote()
	 * @see #getRental()
	 * @generated
	 */
	EAttribute getRental_Note();

	/**
	 * Returns the meta object for the '{@link com.scalian.rental.model.rental.MRental#nbDaysBooked() <em>Nb Days Booked</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nb Days Booked</em>' operation.
	 * @see com.scalian.rental.model.rental.MRental#nbDaysBooked()
	 * @generated
	 */
	EOperation getRental__NbDaysBooked();

	/**
	 * Returns the meta object for enum '{@link com.scalian.rental.model.rental.StreetType <em>Street Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Street Type</em>'.
	 * @see com.scalian.rental.model.rental.StreetType
	 * @generated
	 */
	EEnum getStreetType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MRentalFactory getRentalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.scalian.rental.model.rental.impl.MRentalAgencyImpl <em>Agency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.scalian.rental.model.rental.impl.MRentalAgencyImpl
		 * @see com.scalian.rental.model.rental.impl.MRentalPackageImpl#getRentalAgency()
		 * @generated
		 */
		EClass RENTAL_AGENCY = eINSTANCE.getRentalAgency();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL_AGENCY__NAME = eINSTANCE.getRentalAgency_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTAL_AGENCY__ADDRESS = eINSTANCE.getRentalAgency_Address();

		/**
		 * The meta object literal for the '<em><b>Objects To Rent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTAL_AGENCY__OBJECTS_TO_RENT = eINSTANCE.getRentalAgency_ObjectsToRent();

		/**
		 * The meta object literal for the '<em><b>Customers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTAL_AGENCY__CUSTOMERS = eINSTANCE.getRentalAgency_Customers();

		/**
		 * The meta object literal for the '<em><b>Rentals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTAL_AGENCY__RENTALS = eINSTANCE.getRentalAgency_Rentals();

		/**
		 * The meta object literal for the '<em><b>Book</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RENTAL_AGENCY___BOOK__MCUSTOMER_MRENTALOBJECT_DATE_DATE = eINSTANCE
				.getRentalAgency__Book__MCustomer_MRentalObject_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Is Available</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RENTAL_AGENCY___IS_AVAILABLE__MRENTALOBJECT_DATE_DATE = eINSTANCE
				.getRentalAgency__IsAvailable__MRentalObject_Date_Date();

		/**
		 * The meta object literal for the '{@link com.scalian.rental.model.rental.impl.MCustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.scalian.rental.model.rental.impl.MCustomerImpl
		 * @see com.scalian.rental.model.rental.impl.MRentalPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__FIRST_NAME = eINSTANCE.getCustomer_FirstName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__NAME = eINSTANCE.getCustomer_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__ADDRESS = eINSTANCE.getCustomer_Address();

		/**
		 * The meta object literal for the '<em><b>Licenses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__LICENSES = eINSTANCE.getCustomer_Licenses();

		/**
		 * The meta object literal for the '<em><b>Parent Agency</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__PARENT_AGENCY = eINSTANCE.getCustomer_ParentAgency();

		/**
		 * The meta object literal for the '<em><b>Remarque</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__REMARQUE = eINSTANCE.getCustomer_Remarque();

		/**
		 * The meta object literal for the '{@link com.scalian.rental.model.rental.impl.MAddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.scalian.rental.model.rental.impl.MAddressImpl
		 * @see com.scalian.rental.model.rental.impl.MRentalPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Street Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STREET_TYPE = eINSTANCE.getAddress_StreetType();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__NUMBER = eINSTANCE.getAddress_Number();

		/**
		 * The meta object literal for the '<em><b>Zip Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__ZIP_CODE = eINSTANCE.getAddress_ZipCode();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>Street Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STREET_NAME = eINSTANCE.getAddress_StreetName();

		/**
		 * The meta object literal for the '{@link com.scalian.rental.model.rental.impl.MRentalObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.scalian.rental.model.rental.impl.MRentalObjectImpl
		 * @see com.scalian.rental.model.rental.impl.MRentalPackageImpl#getRentalObject()
		 * @generated
		 */
		EClass RENTAL_OBJECT = eINSTANCE.getRentalObject();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL_OBJECT__ID = eINSTANCE.getRentalObject_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL_OBJECT__NAME = eINSTANCE.getRentalObject_Name();

		/**
		 * The meta object literal for the '<em><b>Parent Agency</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTAL_OBJECT__PARENT_AGENCY = eINSTANCE.getRentalObject_ParentAgency();

		/**
		 * The meta object literal for the '<em><b>Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL_OBJECT__AVAILABLE = eINSTANCE.getRentalObject_Available();

		/**
		 * The meta object literal for the '<em><b>Rent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RENTAL_OBJECT___RENT__MCUSTOMER = eINSTANCE.getRentalObject__Rent__MCustomer();

		/**
		 * The meta object literal for the '{@link com.scalian.rental.model.rental.impl.MLicenseImpl <em>License</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.scalian.rental.model.rental.impl.MLicenseImpl
		 * @see com.scalian.rental.model.rental.impl.MRentalPackageImpl#getLicense()
		 * @generated
		 */
		EClass LICENSE = eINSTANCE.getLicense();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__NUMBER = eINSTANCE.getLicense_Number();

		/**
		 * The meta object literal for the '<em><b>Validity Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__VALIDITY_DATE = eINSTANCE.getLicense_ValidityDate();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LICENSE__OWNER = eINSTANCE.getLicense_Owner();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LICENSE___IS_VALID = eINSTANCE.getLicense__IsValid();

		/**
		 * The meta object literal for the '{@link com.scalian.rental.model.rental.impl.MRentalImpl <em>Rental</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.scalian.rental.model.rental.impl.MRentalImpl
		 * @see com.scalian.rental.model.rental.impl.MRentalPackageImpl#getRental()
		 * @generated
		 */
		EClass RENTAL = eINSTANCE.getRental();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTAL__CUSTOMER = eINSTANCE.getRental_Customer();

		/**
		 * The meta object literal for the '<em><b>Rented Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTAL__RENTED_OBJECT = eINSTANCE.getRental_RentedObject();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL__START_DATE = eINSTANCE.getRental_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL__END_DATE = eINSTANCE.getRental_EndDate();

		/**
		 * The meta object literal for the '<em><b>Parent Agency</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTAL__PARENT_AGENCY = eINSTANCE.getRental_ParentAgency();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL__NOTE = eINSTANCE.getRental_Note();

		/**
		 * The meta object literal for the '<em><b>Nb Days Booked</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RENTAL___NB_DAYS_BOOKED = eINSTANCE.getRental__NbDaysBooked();

		/**
		 * The meta object literal for the '{@link com.scalian.rental.model.rental.StreetType <em>Street Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.scalian.rental.model.rental.StreetType
		 * @see com.scalian.rental.model.rental.impl.MRentalPackageImpl#getStreetType()
		 * @generated
		 */
		EEnum STREET_TYPE = eINSTANCE.getStreetType();

	}

} //MRentalPackage
