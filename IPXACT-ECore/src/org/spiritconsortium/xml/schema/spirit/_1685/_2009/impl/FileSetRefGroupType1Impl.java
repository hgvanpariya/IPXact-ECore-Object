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

import org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetRefGroupType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetRefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Set Ref Group Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FileSetRefGroupType1Impl#getFileSetRef <em>File Set Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileSetRefGroupType1Impl extends MinimalEObjectImpl.Container implements FileSetRefGroupType1 {
	/**
	 * The cached value of the '{@link #getFileSetRef() <em>File Set Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSetRef()
	 * @generated
	 * @ordered
	 */
	protected EList<FileSetRefType> fileSetRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileSetRefGroupType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getFileSetRefGroupType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileSetRefType> getFileSetRef() {
		if (fileSetRef == null) {
			fileSetRef = new EObjectContainmentEList<FileSetRefType>(FileSetRefType.class, this, _2009Package.FILE_SET_REF_GROUP_TYPE1__FILE_SET_REF);
		}
		return fileSetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.FILE_SET_REF_GROUP_TYPE1__FILE_SET_REF:
				return ((InternalEList<?>)getFileSetRef()).basicRemove(otherEnd, msgs);
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
			case _2009Package.FILE_SET_REF_GROUP_TYPE1__FILE_SET_REF:
				return getFileSetRef();
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
			case _2009Package.FILE_SET_REF_GROUP_TYPE1__FILE_SET_REF:
				getFileSetRef().clear();
				getFileSetRef().addAll((Collection<? extends FileSetRefType>)newValue);
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
			case _2009Package.FILE_SET_REF_GROUP_TYPE1__FILE_SET_REF:
				getFileSetRef().clear();
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
			case _2009Package.FILE_SET_REF_GROUP_TYPE1__FILE_SET_REF:
				return fileSetRef != null && !fileSetRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FileSetRefGroupType1Impl
