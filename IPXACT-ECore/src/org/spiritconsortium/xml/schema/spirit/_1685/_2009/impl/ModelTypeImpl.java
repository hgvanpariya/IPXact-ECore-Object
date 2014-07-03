/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.ModelParametersType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ModelType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.PortsType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ViewsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ModelTypeImpl#getViews <em>Views</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ModelTypeImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ModelTypeImpl#getModelParameters <em>Model Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelTypeImpl extends MinimalEObjectImpl.Container implements ModelType {
	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected ViewsType views;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected PortsType1 ports;

	/**
	 * The cached value of the '{@link #getModelParameters() <em>Model Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelParameters()
	 * @generated
	 * @ordered
	 */
	protected ModelParametersType modelParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getModelType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsType getViews() {
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViews(ViewsType newViews, NotificationChain msgs) {
		ViewsType oldViews = views;
		views = newViews;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.MODEL_TYPE__VIEWS, oldViews, newViews);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViews(ViewsType newViews) {
		if (newViews != views) {
			NotificationChain msgs = null;
			if (views != null)
				msgs = ((InternalEObject)views).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.MODEL_TYPE__VIEWS, null, msgs);
			if (newViews != null)
				msgs = ((InternalEObject)newViews).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.MODEL_TYPE__VIEWS, null, msgs);
			msgs = basicSetViews(newViews, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.MODEL_TYPE__VIEWS, newViews, newViews));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsType1 getPorts() {
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPorts(PortsType1 newPorts, NotificationChain msgs) {
		PortsType1 oldPorts = ports;
		ports = newPorts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.MODEL_TYPE__PORTS, oldPorts, newPorts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorts(PortsType1 newPorts) {
		if (newPorts != ports) {
			NotificationChain msgs = null;
			if (ports != null)
				msgs = ((InternalEObject)ports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.MODEL_TYPE__PORTS, null, msgs);
			if (newPorts != null)
				msgs = ((InternalEObject)newPorts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.MODEL_TYPE__PORTS, null, msgs);
			msgs = basicSetPorts(newPorts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.MODEL_TYPE__PORTS, newPorts, newPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelParametersType getModelParameters() {
		return modelParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelParameters(ModelParametersType newModelParameters, NotificationChain msgs) {
		ModelParametersType oldModelParameters = modelParameters;
		modelParameters = newModelParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.MODEL_TYPE__MODEL_PARAMETERS, oldModelParameters, newModelParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelParameters(ModelParametersType newModelParameters) {
		if (newModelParameters != modelParameters) {
			NotificationChain msgs = null;
			if (modelParameters != null)
				msgs = ((InternalEObject)modelParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.MODEL_TYPE__MODEL_PARAMETERS, null, msgs);
			if (newModelParameters != null)
				msgs = ((InternalEObject)newModelParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.MODEL_TYPE__MODEL_PARAMETERS, null, msgs);
			msgs = basicSetModelParameters(newModelParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.MODEL_TYPE__MODEL_PARAMETERS, newModelParameters, newModelParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.MODEL_TYPE__VIEWS:
				return basicSetViews(null, msgs);
			case _2009Package.MODEL_TYPE__PORTS:
				return basicSetPorts(null, msgs);
			case _2009Package.MODEL_TYPE__MODEL_PARAMETERS:
				return basicSetModelParameters(null, msgs);
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
			case _2009Package.MODEL_TYPE__VIEWS:
				return getViews();
			case _2009Package.MODEL_TYPE__PORTS:
				return getPorts();
			case _2009Package.MODEL_TYPE__MODEL_PARAMETERS:
				return getModelParameters();
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
			case _2009Package.MODEL_TYPE__VIEWS:
				setViews((ViewsType)newValue);
				return;
			case _2009Package.MODEL_TYPE__PORTS:
				setPorts((PortsType1)newValue);
				return;
			case _2009Package.MODEL_TYPE__MODEL_PARAMETERS:
				setModelParameters((ModelParametersType)newValue);
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
			case _2009Package.MODEL_TYPE__VIEWS:
				setViews((ViewsType)null);
				return;
			case _2009Package.MODEL_TYPE__PORTS:
				setPorts((PortsType1)null);
				return;
			case _2009Package.MODEL_TYPE__MODEL_PARAMETERS:
				setModelParameters((ModelParametersType)null);
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
			case _2009Package.MODEL_TYPE__VIEWS:
				return views != null;
			case _2009Package.MODEL_TYPE__PORTS:
				return ports != null;
			case _2009Package.MODEL_TYPE__MODEL_PARAMETERS:
				return modelParameters != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelTypeImpl
