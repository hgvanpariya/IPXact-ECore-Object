/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.FileTypeType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.SourceFileType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.SourceNameType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source File Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.SourceFileTypeImpl#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.SourceFileTypeImpl#getFileType <em>File Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.SourceFileTypeImpl#getUserFileType <em>User File Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceFileTypeImpl extends MinimalEObjectImpl.Container implements SourceFileType {
	/**
	 * The cached value of the '{@link #getSourceName() <em>Source Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceName()
	 * @generated
	 * @ordered
	 */
	protected SourceNameType sourceName;

	/**
	 * The default value of the '{@link #getFileType() <em>File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileType()
	 * @generated
	 * @ordered
	 */
	protected static final FileTypeType FILE_TYPE_EDEFAULT = FileTypeType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getFileType() <em>File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileType()
	 * @generated
	 * @ordered
	 */
	protected FileTypeType fileType = FILE_TYPE_EDEFAULT;

	/**
	 * This is true if the File Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fileTypeESet;

	/**
	 * The default value of the '{@link #getUserFileType() <em>User File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserFileType()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_FILE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserFileType() <em>User File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserFileType()
	 * @generated
	 * @ordered
	 */
	protected String userFileType = USER_FILE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceFileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getSourceFileType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceNameType getSourceName() {
		return sourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceName(SourceNameType newSourceName, NotificationChain msgs) {
		SourceNameType oldSourceName = sourceName;
		sourceName = newSourceName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.SOURCE_FILE_TYPE__SOURCE_NAME, oldSourceName, newSourceName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceName(SourceNameType newSourceName) {
		if (newSourceName != sourceName) {
			NotificationChain msgs = null;
			if (sourceName != null)
				msgs = ((InternalEObject)sourceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.SOURCE_FILE_TYPE__SOURCE_NAME, null, msgs);
			if (newSourceName != null)
				msgs = ((InternalEObject)newSourceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.SOURCE_FILE_TYPE__SOURCE_NAME, null, msgs);
			msgs = basicSetSourceName(newSourceName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.SOURCE_FILE_TYPE__SOURCE_NAME, newSourceName, newSourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileTypeType getFileType() {
		return fileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileType(FileTypeType newFileType) {
		FileTypeType oldFileType = fileType;
		fileType = newFileType == null ? FILE_TYPE_EDEFAULT : newFileType;
		boolean oldFileTypeESet = fileTypeESet;
		fileTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.SOURCE_FILE_TYPE__FILE_TYPE, oldFileType, fileType, !oldFileTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFileType() {
		FileTypeType oldFileType = fileType;
		boolean oldFileTypeESet = fileTypeESet;
		fileType = FILE_TYPE_EDEFAULT;
		fileTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.SOURCE_FILE_TYPE__FILE_TYPE, oldFileType, FILE_TYPE_EDEFAULT, oldFileTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFileType() {
		return fileTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserFileType() {
		return userFileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserFileType(String newUserFileType) {
		String oldUserFileType = userFileType;
		userFileType = newUserFileType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.SOURCE_FILE_TYPE__USER_FILE_TYPE, oldUserFileType, userFileType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.SOURCE_FILE_TYPE__SOURCE_NAME:
				return basicSetSourceName(null, msgs);
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
			case _2009Package.SOURCE_FILE_TYPE__SOURCE_NAME:
				return getSourceName();
			case _2009Package.SOURCE_FILE_TYPE__FILE_TYPE:
				return getFileType();
			case _2009Package.SOURCE_FILE_TYPE__USER_FILE_TYPE:
				return getUserFileType();
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
			case _2009Package.SOURCE_FILE_TYPE__SOURCE_NAME:
				setSourceName((SourceNameType)newValue);
				return;
			case _2009Package.SOURCE_FILE_TYPE__FILE_TYPE:
				setFileType((FileTypeType)newValue);
				return;
			case _2009Package.SOURCE_FILE_TYPE__USER_FILE_TYPE:
				setUserFileType((String)newValue);
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
			case _2009Package.SOURCE_FILE_TYPE__SOURCE_NAME:
				setSourceName((SourceNameType)null);
				return;
			case _2009Package.SOURCE_FILE_TYPE__FILE_TYPE:
				unsetFileType();
				return;
			case _2009Package.SOURCE_FILE_TYPE__USER_FILE_TYPE:
				setUserFileType(USER_FILE_TYPE_EDEFAULT);
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
			case _2009Package.SOURCE_FILE_TYPE__SOURCE_NAME:
				return sourceName != null;
			case _2009Package.SOURCE_FILE_TYPE__FILE_TYPE:
				return isSetFileType();
			case _2009Package.SOURCE_FILE_TYPE__USER_FILE_TYPE:
				return USER_FILE_TYPE_EDEFAULT == null ? userFileType != null : !USER_FILE_TYPE_EDEFAULT.equals(userFileType);
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
		result.append(" (fileType: ");
		if (fileTypeESet) result.append(fileType); else result.append("<unset>");
		result.append(", userFileType: ");
		result.append(userFileType);
		result.append(')');
		return result.toString();
	}

} //SourceFileTypeImpl
