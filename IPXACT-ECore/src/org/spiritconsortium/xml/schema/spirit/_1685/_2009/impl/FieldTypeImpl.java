/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit._1685._2009.AccessType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.BitWidthType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.EnumeratedValuesType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ModifiedWriteValueType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ParametersType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ReadActionType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.TestableType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.WriteValueConstraintType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FieldTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FieldTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FieldTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FieldTypeImpl#getBitOffset <em>Bit Offset</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FieldTypeImpl#getTypeIdentifier <em>Type Identifier</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FieldTypeImpl#getBitWidth <em>Bit Width</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FieldTypeImpl#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FieldTypeImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FieldTypeImpl#getEnumeratedValues <em>Enumerated Values</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FieldTypeImpl#getModifiedWriteValue <em>Modified Write Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FieldTypeImpl#getWriteValueConstraint <em>Write Value Constraint</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FieldTypeImpl#getReadAction <em>Read Action</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FieldTypeImpl#getTestable <em>Testable</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FieldTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FieldTypeImpl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.FieldTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldTypeImpl extends MinimalEObjectImpl.Container implements FieldType {
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
	 * The default value of the '{@link #getBitOffset() <em>Bit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitOffset()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BIT_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBitOffset() <em>Bit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitOffset()
	 * @generated
	 * @ordered
	 */
	protected BigInteger bitOffset = BIT_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeIdentifier() <em>Type Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeIdentifier() <em>Type Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String typeIdentifier = TYPE_IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBitWidth() <em>Bit Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitWidth()
	 * @generated
	 * @ordered
	 */
	protected BitWidthType bitWidth;

	/**
	 * The default value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VOLATILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
	protected boolean volatile_ = VOLATILE_EDEFAULT;

	/**
	 * This is true if the Volatile attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean volatileESet;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final AccessType ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected AccessType access = ACCESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnumeratedValues() <em>Enumerated Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeratedValues()
	 * @generated
	 * @ordered
	 */
	protected EnumeratedValuesType enumeratedValues;

	/**
	 * The default value of the '{@link #getModifiedWriteValue() <em>Modified Write Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedWriteValue()
	 * @generated
	 * @ordered
	 */
	protected static final ModifiedWriteValueType MODIFIED_WRITE_VALUE_EDEFAULT = ModifiedWriteValueType.ONE_TO_CLEAR;

	/**
	 * The cached value of the '{@link #getModifiedWriteValue() <em>Modified Write Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedWriteValue()
	 * @generated
	 * @ordered
	 */
	protected ModifiedWriteValueType modifiedWriteValue = MODIFIED_WRITE_VALUE_EDEFAULT;

	/**
	 * This is true if the Modified Write Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modifiedWriteValueESet;

	/**
	 * The cached value of the '{@link #getWriteValueConstraint() <em>Write Value Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteValueConstraint()
	 * @generated
	 * @ordered
	 */
	protected WriteValueConstraintType writeValueConstraint;

	/**
	 * The default value of the '{@link #getReadAction() <em>Read Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadAction()
	 * @generated
	 * @ordered
	 */
	protected static final ReadActionType READ_ACTION_EDEFAULT = ReadActionType.CLEAR;

	/**
	 * The cached value of the '{@link #getReadAction() <em>Read Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadAction()
	 * @generated
	 * @ordered
	 */
	protected ReadActionType readAction = READ_ACTION_EDEFAULT;

	/**
	 * This is true if the Read Action attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean readActionESet;

	/**
	 * The cached value of the '{@link #getTestable() <em>Testable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestable()
	 * @generated
	 * @ordered
	 */
	protected TestableType testable;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getFieldType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FIELD_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FIELD_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FIELD_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBitOffset() {
		return bitOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitOffset(BigInteger newBitOffset) {
		BigInteger oldBitOffset = bitOffset;
		bitOffset = newBitOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FIELD_TYPE__BIT_OFFSET, oldBitOffset, bitOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeIdentifier() {
		return typeIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeIdentifier(String newTypeIdentifier) {
		String oldTypeIdentifier = typeIdentifier;
		typeIdentifier = newTypeIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FIELD_TYPE__TYPE_IDENTIFIER, oldTypeIdentifier, typeIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitWidthType getBitWidth() {
		return bitWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBitWidth(BitWidthType newBitWidth, NotificationChain msgs) {
		BitWidthType oldBitWidth = bitWidth;
		bitWidth = newBitWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.FIELD_TYPE__BIT_WIDTH, oldBitWidth, newBitWidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitWidth(BitWidthType newBitWidth) {
		if (newBitWidth != bitWidth) {
			NotificationChain msgs = null;
			if (bitWidth != null)
				msgs = ((InternalEObject)bitWidth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.FIELD_TYPE__BIT_WIDTH, null, msgs);
			if (newBitWidth != null)
				msgs = ((InternalEObject)newBitWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.FIELD_TYPE__BIT_WIDTH, null, msgs);
			msgs = basicSetBitWidth(newBitWidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FIELD_TYPE__BIT_WIDTH, newBitWidth, newBitWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVolatile() {
		return volatile_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolatile(boolean newVolatile) {
		boolean oldVolatile = volatile_;
		volatile_ = newVolatile;
		boolean oldVolatileESet = volatileESet;
		volatileESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FIELD_TYPE__VOLATILE, oldVolatile, volatile_, !oldVolatileESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVolatile() {
		boolean oldVolatile = volatile_;
		boolean oldVolatileESet = volatileESet;
		volatile_ = VOLATILE_EDEFAULT;
		volatileESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.FIELD_TYPE__VOLATILE, oldVolatile, VOLATILE_EDEFAULT, oldVolatileESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVolatile() {
		return volatileESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(AccessType newAccess) {
		AccessType oldAccess = access;
		access = newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FIELD_TYPE__ACCESS, oldAccess, access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedValuesType getEnumeratedValues() {
		return enumeratedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumeratedValues(EnumeratedValuesType newEnumeratedValues, NotificationChain msgs) {
		EnumeratedValuesType oldEnumeratedValues = enumeratedValues;
		enumeratedValues = newEnumeratedValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.FIELD_TYPE__ENUMERATED_VALUES, oldEnumeratedValues, newEnumeratedValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumeratedValues(EnumeratedValuesType newEnumeratedValues) {
		if (newEnumeratedValues != enumeratedValues) {
			NotificationChain msgs = null;
			if (enumeratedValues != null)
				msgs = ((InternalEObject)enumeratedValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.FIELD_TYPE__ENUMERATED_VALUES, null, msgs);
			if (newEnumeratedValues != null)
				msgs = ((InternalEObject)newEnumeratedValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.FIELD_TYPE__ENUMERATED_VALUES, null, msgs);
			msgs = basicSetEnumeratedValues(newEnumeratedValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FIELD_TYPE__ENUMERATED_VALUES, newEnumeratedValues, newEnumeratedValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifiedWriteValueType getModifiedWriteValue() {
		return modifiedWriteValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedWriteValue(ModifiedWriteValueType newModifiedWriteValue) {
		ModifiedWriteValueType oldModifiedWriteValue = modifiedWriteValue;
		modifiedWriteValue = newModifiedWriteValue == null ? MODIFIED_WRITE_VALUE_EDEFAULT : newModifiedWriteValue;
		boolean oldModifiedWriteValueESet = modifiedWriteValueESet;
		modifiedWriteValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FIELD_TYPE__MODIFIED_WRITE_VALUE, oldModifiedWriteValue, modifiedWriteValue, !oldModifiedWriteValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModifiedWriteValue() {
		ModifiedWriteValueType oldModifiedWriteValue = modifiedWriteValue;
		boolean oldModifiedWriteValueESet = modifiedWriteValueESet;
		modifiedWriteValue = MODIFIED_WRITE_VALUE_EDEFAULT;
		modifiedWriteValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.FIELD_TYPE__MODIFIED_WRITE_VALUE, oldModifiedWriteValue, MODIFIED_WRITE_VALUE_EDEFAULT, oldModifiedWriteValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModifiedWriteValue() {
		return modifiedWriteValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteValueConstraintType getWriteValueConstraint() {
		return writeValueConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriteValueConstraint(WriteValueConstraintType newWriteValueConstraint, NotificationChain msgs) {
		WriteValueConstraintType oldWriteValueConstraint = writeValueConstraint;
		writeValueConstraint = newWriteValueConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.FIELD_TYPE__WRITE_VALUE_CONSTRAINT, oldWriteValueConstraint, newWriteValueConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteValueConstraint(WriteValueConstraintType newWriteValueConstraint) {
		if (newWriteValueConstraint != writeValueConstraint) {
			NotificationChain msgs = null;
			if (writeValueConstraint != null)
				msgs = ((InternalEObject)writeValueConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.FIELD_TYPE__WRITE_VALUE_CONSTRAINT, null, msgs);
			if (newWriteValueConstraint != null)
				msgs = ((InternalEObject)newWriteValueConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.FIELD_TYPE__WRITE_VALUE_CONSTRAINT, null, msgs);
			msgs = basicSetWriteValueConstraint(newWriteValueConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FIELD_TYPE__WRITE_VALUE_CONSTRAINT, newWriteValueConstraint, newWriteValueConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadActionType getReadAction() {
		return readAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadAction(ReadActionType newReadAction) {
		ReadActionType oldReadAction = readAction;
		readAction = newReadAction == null ? READ_ACTION_EDEFAULT : newReadAction;
		boolean oldReadActionESet = readActionESet;
		readActionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FIELD_TYPE__READ_ACTION, oldReadAction, readAction, !oldReadActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReadAction() {
		ReadActionType oldReadAction = readAction;
		boolean oldReadActionESet = readActionESet;
		readAction = READ_ACTION_EDEFAULT;
		readActionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.FIELD_TYPE__READ_ACTION, oldReadAction, READ_ACTION_EDEFAULT, oldReadActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReadAction() {
		return readActionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestableType getTestable() {
		return testable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestable(TestableType newTestable, NotificationChain msgs) {
		TestableType oldTestable = testable;
		testable = newTestable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.FIELD_TYPE__TESTABLE, oldTestable, newTestable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestable(TestableType newTestable) {
		if (newTestable != testable) {
			NotificationChain msgs = null;
			if (testable != null)
				msgs = ((InternalEObject)testable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.FIELD_TYPE__TESTABLE, null, msgs);
			if (newTestable != null)
				msgs = ((InternalEObject)newTestable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.FIELD_TYPE__TESTABLE, null, msgs);
			msgs = basicSetTestable(newTestable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FIELD_TYPE__TESTABLE, newTestable, newTestable));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.FIELD_TYPE__PARAMETERS, oldParameters, newParameters);
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
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.FIELD_TYPE__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.FIELD_TYPE__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FIELD_TYPE__PARAMETERS, newParameters, newParameters));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.FIELD_TYPE__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
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
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.FIELD_TYPE__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.FIELD_TYPE__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FIELD_TYPE__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.FIELD_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.FIELD_TYPE__BIT_WIDTH:
				return basicSetBitWidth(null, msgs);
			case _2009Package.FIELD_TYPE__ENUMERATED_VALUES:
				return basicSetEnumeratedValues(null, msgs);
			case _2009Package.FIELD_TYPE__WRITE_VALUE_CONSTRAINT:
				return basicSetWriteValueConstraint(null, msgs);
			case _2009Package.FIELD_TYPE__TESTABLE:
				return basicSetTestable(null, msgs);
			case _2009Package.FIELD_TYPE__PARAMETERS:
				return basicSetParameters(null, msgs);
			case _2009Package.FIELD_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.FIELD_TYPE__NAME:
				return getName();
			case _2009Package.FIELD_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case _2009Package.FIELD_TYPE__DESCRIPTION:
				return getDescription();
			case _2009Package.FIELD_TYPE__BIT_OFFSET:
				return getBitOffset();
			case _2009Package.FIELD_TYPE__TYPE_IDENTIFIER:
				return getTypeIdentifier();
			case _2009Package.FIELD_TYPE__BIT_WIDTH:
				return getBitWidth();
			case _2009Package.FIELD_TYPE__VOLATILE:
				return isVolatile();
			case _2009Package.FIELD_TYPE__ACCESS:
				return getAccess();
			case _2009Package.FIELD_TYPE__ENUMERATED_VALUES:
				return getEnumeratedValues();
			case _2009Package.FIELD_TYPE__MODIFIED_WRITE_VALUE:
				return getModifiedWriteValue();
			case _2009Package.FIELD_TYPE__WRITE_VALUE_CONSTRAINT:
				return getWriteValueConstraint();
			case _2009Package.FIELD_TYPE__READ_ACTION:
				return getReadAction();
			case _2009Package.FIELD_TYPE__TESTABLE:
				return getTestable();
			case _2009Package.FIELD_TYPE__PARAMETERS:
				return getParameters();
			case _2009Package.FIELD_TYPE__VENDOR_EXTENSIONS:
				return getVendorExtensions();
			case _2009Package.FIELD_TYPE__ID:
				return getId();
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
			case _2009Package.FIELD_TYPE__NAME:
				setName((String)newValue);
				return;
			case _2009Package.FIELD_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case _2009Package.FIELD_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _2009Package.FIELD_TYPE__BIT_OFFSET:
				setBitOffset((BigInteger)newValue);
				return;
			case _2009Package.FIELD_TYPE__TYPE_IDENTIFIER:
				setTypeIdentifier((String)newValue);
				return;
			case _2009Package.FIELD_TYPE__BIT_WIDTH:
				setBitWidth((BitWidthType)newValue);
				return;
			case _2009Package.FIELD_TYPE__VOLATILE:
				setVolatile((Boolean)newValue);
				return;
			case _2009Package.FIELD_TYPE__ACCESS:
				setAccess((AccessType)newValue);
				return;
			case _2009Package.FIELD_TYPE__ENUMERATED_VALUES:
				setEnumeratedValues((EnumeratedValuesType)newValue);
				return;
			case _2009Package.FIELD_TYPE__MODIFIED_WRITE_VALUE:
				setModifiedWriteValue((ModifiedWriteValueType)newValue);
				return;
			case _2009Package.FIELD_TYPE__WRITE_VALUE_CONSTRAINT:
				setWriteValueConstraint((WriteValueConstraintType)newValue);
				return;
			case _2009Package.FIELD_TYPE__READ_ACTION:
				setReadAction((ReadActionType)newValue);
				return;
			case _2009Package.FIELD_TYPE__TESTABLE:
				setTestable((TestableType)newValue);
				return;
			case _2009Package.FIELD_TYPE__PARAMETERS:
				setParameters((ParametersType1)newValue);
				return;
			case _2009Package.FIELD_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)newValue);
				return;
			case _2009Package.FIELD_TYPE__ID:
				setId((String)newValue);
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
			case _2009Package.FIELD_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _2009Package.FIELD_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case _2009Package.FIELD_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _2009Package.FIELD_TYPE__BIT_OFFSET:
				setBitOffset(BIT_OFFSET_EDEFAULT);
				return;
			case _2009Package.FIELD_TYPE__TYPE_IDENTIFIER:
				setTypeIdentifier(TYPE_IDENTIFIER_EDEFAULT);
				return;
			case _2009Package.FIELD_TYPE__BIT_WIDTH:
				setBitWidth((BitWidthType)null);
				return;
			case _2009Package.FIELD_TYPE__VOLATILE:
				unsetVolatile();
				return;
			case _2009Package.FIELD_TYPE__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case _2009Package.FIELD_TYPE__ENUMERATED_VALUES:
				setEnumeratedValues((EnumeratedValuesType)null);
				return;
			case _2009Package.FIELD_TYPE__MODIFIED_WRITE_VALUE:
				unsetModifiedWriteValue();
				return;
			case _2009Package.FIELD_TYPE__WRITE_VALUE_CONSTRAINT:
				setWriteValueConstraint((WriteValueConstraintType)null);
				return;
			case _2009Package.FIELD_TYPE__READ_ACTION:
				unsetReadAction();
				return;
			case _2009Package.FIELD_TYPE__TESTABLE:
				setTestable((TestableType)null);
				return;
			case _2009Package.FIELD_TYPE__PARAMETERS:
				setParameters((ParametersType1)null);
				return;
			case _2009Package.FIELD_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)null);
				return;
			case _2009Package.FIELD_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case _2009Package.FIELD_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _2009Package.FIELD_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case _2009Package.FIELD_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _2009Package.FIELD_TYPE__BIT_OFFSET:
				return BIT_OFFSET_EDEFAULT == null ? bitOffset != null : !BIT_OFFSET_EDEFAULT.equals(bitOffset);
			case _2009Package.FIELD_TYPE__TYPE_IDENTIFIER:
				return TYPE_IDENTIFIER_EDEFAULT == null ? typeIdentifier != null : !TYPE_IDENTIFIER_EDEFAULT.equals(typeIdentifier);
			case _2009Package.FIELD_TYPE__BIT_WIDTH:
				return bitWidth != null;
			case _2009Package.FIELD_TYPE__VOLATILE:
				return isSetVolatile();
			case _2009Package.FIELD_TYPE__ACCESS:
				return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
			case _2009Package.FIELD_TYPE__ENUMERATED_VALUES:
				return enumeratedValues != null;
			case _2009Package.FIELD_TYPE__MODIFIED_WRITE_VALUE:
				return isSetModifiedWriteValue();
			case _2009Package.FIELD_TYPE__WRITE_VALUE_CONSTRAINT:
				return writeValueConstraint != null;
			case _2009Package.FIELD_TYPE__READ_ACTION:
				return isSetReadAction();
			case _2009Package.FIELD_TYPE__TESTABLE:
				return testable != null;
			case _2009Package.FIELD_TYPE__PARAMETERS:
				return parameters != null;
			case _2009Package.FIELD_TYPE__VENDOR_EXTENSIONS:
				return vendorExtensions != null;
			case _2009Package.FIELD_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(", bitOffset: ");
		result.append(bitOffset);
		result.append(", typeIdentifier: ");
		result.append(typeIdentifier);
		result.append(", volatile: ");
		if (volatileESet) result.append(volatile_); else result.append("<unset>");
		result.append(", access: ");
		result.append(access);
		result.append(", modifiedWriteValue: ");
		if (modifiedWriteValueESet) result.append(modifiedWriteValue); else result.append("<unset>");
		result.append(", readAction: ");
		if (readActionESet) result.append(readAction); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //FieldTypeImpl
