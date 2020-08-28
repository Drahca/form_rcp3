/**
 */
package com.scalian.rental.model.rental.impl;

import com.scalian.rental.model.rental.Customer;
import com.scalian.rental.model.rental.License;
import com.scalian.rental.model.rental.MRentalPackage;

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
 * An implementation of the model object '<em><b>License</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.scalian.rental.model.rental.impl.MLicenseImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.impl.MLicenseImpl#getValidityDate <em>Validity Date</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.impl.MLicenseImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MLicenseImpl extends MinimalEObjectImpl.Container implements License {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidityDate() <em>Validity Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALIDITY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidityDate() <em>Validity Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityDate()
	 * @generated
	 * @ordered
	 */
	protected Date validityDate = VALIDITY_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MLicenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRentalPackage.Literals.LICENSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRentalPackage.LICENSE__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getValidityDate() {
		return validityDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidityDate(Date newValidityDate) {
		Date oldValidityDate = validityDate;
		validityDate = newValidityDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRentalPackage.LICENSE__VALIDITY_DATE,
					oldValidityDate, validityDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Customer getOwner() {
		if (eContainerFeatureID() != MRentalPackage.LICENSE__OWNER)
			return null;
		return (Customer) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Customer newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwner, MRentalPackage.LICENSE__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(Customer newOwner) {
		if (newOwner != eInternalContainer()
				|| (eContainerFeatureID() != MRentalPackage.LICENSE__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject) newOwner).eInverseAdd(this, MRentalPackage.CUSTOMER__LICENSES, Customer.class,
						msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRentalPackage.LICENSE__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isValid() {
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
		case MRentalPackage.LICENSE__OWNER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetOwner((Customer) otherEnd, msgs);
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
		case MRentalPackage.LICENSE__OWNER:
			return basicSetOwner(null, msgs);
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
		case MRentalPackage.LICENSE__OWNER:
			return eInternalContainer().eInverseRemove(this, MRentalPackage.CUSTOMER__LICENSES, Customer.class, msgs);
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
		case MRentalPackage.LICENSE__NUMBER:
			return getNumber();
		case MRentalPackage.LICENSE__VALIDITY_DATE:
			return getValidityDate();
		case MRentalPackage.LICENSE__OWNER:
			return getOwner();
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
		case MRentalPackage.LICENSE__NUMBER:
			setNumber((Integer) newValue);
			return;
		case MRentalPackage.LICENSE__VALIDITY_DATE:
			setValidityDate((Date) newValue);
			return;
		case MRentalPackage.LICENSE__OWNER:
			setOwner((Customer) newValue);
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
		case MRentalPackage.LICENSE__NUMBER:
			setNumber(NUMBER_EDEFAULT);
			return;
		case MRentalPackage.LICENSE__VALIDITY_DATE:
			setValidityDate(VALIDITY_DATE_EDEFAULT);
			return;
		case MRentalPackage.LICENSE__OWNER:
			setOwner((Customer) null);
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
		case MRentalPackage.LICENSE__NUMBER:
			return number != NUMBER_EDEFAULT;
		case MRentalPackage.LICENSE__VALIDITY_DATE:
			return VALIDITY_DATE_EDEFAULT == null ? validityDate != null : !VALIDITY_DATE_EDEFAULT.equals(validityDate);
		case MRentalPackage.LICENSE__OWNER:
			return getOwner() != null;
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
		case MRentalPackage.LICENSE___IS_VALID:
			return isValid();
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
		result.append(" (number: ");
		result.append(number);
		result.append(", validityDate: ");
		result.append(validityDate);
		result.append(')');
		return result.toString();
	}

} //MLicenseImpl
