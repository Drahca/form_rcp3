/**
 */
package com.scalian.rental.model.rental.impl;

import com.scalian.rental.model.rental.Address;
import com.scalian.rental.model.rental.Customer;
import com.scalian.rental.model.rental.MRentalPackage;
import com.scalian.rental.model.rental.Rental;
import com.scalian.rental.model.rental.RentalAgency;
import com.scalian.rental.model.rental.RentalObject;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.scalian.rental.model.rental.impl.MRentalAgencyImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.impl.MRentalAgencyImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.impl.MRentalAgencyImpl#getObjectsToRent <em>Objects To Rent</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.impl.MRentalAgencyImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.impl.MRentalAgencyImpl#getRentals <em>Rentals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MRentalAgencyImpl extends MinimalEObjectImpl.Container implements RentalAgency {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected Address address;

	/**
	 * The cached value of the '{@link #getObjectsToRent() <em>Objects To Rent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectsToRent()
	 * @generated
	 * @ordered
	 */
	protected EList<RentalObject> objectsToRent;

	/**
	 * The cached value of the '{@link #getCustomers() <em>Customers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomers()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customers;

	/**
	 * The cached value of the '{@link #getRentals() <em>Rentals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRentals()
	 * @generated
	 * @ordered
	 */
	protected EList<Rental> rentals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MRentalAgencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRentalPackage.Literals.RENTAL_AGENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRentalPackage.RENTAL_AGENCY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Address getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(Address newAddress, NotificationChain msgs) {
		Address oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MRentalPackage.RENTAL_AGENCY__ADDRESS, oldAddress, newAddress);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(Address newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject) address).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MRentalPackage.RENTAL_AGENCY__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject) newAddress).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MRentalPackage.RENTAL_AGENCY__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRentalPackage.RENTAL_AGENCY__ADDRESS, newAddress,
					newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RentalObject> getObjectsToRent() {
		if (objectsToRent == null) {
			objectsToRent = new EObjectContainmentWithInverseEList<RentalObject>(RentalObject.class, this,
					MRentalPackage.RENTAL_AGENCY__OBJECTS_TO_RENT, MRentalPackage.RENTAL_OBJECT__PARENT_AGENCY);
		}
		return objectsToRent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Customer> getCustomers() {
		if (customers == null) {
			customers = new EObjectContainmentWithInverseEList<Customer>(Customer.class, this,
					MRentalPackage.RENTAL_AGENCY__CUSTOMERS, MRentalPackage.CUSTOMER__PARENT_AGENCY);
		}
		return customers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rental> getRentals() {
		if (rentals == null) {
			rentals = new EObjectContainmentWithInverseEList<Rental>(Rental.class, this,
					MRentalPackage.RENTAL_AGENCY__RENTALS, MRentalPackage.RENTAL__PARENT_AGENCY);
		}
		return rentals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rental book(Customer customer, RentalObject rentedObject, Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAvailable(RentalObject rentedObject, Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MRentalPackage.RENTAL_AGENCY__OBJECTS_TO_RENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getObjectsToRent()).basicAdd(otherEnd, msgs);
		case MRentalPackage.RENTAL_AGENCY__CUSTOMERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCustomers()).basicAdd(otherEnd, msgs);
		case MRentalPackage.RENTAL_AGENCY__RENTALS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRentals()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MRentalPackage.RENTAL_AGENCY__ADDRESS:
			return basicSetAddress(null, msgs);
		case MRentalPackage.RENTAL_AGENCY__OBJECTS_TO_RENT:
			return ((InternalEList<?>) getObjectsToRent()).basicRemove(otherEnd, msgs);
		case MRentalPackage.RENTAL_AGENCY__CUSTOMERS:
			return ((InternalEList<?>) getCustomers()).basicRemove(otherEnd, msgs);
		case MRentalPackage.RENTAL_AGENCY__RENTALS:
			return ((InternalEList<?>) getRentals()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MRentalPackage.RENTAL_AGENCY__NAME:
			return getName();
		case MRentalPackage.RENTAL_AGENCY__ADDRESS:
			return getAddress();
		case MRentalPackage.RENTAL_AGENCY__OBJECTS_TO_RENT:
			return getObjectsToRent();
		case MRentalPackage.RENTAL_AGENCY__CUSTOMERS:
			return getCustomers();
		case MRentalPackage.RENTAL_AGENCY__RENTALS:
			return getRentals();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MRentalPackage.RENTAL_AGENCY__NAME:
			setName((String) newValue);
			return;
		case MRentalPackage.RENTAL_AGENCY__ADDRESS:
			setAddress((Address) newValue);
			return;
		case MRentalPackage.RENTAL_AGENCY__OBJECTS_TO_RENT:
			getObjectsToRent().clear();
			getObjectsToRent().addAll((Collection<? extends RentalObject>) newValue);
			return;
		case MRentalPackage.RENTAL_AGENCY__CUSTOMERS:
			getCustomers().clear();
			getCustomers().addAll((Collection<? extends Customer>) newValue);
			return;
		case MRentalPackage.RENTAL_AGENCY__RENTALS:
			getRentals().clear();
			getRentals().addAll((Collection<? extends Rental>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MRentalPackage.RENTAL_AGENCY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MRentalPackage.RENTAL_AGENCY__ADDRESS:
			setAddress((Address) null);
			return;
		case MRentalPackage.RENTAL_AGENCY__OBJECTS_TO_RENT:
			getObjectsToRent().clear();
			return;
		case MRentalPackage.RENTAL_AGENCY__CUSTOMERS:
			getCustomers().clear();
			return;
		case MRentalPackage.RENTAL_AGENCY__RENTALS:
			getRentals().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MRentalPackage.RENTAL_AGENCY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MRentalPackage.RENTAL_AGENCY__ADDRESS:
			return address != null;
		case MRentalPackage.RENTAL_AGENCY__OBJECTS_TO_RENT:
			return objectsToRent != null && !objectsToRent.isEmpty();
		case MRentalPackage.RENTAL_AGENCY__CUSTOMERS:
			return customers != null && !customers.isEmpty();
		case MRentalPackage.RENTAL_AGENCY__RENTALS:
			return rentals != null && !rentals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MRentalPackage.RENTAL_AGENCY___BOOK__MCUSTOMER_MRENTALOBJECT_DATE_DATE:
			return book((Customer) arguments.get(0), (RentalObject) arguments.get(1), (Date) arguments.get(2),
					(Date) arguments.get(3));
		case MRentalPackage.RENTAL_AGENCY___IS_AVAILABLE__MRENTALOBJECT_DATE_DATE:
			return isAvailable((RentalObject) arguments.get(0), (Date) arguments.get(1), (Date) arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MRentalAgencyImpl
