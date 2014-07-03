/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.CommandType2;
import org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.FileTypeType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.FlagsType2;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ReplaceDefaultFlagsType2;
import org.spiritconsortium.xml.schema.spirit._1685._2009.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Builder Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FileBuilderType1Impl#getFileType <em>File Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FileBuilderType1Impl#getUserFileType <em>User File Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FileBuilderType1Impl#getCommand <em>Command</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FileBuilderType1Impl#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FileBuilderType1Impl#getReplaceDefaultFlags <em>Replace Default Flags</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FileBuilderType1Impl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileBuilderType1Impl extends MinimalEObjectImpl.Container implements FileBuilderType1 {
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
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected CommandType2 command;

	/**
	 * The cached value of the '{@link #getFlags() <em>Flags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected FlagsType2 flags;

	/**
	 * The cached value of the '{@link #getReplaceDefaultFlags() <em>Replace Default Flags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplaceDefaultFlags()
	 * @generated
	 * @ordered
	 */
	protected ReplaceDefaultFlagsType2 replaceDefaultFlags;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileBuilderType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getFileBuilderType1();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FILE_BUILDER_TYPE1__FILE_TYPE, oldFileType, fileType, !oldFileTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.FILE_BUILDER_TYPE1__FILE_TYPE, oldFileType, FILE_TYPE_EDEFAULT, oldFileTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FILE_BUILDER_TYPE1__USER_FILE_TYPE, oldUserFileType, userFileType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandType2 getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommand(CommandType2 newCommand, NotificationChain msgs) {
		CommandType2 oldCommand = command;
		command = newCommand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.FILE_BUILDER_TYPE1__COMMAND, oldCommand, newCommand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(CommandType2 newCommand) {
		if (newCommand != command) {
			NotificationChain msgs = null;
			if (command != null)
				msgs = ((InternalEObject)command).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.FILE_BUILDER_TYPE1__COMMAND, null, msgs);
			if (newCommand != null)
				msgs = ((InternalEObject)newCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.FILE_BUILDER_TYPE1__COMMAND, null, msgs);
			msgs = basicSetCommand(newCommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FILE_BUILDER_TYPE1__COMMAND, newCommand, newCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagsType2 getFlags() {
		return flags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlags(FlagsType2 newFlags, NotificationChain msgs) {
		FlagsType2 oldFlags = flags;
		flags = newFlags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.FILE_BUILDER_TYPE1__FLAGS, oldFlags, newFlags);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlags(FlagsType2 newFlags) {
		if (newFlags != flags) {
			NotificationChain msgs = null;
			if (flags != null)
				msgs = ((InternalEObject)flags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.FILE_BUILDER_TYPE1__FLAGS, null, msgs);
			if (newFlags != null)
				msgs = ((InternalEObject)newFlags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.FILE_BUILDER_TYPE1__FLAGS, null, msgs);
			msgs = basicSetFlags(newFlags, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FILE_BUILDER_TYPE1__FLAGS, newFlags, newFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceDefaultFlagsType2 getReplaceDefaultFlags() {
		return replaceDefaultFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplaceDefaultFlags(ReplaceDefaultFlagsType2 newReplaceDefaultFlags, NotificationChain msgs) {
		ReplaceDefaultFlagsType2 oldReplaceDefaultFlags = replaceDefaultFlags;
		replaceDefaultFlags = newReplaceDefaultFlags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.FILE_BUILDER_TYPE1__REPLACE_DEFAULT_FLAGS, oldReplaceDefaultFlags, newReplaceDefaultFlags);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplaceDefaultFlags(ReplaceDefaultFlagsType2 newReplaceDefaultFlags) {
		if (newReplaceDefaultFlags != replaceDefaultFlags) {
			NotificationChain msgs = null;
			if (replaceDefaultFlags != null)
				msgs = ((InternalEObject)replaceDefaultFlags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.FILE_BUILDER_TYPE1__REPLACE_DEFAULT_FLAGS, null, msgs);
			if (newReplaceDefaultFlags != null)
				msgs = ((InternalEObject)newReplaceDefaultFlags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.FILE_BUILDER_TYPE1__REPLACE_DEFAULT_FLAGS, null, msgs);
			msgs = basicSetReplaceDefaultFlags(newReplaceDefaultFlags, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FILE_BUILDER_TYPE1__REPLACE_DEFAULT_FLAGS, newReplaceDefaultFlags, newReplaceDefaultFlags));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.FILE_BUILDER_TYPE1__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
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
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.FILE_BUILDER_TYPE1__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.FILE_BUILDER_TYPE1__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FILE_BUILDER_TYPE1__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.FILE_BUILDER_TYPE1__COMMAND:
				return basicSetCommand(null, msgs);
			case _2009Package.FILE_BUILDER_TYPE1__FLAGS:
				return basicSetFlags(null, msgs);
			case _2009Package.FILE_BUILDER_TYPE1__REPLACE_DEFAULT_FLAGS:
				return basicSetReplaceDefaultFlags(null, msgs);
			case _2009Package.FILE_BUILDER_TYPE1__VENDOR_EXTENSIONS:
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
			case _2009Package.FILE_BUILDER_TYPE1__FILE_TYPE:
				return getFileType();
			case _2009Package.FILE_BUILDER_TYPE1__USER_FILE_TYPE:
				return getUserFileType();
			case _2009Package.FILE_BUILDER_TYPE1__COMMAND:
				return getCommand();
			case _2009Package.FILE_BUILDER_TYPE1__FLAGS:
				return getFlags();
			case _2009Package.FILE_BUILDER_TYPE1__REPLACE_DEFAULT_FLAGS:
				return getReplaceDefaultFlags();
			case _2009Package.FILE_BUILDER_TYPE1__VENDOR_EXTENSIONS:
				return getVendorExtensions();
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
			case _2009Package.FILE_BUILDER_TYPE1__FILE_TYPE:
				setFileType((FileTypeType)newValue);
				return;
			case _2009Package.FILE_BUILDER_TYPE1__USER_FILE_TYPE:
				setUserFileType((String)newValue);
				return;
			case _2009Package.FILE_BUILDER_TYPE1__COMMAND:
				setCommand((CommandType2)newValue);
				return;
			case _2009Package.FILE_BUILDER_TYPE1__FLAGS:
				setFlags((FlagsType2)newValue);
				return;
			case _2009Package.FILE_BUILDER_TYPE1__REPLACE_DEFAULT_FLAGS:
				setReplaceDefaultFlags((ReplaceDefaultFlagsType2)newValue);
				return;
			case _2009Package.FILE_BUILDER_TYPE1__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)newValue);
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
			case _2009Package.FILE_BUILDER_TYPE1__FILE_TYPE:
				unsetFileType();
				return;
			case _2009Package.FILE_BUILDER_TYPE1__USER_FILE_TYPE:
				setUserFileType(USER_FILE_TYPE_EDEFAULT);
				return;
			case _2009Package.FILE_BUILDER_TYPE1__COMMAND:
				setCommand((CommandType2)null);
				return;
			case _2009Package.FILE_BUILDER_TYPE1__FLAGS:
				setFlags((FlagsType2)null);
				return;
			case _2009Package.FILE_BUILDER_TYPE1__REPLACE_DEFAULT_FLAGS:
				setReplaceDefaultFlags((ReplaceDefaultFlagsType2)null);
				return;
			case _2009Package.FILE_BUILDER_TYPE1__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)null);
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
			case _2009Package.FILE_BUILDER_TYPE1__FILE_TYPE:
				return isSetFileType();
			case _2009Package.FILE_BUILDER_TYPE1__USER_FILE_TYPE:
				return USER_FILE_TYPE_EDEFAULT == null ? userFileType != null : !USER_FILE_TYPE_EDEFAULT.equals(userFileType);
			case _2009Package.FILE_BUILDER_TYPE1__COMMAND:
				return command != null;
			case _2009Package.FILE_BUILDER_TYPE1__FLAGS:
				return flags != null;
			case _2009Package.FILE_BUILDER_TYPE1__REPLACE_DEFAULT_FLAGS:
				return replaceDefaultFlags != null;
			case _2009Package.FILE_BUILDER_TYPE1__VENDOR_EXTENSIONS:
				return vendorExtensions != null;
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

} //FileBuilderType1Impl
