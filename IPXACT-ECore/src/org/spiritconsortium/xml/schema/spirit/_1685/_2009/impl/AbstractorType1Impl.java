/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorGeneratorsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorInterfacesType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorModeType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorModelType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ChoicesType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.LibraryRefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ParametersType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstractor Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorType1Impl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorType1Impl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorType1Impl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorType1Impl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorType1Impl#getAbstractorMode <em>Abstractor Mode</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorType1Impl#getBusType <em>Bus Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorType1Impl#getAbstractorInterfaces <em>Abstractor Interfaces</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorType1Impl#getModel <em>Model</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorType1Impl#getAbstractorGenerators <em>Abstractor Generators</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorType1Impl#getChoices <em>Choices</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorType1Impl#getFileSets <em>File Sets</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorType1Impl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorType1Impl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorType1Impl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractorType1Impl extends MinimalEObjectImpl.Container implements AbstractorType1 {
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
	 * The cached value of the '{@link #getAbstractorMode() <em>Abstractor Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractorMode()
	 * @generated
	 * @ordered
	 */
	protected AbstractorModeType1 abstractorMode;

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
	 * The cached value of the '{@link #getAbstractorInterfaces() <em>Abstractor Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractorInterfaces()
	 * @generated
	 * @ordered
	 */
	protected AbstractorInterfacesType abstractorInterfaces;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected AbstractorModelType model;

	/**
	 * The cached value of the '{@link #getAbstractorGenerators() <em>Abstractor Generators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractorGenerators()
	 * @generated
	 * @ordered
	 */
	protected AbstractorGeneratorsType abstractorGenerators;

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
	protected AbstractorType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getAbstractorType1();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__VENDOR, oldVendor, vendor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__LIBRARY, oldLibrary, library));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorModeType1 getAbstractorMode() {
		return abstractorMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractorMode(AbstractorModeType1 newAbstractorMode, NotificationChain msgs) {
		AbstractorModeType1 oldAbstractorMode = abstractorMode;
		abstractorMode = newAbstractorMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_MODE, oldAbstractorMode, newAbstractorMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractorMode(AbstractorModeType1 newAbstractorMode) {
		if (newAbstractorMode != abstractorMode) {
			NotificationChain msgs = null;
			if (abstractorMode != null)
				msgs = ((InternalEObject)abstractorMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_MODE, null, msgs);
			if (newAbstractorMode != null)
				msgs = ((InternalEObject)newAbstractorMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_MODE, null, msgs);
			msgs = basicSetAbstractorMode(newAbstractorMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_MODE, newAbstractorMode, newAbstractorMode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__BUS_TYPE, oldBusType, newBusType);
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
				msgs = ((InternalEObject)busType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_TYPE1__BUS_TYPE, null, msgs);
			if (newBusType != null)
				msgs = ((InternalEObject)newBusType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_TYPE1__BUS_TYPE, null, msgs);
			msgs = basicSetBusType(newBusType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__BUS_TYPE, newBusType, newBusType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorInterfacesType getAbstractorInterfaces() {
		return abstractorInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractorInterfaces(AbstractorInterfacesType newAbstractorInterfaces, NotificationChain msgs) {
		AbstractorInterfacesType oldAbstractorInterfaces = abstractorInterfaces;
		abstractorInterfaces = newAbstractorInterfaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_INTERFACES, oldAbstractorInterfaces, newAbstractorInterfaces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractorInterfaces(AbstractorInterfacesType newAbstractorInterfaces) {
		if (newAbstractorInterfaces != abstractorInterfaces) {
			NotificationChain msgs = null;
			if (abstractorInterfaces != null)
				msgs = ((InternalEObject)abstractorInterfaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_INTERFACES, null, msgs);
			if (newAbstractorInterfaces != null)
				msgs = ((InternalEObject)newAbstractorInterfaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_INTERFACES, null, msgs);
			msgs = basicSetAbstractorInterfaces(newAbstractorInterfaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_INTERFACES, newAbstractorInterfaces, newAbstractorInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorModelType getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(AbstractorModelType newModel, NotificationChain msgs) {
		AbstractorModelType oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__MODEL, oldModel, newModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(AbstractorModelType newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_TYPE1__MODEL, null, msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_TYPE1__MODEL, null, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorGeneratorsType getAbstractorGenerators() {
		return abstractorGenerators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractorGenerators(AbstractorGeneratorsType newAbstractorGenerators, NotificationChain msgs) {
		AbstractorGeneratorsType oldAbstractorGenerators = abstractorGenerators;
		abstractorGenerators = newAbstractorGenerators;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_GENERATORS, oldAbstractorGenerators, newAbstractorGenerators);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractorGenerators(AbstractorGeneratorsType newAbstractorGenerators) {
		if (newAbstractorGenerators != abstractorGenerators) {
			NotificationChain msgs = null;
			if (abstractorGenerators != null)
				msgs = ((InternalEObject)abstractorGenerators).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_GENERATORS, null, msgs);
			if (newAbstractorGenerators != null)
				msgs = ((InternalEObject)newAbstractorGenerators).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_GENERATORS, null, msgs);
			msgs = basicSetAbstractorGenerators(newAbstractorGenerators, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_GENERATORS, newAbstractorGenerators, newAbstractorGenerators));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__CHOICES, oldChoices, newChoices);
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
				msgs = ((InternalEObject)choices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_TYPE1__CHOICES, null, msgs);
			if (newChoices != null)
				msgs = ((InternalEObject)newChoices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_TYPE1__CHOICES, null, msgs);
			msgs = basicSetChoices(newChoices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__CHOICES, newChoices, newChoices));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__FILE_SETS, oldFileSets, newFileSets);
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
				msgs = ((InternalEObject)fileSets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_TYPE1__FILE_SETS, null, msgs);
			if (newFileSets != null)
				msgs = ((InternalEObject)newFileSets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_TYPE1__FILE_SETS, null, msgs);
			msgs = basicSetFileSets(newFileSets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__FILE_SETS, newFileSets, newFileSets));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__PARAMETERS, oldParameters, newParameters);
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
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_TYPE1__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_TYPE1__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__PARAMETERS, newParameters, newParameters));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
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
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_TYPE1__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_TYPE1__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_TYPE1__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_MODE:
				return basicSetAbstractorMode(null, msgs);
			case _2009Package.ABSTRACTOR_TYPE1__BUS_TYPE:
				return basicSetBusType(null, msgs);
			case _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_INTERFACES:
				return basicSetAbstractorInterfaces(null, msgs);
			case _2009Package.ABSTRACTOR_TYPE1__MODEL:
				return basicSetModel(null, msgs);
			case _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_GENERATORS:
				return basicSetAbstractorGenerators(null, msgs);
			case _2009Package.ABSTRACTOR_TYPE1__CHOICES:
				return basicSetChoices(null, msgs);
			case _2009Package.ABSTRACTOR_TYPE1__FILE_SETS:
				return basicSetFileSets(null, msgs);
			case _2009Package.ABSTRACTOR_TYPE1__PARAMETERS:
				return basicSetParameters(null, msgs);
			case _2009Package.ABSTRACTOR_TYPE1__VENDOR_EXTENSIONS:
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
			case _2009Package.ABSTRACTOR_TYPE1__VENDOR:
				return getVendor();
			case _2009Package.ABSTRACTOR_TYPE1__LIBRARY:
				return getLibrary();
			case _2009Package.ABSTRACTOR_TYPE1__NAME:
				return getName();
			case _2009Package.ABSTRACTOR_TYPE1__VERSION:
				return getVersion();
			case _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_MODE:
				return getAbstractorMode();
			case _2009Package.ABSTRACTOR_TYPE1__BUS_TYPE:
				return getBusType();
			case _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_INTERFACES:
				return getAbstractorInterfaces();
			case _2009Package.ABSTRACTOR_TYPE1__MODEL:
				return getModel();
			case _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_GENERATORS:
				return getAbstractorGenerators();
			case _2009Package.ABSTRACTOR_TYPE1__CHOICES:
				return getChoices();
			case _2009Package.ABSTRACTOR_TYPE1__FILE_SETS:
				return getFileSets();
			case _2009Package.ABSTRACTOR_TYPE1__DESCRIPTION:
				return getDescription();
			case _2009Package.ABSTRACTOR_TYPE1__PARAMETERS:
				return getParameters();
			case _2009Package.ABSTRACTOR_TYPE1__VENDOR_EXTENSIONS:
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
			case _2009Package.ABSTRACTOR_TYPE1__VENDOR:
				setVendor((String)newValue);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__LIBRARY:
				setLibrary((String)newValue);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__NAME:
				setName((String)newValue);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__VERSION:
				setVersion((String)newValue);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_MODE:
				setAbstractorMode((AbstractorModeType1)newValue);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__BUS_TYPE:
				setBusType((LibraryRefType)newValue);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_INTERFACES:
				setAbstractorInterfaces((AbstractorInterfacesType)newValue);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__MODEL:
				setModel((AbstractorModelType)newValue);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_GENERATORS:
				setAbstractorGenerators((AbstractorGeneratorsType)newValue);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__CHOICES:
				setChoices((ChoicesType)newValue);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__FILE_SETS:
				setFileSets((FileSetsType)newValue);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__PARAMETERS:
				setParameters((ParametersType1)newValue);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__VENDOR_EXTENSIONS:
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
			case _2009Package.ABSTRACTOR_TYPE1__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__LIBRARY:
				setLibrary(LIBRARY_EDEFAULT);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_MODE:
				setAbstractorMode((AbstractorModeType1)null);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__BUS_TYPE:
				setBusType((LibraryRefType)null);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_INTERFACES:
				setAbstractorInterfaces((AbstractorInterfacesType)null);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__MODEL:
				setModel((AbstractorModelType)null);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_GENERATORS:
				setAbstractorGenerators((AbstractorGeneratorsType)null);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__CHOICES:
				setChoices((ChoicesType)null);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__FILE_SETS:
				setFileSets((FileSetsType)null);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__PARAMETERS:
				setParameters((ParametersType1)null);
				return;
			case _2009Package.ABSTRACTOR_TYPE1__VENDOR_EXTENSIONS:
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
			case _2009Package.ABSTRACTOR_TYPE1__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case _2009Package.ABSTRACTOR_TYPE1__LIBRARY:
				return LIBRARY_EDEFAULT == null ? library != null : !LIBRARY_EDEFAULT.equals(library);
			case _2009Package.ABSTRACTOR_TYPE1__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _2009Package.ABSTRACTOR_TYPE1__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_MODE:
				return abstractorMode != null;
			case _2009Package.ABSTRACTOR_TYPE1__BUS_TYPE:
				return busType != null;
			case _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_INTERFACES:
				return abstractorInterfaces != null;
			case _2009Package.ABSTRACTOR_TYPE1__MODEL:
				return model != null;
			case _2009Package.ABSTRACTOR_TYPE1__ABSTRACTOR_GENERATORS:
				return abstractorGenerators != null;
			case _2009Package.ABSTRACTOR_TYPE1__CHOICES:
				return choices != null;
			case _2009Package.ABSTRACTOR_TYPE1__FILE_SETS:
				return fileSets != null;
			case _2009Package.ABSTRACTOR_TYPE1__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _2009Package.ABSTRACTOR_TYPE1__PARAMETERS:
				return parameters != null;
			case _2009Package.ABSTRACTOR_TYPE1__VENDOR_EXTENSIONS:
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

} //AbstractorType1Impl
