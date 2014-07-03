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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spiritconsortium.xml.schema.spirit._1685._2009.BitSteeringType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.EndianessType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.LibraryRefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.MasterType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.MirroredMasterType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.MirroredSlaveType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.MirroredSystemType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ParametersType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.PortMapsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.SlaveType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.SystemType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Interface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusInterfaceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusInterfaceTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusInterfaceTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusInterfaceTypeImpl#getBusType <em>Bus Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusInterfaceTypeImpl#getAbstractionType <em>Abstraction Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusInterfaceTypeImpl#getMaster <em>Master</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusInterfaceTypeImpl#getSlave <em>Slave</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusInterfaceTypeImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusInterfaceTypeImpl#getMirroredSlave <em>Mirrored Slave</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusInterfaceTypeImpl#getMirroredMaster <em>Mirrored Master</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusInterfaceTypeImpl#getMirroredSystem <em>Mirrored System</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusInterfaceTypeImpl#getMonitor <em>Monitor</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusInterfaceTypeImpl#isConnectionRequired <em>Connection Required</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusInterfaceTypeImpl#getPortMaps <em>Port Maps</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusInterfaceTypeImpl#getBitsInLau <em>Bits In Lau</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusInterfaceTypeImpl#getBitSteering <em>Bit Steering</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusInterfaceTypeImpl#getEndianness <em>Endianness</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusInterfaceTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusInterfaceTypeImpl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.BusInterfaceTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusInterfaceTypeImpl extends MinimalEObjectImpl.Container implements BusInterfaceType {
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
	 * The cached value of the '{@link #getBusType() <em>Bus Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusType()
	 * @generated
	 * @ordered
	 */
	protected LibraryRefType busType;

	/**
	 * The cached value of the '{@link #getAbstractionType() <em>Abstraction Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractionType()
	 * @generated
	 * @ordered
	 */
	protected LibraryRefType abstractionType;

	/**
	 * The cached value of the '{@link #getMaster() <em>Master</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaster()
	 * @generated
	 * @ordered
	 */
	protected MasterType master;

	/**
	 * The cached value of the '{@link #getSlave() <em>Slave</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlave()
	 * @generated
	 * @ordered
	 */
	protected SlaveType slave;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected SystemType system;

	/**
	 * The cached value of the '{@link #getMirroredSlave() <em>Mirrored Slave</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMirroredSlave()
	 * @generated
	 * @ordered
	 */
	protected MirroredSlaveType mirroredSlave;

	/**
	 * The cached value of the '{@link #getMirroredMaster() <em>Mirrored Master</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMirroredMaster()
	 * @generated
	 * @ordered
	 */
	protected MirroredMasterType mirroredMaster;

	/**
	 * The cached value of the '{@link #getMirroredSystem() <em>Mirrored System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMirroredSystem()
	 * @generated
	 * @ordered
	 */
	protected MirroredSystemType mirroredSystem;

	/**
	 * The cached value of the '{@link #getMonitor() <em>Monitor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitor()
	 * @generated
	 * @ordered
	 */
	protected MonitorType monitor;

	/**
	 * The default value of the '{@link #isConnectionRequired() <em>Connection Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnectionRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONNECTION_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConnectionRequired() <em>Connection Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnectionRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean connectionRequired = CONNECTION_REQUIRED_EDEFAULT;

	/**
	 * This is true if the Connection Required attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean connectionRequiredESet;

	/**
	 * The cached value of the '{@link #getPortMaps() <em>Port Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortMaps()
	 * @generated
	 * @ordered
	 */
	protected PortMapsType portMaps;

	/**
	 * The default value of the '{@link #getBitsInLau() <em>Bits In Lau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitsInLau()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BITS_IN_LAU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBitsInLau() <em>Bits In Lau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitsInLau()
	 * @generated
	 * @ordered
	 */
	protected BigInteger bitsInLau = BITS_IN_LAU_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBitSteering() <em>Bit Steering</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitSteering()
	 * @generated
	 * @ordered
	 */
	protected BitSteeringType1 bitSteering;

	/**
	 * The default value of the '{@link #getEndianness() <em>Endianness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndianness()
	 * @generated
	 * @ordered
	 */
	protected static final EndianessType ENDIANNESS_EDEFAULT = EndianessType.BIG;

	/**
	 * The cached value of the '{@link #getEndianness() <em>Endianness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndianness()
	 * @generated
	 * @ordered
	 */
	protected EndianessType endianness = ENDIANNESS_EDEFAULT;

	/**
	 * This is true if the Endianness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endiannessESet;

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
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusInterfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getBusInterfaceType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryRefType getBusType() {
		return busType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusType(LibraryRefType newBusType, NotificationChain msgs) {
		LibraryRefType oldBusType = busType;
		busType = newBusType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__BUS_TYPE, oldBusType, newBusType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusType(LibraryRefType newBusType) {
		if (newBusType != busType) {
			NotificationChain msgs = null;
			if (busType != null)
				msgs = ((InternalEObject)busType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__BUS_TYPE, null, msgs);
			if (newBusType != null)
				msgs = ((InternalEObject)newBusType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__BUS_TYPE, null, msgs);
			msgs = basicSetBusType(newBusType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__BUS_TYPE, newBusType, newBusType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryRefType getAbstractionType() {
		return abstractionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractionType(LibraryRefType newAbstractionType, NotificationChain msgs) {
		LibraryRefType oldAbstractionType = abstractionType;
		abstractionType = newAbstractionType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__ABSTRACTION_TYPE, oldAbstractionType, newAbstractionType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractionType(LibraryRefType newAbstractionType) {
		if (newAbstractionType != abstractionType) {
			NotificationChain msgs = null;
			if (abstractionType != null)
				msgs = ((InternalEObject)abstractionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__ABSTRACTION_TYPE, null, msgs);
			if (newAbstractionType != null)
				msgs = ((InternalEObject)newAbstractionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__ABSTRACTION_TYPE, null, msgs);
			msgs = basicSetAbstractionType(newAbstractionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__ABSTRACTION_TYPE, newAbstractionType, newAbstractionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterType getMaster() {
		return master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaster(MasterType newMaster, NotificationChain msgs) {
		MasterType oldMaster = master;
		master = newMaster;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__MASTER, oldMaster, newMaster);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaster(MasterType newMaster) {
		if (newMaster != master) {
			NotificationChain msgs = null;
			if (master != null)
				msgs = ((InternalEObject)master).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__MASTER, null, msgs);
			if (newMaster != null)
				msgs = ((InternalEObject)newMaster).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__MASTER, null, msgs);
			msgs = basicSetMaster(newMaster, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__MASTER, newMaster, newMaster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlaveType getSlave() {
		return slave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlave(SlaveType newSlave, NotificationChain msgs) {
		SlaveType oldSlave = slave;
		slave = newSlave;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__SLAVE, oldSlave, newSlave);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlave(SlaveType newSlave) {
		if (newSlave != slave) {
			NotificationChain msgs = null;
			if (slave != null)
				msgs = ((InternalEObject)slave).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__SLAVE, null, msgs);
			if (newSlave != null)
				msgs = ((InternalEObject)newSlave).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__SLAVE, null, msgs);
			msgs = basicSetSlave(newSlave, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__SLAVE, newSlave, newSlave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemType getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(SystemType newSystem, NotificationChain msgs) {
		SystemType oldSystem = system;
		system = newSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__SYSTEM, oldSystem, newSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(SystemType newSystem) {
		if (newSystem != system) {
			NotificationChain msgs = null;
			if (system != null)
				msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__SYSTEM, null, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__SYSTEM, null, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MirroredSlaveType getMirroredSlave() {
		return mirroredSlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMirroredSlave(MirroredSlaveType newMirroredSlave, NotificationChain msgs) {
		MirroredSlaveType oldMirroredSlave = mirroredSlave;
		mirroredSlave = newMirroredSlave;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__MIRRORED_SLAVE, oldMirroredSlave, newMirroredSlave);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMirroredSlave(MirroredSlaveType newMirroredSlave) {
		if (newMirroredSlave != mirroredSlave) {
			NotificationChain msgs = null;
			if (mirroredSlave != null)
				msgs = ((InternalEObject)mirroredSlave).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__MIRRORED_SLAVE, null, msgs);
			if (newMirroredSlave != null)
				msgs = ((InternalEObject)newMirroredSlave).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__MIRRORED_SLAVE, null, msgs);
			msgs = basicSetMirroredSlave(newMirroredSlave, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__MIRRORED_SLAVE, newMirroredSlave, newMirroredSlave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MirroredMasterType getMirroredMaster() {
		return mirroredMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMirroredMaster(MirroredMasterType newMirroredMaster, NotificationChain msgs) {
		MirroredMasterType oldMirroredMaster = mirroredMaster;
		mirroredMaster = newMirroredMaster;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__MIRRORED_MASTER, oldMirroredMaster, newMirroredMaster);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMirroredMaster(MirroredMasterType newMirroredMaster) {
		if (newMirroredMaster != mirroredMaster) {
			NotificationChain msgs = null;
			if (mirroredMaster != null)
				msgs = ((InternalEObject)mirroredMaster).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__MIRRORED_MASTER, null, msgs);
			if (newMirroredMaster != null)
				msgs = ((InternalEObject)newMirroredMaster).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__MIRRORED_MASTER, null, msgs);
			msgs = basicSetMirroredMaster(newMirroredMaster, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__MIRRORED_MASTER, newMirroredMaster, newMirroredMaster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MirroredSystemType getMirroredSystem() {
		return mirroredSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMirroredSystem(MirroredSystemType newMirroredSystem, NotificationChain msgs) {
		MirroredSystemType oldMirroredSystem = mirroredSystem;
		mirroredSystem = newMirroredSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__MIRRORED_SYSTEM, oldMirroredSystem, newMirroredSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMirroredSystem(MirroredSystemType newMirroredSystem) {
		if (newMirroredSystem != mirroredSystem) {
			NotificationChain msgs = null;
			if (mirroredSystem != null)
				msgs = ((InternalEObject)mirroredSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__MIRRORED_SYSTEM, null, msgs);
			if (newMirroredSystem != null)
				msgs = ((InternalEObject)newMirroredSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__MIRRORED_SYSTEM, null, msgs);
			msgs = basicSetMirroredSystem(newMirroredSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__MIRRORED_SYSTEM, newMirroredSystem, newMirroredSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorType getMonitor() {
		return monitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitor(MonitorType newMonitor, NotificationChain msgs) {
		MonitorType oldMonitor = monitor;
		monitor = newMonitor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__MONITOR, oldMonitor, newMonitor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitor(MonitorType newMonitor) {
		if (newMonitor != monitor) {
			NotificationChain msgs = null;
			if (monitor != null)
				msgs = ((InternalEObject)monitor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__MONITOR, null, msgs);
			if (newMonitor != null)
				msgs = ((InternalEObject)newMonitor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__MONITOR, null, msgs);
			msgs = basicSetMonitor(newMonitor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__MONITOR, newMonitor, newMonitor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConnectionRequired() {
		return connectionRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionRequired(boolean newConnectionRequired) {
		boolean oldConnectionRequired = connectionRequired;
		connectionRequired = newConnectionRequired;
		boolean oldConnectionRequiredESet = connectionRequiredESet;
		connectionRequiredESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__CONNECTION_REQUIRED, oldConnectionRequired, connectionRequired, !oldConnectionRequiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConnectionRequired() {
		boolean oldConnectionRequired = connectionRequired;
		boolean oldConnectionRequiredESet = connectionRequiredESet;
		connectionRequired = CONNECTION_REQUIRED_EDEFAULT;
		connectionRequiredESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.BUS_INTERFACE_TYPE__CONNECTION_REQUIRED, oldConnectionRequired, CONNECTION_REQUIRED_EDEFAULT, oldConnectionRequiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectionRequired() {
		return connectionRequiredESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortMapsType getPortMaps() {
		return portMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortMaps(PortMapsType newPortMaps, NotificationChain msgs) {
		PortMapsType oldPortMaps = portMaps;
		portMaps = newPortMaps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__PORT_MAPS, oldPortMaps, newPortMaps);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortMaps(PortMapsType newPortMaps) {
		if (newPortMaps != portMaps) {
			NotificationChain msgs = null;
			if (portMaps != null)
				msgs = ((InternalEObject)portMaps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__PORT_MAPS, null, msgs);
			if (newPortMaps != null)
				msgs = ((InternalEObject)newPortMaps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__PORT_MAPS, null, msgs);
			msgs = basicSetPortMaps(newPortMaps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__PORT_MAPS, newPortMaps, newPortMaps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBitsInLau() {
		return bitsInLau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitsInLau(BigInteger newBitsInLau) {
		BigInteger oldBitsInLau = bitsInLau;
		bitsInLau = newBitsInLau;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__BITS_IN_LAU, oldBitsInLau, bitsInLau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitSteeringType1 getBitSteering() {
		return bitSteering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBitSteering(BitSteeringType1 newBitSteering, NotificationChain msgs) {
		BitSteeringType1 oldBitSteering = bitSteering;
		bitSteering = newBitSteering;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__BIT_STEERING, oldBitSteering, newBitSteering);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitSteering(BitSteeringType1 newBitSteering) {
		if (newBitSteering != bitSteering) {
			NotificationChain msgs = null;
			if (bitSteering != null)
				msgs = ((InternalEObject)bitSteering).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__BIT_STEERING, null, msgs);
			if (newBitSteering != null)
				msgs = ((InternalEObject)newBitSteering).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__BIT_STEERING, null, msgs);
			msgs = basicSetBitSteering(newBitSteering, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__BIT_STEERING, newBitSteering, newBitSteering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndianessType getEndianness() {
		return endianness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndianness(EndianessType newEndianness) {
		EndianessType oldEndianness = endianness;
		endianness = newEndianness == null ? ENDIANNESS_EDEFAULT : newEndianness;
		boolean oldEndiannessESet = endiannessESet;
		endiannessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__ENDIANNESS, oldEndianness, endianness, !oldEndiannessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndianness() {
		EndianessType oldEndianness = endianness;
		boolean oldEndiannessESet = endiannessESet;
		endianness = ENDIANNESS_EDEFAULT;
		endiannessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.BUS_INTERFACE_TYPE__ENDIANNESS, oldEndianness, ENDIANNESS_EDEFAULT, oldEndiannessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndianness() {
		return endiannessESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__PARAMETERS, oldParameters, newParameters);
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
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__PARAMETERS, newParameters, newParameters));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
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
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.BUS_INTERFACE_TYPE__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.BUS_INTERFACE_TYPE__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _2009Package.BUS_INTERFACE_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.BUS_INTERFACE_TYPE__BUS_TYPE:
				return basicSetBusType(null, msgs);
			case _2009Package.BUS_INTERFACE_TYPE__ABSTRACTION_TYPE:
				return basicSetAbstractionType(null, msgs);
			case _2009Package.BUS_INTERFACE_TYPE__MASTER:
				return basicSetMaster(null, msgs);
			case _2009Package.BUS_INTERFACE_TYPE__SLAVE:
				return basicSetSlave(null, msgs);
			case _2009Package.BUS_INTERFACE_TYPE__SYSTEM:
				return basicSetSystem(null, msgs);
			case _2009Package.BUS_INTERFACE_TYPE__MIRRORED_SLAVE:
				return basicSetMirroredSlave(null, msgs);
			case _2009Package.BUS_INTERFACE_TYPE__MIRRORED_MASTER:
				return basicSetMirroredMaster(null, msgs);
			case _2009Package.BUS_INTERFACE_TYPE__MIRRORED_SYSTEM:
				return basicSetMirroredSystem(null, msgs);
			case _2009Package.BUS_INTERFACE_TYPE__MONITOR:
				return basicSetMonitor(null, msgs);
			case _2009Package.BUS_INTERFACE_TYPE__PORT_MAPS:
				return basicSetPortMaps(null, msgs);
			case _2009Package.BUS_INTERFACE_TYPE__BIT_STEERING:
				return basicSetBitSteering(null, msgs);
			case _2009Package.BUS_INTERFACE_TYPE__PARAMETERS:
				return basicSetParameters(null, msgs);
			case _2009Package.BUS_INTERFACE_TYPE__VENDOR_EXTENSIONS:
				return basicSetVendorExtensions(null, msgs);
			case _2009Package.BUS_INTERFACE_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case _2009Package.BUS_INTERFACE_TYPE__NAME:
				return getName();
			case _2009Package.BUS_INTERFACE_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case _2009Package.BUS_INTERFACE_TYPE__DESCRIPTION:
				return getDescription();
			case _2009Package.BUS_INTERFACE_TYPE__BUS_TYPE:
				return getBusType();
			case _2009Package.BUS_INTERFACE_TYPE__ABSTRACTION_TYPE:
				return getAbstractionType();
			case _2009Package.BUS_INTERFACE_TYPE__MASTER:
				return getMaster();
			case _2009Package.BUS_INTERFACE_TYPE__SLAVE:
				return getSlave();
			case _2009Package.BUS_INTERFACE_TYPE__SYSTEM:
				return getSystem();
			case _2009Package.BUS_INTERFACE_TYPE__MIRRORED_SLAVE:
				return getMirroredSlave();
			case _2009Package.BUS_INTERFACE_TYPE__MIRRORED_MASTER:
				return getMirroredMaster();
			case _2009Package.BUS_INTERFACE_TYPE__MIRRORED_SYSTEM:
				return getMirroredSystem();
			case _2009Package.BUS_INTERFACE_TYPE__MONITOR:
				return getMonitor();
			case _2009Package.BUS_INTERFACE_TYPE__CONNECTION_REQUIRED:
				return isConnectionRequired();
			case _2009Package.BUS_INTERFACE_TYPE__PORT_MAPS:
				return getPortMaps();
			case _2009Package.BUS_INTERFACE_TYPE__BITS_IN_LAU:
				return getBitsInLau();
			case _2009Package.BUS_INTERFACE_TYPE__BIT_STEERING:
				return getBitSteering();
			case _2009Package.BUS_INTERFACE_TYPE__ENDIANNESS:
				return getEndianness();
			case _2009Package.BUS_INTERFACE_TYPE__PARAMETERS:
				return getParameters();
			case _2009Package.BUS_INTERFACE_TYPE__VENDOR_EXTENSIONS:
				return getVendorExtensions();
			case _2009Package.BUS_INTERFACE_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case _2009Package.BUS_INTERFACE_TYPE__NAME:
				setName((String)newValue);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__BUS_TYPE:
				setBusType((LibraryRefType)newValue);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__ABSTRACTION_TYPE:
				setAbstractionType((LibraryRefType)newValue);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__MASTER:
				setMaster((MasterType)newValue);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__SLAVE:
				setSlave((SlaveType)newValue);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__SYSTEM:
				setSystem((SystemType)newValue);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__MIRRORED_SLAVE:
				setMirroredSlave((MirroredSlaveType)newValue);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__MIRRORED_MASTER:
				setMirroredMaster((MirroredMasterType)newValue);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__MIRRORED_SYSTEM:
				setMirroredSystem((MirroredSystemType)newValue);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__MONITOR:
				setMonitor((MonitorType)newValue);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__CONNECTION_REQUIRED:
				setConnectionRequired((Boolean)newValue);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__PORT_MAPS:
				setPortMaps((PortMapsType)newValue);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__BITS_IN_LAU:
				setBitsInLau((BigInteger)newValue);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__BIT_STEERING:
				setBitSteering((BitSteeringType1)newValue);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__ENDIANNESS:
				setEndianness((EndianessType)newValue);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__PARAMETERS:
				setParameters((ParametersType1)newValue);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)newValue);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case _2009Package.BUS_INTERFACE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__BUS_TYPE:
				setBusType((LibraryRefType)null);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__ABSTRACTION_TYPE:
				setAbstractionType((LibraryRefType)null);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__MASTER:
				setMaster((MasterType)null);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__SLAVE:
				setSlave((SlaveType)null);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__SYSTEM:
				setSystem((SystemType)null);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__MIRRORED_SLAVE:
				setMirroredSlave((MirroredSlaveType)null);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__MIRRORED_MASTER:
				setMirroredMaster((MirroredMasterType)null);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__MIRRORED_SYSTEM:
				setMirroredSystem((MirroredSystemType)null);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__MONITOR:
				setMonitor((MonitorType)null);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__CONNECTION_REQUIRED:
				unsetConnectionRequired();
				return;
			case _2009Package.BUS_INTERFACE_TYPE__PORT_MAPS:
				setPortMaps((PortMapsType)null);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__BITS_IN_LAU:
				setBitsInLau(BITS_IN_LAU_EDEFAULT);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__BIT_STEERING:
				setBitSteering((BitSteeringType1)null);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__ENDIANNESS:
				unsetEndianness();
				return;
			case _2009Package.BUS_INTERFACE_TYPE__PARAMETERS:
				setParameters((ParametersType1)null);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)null);
				return;
			case _2009Package.BUS_INTERFACE_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case _2009Package.BUS_INTERFACE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _2009Package.BUS_INTERFACE_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case _2009Package.BUS_INTERFACE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _2009Package.BUS_INTERFACE_TYPE__BUS_TYPE:
				return busType != null;
			case _2009Package.BUS_INTERFACE_TYPE__ABSTRACTION_TYPE:
				return abstractionType != null;
			case _2009Package.BUS_INTERFACE_TYPE__MASTER:
				return master != null;
			case _2009Package.BUS_INTERFACE_TYPE__SLAVE:
				return slave != null;
			case _2009Package.BUS_INTERFACE_TYPE__SYSTEM:
				return system != null;
			case _2009Package.BUS_INTERFACE_TYPE__MIRRORED_SLAVE:
				return mirroredSlave != null;
			case _2009Package.BUS_INTERFACE_TYPE__MIRRORED_MASTER:
				return mirroredMaster != null;
			case _2009Package.BUS_INTERFACE_TYPE__MIRRORED_SYSTEM:
				return mirroredSystem != null;
			case _2009Package.BUS_INTERFACE_TYPE__MONITOR:
				return monitor != null;
			case _2009Package.BUS_INTERFACE_TYPE__CONNECTION_REQUIRED:
				return isSetConnectionRequired();
			case _2009Package.BUS_INTERFACE_TYPE__PORT_MAPS:
				return portMaps != null;
			case _2009Package.BUS_INTERFACE_TYPE__BITS_IN_LAU:
				return BITS_IN_LAU_EDEFAULT == null ? bitsInLau != null : !BITS_IN_LAU_EDEFAULT.equals(bitsInLau);
			case _2009Package.BUS_INTERFACE_TYPE__BIT_STEERING:
				return bitSteering != null;
			case _2009Package.BUS_INTERFACE_TYPE__ENDIANNESS:
				return isSetEndianness();
			case _2009Package.BUS_INTERFACE_TYPE__PARAMETERS:
				return parameters != null;
			case _2009Package.BUS_INTERFACE_TYPE__VENDOR_EXTENSIONS:
				return vendorExtensions != null;
			case _2009Package.BUS_INTERFACE_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(", connectionRequired: ");
		if (connectionRequiredESet) result.append(connectionRequired); else result.append("<unset>");
		result.append(", bitsInLau: ");
		result.append(bitsInLau);
		result.append(", endianness: ");
		if (endiannessESet) result.append(endianness); else result.append("<unset>");
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //BusInterfaceTypeImpl
