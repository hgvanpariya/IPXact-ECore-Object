/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import java.math.BigInteger;

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

import org.spiritconsortium.xml.schema.spirit._1685._2009.AddressSpaceType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ExecutableImageType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.LocalMemoryMapType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ParametersType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3;
import org.spiritconsortium.xml.schema.spirit._1685._2009.SegmentsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.WidthType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Space Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AddressSpaceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AddressSpaceTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AddressSpaceTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AddressSpaceTypeImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AddressSpaceTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AddressSpaceTypeImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AddressSpaceTypeImpl#getAddressUnitBits <em>Address Unit Bits</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AddressSpaceTypeImpl#getExecutableImage <em>Executable Image</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AddressSpaceTypeImpl#getLocalMemoryMap <em>Local Memory Map</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AddressSpaceTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.AddressSpaceTypeImpl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressSpaceTypeImpl extends MinimalEObjectImpl.Container implements AddressSpaceType {
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
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected RangeType3 range;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected WidthType width;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected SegmentsType segments;

	/**
	 * The default value of the '{@link #getAddressUnitBits() <em>Address Unit Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressUnitBits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ADDRESS_UNIT_BITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressUnitBits() <em>Address Unit Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressUnitBits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger addressUnitBits = ADDRESS_UNIT_BITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExecutableImage() <em>Executable Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutableImage()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableImageType> executableImage;

	/**
	 * The cached value of the '{@link #getLocalMemoryMap() <em>Local Memory Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalMemoryMap()
	 * @generated
	 * @ordered
	 */
	protected LocalMemoryMapType localMemoryMap;

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
	protected AddressSpaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getAddressSpaceType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ADDRESS_SPACE_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ADDRESS_SPACE_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ADDRESS_SPACE_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType3 getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(RangeType3 newRange, NotificationChain msgs) {
		RangeType3 oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ADDRESS_SPACE_TYPE__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(RangeType3 newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ADDRESS_SPACE_TYPE__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ADDRESS_SPACE_TYPE__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ADDRESS_SPACE_TYPE__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidthType getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWidth(WidthType newWidth, NotificationChain msgs) {
		WidthType oldWidth = width;
		width = newWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ADDRESS_SPACE_TYPE__WIDTH, oldWidth, newWidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(WidthType newWidth) {
		if (newWidth != width) {
			NotificationChain msgs = null;
			if (width != null)
				msgs = ((InternalEObject)width).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ADDRESS_SPACE_TYPE__WIDTH, null, msgs);
			if (newWidth != null)
				msgs = ((InternalEObject)newWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ADDRESS_SPACE_TYPE__WIDTH, null, msgs);
			msgs = basicSetWidth(newWidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ADDRESS_SPACE_TYPE__WIDTH, newWidth, newWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentsType getSegments() {
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegments(SegmentsType newSegments, NotificationChain msgs) {
		SegmentsType oldSegments = segments;
		segments = newSegments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ADDRESS_SPACE_TYPE__SEGMENTS, oldSegments, newSegments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSegments(SegmentsType newSegments) {
		if (newSegments != segments) {
			NotificationChain msgs = null;
			if (segments != null)
				msgs = ((InternalEObject)segments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ADDRESS_SPACE_TYPE__SEGMENTS, null, msgs);
			if (newSegments != null)
				msgs = ((InternalEObject)newSegments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ADDRESS_SPACE_TYPE__SEGMENTS, null, msgs);
			msgs = basicSetSegments(newSegments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ADDRESS_SPACE_TYPE__SEGMENTS, newSegments, newSegments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAddressUnitBits() {
		return addressUnitBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressUnitBits(BigInteger newAddressUnitBits) {
		BigInteger oldAddressUnitBits = addressUnitBits;
		addressUnitBits = newAddressUnitBits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ADDRESS_SPACE_TYPE__ADDRESS_UNIT_BITS, oldAddressUnitBits, addressUnitBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableImageType> getExecutableImage() {
		if (executableImage == null) {
			executableImage = new EObjectContainmentEList<ExecutableImageType>(ExecutableImageType.class, this, _2009Package.ADDRESS_SPACE_TYPE__EXECUTABLE_IMAGE);
		}
		return executableImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalMemoryMapType getLocalMemoryMap() {
		return localMemoryMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalMemoryMap(LocalMemoryMapType newLocalMemoryMap, NotificationChain msgs) {
		LocalMemoryMapType oldLocalMemoryMap = localMemoryMap;
		localMemoryMap = newLocalMemoryMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ADDRESS_SPACE_TYPE__LOCAL_MEMORY_MAP, oldLocalMemoryMap, newLocalMemoryMap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalMemoryMap(LocalMemoryMapType newLocalMemoryMap) {
		if (newLocalMemoryMap != localMemoryMap) {
			NotificationChain msgs = null;
			if (localMemoryMap != null)
				msgs = ((InternalEObject)localMemoryMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ADDRESS_SPACE_TYPE__LOCAL_MEMORY_MAP, null, msgs);
			if (newLocalMemoryMap != null)
				msgs = ((InternalEObject)newLocalMemoryMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ADDRESS_SPACE_TYPE__LOCAL_MEMORY_MAP, null, msgs);
			msgs = basicSetLocalMemoryMap(newLocalMemoryMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ADDRESS_SPACE_TYPE__LOCAL_MEMORY_MAP, newLocalMemoryMap, newLocalMemoryMap));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ADDRESS_SPACE_TYPE__PARAMETERS, oldParameters, newParameters);
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
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ADDRESS_SPACE_TYPE__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ADDRESS_SPACE_TYPE__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ADDRESS_SPACE_TYPE__PARAMETERS, newParameters, newParameters));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.ADDRESS_SPACE_TYPE__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
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
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.ADDRESS_SPACE_TYPE__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.ADDRESS_SPACE_TYPE__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.ADDRESS_SPACE_TYPE__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.ADDRESS_SPACE_TYPE__RANGE:
				return basicSetRange(null, msgs);
			case _2009Package.ADDRESS_SPACE_TYPE__WIDTH:
				return basicSetWidth(null, msgs);
			case _2009Package.ADDRESS_SPACE_TYPE__SEGMENTS:
				return basicSetSegments(null, msgs);
			case _2009Package.ADDRESS_SPACE_TYPE__EXECUTABLE_IMAGE:
				return ((InternalEList<?>)getExecutableImage()).basicRemove(otherEnd, msgs);
			case _2009Package.ADDRESS_SPACE_TYPE__LOCAL_MEMORY_MAP:
				return basicSetLocalMemoryMap(null, msgs);
			case _2009Package.ADDRESS_SPACE_TYPE__PARAMETERS:
				return basicSetParameters(null, msgs);
			case _2009Package.ADDRESS_SPACE_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.ADDRESS_SPACE_TYPE__NAME:
				return getName();
			case _2009Package.ADDRESS_SPACE_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case _2009Package.ADDRESS_SPACE_TYPE__DESCRIPTION:
				return getDescription();
			case _2009Package.ADDRESS_SPACE_TYPE__RANGE:
				return getRange();
			case _2009Package.ADDRESS_SPACE_TYPE__WIDTH:
				return getWidth();
			case _2009Package.ADDRESS_SPACE_TYPE__SEGMENTS:
				return getSegments();
			case _2009Package.ADDRESS_SPACE_TYPE__ADDRESS_UNIT_BITS:
				return getAddressUnitBits();
			case _2009Package.ADDRESS_SPACE_TYPE__EXECUTABLE_IMAGE:
				return getExecutableImage();
			case _2009Package.ADDRESS_SPACE_TYPE__LOCAL_MEMORY_MAP:
				return getLocalMemoryMap();
			case _2009Package.ADDRESS_SPACE_TYPE__PARAMETERS:
				return getParameters();
			case _2009Package.ADDRESS_SPACE_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.ADDRESS_SPACE_TYPE__NAME:
				setName((String)newValue);
				return;
			case _2009Package.ADDRESS_SPACE_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case _2009Package.ADDRESS_SPACE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _2009Package.ADDRESS_SPACE_TYPE__RANGE:
				setRange((RangeType3)newValue);
				return;
			case _2009Package.ADDRESS_SPACE_TYPE__WIDTH:
				setWidth((WidthType)newValue);
				return;
			case _2009Package.ADDRESS_SPACE_TYPE__SEGMENTS:
				setSegments((SegmentsType)newValue);
				return;
			case _2009Package.ADDRESS_SPACE_TYPE__ADDRESS_UNIT_BITS:
				setAddressUnitBits((BigInteger)newValue);
				return;
			case _2009Package.ADDRESS_SPACE_TYPE__EXECUTABLE_IMAGE:
				getExecutableImage().clear();
				getExecutableImage().addAll((Collection<? extends ExecutableImageType>)newValue);
				return;
			case _2009Package.ADDRESS_SPACE_TYPE__LOCAL_MEMORY_MAP:
				setLocalMemoryMap((LocalMemoryMapType)newValue);
				return;
			case _2009Package.ADDRESS_SPACE_TYPE__PARAMETERS:
				setParameters((ParametersType1)newValue);
				return;
			case _2009Package.ADDRESS_SPACE_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.ADDRESS_SPACE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _2009Package.ADDRESS_SPACE_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case _2009Package.ADDRESS_SPACE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _2009Package.ADDRESS_SPACE_TYPE__RANGE:
				setRange((RangeType3)null);
				return;
			case _2009Package.ADDRESS_SPACE_TYPE__WIDTH:
				setWidth((WidthType)null);
				return;
			case _2009Package.ADDRESS_SPACE_TYPE__SEGMENTS:
				setSegments((SegmentsType)null);
				return;
			case _2009Package.ADDRESS_SPACE_TYPE__ADDRESS_UNIT_BITS:
				setAddressUnitBits(ADDRESS_UNIT_BITS_EDEFAULT);
				return;
			case _2009Package.ADDRESS_SPACE_TYPE__EXECUTABLE_IMAGE:
				getExecutableImage().clear();
				return;
			case _2009Package.ADDRESS_SPACE_TYPE__LOCAL_MEMORY_MAP:
				setLocalMemoryMap((LocalMemoryMapType)null);
				return;
			case _2009Package.ADDRESS_SPACE_TYPE__PARAMETERS:
				setParameters((ParametersType1)null);
				return;
			case _2009Package.ADDRESS_SPACE_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.ADDRESS_SPACE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _2009Package.ADDRESS_SPACE_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case _2009Package.ADDRESS_SPACE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _2009Package.ADDRESS_SPACE_TYPE__RANGE:
				return range != null;
			case _2009Package.ADDRESS_SPACE_TYPE__WIDTH:
				return width != null;
			case _2009Package.ADDRESS_SPACE_TYPE__SEGMENTS:
				return segments != null;
			case _2009Package.ADDRESS_SPACE_TYPE__ADDRESS_UNIT_BITS:
				return ADDRESS_UNIT_BITS_EDEFAULT == null ? addressUnitBits != null : !ADDRESS_UNIT_BITS_EDEFAULT.equals(addressUnitBits);
			case _2009Package.ADDRESS_SPACE_TYPE__EXECUTABLE_IMAGE:
				return executableImage != null && !executableImage.isEmpty();
			case _2009Package.ADDRESS_SPACE_TYPE__LOCAL_MEMORY_MAP:
				return localMemoryMap != null;
			case _2009Package.ADDRESS_SPACE_TYPE__PARAMETERS:
				return parameters != null;
			case _2009Package.ADDRESS_SPACE_TYPE__VENDOR_EXTENSIONS:
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
		result.append(", addressUnitBits: ");
		result.append(addressUnitBits);
		result.append(')');
		return result.toString();
	}

} //AddressSpaceTypeImpl
