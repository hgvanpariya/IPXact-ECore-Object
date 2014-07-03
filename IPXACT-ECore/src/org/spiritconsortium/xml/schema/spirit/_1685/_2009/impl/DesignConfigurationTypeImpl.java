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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spiritconsortium.xml.schema.spirit._1685._2009.DesignConfigurationType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainConfigurationType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.InterconnectionConfigurationType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.LibraryRefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ViewConfigurationType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DesignConfigurationTypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DesignConfigurationTypeImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DesignConfigurationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DesignConfigurationTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DesignConfigurationTypeImpl#getDesignRef <em>Design Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DesignConfigurationTypeImpl#getGeneratorChainConfiguration <em>Generator Chain Configuration</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DesignConfigurationTypeImpl#getInterconnectionConfiguration <em>Interconnection Configuration</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DesignConfigurationTypeImpl#getViewConfiguration <em>View Configuration</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DesignConfigurationTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DesignConfigurationTypeImpl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DesignConfigurationTypeImpl extends MinimalEObjectImpl.Container implements DesignConfigurationType {
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
	 * The cached value of the '{@link #getDesignRef() <em>Design Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignRef()
	 * @generated
	 * @ordered
	 */
	protected LibraryRefType designRef;

	/**
	 * The cached value of the '{@link #getGeneratorChainConfiguration() <em>Generator Chain Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorChainConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratorChainConfigurationType> generatorChainConfiguration;

	/**
	 * The cached value of the '{@link #getInterconnectionConfiguration() <em>Interconnection Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnectionConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<InterconnectionConfigurationType> interconnectionConfiguration;

	/**
	 * The cached value of the '{@link #getViewConfiguration() <em>View Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewConfigurationType> viewConfiguration;

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
	protected DesignConfigurationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getDesignConfigurationType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DESIGN_CONFIGURATION_TYPE__VENDOR, oldVendor, vendor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DESIGN_CONFIGURATION_TYPE__LIBRARY, oldLibrary, library));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DESIGN_CONFIGURATION_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DESIGN_CONFIGURATION_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryRefType getDesignRef() {
		return designRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignRef(LibraryRefType newDesignRef, NotificationChain msgs) {
		LibraryRefType oldDesignRef = designRef;
		designRef = newDesignRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.DESIGN_CONFIGURATION_TYPE__DESIGN_REF, oldDesignRef, newDesignRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignRef(LibraryRefType newDesignRef) {
		if (newDesignRef != designRef) {
			NotificationChain msgs = null;
			if (designRef != null)
				msgs = ((InternalEObject)designRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.DESIGN_CONFIGURATION_TYPE__DESIGN_REF, null, msgs);
			if (newDesignRef != null)
				msgs = ((InternalEObject)newDesignRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.DESIGN_CONFIGURATION_TYPE__DESIGN_REF, null, msgs);
			msgs = basicSetDesignRef(newDesignRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DESIGN_CONFIGURATION_TYPE__DESIGN_REF, newDesignRef, newDesignRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratorChainConfigurationType> getGeneratorChainConfiguration() {
		if (generatorChainConfiguration == null) {
			generatorChainConfiguration = new EObjectContainmentEList<GeneratorChainConfigurationType>(GeneratorChainConfigurationType.class, this, _2009Package.DESIGN_CONFIGURATION_TYPE__GENERATOR_CHAIN_CONFIGURATION);
		}
		return generatorChainConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterconnectionConfigurationType> getInterconnectionConfiguration() {
		if (interconnectionConfiguration == null) {
			interconnectionConfiguration = new EObjectContainmentEList<InterconnectionConfigurationType>(InterconnectionConfigurationType.class, this, _2009Package.DESIGN_CONFIGURATION_TYPE__INTERCONNECTION_CONFIGURATION);
		}
		return interconnectionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewConfigurationType> getViewConfiguration() {
		if (viewConfiguration == null) {
			viewConfiguration = new EObjectContainmentEList<ViewConfigurationType>(ViewConfigurationType.class, this, _2009Package.DESIGN_CONFIGURATION_TYPE__VIEW_CONFIGURATION);
		}
		return viewConfiguration;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DESIGN_CONFIGURATION_TYPE__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.DESIGN_CONFIGURATION_TYPE__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
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
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.DESIGN_CONFIGURATION_TYPE__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.DESIGN_CONFIGURATION_TYPE__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DESIGN_CONFIGURATION_TYPE__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.DESIGN_CONFIGURATION_TYPE__DESIGN_REF:
				return basicSetDesignRef(null, msgs);
			case _2009Package.DESIGN_CONFIGURATION_TYPE__GENERATOR_CHAIN_CONFIGURATION:
				return ((InternalEList<?>)getGeneratorChainConfiguration()).basicRemove(otherEnd, msgs);
			case _2009Package.DESIGN_CONFIGURATION_TYPE__INTERCONNECTION_CONFIGURATION:
				return ((InternalEList<?>)getInterconnectionConfiguration()).basicRemove(otherEnd, msgs);
			case _2009Package.DESIGN_CONFIGURATION_TYPE__VIEW_CONFIGURATION:
				return ((InternalEList<?>)getViewConfiguration()).basicRemove(otherEnd, msgs);
			case _2009Package.DESIGN_CONFIGURATION_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.DESIGN_CONFIGURATION_TYPE__VENDOR:
				return getVendor();
			case _2009Package.DESIGN_CONFIGURATION_TYPE__LIBRARY:
				return getLibrary();
			case _2009Package.DESIGN_CONFIGURATION_TYPE__NAME:
				return getName();
			case _2009Package.DESIGN_CONFIGURATION_TYPE__VERSION:
				return getVersion();
			case _2009Package.DESIGN_CONFIGURATION_TYPE__DESIGN_REF:
				return getDesignRef();
			case _2009Package.DESIGN_CONFIGURATION_TYPE__GENERATOR_CHAIN_CONFIGURATION:
				return getGeneratorChainConfiguration();
			case _2009Package.DESIGN_CONFIGURATION_TYPE__INTERCONNECTION_CONFIGURATION:
				return getInterconnectionConfiguration();
			case _2009Package.DESIGN_CONFIGURATION_TYPE__VIEW_CONFIGURATION:
				return getViewConfiguration();
			case _2009Package.DESIGN_CONFIGURATION_TYPE__DESCRIPTION:
				return getDescription();
			case _2009Package.DESIGN_CONFIGURATION_TYPE__VENDOR_EXTENSIONS:
				return getVendorExtensions();
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
			case _2009Package.DESIGN_CONFIGURATION_TYPE__VENDOR:
				setVendor((String)newValue);
				return;
			case _2009Package.DESIGN_CONFIGURATION_TYPE__LIBRARY:
				setLibrary((String)newValue);
				return;
			case _2009Package.DESIGN_CONFIGURATION_TYPE__NAME:
				setName((String)newValue);
				return;
			case _2009Package.DESIGN_CONFIGURATION_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case _2009Package.DESIGN_CONFIGURATION_TYPE__DESIGN_REF:
				setDesignRef((LibraryRefType)newValue);
				return;
			case _2009Package.DESIGN_CONFIGURATION_TYPE__GENERATOR_CHAIN_CONFIGURATION:
				getGeneratorChainConfiguration().clear();
				getGeneratorChainConfiguration().addAll((Collection<? extends GeneratorChainConfigurationType>)newValue);
				return;
			case _2009Package.DESIGN_CONFIGURATION_TYPE__INTERCONNECTION_CONFIGURATION:
				getInterconnectionConfiguration().clear();
				getInterconnectionConfiguration().addAll((Collection<? extends InterconnectionConfigurationType>)newValue);
				return;
			case _2009Package.DESIGN_CONFIGURATION_TYPE__VIEW_CONFIGURATION:
				getViewConfiguration().clear();
				getViewConfiguration().addAll((Collection<? extends ViewConfigurationType>)newValue);
				return;
			case _2009Package.DESIGN_CONFIGURATION_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _2009Package.DESIGN_CONFIGURATION_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.DESIGN_CONFIGURATION_TYPE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case _2009Package.DESIGN_CONFIGURATION_TYPE__LIBRARY:
				setLibrary(LIBRARY_EDEFAULT);
				return;
			case _2009Package.DESIGN_CONFIGURATION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _2009Package.DESIGN_CONFIGURATION_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case _2009Package.DESIGN_CONFIGURATION_TYPE__DESIGN_REF:
				setDesignRef((LibraryRefType)null);
				return;
			case _2009Package.DESIGN_CONFIGURATION_TYPE__GENERATOR_CHAIN_CONFIGURATION:
				getGeneratorChainConfiguration().clear();
				return;
			case _2009Package.DESIGN_CONFIGURATION_TYPE__INTERCONNECTION_CONFIGURATION:
				getInterconnectionConfiguration().clear();
				return;
			case _2009Package.DESIGN_CONFIGURATION_TYPE__VIEW_CONFIGURATION:
				getViewConfiguration().clear();
				return;
			case _2009Package.DESIGN_CONFIGURATION_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _2009Package.DESIGN_CONFIGURATION_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.DESIGN_CONFIGURATION_TYPE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case _2009Package.DESIGN_CONFIGURATION_TYPE__LIBRARY:
				return LIBRARY_EDEFAULT == null ? library != null : !LIBRARY_EDEFAULT.equals(library);
			case _2009Package.DESIGN_CONFIGURATION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _2009Package.DESIGN_CONFIGURATION_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case _2009Package.DESIGN_CONFIGURATION_TYPE__DESIGN_REF:
				return designRef != null;
			case _2009Package.DESIGN_CONFIGURATION_TYPE__GENERATOR_CHAIN_CONFIGURATION:
				return generatorChainConfiguration != null && !generatorChainConfiguration.isEmpty();
			case _2009Package.DESIGN_CONFIGURATION_TYPE__INTERCONNECTION_CONFIGURATION:
				return interconnectionConfiguration != null && !interconnectionConfiguration.isEmpty();
			case _2009Package.DESIGN_CONFIGURATION_TYPE__VIEW_CONFIGURATION:
				return viewConfiguration != null && !viewConfiguration.isEmpty();
			case _2009Package.DESIGN_CONFIGURATION_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _2009Package.DESIGN_CONFIGURATION_TYPE__VENDOR_EXTENSIONS:
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

} //DesignConfigurationTypeImpl
