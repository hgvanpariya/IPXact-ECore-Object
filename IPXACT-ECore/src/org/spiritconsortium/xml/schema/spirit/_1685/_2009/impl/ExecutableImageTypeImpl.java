/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.ExecutableImageType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetRefGroupType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.LanguageToolsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.NameType2;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ParametersType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executable Image Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ExecutableImageTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ExecutableImageTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ExecutableImageTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ExecutableImageTypeImpl#getLanguageTools <em>Language Tools</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ExecutableImageTypeImpl#getFileSetRefGroup <em>File Set Ref Group</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ExecutableImageTypeImpl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ExecutableImageTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ExecutableImageTypeImpl#getImageType <em>Image Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutableImageTypeImpl extends MinimalEObjectImpl.Container implements ExecutableImageType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameType2 name;

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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected ParametersType1 parameters;

	/**
	 * The cached value of the '{@link #getLanguageTools() <em>Language Tools</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageTools()
	 * @generated
	 * @ordered
	 */
	protected LanguageToolsType languageTools;

	/**
	 * The cached value of the '{@link #getFileSetRefGroup() <em>File Set Ref Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSetRefGroup()
	 * @generated
	 * @ordered
	 */
	protected FileSetRefGroupType1 fileSetRefGroup;

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
	 * The default value of the '{@link #getImageType() <em>Image Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageType()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageType() <em>Image Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageType()
	 * @generated
	 * @ordered
	 */
	protected String imageType = IMAGE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutableImageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getExecutableImageType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType2 getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameType2 newName, NotificationChain msgs) {
		NameType2 oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.EXECUTABLE_IMAGE_TYPE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(NameType2 newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.EXECUTABLE_IMAGE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.EXECUTABLE_IMAGE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.EXECUTABLE_IMAGE_TYPE__NAME, newName, newName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.EXECUTABLE_IMAGE_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersType1 getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(ParametersType1 newParameters, NotificationChain msgs) {
		ParametersType1 oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.EXECUTABLE_IMAGE_TYPE__PARAMETERS, oldParameters, newParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(ParametersType1 newParameters) {
		if (newParameters != parameters) {
			NotificationChain msgs = null;
			if (parameters != null)
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.EXECUTABLE_IMAGE_TYPE__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.EXECUTABLE_IMAGE_TYPE__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.EXECUTABLE_IMAGE_TYPE__PARAMETERS, newParameters, newParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageToolsType getLanguageTools() {
		return languageTools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguageTools(LanguageToolsType newLanguageTools, NotificationChain msgs) {
		LanguageToolsType oldLanguageTools = languageTools;
		languageTools = newLanguageTools;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.EXECUTABLE_IMAGE_TYPE__LANGUAGE_TOOLS, oldLanguageTools, newLanguageTools);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageTools(LanguageToolsType newLanguageTools) {
		if (newLanguageTools != languageTools) {
			NotificationChain msgs = null;
			if (languageTools != null)
				msgs = ((InternalEObject)languageTools).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.EXECUTABLE_IMAGE_TYPE__LANGUAGE_TOOLS, null, msgs);
			if (newLanguageTools != null)
				msgs = ((InternalEObject)newLanguageTools).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.EXECUTABLE_IMAGE_TYPE__LANGUAGE_TOOLS, null, msgs);
			msgs = basicSetLanguageTools(newLanguageTools, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.EXECUTABLE_IMAGE_TYPE__LANGUAGE_TOOLS, newLanguageTools, newLanguageTools));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSetRefGroupType1 getFileSetRefGroup() {
		return fileSetRefGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileSetRefGroup(FileSetRefGroupType1 newFileSetRefGroup, NotificationChain msgs) {
		FileSetRefGroupType1 oldFileSetRefGroup = fileSetRefGroup;
		fileSetRefGroup = newFileSetRefGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.EXECUTABLE_IMAGE_TYPE__FILE_SET_REF_GROUP, oldFileSetRefGroup, newFileSetRefGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileSetRefGroup(FileSetRefGroupType1 newFileSetRefGroup) {
		if (newFileSetRefGroup != fileSetRefGroup) {
			NotificationChain msgs = null;
			if (fileSetRefGroup != null)
				msgs = ((InternalEObject)fileSetRefGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.EXECUTABLE_IMAGE_TYPE__FILE_SET_REF_GROUP, null, msgs);
			if (newFileSetRefGroup != null)
				msgs = ((InternalEObject)newFileSetRefGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.EXECUTABLE_IMAGE_TYPE__FILE_SET_REF_GROUP, null, msgs);
			msgs = basicSetFileSetRefGroup(newFileSetRefGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.EXECUTABLE_IMAGE_TYPE__FILE_SET_REF_GROUP, newFileSetRefGroup, newFileSetRefGroup));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.EXECUTABLE_IMAGE_TYPE__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
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
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.EXECUTABLE_IMAGE_TYPE__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.EXECUTABLE_IMAGE_TYPE__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.EXECUTABLE_IMAGE_TYPE__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.EXECUTABLE_IMAGE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageType() {
		return imageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageType(String newImageType) {
		String oldImageType = imageType;
		imageType = newImageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.EXECUTABLE_IMAGE_TYPE__IMAGE_TYPE, oldImageType, imageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.EXECUTABLE_IMAGE_TYPE__NAME:
				return basicSetName(null, msgs);
			case _2009Package.EXECUTABLE_IMAGE_TYPE__PARAMETERS:
				return basicSetParameters(null, msgs);
			case _2009Package.EXECUTABLE_IMAGE_TYPE__LANGUAGE_TOOLS:
				return basicSetLanguageTools(null, msgs);
			case _2009Package.EXECUTABLE_IMAGE_TYPE__FILE_SET_REF_GROUP:
				return basicSetFileSetRefGroup(null, msgs);
			case _2009Package.EXECUTABLE_IMAGE_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.EXECUTABLE_IMAGE_TYPE__NAME:
				return getName();
			case _2009Package.EXECUTABLE_IMAGE_TYPE__DESCRIPTION:
				return getDescription();
			case _2009Package.EXECUTABLE_IMAGE_TYPE__PARAMETERS:
				return getParameters();
			case _2009Package.EXECUTABLE_IMAGE_TYPE__LANGUAGE_TOOLS:
				return getLanguageTools();
			case _2009Package.EXECUTABLE_IMAGE_TYPE__FILE_SET_REF_GROUP:
				return getFileSetRefGroup();
			case _2009Package.EXECUTABLE_IMAGE_TYPE__VENDOR_EXTENSIONS:
				return getVendorExtensions();
			case _2009Package.EXECUTABLE_IMAGE_TYPE__ID:
				return getId();
			case _2009Package.EXECUTABLE_IMAGE_TYPE__IMAGE_TYPE:
				return getImageType();
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
			case _2009Package.EXECUTABLE_IMAGE_TYPE__NAME:
				setName((NameType2)newValue);
				return;
			case _2009Package.EXECUTABLE_IMAGE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _2009Package.EXECUTABLE_IMAGE_TYPE__PARAMETERS:
				setParameters((ParametersType1)newValue);
				return;
			case _2009Package.EXECUTABLE_IMAGE_TYPE__LANGUAGE_TOOLS:
				setLanguageTools((LanguageToolsType)newValue);
				return;
			case _2009Package.EXECUTABLE_IMAGE_TYPE__FILE_SET_REF_GROUP:
				setFileSetRefGroup((FileSetRefGroupType1)newValue);
				return;
			case _2009Package.EXECUTABLE_IMAGE_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)newValue);
				return;
			case _2009Package.EXECUTABLE_IMAGE_TYPE__ID:
				setId((String)newValue);
				return;
			case _2009Package.EXECUTABLE_IMAGE_TYPE__IMAGE_TYPE:
				setImageType((String)newValue);
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
			case _2009Package.EXECUTABLE_IMAGE_TYPE__NAME:
				setName((NameType2)null);
				return;
			case _2009Package.EXECUTABLE_IMAGE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _2009Package.EXECUTABLE_IMAGE_TYPE__PARAMETERS:
				setParameters((ParametersType1)null);
				return;
			case _2009Package.EXECUTABLE_IMAGE_TYPE__LANGUAGE_TOOLS:
				setLanguageTools((LanguageToolsType)null);
				return;
			case _2009Package.EXECUTABLE_IMAGE_TYPE__FILE_SET_REF_GROUP:
				setFileSetRefGroup((FileSetRefGroupType1)null);
				return;
			case _2009Package.EXECUTABLE_IMAGE_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)null);
				return;
			case _2009Package.EXECUTABLE_IMAGE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case _2009Package.EXECUTABLE_IMAGE_TYPE__IMAGE_TYPE:
				setImageType(IMAGE_TYPE_EDEFAULT);
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
			case _2009Package.EXECUTABLE_IMAGE_TYPE__NAME:
				return name != null;
			case _2009Package.EXECUTABLE_IMAGE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _2009Package.EXECUTABLE_IMAGE_TYPE__PARAMETERS:
				return parameters != null;
			case _2009Package.EXECUTABLE_IMAGE_TYPE__LANGUAGE_TOOLS:
				return languageTools != null;
			case _2009Package.EXECUTABLE_IMAGE_TYPE__FILE_SET_REF_GROUP:
				return fileSetRefGroup != null;
			case _2009Package.EXECUTABLE_IMAGE_TYPE__VENDOR_EXTENSIONS:
				return vendorExtensions != null;
			case _2009Package.EXECUTABLE_IMAGE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case _2009Package.EXECUTABLE_IMAGE_TYPE__IMAGE_TYPE:
				return IMAGE_TYPE_EDEFAULT == null ? imageType != null : !IMAGE_TYPE_EDEFAULT.equals(imageType);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", id: ");
		result.append(id);
		result.append(", imageType: ");
		result.append(imageType);
		result.append(')');
		return result.toString();
	}

} //ExecutableImageTypeImpl
