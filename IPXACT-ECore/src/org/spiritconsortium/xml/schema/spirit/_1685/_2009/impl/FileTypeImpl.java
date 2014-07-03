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
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spiritconsortium.xml.schema.spirit._1685._2009.BuildCommandType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.FileType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.FileTypeType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.IsIncludeFileType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.LogicalNameType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.NameType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.NameValuePairType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FileTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FileTypeImpl#getFileType <em>File Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FileTypeImpl#getFileType1 <em>File Type1</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FileTypeImpl#getUserFileType <em>User File Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FileTypeImpl#getIsIncludeFile <em>Is Include File</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FileTypeImpl#getLogicalName <em>Logical Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FileTypeImpl#getExportedName <em>Exported Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FileTypeImpl#getBuildCommand <em>Build Command</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FileTypeImpl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FileTypeImpl#getDefine <em>Define</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FileTypeImpl#getImageType <em>Image Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FileTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FileTypeImpl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FileTypeImpl#getFileId <em>File Id</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FileTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileTypeImpl extends MinimalEObjectImpl.Container implements FileType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameType1 name;

	/**
	 * The cached value of the '{@link #getFileType() <em>File Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileType()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap fileType;

	/**
	 * The cached value of the '{@link #getIsIncludeFile() <em>Is Include File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsIncludeFile()
	 * @generated
	 * @ordered
	 */
	protected IsIncludeFileType isIncludeFile;

	/**
	 * The cached value of the '{@link #getLogicalName() <em>Logical Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalName()
	 * @generated
	 * @ordered
	 */
	protected LogicalNameType logicalName;

	/**
	 * The cached value of the '{@link #getExportedName() <em>Exported Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportedName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> exportedName;

	/**
	 * The cached value of the '{@link #getBuildCommand() <em>Build Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildCommand()
	 * @generated
	 * @ordered
	 */
	protected BuildCommandType buildCommand;

	/**
	 * The cached value of the '{@link #getDependency() <em>Dependency</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dependency;

	/**
	 * The cached value of the '{@link #getDefine() <em>Define</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefine()
	 * @generated
	 * @ordered
	 */
	protected EList<NameValuePairType> define;

	/**
	 * The cached value of the '{@link #getImageType() <em>Image Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageType()
	 * @generated
	 * @ordered
	 */
	protected EList<String> imageType;

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
	 * The cached value of the '{@link #getVendorExtensions() <em>Vendor Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorExtensions()
	 * @generated
	 * @ordered
	 */
	protected VendorExtensionsType vendorExtensions;

	/**
	 * The default value of the '{@link #getFileId() <em>File Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileId()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileId() <em>File Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileId()
	 * @generated
	 * @ordered
	 */
	protected String fileId = FILE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getFileType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType1 getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameType1 newName, NotificationChain msgs) {
		NameType1 oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.FILE_TYPE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(NameType1 newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.FILE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.FILE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FILE_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getFileType() {
		if (fileType == null) {
			fileType = new BasicFeatureMap(this, _2009Package.FILE_TYPE__FILE_TYPE);
		}
		return fileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileTypeType> getFileType1() {
		return getFileType().list(_2009Package.eINSTANCE.getFileType_FileType1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUserFileType() {
		return getFileType().list(_2009Package.eINSTANCE.getFileType_UserFileType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsIncludeFileType getIsIncludeFile() {
		return isIncludeFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsIncludeFile(IsIncludeFileType newIsIncludeFile, NotificationChain msgs) {
		IsIncludeFileType oldIsIncludeFile = isIncludeFile;
		isIncludeFile = newIsIncludeFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.FILE_TYPE__IS_INCLUDE_FILE, oldIsIncludeFile, newIsIncludeFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIncludeFile(IsIncludeFileType newIsIncludeFile) {
		if (newIsIncludeFile != isIncludeFile) {
			NotificationChain msgs = null;
			if (isIncludeFile != null)
				msgs = ((InternalEObject)isIncludeFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.FILE_TYPE__IS_INCLUDE_FILE, null, msgs);
			if (newIsIncludeFile != null)
				msgs = ((InternalEObject)newIsIncludeFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.FILE_TYPE__IS_INCLUDE_FILE, null, msgs);
			msgs = basicSetIsIncludeFile(newIsIncludeFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FILE_TYPE__IS_INCLUDE_FILE, newIsIncludeFile, newIsIncludeFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalNameType getLogicalName() {
		return logicalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicalName(LogicalNameType newLogicalName, NotificationChain msgs) {
		LogicalNameType oldLogicalName = logicalName;
		logicalName = newLogicalName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.FILE_TYPE__LOGICAL_NAME, oldLogicalName, newLogicalName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalName(LogicalNameType newLogicalName) {
		if (newLogicalName != logicalName) {
			NotificationChain msgs = null;
			if (logicalName != null)
				msgs = ((InternalEObject)logicalName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.FILE_TYPE__LOGICAL_NAME, null, msgs);
			if (newLogicalName != null)
				msgs = ((InternalEObject)newLogicalName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.FILE_TYPE__LOGICAL_NAME, null, msgs);
			msgs = basicSetLogicalName(newLogicalName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FILE_TYPE__LOGICAL_NAME, newLogicalName, newLogicalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExportedName() {
		if (exportedName == null) {
			exportedName = new EDataTypeEList<String>(String.class, this, _2009Package.FILE_TYPE__EXPORTED_NAME);
		}
		return exportedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildCommandType getBuildCommand() {
		return buildCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuildCommand(BuildCommandType newBuildCommand, NotificationChain msgs) {
		BuildCommandType oldBuildCommand = buildCommand;
		buildCommand = newBuildCommand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.FILE_TYPE__BUILD_COMMAND, oldBuildCommand, newBuildCommand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildCommand(BuildCommandType newBuildCommand) {
		if (newBuildCommand != buildCommand) {
			NotificationChain msgs = null;
			if (buildCommand != null)
				msgs = ((InternalEObject)buildCommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.FILE_TYPE__BUILD_COMMAND, null, msgs);
			if (newBuildCommand != null)
				msgs = ((InternalEObject)newBuildCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.FILE_TYPE__BUILD_COMMAND, null, msgs);
			msgs = basicSetBuildCommand(newBuildCommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FILE_TYPE__BUILD_COMMAND, newBuildCommand, newBuildCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDependency() {
		if (dependency == null) {
			dependency = new EDataTypeEList<String>(String.class, this, _2009Package.FILE_TYPE__DEPENDENCY);
		}
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NameValuePairType> getDefine() {
		if (define == null) {
			define = new EObjectContainmentEList<NameValuePairType>(NameValuePairType.class, this, _2009Package.FILE_TYPE__DEFINE);
		}
		return define;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getImageType() {
		if (imageType == null) {
			imageType = new EDataTypeEList<String>(String.class, this, _2009Package.FILE_TYPE__IMAGE_TYPE);
		}
		return imageType;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FILE_TYPE__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.FILE_TYPE__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
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
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.FILE_TYPE__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.FILE_TYPE__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FILE_TYPE__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileId() {
		return fileId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileId(String newFileId) {
		String oldFileId = fileId;
		fileId = newFileId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FILE_TYPE__FILE_ID, oldFileId, fileId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _2009Package.FILE_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.FILE_TYPE__NAME:
				return basicSetName(null, msgs);
			case _2009Package.FILE_TYPE__FILE_TYPE:
				return ((InternalEList<?>)getFileType()).basicRemove(otherEnd, msgs);
			case _2009Package.FILE_TYPE__IS_INCLUDE_FILE:
				return basicSetIsIncludeFile(null, msgs);
			case _2009Package.FILE_TYPE__LOGICAL_NAME:
				return basicSetLogicalName(null, msgs);
			case _2009Package.FILE_TYPE__BUILD_COMMAND:
				return basicSetBuildCommand(null, msgs);
			case _2009Package.FILE_TYPE__DEFINE:
				return ((InternalEList<?>)getDefine()).basicRemove(otherEnd, msgs);
			case _2009Package.FILE_TYPE__VENDOR_EXTENSIONS:
				return basicSetVendorExtensions(null, msgs);
			case _2009Package.FILE_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case _2009Package.FILE_TYPE__NAME:
				return getName();
			case _2009Package.FILE_TYPE__FILE_TYPE:
				if (coreType) return getFileType();
				return ((FeatureMap.Internal)getFileType()).getWrapper();
			case _2009Package.FILE_TYPE__FILE_TYPE1:
				return getFileType1();
			case _2009Package.FILE_TYPE__USER_FILE_TYPE:
				return getUserFileType();
			case _2009Package.FILE_TYPE__IS_INCLUDE_FILE:
				return getIsIncludeFile();
			case _2009Package.FILE_TYPE__LOGICAL_NAME:
				return getLogicalName();
			case _2009Package.FILE_TYPE__EXPORTED_NAME:
				return getExportedName();
			case _2009Package.FILE_TYPE__BUILD_COMMAND:
				return getBuildCommand();
			case _2009Package.FILE_TYPE__DEPENDENCY:
				return getDependency();
			case _2009Package.FILE_TYPE__DEFINE:
				return getDefine();
			case _2009Package.FILE_TYPE__IMAGE_TYPE:
				return getImageType();
			case _2009Package.FILE_TYPE__DESCRIPTION:
				return getDescription();
			case _2009Package.FILE_TYPE__VENDOR_EXTENSIONS:
				return getVendorExtensions();
			case _2009Package.FILE_TYPE__FILE_ID:
				return getFileId();
			case _2009Package.FILE_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case _2009Package.FILE_TYPE__NAME:
				setName((NameType1)newValue);
				return;
			case _2009Package.FILE_TYPE__FILE_TYPE:
				((FeatureMap.Internal)getFileType()).set(newValue);
				return;
			case _2009Package.FILE_TYPE__FILE_TYPE1:
				getFileType1().clear();
				getFileType1().addAll((Collection<? extends FileTypeType>)newValue);
				return;
			case _2009Package.FILE_TYPE__USER_FILE_TYPE:
				getUserFileType().clear();
				getUserFileType().addAll((Collection<? extends String>)newValue);
				return;
			case _2009Package.FILE_TYPE__IS_INCLUDE_FILE:
				setIsIncludeFile((IsIncludeFileType)newValue);
				return;
			case _2009Package.FILE_TYPE__LOGICAL_NAME:
				setLogicalName((LogicalNameType)newValue);
				return;
			case _2009Package.FILE_TYPE__EXPORTED_NAME:
				getExportedName().clear();
				getExportedName().addAll((Collection<? extends String>)newValue);
				return;
			case _2009Package.FILE_TYPE__BUILD_COMMAND:
				setBuildCommand((BuildCommandType)newValue);
				return;
			case _2009Package.FILE_TYPE__DEPENDENCY:
				getDependency().clear();
				getDependency().addAll((Collection<? extends String>)newValue);
				return;
			case _2009Package.FILE_TYPE__DEFINE:
				getDefine().clear();
				getDefine().addAll((Collection<? extends NameValuePairType>)newValue);
				return;
			case _2009Package.FILE_TYPE__IMAGE_TYPE:
				getImageType().clear();
				getImageType().addAll((Collection<? extends String>)newValue);
				return;
			case _2009Package.FILE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _2009Package.FILE_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)newValue);
				return;
			case _2009Package.FILE_TYPE__FILE_ID:
				setFileId((String)newValue);
				return;
			case _2009Package.FILE_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case _2009Package.FILE_TYPE__NAME:
				setName((NameType1)null);
				return;
			case _2009Package.FILE_TYPE__FILE_TYPE:
				getFileType().clear();
				return;
			case _2009Package.FILE_TYPE__FILE_TYPE1:
				getFileType1().clear();
				return;
			case _2009Package.FILE_TYPE__USER_FILE_TYPE:
				getUserFileType().clear();
				return;
			case _2009Package.FILE_TYPE__IS_INCLUDE_FILE:
				setIsIncludeFile((IsIncludeFileType)null);
				return;
			case _2009Package.FILE_TYPE__LOGICAL_NAME:
				setLogicalName((LogicalNameType)null);
				return;
			case _2009Package.FILE_TYPE__EXPORTED_NAME:
				getExportedName().clear();
				return;
			case _2009Package.FILE_TYPE__BUILD_COMMAND:
				setBuildCommand((BuildCommandType)null);
				return;
			case _2009Package.FILE_TYPE__DEPENDENCY:
				getDependency().clear();
				return;
			case _2009Package.FILE_TYPE__DEFINE:
				getDefine().clear();
				return;
			case _2009Package.FILE_TYPE__IMAGE_TYPE:
				getImageType().clear();
				return;
			case _2009Package.FILE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _2009Package.FILE_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)null);
				return;
			case _2009Package.FILE_TYPE__FILE_ID:
				setFileId(FILE_ID_EDEFAULT);
				return;
			case _2009Package.FILE_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case _2009Package.FILE_TYPE__NAME:
				return name != null;
			case _2009Package.FILE_TYPE__FILE_TYPE:
				return fileType != null && !fileType.isEmpty();
			case _2009Package.FILE_TYPE__FILE_TYPE1:
				return !getFileType1().isEmpty();
			case _2009Package.FILE_TYPE__USER_FILE_TYPE:
				return !getUserFileType().isEmpty();
			case _2009Package.FILE_TYPE__IS_INCLUDE_FILE:
				return isIncludeFile != null;
			case _2009Package.FILE_TYPE__LOGICAL_NAME:
				return logicalName != null;
			case _2009Package.FILE_TYPE__EXPORTED_NAME:
				return exportedName != null && !exportedName.isEmpty();
			case _2009Package.FILE_TYPE__BUILD_COMMAND:
				return buildCommand != null;
			case _2009Package.FILE_TYPE__DEPENDENCY:
				return dependency != null && !dependency.isEmpty();
			case _2009Package.FILE_TYPE__DEFINE:
				return define != null && !define.isEmpty();
			case _2009Package.FILE_TYPE__IMAGE_TYPE:
				return imageType != null && !imageType.isEmpty();
			case _2009Package.FILE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _2009Package.FILE_TYPE__VENDOR_EXTENSIONS:
				return vendorExtensions != null;
			case _2009Package.FILE_TYPE__FILE_ID:
				return FILE_ID_EDEFAULT == null ? fileId != null : !FILE_ID_EDEFAULT.equals(fileId);
			case _2009Package.FILE_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(fileType);
		result.append(", exportedName: ");
		result.append(exportedName);
		result.append(", dependency: ");
		result.append(dependency);
		result.append(", imageType: ");
		result.append(imageType);
		result.append(", description: ");
		result.append(description);
		result.append(", fileId: ");
		result.append(fileId);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //FileTypeImpl
