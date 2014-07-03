/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spiritconsortium.xml.schema.spirit._1685._2009.ChoicesType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainSelectorType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorSelectorType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Chain Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorChainTypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorChainTypeImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorChainTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorChainTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorChainTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorChainTypeImpl#getGeneratorChainSelector <em>Generator Chain Selector</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorChainTypeImpl#getComponentGeneratorSelector <em>Component Generator Selector</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorChainTypeImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorChainTypeImpl#getChainGroup <em>Chain Group</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorChainTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorChainTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorChainTypeImpl#getChoices <em>Choices</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorChainTypeImpl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorChainTypeImpl#isHidden <em>Hidden</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratorChainTypeImpl extends MinimalEObjectImpl.Container implements GeneratorChainType {
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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getChainGroup() <em>Chain Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<String> chainGroup;

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
	 * The cached value of the '{@link #getChoices() <em>Choices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoices()
	 * @generated
	 * @ordered
	 */
	protected ChoicesType choices;

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
	 * The default value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDDEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidden()
	 * @generated
	 * @ordered
	 */
	protected boolean hidden = HIDDEN_EDEFAULT;

	/**
	 * This is true if the Hidden attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hiddenESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorChainTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getGeneratorChainType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_CHAIN_TYPE__VENDOR, oldVendor, vendor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_CHAIN_TYPE__LIBRARY, oldLibrary, library));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_CHAIN_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_CHAIN_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, _2009Package.GENERATOR_CHAIN_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratorChainSelectorType> getGeneratorChainSelector() {
		return getGroup().list(_2009Package.eINSTANCE.getGeneratorChainType_GeneratorChainSelector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratorSelectorType> getComponentGeneratorSelector() {
		return getGroup().list(_2009Package.eINSTANCE.getGeneratorChainType_ComponentGeneratorSelector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratorType> getGenerator() {
		return getGroup().list(_2009Package.eINSTANCE.getGeneratorChainType_Generator());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getChainGroup() {
		if (chainGroup == null) {
			chainGroup = new EDataTypeEList<String>(String.class, this, _2009Package.GENERATOR_CHAIN_TYPE__CHAIN_GROUP);
		}
		return chainGroup;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_CHAIN_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_CHAIN_TYPE__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_CHAIN_TYPE__CHOICES, oldChoices, newChoices);
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
				msgs = ((InternalEObject)choices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.GENERATOR_CHAIN_TYPE__CHOICES, null, msgs);
			if (newChoices != null)
				msgs = ((InternalEObject)newChoices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.GENERATOR_CHAIN_TYPE__CHOICES, null, msgs);
			msgs = basicSetChoices(newChoices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_CHAIN_TYPE__CHOICES, newChoices, newChoices));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_CHAIN_TYPE__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
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
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.GENERATOR_CHAIN_TYPE__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.GENERATOR_CHAIN_TYPE__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_CHAIN_TYPE__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHidden() {
		return hidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHidden(boolean newHidden) {
		boolean oldHidden = hidden;
		hidden = newHidden;
		boolean oldHiddenESet = hiddenESet;
		hiddenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_CHAIN_TYPE__HIDDEN, oldHidden, hidden, !oldHiddenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHidden() {
		boolean oldHidden = hidden;
		boolean oldHiddenESet = hiddenESet;
		hidden = HIDDEN_EDEFAULT;
		hiddenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.GENERATOR_CHAIN_TYPE__HIDDEN, oldHidden, HIDDEN_EDEFAULT, oldHiddenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHidden() {
		return hiddenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.GENERATOR_CHAIN_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case _2009Package.GENERATOR_CHAIN_TYPE__GENERATOR_CHAIN_SELECTOR:
				return ((InternalEList<?>)getGeneratorChainSelector()).basicRemove(otherEnd, msgs);
			case _2009Package.GENERATOR_CHAIN_TYPE__COMPONENT_GENERATOR_SELECTOR:
				return ((InternalEList<?>)getComponentGeneratorSelector()).basicRemove(otherEnd, msgs);
			case _2009Package.GENERATOR_CHAIN_TYPE__GENERATOR:
				return ((InternalEList<?>)getGenerator()).basicRemove(otherEnd, msgs);
			case _2009Package.GENERATOR_CHAIN_TYPE__CHOICES:
				return basicSetChoices(null, msgs);
			case _2009Package.GENERATOR_CHAIN_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.GENERATOR_CHAIN_TYPE__VENDOR:
				return getVendor();
			case _2009Package.GENERATOR_CHAIN_TYPE__LIBRARY:
				return getLibrary();
			case _2009Package.GENERATOR_CHAIN_TYPE__NAME:
				return getName();
			case _2009Package.GENERATOR_CHAIN_TYPE__VERSION:
				return getVersion();
			case _2009Package.GENERATOR_CHAIN_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case _2009Package.GENERATOR_CHAIN_TYPE__GENERATOR_CHAIN_SELECTOR:
				return getGeneratorChainSelector();
			case _2009Package.GENERATOR_CHAIN_TYPE__COMPONENT_GENERATOR_SELECTOR:
				return getComponentGeneratorSelector();
			case _2009Package.GENERATOR_CHAIN_TYPE__GENERATOR:
				return getGenerator();
			case _2009Package.GENERATOR_CHAIN_TYPE__CHAIN_GROUP:
				return getChainGroup();
			case _2009Package.GENERATOR_CHAIN_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case _2009Package.GENERATOR_CHAIN_TYPE__DESCRIPTION:
				return getDescription();
			case _2009Package.GENERATOR_CHAIN_TYPE__CHOICES:
				return getChoices();
			case _2009Package.GENERATOR_CHAIN_TYPE__VENDOR_EXTENSIONS:
				return getVendorExtensions();
			case _2009Package.GENERATOR_CHAIN_TYPE__HIDDEN:
				return isHidden();
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
			case _2009Package.GENERATOR_CHAIN_TYPE__VENDOR:
				setVendor((String)newValue);
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__LIBRARY:
				setLibrary((String)newValue);
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__NAME:
				setName((String)newValue);
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__GENERATOR_CHAIN_SELECTOR:
				getGeneratorChainSelector().clear();
				getGeneratorChainSelector().addAll((Collection<? extends GeneratorChainSelectorType>)newValue);
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__COMPONENT_GENERATOR_SELECTOR:
				getComponentGeneratorSelector().clear();
				getComponentGeneratorSelector().addAll((Collection<? extends GeneratorSelectorType>)newValue);
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__GENERATOR:
				getGenerator().clear();
				getGenerator().addAll((Collection<? extends GeneratorType>)newValue);
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__CHAIN_GROUP:
				getChainGroup().clear();
				getChainGroup().addAll((Collection<? extends String>)newValue);
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__CHOICES:
				setChoices((ChoicesType)newValue);
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)newValue);
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__HIDDEN:
				setHidden((Boolean)newValue);
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
			case _2009Package.GENERATOR_CHAIN_TYPE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__LIBRARY:
				setLibrary(LIBRARY_EDEFAULT);
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__GROUP:
				getGroup().clear();
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__GENERATOR_CHAIN_SELECTOR:
				getGeneratorChainSelector().clear();
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__COMPONENT_GENERATOR_SELECTOR:
				getComponentGeneratorSelector().clear();
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__GENERATOR:
				getGenerator().clear();
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__CHAIN_GROUP:
				getChainGroup().clear();
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__CHOICES:
				setChoices((ChoicesType)null);
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)null);
				return;
			case _2009Package.GENERATOR_CHAIN_TYPE__HIDDEN:
				unsetHidden();
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
			case _2009Package.GENERATOR_CHAIN_TYPE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case _2009Package.GENERATOR_CHAIN_TYPE__LIBRARY:
				return LIBRARY_EDEFAULT == null ? library != null : !LIBRARY_EDEFAULT.equals(library);
			case _2009Package.GENERATOR_CHAIN_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _2009Package.GENERATOR_CHAIN_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case _2009Package.GENERATOR_CHAIN_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case _2009Package.GENERATOR_CHAIN_TYPE__GENERATOR_CHAIN_SELECTOR:
				return !getGeneratorChainSelector().isEmpty();
			case _2009Package.GENERATOR_CHAIN_TYPE__COMPONENT_GENERATOR_SELECTOR:
				return !getComponentGeneratorSelector().isEmpty();
			case _2009Package.GENERATOR_CHAIN_TYPE__GENERATOR:
				return !getGenerator().isEmpty();
			case _2009Package.GENERATOR_CHAIN_TYPE__CHAIN_GROUP:
				return chainGroup != null && !chainGroup.isEmpty();
			case _2009Package.GENERATOR_CHAIN_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case _2009Package.GENERATOR_CHAIN_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _2009Package.GENERATOR_CHAIN_TYPE__CHOICES:
				return choices != null;
			case _2009Package.GENERATOR_CHAIN_TYPE__VENDOR_EXTENSIONS:
				return vendorExtensions != null;
			case _2009Package.GENERATOR_CHAIN_TYPE__HIDDEN:
				return isSetHidden();
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
		result.append(", group: ");
		result.append(group);
		result.append(", chainGroup: ");
		result.append(chainGroup);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", description: ");
		result.append(description);
		result.append(", hidden: ");
		if (hiddenESet) result.append(hidden); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GeneratorChainTypeImpl
