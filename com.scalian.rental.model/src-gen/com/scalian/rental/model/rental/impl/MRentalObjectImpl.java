/**
 */
package com.scalian.rental.model.rental.impl;

import com.scalian.rental.model.rental.Customer;
import com.scalian.rental.model.rental.MRentalPackage;
import com.scalian.rental.model.rental.Rental;
import com.scalian.rental.model.rental.RentalAgency;
import com.scalian.rental.model.rental.RentalObject;

import java.lang.reflect.InvocationTargetException;

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
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.scalian.rental.model.rental.impl.MRentalObjectImpl#getID <em>ID</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.impl.MRentalObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.impl.MRentalObjectImpl#getParentAgency <em>Parent Agency</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.impl.MRentalObjectImpl#isAvailable <em>Available</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MRentalObjectImpl extends MinimalEObjectImpl.Container implements RentalObject {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

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
	 * The default value of the '{@link #isAvailable() <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AVAILABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAvailable() <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvailable()
	 * @generated
	 * @ordered
	 */
	protected boolean available = AVAILABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MRentalObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRentalPackage.Literals.RENTAL_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(long newID) {
		long oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRentalPackage.RENTAL_OBJECT__ID, oldID, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MRentalPackage.RENTAL_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RentalAgency getParentAgency() {
		if (eContainerFeatureID() != MRentalPackage.RENTAL_OBJECT__PARENT_AGENCY)
			return null;
		return (RentalAgency) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentAgency(RentalAgency newParentAgency, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParentAgency, MRentalPackage.RENTAL_OBJECT__PARENT_AGENCY, msgs);
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
				|| (eContainerFeatureID() != MRentalPackage.RENTAL_OBJECT__PARENT_AGENCY && newParentAgency != null)) {
			if (EcoreUtil.isAncestor(this, newParentAgency))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentAgency != null)
				msgs = ((InternalEObject) newParentAgency).eInverseAdd(this,
						MRentalPackage.RENTAL_AGENCY__OBJECTS_TO_RENT, RentalAgency.class, msgs);
			msgs = basicSetParentAgency(newParentAgency, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRentalPackage.RENTAL_OBJECT__PARENT_AGENCY,
					newParentAgency, newParentAgency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAvailable() {
		return available;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailable(boolean newAvailable) {
		boolean oldAvailable = available;
		available = newAvailable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRentalPackage.RENTAL_OBJECT__AVAILABLE, oldAvailable,
					available));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rental rent(Customer customer) {
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
		case MRentalPackage.RENTAL_OBJECT__PARENT_AGENCY:
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
		case MRentalPackage.RENTAL_OBJECT__PARENT_AGENCY:
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
		case MRentalPackage.RENTAL_OBJECT__PARENT_AGENCY:
			return eInternalContainer().eInverseRemove(this, MRentalPackage.RENTAL_AGENCY__OBJECTS_TO_RENT,
					RentalAgency.class, msgs);
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
		case MRentalPackage.RENTAL_OBJECT__ID:
			return getID();
		case MRentalPackage.RENTAL_OBJECT__NAME:
			return getName();
		case MRentalPackage.RENTAL_OBJECT__PARENT_AGENCY:
			return getParentAgency();
		case MRentalPackage.RENTAL_OBJECT__AVAILABLE:
			return isAvailable();
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
		case MRentalPackage.RENTAL_OBJECT__ID:
			setID((Long) newValue);
			return;
		case MRentalPackage.RENTAL_OBJECT__NAME:
			setName((String) newValue);
			return;
		case MRentalPackage.RENTAL_OBJECT__PARENT_AGENCY:
			setParentAgency((RentalAgency) newValue);
			return;
		case MRentalPackage.RENTAL_OBJECT__AVAILABLE:
			setAvailable((Boolean) newValue);
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
		case MRentalPackage.RENTAL_OBJECT__ID:
			setID(ID_EDEFAULT);
			return;
		case MRentalPackage.RENTAL_OBJECT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MRentalPackage.RENTAL_OBJECT__PARENT_AGENCY:
			setParentAgency((RentalAgency) null);
			return;
		case MRentalPackage.RENTAL_OBJECT__AVAILABLE:
			setAvailable(AVAILABLE_EDEFAULT);
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
		case MRentalPackage.RENTAL_OBJECT__ID:
			return id != ID_EDEFAULT;
		case MRentalPackage.RENTAL_OBJECT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MRentalPackage.RENTAL_OBJECT__PARENT_AGENCY:
			return getParentAgency() != null;
		case MRentalPackage.RENTAL_OBJECT__AVAILABLE:
			return available != AVAILABLE_EDEFAULT;
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
		case MRentalPackage.RENTAL_OBJECT___RENT__MCUSTOMER:
			return rent((Customer) arguments.get(0));
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", available: ");
		result.append(available);
		result.append(')');
		return result.toString();
	}

} //MRentalObjectImpl
