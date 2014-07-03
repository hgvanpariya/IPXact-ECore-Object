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

import org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.LanguageToolsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.LinkerCommandFileType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.LinkerFlagsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.LinkerType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language Tools Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.LanguageToolsTypeImpl#getFileBuilder <em>File Builder</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.LanguageToolsTypeImpl#getLinker <em>Linker</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.LanguageToolsTypeImpl#getLinkerFlags <em>Linker Flags</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.LanguageToolsTypeImpl#getLinkerCommandFile <em>Linker Command File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LanguageToolsTypeImpl extends MinimalEObjectImpl.Container implements LanguageToolsType {
	/**
	 * The cached value of the '{@link #getFileBuilder() <em>File Builder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileBuilder()
	 * @generated
	 * @ordered
	 */
	protected EList<FileBuilderType1> fileBuilder;

	/**
	 * The cached value of the '{@link #getLinker() <em>Linker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinker()
	 * @generated
	 * @ordered
	 */
	protected LinkerType linker;

	/**
	 * The cached value of the '{@link #getLinkerFlags() <em>Linker Flags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkerFlags()
	 * @generated
	 * @ordered
	 */
	protected LinkerFlagsType linkerFlags;

	/**
	 * The cached value of the '{@link #getLinkerCommandFile() <em>Linker Command File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkerCommandFile()
	 * @generated
	 * @ordered
	 */
	protected LinkerCommandFileType linkerCommandFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageToolsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getLanguageToolsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileBuilderType1> getFileBuilder() {
		if (fileBuilder == null) {
			fileBuilder = new EObjectContainmentEList<FileBuilderType1>(FileBuilderType1.class, this, _2009Package.LANGUAGE_TOOLS_TYPE__FILE_BUILDER);
		}
		return fileBuilder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkerType getLinker() {
		return linker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinker(LinkerType newLinker, NotificationChain msgs) {
		LinkerType oldLinker = linker;
		linker = newLinker;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.LANGUAGE_TOOLS_TYPE__LINKER, oldLinker, newLinker);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinker(LinkerType newLinker) {
		if (newLinker != linker) {
			NotificationChain msgs = null;
			if (linker != null)
				msgs = ((InternalEObject)linker).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.LANGUAGE_TOOLS_TYPE__LINKER, null, msgs);
			if (newLinker != null)
				msgs = ((InternalEObject)newLinker).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.LANGUAGE_TOOLS_TYPE__LINKER, null, msgs);
			msgs = basicSetLinker(newLinker, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.LANGUAGE_TOOLS_TYPE__LINKER, newLinker, newLinker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkerFlagsType getLinkerFlags() {
		return linkerFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkerFlags(LinkerFlagsType newLinkerFlags, NotificationChain msgs) {
		LinkerFlagsType oldLinkerFlags = linkerFlags;
		linkerFlags = newLinkerFlags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.LANGUAGE_TOOLS_TYPE__LINKER_FLAGS, oldLinkerFlags, newLinkerFlags);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkerFlags(LinkerFlagsType newLinkerFlags) {
		if (newLinkerFlags != linkerFlags) {
			NotificationChain msgs = null;
			if (linkerFlags != null)
				msgs = ((InternalEObject)linkerFlags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.LANGUAGE_TOOLS_TYPE__LINKER_FLAGS, null, msgs);
			if (newLinkerFlags != null)
				msgs = ((InternalEObject)newLinkerFlags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.LANGUAGE_TOOLS_TYPE__LINKER_FLAGS, null, msgs);
			msgs = basicSetLinkerFlags(newLinkerFlags, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.LANGUAGE_TOOLS_TYPE__LINKER_FLAGS, newLinkerFlags, newLinkerFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkerCommandFileType getLinkerCommandFile() {
		return linkerCommandFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkerCommandFile(LinkerCommandFileType newLinkerCommandFile, NotificationChain msgs) {
		LinkerCommandFileType oldLinkerCommandFile = linkerCommandFile;
		linkerCommandFile = newLinkerCommandFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2009Package.LANGUAGE_TOOLS_TYPE__LINKER_COMMAND_FILE, oldLinkerCommandFile, newLinkerCommandFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkerCommandFile(LinkerCommandFileType newLinkerCommandFile) {
		if (newLinkerCommandFile != linkerCommandFile) {
			NotificationChain msgs = null;
			if (linkerCommandFile != null)
				msgs = ((InternalEObject)linkerCommandFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2009Package.LANGUAGE_TOOLS_TYPE__LINKER_COMMAND_FILE, null, msgs);
			if (newLinkerCommandFile != null)
				msgs = ((InternalEObject)newLinkerCommandFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2009Package.LANGUAGE_TOOLS_TYPE__LINKER_COMMAND_FILE, null, msgs);
			msgs = basicSetLinkerCommandFile(newLinkerCommandFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.LANGUAGE_TOOLS_TYPE__LINKER_COMMAND_FILE, newLinkerCommandFile, newLinkerCommandFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.LANGUAGE_TOOLS_TYPE__FILE_BUILDER:
				return ((InternalEList<?>)getFileBuilder()).basicRemove(otherEnd, msgs);
			case _2009Package.LANGUAGE_TOOLS_TYPE__LINKER:
				return basicSetLinker(null, msgs);
			case _2009Package.LANGUAGE_TOOLS_TYPE__LINKER_FLAGS:
				return basicSetLinkerFlags(null, msgs);
			case _2009Package.LANGUAGE_TOOLS_TYPE__LINKER_COMMAND_FILE:
				return basicSetLinkerCommandFile(null, msgs);
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
			case _2009Package.LANGUAGE_TOOLS_TYPE__FILE_BUILDER:
				return getFileBuilder();
			case _2009Package.LANGUAGE_TOOLS_TYPE__LINKER:
				return getLinker();
			case _2009Package.LANGUAGE_TOOLS_TYPE__LINKER_FLAGS:
				return getLinkerFlags();
			case _2009Package.LANGUAGE_TOOLS_TYPE__LINKER_COMMAND_FILE:
				return getLinkerCommandFile();
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
			case _2009Package.LANGUAGE_TOOLS_TYPE__FILE_BUILDER:
				getFileBuilder().clear();
				getFileBuilder().addAll((Collection<? extends FileBuilderType1>)newValue);
				return;
			case _2009Package.LANGUAGE_TOOLS_TYPE__LINKER:
				setLinker((LinkerType)newValue);
				return;
			case _2009Package.LANGUAGE_TOOLS_TYPE__LINKER_FLAGS:
				setLinkerFlags((LinkerFlagsType)newValue);
				return;
			case _2009Package.LANGUAGE_TOOLS_TYPE__LINKER_COMMAND_FILE:
				setLinkerCommandFile((LinkerCommandFileType)newValue);
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
			case _2009Package.LANGUAGE_TOOLS_TYPE__FILE_BUILDER:
				getFileBuilder().clear();
				return;
			case _2009Package.LANGUAGE_TOOLS_TYPE__LINKER:
				setLinker((LinkerType)null);
				return;
			case _2009Package.LANGUAGE_TOOLS_TYPE__LINKER_FLAGS:
				setLinkerFlags((LinkerFlagsType)null);
				return;
			case _2009Package.LANGUAGE_TOOLS_TYPE__LINKER_COMMAND_FILE:
				setLinkerCommandFile((LinkerCommandFileType)null);
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
			case _2009Package.LANGUAGE_TOOLS_TYPE__FILE_BUILDER:
				return fileBuilder != null && !fileBuilder.isEmpty();
			case _2009Package.LANGUAGE_TOOLS_TYPE__LINKER:
				return linker != null;
			case _2009Package.LANGUAGE_TOOLS_TYPE__LINKER_FLAGS:
				return linkerFlags != null;
			case _2009Package.LANGUAGE_TOOLS_TYPE__LINKER_COMMAND_FILE:
				return linkerCommandFile != null;
		}
		return super.eIsSet(featureID);
	}

} //LanguageToolsTypeImpl
