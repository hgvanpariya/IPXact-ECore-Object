/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spiritconsortium.xml.schema.spirit._1685._2009.ParametersType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Register File Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.RegisterFileTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.RegisterFileTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.RegisterFileTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.RegisterFileTypeImpl#getDim <em>Dim</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.RegisterFileTypeImpl#getAddressOffset <em>Address Offset</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.RegisterFileTypeImpl#getTypeIdentifier <em>Type Identifier</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.RegisterFileTypeImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.RegisterFileTypeImpl#getRegister <em>Register</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.RegisterFileTypeImpl#getRegisterFile <em>Register File</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.RegisterFileTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.RegisterFileTypeImpl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.RegisterFileTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegisterFileTypeImpl extends MinimalEObjectImpl.Container implements RegisterFileType {
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
	 * The cached value of the '{@link #getDim() <em>Dim</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDim()
	 * @generated
	 * @ordered
	 */
	protected EList<BigInteger> dim;

	/**
	 * The default value of the '{@link #getAddressOffset() <em>Address Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressOffset() <em>Address Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressOffset()
	 * @generated
	 * @ordered
	 */
	protected String addressOffset = ADDRESS_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeIdentifier() <em>Type Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeIdentifier() <em>Type Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String typeIdentifier = TYPE_IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected RangeType1 range;

	/**
	 * The cached value of the '{@link #getRegister() <em>Register</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegister()
	 * @generated
	 * @ordered
	 */
	protected EList<RegisterType> register;

	/**
	 * The cached value of the '{@link #getRegisterFile() <em>Register File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterFile()
	 * @generated
	 * @ordered
	 */
	protected EList<RegisterFileType> registerFile;

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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisterFileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getRegisterFileType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.REGISTER_FILE_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.REGISTER_FILE_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.REGISTER_FILE_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigInteger> getDim() {
		if (dim == null) {
			dim = new EDataTypeEList<BigInteger>(BigInteger.class, this, _2009Package.REGISTER_FILE_TYPE__DIM);
		}
		return dim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddressOffset() {
		return addressOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressOffset(String newAddressOffset) {
		String oldAddressOffset = addressOffset;
		addressOffset = newAddressOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.REGISTER_FILE_TYPE__ADDRESS_OFFSET, oldAddressOffset, addressOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeIdentifier() {
		return typeIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeIdentifier(String newTypeIdentifier) {
		String oldTypeIdentifier = typeIdentifier;
		typeIdentifier = newTypeIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.REGISTER_FILE_TYPE__TYPE_IDENTIFIER, oldTypeIdentifier, typeIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType1 getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(RangeType1 newRange, NotificationChain msgs) {
		RangeType1 oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.REGISTER_FILE_TYPE__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(RangeType1 newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.REGISTER_FILE_TYPE__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.REGISTER_FILE_TYPE__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.REGISTER_FILE_TYPE__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegisterType> getRegister() {
		if (register == null) {
			register = new EObjectContainmentEList<RegisterType>(RegisterType.class, this, _2009Package.REGISTER_FILE_TYPE__REGISTER);
		}
		return register;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegisterFileType> getRegisterFile() {
		if (registerFile == null) {
			registerFile = new EObjectContainmentEList<RegisterFileType>(RegisterFileType.class, this, _2009Package.REGISTER_FILE_TYPE__REGISTER_FILE);
		}
		return registerFile;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.REGISTER_FILE_TYPE__PARAMETERS, oldParameters, newParameters);
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
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.REGISTER_FILE_TYPE__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.REGISTER_FILE_TYPE__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.REGISTER_FILE_TYPE__PARAMETERS, newParameters, newParameters));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.REGISTER_FILE_TYPE__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
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
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.REGISTER_FILE_TYPE__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.REGISTER_FILE_TYPE__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.REGISTER_FILE_TYPE__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.REGISTER_FILE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.REGISTER_FILE_TYPE__RANGE:
				return basicSetRange(null, msgs);
			case _2009Package.REGISTER_FILE_TYPE__REGISTER:
				return ((InternalEList<?>)getRegister()).basicRemove(otherEnd, msgs);
			case _2009Package.REGISTER_FILE_TYPE__REGISTER_FILE:
				return ((InternalEList<?>)getRegisterFile()).basicRemove(otherEnd, msgs);
			case _2009Package.REGISTER_FILE_TYPE__PARAMETERS:
				return basicSetParameters(null, msgs);
			case _2009Package.REGISTER_FILE_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.REGISTER_FILE_TYPE__NAME:
				return getName();
			case _2009Package.REGISTER_FILE_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case _2009Package.REGISTER_FILE_TYPE__DESCRIPTION:
				return getDescription();
			case _2009Package.REGISTER_FILE_TYPE__DIM:
				return getDim();
			case _2009Package.REGISTER_FILE_TYPE__ADDRESS_OFFSET:
				return getAddressOffset();
			case _2009Package.REGISTER_FILE_TYPE__TYPE_IDENTIFIER:
				return getTypeIdentifier();
			case _2009Package.REGISTER_FILE_TYPE__RANGE:
				return getRange();
			case _2009Package.REGISTER_FILE_TYPE__REGISTER:
				return getRegister();
			case _2009Package.REGISTER_FILE_TYPE__REGISTER_FILE:
				return getRegisterFile();
			case _2009Package.REGISTER_FILE_TYPE__PARAMETERS:
				return getParameters();
			case _2009Package.REGISTER_FILE_TYPE__VENDOR_EXTENSIONS:
				return getVendorExtensions();
			case _2009Package.REGISTER_FILE_TYPE__ID:
				return getId();
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
			case _2009Package.REGISTER_FILE_TYPE__NAME:
				setName((String)newValue);
				return;
			case _2009Package.REGISTER_FILE_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case _2009Package.REGISTER_FILE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _2009Package.REGISTER_FILE_TYPE__DIM:
				getDim().clear();
				getDim().addAll((Collection<? extends BigInteger>)newValue);
				return;
			case _2009Package.REGISTER_FILE_TYPE__ADDRESS_OFFSET:
				setAddressOffset((String)newValue);
				return;
			case _2009Package.REGISTER_FILE_TYPE__TYPE_IDENTIFIER:
				setTypeIdentifier((String)newValue);
				return;
			case _2009Package.REGISTER_FILE_TYPE__RANGE:
				setRange((RangeType1)newValue);
				return;
			case _2009Package.REGISTER_FILE_TYPE__REGISTER:
				getRegister().clear();
				getRegister().addAll((Collection<? extends RegisterType>)newValue);
				return;
			case _2009Package.REGISTER_FILE_TYPE__REGISTER_FILE:
				getRegisterFile().clear();
				getRegisterFile().addAll((Collection<? extends RegisterFileType>)newValue);
				return;
			case _2009Package.REGISTER_FILE_TYPE__PARAMETERS:
				setParameters((ParametersType1)newValue);
				return;
			case _2009Package.REGISTER_FILE_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)newValue);
				return;
			case _2009Package.REGISTER_FILE_TYPE__ID:
				setId((String)newValue);
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
			case _2009Package.REGISTER_FILE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _2009Package.REGISTER_FILE_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case _2009Package.REGISTER_FILE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _2009Package.REGISTER_FILE_TYPE__DIM:
				getDim().clear();
				return;
			case _2009Package.REGISTER_FILE_TYPE__ADDRESS_OFFSET:
				setAddressOffset(ADDRESS_OFFSET_EDEFAULT);
				return;
			case _2009Package.REGISTER_FILE_TYPE__TYPE_IDENTIFIER:
				setTypeIdentifier(TYPE_IDENTIFIER_EDEFAULT);
				return;
			case _2009Package.REGISTER_FILE_TYPE__RANGE:
				setRange((RangeType1)null);
				return;
			case _2009Package.REGISTER_FILE_TYPE__REGISTER:
				getRegister().clear();
				return;
			case _2009Package.REGISTER_FILE_TYPE__REGISTER_FILE:
				getRegisterFile().clear();
				return;
			case _2009Package.REGISTER_FILE_TYPE__PARAMETERS:
				setParameters((ParametersType1)null);
				return;
			case _2009Package.REGISTER_FILE_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)null);
				return;
			case _2009Package.REGISTER_FILE_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case _2009Package.REGISTER_FILE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _2009Package.REGISTER_FILE_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case _2009Package.REGISTER_FILE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _2009Package.REGISTER_FILE_TYPE__DIM:
				return dim != null && !dim.isEmpty();
			case _2009Package.REGISTER_FILE_TYPE__ADDRESS_OFFSET:
				return ADDRESS_OFFSET_EDEFAULT == null ? addressOffset != null : !ADDRESS_OFFSET_EDEFAULT.equals(addressOffset);
			case _2009Package.REGISTER_FILE_TYPE__TYPE_IDENTIFIER:
				return TYPE_IDENTIFIER_EDEFAULT == null ? typeIdentifier != null : !TYPE_IDENTIFIER_EDEFAULT.equals(typeIdentifier);
			case _2009Package.REGISTER_FILE_TYPE__RANGE:
				return range != null;
			case _2009Package.REGISTER_FILE_TYPE__REGISTER:
				return register != null && !register.isEmpty();
			case _2009Package.REGISTER_FILE_TYPE__REGISTER_FILE:
				return registerFile != null && !registerFile.isEmpty();
			case _2009Package.REGISTER_FILE_TYPE__PARAMETERS:
				return parameters != null;
			case _2009Package.REGISTER_FILE_TYPE__VENDOR_EXTENSIONS:
				return vendorExtensions != null;
			case _2009Package.REGISTER_FILE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(", dim: ");
		result.append(dim);
		result.append(", addressOffset: ");
		result.append(addressOffset);
		result.append(", typeIdentifier: ");
		result.append(typeIdentifier);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //RegisterFileTypeImpl
