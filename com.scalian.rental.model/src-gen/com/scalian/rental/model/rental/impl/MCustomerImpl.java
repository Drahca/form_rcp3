/**
 */
package com.scalian.rental.model.rental.impl;

import com.scalian.rental.model.rental.Address;
import com.scalian.rental.model.rental.Customer;
import com.scalian.rental.model.rental.License;
import com.scalian.rental.model.rental.MRentalPackage;
import com.scalian.rental.model.rental.RentalAgency;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.scalian.rental.model.rental.impl.MCustomerImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.impl.MCustomerImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.impl.MCustomerImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.impl.MCustomerImpl#getLicenses <em>Licenses</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.impl.MCustomerImpl#getParentAgency <em>Parent Agency</em>}</li>
 *   <li>{@link com.scalian.rental.model.rental.impl.MCustomerImpl#getRemarque <em>Remarque</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MCustomerImpl extends MinimalEObjectImpl.Container implements Customer {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getLicenses() <em>Licenses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenses()
	 * @generated
	 * @ordered
	 */
	protected EList<License> licenses;

	/**
	 * The default value of the '{@link #getRemarque() <em>Remarque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarque()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarque() <em>Remarque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarque()
	 * @generated
	 * @ordered
	 */
	protected String remarque = REMARQUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MCustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRentalPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRentalPackage.CUSTOMER__FIRST_NAME, oldFirstName,
					firstName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MRentalPackage.CUSTOMER__NAME, oldName, name));
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
					MRentalPackage.CUSTOMER__ADDRESS, oldAddress, newAddress);
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
						EOPPOSITE_FEATURE_BASE - MRentalPackage.CUSTOMER__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject) newAddress).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MRentalPackage.CUSTOMER__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRentalPackage.CUSTOMER__ADDRESS, newAddress,
					newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<License> getLicenses() {
		if (licenses == null) {
			licenses = new EObjectContainmentWithInverseEList<License>(License.class, this,
					MRentalPackage.CUSTOMER__LICENSES, MRentalPackage.LICENSE__OWNER);
		}
		return licenses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RentalAgency getParentAgency() {
		if (eContainerFeatureID() != MRentalPackage.CUSTOMER__PARENT_AGENCY)
			return null;
		return (RentalAgency) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentAgency(RentalAgency newParentAgency, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParentAgency, MRentalPackage.CUSTOMER__PARENT_AGENCY, msgs);
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
				|| (eContainerFeatureID() != MRentalPackage.CUSTOMER__PARENT_AGENCY && newParentAgency != null)) {
			if (EcoreUtil.isAncestor(this, newParentAgency))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentAgency != null)
				msgs = ((InternalEObject) newParentAgency).eInverseAdd(this, MRentalPackage.RENTAL_AGENCY__CUSTOMERS,
						RentalAgency.class, msgs);
			msgs = basicSetParentAgency(newParentAgency, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRentalPackage.CUSTOMER__PARENT_AGENCY,
					newParentAgency, newParentAgency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemarque() {
		return remarque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarque(String newRemarque) {
		String oldRemarque = remarque;
		remarque = newRemarque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRentalPackage.CUSTOMER__REMARQUE, oldRemarque,
					remarque));
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
		case MRentalPackage.CUSTOMER__LICENSES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLicenses()).basicAdd(otherEnd, msgs);
		case MRentalPackage.CUSTOMER__PARENT_AGENCY:
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
		case MRentalPackage.CUSTOMER__ADDRESS:
			return basicSetAddress(null, msgs);
		case MRentalPackage.CUSTOMER__LICENSES:
			return ((InternalEList<?>) getLicenses()).basicRemove(otherEnd, msgs);
		case MRentalPackage.CUSTOMER__PARENT_AGENCY:
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
		case MRentalPackage.CUSTOMER__PARENT_AGENCY:
			return eInternalContainer().eInverseRemove(this, MRentalPackage.RENTAL_AGENCY__CUSTOMERS,
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
		case MRentalPackage.CUSTOMER__FIRST_NAME:
			return getFirstName();
		case MRentalPackage.CUSTOMER__NAME:
			return getName();
		case MRentalPackage.CUSTOMER__ADDRESS:
			return getAddress();
		case MRentalPackage.CUSTOMER__LICENSES:
			return getLicenses();
		case MRentalPackage.CUSTOMER__PARENT_AGENCY:
			return getParentAgency();
		case MRentalPackage.CUSTOMER__REMARQUE:
			return getRemarque();
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
		case MRentalPackage.CUSTOMER__FIRST_NAME:
			setFirstName((String) newValue);
			return;
		case MRentalPackage.CUSTOMER__NAME:
			setName((String) newValue);
			return;
		case MRentalPackage.CUSTOMER__ADDRESS:
			setAddress((Address) newValue);
			return;
		case MRentalPackage.CUSTOMER__LICENSES:
			getLicenses().clear();
			getLicenses().addAll((Collection<? extends License>) newValue);
			return;
		case MRentalPackage.CUSTOMER__PARENT_AGENCY:
			setParentAgency((RentalAgency) newValue);
			return;
		case MRentalPackage.CUSTOMER__REMARQUE:
			setRemarque((String) newValue);
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
		case MRentalPackage.CUSTOMER__FIRST_NAME:
			setFirstName(FIRST_NAME_EDEFAULT);
			return;
		case MRentalPackage.CUSTOMER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MRentalPackage.CUSTOMER__ADDRESS:
			setAddress((Address) null);
			return;
		case MRentalPackage.CUSTOMER__LICENSES:
			getLicenses().clear();
			return;
		case MRentalPackage.CUSTOMER__PARENT_AGENCY:
			setParentAgency((RentalAgency) null);
			return;
		case MRentalPackage.CUSTOMER__REMARQUE:
			setRemarque(REMARQUE_EDEFAULT);
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
		case MRentalPackage.CUSTOMER__FIRST_NAME:
			return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
		case MRentalPackage.CUSTOMER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MRentalPackage.CUSTOMER__ADDRESS:
			return address != null;
		case MRentalPackage.CUSTOMER__LICENSES:
			return licenses != null && !licenses.isEmpty();
		case MRentalPackage.CUSTOMER__PARENT_AGENCY:
			return getParentAgency() != null;
		case MRentalPackage.CUSTOMER__REMARQUE:
			return REMARQUE_EDEFAULT == null ? remarque != null : !REMARQUE_EDEFAULT.equals(remarque);
		}
		return super.eIsSet(featureID);
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
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", name: ");
		result.append(name);
		result.append(", remarque: ");
		result.append(remarque);
		result.append(')');
		return result.toString();
	}

} //MCustomerImpl
