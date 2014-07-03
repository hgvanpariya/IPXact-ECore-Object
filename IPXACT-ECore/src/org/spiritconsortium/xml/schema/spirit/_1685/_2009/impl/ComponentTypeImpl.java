/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.AddressSpacesType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfacesType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ChannelsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ChoicesType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentGeneratorsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.CpusType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.MemoryMapsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ModelType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.OtherClocks;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ParametersType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.RemapStatesType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentTypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentTypeImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentTypeImpl#getBusInterfaces <em>Bus Interfaces</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentTypeImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentTypeImpl#getRemapStates <em>Remap States</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentTypeImpl#getAddressSpaces <em>Address Spaces</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentTypeImpl#getMemoryMaps <em>Memory Maps</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentTypeImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentTypeImpl#getComponentGenerators <em>Component Generators</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentTypeImpl#getChoices <em>Choices</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentTypeImpl#getFileSets <em>File Sets</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentTypeImpl#getWhiteboxElements <em>Whitebox Elements</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentTypeImpl#getCpus <em>Cpus</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentTypeImpl#getOtherClockDrivers <em>Other Clock Drivers</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentTypeImpl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentTypeImpl extends MinimalEObjectImpl.Container implements ComponentType {
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
	 * The cached value of the '{@link #getBusInterfaces() <em>Bus Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusInterfaces()
	 * @generated
	 * @ordered
	 */
	protected BusInterfacesType busInterfaces;

	/**
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
	protected ChannelsType channels;

	/**
	 * The cached value of the '{@link #getRemapStates() <em>Remap States</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemapStates()
	 * @generated
	 * @ordered
	 */
	protected RemapStatesType remapStates;

	/**
	 * The cached value of the '{@link #getAddressSpaces() <em>Address Spaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressSpaces()
	 * @generated
	 * @ordered
	 */
	protected AddressSpacesType addressSpaces;

	/**
	 * The cached value of the '{@link #getMemoryMaps() <em>Memory Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMaps()
	 * @generated
	 * @ordered
	 */
	protected MemoryMapsType memoryMaps;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected ModelType model;

	/**
	 * The cached value of the '{@link #getComponentGenerators() <em>Component Generators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentGenerators()
	 * @generated
	 * @ordered
	 */
	protected ComponentGeneratorsType componentGenerators;

	/**
	 * The cached value of the '{@link #getChoices() <em>Choices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoices()
	 * @generated
	 * @ordered
	 */
	protected ChoicesType choices;

	/**
	 * The cached value of the '{@link #getFileSets() <em>File Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSets()
	 * @generated
	 * @ordered
	 */
	protected FileSetsType fileSets;

	/**
	 * The cached value of the '{@link #getWhiteboxElements() <em>Whitebox Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhiteboxElements()
	 * @generated
	 * @ordered
	 */
	protected WhiteboxElementsType whiteboxElements;

	/**
	 * The cached value of the '{@link #getCpus() <em>Cpus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpus()
	 * @generated
	 * @ordered
	 */
	protected CpusType cpus;

	/**
	 * The cached value of the '{@link #getOtherClockDrivers() <em>Other Clock Drivers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherClockDrivers()
	 * @generated
	 * @ordered
	 */
	protected OtherClocks otherClockDrivers;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getComponentType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__VENDOR, oldVendor, vendor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__LIBRARY, oldLibrary, library));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusInterfacesType getBusInterfaces() {
		return busInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusInterfaces(BusInterfacesType newBusInterfaces, NotificationChain msgs) {
		BusInterfacesType oldBusInterfaces = busInterfaces;
		busInterfaces = newBusInterfaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__BUS_INTERFACES, oldBusInterfaces, newBusInterfaces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusInterfaces(BusInterfacesType newBusInterfaces) {
		if (newBusInterfaces != busInterfaces) {
			NotificationChain msgs = null;
			if (busInterfaces != null)
				msgs = ((InternalEObject)busInterfaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__BUS_INTERFACES, null, msgs);
			if (newBusInterfaces != null)
				msgs = ((InternalEObject)newBusInterfaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__BUS_INTERFACES, null, msgs);
			msgs = basicSetBusInterfaces(newBusInterfaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__BUS_INTERFACES, newBusInterfaces, newBusInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelsType getChannels() {
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannels(ChannelsType newChannels, NotificationChain msgs) {
		ChannelsType oldChannels = channels;
		channels = newChannels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__CHANNELS, oldChannels, newChannels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannels(ChannelsType newChannels) {
		if (newChannels != channels) {
			NotificationChain msgs = null;
			if (channels != null)
				msgs = ((InternalEObject)channels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__CHANNELS, null, msgs);
			if (newChannels != null)
				msgs = ((InternalEObject)newChannels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__CHANNELS, null, msgs);
			msgs = basicSetChannels(newChannels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__CHANNELS, newChannels, newChannels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemapStatesType getRemapStates() {
		return remapStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemapStates(RemapStatesType newRemapStates, NotificationChain msgs) {
		RemapStatesType oldRemapStates = remapStates;
		remapStates = newRemapStates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__REMAP_STATES, oldRemapStates, newRemapStates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemapStates(RemapStatesType newRemapStates) {
		if (newRemapStates != remapStates) {
			NotificationChain msgs = null;
			if (remapStates != null)
				msgs = ((InternalEObject)remapStates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__REMAP_STATES, null, msgs);
			if (newRemapStates != null)
				msgs = ((InternalEObject)newRemapStates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__REMAP_STATES, null, msgs);
			msgs = basicSetRemapStates(newRemapStates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__REMAP_STATES, newRemapStates, newRemapStates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSpacesType getAddressSpaces() {
		return addressSpaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressSpaces(AddressSpacesType newAddressSpaces, NotificationChain msgs) {
		AddressSpacesType oldAddressSpaces = addressSpaces;
		addressSpaces = newAddressSpaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__ADDRESS_SPACES, oldAddressSpaces, newAddressSpaces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressSpaces(AddressSpacesType newAddressSpaces) {
		if (newAddressSpaces != addressSpaces) {
			NotificationChain msgs = null;
			if (addressSpaces != null)
				msgs = ((InternalEObject)addressSpaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__ADDRESS_SPACES, null, msgs);
			if (newAddressSpaces != null)
				msgs = ((InternalEObject)newAddressSpaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__ADDRESS_SPACES, null, msgs);
			msgs = basicSetAddressSpaces(newAddressSpaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__ADDRESS_SPACES, newAddressSpaces, newAddressSpaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMapsType getMemoryMaps() {
		return memoryMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemoryMaps(MemoryMapsType newMemoryMaps, NotificationChain msgs) {
		MemoryMapsType oldMemoryMaps = memoryMaps;
		memoryMaps = newMemoryMaps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__MEMORY_MAPS, oldMemoryMaps, newMemoryMaps);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryMaps(MemoryMapsType newMemoryMaps) {
		if (newMemoryMaps != memoryMaps) {
			NotificationChain msgs = null;
			if (memoryMaps != null)
				msgs = ((InternalEObject)memoryMaps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__MEMORY_MAPS, null, msgs);
			if (newMemoryMaps != null)
				msgs = ((InternalEObject)newMemoryMaps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__MEMORY_MAPS, null, msgs);
			msgs = basicSetMemoryMaps(newMemoryMaps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__MEMORY_MAPS, newMemoryMaps, newMemoryMaps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(ModelType newModel, NotificationChain msgs) {
		ModelType oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__MODEL, oldModel, newModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(ModelType newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__MODEL, null, msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__MODEL, null, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentGeneratorsType getComponentGenerators() {
		return componentGenerators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentGenerators(ComponentGeneratorsType newComponentGenerators, NotificationChain msgs) {
		ComponentGeneratorsType oldComponentGenerators = componentGenerators;
		componentGenerators = newComponentGenerators;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__COMPONENT_GENERATORS, oldComponentGenerators, newComponentGenerators);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentGenerators(ComponentGeneratorsType newComponentGenerators) {
		if (newComponentGenerators != componentGenerators) {
			NotificationChain msgs = null;
			if (componentGenerators != null)
				msgs = ((InternalEObject)componentGenerators).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__COMPONENT_GENERATORS, null, msgs);
			if (newComponentGenerators != null)
				msgs = ((InternalEObject)newComponentGenerators).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__COMPONENT_GENERATORS, null, msgs);
			msgs = basicSetComponentGenerators(newComponentGenerators, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__COMPONENT_GENERATORS, newComponentGenerators, newComponentGenerators));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoicesType getChoices() {
		return choices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChoices(ChoicesType newChoices, NotificationChain msgs) {
		ChoicesType oldChoices = choices;
		choices = newChoices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__CHOICES, oldChoices, newChoices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoices(ChoicesType newChoices) {
		if (newChoices != choices) {
			NotificationChain msgs = null;
			if (choices != null)
				msgs = ((InternalEObject)choices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__CHOICES, null, msgs);
			if (newChoices != null)
				msgs = ((InternalEObject)newChoices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__CHOICES, null, msgs);
			msgs = basicSetChoices(newChoices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__CHOICES, newChoices, newChoices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSetsType getFileSets() {
		return fileSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileSets(FileSetsType newFileSets, NotificationChain msgs) {
		FileSetsType oldFileSets = fileSets;
		fileSets = newFileSets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__FILE_SETS, oldFileSets, newFileSets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileSets(FileSetsType newFileSets) {
		if (newFileSets != fileSets) {
			NotificationChain msgs = null;
			if (fileSets != null)
				msgs = ((InternalEObject)fileSets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__FILE_SETS, null, msgs);
			if (newFileSets != null)
				msgs = ((InternalEObject)newFileSets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__FILE_SETS, null, msgs);
			msgs = basicSetFileSets(newFileSets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__FILE_SETS, newFileSets, newFileSets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteboxElementsType getWhiteboxElements() {
		return whiteboxElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhiteboxElements(WhiteboxElementsType newWhiteboxElements, NotificationChain msgs) {
		WhiteboxElementsType oldWhiteboxElements = whiteboxElements;
		whiteboxElements = newWhiteboxElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__WHITEBOX_ELEMENTS, oldWhiteboxElements, newWhiteboxElements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhiteboxElements(WhiteboxElementsType newWhiteboxElements) {
		if (newWhiteboxElements != whiteboxElements) {
			NotificationChain msgs = null;
			if (whiteboxElements != null)
				msgs = ((InternalEObject)whiteboxElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__WHITEBOX_ELEMENTS, null, msgs);
			if (newWhiteboxElements != null)
				msgs = ((InternalEObject)newWhiteboxElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__WHITEBOX_ELEMENTS, null, msgs);
			msgs = basicSetWhiteboxElements(newWhiteboxElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__WHITEBOX_ELEMENTS, newWhiteboxElements, newWhiteboxElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpusType getCpus() {
		return cpus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCpus(CpusType newCpus, NotificationChain msgs) {
		CpusType oldCpus = cpus;
		cpus = newCpus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__CPUS, oldCpus, newCpus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpus(CpusType newCpus) {
		if (newCpus != cpus) {
			NotificationChain msgs = null;
			if (cpus != null)
				msgs = ((InternalEObject)cpus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__CPUS, null, msgs);
			if (newCpus != null)
				msgs = ((InternalEObject)newCpus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__CPUS, null, msgs);
			msgs = basicSetCpus(newCpus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__CPUS, newCpus, newCpus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherClocks getOtherClockDrivers() {
		return otherClockDrivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherClockDrivers(OtherClocks newOtherClockDrivers, NotificationChain msgs) {
		OtherClocks oldOtherClockDrivers = otherClockDrivers;
		otherClockDrivers = newOtherClockDrivers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__OTHER_CLOCK_DRIVERS, oldOtherClockDrivers, newOtherClockDrivers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherClockDrivers(OtherClocks newOtherClockDrivers) {
		if (newOtherClockDrivers != otherClockDrivers) {
			NotificationChain msgs = null;
			if (otherClockDrivers != null)
				msgs = ((InternalEObject)otherClockDrivers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__OTHER_CLOCK_DRIVERS, null, msgs);
			if (newOtherClockDrivers != null)
				msgs = ((InternalEObject)newOtherClockDrivers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__OTHER_CLOCK_DRIVERS, null, msgs);
			msgs = basicSetOtherClockDrivers(newOtherClockDrivers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__OTHER_CLOCK_DRIVERS, newOtherClockDrivers, newOtherClockDrivers));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__PARAMETERS, oldParameters, newParameters);
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
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__PARAMETERS, newParameters, newParameters));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
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
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_TYPE__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_TYPE__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.COMPONENT_TYPE__BUS_INTERFACES:
				return basicSetBusInterfaces(null, msgs);
			case _2009Package.COMPONENT_TYPE__CHANNELS:
				return basicSetChannels(null, msgs);
			case _2009Package.COMPONENT_TYPE__REMAP_STATES:
				return basicSetRemapStates(null, msgs);
			case _2009Package.COMPONENT_TYPE__ADDRESS_SPACES:
				return basicSetAddressSpaces(null, msgs);
			case _2009Package.COMPONENT_TYPE__MEMORY_MAPS:
				return basicSetMemoryMaps(null, msgs);
			case _2009Package.COMPONENT_TYPE__MODEL:
				return basicSetModel(null, msgs);
			case _2009Package.COMPONENT_TYPE__COMPONENT_GENERATORS:
				return basicSetComponentGenerators(null, msgs);
			case _2009Package.COMPONENT_TYPE__CHOICES:
				return basicSetChoices(null, msgs);
			case _2009Package.COMPONENT_TYPE__FILE_SETS:
				return basicSetFileSets(null, msgs);
			case _2009Package.COMPONENT_TYPE__WHITEBOX_ELEMENTS:
				return basicSetWhiteboxElements(null, msgs);
			case _2009Package.COMPONENT_TYPE__CPUS:
				return basicSetCpus(null, msgs);
			case _2009Package.COMPONENT_TYPE__OTHER_CLOCK_DRIVERS:
				return basicSetOtherClockDrivers(null, msgs);
			case _2009Package.COMPONENT_TYPE__PARAMETERS:
				return basicSetParameters(null, msgs);
			case _2009Package.COMPONENT_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.COMPONENT_TYPE__VENDOR:
				return getVendor();
			case _2009Package.COMPONENT_TYPE__LIBRARY:
				return getLibrary();
			case _2009Package.COMPONENT_TYPE__NAME:
				return getName();
			case _2009Package.COMPONENT_TYPE__VERSION:
				return getVersion();
			case _2009Package.COMPONENT_TYPE__BUS_INTERFACES:
				return getBusInterfaces();
			case _2009Package.COMPONENT_TYPE__CHANNELS:
				return getChannels();
			case _2009Package.COMPONENT_TYPE__REMAP_STATES:
				return getRemapStates();
			case _2009Package.COMPONENT_TYPE__ADDRESS_SPACES:
				return getAddressSpaces();
			case _2009Package.COMPONENT_TYPE__MEMORY_MAPS:
				return getMemoryMaps();
			case _2009Package.COMPONENT_TYPE__MODEL:
				return getModel();
			case _2009Package.COMPONENT_TYPE__COMPONENT_GENERATORS:
				return getComponentGenerators();
			case _2009Package.COMPONENT_TYPE__CHOICES:
				return getChoices();
			case _2009Package.COMPONENT_TYPE__FILE_SETS:
				return getFileSets();
			case _2009Package.COMPONENT_TYPE__WHITEBOX_ELEMENTS:
				return getWhiteboxElements();
			case _2009Package.COMPONENT_TYPE__CPUS:
				return getCpus();
			case _2009Package.COMPONENT_TYPE__OTHER_CLOCK_DRIVERS:
				return getOtherClockDrivers();
			case _2009Package.COMPONENT_TYPE__DESCRIPTION:
				return getDescription();
			case _2009Package.COMPONENT_TYPE__PARAMETERS:
				return getParameters();
			case _2009Package.COMPONENT_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.COMPONENT_TYPE__VENDOR:
				setVendor((String)newValue);
				return;
			case _2009Package.COMPONENT_TYPE__LIBRARY:
				setLibrary((String)newValue);
				return;
			case _2009Package.COMPONENT_TYPE__NAME:
				setName((String)newValue);
				return;
			case _2009Package.COMPONENT_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case _2009Package.COMPONENT_TYPE__BUS_INTERFACES:
				setBusInterfaces((BusInterfacesType)newValue);
				return;
			case _2009Package.COMPONENT_TYPE__CHANNELS:
				setChannels((ChannelsType)newValue);
				return;
			case _2009Package.COMPONENT_TYPE__REMAP_STATES:
				setRemapStates((RemapStatesType)newValue);
				return;
			case _2009Package.COMPONENT_TYPE__ADDRESS_SPACES:
				setAddressSpaces((AddressSpacesType)newValue);
				return;
			case _2009Package.COMPONENT_TYPE__MEMORY_MAPS:
				setMemoryMaps((MemoryMapsType)newValue);
				return;
			case _2009Package.COMPONENT_TYPE__MODEL:
				setModel((ModelType)newValue);
				return;
			case _2009Package.COMPONENT_TYPE__COMPONENT_GENERATORS:
				setComponentGenerators((ComponentGeneratorsType)newValue);
				return;
			case _2009Package.COMPONENT_TYPE__CHOICES:
				setChoices((ChoicesType)newValue);
				return;
			case _2009Package.COMPONENT_TYPE__FILE_SETS:
				setFileSets((FileSetsType)newValue);
				return;
			case _2009Package.COMPONENT_TYPE__WHITEBOX_ELEMENTS:
				setWhiteboxElements((WhiteboxElementsType)newValue);
				return;
			case _2009Package.COMPONENT_TYPE__CPUS:
				setCpus((CpusType)newValue);
				return;
			case _2009Package.COMPONENT_TYPE__OTHER_CLOCK_DRIVERS:
				setOtherClockDrivers((OtherClocks)newValue);
				return;
			case _2009Package.COMPONENT_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _2009Package.COMPONENT_TYPE__PARAMETERS:
				setParameters((ParametersType1)newValue);
				return;
			case _2009Package.COMPONENT_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.COMPONENT_TYPE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case _2009Package.COMPONENT_TYPE__LIBRARY:
				setLibrary(LIBRARY_EDEFAULT);
				return;
			case _2009Package.COMPONENT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _2009Package.COMPONENT_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case _2009Package.COMPONENT_TYPE__BUS_INTERFACES:
				setBusInterfaces((BusInterfacesType)null);
				return;
			case _2009Package.COMPONENT_TYPE__CHANNELS:
				setChannels((ChannelsType)null);
				return;
			case _2009Package.COMPONENT_TYPE__REMAP_STATES:
				setRemapStates((RemapStatesType)null);
				return;
			case _2009Package.COMPONENT_TYPE__ADDRESS_SPACES:
				setAddressSpaces((AddressSpacesType)null);
				return;
			case _2009Package.COMPONENT_TYPE__MEMORY_MAPS:
				setMemoryMaps((MemoryMapsType)null);
				return;
			case _2009Package.COMPONENT_TYPE__MODEL:
				setModel((ModelType)null);
				return;
			case _2009Package.COMPONENT_TYPE__COMPONENT_GENERATORS:
				setComponentGenerators((ComponentGeneratorsType)null);
				return;
			case _2009Package.COMPONENT_TYPE__CHOICES:
				setChoices((ChoicesType)null);
				return;
			case _2009Package.COMPONENT_TYPE__FILE_SETS:
				setFileSets((FileSetsType)null);
				return;
			case _2009Package.COMPONENT_TYPE__WHITEBOX_ELEMENTS:
				setWhiteboxElements((WhiteboxElementsType)null);
				return;
			case _2009Package.COMPONENT_TYPE__CPUS:
				setCpus((CpusType)null);
				return;
			case _2009Package.COMPONENT_TYPE__OTHER_CLOCK_DRIVERS:
				setOtherClockDrivers((OtherClocks)null);
				return;
			case _2009Package.COMPONENT_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _2009Package.COMPONENT_TYPE__PARAMETERS:
				setParameters((ParametersType1)null);
				return;
			case _2009Package.COMPONENT_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.COMPONENT_TYPE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case _2009Package.COMPONENT_TYPE__LIBRARY:
				return LIBRARY_EDEFAULT == null ? library != null : !LIBRARY_EDEFAULT.equals(library);
			case _2009Package.COMPONENT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _2009Package.COMPONENT_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case _2009Package.COMPONENT_TYPE__BUS_INTERFACES:
				return busInterfaces != null;
			case _2009Package.COMPONENT_TYPE__CHANNELS:
				return channels != null;
			case _2009Package.COMPONENT_TYPE__REMAP_STATES:
				return remapStates != null;
			case _2009Package.COMPONENT_TYPE__ADDRESS_SPACES:
				return addressSpaces != null;
			case _2009Package.COMPONENT_TYPE__MEMORY_MAPS:
				return memoryMaps != null;
			case _2009Package.COMPONENT_TYPE__MODEL:
				return model != null;
			case _2009Package.COMPONENT_TYPE__COMPONENT_GENERATORS:
				return componentGenerators != null;
			case _2009Package.COMPONENT_TYPE__CHOICES:
				return choices != null;
			case _2009Package.COMPONENT_TYPE__FILE_SETS:
				return fileSets != null;
			case _2009Package.COMPONENT_TYPE__WHITEBOX_ELEMENTS:
				return whiteboxElements != null;
			case _2009Package.COMPONENT_TYPE__CPUS:
				return cpus != null;
			case _2009Package.COMPONENT_TYPE__OTHER_CLOCK_DRIVERS:
				return otherClockDrivers != null;
			case _2009Package.COMPONENT_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _2009Package.COMPONENT_TYPE__PARAMETERS:
				return parameters != null;
			case _2009Package.COMPONENT_TYPE__VENDOR_EXTENSIONS:
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ComponentTypeImpl
