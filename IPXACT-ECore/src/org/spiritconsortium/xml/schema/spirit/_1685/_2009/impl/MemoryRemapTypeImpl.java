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
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spiritconsortium.xml.schema.spirit._1685._2009.AddressBankType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.AddressBlockType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.MemoryRemapType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.SubspaceRefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Remap Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.MemoryRemapTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.MemoryRemapTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.MemoryRemapTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.MemoryRemapTypeImpl#getMemoryMap <em>Memory Map</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.MemoryRemapTypeImpl#getAddressBlock <em>Address Block</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.MemoryRemapTypeImpl#getBank <em>Bank</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.MemoryRemapTypeImpl#getSubspaceMap <em>Subspace Map</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.MemoryRemapTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.MemoryRemapTypeImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemoryRemapTypeImpl extends MinimalEObjectImpl.Container implements MemoryRemapType {
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
	 * The cached value of the '{@link #getMemoryMap() <em>Memory Map</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMap()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap memoryMap;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryRemapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getMemoryRemapType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.MEMORY_REMAP_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.MEMORY_REMAP_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.MEMORY_REMAP_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMemoryMap() {
		if (memoryMap == null) {
			memoryMap = new BasicFeatureMap(this, _2009Package.MEMORY_REMAP_TYPE__MEMORY_MAP);
		}
		return memoryMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressBlockType> getAddressBlock() {
		return getMemoryMap().list(_2009Package.eINSTANCE.getMemoryRemapType_AddressBlock());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressBankType> getBank() {
		return getMemoryMap().list(_2009Package.eINSTANCE.getMemoryRemapType_Bank());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubspaceRefType> getSubspaceMap() {
		return getMemoryMap().list(_2009Package.eINSTANCE.getMemoryRemapType_SubspaceMap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.MEMORY_REMAP_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.MEMORY_REMAP_TYPE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.MEMORY_REMAP_TYPE__MEMORY_MAP:
				return ((InternalEList<?>)getMemoryMap()).basicRemove(otherEnd, msgs);
			case _2009Package.MEMORY_REMAP_TYPE__ADDRESS_BLOCK:
				return ((InternalEList<?>)getAddressBlock()).basicRemove(otherEnd, msgs);
			case _2009Package.MEMORY_REMAP_TYPE__BANK:
				return ((InternalEList<?>)getBank()).basicRemove(otherEnd, msgs);
			case _2009Package.MEMORY_REMAP_TYPE__SUBSPACE_MAP:
				return ((InternalEList<?>)getSubspaceMap()).basicRemove(otherEnd, msgs);
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
			case _2009Package.MEMORY_REMAP_TYPE__NAME:
				return getName();
			case _2009Package.MEMORY_REMAP_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case _2009Package.MEMORY_REMAP_TYPE__DESCRIPTION:
				return getDescription();
			case _2009Package.MEMORY_REMAP_TYPE__MEMORY_MAP:
				if (coreType) return getMemoryMap();
				return ((FeatureMap.Internal)getMemoryMap()).getWrapper();
			case _2009Package.MEMORY_REMAP_TYPE__ADDRESS_BLOCK:
				return getAddressBlock();
			case _2009Package.MEMORY_REMAP_TYPE__BANK:
				return getBank();
			case _2009Package.MEMORY_REMAP_TYPE__SUBSPACE_MAP:
				return getSubspaceMap();
			case _2009Package.MEMORY_REMAP_TYPE__ID:
				return getId();
			case _2009Package.MEMORY_REMAP_TYPE__STATE:
				return getState();
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
			case _2009Package.MEMORY_REMAP_TYPE__NAME:
				setName((String)newValue);
				return;
			case _2009Package.MEMORY_REMAP_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case _2009Package.MEMORY_REMAP_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _2009Package.MEMORY_REMAP_TYPE__MEMORY_MAP:
				((FeatureMap.Internal)getMemoryMap()).set(newValue);
				return;
			case _2009Package.MEMORY_REMAP_TYPE__ADDRESS_BLOCK:
				getAddressBlock().clear();
				getAddressBlock().addAll((Collection<? extends AddressBlockType>)newValue);
				return;
			case _2009Package.MEMORY_REMAP_TYPE__BANK:
				getBank().clear();
				getBank().addAll((Collection<? extends AddressBankType>)newValue);
				return;
			case _2009Package.MEMORY_REMAP_TYPE__SUBSPACE_MAP:
				getSubspaceMap().clear();
				getSubspaceMap().addAll((Collection<? extends SubspaceRefType>)newValue);
				return;
			case _2009Package.MEMORY_REMAP_TYPE__ID:
				setId((String)newValue);
				return;
			case _2009Package.MEMORY_REMAP_TYPE__STATE:
				setState((String)newValue);
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
			case _2009Package.MEMORY_REMAP_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _2009Package.MEMORY_REMAP_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case _2009Package.MEMORY_REMAP_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _2009Package.MEMORY_REMAP_TYPE__MEMORY_MAP:
				getMemoryMap().clear();
				return;
			case _2009Package.MEMORY_REMAP_TYPE__ADDRESS_BLOCK:
				getAddressBlock().clear();
				return;
			case _2009Package.MEMORY_REMAP_TYPE__BANK:
				getBank().clear();
				return;
			case _2009Package.MEMORY_REMAP_TYPE__SUBSPACE_MAP:
				getSubspaceMap().clear();
				return;
			case _2009Package.MEMORY_REMAP_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case _2009Package.MEMORY_REMAP_TYPE__STATE:
				setState(STATE_EDEFAULT);
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
			case _2009Package.MEMORY_REMAP_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _2009Package.MEMORY_REMAP_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case _2009Package.MEMORY_REMAP_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _2009Package.MEMORY_REMAP_TYPE__MEMORY_MAP:
				return memoryMap != null && !memoryMap.isEmpty();
			case _2009Package.MEMORY_REMAP_TYPE__ADDRESS_BLOCK:
				return !getAddressBlock().isEmpty();
			case _2009Package.MEMORY_REMAP_TYPE__BANK:
				return !getBank().isEmpty();
			case _2009Package.MEMORY_REMAP_TYPE__SUBSPACE_MAP:
				return !getSubspaceMap().isEmpty();
			case _2009Package.MEMORY_REMAP_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case _2009Package.MEMORY_REMAP_TYPE__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
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
		result.append(", memoryMap: ");
		result.append(memoryMap);
		result.append(", id: ");
		result.append(id);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //MemoryRemapTypeImpl
