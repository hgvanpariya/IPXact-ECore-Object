/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.ConfigurableElementValuesType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainConfigurationType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.LibraryRefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Chain Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorChainConfigurationTypeImpl#getGeneratorChainRef <em>Generator Chain Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.GeneratorChainConfigurationTypeImpl#getConfigurableElementValues <em>Configurable Element Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratorChainConfigurationTypeImpl extends MinimalEObjectImpl.Container implements GeneratorChainConfigurationType {
	/**
	 * The cached value of the '{@link #getGeneratorChainRef() <em>Generator Chain Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorChainRef()
	 * @generated
	 * @ordered
	 */
	protected LibraryRefType generatorChainRef;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorChainConfigurationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getGeneratorChainConfigurationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryRefType getGeneratorChainRef() {
		return generatorChainRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratorChainRef(LibraryRefType newGeneratorChainRef, NotificationChain msgs) {
		LibraryRefType oldGeneratorChainRef = generatorChainRef;
		generatorChainRef = newGeneratorChainRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_CHAIN_CONFIGURATION_TYPE__GENERATOR_CHAIN_REF, oldGeneratorChainRef, newGeneratorChainRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorChainRef(LibraryRefType newGeneratorChainRef) {
		if (newGeneratorChainRef != generatorChainRef) {
			NotificationChain msgs = null;
			if (generatorChainRef != null)
				msgs = ((InternalEObject)generatorChainRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.GENERATOR_CHAIN_CONFIGURATION_TYPE__GENERATOR_CHAIN_REF, null, msgs);
			if (newGeneratorChainRef != null)
				msgs = ((InternalEObject)newGeneratorChainRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.GENERATOR_CHAIN_CONFIGURATION_TYPE__GENERATOR_CHAIN_REF, null, msgs);
			msgs = basicSetGeneratorChainRef(newGeneratorChainRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_CHAIN_CONFIGURATION_TYPE__GENERATOR_CHAIN_REF, newGeneratorChainRef, newGeneratorChainRef));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_CHAIN_CONFIGURATION_TYPE__CONFIGURABLE_ELEMENT_VALUES, oldConfigurableElementValues, newConfigurableElementValues);
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
				msgs = ((InternalEObject)configurableElementValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.GENERATOR_CHAIN_CONFIGURATION_TYPE__CONFIGURABLE_ELEMENT_VALUES, null, msgs);
			if (newConfigurableElementValues != null)
				msgs = ((InternalEObject)newConfigurableElementValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.GENERATOR_CHAIN_CONFIGURATION_TYPE__CONFIGURABLE_ELEMENT_VALUES, null, msgs);
			msgs = basicSetConfigurableElementValues(newConfigurableElementValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.GENERATOR_CHAIN_CONFIGURATION_TYPE__CONFIGURABLE_ELEMENT_VALUES, newConfigurableElementValues, newConfigurableElementValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.GENERATOR_CHAIN_CONFIGURATION_TYPE__GENERATOR_CHAIN_REF:
				return basicSetGeneratorChainRef(null, msgs);
			case _2009Package.GENERATOR_CHAIN_CONFIGURATION_TYPE__CONFIGURABLE_ELEMENT_VALUES:
				return basicSetConfigurableElementValues(null, msgs);
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
			case _2009Package.GENERATOR_CHAIN_CONFIGURATION_TYPE__GENERATOR_CHAIN_REF:
				return getGeneratorChainRef();
			case _2009Package.GENERATOR_CHAIN_CONFIGURATION_TYPE__CONFIGURABLE_ELEMENT_VALUES:
				return getConfigurableElementValues();
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
			case _2009Package.GENERATOR_CHAIN_CONFIGURATION_TYPE__GENERATOR_CHAIN_REF:
				setGeneratorChainRef((LibraryRefType)newValue);
				return;
			case _2009Package.GENERATOR_CHAIN_CONFIGURATION_TYPE__CONFIGURABLE_ELEMENT_VALUES:
				setConfigurableElementValues((ConfigurableElementValuesType)newValue);
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
			case _2009Package.GENERATOR_CHAIN_CONFIGURATION_TYPE__GENERATOR_CHAIN_REF:
				setGeneratorChainRef((LibraryRefType)null);
				return;
			case _2009Package.GENERATOR_CHAIN_CONFIGURATION_TYPE__CONFIGURABLE_ELEMENT_VALUES:
				setConfigurableElementValues((ConfigurableElementValuesType)null);
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
			case _2009Package.GENERATOR_CHAIN_CONFIGURATION_TYPE__GENERATOR_CHAIN_REF:
				return generatorChainRef != null;
			case _2009Package.GENERATOR_CHAIN_CONFIGURATION_TYPE__CONFIGURABLE_ELEMENT_VALUES:
				return configurableElementValues != null;
		}
		return super.eIsSet(featureID);
	}

} //GeneratorChainConfigurationTypeImpl
