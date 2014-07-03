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

import org.spiritconsortium.xml.schema.spirit._1685._2009.CommandLineSwitchType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.EnableType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.LinkerCommandFileType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.NameType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linker Command File Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.LinkerCommandFileTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.LinkerCommandFileTypeImpl#getCommandLineSwitch <em>Command Line Switch</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.LinkerCommandFileTypeImpl#getEnable <em>Enable</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.LinkerCommandFileTypeImpl#getGeneratorRef <em>Generator Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.LinkerCommandFileTypeImpl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkerCommandFileTypeImpl extends MinimalEObjectImpl.Container implements LinkerCommandFileType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameType name;

	/**
	 * The cached value of the '{@link #getCommandLineSwitch() <em>Command Line Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandLineSwitch()
	 * @generated
	 * @ordered
	 */
	protected CommandLineSwitchType commandLineSwitch;

	/**
	 * The cached value of the '{@link #getEnable() <em>Enable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnable()
	 * @generated
	 * @ordered
	 */
	protected EnableType enable;

	/**
	 * The cached value of the '{@link #getGeneratorRef() <em>Generator Ref</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorRef()
	 * @generated
	 * @ordered
	 */
	protected EList<String> generatorRef;

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
	protected LinkerCommandFileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getLinkerCommandFileType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameType newName, NotificationChain msgs) {
		NameType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.LINKER_COMMAND_FILE_TYPE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(NameType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.LINKER_COMMAND_FILE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.LINKER_COMMAND_FILE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.LINKER_COMMAND_FILE_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandLineSwitchType getCommandLineSwitch() {
		return commandLineSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommandLineSwitch(CommandLineSwitchType newCommandLineSwitch, NotificationChain msgs) {
		CommandLineSwitchType oldCommandLineSwitch = commandLineSwitch;
		commandLineSwitch = newCommandLineSwitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.LINKER_COMMAND_FILE_TYPE__COMMAND_LINE_SWITCH, oldCommandLineSwitch, newCommandLineSwitch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandLineSwitch(CommandLineSwitchType newCommandLineSwitch) {
		if (newCommandLineSwitch != commandLineSwitch) {
			NotificationChain msgs = null;
			if (commandLineSwitch != null)
				msgs = ((InternalEObject)commandLineSwitch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.LINKER_COMMAND_FILE_TYPE__COMMAND_LINE_SWITCH, null, msgs);
			if (newCommandLineSwitch != null)
				msgs = ((InternalEObject)newCommandLineSwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.LINKER_COMMAND_FILE_TYPE__COMMAND_LINE_SWITCH, null, msgs);
			msgs = basicSetCommandLineSwitch(newCommandLineSwitch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.LINKER_COMMAND_FILE_TYPE__COMMAND_LINE_SWITCH, newCommandLineSwitch, newCommandLineSwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableType getEnable() {
		return enable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnable(EnableType newEnable, NotificationChain msgs) {
		EnableType oldEnable = enable;
		enable = newEnable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.LINKER_COMMAND_FILE_TYPE__ENABLE, oldEnable, newEnable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnable(EnableType newEnable) {
		if (newEnable != enable) {
			NotificationChain msgs = null;
			if (enable != null)
				msgs = ((InternalEObject)enable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.LINKER_COMMAND_FILE_TYPE__ENABLE, null, msgs);
			if (newEnable != null)
				msgs = ((InternalEObject)newEnable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.LINKER_COMMAND_FILE_TYPE__ENABLE, null, msgs);
			msgs = basicSetEnable(newEnable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.LINKER_COMMAND_FILE_TYPE__ENABLE, newEnable, newEnable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getGeneratorRef() {
		if (generatorRef == null) {
			generatorRef = new EDataTypeEList<String>(String.class, this, _2009Package.LINKER_COMMAND_FILE_TYPE__GENERATOR_REF);
		}
		return generatorRef;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.LINKER_COMMAND_FILE_TYPE__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
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
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.LINKER_COMMAND_FILE_TYPE__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.LINKER_COMMAND_FILE_TYPE__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.LINKER_COMMAND_FILE_TYPE__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.LINKER_COMMAND_FILE_TYPE__NAME:
				return basicSetName(null, msgs);
			case _2009Package.LINKER_COMMAND_FILE_TYPE__COMMAND_LINE_SWITCH:
				return basicSetCommandLineSwitch(null, msgs);
			case _2009Package.LINKER_COMMAND_FILE_TYPE__ENABLE:
				return basicSetEnable(null, msgs);
			case _2009Package.LINKER_COMMAND_FILE_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.LINKER_COMMAND_FILE_TYPE__NAME:
				return getName();
			case _2009Package.LINKER_COMMAND_FILE_TYPE__COMMAND_LINE_SWITCH:
				return getCommandLineSwitch();
			case _2009Package.LINKER_COMMAND_FILE_TYPE__ENABLE:
				return getEnable();
			case _2009Package.LINKER_COMMAND_FILE_TYPE__GENERATOR_REF:
				return getGeneratorRef();
			case _2009Package.LINKER_COMMAND_FILE_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.LINKER_COMMAND_FILE_TYPE__NAME:
				setName((NameType)newValue);
				return;
			case _2009Package.LINKER_COMMAND_FILE_TYPE__COMMAND_LINE_SWITCH:
				setCommandLineSwitch((CommandLineSwitchType)newValue);
				return;
			case _2009Package.LINKER_COMMAND_FILE_TYPE__ENABLE:
				setEnable((EnableType)newValue);
				return;
			case _2009Package.LINKER_COMMAND_FILE_TYPE__GENERATOR_REF:
				getGeneratorRef().clear();
				getGeneratorRef().addAll((Collection<? extends String>)newValue);
				return;
			case _2009Package.LINKER_COMMAND_FILE_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.LINKER_COMMAND_FILE_TYPE__NAME:
				setName((NameType)null);
				return;
			case _2009Package.LINKER_COMMAND_FILE_TYPE__COMMAND_LINE_SWITCH:
				setCommandLineSwitch((CommandLineSwitchType)null);
				return;
			case _2009Package.LINKER_COMMAND_FILE_TYPE__ENABLE:
				setEnable((EnableType)null);
				return;
			case _2009Package.LINKER_COMMAND_FILE_TYPE__GENERATOR_REF:
				getGeneratorRef().clear();
				return;
			case _2009Package.LINKER_COMMAND_FILE_TYPE__VENDOR_EXTENSIONS:
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
			case _2009Package.LINKER_COMMAND_FILE_TYPE__NAME:
				return name != null;
			case _2009Package.LINKER_COMMAND_FILE_TYPE__COMMAND_LINE_SWITCH:
				return commandLineSwitch != null;
			case _2009Package.LINKER_COMMAND_FILE_TYPE__ENABLE:
				return enable != null;
			case _2009Package.LINKER_COMMAND_FILE_TYPE__GENERATOR_REF:
				return generatorRef != null && !generatorRef.isEmpty();
			case _2009Package.LINKER_COMMAND_FILE_TYPE__VENDOR_EXTENSIONS:
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
		result.append(" (generatorRef: ");
		result.append(generatorRef);
		result.append(')');
		return result.toString();
	}

} //LinkerCommandFileTypeImpl
