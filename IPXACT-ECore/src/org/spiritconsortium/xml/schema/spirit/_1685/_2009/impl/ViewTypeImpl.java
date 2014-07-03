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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetRefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.LanguageType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.LibraryRefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ParametersType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementRefsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ViewTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ViewTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ViewTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ViewTypeImpl#getEnvIdentifier <em>Env Identifier</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ViewTypeImpl#getHierarchyRef <em>Hierarchy Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ViewTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ViewTypeImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ViewTypeImpl#getDefaultFileBuilder <em>Default File Builder</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ViewTypeImpl#getFileSetRef <em>File Set Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ViewTypeImpl#getConstraintSetRef <em>Constraint Set Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ViewTypeImpl#getWhiteboxElementRefs <em>Whitebox Element Refs</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ViewTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.ViewTypeImpl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewTypeImpl extends MinimalEObjectImpl.Container implements ViewType {
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
	 * The cached value of the '{@link #getEnvIdentifier() <em>Env Identifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<String> envIdentifier;

	/**
	 * The cached value of the '{@link #getHierarchyRef() <em>Hierarchy Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchyRef()
	 * @generated
	 * @ordered
	 */
	protected LibraryRefType hierarchyRef;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected LanguageType language;

	/**
	 * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected String modelName = MODEL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultFileBuilder() <em>Default File Builder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFileBuilder()
	 * @generated
	 * @ordered
	 */
	protected EList<FileBuilderType> defaultFileBuilder;

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
	 * The cached value of the '{@link #getConstraintSetRef() <em>Constraint Set Ref</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintSetRef()
	 * @generated
	 * @ordered
	 */
	protected EList<String> constraintSetRef;

	/**
	 * The cached value of the '{@link #getWhiteboxElementRefs() <em>Whitebox Element Refs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhiteboxElementRefs()
	 * @generated
	 * @ordered
	 */
	protected WhiteboxElementRefsType whiteboxElementRefs;

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
	protected ViewTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getViewType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.VIEW_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.VIEW_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.VIEW_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEnvIdentifier() {
		if (envIdentifier == null) {
			envIdentifier = new EDataTypeEList<String>(String.class, this, _2009Package.VIEW_TYPE__ENV_IDENTIFIER);
		}
		return envIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryRefType getHierarchyRef() {
		return hierarchyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHierarchyRef(LibraryRefType newHierarchyRef, NotificationChain msgs) {
		LibraryRefType oldHierarchyRef = hierarchyRef;
		hierarchyRef = newHierarchyRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.VIEW_TYPE__HIERARCHY_REF, oldHierarchyRef, newHierarchyRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHierarchyRef(LibraryRefType newHierarchyRef) {
		if (newHierarchyRef != hierarchyRef) {
			NotificationChain msgs = null;
			if (hierarchyRef != null)
				msgs = ((InternalEObject)hierarchyRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.VIEW_TYPE__HIERARCHY_REF, null, msgs);
			if (newHierarchyRef != null)
				msgs = ((InternalEObject)newHierarchyRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.VIEW_TYPE__HIERARCHY_REF, null, msgs);
			msgs = basicSetHierarchyRef(newHierarchyRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.VIEW_TYPE__HIERARCHY_REF, newHierarchyRef, newHierarchyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageType getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(LanguageType newLanguage, NotificationChain msgs) {
		LanguageType oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.VIEW_TYPE__LANGUAGE, oldLanguage, newLanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(LanguageType newLanguage) {
		if (newLanguage != language) {
			NotificationChain msgs = null;
			if (language != null)
				msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.VIEW_TYPE__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.VIEW_TYPE__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.VIEW_TYPE__LANGUAGE, newLanguage, newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelName(String newModelName) {
		String oldModelName = modelName;
		modelName = newModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.VIEW_TYPE__MODEL_NAME, oldModelName, modelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileBuilderType> getDefaultFileBuilder() {
		if (defaultFileBuilder == null) {
			defaultFileBuilder = new EObjectContainmentEList<FileBuilderType>(FileBuilderType.class, this, _2009Package.VIEW_TYPE__DEFAULT_FILE_BUILDER);
		}
		return defaultFileBuilder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileSetRefType> getFileSetRef() {
		if (fileSetRef == null) {
			fileSetRef = new EObjectContainmentEList<FileSetRefType>(FileSetRefType.class, this, _2009Package.VIEW_TYPE__FILE_SET_REF);
		}
		return fileSetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConstraintSetRef() {
		if (constraintSetRef == null) {
			constraintSetRef = new EDataTypeEList<String>(String.class, this, _2009Package.VIEW_TYPE__CONSTRAINT_SET_REF);
		}
		return constraintSetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteboxElementRefsType getWhiteboxElementRefs() {
		return whiteboxElementRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhiteboxElementRefs(WhiteboxElementRefsType newWhiteboxElementRefs, NotificationChain msgs) {
		WhiteboxElementRefsType oldWhiteboxElementRefs = whiteboxElementRefs;
		whiteboxElementRefs = newWhiteboxElementRefs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.VIEW_TYPE__WHITEBOX_ELEMENT_REFS, oldWhiteboxElementRefs, newWhiteboxElementRefs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhiteboxElementRefs(WhiteboxElementRefsType newWhiteboxElementRefs) {
		if (newWhiteboxElementRefs != whiteboxElementRefs) {
			NotificationChain msgs = null;
			if (whiteboxElementRefs != null)
				msgs = ((InternalEObject)whiteboxElementRefs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.VIEW_TYPE__WHITEBOX_ELEMENT_REFS, null, msgs);
			if (newWhiteboxElementRefs != null)
				msgs = ((InternalEObject)newWhiteboxElementRefs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.VIEW_TYPE__WHITEBOX_ELEMENT_REFS, null, msgs);
			msgs = basicSetWhiteboxElementRefs(newWhiteboxElementRefs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.VIEW_TYPE__WHITEBOX_ELEMENT_REFS, newWhiteboxElementRefs, newWhiteboxElementRefs));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.VIEW_TYPE__PARAMETERS, oldParameters, newParameters);
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
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.VIEW_TYPE__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.VIEW_TYPE__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.VIEW_TYPE__PARAMETERS, newParameters, newParameters));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.VIEW_TYPE__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
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
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.VIEW_TYPE__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.VIEW_TYPE__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.VIEW_TYPE__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.VIEW_TYPE__HIERARCHY_REF:
				return basicSetHierarchyRef(null, msgs);
			case _2009Package.VIEW_TYPE__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case _2009Package.VIEW_TYPE__DEFAULT_FILE_BUILDER:
				return ((InternalEList<?>)getDefaultFileBuilder()).basicRemove(otherEnd, msgs);
			case _2009Package.VIEW_TYPE__FILE_SET_REF:
				return ((InternalEList<?>)getFileSetRef()).basicRemove(otherEnd, msgs);
			case _2009Package.VIEW_TYPE__WHITEBOX_ELEMENT_REFS:
				return basicSetWhiteboxElementRefs(null, msgs);
			case _2009Package.VIEW_TYPE__PARAMETERS:
				return basicSetParameters(null, msgs);
			case _2009Package.VIEW_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.VIEW_TYPE__NAME:
				return getName();
			case _2009Package.VIEW_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case _2009Package.VIEW_TYPE__DESCRIPTION:
				return getDescription();
			case _2009Package.VIEW_TYPE__ENV_IDENTIFIER:
				return getEnvIdentifier();
			case _2009Package.VIEW_TYPE__HIERARCHY_REF:
				return getHierarchyRef();
			case _2009Package.VIEW_TYPE__LANGUAGE:
				return getLanguage();
			case _2009Package.VIEW_TYPE__MODEL_NAME:
				return getModelName();
			case _2009Package.VIEW_TYPE__DEFAULT_FILE_BUILDER:
				return getDefaultFileBuilder();
			case _2009Package.VIEW_TYPE__FILE_SET_REF:
				return getFileSetRef();
			case _2009Package.VIEW_TYPE__CONSTRAINT_SET_REF:
				return getConstraintSetRef();
			case _2009Package.VIEW_TYPE__WHITEBOX_ELEMENT_REFS:
				return getWhiteboxElementRefs();
			case _2009Package.VIEW_TYPE__PARAMETERS:
				return getParameters();
			case _2009Package.VIEW_TYPE__VENDOR_EXTENSIONS:
				return getVendorExtensions();
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
			case _2009Package.VIEW_TYPE__NAME:
				setName((String)newValue);
				return;
			case _2009Package.VIEW_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case _2009Package.VIEW_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _2009Package.VIEW_TYPE__ENV_IDENTIFIER:
				getEnvIdentifier().clear();
				getEnvIdentifier().addAll((Collection<? extends String>)newValue);
				return;
			case _2009Package.VIEW_TYPE__HIERARCHY_REF:
				setHierarchyRef((LibraryRefType)newValue);
				return;
			case _2009Package.VIEW_TYPE__LANGUAGE:
				setLanguage((LanguageType)newValue);
				return;
			case _2009Package.VIEW_TYPE__MODEL_NAME:
				setModelName((String)newValue);
				return;
			case _2009Package.VIEW_TYPE__DEFAULT_FILE_BUILDER:
				getDefaultFileBuilder().clear();
				getDefaultFileBuilder().addAll((Collection<? extends FileBuilderType>)newValue);
				return;
			case _2009Package.VIEW_TYPE__FILE_SET_REF:
				getFileSetRef().clear();
				getFileSetRef().addAll((Collection<? extends FileSetRefType>)newValue);
				return;
			case _2009Package.VIEW_TYPE__CONSTRAINT_SET_REF:
				getConstraintSetRef().clear();
				getConstraintSetRef().addAll((Collection<? extends String>)newValue);
				return;
			case _2009Package.VIEW_TYPE__WHITEBOX_ELEMENT_REFS:
				setWhiteboxElementRefs((WhiteboxElementRefsType)newValue);
				return;
			case _2009Package.VIEW_TYPE__PARAMETERS:
				setParameters((ParametersType1)newValue);
				return;
			case _2009Package.VIEW_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.VIEW_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _2009Package.VIEW_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case _2009Package.VIEW_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _2009Package.VIEW_TYPE__ENV_IDENTIFIER:
				getEnvIdentifier().clear();
				return;
			case _2009Package.VIEW_TYPE__HIERARCHY_REF:
				setHierarchyRef((LibraryRefType)null);
				return;
			case _2009Package.VIEW_TYPE__LANGUAGE:
				setLanguage((LanguageType)null);
				return;
			case _2009Package.VIEW_TYPE__MODEL_NAME:
				setModelName(MODEL_NAME_EDEFAULT);
				return;
			case _2009Package.VIEW_TYPE__DEFAULT_FILE_BUILDER:
				getDefaultFileBuilder().clear();
				return;
			case _2009Package.VIEW_TYPE__FILE_SET_REF:
				getFileSetRef().clear();
				return;
			case _2009Package.VIEW_TYPE__CONSTRAINT_SET_REF:
				getConstraintSetRef().clear();
				return;
			case _2009Package.VIEW_TYPE__WHITEBOX_ELEMENT_REFS:
				setWhiteboxElementRefs((WhiteboxElementRefsType)null);
				return;
			case _2009Package.VIEW_TYPE__PARAMETERS:
				setParameters((ParametersType1)null);
				return;
			case _2009Package.VIEW_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.VIEW_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _2009Package.VIEW_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case _2009Package.VIEW_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _2009Package.VIEW_TYPE__ENV_IDENTIFIER:
				return envIdentifier != null && !envIdentifier.isEmpty();
			case _2009Package.VIEW_TYPE__HIERARCHY_REF:
				return hierarchyRef != null;
			case _2009Package.VIEW_TYPE__LANGUAGE:
				return language != null;
			case _2009Package.VIEW_TYPE__MODEL_NAME:
				return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
			case _2009Package.VIEW_TYPE__DEFAULT_FILE_BUILDER:
				return defaultFileBuilder != null && !defaultFileBuilder.isEmpty();
			case _2009Package.VIEW_TYPE__FILE_SET_REF:
				return fileSetRef != null && !fileSetRef.isEmpty();
			case _2009Package.VIEW_TYPE__CONSTRAINT_SET_REF:
				return constraintSetRef != null && !constraintSetRef.isEmpty();
			case _2009Package.VIEW_TYPE__WHITEBOX_ELEMENT_REFS:
				return whiteboxElementRefs != null;
			case _2009Package.VIEW_TYPE__PARAMETERS:
				return parameters != null;
			case _2009Package.VIEW_TYPE__VENDOR_EXTENSIONS:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", description: ");
		result.append(description);
		result.append(", envIdentifier: ");
		result.append(envIdentifier);
		result.append(", modelName: ");
		result.append(modelName);
		result.append(", constraintSetRef: ");
		result.append(constraintSetRef);
		result.append(')');
		return result.toString();
	}

} //ViewTypeImpl
