/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorBusInterfaceType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.LibraryRefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ParametersType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.PortMapsType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstractor Bus Interface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorBusInterfaceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorBusInterfaceTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorBusInterfaceTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorBusInterfaceTypeImpl#getAbstractionType <em>Abstraction Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorBusInterfaceTypeImpl#getPortMaps <em>Port Maps</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorBusInterfaceTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorBusInterfaceTypeImpl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorBusInterfaceTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractorBusInterfaceTypeImpl extends MinimalEObjectImpl.Container implements AbstractorBusInterfaceType {
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
	 * The cached value of the '{@link #getAbstractionType() <em>Abstraction Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractionType()
	 * @generated
	 * @ordered
	 */
	protected LibraryRefType abstractionType;

	/**
	 * The cached value of the '{@link #getPortMaps() <em>Port Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortMaps()
	 * @generated
	 * @ordered
	 */
	protected PortMapsType1 portMaps;

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
	protected AbstractorBusInterfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getAbstractorBusInterfaceType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__ABSTRACTION_TYPE, oldAbstractionType, newAbstractionType);
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
				msgs = ((InternalEObject)abstractionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__ABSTRACTION_TYPE, null, msgs);
			if (newAbstractionType != null)
				msgs = ((InternalEObject)newAbstractionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__ABSTRACTION_TYPE, null, msgs);
			msgs = basicSetAbstractionType(newAbstractionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__ABSTRACTION_TYPE, newAbstractionType, newAbstractionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortMapsType1 getPortMaps() {
		return portMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortMaps(PortMapsType1 newPortMaps, NotificationChain msgs) {
		PortMapsType1 oldPortMaps = portMaps;
		portMaps = newPortMaps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__PORT_MAPS, oldPortMaps, newPortMaps);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortMaps(PortMapsType1 newPortMaps) {
		if (newPortMaps != portMaps) {
			NotificationChain msgs = null;
			if (portMaps != null)
				msgs = ((InternalEObject)portMaps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__PORT_MAPS, null, msgs);
			if (newPortMaps != null)
				msgs = ((InternalEObject)newPortMaps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__PORT_MAPS, null, msgs);
			msgs = basicSetPortMaps(newPortMaps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__PORT_MAPS, newPortMaps, newPortMaps));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__PARAMETERS, oldParameters, newParameters);
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
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__PARAMETERS, newParameters, newParameters));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
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
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__ANY_ATTRIBUTE);
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
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__ABSTRACTION_TYPE:
				return basicSetAbstractionType(null, msgs);
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__PORT_MAPS:
				return basicSetPortMaps(null, msgs);
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__PARAMETERS:
				return basicSetParameters(null, msgs);
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__VENDOR_EXTENSIONS:
				return basicSetVendorExtensions(null, msgs);
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__ANY_ATTRIBUTE:
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
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__NAME:
				return getName();
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__DESCRIPTION:
				return getDescription();
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__ABSTRACTION_TYPE:
				return getAbstractionType();
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__PORT_MAPS:
				return getPortMaps();
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__PARAMETERS:
				return getParameters();
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__VENDOR_EXTENSIONS:
				return getVendorExtensions();
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__ANY_ATTRIBUTE:
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
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__NAME:
				setName((String)newValue);
				return;
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__ABSTRACTION_TYPE:
				setAbstractionType((LibraryRefType)newValue);
				return;
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__PORT_MAPS:
				setPortMaps((PortMapsType1)newValue);
				return;
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__PARAMETERS:
				setParameters((ParametersType1)newValue);
				return;
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)newValue);
				return;
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__ANY_ATTRIBUTE:
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
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__ABSTRACTION_TYPE:
				setAbstractionType((LibraryRefType)null);
				return;
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__PORT_MAPS:
				setPortMaps((PortMapsType1)null);
				return;
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__PARAMETERS:
				setParameters((ParametersType1)null);
				return;
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)null);
				return;
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__ANY_ATTRIBUTE:
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
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__ABSTRACTION_TYPE:
				return abstractionType != null;
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__PORT_MAPS:
				return portMaps != null;
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__PARAMETERS:
				return parameters != null;
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__VENDOR_EXTENSIONS:
				return vendorExtensions != null;
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE__ANY_ATTRIBUTE:
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
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //AbstractorBusInterfaceTypeImpl
