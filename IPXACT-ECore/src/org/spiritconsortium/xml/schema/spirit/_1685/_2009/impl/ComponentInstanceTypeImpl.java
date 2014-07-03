/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentInstanceType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ConfigurableElementValuesType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.LibraryRefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentInstanceTypeImpl#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentInstanceTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentInstanceTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentInstanceTypeImpl#getComponentRef <em>Component Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentInstanceTypeImpl#getConfigurableElementValues <em>Configurable Element Values</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentInstanceTypeImpl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentInstanceTypeImpl extends MinimalEObjectImpl.Container implements ComponentInstanceType {
	/**
	 * The default value of the '{@link #getInstanceName() <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceName() <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected String instanceName = INSTANCE_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getComponentRef() <em>Component Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentRef()
	 * @generated
	 * @ordered
	 */
	protected LibraryRefType componentRef;

	/**
	 * The cached value of the '{@link #getConfigurableElementValues() <em>Configurable Element Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurableElementValues()
	 * @generated
	 * @ordered
	 */
	protected ConfigurableElementValuesType configurableElementValues;

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
	protected ComponentInstanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getComponentInstanceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceName() {
		return instanceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceName(String newInstanceName) {
		String oldInstanceName = instanceName;
		instanceName = newInstanceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_INSTANCE_TYPE__INSTANCE_NAME, oldInstanceName, instanceName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_INSTANCE_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_INSTANCE_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryRefType getComponentRef() {
		return componentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentRef(LibraryRefType newComponentRef, NotificationChain msgs) {
		LibraryRefType oldComponentRef = componentRef;
		componentRef = newComponentRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_INSTANCE_TYPE__COMPONENT_REF, oldComponentRef, newComponentRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentRef(LibraryRefType newComponentRef) {
		if (newComponentRef != componentRef) {
			NotificationChain msgs = null;
			if (componentRef != null)
				msgs = ((InternalEObject)componentRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_INSTANCE_TYPE__COMPONENT_REF, null, msgs);
			if (newComponentRef != null)
				msgs = ((InternalEObject)newComponentRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_INSTANCE_TYPE__COMPONENT_REF, null, msgs);
			msgs = basicSetComponentRef(newComponentRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_INSTANCE_TYPE__COMPONENT_REF, newComponentRef, newComponentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurableElementValuesType getConfigurableElementValues() {
		return configurableElementValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurableElementValues(ConfigurableElementValuesType newConfigurableElementValues, NotificationChain msgs) {
		ConfigurableElementValuesType oldConfigurableElementValues = configurableElementValues;
		configurableElementValues = newConfigurableElementValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_INSTANCE_TYPE__CONFIGURABLE_ELEMENT_VALUES, oldConfigurableElementValues, newConfigurableElementValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurableElementValues(ConfigurableElementValuesType newConfigurableElementValues) {
		if (newConfigurableElementValues != configurableElementValues) {
			NotificationChain msgs = null;
			if (configurableElementValues != null)
				msgs = ((InternalEObject)configurableElementValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_INSTANCE_TYPE__CONFIGURABLE_ELEMENT_VALUES, null, msgs);
			if (newConfigurableElementValues != null)
				msgs = ((InternalEObject)newConfigurableElementValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_INSTANCE_TYPE__CONFIGURABLE_ELEMENT_VALUES, null, msgs);
			msgs = basicSetConfigurableElementValues(newConfigurableElementValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_INSTANCE_TYPE__CONFIGURABLE_ELEMENT_VALUES, newConfigurableElementValues, newConfigurableElementValues));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_INSTANCE_TYPE__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
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
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_INSTANCE_TYPE__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.COMPONENT_INSTANCE_TYPE__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.COMPONENT_INSTANCE_TYPE__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.COMPONENT_INSTANCE_TYPE__COMPONENT_REF:
				return basicSetComponentRef(null, msgs);
			case _2009Package.COMPONENT_INSTANCE_TYPE__CONFIGURABLE_ELEMENT_VALUES:
				return basicSetConfigurableElementValues(null, msgs);
			case _2009Package.COMPONENT_INSTANCE_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.COMPONENT_INSTANCE_TYPE__INSTANCE_NAME:
				return getInstanceName();
			case _2009Package.COMPONENT_INSTANCE_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case _2009Package.COMPONENT_INSTANCE_TYPE__DESCRIPTION:
				return getDescription();
			case _2009Package.COMPONENT_INSTANCE_TYPE__COMPONENT_REF:
				return getComponentRef();
			case _2009Package.COMPONENT_INSTANCE_TYPE__CONFIGURABLE_ELEMENT_VALUES:
				return getConfigurableElementValues();
			case _2009Package.COMPONENT_INSTANCE_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.COMPONENT_INSTANCE_TYPE__INSTANCE_NAME:
				setInstanceName((String)newValue);
				return;
			case _2009Package.COMPONENT_INSTANCE_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case _2009Package.COMPONENT_INSTANCE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _2009Package.COMPONENT_INSTANCE_TYPE__COMPONENT_REF:
				setComponentRef((LibraryRefType)newValue);
				return;
			case _2009Package.COMPONENT_INSTANCE_TYPE__CONFIGURABLE_ELEMENT_VALUES:
				setConfigurableElementValues((ConfigurableElementValuesType)newValue);
				return;
			case _2009Package.COMPONENT_INSTANCE_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.COMPONENT_INSTANCE_TYPE__INSTANCE_NAME:
				setInstanceName(INSTANCE_NAME_EDEFAULT);
				return;
			case _2009Package.COMPONENT_INSTANCE_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case _2009Package.COMPONENT_INSTANCE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _2009Package.COMPONENT_INSTANCE_TYPE__COMPONENT_REF:
				setComponentRef((LibraryRefType)null);
				return;
			case _2009Package.COMPONENT_INSTANCE_TYPE__CONFIGURABLE_ELEMENT_VALUES:
				setConfigurableElementValues((ConfigurableElementValuesType)null);
				return;
			case _2009Package.COMPONENT_INSTANCE_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.COMPONENT_INSTANCE_TYPE__INSTANCE_NAME:
				return INSTANCE_NAME_EDEFAULT == null ? instanceName != null : !INSTANCE_NAME_EDEFAULT.equals(instanceName);
			case _2009Package.COMPONENT_INSTANCE_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case _2009Package.COMPONENT_INSTANCE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _2009Package.COMPONENT_INSTANCE_TYPE__COMPONENT_REF:
				return componentRef != null;
			case _2009Package.COMPONENT_INSTANCE_TYPE__CONFIGURABLE_ELEMENT_VALUES:
				return configurableElementValues != null;
			case _2009Package.COMPONENT_INSTANCE_TYPE__VENDOR_EXTENSIONS:
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
		result.append(" (instanceName: ");
		result.append(instanceName);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ComponentInstanceTypeImpl
