/**
 */
package com.scalian.rental.model.rental.impl;

import com.scalian.rental.model.rental.Customer;
import com.scalian.rental.model.rental.MRentalPackage;
import com.scalian.rental.model.rental.Rental;
import com.scalian.rental.model.rental.RentalAgency;
import com.scalian.rental.model.rental.RentalObject;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rental</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.scalian.rental.model.rental.impl.MRentalImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.impl.MRentalImpl#getRentedObject <em>Rented Object</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.impl.MRentalImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.impl.MRentalImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.impl.MRentalImpl#getParentAgency <em>Parent Agency</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.impl.MRentalImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MRentalImpl extends MinimalEObjectImpl.Container implements Rental {
	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The cached value of the '{@link #getRentedObject() <em>Rented Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRentedObject()
	 * @generated
	 * @ordered
	 */
	protected RentalObject rentedObject;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected String note = NOTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MRentalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRentalPackage.Literals.RENTAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject) customer;
			customer = (Customer) eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MRentalPackage.RENTAL__CUSTOMER,
							oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomer(Customer newCustomer) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRentalPackage.RENTAL__CUSTOMER, oldCustomer,
					customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RentalObject getRentedObject() {
		if (rentedObject != null && rentedObject.eIsProxy()) {
			InternalEObject oldRentedObject = (InternalEObject) rentedObject;
			rentedObject = (RentalObject) eResolveProxy(oldRentedObject);
			if (rentedObject != oldRentedObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MRentalPackage.RENTAL__RENTED_OBJECT,
							oldRentedObject, rentedObject));
			}
		}
		return rentedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RentalObject basicGetRentedObject() {
		return rentedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRentedObject(RentalObject newRentedObject) {
		RentalObject oldRentedObject = rentedObject;
		rentedObject = newRentedObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRentalPackage.RENTAL__RENTED_OBJECT, oldRentedObject,
					rentedObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRentalPackage.RENTAL__START_DATE, oldStartDate,
					startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRentalPackage.RENTAL__END_DATE, oldEndDate,
					endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RentalAgency getParentAgency() {
		if (eContainerFeatureID() != MRentalPackage.RENTAL__PARENT_AGENCY)
			return null;
		return (RentalAgency) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentAgency(RentalAgency newParentAgency, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParentAgency, MRentalPackage.RENTAL__PARENT_AGENCY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAgency(RentalAgency newParentAgency) {
		if (newParentAgency != eInternalContainer()
				|| (eContainerFeatureID() != MRentalPackage.RENTAL__PARENT_AGENCY && newParentAgency != null)) {
			if (EcoreUtil.isAncestor(this, newParentAgency))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentAgency != null)
				msgs = ((InternalEObject) newParentAgency).eInverseAdd(this, MRentalPackage.RENTAL_AGENCY__RENTALS,
						RentalAgency.class, msgs);
			msgs = basicSetParentAgency(newParentAgency, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRentalPackage.RENTAL__PARENT_AGENCY, newParentAgency,
					newParentAgency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNote(String newNote) {
		String oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRentalPackage.RENTAL__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int nbDaysBooked() {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MRentalPackage.RENTAL__PARENT_AGENCY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParentAgency((RentalAgency) otherEnd, msgs);
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
		case MRentalPackage.RENTAL__PARENT_AGENCY:
			return basicSetParentAgency(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case MRentalPackage.RENTAL__PARENT_AGENCY:
			return eInternalContainer().eInverseRemove(this, MRentalPackage.RENTAL_AGENCY__RENTALS, RentalAgency.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MRentalPackage.RENTAL__CUSTOMER:
			if (resolve)
				return getCustomer();
			return basicGetCustomer();
		case MRentalPackage.RENTAL__RENTED_OBJECT:
			if (resolve)
				return getRentedObject();
			return basicGetRentedObject();
		case MRentalPackage.RENTAL__START_DATE:
			return getStartDate();
		case MRentalPackage.RENTAL__END_DATE:
			return getEndDate();
		case MRentalPackage.RENTAL__PARENT_AGENCY:
			return getParentAgency();
		case MRentalPackage.RENTAL__NOTE:
			return getNote();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MRentalPackage.RENTAL__CUSTOMER:
			setCustomer((Customer) newValue);
			return;
		case MRentalPackage.RENTAL__RENTED_OBJECT:
			setRentedObject((RentalObject) newValue);
			return;
		case MRentalPackage.RENTAL__START_DATE:
			setStartDate((Date) newValue);
			return;
		case MRentalPackage.RENTAL__END_DATE:
			setEndDate((Date) newValue);
			return;
		case MRentalPackage.RENTAL__PARENT_AGENCY:
			setParentAgency((RentalAgency) newValue);
			return;
		case MRentalPackage.RENTAL__NOTE:
			setNote((String) newValue);
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
		case MRentalPackage.RENTAL__CUSTOMER:
			setCustomer((Customer) null);
			return;
		case MRentalPackage.RENTAL__RENTED_OBJECT:
			setRentedObject((RentalObject) null);
			return;
		case MRentalPackage.RENTAL__START_DATE:
			setStartDate(START_DATE_EDEFAULT);
			return;
		case MRentalPackage.RENTAL__END_DATE:
			setEndDate(END_DATE_EDEFAULT);
			return;
		case MRentalPackage.RENTAL__PARENT_AGENCY:
			setParentAgency((RentalAgency) null);
			return;
		case MRentalPackage.RENTAL__NOTE:
			setNote(NOTE_EDEFAULT);
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
		case MRentalPackage.RENTAL__CUSTOMER:
			return customer != null;
		case MRentalPackage.RENTAL__RENTED_OBJECT:
			return rentedObject != null;
		case MRentalPackage.RENTAL__START_DATE:
			return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
		case MRentalPackage.RENTAL__END_DATE:
			return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
		case MRentalPackage.RENTAL__PARENT_AGENCY:
			return getParentAgency() != null;
		case MRentalPackage.RENTAL__NOTE:
			return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
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
		case MRentalPackage.RENTAL___NB_DAYS_BOOKED:
			return nbDaysBooked();
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
		result.append(" (startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", note: ");
		result.append(note);
		result.append(')');
		return result.toString();
	}

} //MRentalImpl
