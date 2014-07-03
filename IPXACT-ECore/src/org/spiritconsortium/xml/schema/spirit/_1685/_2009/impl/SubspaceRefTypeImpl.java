/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.BaseAddressType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ParametersType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.SubspaceRefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subspace Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.SubspaceRefTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.SubspaceRefTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.SubspaceRefTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.SubspaceRefTypeImpl#getBaseAddress <em>Base Address</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.SubspaceRefTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.SubspaceRefTypeImpl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.SubspaceRefTypeImpl#getMasterRef <em>Master Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.SubspaceRefTypeImpl#getSegmentRef <em>Segment Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubspaceRefTypeImpl extends MinimalEObjectImpl.Container implements SubspaceRefType {
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
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBaseAddress() <em>Base Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseAddress()
	 * @generated
	 * @ordered
	 */
	protected BaseAddressType1 baseAddress;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected ParametersType1 parameters;

	/**
	 * The cached value of the '{@link #getVendorExtensions() <em>Vendor Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorExtensions()
	 * @generated
	 * @ordered
	 */
	protected VendorExtensionsType vendorExtensions;

	/**
	 * The default value of the '{@link #getMasterRef() <em>Master Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterRef()
	 * @generated
	 * @ordered
	 */
	protected static final String MASTER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMasterRef() <em>Master Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterRef()
	 * @generated
	 * @ordered
	 */
	protected String masterRef = MASTER_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getSegmentRef() <em>Segment Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentRef()
	 * @generated
	 * @ordered
	 */
	protected static final String SEGMENT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSegmentRef() <em>Segment Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentRef()
	 * @generated
	 * @ordered
	 */
	protected String segmentRef = SEGMENT_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubspaceRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getSubspaceRefType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.SUBSPACE_REF_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.SUBSPACE_REF_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.SUBSPACE_REF_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseAddressType1 getBaseAddress() {
		return baseAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseAddress(BaseAddressType1 newBaseAddress, NotificationChain msgs) {
		BaseAddressType1 oldBaseAddress = baseAddress;
		baseAddress = newBaseAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.SUBSPACE_REF_TYPE__BASE_ADDRESS, oldBaseAddress, newBaseAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseAddress(BaseAddressType1 newBaseAddress) {
		if (newBaseAddress != baseAddress) {
			NotificationChain msgs = null;
			if (baseAddress != null)
				msgs = ((InternalEObject)baseAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.SUBSPACE_REF_TYPE__BASE_ADDRESS, null, msgs);
			if (newBaseAddress != null)
				msgs = ((InternalEObject)newBaseAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.SUBSPACE_REF_TYPE__BASE_ADDRESS, null, msgs);
			msgs = basicSetBaseAddress(newBaseAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.SUBSPACE_REF_TYPE__BASE_ADDRESS, newBaseAddress, newBaseAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersType1 getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(ParametersType1 newParameters, NotificationChain msgs) {
		ParametersType1 oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.SUBSPACE_REF_TYPE__PARAMETERS, oldParameters, newParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(ParametersType1 newParameters) {
		if (newParameters != parameters) {
			NotificationChain msgs = null;
			if (parameters != null)
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.SUBSPACE_REF_TYPE__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.SUBSPACE_REF_TYPE__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.SUBSPACE_REF_TYPE__PARAMETERS, newParameters, newParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorExtensionsType getVendorExtensions() {
		return vendorExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVendorExtensions(VendorExtensionsType newVendorExtensions, NotificationChain msgs) {
		VendorExtensionsType oldVendorExtensions = vendorExtensions;
		vendorExtensions = newVendorExtensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.SUBSPACE_REF_TYPE__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendorExtensions(VendorExtensionsType newVendorExtensions) {
		if (newVendorExtensions != vendorExtensions) {
			NotificationChain msgs = null;
			if (vendorExtensions != null)
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.SUBSPACE_REF_TYPE__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.SUBSPACE_REF_TYPE__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.SUBSPACE_REF_TYPE__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMasterRef() {
		return masterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterRef(String newMasterRef) {
		String oldMasterRef = masterRef;
		masterRef = newMasterRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.SUBSPACE_REF_TYPE__MASTER_REF, oldMasterRef, masterRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSegmentRef() {
		return segmentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSegmentRef(String newSegmentRef) {
		String oldSegmentRef = segmentRef;
		segmentRef = newSegmentRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.SUBSPACE_REF_TYPE__SEGMENT_REF, oldSegmentRef, segmentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.SUBSPACE_REF_TYPE__BASE_ADDRESS:
				return basicSetBaseAddress(null, msgs);
			case _2009Package.SUBSPACE_REF_TYPE__PARAMETERS:
				return basicSetParameters(null, msgs);
			case _2009Package.SUBSPACE_REF_TYPE__VENDOR_EXTENSIONS:
				return basicSetVendorExtensions(null, msgs);
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
			case _2009Package.SUBSPACE_REF_TYPE__NAME:
				return getName();
			case _2009Package.SUBSPACE_REF_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case _2009Package.SUBSPACE_REF_TYPE__DESCRIPTION:
				return getDescription();
			case _2009Package.SUBSPACE_REF_TYPE__BASE_ADDRESS:
				return getBaseAddress();
			case _2009Package.SUBSPACE_REF_TYPE__PARAMETERS:
				return getParameters();
			case _2009Package.SUBSPACE_REF_TYPE__VENDOR_EXTENSIONS:
				return getVendorExtensions();
			case _2009Package.SUBSPACE_REF_TYPE__MASTER_REF:
				return getMasterRef();
			case _2009Package.SUBSPACE_REF_TYPE__SEGMENT_REF:
				return getSegmentRef();
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
			case _2009Package.SUBSPACE_REF_TYPE__NAME:
				setName((String)newValue);
				return;
			case _2009Package.SUBSPACE_REF_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case _2009Package.SUBSPACE_REF_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _2009Package.SUBSPACE_REF_TYPE__BASE_ADDRESS:
				setBaseAddress((BaseAddressType1)newValue);
				return;
			case _2009Package.SUBSPACE_REF_TYPE__PARAMETERS:
				setParameters((ParametersType1)newValue);
				return;
			case _2009Package.SUBSPACE_REF_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)newValue);
				return;
			case _2009Package.SUBSPACE_REF_TYPE__MASTER_REF:
				setMasterRef((String)newValue);
				return;
			case _2009Package.SUBSPACE_REF_TYPE__SEGMENT_REF:
				setSegmentRef((String)newValue);
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
			case _2009Package.SUBSPACE_REF_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _2009Package.SUBSPACE_REF_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case _2009Package.SUBSPACE_REF_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _2009Package.SUBSPACE_REF_TYPE__BASE_ADDRESS:
				setBaseAddress((BaseAddressType1)null);
				return;
			case _2009Package.SUBSPACE_REF_TYPE__PARAMETERS:
				setParameters((ParametersType1)null);
				return;
			case _2009Package.SUBSPACE_REF_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)null);
				return;
			case _2009Package.SUBSPACE_REF_TYPE__MASTER_REF:
				setMasterRef(MASTER_REF_EDEFAULT);
				return;
			case _2009Package.SUBSPACE_REF_TYPE__SEGMENT_REF:
				setSegmentRef(SEGMENT_REF_EDEFAULT);
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
			case _2009Package.SUBSPACE_REF_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _2009Package.SUBSPACE_REF_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case _2009Package.SUBSPACE_REF_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _2009Package.SUBSPACE_REF_TYPE__BASE_ADDRESS:
				return baseAddress != null;
			case _2009Package.SUBSPACE_REF_TYPE__PARAMETERS:
				return parameters != null;
			case _2009Package.SUBSPACE_REF_TYPE__VENDOR_EXTENSIONS:
				return vendorExtensions != null;
			case _2009Package.SUBSPACE_REF_TYPE__MASTER_REF:
				return MASTER_REF_EDEFAULT == null ? masterRef != null : !MASTER_REF_EDEFAULT.equals(masterRef);
			case _2009Package.SUBSPACE_REF_TYPE__SEGMENT_REF:
				return SEGMENT_REF_EDEFAULT == null ? segmentRef != null : !SEGMENT_REF_EDEFAULT.equals(segmentRef);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", description: ");
		result.append(description);
		result.append(", masterRef: ");
		result.append(masterRef);
		result.append(", segmentRef: ");
		result.append(segmentRef);
		result.append(')');
		return result.toString();
	}

} //SubspaceRefTypeImpl
