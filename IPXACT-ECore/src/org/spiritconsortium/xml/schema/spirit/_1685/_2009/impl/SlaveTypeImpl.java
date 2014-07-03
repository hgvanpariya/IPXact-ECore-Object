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

import org.spiritconsortium.xml.schema.spirit._1685._2009.BridgeType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetRefGroupType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.MemoryMapRefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.SlaveType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slave Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.SlaveTypeImpl#getMemoryMapRef <em>Memory Map Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.SlaveTypeImpl#getBridge <em>Bridge</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.SlaveTypeImpl#getFileSetRefGroup <em>File Set Ref Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlaveTypeImpl extends MinimalEObjectImpl.Container implements SlaveType {
	/**
	 * The cached value of the '{@link #getMemoryMapRef() <em>Memory Map Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMapRef()
	 * @generated
	 * @ordered
	 */
	protected MemoryMapRefType memoryMapRef;

	/**
	 * The cached value of the '{@link #getBridge() <em>Bridge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridge()
	 * @generated
	 * @ordered
	 */
	protected EList<BridgeType> bridge;

	/**
	 * The cached value of the '{@link #getFileSetRefGroup() <em>File Set Ref Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSetRefGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<FileSetRefGroupType> fileSetRefGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlaveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getSlaveType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMapRefType getMemoryMapRef() {
		return memoryMapRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemoryMapRef(MemoryMapRefType newMemoryMapRef, NotificationChain msgs) {
		MemoryMapRefType oldMemoryMapRef = memoryMapRef;
		memoryMapRef = newMemoryMapRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.SLAVE_TYPE__MEMORY_MAP_REF, oldMemoryMapRef, newMemoryMapRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryMapRef(MemoryMapRefType newMemoryMapRef) {
		if (newMemoryMapRef != memoryMapRef) {
			NotificationChain msgs = null;
			if (memoryMapRef != null)
				msgs = ((InternalEObject)memoryMapRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.SLAVE_TYPE__MEMORY_MAP_REF, null, msgs);
			if (newMemoryMapRef != null)
				msgs = ((InternalEObject)newMemoryMapRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.SLAVE_TYPE__MEMORY_MAP_REF, null, msgs);
			msgs = basicSetMemoryMapRef(newMemoryMapRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.SLAVE_TYPE__MEMORY_MAP_REF, newMemoryMapRef, newMemoryMapRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BridgeType> getBridge() {
		if (bridge == null) {
			bridge = new EObjectContainmentEList<BridgeType>(BridgeType.class, this, _2009Package.SLAVE_TYPE__BRIDGE);
		}
		return bridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileSetRefGroupType> getFileSetRefGroup() {
		if (fileSetRefGroup == null) {
			fileSetRefGroup = new EObjectContainmentEList<FileSetRefGroupType>(FileSetRefGroupType.class, this, _2009Package.SLAVE_TYPE__FILE_SET_REF_GROUP);
		}
		return fileSetRefGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.SLAVE_TYPE__MEMORY_MAP_REF:
				return basicSetMemoryMapRef(null, msgs);
			case _2009Package.SLAVE_TYPE__BRIDGE:
				return ((InternalEList<?>)getBridge()).basicRemove(otherEnd, msgs);
			case _2009Package.SLAVE_TYPE__FILE_SET_REF_GROUP:
				return ((InternalEList<?>)getFileSetRefGroup()).basicRemove(otherEnd, msgs);
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
			case _2009Package.SLAVE_TYPE__MEMORY_MAP_REF:
				return getMemoryMapRef();
			case _2009Package.SLAVE_TYPE__BRIDGE:
				return getBridge();
			case _2009Package.SLAVE_TYPE__FILE_SET_REF_GROUP:
				return getFileSetRefGroup();
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
			case _2009Package.SLAVE_TYPE__MEMORY_MAP_REF:
				setMemoryMapRef((MemoryMapRefType)newValue);
				return;
			case _2009Package.SLAVE_TYPE__BRIDGE:
				getBridge().clear();
				getBridge().addAll((Collection<? extends BridgeType>)newValue);
				return;
			case _2009Package.SLAVE_TYPE__FILE_SET_REF_GROUP:
				getFileSetRefGroup().clear();
				getFileSetRefGroup().addAll((Collection<? extends FileSetRefGroupType>)newValue);
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
			case _2009Package.SLAVE_TYPE__MEMORY_MAP_REF:
				setMemoryMapRef((MemoryMapRefType)null);
				return;
			case _2009Package.SLAVE_TYPE__BRIDGE:
				getBridge().clear();
				return;
			case _2009Package.SLAVE_TYPE__FILE_SET_REF_GROUP:
				getFileSetRefGroup().clear();
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
			case _2009Package.SLAVE_TYPE__MEMORY_MAP_REF:
				return memoryMapRef != null;
			case _2009Package.SLAVE_TYPE__BRIDGE:
				return bridge != null && !bridge.isEmpty();
			case _2009Package.SLAVE_TYPE__FILE_SET_REF_GROUP:
				return fileSetRefGroup != null && !fileSetRefGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SlaveTypeImpl
