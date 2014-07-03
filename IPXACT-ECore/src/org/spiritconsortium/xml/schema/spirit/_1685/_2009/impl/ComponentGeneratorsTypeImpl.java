/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentGeneratorType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentGeneratorsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Generators Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ComponentGeneratorsTypeImpl#getComponentGenerator <em>Component Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentGeneratorsTypeImpl extends MinimalEObjectImpl.Container implements ComponentGeneratorsType {
	/**
	 * The cached value of the '{@link #getComponentGenerator() <em>Component Generator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentGenerator()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentGeneratorType> componentGenerator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentGeneratorsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getComponentGeneratorsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentGeneratorType> getComponentGenerator() {
		if (componentGenerator == null) {
			componentGenerator = new EObjectContainmentEList<ComponentGeneratorType>(ComponentGeneratorType.class, this, _2009Package.COMPONENT_GENERATORS_TYPE__COMPONENT_GENERATOR);
		}
		return componentGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.COMPONENT_GENERATORS_TYPE__COMPONENT_GENERATOR:
				return ((InternalEList<?>)getComponentGenerator()).basicRemove(otherEnd, msgs);
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
			case _2009Package.COMPONENT_GENERATORS_TYPE__COMPONENT_GENERATOR:
				return getComponentGenerator();
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
			case _2009Package.COMPONENT_GENERATORS_TYPE__COMPONENT_GENERATOR:
				getComponentGenerator().clear();
				getComponentGenerator().addAll((Collection<? extends ComponentGeneratorType>)newValue);
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
			case _2009Package.COMPONENT_GENERATORS_TYPE__COMPONENT_GENERATOR:
				getComponentGenerator().clear();
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
			case _2009Package.COMPONENT_GENERATORS_TYPE__COMPONENT_GENERATOR:
				return componentGenerator != null && !componentGenerator.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentGeneratorsTypeImpl
