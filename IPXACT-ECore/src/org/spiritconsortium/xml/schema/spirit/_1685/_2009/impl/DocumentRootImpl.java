/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractionDefinitionType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorGeneratorsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.AccessType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.AdHocConnectionType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.AdHocConnectionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.AddrSpaceRefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.AddressBankType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.AddressBlockType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.AddressSpacesType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.BankAlignmentType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.BaseAddressType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfacesType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.CellSpecificationType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.CellStrengthValueType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ChannelsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ChoicesType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ClockDriverType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentGeneratorType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentGeneratorsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentInstanceType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentInstancesType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ConfigurableElementValueType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ConfigurableElementValuesType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.DefaultValueType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.DelayValueType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.DesignConfigurationType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.DocumentRoot;
import org.spiritconsortium.xml.schema.spirit._1685._2009.DriveConstraintType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.DriverType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.EdgeValueType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.EnumeratedValuesType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ExecutableImageType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetRefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.FileType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.FormatType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.GroupSelectorType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.InitiativeType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.InstanceGeneratorType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.InterconnectionType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.InterconnectionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.LoadConstraintType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.MemoryMapRefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.MemoryMapsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ModelType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorInterconnectionType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.NameValuePairType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.OtherClockDriverType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ParametersType1;
import org.spiritconsortium.xml.schema.spirit._1685._2009.PhaseType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.PortAccessTypeType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.PortType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.PresenceType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.RangeTypeType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.RemapStatesType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.RequiresDriverType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ResolveType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceTypeDefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceTypeDefsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.SingleShotDriverType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.TimingConstraintType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.TransTypeDefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.VectorType2;
import org.spiritconsortium.xml.schema.spirit._1685._2009.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.WireTypeDefType;
import org.spiritconsortium.xml.schema.spirit._1685._2009.WireTypeDefsType;
import org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getAbstractionDefinition <em>Abstraction Definition</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getAbstractorGenerator <em>Abstractor Generator</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getAbstractorGenerators <em>Abstractor Generators</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getCellSpecification <em>Cell Specification</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getChoices <em>Choices</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getClockDriver <em>Clock Driver</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getComponentGenerator <em>Component Generator</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getComponentGenerators <em>Component Generators</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getConstraintSet <em>Constraint Set</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getConstraintSetRef <em>Constraint Set Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getConstraintSets <em>Constraint Sets</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getDriveConstraint <em>Drive Constraint</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getExecutableImage <em>Executable Image</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getFile <em>File</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getFileSet <em>File Set</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getFileSetRef <em>File Set Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getFileSets <em>File Sets</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getGeneratorChain <em>Generator Chain</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getGeneratorRef <em>Generator Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getGroupSelector <em>Group Selector</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getInitiative <em>Initiative</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getLoadConstraint <em>Load Constraint</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getOtherClockDriver <em>Other Clock Driver</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getPortAccessHandle <em>Port Access Handle</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getPortAccessType <em>Port Access Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getPresence <em>Presence</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getRequiresDriver <em>Requires Driver</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getServiceTypeDef <em>Service Type Def</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getServiceTypeDefs <em>Service Type Defs</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getSingleShotDriver <em>Single Shot Driver</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getTimingConstraint <em>Timing Constraint</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getTransTypeDef <em>Trans Type Def</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getVector <em>Vector</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getWireTypeDef <em>Wire Type Def</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getWireTypeDefs <em>Wire Type Defs</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getBitStringLength <em>Bit String Length</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getCellStrength <em>Cell Strength</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getChoiceRef <em>Choice Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getClockEdge <em>Clock Edge</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getConfigGroups <em>Config Groups</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getConstraintSetId <em>Constraint Set Id</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getDelayType <em>Delay Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getDependency1 <em>Dependency1</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getRangeType <em>Range Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getResolve <em>Resolve</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getAbstractor <em>Abstractor</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getAddressBlock <em>Address Block</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getAddressSpaceRef <em>Address Space Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getAddressSpaces <em>Address Spaces</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getAddressUnitBits <em>Address Unit Bits</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getAdHocConnection <em>Ad Hoc Connection</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getAdHocConnections <em>Ad Hoc Connections</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getBank <em>Bank</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getBaseAddress <em>Base Address</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getBitsInLau <em>Bits In Lau</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getBusInterface <em>Bus Interface</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getBusInterfaces <em>Bus Interfaces</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getComponentInstances <em>Component Instances</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getConfigurableElementValue <em>Configurable Element Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getConfigurableElementValues <em>Configurable Element Values</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getEnumeratedValues <em>Enumerated Values</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getInterconnection <em>Interconnection</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getInterconnections <em>Interconnections</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getMemoryMapRef <em>Memory Map Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getMemoryMaps <em>Memory Maps</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getMonitorInterconnection <em>Monitor Interconnection</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getRegisterFile <em>Register File</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getRemapStates <em>Remap States</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getAddressSpaceRef1 <em>Address Space Ref1</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getBankAlignment <em>Bank Alignment</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getMasterRef <em>Master Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getMemoryMapRef1 <em>Memory Map Ref1</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getSegmentRef <em>Segment Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getBusDefinition <em>Bus Definition</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getDesign <em>Design</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit._1685._2009.impl.DocumentRootImpl#getDesignConfiguration <em>Design Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getConstraintSetRef() <em>Constraint Set Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintSetRef()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_SET_REF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDependency() <em>Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDENCY_EDEFAULT = null;

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
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getGeneratorRef() <em>Generator Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorRef()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATOR_REF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInitiative() <em>Initiative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiative()
	 * @generated
	 * @ordered
	 */
	protected static final InitiativeType INITIATIVE_EDEFAULT = InitiativeType.REQUIRES;

	/**
	 * The default value of the '{@link #getPortAccessHandle() <em>Port Access Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortAccessHandle()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_ACCESS_HANDLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPortAccessType() <em>Port Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortAccessType()
	 * @generated
	 * @ordered
	 */
	protected static final PortAccessTypeType PORT_ACCESS_TYPE_EDEFAULT = PortAccessTypeType.REF;

	/**
	 * The default value of the '{@link #getPresence() <em>Presence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresence()
	 * @generated
	 * @ordered
	 */
	protected static final PresenceType PRESENCE_EDEFAULT = PresenceType.OPTIONAL;

	/**
	 * The default value of the '{@link #getBitStringLength() <em>Bit String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitStringLength()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BIT_STRING_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBitStringLength() <em>Bit String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitStringLength()
	 * @generated
	 * @ordered
	 */
	protected BigInteger bitStringLength = BIT_STRING_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCellStrength() <em>Cell Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellStrength()
	 * @generated
	 * @ordered
	 */
	protected static final CellStrengthValueType CELL_STRENGTH_EDEFAULT = CellStrengthValueType.LOW;

	/**
	 * The cached value of the '{@link #getCellStrength() <em>Cell Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellStrength()
	 * @generated
	 * @ordered
	 */
	protected CellStrengthValueType cellStrength = CELL_STRENGTH_EDEFAULT;

	/**
	 * This is true if the Cell Strength attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cellStrengthESet;

	/**
	 * The default value of the '{@link #getChoiceRef() <em>Choice Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoiceRef()
	 * @generated
	 * @ordered
	 */
	protected static final String CHOICE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChoiceRef() <em>Choice Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoiceRef()
	 * @generated
	 * @ordered
	 */
	protected String choiceRef = CHOICE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getClockEdge() <em>Clock Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockEdge()
	 * @generated
	 * @ordered
	 */
	protected static final EdgeValueType CLOCK_EDGE_EDEFAULT = EdgeValueType.RISE;

	/**
	 * The cached value of the '{@link #getClockEdge() <em>Clock Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockEdge()
	 * @generated
	 * @ordered
	 */
	protected EdgeValueType clockEdge = CLOCK_EDGE_EDEFAULT;

	/**
	 * This is true if the Clock Edge attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clockEdgeESet;

	/**
	 * The default value of the '{@link #getConfigGroups() <em>Config Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigGroups()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> CONFIG_GROUPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigGroups() <em>Config Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigGroups()
	 * @generated
	 * @ordered
	 */
	protected List<String> configGroups = CONFIG_GROUPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstraintSetId() <em>Constraint Set Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintSetId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_SET_ID_EDEFAULT = "default";

	/**
	 * The cached value of the '{@link #getConstraintSetId() <em>Constraint Set Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintSetId()
	 * @generated
	 * @ordered
	 */
	protected String constraintSetId = CONSTRAINT_SET_ID_EDEFAULT;

	/**
	 * This is true if the Constraint Set Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean constraintSetIdESet;

	/**
	 * The default value of the '{@link #getDelayType() <em>Delay Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayType()
	 * @generated
	 * @ordered
	 */
	protected static final DelayValueType DELAY_TYPE_EDEFAULT = DelayValueType.MIN;

	/**
	 * The cached value of the '{@link #getDelayType() <em>Delay Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayType()
	 * @generated
	 * @ordered
	 */
	protected DelayValueType delayType = DELAY_TYPE_EDEFAULT;

	/**
	 * This is true if the Delay Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean delayTypeESet;

	/**
	 * The default value of the '{@link #getDependency1() <em>Dependency1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency1()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDENCY1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependency1() <em>Dependency1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency1()
	 * @generated
	 * @ordered
	 */
	protected String dependency1 = DEPENDENCY1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final FormatType FORMAT_EDEFAULT = FormatType.BIT_STRING;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected FormatType format = FORMAT_EDEFAULT;

	/**
	 * This is true if the Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean formatESet;

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
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected String maximum = MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected String minimum = MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final float ORDER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected float order = ORDER_EDEFAULT;

	/**
	 * This is true if the Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orderESet;

	/**
	 * The default value of the '{@link #getPrompt() <em>Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrompt()
	 * @generated
	 * @ordered
	 */
	protected static final String PROMPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrompt() <em>Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrompt()
	 * @generated
	 * @ordered
	 */
	protected String prompt = PROMPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRangeType() <em>Range Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeType()
	 * @generated
	 * @ordered
	 */
	protected static final RangeTypeType RANGE_TYPE_EDEFAULT = RangeTypeType.FLOAT;

	/**
	 * The cached value of the '{@link #getRangeType() <em>Range Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeType()
	 * @generated
	 * @ordered
	 */
	protected RangeTypeType rangeType = RANGE_TYPE_EDEFAULT;

	/**
	 * This is true if the Range Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rangeTypeESet;

	/**
	 * The default value of the '{@link #getResolve() <em>Resolve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolve()
	 * @generated
	 * @ordered
	 */
	protected static final ResolveType RESOLVE_EDEFAULT = ResolveType.IMMEDIATE;

	/**
	 * The cached value of the '{@link #getResolve() <em>Resolve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolve()
	 * @generated
	 * @ordered
	 */
	protected ResolveType resolve = RESOLVE_EDEFAULT;

	/**
	 * This is true if the Resolve attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resolveESet;

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
	 * The default value of the '{@link #getAddressUnitBits() <em>Address Unit Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressUnitBits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ADDRESS_UNIT_BITS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBitsInLau() <em>Bits In Lau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitsInLau()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BITS_IN_LAU_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInstanceName() <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getAddressSpaceRef1() <em>Address Space Ref1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressSpaceRef1()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_SPACE_REF1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressSpaceRef1() <em>Address Space Ref1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressSpaceRef1()
	 * @generated
	 * @ordered
	 */
	protected String addressSpaceRef1 = ADDRESS_SPACE_REF1_EDEFAULT;

	/**
	 * The default value of the '{@link #getBankAlignment() <em>Bank Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final BankAlignmentType BANK_ALIGNMENT_EDEFAULT = BankAlignmentType.SERIAL;

	/**
	 * The cached value of the '{@link #getBankAlignment() <em>Bank Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankAlignment()
	 * @generated
	 * @ordered
	 */
	protected BankAlignmentType bankAlignment = BANK_ALIGNMENT_EDEFAULT;

	/**
	 * This is true if the Bank Alignment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bankAlignmentESet;

	/**
	 * The default value of the '{@link #getMasterRef() <em>Master Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterRef()
	 * @generated
	 * @ordered
	 */
	protected static final String MASTER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMasterRef() <em>Master Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterRef()
	 * @generated
	 * @ordered
	 */
	protected String masterRef = MASTER_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryMapRef1() <em>Memory Map Ref1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMapRef1()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMORY_MAP_REF1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemoryMapRef1() <em>Memory Map Ref1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMapRef1()
	 * @generated
	 * @ordered
	 */
	protected String memoryMapRef1 = MEMORY_MAP_REF1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSegmentRef() <em>Segment Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentRef()
	 * @generated
	 * @ordered
	 */
	protected static final String SEGMENT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSegmentRef() <em>Segment Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentRef()
	 * @generated
	 * @ordered
	 */
	protected String segmentRef = SEGMENT_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2009Package.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, _2009Package.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _2009Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _2009Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractionDefinitionType getAbstractionDefinition() {
		return (AbstractionDefinitionType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_AbstractionDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractionDefinition(AbstractionDefinitionType newAbstractionDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_AbstractionDefinition(), newAbstractionDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractionDefinition(AbstractionDefinitionType newAbstractionDefinition) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_AbstractionDefinition(), newAbstractionDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceGeneratorType getAbstractorGenerator() {
		return (InstanceGeneratorType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_AbstractorGenerator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractorGenerator(InstanceGeneratorType newAbstractorGenerator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_AbstractorGenerator(), newAbstractorGenerator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractorGenerator(InstanceGeneratorType newAbstractorGenerator) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_AbstractorGenerator(), newAbstractorGenerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorGeneratorsType getAbstractorGenerators() {
		return (AbstractorGeneratorsType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_AbstractorGenerators(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractorGenerators(AbstractorGeneratorsType newAbstractorGenerators, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_AbstractorGenerators(), newAbstractorGenerators, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractorGenerators(AbstractorGeneratorsType newAbstractorGenerators) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_AbstractorGenerators(), newAbstractorGenerators);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellSpecificationType getCellSpecification() {
		return (CellSpecificationType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_CellSpecification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCellSpecification(CellSpecificationType newCellSpecification, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_CellSpecification(), newCellSpecification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellSpecification(CellSpecificationType newCellSpecification) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_CellSpecification(), newCellSpecification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoicesType getChoices() {
		return (ChoicesType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Choices(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChoices(ChoicesType newChoices, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_Choices(), newChoices, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoices(ChoicesType newChoices) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Choices(), newChoices);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockDriverType1 getClockDriver() {
		return (ClockDriverType1)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_ClockDriver(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClockDriver(ClockDriverType1 newClockDriver, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_ClockDriver(), newClockDriver, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockDriver(ClockDriverType1 newClockDriver) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_ClockDriver(), newClockDriver);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentGeneratorType getComponentGenerator() {
		return (ComponentGeneratorType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_ComponentGenerator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentGenerator(ComponentGeneratorType newComponentGenerator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_ComponentGenerator(), newComponentGenerator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentGenerator(ComponentGeneratorType newComponentGenerator) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_ComponentGenerator(), newComponentGenerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentGeneratorsType getComponentGenerators() {
		return (ComponentGeneratorsType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_ComponentGenerators(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentGenerators(ComponentGeneratorsType newComponentGenerators, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_ComponentGenerators(), newComponentGenerators, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentGenerators(ComponentGeneratorsType newComponentGenerators) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_ComponentGenerators(), newComponentGenerators);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSetType getConstraintSet() {
		return (ConstraintSetType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_ConstraintSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraintSet(ConstraintSetType newConstraintSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_ConstraintSet(), newConstraintSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintSet(ConstraintSetType newConstraintSet) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_ConstraintSet(), newConstraintSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraintSetRef() {
		return (String)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_ConstraintSetRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintSetRef(String newConstraintSetRef) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_ConstraintSetRef(), newConstraintSetRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSetsType getConstraintSets() {
		return (ConstraintSetsType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_ConstraintSets(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraintSets(ConstraintSetsType newConstraintSets, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_ConstraintSets(), newConstraintSets, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintSets(ConstraintSetsType newConstraintSets) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_ConstraintSets(), newConstraintSets);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultValueType getDefaultValue() {
		return (DefaultValueType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_DefaultValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(DefaultValueType newDefaultValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_DefaultValue(), newDefaultValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(DefaultValueType newDefaultValue) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_DefaultValue(), newDefaultValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDependency() {
		return (String)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Dependency(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependency(String newDependency) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Dependency(), newDependency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return (String)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_DisplayName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_DisplayName(), newDisplayName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriveConstraintType getDriveConstraint() {
		return (DriveConstraintType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_DriveConstraint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDriveConstraint(DriveConstraintType newDriveConstraint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_DriveConstraint(), newDriveConstraint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriveConstraint(DriveConstraintType newDriveConstraint) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_DriveConstraint(), newDriveConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriverType getDriver() {
		return (DriverType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Driver(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDriver(DriverType newDriver, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_Driver(), newDriver, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriver(DriverType newDriver) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Driver(), newDriver);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableImageType getExecutableImage() {
		return (ExecutableImageType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_ExecutableImage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutableImage(ExecutableImageType newExecutableImage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_ExecutableImage(), newExecutableImage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutableImage(ExecutableImageType newExecutableImage) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_ExecutableImage(), newExecutableImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getFile() {
		return (FileType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_File(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFile(FileType newFile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_File(), newFile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(FileType newFile) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_File(), newFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSetType getFileSet() {
		return (FileSetType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_FileSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileSet(FileSetType newFileSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_FileSet(), newFileSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileSet(FileSetType newFileSet) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_FileSet(), newFileSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSetRefType getFileSetRef() {
		return (FileSetRefType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_FileSetRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileSetRef(FileSetRefType newFileSetRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_FileSetRef(), newFileSetRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileSetRef(FileSetRefType newFileSetRef) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_FileSetRef(), newFileSetRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSetsType getFileSets() {
		return (FileSetsType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_FileSets(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileSets(FileSetsType newFileSets, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_FileSets(), newFileSets, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileSets(FileSetsType newFileSets) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_FileSets(), newFileSets);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorType getGenerator() {
		return (GeneratorType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Generator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerator(GeneratorType newGenerator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_Generator(), newGenerator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(GeneratorType newGenerator) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Generator(), newGenerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorChainType getGeneratorChain() {
		return (GeneratorChainType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_GeneratorChain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratorChain(GeneratorChainType newGeneratorChain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_GeneratorChain(), newGeneratorChain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorChain(GeneratorChainType newGeneratorChain) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_GeneratorChain(), newGeneratorChain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneratorRef() {
		return (String)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_GeneratorRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorRef(String newGeneratorRef) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_GeneratorRef(), newGeneratorRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupSelectorType getGroupSelector() {
		return (GroupSelectorType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_GroupSelector(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupSelector(GroupSelectorType newGroupSelector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_GroupSelector(), newGroupSelector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupSelector(GroupSelectorType newGroupSelector) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_GroupSelector(), newGroupSelector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiativeType getInitiative() {
		return (InitiativeType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Initiative(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiative(InitiativeType newInitiative) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Initiative(), newInitiative);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadConstraintType getLoadConstraint() {
		return (LoadConstraintType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_LoadConstraint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadConstraint(LoadConstraintType newLoadConstraint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_LoadConstraint(), newLoadConstraint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadConstraint(LoadConstraintType newLoadConstraint) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_LoadConstraint(), newLoadConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherClockDriverType getOtherClockDriver() {
		return (OtherClockDriverType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_OtherClockDriver(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherClockDriver(OtherClockDriverType newOtherClockDriver, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_OtherClockDriver(), newOtherClockDriver, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherClockDriver(OtherClockDriverType newOtherClockDriver) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_OtherClockDriver(), newOtherClockDriver);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameValuePairType getParameter() {
		return (NameValuePairType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Parameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(NameValuePairType newParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_Parameter(), newParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(NameValuePairType newParameter) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Parameter(), newParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersType1 getParameters() {
		return (ParametersType1)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Parameters(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(ParametersType1 newParameters, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_Parameters(), newParameters, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(ParametersType1 newParameters) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Parameters(), newParameters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseType getPhase() {
		return (PhaseType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Phase(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhase(PhaseType newPhase, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_Phase(), newPhase, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(PhaseType newPhase) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Phase(), newPhase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType getPort() {
		return (PortType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Port(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort(PortType newPort, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_Port(), newPort, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(PortType newPort) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Port(), newPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortAccessHandle() {
		return (String)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_PortAccessHandle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortAccessHandle(String newPortAccessHandle) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_PortAccessHandle(), newPortAccessHandle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortAccessTypeType getPortAccessType() {
		return (PortAccessTypeType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_PortAccessType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortAccessType(PortAccessTypeType newPortAccessType) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_PortAccessType(), newPortAccessType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresenceType getPresence() {
		return (PresenceType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Presence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresence(PresenceType newPresence) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Presence(), newPresence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiresDriverType getRequiresDriver() {
		return (RequiresDriverType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_RequiresDriver(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiresDriver(RequiresDriverType newRequiresDriver, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_RequiresDriver(), newRequiresDriver, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiresDriver(RequiresDriverType newRequiresDriver) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_RequiresDriver(), newRequiresDriver);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTypeDefType getServiceTypeDef() {
		return (ServiceTypeDefType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_ServiceTypeDef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceTypeDef(ServiceTypeDefType newServiceTypeDef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_ServiceTypeDef(), newServiceTypeDef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceTypeDef(ServiceTypeDefType newServiceTypeDef) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_ServiceTypeDef(), newServiceTypeDef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTypeDefsType getServiceTypeDefs() {
		return (ServiceTypeDefsType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_ServiceTypeDefs(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceTypeDefs(ServiceTypeDefsType newServiceTypeDefs, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_ServiceTypeDefs(), newServiceTypeDefs, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceTypeDefs(ServiceTypeDefsType newServiceTypeDefs) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_ServiceTypeDefs(), newServiceTypeDefs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleShotDriverType getSingleShotDriver() {
		return (SingleShotDriverType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_SingleShotDriver(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleShotDriver(SingleShotDriverType newSingleShotDriver, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_SingleShotDriver(), newSingleShotDriver, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleShotDriver(SingleShotDriverType newSingleShotDriver) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_SingleShotDriver(), newSingleShotDriver);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingConstraintType getTimingConstraint() {
		return (TimingConstraintType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_TimingConstraint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingConstraint(TimingConstraintType newTimingConstraint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_TimingConstraint(), newTimingConstraint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingConstraint(TimingConstraintType newTimingConstraint) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_TimingConstraint(), newTimingConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransTypeDefType getTransTypeDef() {
		return (TransTypeDefType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_TransTypeDef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransTypeDef(TransTypeDefType newTransTypeDef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_TransTypeDef(), newTransTypeDef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransTypeDef(TransTypeDefType newTransTypeDef) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_TransTypeDef(), newTransTypeDef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorType2 getVector() {
		return (VectorType2)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Vector(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVector(VectorType2 newVector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_Vector(), newVector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVector(VectorType2 newVector) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Vector(), newVector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorExtensionsType getVendorExtensions() {
		return (VendorExtensionsType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_VendorExtensions(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVendorExtensions(VendorExtensionsType newVendorExtensions, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_VendorExtensions(), newVendorExtensions, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendorExtensions(VendorExtensionsType newVendorExtensions) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_VendorExtensions(), newVendorExtensions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireTypeDefType getWireTypeDef() {
		return (WireTypeDefType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_WireTypeDef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWireTypeDef(WireTypeDefType newWireTypeDef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_WireTypeDef(), newWireTypeDef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWireTypeDef(WireTypeDefType newWireTypeDef) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_WireTypeDef(), newWireTypeDef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireTypeDefsType getWireTypeDefs() {
		return (WireTypeDefsType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_WireTypeDefs(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWireTypeDefs(WireTypeDefsType newWireTypeDefs, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_WireTypeDefs(), newWireTypeDefs, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWireTypeDefs(WireTypeDefsType newWireTypeDefs) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_WireTypeDefs(), newWireTypeDefs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBitStringLength() {
		return bitStringLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitStringLength(BigInteger newBitStringLength) {
		BigInteger oldBitStringLength = bitStringLength;
		bitStringLength = newBitStringLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DOCUMENT_ROOT__BIT_STRING_LENGTH, oldBitStringLength, bitStringLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellStrengthValueType getCellStrength() {
		return cellStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellStrength(CellStrengthValueType newCellStrength) {
		CellStrengthValueType oldCellStrength = cellStrength;
		cellStrength = newCellStrength == null ? CELL_STRENGTH_EDEFAULT : newCellStrength;
		boolean oldCellStrengthESet = cellStrengthESet;
		cellStrengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DOCUMENT_ROOT__CELL_STRENGTH, oldCellStrength, cellStrength, !oldCellStrengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCellStrength() {
		CellStrengthValueType oldCellStrength = cellStrength;
		boolean oldCellStrengthESet = cellStrengthESet;
		cellStrength = CELL_STRENGTH_EDEFAULT;
		cellStrengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.DOCUMENT_ROOT__CELL_STRENGTH, oldCellStrength, CELL_STRENGTH_EDEFAULT, oldCellStrengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCellStrength() {
		return cellStrengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChoiceRef() {
		return choiceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoiceRef(String newChoiceRef) {
		String oldChoiceRef = choiceRef;
		choiceRef = newChoiceRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DOCUMENT_ROOT__CHOICE_REF, oldChoiceRef, choiceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeValueType getClockEdge() {
		return clockEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockEdge(EdgeValueType newClockEdge) {
		EdgeValueType oldClockEdge = clockEdge;
		clockEdge = newClockEdge == null ? CLOCK_EDGE_EDEFAULT : newClockEdge;
		boolean oldClockEdgeESet = clockEdgeESet;
		clockEdgeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DOCUMENT_ROOT__CLOCK_EDGE, oldClockEdge, clockEdge, !oldClockEdgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClockEdge() {
		EdgeValueType oldClockEdge = clockEdge;
		boolean oldClockEdgeESet = clockEdgeESet;
		clockEdge = CLOCK_EDGE_EDEFAULT;
		clockEdgeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.DOCUMENT_ROOT__CLOCK_EDGE, oldClockEdge, CLOCK_EDGE_EDEFAULT, oldClockEdgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClockEdge() {
		return clockEdgeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getConfigGroups() {
		return configGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigGroups(List<String> newConfigGroups) {
		List<String> oldConfigGroups = configGroups;
		configGroups = newConfigGroups;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DOCUMENT_ROOT__CONFIG_GROUPS, oldConfigGroups, configGroups));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraintSetId() {
		return constraintSetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintSetId(String newConstraintSetId) {
		String oldConstraintSetId = constraintSetId;
		constraintSetId = newConstraintSetId;
		boolean oldConstraintSetIdESet = constraintSetIdESet;
		constraintSetIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DOCUMENT_ROOT__CONSTRAINT_SET_ID, oldConstraintSetId, constraintSetId, !oldConstraintSetIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConstraintSetId() {
		String oldConstraintSetId = constraintSetId;
		boolean oldConstraintSetIdESet = constraintSetIdESet;
		constraintSetId = CONSTRAINT_SET_ID_EDEFAULT;
		constraintSetIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.DOCUMENT_ROOT__CONSTRAINT_SET_ID, oldConstraintSetId, CONSTRAINT_SET_ID_EDEFAULT, oldConstraintSetIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstraintSetId() {
		return constraintSetIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayValueType getDelayType() {
		return delayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelayType(DelayValueType newDelayType) {
		DelayValueType oldDelayType = delayType;
		delayType = newDelayType == null ? DELAY_TYPE_EDEFAULT : newDelayType;
		boolean oldDelayTypeESet = delayTypeESet;
		delayTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DOCUMENT_ROOT__DELAY_TYPE, oldDelayType, delayType, !oldDelayTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDelayType() {
		DelayValueType oldDelayType = delayType;
		boolean oldDelayTypeESet = delayTypeESet;
		delayType = DELAY_TYPE_EDEFAULT;
		delayTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.DOCUMENT_ROOT__DELAY_TYPE, oldDelayType, DELAY_TYPE_EDEFAULT, oldDelayTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDelayType() {
		return delayTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDependency1() {
		return dependency1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependency1(String newDependency1) {
		String oldDependency1 = dependency1;
		dependency1 = newDependency1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DOCUMENT_ROOT__DEPENDENCY1, oldDependency1, dependency1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatType getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(FormatType newFormat) {
		FormatType oldFormat = format;
		format = newFormat == null ? FORMAT_EDEFAULT : newFormat;
		boolean oldFormatESet = formatESet;
		formatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DOCUMENT_ROOT__FORMAT, oldFormat, format, !oldFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFormat() {
		FormatType oldFormat = format;
		boolean oldFormatESet = formatESet;
		format = FORMAT_EDEFAULT;
		formatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.DOCUMENT_ROOT__FORMAT, oldFormat, FORMAT_EDEFAULT, oldFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFormat() {
		return formatESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DOCUMENT_ROOT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(String newMaximum) {
		String oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DOCUMENT_ROOT__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(String newMinimum) {
		String oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DOCUMENT_ROOT__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(float newOrder) {
		float oldOrder = order;
		order = newOrder;
		boolean oldOrderESet = orderESet;
		orderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DOCUMENT_ROOT__ORDER, oldOrder, order, !oldOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrder() {
		float oldOrder = order;
		boolean oldOrderESet = orderESet;
		order = ORDER_EDEFAULT;
		orderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.DOCUMENT_ROOT__ORDER, oldOrder, ORDER_EDEFAULT, oldOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrder() {
		return orderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrompt() {
		return prompt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrompt(String newPrompt) {
		String oldPrompt = prompt;
		prompt = newPrompt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DOCUMENT_ROOT__PROMPT, oldPrompt, prompt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeTypeType getRangeType() {
		return rangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeType(RangeTypeType newRangeType) {
		RangeTypeType oldRangeType = rangeType;
		rangeType = newRangeType == null ? RANGE_TYPE_EDEFAULT : newRangeType;
		boolean oldRangeTypeESet = rangeTypeESet;
		rangeTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DOCUMENT_ROOT__RANGE_TYPE, oldRangeType, rangeType, !oldRangeTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRangeType() {
		RangeTypeType oldRangeType = rangeType;
		boolean oldRangeTypeESet = rangeTypeESet;
		rangeType = RANGE_TYPE_EDEFAULT;
		rangeTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.DOCUMENT_ROOT__RANGE_TYPE, oldRangeType, RANGE_TYPE_EDEFAULT, oldRangeTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRangeType() {
		return rangeTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveType getResolve() {
		return resolve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolve(ResolveType newResolve) {
		ResolveType oldResolve = resolve;
		resolve = newResolve == null ? RESOLVE_EDEFAULT : newResolve;
		boolean oldResolveESet = resolveESet;
		resolveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DOCUMENT_ROOT__RESOLVE, oldResolve, resolve, !oldResolveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResolve() {
		ResolveType oldResolve = resolve;
		boolean oldResolveESet = resolveESet;
		resolve = RESOLVE_EDEFAULT;
		resolveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.DOCUMENT_ROOT__RESOLVE, oldResolve, RESOLVE_EDEFAULT, oldResolveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResolve() {
		return resolveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorType1 getAbstractor() {
		return (AbstractorType1)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Abstractor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractor(AbstractorType1 newAbstractor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_Abstractor(), newAbstractor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractor(AbstractorType1 newAbstractor) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Abstractor(), newAbstractor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType getAccess() {
		return (AccessType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Access(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(AccessType newAccess) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Access(), newAccess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressBlockType getAddressBlock() {
		return (AddressBlockType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_AddressBlock(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressBlock(AddressBlockType newAddressBlock, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_AddressBlock(), newAddressBlock, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressBlock(AddressBlockType newAddressBlock) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_AddressBlock(), newAddressBlock);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddrSpaceRefType getAddressSpaceRef() {
		return (AddrSpaceRefType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_AddressSpaceRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressSpaceRef(AddrSpaceRefType newAddressSpaceRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_AddressSpaceRef(), newAddressSpaceRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressSpaceRef(AddrSpaceRefType newAddressSpaceRef) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_AddressSpaceRef(), newAddressSpaceRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSpacesType getAddressSpaces() {
		return (AddressSpacesType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_AddressSpaces(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressSpaces(AddressSpacesType newAddressSpaces, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_AddressSpaces(), newAddressSpaces, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressSpaces(AddressSpacesType newAddressSpaces) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_AddressSpaces(), newAddressSpaces);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAddressUnitBits() {
		return (BigInteger)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_AddressUnitBits(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressUnitBits(BigInteger newAddressUnitBits) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_AddressUnitBits(), newAddressUnitBits);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdHocConnectionType getAdHocConnection() {
		return (AdHocConnectionType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_AdHocConnection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdHocConnection(AdHocConnectionType newAdHocConnection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_AdHocConnection(), newAdHocConnection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdHocConnection(AdHocConnectionType newAdHocConnection) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_AdHocConnection(), newAdHocConnection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdHocConnectionsType getAdHocConnections() {
		return (AdHocConnectionsType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_AdHocConnections(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdHocConnections(AdHocConnectionsType newAdHocConnections, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_AdHocConnections(), newAdHocConnections, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdHocConnections(AdHocConnectionsType newAdHocConnections) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_AdHocConnections(), newAdHocConnections);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressBankType getBank() {
		return (AddressBankType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Bank(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBank(AddressBankType newBank, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_Bank(), newBank, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBank(AddressBankType newBank) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Bank(), newBank);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseAddressType1 getBaseAddress() {
		return (BaseAddressType1)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_BaseAddress(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseAddress(BaseAddressType1 newBaseAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_BaseAddress(), newBaseAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseAddress(BaseAddressType1 newBaseAddress) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_BaseAddress(), newBaseAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBitsInLau() {
		return (BigInteger)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_BitsInLau(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitsInLau(BigInteger newBitsInLau) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_BitsInLau(), newBitsInLau);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusInterfaceType getBusInterface() {
		return (BusInterfaceType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_BusInterface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusInterface(BusInterfaceType newBusInterface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_BusInterface(), newBusInterface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusInterface(BusInterfaceType newBusInterface) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_BusInterface(), newBusInterface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusInterfacesType getBusInterfaces() {
		return (BusInterfacesType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_BusInterfaces(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusInterfaces(BusInterfacesType newBusInterfaces, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_BusInterfaces(), newBusInterfaces, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusInterfaces(BusInterfacesType newBusInterfaces) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_BusInterfaces(), newBusInterfaces);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelsType getChannels() {
		return (ChannelsType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Channels(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannels(ChannelsType newChannels, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_Channels(), newChannels, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannels(ChannelsType newChannels) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Channels(), newChannels);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceType getComponentInstance() {
		return (ComponentInstanceType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_ComponentInstance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentInstance(ComponentInstanceType newComponentInstance, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_ComponentInstance(), newComponentInstance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstance(ComponentInstanceType newComponentInstance) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_ComponentInstance(), newComponentInstance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstancesType getComponentInstances() {
		return (ComponentInstancesType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_ComponentInstances(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentInstances(ComponentInstancesType newComponentInstances, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_ComponentInstances(), newComponentInstances, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstances(ComponentInstancesType newComponentInstances) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_ComponentInstances(), newComponentInstances);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurableElementValueType getConfigurableElementValue() {
		return (ConfigurableElementValueType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_ConfigurableElementValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurableElementValue(ConfigurableElementValueType newConfigurableElementValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_ConfigurableElementValue(), newConfigurableElementValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurableElementValue(ConfigurableElementValueType newConfigurableElementValue) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_ConfigurableElementValue(), newConfigurableElementValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurableElementValuesType getConfigurableElementValues() {
		return (ConfigurableElementValuesType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_ConfigurableElementValues(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurableElementValues(ConfigurableElementValuesType newConfigurableElementValues, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_ConfigurableElementValues(), newConfigurableElementValues, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurableElementValues(ConfigurableElementValuesType newConfigurableElementValues) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_ConfigurableElementValues(), newConfigurableElementValues);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedValuesType getEnumeratedValues() {
		return (EnumeratedValuesType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_EnumeratedValues(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumeratedValues(EnumeratedValuesType newEnumeratedValues, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_EnumeratedValues(), newEnumeratedValues, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumeratedValues(EnumeratedValuesType newEnumeratedValues) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_EnumeratedValues(), newEnumeratedValues);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroup() {
		return (String)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Group(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(String newGroup) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Group(), newGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceName() {
		return (String)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_InstanceName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceName(String newInstanceName) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_InstanceName(), newInstanceName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterconnectionType getInterconnection() {
		return (InterconnectionType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Interconnection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterconnection(InterconnectionType newInterconnection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_Interconnection(), newInterconnection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterconnection(InterconnectionType newInterconnection) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Interconnection(), newInterconnection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterconnectionsType getInterconnections() {
		return (InterconnectionsType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Interconnections(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterconnections(InterconnectionsType newInterconnections, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_Interconnections(), newInterconnections, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterconnections(InterconnectionsType newInterconnections) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Interconnections(), newInterconnections);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMapRefType getMemoryMapRef() {
		return (MemoryMapRefType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_MemoryMapRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemoryMapRef(MemoryMapRefType newMemoryMapRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_MemoryMapRef(), newMemoryMapRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryMapRef(MemoryMapRefType newMemoryMapRef) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_MemoryMapRef(), newMemoryMapRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMapsType getMemoryMaps() {
		return (MemoryMapsType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_MemoryMaps(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemoryMaps(MemoryMapsType newMemoryMaps, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_MemoryMaps(), newMemoryMaps, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryMaps(MemoryMapsType newMemoryMaps) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_MemoryMaps(), newMemoryMaps);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType getModel() {
		return (ModelType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Model(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(ModelType newModel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_Model(), newModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(ModelType newModel) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Model(), newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorInterconnectionType getMonitorInterconnection() {
		return (MonitorInterconnectionType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_MonitorInterconnection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitorInterconnection(MonitorInterconnectionType newMonitorInterconnection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_MonitorInterconnection(), newMonitorInterconnection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitorInterconnection(MonitorInterconnectionType newMonitorInterconnection) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_MonitorInterconnection(), newMonitorInterconnection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterFileType getRegisterFile() {
		return (RegisterFileType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_RegisterFile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisterFile(RegisterFileType newRegisterFile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_RegisterFile(), newRegisterFile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterFile(RegisterFileType newRegisterFile) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_RegisterFile(), newRegisterFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemapStatesType getRemapStates() {
		return (RemapStatesType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_RemapStates(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemapStates(RemapStatesType newRemapStates, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_RemapStates(), newRemapStates, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemapStates(RemapStatesType newRemapStates) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_RemapStates(), newRemapStates);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVolatile() {
		return (Boolean)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Volatile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolatile(boolean newVolatile) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Volatile(), newVolatile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddressSpaceRef1() {
		return addressSpaceRef1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressSpaceRef1(String newAddressSpaceRef1) {
		String oldAddressSpaceRef1 = addressSpaceRef1;
		addressSpaceRef1 = newAddressSpaceRef1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DOCUMENT_ROOT__ADDRESS_SPACE_REF1, oldAddressSpaceRef1, addressSpaceRef1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankAlignmentType getBankAlignment() {
		return bankAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBankAlignment(BankAlignmentType newBankAlignment) {
		BankAlignmentType oldBankAlignment = bankAlignment;
		bankAlignment = newBankAlignment == null ? BANK_ALIGNMENT_EDEFAULT : newBankAlignment;
		boolean oldBankAlignmentESet = bankAlignmentESet;
		bankAlignmentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DOCUMENT_ROOT__BANK_ALIGNMENT, oldBankAlignment, bankAlignment, !oldBankAlignmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBankAlignment() {
		BankAlignmentType oldBankAlignment = bankAlignment;
		boolean oldBankAlignmentESet = bankAlignmentESet;
		bankAlignment = BANK_ALIGNMENT_EDEFAULT;
		bankAlignmentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2009Package.DOCUMENT_ROOT__BANK_ALIGNMENT, oldBankAlignment, BANK_ALIGNMENT_EDEFAULT, oldBankAlignmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBankAlignment() {
		return bankAlignmentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMasterRef() {
		return masterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterRef(String newMasterRef) {
		String oldMasterRef = masterRef;
		masterRef = newMasterRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DOCUMENT_ROOT__MASTER_REF, oldMasterRef, masterRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemoryMapRef1() {
		return memoryMapRef1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryMapRef1(String newMemoryMapRef1) {
		String oldMemoryMapRef1 = memoryMapRef1;
		memoryMapRef1 = newMemoryMapRef1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DOCUMENT_ROOT__MEMORY_MAP_REF1, oldMemoryMapRef1, memoryMapRef1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSegmentRef() {
		return segmentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSegmentRef(String newSegmentRef) {
		String oldSegmentRef = segmentRef;
		segmentRef = newSegmentRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2009Package.DOCUMENT_ROOT__SEGMENT_REF, oldSegmentRef, segmentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusDefinitionType getBusDefinition() {
		return (BusDefinitionType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_BusDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusDefinition(BusDefinitionType newBusDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_BusDefinition(), newBusDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusDefinition(BusDefinitionType newBusDefinition) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_BusDefinition(), newBusDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getComponent() {
		return (ComponentType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Component(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(ComponentType newComponent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_Component(), newComponent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(ComponentType newComponent) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Component(), newComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignType getDesign() {
		return (DesignType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_Design(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesign(DesignType newDesign, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_Design(), newDesign, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesign(DesignType newDesign) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_Design(), newDesign);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignConfigurationType getDesignConfiguration() {
		return (DesignConfigurationType)getMixed().get(_2009Package.eINSTANCE.getDocumentRoot_DesignConfiguration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignConfiguration(DesignConfigurationType newDesignConfiguration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2009Package.eINSTANCE.getDocumentRoot_DesignConfiguration(), newDesignConfiguration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignConfiguration(DesignConfigurationType newDesignConfiguration) {
		((FeatureMap.Internal)getMixed()).set(_2009Package.eINSTANCE.getDocumentRoot_DesignConfiguration(), newDesignConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2009Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case _2009Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case _2009Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case _2009Package.DOCUMENT_ROOT__ABSTRACTION_DEFINITION:
				return basicSetAbstractionDefinition(null, msgs);
			case _2009Package.DOCUMENT_ROOT__ABSTRACTOR_GENERATOR:
				return basicSetAbstractorGenerator(null, msgs);
			case _2009Package.DOCUMENT_ROOT__ABSTRACTOR_GENERATORS:
				return basicSetAbstractorGenerators(null, msgs);
			case _2009Package.DOCUMENT_ROOT__CELL_SPECIFICATION:
				return basicSetCellSpecification(null, msgs);
			case _2009Package.DOCUMENT_ROOT__CHOICES:
				return basicSetChoices(null, msgs);
			case _2009Package.DOCUMENT_ROOT__CLOCK_DRIVER:
				return basicSetClockDriver(null, msgs);
			case _2009Package.DOCUMENT_ROOT__COMPONENT_GENERATOR:
				return basicSetComponentGenerator(null, msgs);
			case _2009Package.DOCUMENT_ROOT__COMPONENT_GENERATORS:
				return basicSetComponentGenerators(null, msgs);
			case _2009Package.DOCUMENT_ROOT__CONSTRAINT_SET:
				return basicSetConstraintSet(null, msgs);
			case _2009Package.DOCUMENT_ROOT__CONSTRAINT_SETS:
				return basicSetConstraintSets(null, msgs);
			case _2009Package.DOCUMENT_ROOT__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
			case _2009Package.DOCUMENT_ROOT__DRIVE_CONSTRAINT:
				return basicSetDriveConstraint(null, msgs);
			case _2009Package.DOCUMENT_ROOT__DRIVER:
				return basicSetDriver(null, msgs);
			case _2009Package.DOCUMENT_ROOT__EXECUTABLE_IMAGE:
				return basicSetExecutableImage(null, msgs);
			case _2009Package.DOCUMENT_ROOT__FILE:
				return basicSetFile(null, msgs);
			case _2009Package.DOCUMENT_ROOT__FILE_SET:
				return basicSetFileSet(null, msgs);
			case _2009Package.DOCUMENT_ROOT__FILE_SET_REF:
				return basicSetFileSetRef(null, msgs);
			case _2009Package.DOCUMENT_ROOT__FILE_SETS:
				return basicSetFileSets(null, msgs);
			case _2009Package.DOCUMENT_ROOT__GENERATOR:
				return basicSetGenerator(null, msgs);
			case _2009Package.DOCUMENT_ROOT__GENERATOR_CHAIN:
				return basicSetGeneratorChain(null, msgs);
			case _2009Package.DOCUMENT_ROOT__GROUP_SELECTOR:
				return basicSetGroupSelector(null, msgs);
			case _2009Package.DOCUMENT_ROOT__LOAD_CONSTRAINT:
				return basicSetLoadConstraint(null, msgs);
			case _2009Package.DOCUMENT_ROOT__OTHER_CLOCK_DRIVER:
				return basicSetOtherClockDriver(null, msgs);
			case _2009Package.DOCUMENT_ROOT__PARAMETER:
				return basicSetParameter(null, msgs);
			case _2009Package.DOCUMENT_ROOT__PARAMETERS:
				return basicSetParameters(null, msgs);
			case _2009Package.DOCUMENT_ROOT__PHASE:
				return basicSetPhase(null, msgs);
			case _2009Package.DOCUMENT_ROOT__PORT:
				return basicSetPort(null, msgs);
			case _2009Package.DOCUMENT_ROOT__REQUIRES_DRIVER:
				return basicSetRequiresDriver(null, msgs);
			case _2009Package.DOCUMENT_ROOT__SERVICE_TYPE_DEF:
				return basicSetServiceTypeDef(null, msgs);
			case _2009Package.DOCUMENT_ROOT__SERVICE_TYPE_DEFS:
				return basicSetServiceTypeDefs(null, msgs);
			case _2009Package.DOCUMENT_ROOT__SINGLE_SHOT_DRIVER:
				return basicSetSingleShotDriver(null, msgs);
			case _2009Package.DOCUMENT_ROOT__TIMING_CONSTRAINT:
				return basicSetTimingConstraint(null, msgs);
			case _2009Package.DOCUMENT_ROOT__TRANS_TYPE_DEF:
				return basicSetTransTypeDef(null, msgs);
			case _2009Package.DOCUMENT_ROOT__VECTOR:
				return basicSetVector(null, msgs);
			case _2009Package.DOCUMENT_ROOT__VENDOR_EXTENSIONS:
				return basicSetVendorExtensions(null, msgs);
			case _2009Package.DOCUMENT_ROOT__WIRE_TYPE_DEF:
				return basicSetWireTypeDef(null, msgs);
			case _2009Package.DOCUMENT_ROOT__WIRE_TYPE_DEFS:
				return basicSetWireTypeDefs(null, msgs);
			case _2009Package.DOCUMENT_ROOT__ABSTRACTOR:
				return basicSetAbstractor(null, msgs);
			case _2009Package.DOCUMENT_ROOT__ADDRESS_BLOCK:
				return basicSetAddressBlock(null, msgs);
			case _2009Package.DOCUMENT_ROOT__ADDRESS_SPACE_REF:
				return basicSetAddressSpaceRef(null, msgs);
			case _2009Package.DOCUMENT_ROOT__ADDRESS_SPACES:
				return basicSetAddressSpaces(null, msgs);
			case _2009Package.DOCUMENT_ROOT__AD_HOC_CONNECTION:
				return basicSetAdHocConnection(null, msgs);
			case _2009Package.DOCUMENT_ROOT__AD_HOC_CONNECTIONS:
				return basicSetAdHocConnections(null, msgs);
			case _2009Package.DOCUMENT_ROOT__BANK:
				return basicSetBank(null, msgs);
			case _2009Package.DOCUMENT_ROOT__BASE_ADDRESS:
				return basicSetBaseAddress(null, msgs);
			case _2009Package.DOCUMENT_ROOT__BUS_INTERFACE:
				return basicSetBusInterface(null, msgs);
			case _2009Package.DOCUMENT_ROOT__BUS_INTERFACES:
				return basicSetBusInterfaces(null, msgs);
			case _2009Package.DOCUMENT_ROOT__CHANNELS:
				return basicSetChannels(null, msgs);
			case _2009Package.DOCUMENT_ROOT__COMPONENT_INSTANCE:
				return basicSetComponentInstance(null, msgs);
			case _2009Package.DOCUMENT_ROOT__COMPONENT_INSTANCES:
				return basicSetComponentInstances(null, msgs);
			case _2009Package.DOCUMENT_ROOT__CONFIGURABLE_ELEMENT_VALUE:
				return basicSetConfigurableElementValue(null, msgs);
			case _2009Package.DOCUMENT_ROOT__CONFIGURABLE_ELEMENT_VALUES:
				return basicSetConfigurableElementValues(null, msgs);
			case _2009Package.DOCUMENT_ROOT__ENUMERATED_VALUES:
				return basicSetEnumeratedValues(null, msgs);
			case _2009Package.DOCUMENT_ROOT__INTERCONNECTION:
				return basicSetInterconnection(null, msgs);
			case _2009Package.DOCUMENT_ROOT__INTERCONNECTIONS:
				return basicSetInterconnections(null, msgs);
			case _2009Package.DOCUMENT_ROOT__MEMORY_MAP_REF:
				return basicSetMemoryMapRef(null, msgs);
			case _2009Package.DOCUMENT_ROOT__MEMORY_MAPS:
				return basicSetMemoryMaps(null, msgs);
			case _2009Package.DOCUMENT_ROOT__MODEL:
				return basicSetModel(null, msgs);
			case _2009Package.DOCUMENT_ROOT__MONITOR_INTERCONNECTION:
				return basicSetMonitorInterconnection(null, msgs);
			case _2009Package.DOCUMENT_ROOT__REGISTER_FILE:
				return basicSetRegisterFile(null, msgs);
			case _2009Package.DOCUMENT_ROOT__REMAP_STATES:
				return basicSetRemapStates(null, msgs);
			case _2009Package.DOCUMENT_ROOT__BUS_DEFINITION:
				return basicSetBusDefinition(null, msgs);
			case _2009Package.DOCUMENT_ROOT__COMPONENT:
				return basicSetComponent(null, msgs);
			case _2009Package.DOCUMENT_ROOT__DESIGN:
				return basicSetDesign(null, msgs);
			case _2009Package.DOCUMENT_ROOT__DESIGN_CONFIGURATION:
				return basicSetDesignConfiguration(null, msgs);
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
			case _2009Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case _2009Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case _2009Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case _2009Package.DOCUMENT_ROOT__ABSTRACTION_DEFINITION:
				return getAbstractionDefinition();
			case _2009Package.DOCUMENT_ROOT__ABSTRACTOR_GENERATOR:
				return getAbstractorGenerator();
			case _2009Package.DOCUMENT_ROOT__ABSTRACTOR_GENERATORS:
				return getAbstractorGenerators();
			case _2009Package.DOCUMENT_ROOT__CELL_SPECIFICATION:
				return getCellSpecification();
			case _2009Package.DOCUMENT_ROOT__CHOICES:
				return getChoices();
			case _2009Package.DOCUMENT_ROOT__CLOCK_DRIVER:
				return getClockDriver();
			case _2009Package.DOCUMENT_ROOT__COMPONENT_GENERATOR:
				return getComponentGenerator();
			case _2009Package.DOCUMENT_ROOT__COMPONENT_GENERATORS:
				return getComponentGenerators();
			case _2009Package.DOCUMENT_ROOT__CONSTRAINT_SET:
				return getConstraintSet();
			case _2009Package.DOCUMENT_ROOT__CONSTRAINT_SET_REF:
				return getConstraintSetRef();
			case _2009Package.DOCUMENT_ROOT__CONSTRAINT_SETS:
				return getConstraintSets();
			case _2009Package.DOCUMENT_ROOT__DEFAULT_VALUE:
				return getDefaultValue();
			case _2009Package.DOCUMENT_ROOT__DEPENDENCY:
				return getDependency();
			case _2009Package.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case _2009Package.DOCUMENT_ROOT__DISPLAY_NAME:
				return getDisplayName();
			case _2009Package.DOCUMENT_ROOT__DRIVE_CONSTRAINT:
				return getDriveConstraint();
			case _2009Package.DOCUMENT_ROOT__DRIVER:
				return getDriver();
			case _2009Package.DOCUMENT_ROOT__EXECUTABLE_IMAGE:
				return getExecutableImage();
			case _2009Package.DOCUMENT_ROOT__FILE:
				return getFile();
			case _2009Package.DOCUMENT_ROOT__FILE_SET:
				return getFileSet();
			case _2009Package.DOCUMENT_ROOT__FILE_SET_REF:
				return getFileSetRef();
			case _2009Package.DOCUMENT_ROOT__FILE_SETS:
				return getFileSets();
			case _2009Package.DOCUMENT_ROOT__GENERATOR:
				return getGenerator();
			case _2009Package.DOCUMENT_ROOT__GENERATOR_CHAIN:
				return getGeneratorChain();
			case _2009Package.DOCUMENT_ROOT__GENERATOR_REF:
				return getGeneratorRef();
			case _2009Package.DOCUMENT_ROOT__GROUP_SELECTOR:
				return getGroupSelector();
			case _2009Package.DOCUMENT_ROOT__INITIATIVE:
				return getInitiative();
			case _2009Package.DOCUMENT_ROOT__LOAD_CONSTRAINT:
				return getLoadConstraint();
			case _2009Package.DOCUMENT_ROOT__OTHER_CLOCK_DRIVER:
				return getOtherClockDriver();
			case _2009Package.DOCUMENT_ROOT__PARAMETER:
				return getParameter();
			case _2009Package.DOCUMENT_ROOT__PARAMETERS:
				return getParameters();
			case _2009Package.DOCUMENT_ROOT__PHASE:
				return getPhase();
			case _2009Package.DOCUMENT_ROOT__PORT:
				return getPort();
			case _2009Package.DOCUMENT_ROOT__PORT_ACCESS_HANDLE:
				return getPortAccessHandle();
			case _2009Package.DOCUMENT_ROOT__PORT_ACCESS_TYPE:
				return getPortAccessType();
			case _2009Package.DOCUMENT_ROOT__PRESENCE:
				return getPresence();
			case _2009Package.DOCUMENT_ROOT__REQUIRES_DRIVER:
				return getRequiresDriver();
			case _2009Package.DOCUMENT_ROOT__SERVICE_TYPE_DEF:
				return getServiceTypeDef();
			case _2009Package.DOCUMENT_ROOT__SERVICE_TYPE_DEFS:
				return getServiceTypeDefs();
			case _2009Package.DOCUMENT_ROOT__SINGLE_SHOT_DRIVER:
				return getSingleShotDriver();
			case _2009Package.DOCUMENT_ROOT__TIMING_CONSTRAINT:
				return getTimingConstraint();
			case _2009Package.DOCUMENT_ROOT__TRANS_TYPE_DEF:
				return getTransTypeDef();
			case _2009Package.DOCUMENT_ROOT__VECTOR:
				return getVector();
			case _2009Package.DOCUMENT_ROOT__VENDOR_EXTENSIONS:
				return getVendorExtensions();
			case _2009Package.DOCUMENT_ROOT__WIRE_TYPE_DEF:
				return getWireTypeDef();
			case _2009Package.DOCUMENT_ROOT__WIRE_TYPE_DEFS:
				return getWireTypeDefs();
			case _2009Package.DOCUMENT_ROOT__BIT_STRING_LENGTH:
				return getBitStringLength();
			case _2009Package.DOCUMENT_ROOT__CELL_STRENGTH:
				return getCellStrength();
			case _2009Package.DOCUMENT_ROOT__CHOICE_REF:
				return getChoiceRef();
			case _2009Package.DOCUMENT_ROOT__CLOCK_EDGE:
				return getClockEdge();
			case _2009Package.DOCUMENT_ROOT__CONFIG_GROUPS:
				return getConfigGroups();
			case _2009Package.DOCUMENT_ROOT__CONSTRAINT_SET_ID:
				return getConstraintSetId();
			case _2009Package.DOCUMENT_ROOT__DELAY_TYPE:
				return getDelayType();
			case _2009Package.DOCUMENT_ROOT__DEPENDENCY1:
				return getDependency1();
			case _2009Package.DOCUMENT_ROOT__FORMAT:
				return getFormat();
			case _2009Package.DOCUMENT_ROOT__ID:
				return getId();
			case _2009Package.DOCUMENT_ROOT__MAXIMUM:
				return getMaximum();
			case _2009Package.DOCUMENT_ROOT__MINIMUM:
				return getMinimum();
			case _2009Package.DOCUMENT_ROOT__ORDER:
				return getOrder();
			case _2009Package.DOCUMENT_ROOT__PROMPT:
				return getPrompt();
			case _2009Package.DOCUMENT_ROOT__RANGE_TYPE:
				return getRangeType();
			case _2009Package.DOCUMENT_ROOT__RESOLVE:
				return getResolve();
			case _2009Package.DOCUMENT_ROOT__ABSTRACTOR:
				return getAbstractor();
			case _2009Package.DOCUMENT_ROOT__ACCESS:
				return getAccess();
			case _2009Package.DOCUMENT_ROOT__ADDRESS_BLOCK:
				return getAddressBlock();
			case _2009Package.DOCUMENT_ROOT__ADDRESS_SPACE_REF:
				return getAddressSpaceRef();
			case _2009Package.DOCUMENT_ROOT__ADDRESS_SPACES:
				return getAddressSpaces();
			case _2009Package.DOCUMENT_ROOT__ADDRESS_UNIT_BITS:
				return getAddressUnitBits();
			case _2009Package.DOCUMENT_ROOT__AD_HOC_CONNECTION:
				return getAdHocConnection();
			case _2009Package.DOCUMENT_ROOT__AD_HOC_CONNECTIONS:
				return getAdHocConnections();
			case _2009Package.DOCUMENT_ROOT__BANK:
				return getBank();
			case _2009Package.DOCUMENT_ROOT__BASE_ADDRESS:
				return getBaseAddress();
			case _2009Package.DOCUMENT_ROOT__BITS_IN_LAU:
				return getBitsInLau();
			case _2009Package.DOCUMENT_ROOT__BUS_INTERFACE:
				return getBusInterface();
			case _2009Package.DOCUMENT_ROOT__BUS_INTERFACES:
				return getBusInterfaces();
			case _2009Package.DOCUMENT_ROOT__CHANNELS:
				return getChannels();
			case _2009Package.DOCUMENT_ROOT__COMPONENT_INSTANCE:
				return getComponentInstance();
			case _2009Package.DOCUMENT_ROOT__COMPONENT_INSTANCES:
				return getComponentInstances();
			case _2009Package.DOCUMENT_ROOT__CONFIGURABLE_ELEMENT_VALUE:
				return getConfigurableElementValue();
			case _2009Package.DOCUMENT_ROOT__CONFIGURABLE_ELEMENT_VALUES:
				return getConfigurableElementValues();
			case _2009Package.DOCUMENT_ROOT__ENUMERATED_VALUES:
				return getEnumeratedValues();
			case _2009Package.DOCUMENT_ROOT__GROUP:
				return getGroup();
			case _2009Package.DOCUMENT_ROOT__INSTANCE_NAME:
				return getInstanceName();
			case _2009Package.DOCUMENT_ROOT__INTERCONNECTION:
				return getInterconnection();
			case _2009Package.DOCUMENT_ROOT__INTERCONNECTIONS:
				return getInterconnections();
			case _2009Package.DOCUMENT_ROOT__MEMORY_MAP_REF:
				return getMemoryMapRef();
			case _2009Package.DOCUMENT_ROOT__MEMORY_MAPS:
				return getMemoryMaps();
			case _2009Package.DOCUMENT_ROOT__MODEL:
				return getModel();
			case _2009Package.DOCUMENT_ROOT__MONITOR_INTERCONNECTION:
				return getMonitorInterconnection();
			case _2009Package.DOCUMENT_ROOT__REGISTER_FILE:
				return getRegisterFile();
			case _2009Package.DOCUMENT_ROOT__REMAP_STATES:
				return getRemapStates();
			case _2009Package.DOCUMENT_ROOT__VOLATILE:
				return isVolatile();
			case _2009Package.DOCUMENT_ROOT__ADDRESS_SPACE_REF1:
				return getAddressSpaceRef1();
			case _2009Package.DOCUMENT_ROOT__BANK_ALIGNMENT:
				return getBankAlignment();
			case _2009Package.DOCUMENT_ROOT__MASTER_REF:
				return getMasterRef();
			case _2009Package.DOCUMENT_ROOT__MEMORY_MAP_REF1:
				return getMemoryMapRef1();
			case _2009Package.DOCUMENT_ROOT__SEGMENT_REF:
				return getSegmentRef();
			case _2009Package.DOCUMENT_ROOT__BUS_DEFINITION:
				return getBusDefinition();
			case _2009Package.DOCUMENT_ROOT__COMPONENT:
				return getComponent();
			case _2009Package.DOCUMENT_ROOT__DESIGN:
				return getDesign();
			case _2009Package.DOCUMENT_ROOT__DESIGN_CONFIGURATION:
				return getDesignConfiguration();
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
			case _2009Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__ABSTRACTION_DEFINITION:
				setAbstractionDefinition((AbstractionDefinitionType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__ABSTRACTOR_GENERATOR:
				setAbstractorGenerator((InstanceGeneratorType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__ABSTRACTOR_GENERATORS:
				setAbstractorGenerators((AbstractorGeneratorsType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__CELL_SPECIFICATION:
				setCellSpecification((CellSpecificationType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__CHOICES:
				setChoices((ChoicesType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__CLOCK_DRIVER:
				setClockDriver((ClockDriverType1)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__COMPONENT_GENERATOR:
				setComponentGenerator((ComponentGeneratorType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__COMPONENT_GENERATORS:
				setComponentGenerators((ComponentGeneratorsType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__CONSTRAINT_SET:
				setConstraintSet((ConstraintSetType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__CONSTRAINT_SET_REF:
				setConstraintSetRef((String)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__CONSTRAINT_SETS:
				setConstraintSets((ConstraintSetsType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__DEFAULT_VALUE:
				setDefaultValue((DefaultValueType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__DEPENDENCY:
				setDependency((String)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__DRIVE_CONSTRAINT:
				setDriveConstraint((DriveConstraintType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__DRIVER:
				setDriver((DriverType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__EXECUTABLE_IMAGE:
				setExecutableImage((ExecutableImageType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__FILE:
				setFile((FileType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__FILE_SET:
				setFileSet((FileSetType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__FILE_SET_REF:
				setFileSetRef((FileSetRefType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__FILE_SETS:
				setFileSets((FileSetsType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__GENERATOR:
				setGenerator((GeneratorType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__GENERATOR_CHAIN:
				setGeneratorChain((GeneratorChainType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__GENERATOR_REF:
				setGeneratorRef((String)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__GROUP_SELECTOR:
				setGroupSelector((GroupSelectorType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__INITIATIVE:
				setInitiative((InitiativeType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__LOAD_CONSTRAINT:
				setLoadConstraint((LoadConstraintType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__OTHER_CLOCK_DRIVER:
				setOtherClockDriver((OtherClockDriverType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__PARAMETER:
				setParameter((NameValuePairType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__PARAMETERS:
				setParameters((ParametersType1)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__PHASE:
				setPhase((PhaseType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__PORT:
				setPort((PortType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__PORT_ACCESS_HANDLE:
				setPortAccessHandle((String)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__PORT_ACCESS_TYPE:
				setPortAccessType((PortAccessTypeType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__PRESENCE:
				setPresence((PresenceType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__REQUIRES_DRIVER:
				setRequiresDriver((RequiresDriverType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__SERVICE_TYPE_DEF:
				setServiceTypeDef((ServiceTypeDefType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__SERVICE_TYPE_DEFS:
				setServiceTypeDefs((ServiceTypeDefsType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__SINGLE_SHOT_DRIVER:
				setSingleShotDriver((SingleShotDriverType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__TIMING_CONSTRAINT:
				setTimingConstraint((TimingConstraintType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__TRANS_TYPE_DEF:
				setTransTypeDef((TransTypeDefType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__VECTOR:
				setVector((VectorType2)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__WIRE_TYPE_DEF:
				setWireTypeDef((WireTypeDefType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__WIRE_TYPE_DEFS:
				setWireTypeDefs((WireTypeDefsType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__BIT_STRING_LENGTH:
				setBitStringLength((BigInteger)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__CELL_STRENGTH:
				setCellStrength((CellStrengthValueType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__CHOICE_REF:
				setChoiceRef((String)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__CLOCK_EDGE:
				setClockEdge((EdgeValueType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__CONFIG_GROUPS:
				setConfigGroups((List<String>)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__CONSTRAINT_SET_ID:
				setConstraintSetId((String)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__DELAY_TYPE:
				setDelayType((DelayValueType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__DEPENDENCY1:
				setDependency1((String)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__FORMAT:
				setFormat((FormatType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__ID:
				setId((String)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__MAXIMUM:
				setMaximum((String)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__MINIMUM:
				setMinimum((String)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__ORDER:
				setOrder((Float)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__PROMPT:
				setPrompt((String)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__RANGE_TYPE:
				setRangeType((RangeTypeType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__RESOLVE:
				setResolve((ResolveType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__ABSTRACTOR:
				setAbstractor((AbstractorType1)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__ACCESS:
				setAccess((AccessType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__ADDRESS_BLOCK:
				setAddressBlock((AddressBlockType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__ADDRESS_SPACE_REF:
				setAddressSpaceRef((AddrSpaceRefType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__ADDRESS_SPACES:
				setAddressSpaces((AddressSpacesType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__ADDRESS_UNIT_BITS:
				setAddressUnitBits((BigInteger)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__AD_HOC_CONNECTION:
				setAdHocConnection((AdHocConnectionType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__AD_HOC_CONNECTIONS:
				setAdHocConnections((AdHocConnectionsType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__BANK:
				setBank((AddressBankType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__BASE_ADDRESS:
				setBaseAddress((BaseAddressType1)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__BITS_IN_LAU:
				setBitsInLau((BigInteger)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__BUS_INTERFACE:
				setBusInterface((BusInterfaceType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__BUS_INTERFACES:
				setBusInterfaces((BusInterfacesType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__CHANNELS:
				setChannels((ChannelsType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstanceType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__COMPONENT_INSTANCES:
				setComponentInstances((ComponentInstancesType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__CONFIGURABLE_ELEMENT_VALUE:
				setConfigurableElementValue((ConfigurableElementValueType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__CONFIGURABLE_ELEMENT_VALUES:
				setConfigurableElementValues((ConfigurableElementValuesType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__ENUMERATED_VALUES:
				setEnumeratedValues((EnumeratedValuesType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__GROUP:
				setGroup((String)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__INSTANCE_NAME:
				setInstanceName((String)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__INTERCONNECTION:
				setInterconnection((InterconnectionType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__INTERCONNECTIONS:
				setInterconnections((InterconnectionsType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__MEMORY_MAP_REF:
				setMemoryMapRef((MemoryMapRefType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__MEMORY_MAPS:
				setMemoryMaps((MemoryMapsType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__MODEL:
				setModel((ModelType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__MONITOR_INTERCONNECTION:
				setMonitorInterconnection((MonitorInterconnectionType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__REGISTER_FILE:
				setRegisterFile((RegisterFileType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__REMAP_STATES:
				setRemapStates((RemapStatesType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__VOLATILE:
				setVolatile((Boolean)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__ADDRESS_SPACE_REF1:
				setAddressSpaceRef1((String)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__BANK_ALIGNMENT:
				setBankAlignment((BankAlignmentType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__MASTER_REF:
				setMasterRef((String)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__MEMORY_MAP_REF1:
				setMemoryMapRef1((String)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__SEGMENT_REF:
				setSegmentRef((String)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__BUS_DEFINITION:
				setBusDefinition((BusDefinitionType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__COMPONENT:
				setComponent((ComponentType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__DESIGN:
				setDesign((DesignType)newValue);
				return;
			case _2009Package.DOCUMENT_ROOT__DESIGN_CONFIGURATION:
				setDesignConfiguration((DesignConfigurationType)newValue);
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
			case _2009Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case _2009Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case _2009Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case _2009Package.DOCUMENT_ROOT__ABSTRACTION_DEFINITION:
				setAbstractionDefinition((AbstractionDefinitionType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__ABSTRACTOR_GENERATOR:
				setAbstractorGenerator((InstanceGeneratorType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__ABSTRACTOR_GENERATORS:
				setAbstractorGenerators((AbstractorGeneratorsType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__CELL_SPECIFICATION:
				setCellSpecification((CellSpecificationType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__CHOICES:
				setChoices((ChoicesType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__CLOCK_DRIVER:
				setClockDriver((ClockDriverType1)null);
				return;
			case _2009Package.DOCUMENT_ROOT__COMPONENT_GENERATOR:
				setComponentGenerator((ComponentGeneratorType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__COMPONENT_GENERATORS:
				setComponentGenerators((ComponentGeneratorsType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__CONSTRAINT_SET:
				setConstraintSet((ConstraintSetType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__CONSTRAINT_SET_REF:
				setConstraintSetRef(CONSTRAINT_SET_REF_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__CONSTRAINT_SETS:
				setConstraintSets((ConstraintSetsType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__DEFAULT_VALUE:
				setDefaultValue((DefaultValueType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__DEPENDENCY:
				setDependency(DEPENDENCY_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__DRIVE_CONSTRAINT:
				setDriveConstraint((DriveConstraintType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__DRIVER:
				setDriver((DriverType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__EXECUTABLE_IMAGE:
				setExecutableImage((ExecutableImageType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__FILE:
				setFile((FileType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__FILE_SET:
				setFileSet((FileSetType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__FILE_SET_REF:
				setFileSetRef((FileSetRefType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__FILE_SETS:
				setFileSets((FileSetsType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__GENERATOR:
				setGenerator((GeneratorType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__GENERATOR_CHAIN:
				setGeneratorChain((GeneratorChainType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__GENERATOR_REF:
				setGeneratorRef(GENERATOR_REF_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__GROUP_SELECTOR:
				setGroupSelector((GroupSelectorType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__INITIATIVE:
				setInitiative(INITIATIVE_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__LOAD_CONSTRAINT:
				setLoadConstraint((LoadConstraintType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__OTHER_CLOCK_DRIVER:
				setOtherClockDriver((OtherClockDriverType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__PARAMETER:
				setParameter((NameValuePairType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__PARAMETERS:
				setParameters((ParametersType1)null);
				return;
			case _2009Package.DOCUMENT_ROOT__PHASE:
				setPhase((PhaseType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__PORT:
				setPort((PortType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__PORT_ACCESS_HANDLE:
				setPortAccessHandle(PORT_ACCESS_HANDLE_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__PORT_ACCESS_TYPE:
				setPortAccessType(PORT_ACCESS_TYPE_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__PRESENCE:
				setPresence(PRESENCE_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__REQUIRES_DRIVER:
				setRequiresDriver((RequiresDriverType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__SERVICE_TYPE_DEF:
				setServiceTypeDef((ServiceTypeDefType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__SERVICE_TYPE_DEFS:
				setServiceTypeDefs((ServiceTypeDefsType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__SINGLE_SHOT_DRIVER:
				setSingleShotDriver((SingleShotDriverType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__TIMING_CONSTRAINT:
				setTimingConstraint((TimingConstraintType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__TRANS_TYPE_DEF:
				setTransTypeDef((TransTypeDefType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__VECTOR:
				setVector((VectorType2)null);
				return;
			case _2009Package.DOCUMENT_ROOT__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__WIRE_TYPE_DEF:
				setWireTypeDef((WireTypeDefType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__WIRE_TYPE_DEFS:
				setWireTypeDefs((WireTypeDefsType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__BIT_STRING_LENGTH:
				setBitStringLength(BIT_STRING_LENGTH_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__CELL_STRENGTH:
				unsetCellStrength();
				return;
			case _2009Package.DOCUMENT_ROOT__CHOICE_REF:
				setChoiceRef(CHOICE_REF_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__CLOCK_EDGE:
				unsetClockEdge();
				return;
			case _2009Package.DOCUMENT_ROOT__CONFIG_GROUPS:
				setConfigGroups(CONFIG_GROUPS_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__CONSTRAINT_SET_ID:
				unsetConstraintSetId();
				return;
			case _2009Package.DOCUMENT_ROOT__DELAY_TYPE:
				unsetDelayType();
				return;
			case _2009Package.DOCUMENT_ROOT__DEPENDENCY1:
				setDependency1(DEPENDENCY1_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__FORMAT:
				unsetFormat();
				return;
			case _2009Package.DOCUMENT_ROOT__ID:
				setId(ID_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__ORDER:
				unsetOrder();
				return;
			case _2009Package.DOCUMENT_ROOT__PROMPT:
				setPrompt(PROMPT_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__RANGE_TYPE:
				unsetRangeType();
				return;
			case _2009Package.DOCUMENT_ROOT__RESOLVE:
				unsetResolve();
				return;
			case _2009Package.DOCUMENT_ROOT__ABSTRACTOR:
				setAbstractor((AbstractorType1)null);
				return;
			case _2009Package.DOCUMENT_ROOT__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__ADDRESS_BLOCK:
				setAddressBlock((AddressBlockType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__ADDRESS_SPACE_REF:
				setAddressSpaceRef((AddrSpaceRefType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__ADDRESS_SPACES:
				setAddressSpaces((AddressSpacesType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__ADDRESS_UNIT_BITS:
				setAddressUnitBits(ADDRESS_UNIT_BITS_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__AD_HOC_CONNECTION:
				setAdHocConnection((AdHocConnectionType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__AD_HOC_CONNECTIONS:
				setAdHocConnections((AdHocConnectionsType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__BANK:
				setBank((AddressBankType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__BASE_ADDRESS:
				setBaseAddress((BaseAddressType1)null);
				return;
			case _2009Package.DOCUMENT_ROOT__BITS_IN_LAU:
				setBitsInLau(BITS_IN_LAU_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__BUS_INTERFACE:
				setBusInterface((BusInterfaceType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__BUS_INTERFACES:
				setBusInterfaces((BusInterfacesType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__CHANNELS:
				setChannels((ChannelsType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstanceType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__COMPONENT_INSTANCES:
				setComponentInstances((ComponentInstancesType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__CONFIGURABLE_ELEMENT_VALUE:
				setConfigurableElementValue((ConfigurableElementValueType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__CONFIGURABLE_ELEMENT_VALUES:
				setConfigurableElementValues((ConfigurableElementValuesType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__ENUMERATED_VALUES:
				setEnumeratedValues((EnumeratedValuesType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__INSTANCE_NAME:
				setInstanceName(INSTANCE_NAME_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__INTERCONNECTION:
				setInterconnection((InterconnectionType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__INTERCONNECTIONS:
				setInterconnections((InterconnectionsType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__MEMORY_MAP_REF:
				setMemoryMapRef((MemoryMapRefType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__MEMORY_MAPS:
				setMemoryMaps((MemoryMapsType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__MODEL:
				setModel((ModelType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__MONITOR_INTERCONNECTION:
				setMonitorInterconnection((MonitorInterconnectionType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__REGISTER_FILE:
				setRegisterFile((RegisterFileType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__REMAP_STATES:
				setRemapStates((RemapStatesType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__VOLATILE:
				setVolatile(VOLATILE_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__ADDRESS_SPACE_REF1:
				setAddressSpaceRef1(ADDRESS_SPACE_REF1_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__BANK_ALIGNMENT:
				unsetBankAlignment();
				return;
			case _2009Package.DOCUMENT_ROOT__MASTER_REF:
				setMasterRef(MASTER_REF_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__MEMORY_MAP_REF1:
				setMemoryMapRef1(MEMORY_MAP_REF1_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__SEGMENT_REF:
				setSegmentRef(SEGMENT_REF_EDEFAULT);
				return;
			case _2009Package.DOCUMENT_ROOT__BUS_DEFINITION:
				setBusDefinition((BusDefinitionType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__COMPONENT:
				setComponent((ComponentType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__DESIGN:
				setDesign((DesignType)null);
				return;
			case _2009Package.DOCUMENT_ROOT__DESIGN_CONFIGURATION:
				setDesignConfiguration((DesignConfigurationType)null);
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
			case _2009Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case _2009Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case _2009Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case _2009Package.DOCUMENT_ROOT__ABSTRACTION_DEFINITION:
				return getAbstractionDefinition() != null;
			case _2009Package.DOCUMENT_ROOT__ABSTRACTOR_GENERATOR:
				return getAbstractorGenerator() != null;
			case _2009Package.DOCUMENT_ROOT__ABSTRACTOR_GENERATORS:
				return getAbstractorGenerators() != null;
			case _2009Package.DOCUMENT_ROOT__CELL_SPECIFICATION:
				return getCellSpecification() != null;
			case _2009Package.DOCUMENT_ROOT__CHOICES:
				return getChoices() != null;
			case _2009Package.DOCUMENT_ROOT__CLOCK_DRIVER:
				return getClockDriver() != null;
			case _2009Package.DOCUMENT_ROOT__COMPONENT_GENERATOR:
				return getComponentGenerator() != null;
			case _2009Package.DOCUMENT_ROOT__COMPONENT_GENERATORS:
				return getComponentGenerators() != null;
			case _2009Package.DOCUMENT_ROOT__CONSTRAINT_SET:
				return getConstraintSet() != null;
			case _2009Package.DOCUMENT_ROOT__CONSTRAINT_SET_REF:
				return CONSTRAINT_SET_REF_EDEFAULT == null ? getConstraintSetRef() != null : !CONSTRAINT_SET_REF_EDEFAULT.equals(getConstraintSetRef());
			case _2009Package.DOCUMENT_ROOT__CONSTRAINT_SETS:
				return getConstraintSets() != null;
			case _2009Package.DOCUMENT_ROOT__DEFAULT_VALUE:
				return getDefaultValue() != null;
			case _2009Package.DOCUMENT_ROOT__DEPENDENCY:
				return DEPENDENCY_EDEFAULT == null ? getDependency() != null : !DEPENDENCY_EDEFAULT.equals(getDependency());
			case _2009Package.DOCUMENT_ROOT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case _2009Package.DOCUMENT_ROOT__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? getDisplayName() != null : !DISPLAY_NAME_EDEFAULT.equals(getDisplayName());
			case _2009Package.DOCUMENT_ROOT__DRIVE_CONSTRAINT:
				return getDriveConstraint() != null;
			case _2009Package.DOCUMENT_ROOT__DRIVER:
				return getDriver() != null;
			case _2009Package.DOCUMENT_ROOT__EXECUTABLE_IMAGE:
				return getExecutableImage() != null;
			case _2009Package.DOCUMENT_ROOT__FILE:
				return getFile() != null;
			case _2009Package.DOCUMENT_ROOT__FILE_SET:
				return getFileSet() != null;
			case _2009Package.DOCUMENT_ROOT__FILE_SET_REF:
				return getFileSetRef() != null;
			case _2009Package.DOCUMENT_ROOT__FILE_SETS:
				return getFileSets() != null;
			case _2009Package.DOCUMENT_ROOT__GENERATOR:
				return getGenerator() != null;
			case _2009Package.DOCUMENT_ROOT__GENERATOR_CHAIN:
				return getGeneratorChain() != null;
			case _2009Package.DOCUMENT_ROOT__GENERATOR_REF:
				return GENERATOR_REF_EDEFAULT == null ? getGeneratorRef() != null : !GENERATOR_REF_EDEFAULT.equals(getGeneratorRef());
			case _2009Package.DOCUMENT_ROOT__GROUP_SELECTOR:
				return getGroupSelector() != null;
			case _2009Package.DOCUMENT_ROOT__INITIATIVE:
				return getInitiative() != INITIATIVE_EDEFAULT;
			case _2009Package.DOCUMENT_ROOT__LOAD_CONSTRAINT:
				return getLoadConstraint() != null;
			case _2009Package.DOCUMENT_ROOT__OTHER_CLOCK_DRIVER:
				return getOtherClockDriver() != null;
			case _2009Package.DOCUMENT_ROOT__PARAMETER:
				return getParameter() != null;
			case _2009Package.DOCUMENT_ROOT__PARAMETERS:
				return getParameters() != null;
			case _2009Package.DOCUMENT_ROOT__PHASE:
				return getPhase() != null;
			case _2009Package.DOCUMENT_ROOT__PORT:
				return getPort() != null;
			case _2009Package.DOCUMENT_ROOT__PORT_ACCESS_HANDLE:
				return PORT_ACCESS_HANDLE_EDEFAULT == null ? getPortAccessHandle() != null : !PORT_ACCESS_HANDLE_EDEFAULT.equals(getPortAccessHandle());
			case _2009Package.DOCUMENT_ROOT__PORT_ACCESS_TYPE:
				return getPortAccessType() != PORT_ACCESS_TYPE_EDEFAULT;
			case _2009Package.DOCUMENT_ROOT__PRESENCE:
				return getPresence() != PRESENCE_EDEFAULT;
			case _2009Package.DOCUMENT_ROOT__REQUIRES_DRIVER:
				return getRequiresDriver() != null;
			case _2009Package.DOCUMENT_ROOT__SERVICE_TYPE_DEF:
				return getServiceTypeDef() != null;
			case _2009Package.DOCUMENT_ROOT__SERVICE_TYPE_DEFS:
				return getServiceTypeDefs() != null;
			case _2009Package.DOCUMENT_ROOT__SINGLE_SHOT_DRIVER:
				return getSingleShotDriver() != null;
			case _2009Package.DOCUMENT_ROOT__TIMING_CONSTRAINT:
				return getTimingConstraint() != null;
			case _2009Package.DOCUMENT_ROOT__TRANS_TYPE_DEF:
				return getTransTypeDef() != null;
			case _2009Package.DOCUMENT_ROOT__VECTOR:
				return getVector() != null;
			case _2009Package.DOCUMENT_ROOT__VENDOR_EXTENSIONS:
				return getVendorExtensions() != null;
			case _2009Package.DOCUMENT_ROOT__WIRE_TYPE_DEF:
				return getWireTypeDef() != null;
			case _2009Package.DOCUMENT_ROOT__WIRE_TYPE_DEFS:
				return getWireTypeDefs() != null;
			case _2009Package.DOCUMENT_ROOT__BIT_STRING_LENGTH:
				return BIT_STRING_LENGTH_EDEFAULT == null ? bitStringLength != null : !BIT_STRING_LENGTH_EDEFAULT.equals(bitStringLength);
			case _2009Package.DOCUMENT_ROOT__CELL_STRENGTH:
				return isSetCellStrength();
			case _2009Package.DOCUMENT_ROOT__CHOICE_REF:
				return CHOICE_REF_EDEFAULT == null ? choiceRef != null : !CHOICE_REF_EDEFAULT.equals(choiceRef);
			case _2009Package.DOCUMENT_ROOT__CLOCK_EDGE:
				return isSetClockEdge();
			case _2009Package.DOCUMENT_ROOT__CONFIG_GROUPS:
				return CONFIG_GROUPS_EDEFAULT == null ? configGroups != null : !CONFIG_GROUPS_EDEFAULT.equals(configGroups);
			case _2009Package.DOCUMENT_ROOT__CONSTRAINT_SET_ID:
				return isSetConstraintSetId();
			case _2009Package.DOCUMENT_ROOT__DELAY_TYPE:
				return isSetDelayType();
			case _2009Package.DOCUMENT_ROOT__DEPENDENCY1:
				return DEPENDENCY1_EDEFAULT == null ? dependency1 != null : !DEPENDENCY1_EDEFAULT.equals(dependency1);
			case _2009Package.DOCUMENT_ROOT__FORMAT:
				return isSetFormat();
			case _2009Package.DOCUMENT_ROOT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case _2009Package.DOCUMENT_ROOT__MAXIMUM:
				return MAXIMUM_EDEFAULT == null ? maximum != null : !MAXIMUM_EDEFAULT.equals(maximum);
			case _2009Package.DOCUMENT_ROOT__MINIMUM:
				return MINIMUM_EDEFAULT == null ? minimum != null : !MINIMUM_EDEFAULT.equals(minimum);
			case _2009Package.DOCUMENT_ROOT__ORDER:
				return isSetOrder();
			case _2009Package.DOCUMENT_ROOT__PROMPT:
				return PROMPT_EDEFAULT == null ? prompt != null : !PROMPT_EDEFAULT.equals(prompt);
			case _2009Package.DOCUMENT_ROOT__RANGE_TYPE:
				return isSetRangeType();
			case _2009Package.DOCUMENT_ROOT__RESOLVE:
				return isSetResolve();
			case _2009Package.DOCUMENT_ROOT__ABSTRACTOR:
				return getAbstractor() != null;
			case _2009Package.DOCUMENT_ROOT__ACCESS:
				return ACCESS_EDEFAULT == null ? getAccess() != null : !ACCESS_EDEFAULT.equals(getAccess());
			case _2009Package.DOCUMENT_ROOT__ADDRESS_BLOCK:
				return getAddressBlock() != null;
			case _2009Package.DOCUMENT_ROOT__ADDRESS_SPACE_REF:
				return getAddressSpaceRef() != null;
			case _2009Package.DOCUMENT_ROOT__ADDRESS_SPACES:
				return getAddressSpaces() != null;
			case _2009Package.DOCUMENT_ROOT__ADDRESS_UNIT_BITS:
				return ADDRESS_UNIT_BITS_EDEFAULT == null ? getAddressUnitBits() != null : !ADDRESS_UNIT_BITS_EDEFAULT.equals(getAddressUnitBits());
			case _2009Package.DOCUMENT_ROOT__AD_HOC_CONNECTION:
				return getAdHocConnection() != null;
			case _2009Package.DOCUMENT_ROOT__AD_HOC_CONNECTIONS:
				return getAdHocConnections() != null;
			case _2009Package.DOCUMENT_ROOT__BANK:
				return getBank() != null;
			case _2009Package.DOCUMENT_ROOT__BASE_ADDRESS:
				return getBaseAddress() != null;
			case _2009Package.DOCUMENT_ROOT__BITS_IN_LAU:
				return BITS_IN_LAU_EDEFAULT == null ? getBitsInLau() != null : !BITS_IN_LAU_EDEFAULT.equals(getBitsInLau());
			case _2009Package.DOCUMENT_ROOT__BUS_INTERFACE:
				return getBusInterface() != null;
			case _2009Package.DOCUMENT_ROOT__BUS_INTERFACES:
				return getBusInterfaces() != null;
			case _2009Package.DOCUMENT_ROOT__CHANNELS:
				return getChannels() != null;
			case _2009Package.DOCUMENT_ROOT__COMPONENT_INSTANCE:
				return getComponentInstance() != null;
			case _2009Package.DOCUMENT_ROOT__COMPONENT_INSTANCES:
				return getComponentInstances() != null;
			case _2009Package.DOCUMENT_ROOT__CONFIGURABLE_ELEMENT_VALUE:
				return getConfigurableElementValue() != null;
			case _2009Package.DOCUMENT_ROOT__CONFIGURABLE_ELEMENT_VALUES:
				return getConfigurableElementValues() != null;
			case _2009Package.DOCUMENT_ROOT__ENUMERATED_VALUES:
				return getEnumeratedValues() != null;
			case _2009Package.DOCUMENT_ROOT__GROUP:
				return GROUP_EDEFAULT == null ? getGroup() != null : !GROUP_EDEFAULT.equals(getGroup());
			case _2009Package.DOCUMENT_ROOT__INSTANCE_NAME:
				return INSTANCE_NAME_EDEFAULT == null ? getInstanceName() != null : !INSTANCE_NAME_EDEFAULT.equals(getInstanceName());
			case _2009Package.DOCUMENT_ROOT__INTERCONNECTION:
				return getInterconnection() != null;
			case _2009Package.DOCUMENT_ROOT__INTERCONNECTIONS:
				return getInterconnections() != null;
			case _2009Package.DOCUMENT_ROOT__MEMORY_MAP_REF:
				return getMemoryMapRef() != null;
			case _2009Package.DOCUMENT_ROOT__MEMORY_MAPS:
				return getMemoryMaps() != null;
			case _2009Package.DOCUMENT_ROOT__MODEL:
				return getModel() != null;
			case _2009Package.DOCUMENT_ROOT__MONITOR_INTERCONNECTION:
				return getMonitorInterconnection() != null;
			case _2009Package.DOCUMENT_ROOT__REGISTER_FILE:
				return getRegisterFile() != null;
			case _2009Package.DOCUMENT_ROOT__REMAP_STATES:
				return getRemapStates() != null;
			case _2009Package.DOCUMENT_ROOT__VOLATILE:
				return isVolatile() != VOLATILE_EDEFAULT;
			case _2009Package.DOCUMENT_ROOT__ADDRESS_SPACE_REF1:
				return ADDRESS_SPACE_REF1_EDEFAULT == null ? addressSpaceRef1 != null : !ADDRESS_SPACE_REF1_EDEFAULT.equals(addressSpaceRef1);
			case _2009Package.DOCUMENT_ROOT__BANK_ALIGNMENT:
				return isSetBankAlignment();
			case _2009Package.DOCUMENT_ROOT__MASTER_REF:
				return MASTER_REF_EDEFAULT == null ? masterRef != null : !MASTER_REF_EDEFAULT.equals(masterRef);
			case _2009Package.DOCUMENT_ROOT__MEMORY_MAP_REF1:
				return MEMORY_MAP_REF1_EDEFAULT == null ? memoryMapRef1 != null : !MEMORY_MAP_REF1_EDEFAULT.equals(memoryMapRef1);
			case _2009Package.DOCUMENT_ROOT__SEGMENT_REF:
				return SEGMENT_REF_EDEFAULT == null ? segmentRef != null : !SEGMENT_REF_EDEFAULT.equals(segmentRef);
			case _2009Package.DOCUMENT_ROOT__BUS_DEFINITION:
				return getBusDefinition() != null;
			case _2009Package.DOCUMENT_ROOT__COMPONENT:
				return getComponent() != null;
			case _2009Package.DOCUMENT_ROOT__DESIGN:
				return getDesign() != null;
			case _2009Package.DOCUMENT_ROOT__DESIGN_CONFIGURATION:
				return getDesignConfiguration() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", bitStringLength: ");
		result.append(bitStringLength);
		result.append(", cellStrength: ");
		if (cellStrengthESet) result.append(cellStrength); else result.append("<unset>");
		result.append(", choiceRef: ");
		result.append(choiceRef);
		result.append(", clockEdge: ");
		if (clockEdgeESet) result.append(clockEdge); else result.append("<unset>");
		result.append(", configGroups: ");
		result.append(configGroups);
		result.append(", constraintSetId: ");
		if (constraintSetIdESet) result.append(constraintSetId); else result.append("<unset>");
		result.append(", delayType: ");
		if (delayTypeESet) result.append(delayType); else result.append("<unset>");
		result.append(", dependency1: ");
		result.append(dependency1);
		result.append(", format: ");
		if (formatESet) result.append(format); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", maximum: ");
		result.append(maximum);
		result.append(", minimum: ");
		result.append(minimum);
		result.append(", order: ");
		if (orderESet) result.append(order); else result.append("<unset>");
		result.append(", prompt: ");
		result.append(prompt);
		result.append(", rangeType: ");
		if (rangeTypeESet) result.append(rangeType); else result.append("<unset>");
		result.append(", resolve: ");
		if (resolveESet) result.append(resolve); else result.append("<unset>");
		result.append(", addressSpaceRef1: ");
		result.append(addressSpaceRef1);
		result.append(", bankAlignment: ");
		if (bankAlignmentESet) result.append(bankAlignment); else result.append("<unset>");
		result.append(", masterRef: ");
		result.append(masterRef);
		result.append(", memoryMapRef1: ");
		result.append(memoryMapRef1);
		result.append(", segmentRef: ");
		result.append(segmentRef);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
