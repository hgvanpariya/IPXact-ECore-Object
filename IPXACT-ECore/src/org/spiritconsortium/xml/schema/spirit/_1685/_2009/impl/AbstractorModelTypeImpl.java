/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorModelType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ModelParametersType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.PortsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ViewsType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstractor Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorModelTypeImpl#getViews <em>Views</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorModelTypeImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AbstractorModelTypeImpl#getModelParameters <em>Model Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractorModelTypeImpl extends MinimalEObjectImpl.Container implements AbstractorModelType {
	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected ViewsType1 views;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected PortsType ports;

	/**
	 * The cached value of the '{@link #getModelParameters() <em>Model Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelParameters()
	 * @generated
	 * @ordered
	 */
	protected ModelParametersType1 modelParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractorModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getAbstractorModelType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsType1 getViews() {
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViews(ViewsType1 newViews, NotificationChain msgs) {
		ViewsType1 oldViews = views;
		views = newViews;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_MODEL_TYPE__VIEWS, oldViews, newViews);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViews(ViewsType1 newViews) {
		if (newViews != views) {
			NotificationChain msgs = null;
			if (views != null)
				msgs = ((InternalEObject)views).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_MODEL_TYPE__VIEWS, null, msgs);
			if (newViews != null)
				msgs = ((InternalEObject)newViews).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_MODEL_TYPE__VIEWS, null, msgs);
			msgs = basicSetViews(newViews, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_MODEL_TYPE__VIEWS, newViews, newViews));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsType getPorts() {
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPorts(PortsType newPorts, NotificationChain msgs) {
		PortsType oldPorts = ports;
		ports = newPorts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_MODEL_TYPE__PORTS, oldPorts, newPorts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorts(PortsType newPorts) {
		if (newPorts != ports) {
			NotificationChain msgs = null;
			if (ports != null)
				msgs = ((InternalEObject)ports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_MODEL_TYPE__PORTS, null, msgs);
			if (newPorts != null)
				msgs = ((InternalEObject)newPorts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_MODEL_TYPE__PORTS, null, msgs);
			msgs = basicSetPorts(newPorts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_MODEL_TYPE__PORTS, newPorts, newPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelParametersType1 getModelParameters() {
		return modelParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelParameters(ModelParametersType1 newModelParameters, NotificationChain msgs) {
		ModelParametersType1 oldModelParameters = modelParameters;
		modelParameters = newModelParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_MODEL_TYPE__MODEL_PARAMETERS, oldModelParameters, newModelParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelParameters(ModelParametersType1 newModelParameters) {
		if (newModelParameters != modelParameters) {
			NotificationChain msgs = null;
			if (modelParameters != null)
				msgs = ((InternalEObject)modelParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_MODEL_TYPE__MODEL_PARAMETERS, null, msgs);
			if (newModelParameters != null)
				msgs = ((InternalEObject)newModelParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ABSTRACTOR_MODEL_TYPE__MODEL_PARAMETERS, null, msgs);
			msgs = basicSetModelParameters(newModelParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ABSTRACTOR_MODEL_TYPE__MODEL_PARAMETERS, newModelParameters, newModelParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.ABSTRACTOR_MODEL_TYPE__VIEWS:
				return basicSetViews(null, msgs);
			case _2009Package.ABSTRACTOR_MODEL_TYPE__PORTS:
				return basicSetPorts(null, msgs);
			case _2009Package.ABSTRACTOR_MODEL_TYPE__MODEL_PARAMETERS:
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
			case _2009Package.ABSTRACTOR_MODEL_TYPE__VIEWS:
				return getViews();
			case _2009Package.ABSTRACTOR_MODEL_TYPE__PORTS:
				return getPorts();
			case _2009Package.ABSTRACTOR_MODEL_TYPE__MODEL_PARAMETERS:
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
			case _2009Package.ABSTRACTOR_MODEL_TYPE__VIEWS:
				setViews((ViewsType1)newValue);
				return;
			case _2009Package.ABSTRACTOR_MODEL_TYPE__PORTS:
				setPorts((PortsType)newValue);
				return;
			case _2009Package.ABSTRACTOR_MODEL_TYPE__MODEL_PARAMETERS:
				setModelParameters((ModelParametersType1)newValue);
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
			case _2009Package.ABSTRACTOR_MODEL_TYPE__VIEWS:
				setViews((ViewsType1)null);
				return;
			case _2009Package.ABSTRACTOR_MODEL_TYPE__PORTS:
				setPorts((PortsType)null);
				return;
			case _2009Package.ABSTRACTOR_MODEL_TYPE__MODEL_PARAMETERS:
				setModelParameters((ModelParametersType1)null);
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
			case _2009Package.ABSTRACTOR_MODEL_TYPE__VIEWS:
				return views != null;
			case _2009Package.ABSTRACTOR_MODEL_TYPE__PORTS:
				return ports != null;
			case _2009Package.ABSTRACTOR_MODEL_TYPE__MODEL_PARAMETERS:
				return modelParameters != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractorModelTypeImpl
