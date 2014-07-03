/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.ApiTypeType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ParametersType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.PhaseType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.TransportMethodsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorType1Impl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorType1Impl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorType1Impl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorType1Impl#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorType1Impl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorType1Impl#getApiType <em>Api Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorType1Impl#getTransportMethods <em>Transport Methods</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorType1Impl#getGeneratorExe <em>Generator Exe</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorType1Impl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorType1Impl#isHidden <em>Hidden</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratorType1Impl extends MinimalEObjectImpl.Container implements GeneratorType1 {
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
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected PhaseType phase;

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
	 * The default value of the '{@link #getApiType() <em>Api Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiType()
	 * @generated
	 * @ordered
	 */
	protected static final ApiTypeType API_TYPE_EDEFAULT = ApiTypeType.TGI;

	/**
	 * The cached value of the '{@link #getApiType() <em>Api Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiType()
	 * @generated
	 * @ordered
	 */
	protected ApiTypeType apiType = API_TYPE_EDEFAULT;

	/**
	 * This is true if the Api Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean apiTypeESet;

	/**
	 * The cached value of the '{@link #getTransportMethods() <em>Transport Methods</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportMethods()
	 * @generated
	 * @ordered
	 */
	protected TransportMethodsType transportMethods;

	/**
	 * The default value of the '{@link #getGeneratorExe() <em>Generator Exe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorExe()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATOR_EXE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneratorExe() <em>Generator Exe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorExe()
	 * @generated
	 * @ordered
	 */
	protected String generatorExe = GENERATOR_EXE_EDEFAULT;

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
	protected GeneratorType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getGeneratorType1();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_TYPE1__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_TYPE1__DISPLAY_NAME, oldDisplayName, displayName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_TYPE1__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseType getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhase(PhaseType newPhase, NotificationChain msgs) {
		PhaseType oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_TYPE1__PHASE, oldPhase, newPhase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(PhaseType newPhase) {
		if (newPhase != phase) {
			NotificationChain msgs = null;
			if (phase != null)
				msgs = ((InternalEObject)phase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.GENERATOR_TYPE1__PHASE, null, msgs);
			if (newPhase != null)
				msgs = ((InternalEObject)newPhase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.GENERATOR_TYPE1__PHASE, null, msgs);
			msgs = basicSetPhase(newPhase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_TYPE1__PHASE, newPhase, newPhase));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_TYPE1__PARAMETERS, oldParameters, newParameters);
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
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.GENERATOR_TYPE1__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.GENERATOR_TYPE1__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_TYPE1__PARAMETERS, newParameters, newParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiTypeType getApiType() {
		return apiType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiType(ApiTypeType newApiType) {
		ApiTypeType oldApiType = apiType;
		apiType = newApiType == null ? API_TYPE_EDEFAULT : newApiType;
		boolean oldApiTypeESet = apiTypeESet;
		apiTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_TYPE1__API_TYPE, oldApiType, apiType, !oldApiTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApiType() {
		ApiTypeType oldApiType = apiType;
		boolean oldApiTypeESet = apiTypeESet;
		apiType = API_TYPE_EDEFAULT;
		apiTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.GENERATOR_TYPE1__API_TYPE, oldApiType, API_TYPE_EDEFAULT, oldApiTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApiType() {
		return apiTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportMethodsType getTransportMethods() {
		return transportMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransportMethods(TransportMethodsType newTransportMethods, NotificationChain msgs) {
		TransportMethodsType oldTransportMethods = transportMethods;
		transportMethods = newTransportMethods;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_TYPE1__TRANSPORT_METHODS, oldTransportMethods, newTransportMethods);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportMethods(TransportMethodsType newTransportMethods) {
		if (newTransportMethods != transportMethods) {
			NotificationChain msgs = null;
			if (transportMethods != null)
				msgs = ((InternalEObject)transportMethods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.GENERATOR_TYPE1__TRANSPORT_METHODS, null, msgs);
			if (newTransportMethods != null)
				msgs = ((InternalEObject)newTransportMethods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.GENERATOR_TYPE1__TRANSPORT_METHODS, null, msgs);
			msgs = basicSetTransportMethods(newTransportMethods, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_TYPE1__TRANSPORT_METHODS, newTransportMethods, newTransportMethods));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneratorExe() {
		return generatorExe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorExe(String newGeneratorExe) {
		String oldGeneratorExe = generatorExe;
		generatorExe = newGeneratorExe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_TYPE1__GENERATOR_EXE, oldGeneratorExe, generatorExe));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_TYPE1__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
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
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.GENERATOR_TYPE1__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.GENERATOR_TYPE1__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_TYPE1__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_TYPE1__HIDDEN, oldHidden, hidden, !oldHiddenESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.GENERATOR_TYPE1__HIDDEN, oldHidden, HIDDEN_EDEFAULT, oldHiddenESet));
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
			case _2009Package.GENERATOR_TYPE1__PHASE:
				return basicSetPhase(null, msgs);
			case _2009Package.GENERATOR_TYPE1__PARAMETERS:
				return basicSetParameters(null, msgs);
			case _2009Package.GENERATOR_TYPE1__TRANSPORT_METHODS:
				return basicSetTransportMethods(null, msgs);
			case _2009Package.GENERATOR_TYPE1__VENDOR_EXTENSIONS:
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
			case _2009Package.GENERATOR_TYPE1__NAME:
				return getName();
			case _2009Package.GENERATOR_TYPE1__DISPLAY_NAME:
				return getDisplayName();
			case _2009Package.GENERATOR_TYPE1__DESCRIPTION:
				return getDescription();
			case _2009Package.GENERATOR_TYPE1__PHASE:
				return getPhase();
			case _2009Package.GENERATOR_TYPE1__PARAMETERS:
				return getParameters();
			case _2009Package.GENERATOR_TYPE1__API_TYPE:
				return getApiType();
			case _2009Package.GENERATOR_TYPE1__TRANSPORT_METHODS:
				return getTransportMethods();
			case _2009Package.GENERATOR_TYPE1__GENERATOR_EXE:
				return getGeneratorExe();
			case _2009Package.GENERATOR_TYPE1__VENDOR_EXTENSIONS:
				return getVendorExtensions();
			case _2009Package.GENERATOR_TYPE1__HIDDEN:
				return isHidden();
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
			case _2009Package.GENERATOR_TYPE1__NAME:
				setName((String)newValue);
				return;
			case _2009Package.GENERATOR_TYPE1__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case _2009Package.GENERATOR_TYPE1__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _2009Package.GENERATOR_TYPE1__PHASE:
				setPhase((PhaseType)newValue);
				return;
			case _2009Package.GENERATOR_TYPE1__PARAMETERS:
				setParameters((ParametersType1)newValue);
				return;
			case _2009Package.GENERATOR_TYPE1__API_TYPE:
				setApiType((ApiTypeType)newValue);
				return;
			case _2009Package.GENERATOR_TYPE1__TRANSPORT_METHODS:
				setTransportMethods((TransportMethodsType)newValue);
				return;
			case _2009Package.GENERATOR_TYPE1__GENERATOR_EXE:
				setGeneratorExe((String)newValue);
				return;
			case _2009Package.GENERATOR_TYPE1__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)newValue);
				return;
			case _2009Package.GENERATOR_TYPE1__HIDDEN:
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
			case _2009Package.GENERATOR_TYPE1__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _2009Package.GENERATOR_TYPE1__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case _2009Package.GENERATOR_TYPE1__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _2009Package.GENERATOR_TYPE1__PHASE:
				setPhase((PhaseType)null);
				return;
			case _2009Package.GENERATOR_TYPE1__PARAMETERS:
				setParameters((ParametersType1)null);
				return;
			case _2009Package.GENERATOR_TYPE1__API_TYPE:
				unsetApiType();
				return;
			case _2009Package.GENERATOR_TYPE1__TRANSPORT_METHODS:
				setTransportMethods((TransportMethodsType)null);
				return;
			case _2009Package.GENERATOR_TYPE1__GENERATOR_EXE:
				setGeneratorExe(GENERATOR_EXE_EDEFAULT);
				return;
			case _2009Package.GENERATOR_TYPE1__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)null);
				return;
			case _2009Package.GENERATOR_TYPE1__HIDDEN:
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
			case _2009Package.GENERATOR_TYPE1__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _2009Package.GENERATOR_TYPE1__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case _2009Package.GENERATOR_TYPE1__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _2009Package.GENERATOR_TYPE1__PHASE:
				return phase != null;
			case _2009Package.GENERATOR_TYPE1__PARAMETERS:
				return parameters != null;
			case _2009Package.GENERATOR_TYPE1__API_TYPE:
				return isSetApiType();
			case _2009Package.GENERATOR_TYPE1__TRANSPORT_METHODS:
				return transportMethods != null;
			case _2009Package.GENERATOR_TYPE1__GENERATOR_EXE:
				return GENERATOR_EXE_EDEFAULT == null ? generatorExe != null : !GENERATOR_EXE_EDEFAULT.equals(generatorExe);
			case _2009Package.GENERATOR_TYPE1__VENDOR_EXTENSIONS:
				return vendorExtensions != null;
			case _2009Package.GENERATOR_TYPE1__HIDDEN:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", description: ");
		result.append(description);
		result.append(", apiType: ");
		if (apiTypeESet) result.append(apiType); else result.append("<unset>");
		result.append(", generatorExe: ");
		result.append(generatorExe);
		result.append(", hidden: ");
		if (hiddenESet) result.append(hidden); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GeneratorType1Impl
