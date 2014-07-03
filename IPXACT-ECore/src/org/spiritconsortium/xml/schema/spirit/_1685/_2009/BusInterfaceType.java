/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Interface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type definition for a busInterface in a component
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getBusType <em>Bus Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getAbstractionType <em>Abstraction Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getMaster <em>Master</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getSlave <em>Slave</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getSystem <em>System</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getMirroredSlave <em>Mirrored Slave</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getMirroredMaster <em>Mirrored Master</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getMirroredSystem <em>Mirrored System</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getMonitor <em>Monitor</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#isConnectionRequired <em>Connection Required</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getPortMaps <em>Port Maps</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getBitsInLau <em>Bits In Lau</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getBitSteering <em>Bit Steering</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getEndianness <em>Endianness</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getVendorExtensions <em>Vendor Extensions</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfaceType()
 * @model extendedMetaData="name='busInterfaceType' kind='elementOnly'"
 * @generated
 */
public interface BusInterfaceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfaceType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element name for display purposes. Typically a few words providing a more detailed and/or user-friendly name than the spirit:name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfaceType_DisplayName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='displayName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full description string, typically for documentation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfaceType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Bus Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bus type of this interface. Refers to bus definition using vendor, library, name, version attributes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bus Type</em>' containment reference.
	 * @see #setBusType(LibraryRefType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfaceType_BusType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='busType' namespace='##targetNamespace'"
	 * @generated
	 */
	LibraryRefType getBusType();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getBusType <em>Bus Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Type</em>' containment reference.
	 * @see #getBusType()
	 * @generated
	 */
	void setBusType(LibraryRefType value);

	/**
	 * Returns the value of the '<em><b>Abstraction Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The abstraction type/level of this interface. Refers to abstraction definition using vendor, library, name, version attributes. Bus definition can be found through a reference in this file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstraction Type</em>' containment reference.
	 * @see #setAbstractionType(LibraryRefType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfaceType_AbstractionType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abstractionType' namespace='##targetNamespace'"
	 * @generated
	 */
	LibraryRefType getAbstractionType();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getAbstractionType <em>Abstraction Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstraction Type</em>' containment reference.
	 * @see #getAbstractionType()
	 * @generated
	 */
	void setAbstractionType(LibraryRefType value);

	/**
	 * Returns the value of the '<em><b>Master</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this element is present, the bus interface can serve as a master.  This element encapsulates additional information related to its role as master.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Master</em>' containment reference.
	 * @see #setMaster(MasterType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfaceType_Master()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='master' namespace='##targetNamespace'"
	 * @generated
	 */
	MasterType getMaster();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getMaster <em>Master</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master</em>' containment reference.
	 * @see #getMaster()
	 * @generated
	 */
	void setMaster(MasterType value);

	/**
	 * Returns the value of the '<em><b>Slave</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this element is present, the bus interface can serve as a slave.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slave</em>' containment reference.
	 * @see #setSlave(SlaveType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfaceType_Slave()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='slave' namespace='##targetNamespace'"
	 * @generated
	 */
	SlaveType getSlave();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getSlave <em>Slave</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slave</em>' containment reference.
	 * @see #getSlave()
	 * @generated
	 */
	void setSlave(SlaveType value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this element is present, the bus interface is a system interface, neither master nor slave, with a specific function on the bus.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(SystemType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfaceType_System()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='system' namespace='##targetNamespace'"
	 * @generated
	 */
	SystemType getSystem();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(SystemType value);

	/**
	 * Returns the value of the '<em><b>Mirrored Slave</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this element is present, the bus interface represents a mirrored slave interface. All directional constraints on ports are reversed relative to the specification in the bus definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mirrored Slave</em>' containment reference.
	 * @see #setMirroredSlave(MirroredSlaveType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfaceType_MirroredSlave()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mirroredSlave' namespace='##targetNamespace'"
	 * @generated
	 */
	MirroredSlaveType getMirroredSlave();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getMirroredSlave <em>Mirrored Slave</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mirrored Slave</em>' containment reference.
	 * @see #getMirroredSlave()
	 * @generated
	 */
	void setMirroredSlave(MirroredSlaveType value);

	/**
	 * Returns the value of the '<em><b>Mirrored Master</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this element is present, the bus interface represents a mirrored master interface. All directional constraints on ports are reversed relative to the specification in the bus definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mirrored Master</em>' containment reference.
	 * @see #setMirroredMaster(MirroredMasterType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfaceType_MirroredMaster()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mirroredMaster' namespace='##targetNamespace'"
	 * @generated
	 */
	MirroredMasterType getMirroredMaster();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getMirroredMaster <em>Mirrored Master</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mirrored Master</em>' containment reference.
	 * @see #getMirroredMaster()
	 * @generated
	 */
	void setMirroredMaster(MirroredMasterType value);

	/**
	 * Returns the value of the '<em><b>Mirrored System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this element is present, the bus interface represents a mirrored system interface. All directional constraints on ports are reversed relative to the specification in the bus definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mirrored System</em>' containment reference.
	 * @see #setMirroredSystem(MirroredSystemType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfaceType_MirroredSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mirroredSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	MirroredSystemType getMirroredSystem();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getMirroredSystem <em>Mirrored System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mirrored System</em>' containment reference.
	 * @see #getMirroredSystem()
	 * @generated
	 */
	void setMirroredSystem(MirroredSystemType value);

	/**
	 * Returns the value of the '<em><b>Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that this is a (passive) monitor interface. All of the ports in the interface must be inputs. The type of interface to be monitored is specified with the required interfaceType attribute. The spirit:group element must be specified if monitoring a system interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monitor</em>' containment reference.
	 * @see #setMonitor(MonitorType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfaceType_Monitor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='monitor' namespace='##targetNamespace'"
	 * @generated
	 */
	MonitorType getMonitor();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getMonitor <em>Monitor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor</em>' containment reference.
	 * @see #getMonitor()
	 * @generated
	 */
	void setMonitor(MonitorType value);

	/**
	 * Returns the value of the '<em><b>Connection Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether a connection to this interface is required for proper component functionality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Required</em>' attribute.
	 * @see #isSetConnectionRequired()
	 * @see #unsetConnectionRequired()
	 * @see #setConnectionRequired(boolean)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfaceType_ConnectionRequired()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='connectionRequired' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isConnectionRequired();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#isConnectionRequired <em>Connection Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Required</em>' attribute.
	 * @see #isSetConnectionRequired()
	 * @see #unsetConnectionRequired()
	 * @see #isConnectionRequired()
	 * @generated
	 */
	void setConnectionRequired(boolean value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#isConnectionRequired <em>Connection Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectionRequired()
	 * @see #isConnectionRequired()
	 * @see #setConnectionRequired(boolean)
	 * @generated
	 */
	void unsetConnectionRequired();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#isConnectionRequired <em>Connection Required</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connection Required</em>' attribute is set.
	 * @see #unsetConnectionRequired()
	 * @see #isConnectionRequired()
	 * @see #setConnectionRequired(boolean)
	 * @generated
	 */
	boolean isSetConnectionRequired();

	/**
	 * Returns the value of the '<em><b>Port Maps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Listing of maps between component ports and bus ports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Maps</em>' containment reference.
	 * @see #setPortMaps(PortMapsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfaceType_PortMaps()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='portMaps' namespace='##targetNamespace'"
	 * @generated
	 */
	PortMapsType getPortMaps();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getPortMaps <em>Port Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Maps</em>' containment reference.
	 * @see #getPortMaps()
	 * @generated
	 */
	void setPortMaps(PortMapsType value);

	/**
	 * Returns the value of the '<em><b>Bits In Lau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of bits in the least addressable unit. The default is byte addressable (8 bits).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bits In Lau</em>' attribute.
	 * @see #setBitsInLau(BigInteger)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfaceType_BitsInLau()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='element' name='bitsInLau' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getBitsInLau();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getBitsInLau <em>Bits In Lau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bits In Lau</em>' attribute.
	 * @see #getBitsInLau()
	 * @generated
	 */
	void setBitsInLau(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Bit Steering</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether bit steering should be used to map this interface onto a bus of different data width.
	 * 
	 * Values are "on", "off" (defaults to "off").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bit Steering</em>' containment reference.
	 * @see #setBitSteering(BitSteeringType1)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfaceType_BitSteering()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bitSteering' namespace='##targetNamespace'"
	 * @generated
	 */
	BitSteeringType1 getBitSteering();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getBitSteering <em>Bit Steering</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Steering</em>' containment reference.
	 * @see #getBitSteering()
	 * @generated
	 */
	void setBitSteering(BitSteeringType1 value);

	/**
	 * Returns the value of the '<em><b>Endianness</b></em>' attribute.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit._1685._2009.EndianessType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 'big': means the most significant element of any multi-element  data field is stored at the lowest memory address. 'little' means the least significant element of any multi-element data field is stored at the lowest memory address. If this element is not present the default is 'little' endian.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endianness</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.EndianessType
	 * @see #isSetEndianness()
	 * @see #unsetEndianness()
	 * @see #setEndianness(EndianessType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfaceType_Endianness()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='endianness' namespace='##targetNamespace'"
	 * @generated
	 */
	EndianessType getEndianness();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getEndianness <em>Endianness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endianness</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.EndianessType
	 * @see #isSetEndianness()
	 * @see #unsetEndianness()
	 * @see #getEndianness()
	 * @generated
	 */
	void setEndianness(EndianessType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getEndianness <em>Endianness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndianness()
	 * @see #getEndianness()
	 * @see #setEndianness(EndianessType)
	 * @generated
	 */
	void unsetEndianness();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getEndianness <em>Endianness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Endianness</em>' attribute is set.
	 * @see #unsetEndianness()
	 * @see #getEndianness()
	 * @see #setEndianness(EndianessType)
	 * @generated
	 */
	boolean isSetEndianness();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(ParametersType1)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfaceType_Parameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	ParametersType1 getParameters();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(ParametersType1 value);

	/**
	 * Returns the value of the '<em><b>Vendor Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for vendor specific extensions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #setVendorExtensions(VendorExtensionsType)
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfaceType_VendorExtensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vendorExtensions' namespace='##targetNamespace'"
	 * @generated
	 */
	VendorExtensionsType getVendorExtensions();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType#getVendorExtensions <em>Vendor Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #getVendorExtensions()
	 * @generated
	 */
	void setVendorExtensions(VendorExtensionsType value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package#getBusInterfaceType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':19' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // BusInterfaceType
