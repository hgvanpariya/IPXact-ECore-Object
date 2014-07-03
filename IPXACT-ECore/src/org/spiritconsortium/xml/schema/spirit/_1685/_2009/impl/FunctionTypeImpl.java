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

import org.spiritconsortium.xml.schema.spirit._1685._2009.ArgumentType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.DisabledType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.FunctionType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ReturnTypeType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.SourceFileType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FunctionTypeImpl#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FunctionTypeImpl#getFileRef <em>File Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FunctionTypeImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FunctionTypeImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FunctionTypeImpl#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FunctionTypeImpl#getSourceFile <em>Source File</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FunctionTypeImpl#isReplicate <em>Replicate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionTypeImpl extends MinimalEObjectImpl.Container implements FunctionType {
	/**
	 * The default value of the '{@link #getEntryPoint() <em>Entry Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRY_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntryPoint() <em>Entry Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected String entryPoint = ENTRY_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileRef() <em>File Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileRef()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileRef() <em>File Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileRef()
	 * @generated
	 * @ordered
	 */
	protected String fileRef = FILE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final ReturnTypeType RETURN_TYPE_EDEFAULT = ReturnTypeType.VOID;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected ReturnTypeType returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * This is true if the Return Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean returnTypeESet;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentType> argument;

	/**
	 * The cached value of the '{@link #getDisabled() <em>Disabled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabled()
	 * @generated
	 * @ordered
	 */
	protected DisabledType disabled;

	/**
	 * The cached value of the '{@link #getSourceFile() <em>Source File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFile()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceFileType> sourceFile;

	/**
	 * The default value of the '{@link #isReplicate() <em>Replicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReplicate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPLICATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReplicate() <em>Replicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReplicate()
	 * @generated
	 * @ordered
	 */
	protected boolean replicate = REPLICATE_EDEFAULT;

	/**
	 * This is true if the Replicate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean replicateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getFunctionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntryPoint() {
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryPoint(String newEntryPoint) {
		String oldEntryPoint = entryPoint;
		entryPoint = newEntryPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FUNCTION_TYPE__ENTRY_POINT, oldEntryPoint, entryPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileRef() {
		return fileRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileRef(String newFileRef) {
		String oldFileRef = fileRef;
		fileRef = newFileRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FUNCTION_TYPE__FILE_REF, oldFileRef, fileRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnTypeType getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(ReturnTypeType newReturnType) {
		ReturnTypeType oldReturnType = returnType;
		returnType = newReturnType == null ? RETURN_TYPE_EDEFAULT : newReturnType;
		boolean oldReturnTypeESet = returnTypeESet;
		returnTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FUNCTION_TYPE__RETURN_TYPE, oldReturnType, returnType, !oldReturnTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReturnType() {
		ReturnTypeType oldReturnType = returnType;
		boolean oldReturnTypeESet = returnTypeESet;
		returnType = RETURN_TYPE_EDEFAULT;
		returnTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.FUNCTION_TYPE__RETURN_TYPE, oldReturnType, RETURN_TYPE_EDEFAULT, oldReturnTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReturnType() {
		return returnTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentType> getArgument() {
		if (argument == null) {
			argument = new EObjectContainmentEList<ArgumentType>(ArgumentType.class, this, _2009Package.FUNCTION_TYPE__ARGUMENT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisabledType getDisabled() {
		return disabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisabled(DisabledType newDisabled, NotificationChain msgs) {
		DisabledType oldDisabled = disabled;
		disabled = newDisabled;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.FUNCTION_TYPE__DISABLED, oldDisabled, newDisabled);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(DisabledType newDisabled) {
		if (newDisabled != disabled) {
			NotificationChain msgs = null;
			if (disabled != null)
				msgs = ((InternalEObject)disabled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.FUNCTION_TYPE__DISABLED, null, msgs);
			if (newDisabled != null)
				msgs = ((InternalEObject)newDisabled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.FUNCTION_TYPE__DISABLED, null, msgs);
			msgs = basicSetDisabled(newDisabled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FUNCTION_TYPE__DISABLED, newDisabled, newDisabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceFileType> getSourceFile() {
		if (sourceFile == null) {
			sourceFile = new EObjectContainmentEList<SourceFileType>(SourceFileType.class, this, _2009Package.FUNCTION_TYPE__SOURCE_FILE);
		}
		return sourceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReplicate() {
		return replicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplicate(boolean newReplicate) {
		boolean oldReplicate = replicate;
		replicate = newReplicate;
		boolean oldReplicateESet = replicateESet;
		replicateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FUNCTION_TYPE__REPLICATE, oldReplicate, replicate, !oldReplicateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReplicate() {
		boolean oldReplicate = replicate;
		boolean oldReplicateESet = replicateESet;
		replicate = REPLICATE_EDEFAULT;
		replicateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.FUNCTION_TYPE__REPLICATE, oldReplicate, REPLICATE_EDEFAULT, oldReplicateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReplicate() {
		return replicateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.FUNCTION_TYPE__ARGUMENT:
				return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
			case _2009Package.FUNCTION_TYPE__DISABLED:
				return basicSetDisabled(null, msgs);
			case _2009Package.FUNCTION_TYPE__SOURCE_FILE:
				return ((InternalEList<?>)getSourceFile()).basicRemove(otherEnd, msgs);
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
			case _2009Package.FUNCTION_TYPE__ENTRY_POINT:
				return getEntryPoint();
			case _2009Package.FUNCTION_TYPE__FILE_REF:
				return getFileRef();
			case _2009Package.FUNCTION_TYPE__RETURN_TYPE:
				return getReturnType();
			case _2009Package.FUNCTION_TYPE__ARGUMENT:
				return getArgument();
			case _2009Package.FUNCTION_TYPE__DISABLED:
				return getDisabled();
			case _2009Package.FUNCTION_TYPE__SOURCE_FILE:
				return getSourceFile();
			case _2009Package.FUNCTION_TYPE__REPLICATE:
				return isReplicate();
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
			case _2009Package.FUNCTION_TYPE__ENTRY_POINT:
				setEntryPoint((String)newValue);
				return;
			case _2009Package.FUNCTION_TYPE__FILE_REF:
				setFileRef((String)newValue);
				return;
			case _2009Package.FUNCTION_TYPE__RETURN_TYPE:
				setReturnType((ReturnTypeType)newValue);
				return;
			case _2009Package.FUNCTION_TYPE__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends ArgumentType>)newValue);
				return;
			case _2009Package.FUNCTION_TYPE__DISABLED:
				setDisabled((DisabledType)newValue);
				return;
			case _2009Package.FUNCTION_TYPE__SOURCE_FILE:
				getSourceFile().clear();
				getSourceFile().addAll((Collection<? extends SourceFileType>)newValue);
				return;
			case _2009Package.FUNCTION_TYPE__REPLICATE:
				setReplicate((Boolean)newValue);
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
			case _2009Package.FUNCTION_TYPE__ENTRY_POINT:
				setEntryPoint(ENTRY_POINT_EDEFAULT);
				return;
			case _2009Package.FUNCTION_TYPE__FILE_REF:
				setFileRef(FILE_REF_EDEFAULT);
				return;
			case _2009Package.FUNCTION_TYPE__RETURN_TYPE:
				unsetReturnType();
				return;
			case _2009Package.FUNCTION_TYPE__ARGUMENT:
				getArgument().clear();
				return;
			case _2009Package.FUNCTION_TYPE__DISABLED:
				setDisabled((DisabledType)null);
				return;
			case _2009Package.FUNCTION_TYPE__SOURCE_FILE:
				getSourceFile().clear();
				return;
			case _2009Package.FUNCTION_TYPE__REPLICATE:
				unsetReplicate();
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
			case _2009Package.FUNCTION_TYPE__ENTRY_POINT:
				return ENTRY_POINT_EDEFAULT == null ? entryPoint != null : !ENTRY_POINT_EDEFAULT.equals(entryPoint);
			case _2009Package.FUNCTION_TYPE__FILE_REF:
				return FILE_REF_EDEFAULT == null ? fileRef != null : !FILE_REF_EDEFAULT.equals(fileRef);
			case _2009Package.FUNCTION_TYPE__RETURN_TYPE:
				return isSetReturnType();
			case _2009Package.FUNCTION_TYPE__ARGUMENT:
				return argument != null && !argument.isEmpty();
			case _2009Package.FUNCTION_TYPE__DISABLED:
				return disabled != null;
			case _2009Package.FUNCTION_TYPE__SOURCE_FILE:
				return sourceFile != null && !sourceFile.isEmpty();
			case _2009Package.FUNCTION_TYPE__REPLICATE:
				return isSetReplicate();
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
		result.append(" (entryPoint: ");
		result.append(entryPoint);
		result.append(", fileRef: ");
		result.append(fileRef);
		result.append(", returnType: ");
		if (returnTypeESet) result.append(returnType); else result.append("<unset>");
		result.append(", replicate: ");
		if (replicateESet) result.append(replicate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FunctionTypeImpl
