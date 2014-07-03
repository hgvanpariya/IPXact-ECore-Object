/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.LibraryRefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.SystemGroupNamesType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusDefinitionTypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusDefinitionTypeImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusDefinitionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusDefinitionTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusDefinitionTypeImpl#isDirectConnection <em>Direct Connection</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusDefinitionTypeImpl#isIsAddressable <em>Is Addressable</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusDefinitionTypeImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusDefinitionTypeImpl#getMaxMasters <em>Max Masters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusDefinitionTypeImpl#getMaxSlaves <em>Max Slaves</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusDefinitionTypeImpl#getSystemGroupNames <em>System Group Names</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusDefinitionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusDefinitionTypeImpl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusDefinitionTypeImpl extends MinimalEObjectImpl.Container implements BusDefinitionType {
	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBRARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected String library = LIBRARY_EDEFAULT;

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isDirectConnection() <em>Direct Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirectConnection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIRECT_CONNECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDirectConnection() <em>Direct Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirectConnection()
	 * @generated
	 * @ordered
	 */
	protected boolean directConnection = DIRECT_CONNECTION_EDEFAULT;

	/**
	 * This is true if the Direct Connection attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean directConnectionESet;

	/**
	 * The default value of the '{@link #isIsAddressable() <em>Is Addressable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAddressable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ADDRESSABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAddressable() <em>Is Addressable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAddressable()
	 * @generated
	 * @ordered
	 */
	protected boolean isAddressable = IS_ADDRESSABLE_EDEFAULT;

	/**
	 * This is true if the Is Addressable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isAddressableESet;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected LibraryRefType extends_;

	/**
	 * The default value of the '{@link #getMaxMasters() <em>Max Masters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMasters()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_MASTERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxMasters() <em>Max Masters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMasters()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxMasters = MAX_MASTERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSlaves() <em>Max Slaves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSlaves()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_SLAVES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxSlaves() <em>Max Slaves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSlaves()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxSlaves = MAX_SLAVES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSystemGroupNames() <em>System Group Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemGroupNames()
	 * @generated
	 * @ordered
	 */
	protected SystemGroupNamesType systemGroupNames;

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
	 * The cached value of the '{@link #getVendorExtensions() <em>Vendor Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorExtensions()
	 * @generated
	 * @ordered
	 */
	protected VendorExtensionsType vendorExtensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusDefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getBusDefinitionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_DEFINITION_TYPE__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibrary() {
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrary(String newLibrary) {
		String oldLibrary = library;
		library = newLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_DEFINITION_TYPE__LIBRARY, oldLibrary, library));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_DEFINITION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_DEFINITION_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDirectConnection() {
		return directConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectConnection(boolean newDirectConnection) {
		boolean oldDirectConnection = directConnection;
		directConnection = newDirectConnection;
		boolean oldDirectConnectionESet = directConnectionESet;
		directConnectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_DEFINITION_TYPE__DIRECT_CONNECTION, oldDirectConnection, directConnection, !oldDirectConnectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDirectConnection() {
		boolean oldDirectConnection = directConnection;
		boolean oldDirectConnectionESet = directConnectionESet;
		directConnection = DIRECT_CONNECTION_EDEFAULT;
		directConnectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.BUS_DEFINITION_TYPE__DIRECT_CONNECTION, oldDirectConnection, DIRECT_CONNECTION_EDEFAULT, oldDirectConnectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirectConnection() {
		return directConnectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAddressable() {
		return isAddressable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAddressable(boolean newIsAddressable) {
		boolean oldIsAddressable = isAddressable;
		isAddressable = newIsAddressable;
		boolean oldIsAddressableESet = isAddressableESet;
		isAddressableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_DEFINITION_TYPE__IS_ADDRESSABLE, oldIsAddressable, isAddressable, !oldIsAddressableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsAddressable() {
		boolean oldIsAddressable = isAddressable;
		boolean oldIsAddressableESet = isAddressableESet;
		isAddressable = IS_ADDRESSABLE_EDEFAULT;
		isAddressableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.BUS_DEFINITION_TYPE__IS_ADDRESSABLE, oldIsAddressable, IS_ADDRESSABLE_EDEFAULT, oldIsAddressableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsAddressable() {
		return isAddressableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryRefType getExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtends(LibraryRefType newExtends, NotificationChain msgs) {
		LibraryRefType oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.BUS_DEFINITION_TYPE__EXTENDS, oldExtends, newExtends);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(LibraryRefType newExtends) {
		if (newExtends != extends_) {
			NotificationChain msgs = null;
			if (extends_ != null)
				msgs = ((InternalEObject)extends_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_DEFINITION_TYPE__EXTENDS, null, msgs);
			if (newExtends != null)
				msgs = ((InternalEObject)newExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_DEFINITION_TYPE__EXTENDS, null, msgs);
			msgs = basicSetExtends(newExtends, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_DEFINITION_TYPE__EXTENDS, newExtends, newExtends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxMasters() {
		return maxMasters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxMasters(BigInteger newMaxMasters) {
		BigInteger oldMaxMasters = maxMasters;
		maxMasters = newMaxMasters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_DEFINITION_TYPE__MAX_MASTERS, oldMaxMasters, maxMasters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxSlaves() {
		return maxSlaves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSlaves(BigInteger newMaxSlaves) {
		BigInteger oldMaxSlaves = maxSlaves;
		maxSlaves = newMaxSlaves;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_DEFINITION_TYPE__MAX_SLAVES, oldMaxSlaves, maxSlaves));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemGroupNamesType getSystemGroupNames() {
		return systemGroupNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemGroupNames(SystemGroupNamesType newSystemGroupNames, NotificationChain msgs) {
		SystemGroupNamesType oldSystemGroupNames = systemGroupNames;
		systemGroupNames = newSystemGroupNames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.BUS_DEFINITION_TYPE__SYSTEM_GROUP_NAMES, oldSystemGroupNames, newSystemGroupNames);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemGroupNames(SystemGroupNamesType newSystemGroupNames) {
		if (newSystemGroupNames != systemGroupNames) {
			NotificationChain msgs = null;
			if (systemGroupNames != null)
				msgs = ((InternalEObject)systemGroupNames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_DEFINITION_TYPE__SYSTEM_GROUP_NAMES, null, msgs);
			if (newSystemGroupNames != null)
				msgs = ((InternalEObject)newSystemGroupNames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_DEFINITION_TYPE__SYSTEM_GROUP_NAMES, null, msgs);
			msgs = basicSetSystemGroupNames(newSystemGroupNames, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_DEFINITION_TYPE__SYSTEM_GROUP_NAMES, newSystemGroupNames, newSystemGroupNames));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_DEFINITION_TYPE__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.BUS_DEFINITION_TYPE__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
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
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_DEFINITION_TYPE__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_DEFINITION_TYPE__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_DEFINITION_TYPE__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.BUS_DEFINITION_TYPE__EXTENDS:
				return basicSetExtends(null, msgs);
			case _2009Package.BUS_DEFINITION_TYPE__SYSTEM_GROUP_NAMES:
				return basicSetSystemGroupNames(null, msgs);
			case _2009Package.BUS_DEFINITION_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.BUS_DEFINITION_TYPE__VENDOR:
				return getVendor();
			case _2009Package.BUS_DEFINITION_TYPE__LIBRARY:
				return getLibrary();
			case _2009Package.BUS_DEFINITION_TYPE__NAME:
				return getName();
			case _2009Package.BUS_DEFINITION_TYPE__VERSION:
				return getVersion();
			case _2009Package.BUS_DEFINITION_TYPE__DIRECT_CONNECTION:
				return isDirectConnection();
			case _2009Package.BUS_DEFINITION_TYPE__IS_ADDRESSABLE:
				return isIsAddressable();
			case _2009Package.BUS_DEFINITION_TYPE__EXTENDS:
				return getExtends();
			case _2009Package.BUS_DEFINITION_TYPE__MAX_MASTERS:
				return getMaxMasters();
			case _2009Package.BUS_DEFINITION_TYPE__MAX_SLAVES:
				return getMaxSlaves();
			case _2009Package.BUS_DEFINITION_TYPE__SYSTEM_GROUP_NAMES:
				return getSystemGroupNames();
			case _2009Package.BUS_DEFINITION_TYPE__DESCRIPTION:
				return getDescription();
			case _2009Package.BUS_DEFINITION_TYPE__VENDOR_EXTENSIONS:
				return getVendorExtensions();
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
			case _2009Package.BUS_DEFINITION_TYPE__VENDOR:
				setVendor((String)newValue);
				return;
			case _2009Package.BUS_DEFINITION_TYPE__LIBRARY:
				setLibrary((String)newValue);
				return;
			case _2009Package.BUS_DEFINITION_TYPE__NAME:
				setName((String)newValue);
				return;
			case _2009Package.BUS_DEFINITION_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case _2009Package.BUS_DEFINITION_TYPE__DIRECT_CONNECTION:
				setDirectConnection((Boolean)newValue);
				return;
			case _2009Package.BUS_DEFINITION_TYPE__IS_ADDRESSABLE:
				setIsAddressable((Boolean)newValue);
				return;
			case _2009Package.BUS_DEFINITION_TYPE__EXTENDS:
				setExtends((LibraryRefType)newValue);
				return;
			case _2009Package.BUS_DEFINITION_TYPE__MAX_MASTERS:
				setMaxMasters((BigInteger)newValue);
				return;
			case _2009Package.BUS_DEFINITION_TYPE__MAX_SLAVES:
				setMaxSlaves((BigInteger)newValue);
				return;
			case _2009Package.BUS_DEFINITION_TYPE__SYSTEM_GROUP_NAMES:
				setSystemGroupNames((SystemGroupNamesType)newValue);
				return;
			case _2009Package.BUS_DEFINITION_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _2009Package.BUS_DEFINITION_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)newValue);
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
			case _2009Package.BUS_DEFINITION_TYPE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case _2009Package.BUS_DEFINITION_TYPE__LIBRARY:
				setLibrary(LIBRARY_EDEFAULT);
				return;
			case _2009Package.BUS_DEFINITION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _2009Package.BUS_DEFINITION_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case _2009Package.BUS_DEFINITION_TYPE__DIRECT_CONNECTION:
				unsetDirectConnection();
				return;
			case _2009Package.BUS_DEFINITION_TYPE__IS_ADDRESSABLE:
				unsetIsAddressable();
				return;
			case _2009Package.BUS_DEFINITION_TYPE__EXTENDS:
				setExtends((LibraryRefType)null);
				return;
			case _2009Package.BUS_DEFINITION_TYPE__MAX_MASTERS:
				setMaxMasters(MAX_MASTERS_EDEFAULT);
				return;
			case _2009Package.BUS_DEFINITION_TYPE__MAX_SLAVES:
				setMaxSlaves(MAX_SLAVES_EDEFAULT);
				return;
			case _2009Package.BUS_DEFINITION_TYPE__SYSTEM_GROUP_NAMES:
				setSystemGroupNames((SystemGroupNamesType)null);
				return;
			case _2009Package.BUS_DEFINITION_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _2009Package.BUS_DEFINITION_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)null);
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
			case _2009Package.BUS_DEFINITION_TYPE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case _2009Package.BUS_DEFINITION_TYPE__LIBRARY:
				return LIBRARY_EDEFAULT == null ? library != null : !LIBRARY_EDEFAULT.equals(library);
			case _2009Package.BUS_DEFINITION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _2009Package.BUS_DEFINITION_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case _2009Package.BUS_DEFINITION_TYPE__DIRECT_CONNECTION:
				return isSetDirectConnection();
			case _2009Package.BUS_DEFINITION_TYPE__IS_ADDRESSABLE:
				return isSetIsAddressable();
			case _2009Package.BUS_DEFINITION_TYPE__EXTENDS:
				return extends_ != null;
			case _2009Package.BUS_DEFINITION_TYPE__MAX_MASTERS:
				return MAX_MASTERS_EDEFAULT == null ? maxMasters != null : !MAX_MASTERS_EDEFAULT.equals(maxMasters);
			case _2009Package.BUS_DEFINITION_TYPE__MAX_SLAVES:
				return MAX_SLAVES_EDEFAULT == null ? maxSlaves != null : !MAX_SLAVES_EDEFAULT.equals(maxSlaves);
			case _2009Package.BUS_DEFINITION_TYPE__SYSTEM_GROUP_NAMES:
				return systemGroupNames != null;
			case _2009Package.BUS_DEFINITION_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _2009Package.BUS_DEFINITION_TYPE__VENDOR_EXTENSIONS:
				return vendorExtensions != null;
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
		result.append(" (vendor: ");
		result.append(vendor);
		result.append(", library: ");
		result.append(library);
		result.append(", name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(", directConnection: ");
		if (directConnectionESet) result.append(directConnection); else result.append("<unset>");
		result.append(", isAddressable: ");
		if (isAddressableESet) result.append(isAddressable); else result.append("<unset>");
		result.append(", maxMasters: ");
		result.append(maxMasters);
		result.append(", maxSlaves: ");
		result.append(maxSlaves);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //BusDefinitionTypeImpl
