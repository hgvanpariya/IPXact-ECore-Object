/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.spiritconsortium.xml.schema.spirit._1685._2009.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package
 * @generated
 */
public class _2009Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final _2009Validator INSTANCE = new _2009Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.spiritconsortium.xml.schema.spirit._1685._2009";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _2009Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return _2009Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case _2009Package.ABSTRACTION_DEFINITION_TYPE:
				return validateAbstractionDefinitionType((AbstractionDefinitionType)value, diagnostics, context);
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE:
				return validateAbstractionDefPortConstraintsType((AbstractionDefPortConstraintsType)value, diagnostics, context);
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE:
				return validateAbstractorBusInterfaceType((AbstractorBusInterfaceType)value, diagnostics, context);
			case _2009Package.ABSTRACTOR_GENERATORS_TYPE:
				return validateAbstractorGeneratorsType((AbstractorGeneratorsType)value, diagnostics, context);
			case _2009Package.ABSTRACTOR_INTERFACES_TYPE:
				return validateAbstractorInterfacesType((AbstractorInterfacesType)value, diagnostics, context);
			case _2009Package.ABSTRACTOR_MODEL_TYPE:
				return validateAbstractorModelType((AbstractorModelType)value, diagnostics, context);
			case _2009Package.ABSTRACTOR_MODE_TYPE1:
				return validateAbstractorModeType1((AbstractorModeType1)value, diagnostics, context);
			case _2009Package.ABSTRACTOR_PORT_TYPE:
				return validateAbstractorPortType((AbstractorPortType)value, diagnostics, context);
			case _2009Package.ABSTRACTOR_PORT_WIRE_TYPE:
				return validateAbstractorPortWireType((AbstractorPortWireType)value, diagnostics, context);
			case _2009Package.ABSTRACTORS_TYPE:
				return validateAbstractorsType((AbstractorsType)value, diagnostics, context);
			case _2009Package.ABSTRACTOR_TYPE:
				return validateAbstractorType((AbstractorType)value, diagnostics, context);
			case _2009Package.ABSTRACTOR_TYPE1:
				return validateAbstractorType1((AbstractorType1)value, diagnostics, context);
			case _2009Package.ABSTRACTOR_VIEW_TYPE:
				return validateAbstractorViewType((AbstractorViewType)value, diagnostics, context);
			case _2009Package.ADDRESS_BANK_TYPE:
				return validateAddressBankType((AddressBankType)value, diagnostics, context);
			case _2009Package.ADDRESS_BLOCK_TYPE:
				return validateAddressBlockType((AddressBlockType)value, diagnostics, context);
			case _2009Package.ADDRESS_OFFSET_TYPE:
				return validateAddressOffsetType((AddressOffsetType)value, diagnostics, context);
			case _2009Package.ADDRESS_SPACE_REF_TYPE:
				return validateAddressSpaceRefType((AddressSpaceRefType)value, diagnostics, context);
			case _2009Package.ADDRESS_SPACES_TYPE:
				return validateAddressSpacesType((AddressSpacesType)value, diagnostics, context);
			case _2009Package.ADDRESS_SPACE_TYPE:
				return validateAddressSpaceType((AddressSpaceType)value, diagnostics, context);
			case _2009Package.ADDR_SPACE_REF_TYPE:
				return validateAddrSpaceRefType((AddrSpaceRefType)value, diagnostics, context);
			case _2009Package.AD_HOC_CONNECTIONS_TYPE:
				return validateAdHocConnectionsType((AdHocConnectionsType)value, diagnostics, context);
			case _2009Package.AD_HOC_CONNECTION_TYPE:
				return validateAdHocConnectionType((AdHocConnectionType)value, diagnostics, context);
			case _2009Package.ALTERNATE_GROUPS_TYPE:
				return validateAlternateGroupsType((AlternateGroupsType)value, diagnostics, context);
			case _2009Package.ALTERNATE_REGISTERS_TYPE:
				return validateAlternateRegistersType((AlternateRegistersType)value, diagnostics, context);
			case _2009Package.ALTERNATE_REGISTER_TYPE:
				return validateAlternateRegisterType((AlternateRegisterType)value, diagnostics, context);
			case _2009Package.ARGUMENT_TYPE:
				return validateArgumentType((ArgumentType)value, diagnostics, context);
			case _2009Package.BANKED_BANK_TYPE:
				return validateBankedBankType((BankedBankType)value, diagnostics, context);
			case _2009Package.BANKED_BLOCK_TYPE:
				return validateBankedBlockType((BankedBlockType)value, diagnostics, context);
			case _2009Package.BANKED_SUBSPACE_TYPE:
				return validateBankedSubspaceType((BankedSubspaceType)value, diagnostics, context);
			case _2009Package.BASE_ADDRESSES_TYPE:
				return validateBaseAddressesType((BaseAddressesType)value, diagnostics, context);
			case _2009Package.BASE_ADDRESS_TYPE:
				return validateBaseAddressType((BaseAddressType)value, diagnostics, context);
			case _2009Package.BASE_ADDRESS_TYPE1:
				return validateBaseAddressType1((BaseAddressType1)value, diagnostics, context);
			case _2009Package.BIT_STEERING_TYPE1:
				return validateBitSteeringType1((BitSteeringType1)value, diagnostics, context);
			case _2009Package.BIT_WIDTH_TYPE:
				return validateBitWidthType((BitWidthType)value, diagnostics, context);
			case _2009Package.BRIDGE_TYPE:
				return validateBridgeType((BridgeType)value, diagnostics, context);
			case _2009Package.BUILD_COMMAND_TYPE:
				return validateBuildCommandType((BuildCommandType)value, diagnostics, context);
			case _2009Package.BUS_DEFINITION_TYPE:
				return validateBusDefinitionType((BusDefinitionType)value, diagnostics, context);
			case _2009Package.BUS_INTERFACES_TYPE:
				return validateBusInterfacesType((BusInterfacesType)value, diagnostics, context);
			case _2009Package.BUS_INTERFACE_TYPE:
				return validateBusInterfaceType((BusInterfaceType)value, diagnostics, context);
			case _2009Package.CELL_CLASS_TYPE:
				return validateCellClassType((CellClassType)value, diagnostics, context);
			case _2009Package.CELL_FUNCTION_TYPE:
				return validateCellFunctionType((CellFunctionType)value, diagnostics, context);
			case _2009Package.CELL_SPECIFICATION_TYPE:
				return validateCellSpecificationType((CellSpecificationType)value, diagnostics, context);
			case _2009Package.CHANNELS_TYPE:
				return validateChannelsType((ChannelsType)value, diagnostics, context);
			case _2009Package.CHANNEL_TYPE:
				return validateChannelType((ChannelType)value, diagnostics, context);
			case _2009Package.CHOICES_TYPE:
				return validateChoicesType((ChoicesType)value, diagnostics, context);
			case _2009Package.CHOICE_TYPE:
				return validateChoiceType((ChoiceType)value, diagnostics, context);
			case _2009Package.CLOCK_DRIVER_TYPE:
				return validateClockDriverType((ClockDriverType)value, diagnostics, context);
			case _2009Package.CLOCK_DRIVER_TYPE1:
				return validateClockDriverType1((ClockDriverType1)value, diagnostics, context);
			case _2009Package.CLOCK_PERIOD_TYPE:
				return validateClockPeriodType((ClockPeriodType)value, diagnostics, context);
			case _2009Package.CLOCK_PULSE_DURATION_TYPE:
				return validateClockPulseDurationType((ClockPulseDurationType)value, diagnostics, context);
			case _2009Package.CLOCK_PULSE_OFFSET_TYPE:
				return validateClockPulseOffsetType((ClockPulseOffsetType)value, diagnostics, context);
			case _2009Package.CLOCK_PULSE_VALUE_TYPE:
				return validateClockPulseValueType((ClockPulseValueType)value, diagnostics, context);
			case _2009Package.COMMAND_LINE_SWITCH_TYPE:
				return validateCommandLineSwitchType((CommandLineSwitchType)value, diagnostics, context);
			case _2009Package.COMMAND_TYPE:
				return validateCommandType((CommandType)value, diagnostics, context);
			case _2009Package.COMMAND_TYPE1:
				return validateCommandType1((CommandType1)value, diagnostics, context);
			case _2009Package.COMMAND_TYPE2:
				return validateCommandType2((CommandType2)value, diagnostics, context);
			case _2009Package.COMPONENT_GENERATORS_TYPE:
				return validateComponentGeneratorsType((ComponentGeneratorsType)value, diagnostics, context);
			case _2009Package.COMPONENT_GENERATOR_TYPE:
				return validateComponentGeneratorType((ComponentGeneratorType)value, diagnostics, context);
			case _2009Package.COMPONENT_INSTANCES_TYPE:
				return validateComponentInstancesType((ComponentInstancesType)value, diagnostics, context);
			case _2009Package.COMPONENT_INSTANCE_TYPE:
				return validateComponentInstanceType((ComponentInstanceType)value, diagnostics, context);
			case _2009Package.COMPONENT_TYPE:
				return validateComponentType((ComponentType)value, diagnostics, context);
			case _2009Package.CONFIGURABLE_ELEMENT_VALUES_TYPE:
				return validateConfigurableElementValuesType((ConfigurableElementValuesType)value, diagnostics, context);
			case _2009Package.CONFIGURABLE_ELEMENT_VALUE_TYPE:
				return validateConfigurableElementValueType((ConfigurableElementValueType)value, diagnostics, context);
			case _2009Package.CONNECTION_TYPE:
				return validateConnectionType((ConnectionType)value, diagnostics, context);
			case _2009Package.CONSTRAINT_SETS_TYPE:
				return validateConstraintSetsType((ConstraintSetsType)value, diagnostics, context);
			case _2009Package.CONSTRAINT_SET_TYPE:
				return validateConstraintSetType((ConstraintSetType)value, diagnostics, context);
			case _2009Package.CPUS_TYPE:
				return validateCpusType((CpusType)value, diagnostics, context);
			case _2009Package.CPU_TYPE:
				return validateCpuType((CpuType)value, diagnostics, context);
			case _2009Package.DEFAULT_VALUE_TYPE:
				return validateDefaultValueType((DefaultValueType)value, diagnostics, context);
			case _2009Package.DESIGN_CONFIGURATION_TYPE:
				return validateDesignConfigurationType((DesignConfigurationType)value, diagnostics, context);
			case _2009Package.DESIGN_TYPE:
				return validateDesignType((DesignType)value, diagnostics, context);
			case _2009Package.DISABLED_TYPE:
				return validateDisabledType((DisabledType)value, diagnostics, context);
			case _2009Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case _2009Package.DRIVE_CONSTRAINT_TYPE:
				return validateDriveConstraintType((DriveConstraintType)value, diagnostics, context);
			case _2009Package.DRIVER_TYPE:
				return validateDriverType((DriverType)value, diagnostics, context);
			case _2009Package.ENABLE_TYPE:
				return validateEnableType((EnableType)value, diagnostics, context);
			case _2009Package.ENUMERATED_VALUES_TYPE:
				return validateEnumeratedValuesType((EnumeratedValuesType)value, diagnostics, context);
			case _2009Package.ENUMERATED_VALUE_TYPE:
				return validateEnumeratedValueType((EnumeratedValueType)value, diagnostics, context);
			case _2009Package.ENUMERATION_TYPE:
				return validateEnumerationType((EnumerationType)value, diagnostics, context);
			case _2009Package.EXECUTABLE_IMAGE_TYPE:
				return validateExecutableImageType((ExecutableImageType)value, diagnostics, context);
			case _2009Package.EXTERNAL_PORT_REFERENCE_TYPE:
				return validateExternalPortReferenceType((ExternalPortReferenceType)value, diagnostics, context);
			case _2009Package.FIELD_TYPE:
				return validateFieldType((FieldType)value, diagnostics, context);
			case _2009Package.FILE_BUILDER_TYPE:
				return validateFileBuilderType((FileBuilderType)value, diagnostics, context);
			case _2009Package.FILE_BUILDER_TYPE1:
				return validateFileBuilderType1((FileBuilderType1)value, diagnostics, context);
			case _2009Package.FILE_SET_REF_GROUP_TYPE:
				return validateFileSetRefGroupType((FileSetRefGroupType)value, diagnostics, context);
			case _2009Package.FILE_SET_REF_GROUP_TYPE1:
				return validateFileSetRefGroupType1((FileSetRefGroupType1)value, diagnostics, context);
			case _2009Package.FILE_SET_REF_TYPE:
				return validateFileSetRefType((FileSetRefType)value, diagnostics, context);
			case _2009Package.FILE_SETS_TYPE:
				return validateFileSetsType((FileSetsType)value, diagnostics, context);
			case _2009Package.FILE_SET_TYPE:
				return validateFileSetType((FileSetType)value, diagnostics, context);
			case _2009Package.FILE_TYPE:
				return validateFileType((FileType)value, diagnostics, context);
			case _2009Package.FLAGS_TYPE:
				return validateFlagsType((FlagsType)value, diagnostics, context);
			case _2009Package.FLAGS_TYPE1:
				return validateFlagsType1((FlagsType1)value, diagnostics, context);
			case _2009Package.FLAGS_TYPE2:
				return validateFlagsType2((FlagsType2)value, diagnostics, context);
			case _2009Package.FUNCTION_TYPE:
				return validateFunctionType((FunctionType)value, diagnostics, context);
			case _2009Package.GENERATOR_CHAIN_CONFIGURATION_TYPE:
				return validateGeneratorChainConfigurationType((GeneratorChainConfigurationType)value, diagnostics, context);
			case _2009Package.GENERATOR_CHAIN_SELECTOR_TYPE:
				return validateGeneratorChainSelectorType((GeneratorChainSelectorType)value, diagnostics, context);
			case _2009Package.GENERATOR_CHAIN_TYPE:
				return validateGeneratorChainType((GeneratorChainType)value, diagnostics, context);
			case _2009Package.GENERATOR_SELECTOR_TYPE:
				return validateGeneratorSelectorType((GeneratorSelectorType)value, diagnostics, context);
			case _2009Package.GENERATOR_TYPE:
				return validateGeneratorType((GeneratorType)value, diagnostics, context);
			case _2009Package.GENERATOR_TYPE1:
				return validateGeneratorType1((GeneratorType1)value, diagnostics, context);
			case _2009Package.GROUP_SELECTOR_TYPE:
				return validateGroupSelectorType((GroupSelectorType)value, diagnostics, context);
			case _2009Package.HIER_CONNECTIONS_TYPE:
				return validateHierConnectionsType((HierConnectionsType)value, diagnostics, context);
			case _2009Package.HIER_CONNECTION_TYPE:
				return validateHierConnectionType((HierConnectionType)value, diagnostics, context);
			case _2009Package.HIER_INTERFACE:
				return validateHierInterface((HierInterface)value, diagnostics, context);
			case _2009Package.INSTANCE_GENERATOR_TYPE:
				return validateInstanceGeneratorType((InstanceGeneratorType)value, diagnostics, context);
			case _2009Package.INTERCONNECTION_CONFIGURATION_TYPE:
				return validateInterconnectionConfigurationType((InterconnectionConfigurationType)value, diagnostics, context);
			case _2009Package.INTERCONNECTIONS_TYPE:
				return validateInterconnectionsType((InterconnectionsType)value, diagnostics, context);
			case _2009Package.INTERCONNECTION_TYPE:
				return validateInterconnectionType((InterconnectionType)value, diagnostics, context);
			case _2009Package.INTERFACE:
				return validateInterface((Interface)value, diagnostics, context);
			case _2009Package.INTERNAL_PORT_REFERENCE_TYPE:
				return validateInternalPortReferenceType((InternalPortReferenceType)value, diagnostics, context);
			case _2009Package.IS_INCLUDE_FILE_TYPE:
				return validateIsIncludeFileType((IsIncludeFileType)value, diagnostics, context);
			case _2009Package.LANGUAGE_TOOLS_TYPE:
				return validateLanguageToolsType((LanguageToolsType)value, diagnostics, context);
			case _2009Package.LANGUAGE_TYPE:
				return validateLanguageType((LanguageType)value, diagnostics, context);
			case _2009Package.LANGUAGE_TYPE1:
				return validateLanguageType1((LanguageType1)value, diagnostics, context);
			case _2009Package.LEFT_TYPE:
				return validateLeftType((LeftType)value, diagnostics, context);
			case _2009Package.LEFT_TYPE1:
				return validateLeftType1((LeftType1)value, diagnostics, context);
			case _2009Package.LEFT_TYPE2:
				return validateLeftType2((LeftType2)value, diagnostics, context);
			case _2009Package.LEFT_TYPE11:
				return validateLeftType11((LeftType11)value, diagnostics, context);
			case _2009Package.LIBRARY_REF_TYPE:
				return validateLibraryRefType((LibraryRefType)value, diagnostics, context);
			case _2009Package.LINKER_COMMAND_FILE_TYPE:
				return validateLinkerCommandFileType((LinkerCommandFileType)value, diagnostics, context);
			case _2009Package.LINKER_FLAGS_TYPE:
				return validateLinkerFlagsType((LinkerFlagsType)value, diagnostics, context);
			case _2009Package.LINKER_TYPE:
				return validateLinkerType((LinkerType)value, diagnostics, context);
			case _2009Package.LOAD_CONSTRAINT_TYPE:
				return validateLoadConstraintType((LoadConstraintType)value, diagnostics, context);
			case _2009Package.LOCAL_MEMORY_MAP_TYPE:
				return validateLocalMemoryMapType((LocalMemoryMapType)value, diagnostics, context);
			case _2009Package.LOGICAL_NAME_TYPE:
				return validateLogicalNameType((LogicalNameType)value, diagnostics, context);
			case _2009Package.LOGICAL_PORT_TYPE:
				return validateLogicalPortType((LogicalPortType)value, diagnostics, context);
			case _2009Package.LOGICAL_PORT_TYPE1:
				return validateLogicalPortType1((LogicalPortType1)value, diagnostics, context);
			case _2009Package.MASK_TYPE:
				return validateMaskType((MaskType)value, diagnostics, context);
			case _2009Package.MASK_TYPE1:
				return validateMaskType1((MaskType1)value, diagnostics, context);
			case _2009Package.MASTER_TYPE:
				return validateMasterType((MasterType)value, diagnostics, context);
			case _2009Package.MAXIMUM_TYPE:
				return validateMaximumType((MaximumType)value, diagnostics, context);
			case _2009Package.MEMORY_MAP_REF_TYPE:
				return validateMemoryMapRefType((MemoryMapRefType)value, diagnostics, context);
			case _2009Package.MEMORY_MAPS_TYPE:
				return validateMemoryMapsType((MemoryMapsType)value, diagnostics, context);
			case _2009Package.MEMORY_MAP_TYPE:
				return validateMemoryMapType((MemoryMapType)value, diagnostics, context);
			case _2009Package.MEMORY_REMAP_TYPE:
				return validateMemoryRemapType((MemoryRemapType)value, diagnostics, context);
			case _2009Package.MINIMUM_TYPE:
				return validateMinimumType((MinimumType)value, diagnostics, context);
			case _2009Package.MIRRORED_MASTER_TYPE:
				return validateMirroredMasterType((MirroredMasterType)value, diagnostics, context);
			case _2009Package.MIRRORED_SLAVE_TYPE:
				return validateMirroredSlaveType((MirroredSlaveType)value, diagnostics, context);
			case _2009Package.MIRRORED_SYSTEM_TYPE:
				return validateMirroredSystemType((MirroredSystemType)value, diagnostics, context);
			case _2009Package.MODEL_PARAMETERS_TYPE:
				return validateModelParametersType((ModelParametersType)value, diagnostics, context);
			case _2009Package.MODEL_PARAMETERS_TYPE1:
				return validateModelParametersType1((ModelParametersType1)value, diagnostics, context);
			case _2009Package.MODEL_TYPE:
				return validateModelType((ModelType)value, diagnostics, context);
			case _2009Package.MONITOR_INTERCONNECTION_TYPE:
				return validateMonitorInterconnectionType((MonitorInterconnectionType)value, diagnostics, context);
			case _2009Package.MONITOR_TYPE:
				return validateMonitorType((MonitorType)value, diagnostics, context);
			case _2009Package.NAME_TYPE:
				return validateNameType((NameType)value, diagnostics, context);
			case _2009Package.NAME_TYPE1:
				return validateNameType1((NameType1)value, diagnostics, context);
			case _2009Package.NAME_TYPE2:
				return validateNameType2((NameType2)value, diagnostics, context);
			case _2009Package.NAME_VALUE_PAIR_TYPE:
				return validateNameValuePairType((NameValuePairType)value, diagnostics, context);
			case _2009Package.NAME_VALUE_TYPE_TYPE:
				return validateNameValueTypeType((NameValueTypeType)value, diagnostics, context);
			case _2009Package.ON_MASTER_TYPE:
				return validateOnMasterType((OnMasterType)value, diagnostics, context);
			case _2009Package.ON_MASTER_TYPE1:
				return validateOnMasterType1((OnMasterType1)value, diagnostics, context);
			case _2009Package.ON_SLAVE_TYPE:
				return validateOnSlaveType((OnSlaveType)value, diagnostics, context);
			case _2009Package.ON_SLAVE_TYPE1:
				return validateOnSlaveType1((OnSlaveType1)value, diagnostics, context);
			case _2009Package.ON_SYSTEM_TYPE:
				return validateOnSystemType((OnSystemType)value, diagnostics, context);
			case _2009Package.ON_SYSTEM_TYPE1:
				return validateOnSystemType1((OnSystemType1)value, diagnostics, context);
			case _2009Package.OTHER_CLOCK_DRIVER_TYPE:
				return validateOtherClockDriverType((OtherClockDriverType)value, diagnostics, context);
			case _2009Package.OTHER_CLOCKS:
				return validateOtherClocks((OtherClocks)value, diagnostics, context);
			case _2009Package.PARAMETERS_TYPE:
				return validateParametersType((ParametersType)value, diagnostics, context);
			case _2009Package.PARAMETERS_TYPE1:
				return validateParametersType1((ParametersType1)value, diagnostics, context);
			case _2009Package.PHASE_TYPE:
				return validatePhaseType((PhaseType)value, diagnostics, context);
			case _2009Package.PHYSICAL_PORT_TYPE:
				return validatePhysicalPortType((PhysicalPortType)value, diagnostics, context);
			case _2009Package.PHYSICAL_PORT_TYPE1:
				return validatePhysicalPortType1((PhysicalPortType1)value, diagnostics, context);
			case _2009Package.PORT_ACCESS_TYPE:
				return validatePortAccessType((PortAccessType)value, diagnostics, context);
			case _2009Package.PORT_DECLARATION_TYPE:
				return validatePortDeclarationType((PortDeclarationType)value, diagnostics, context);
			case _2009Package.PORT_MAPS_TYPE:
				return validatePortMapsType((PortMapsType)value, diagnostics, context);
			case _2009Package.PORT_MAPS_TYPE1:
				return validatePortMapsType1((PortMapsType1)value, diagnostics, context);
			case _2009Package.PORT_MAP_TYPE:
				return validatePortMapType((PortMapType)value, diagnostics, context);
			case _2009Package.PORT_MAP_TYPE1:
				return validatePortMapType1((PortMapType1)value, diagnostics, context);
			case _2009Package.PORTS_TYPE:
				return validatePortsType((PortsType)value, diagnostics, context);
			case _2009Package.PORTS_TYPE1:
				return validatePortsType1((PortsType1)value, diagnostics, context);
			case _2009Package.PORTS_TYPE2:
				return validatePortsType2((PortsType2)value, diagnostics, context);
			case _2009Package.PORT_TRANSACTIONAL_TYPE:
				return validatePortTransactionalType((PortTransactionalType)value, diagnostics, context);
			case _2009Package.PORT_TYPE:
				return validatePortType((PortType)value, diagnostics, context);
			case _2009Package.PORT_TYPE1:
				return validatePortType1((PortType1)value, diagnostics, context);
			case _2009Package.PORT_WIRE_TYPE:
				return validatePortWireType((PortWireType)value, diagnostics, context);
			case _2009Package.QUALIFIER_TYPE:
				return validateQualifierType((QualifierType)value, diagnostics, context);
			case _2009Package.QUALIFIER_TYPE1:
				return validateQualifierType1((QualifierType1)value, diagnostics, context);
			case _2009Package.RANGE_TYPE:
				return validateRangeType((RangeType)value, diagnostics, context);
			case _2009Package.RANGE_TYPE1:
				return validateRangeType1((RangeType1)value, diagnostics, context);
			case _2009Package.RANGE_TYPE2:
				return validateRangeType2((RangeType2)value, diagnostics, context);
			case _2009Package.RANGE_TYPE3:
				return validateRangeType3((RangeType3)value, diagnostics, context);
			case _2009Package.REGISTER_FILE_TYPE:
				return validateRegisterFileType((RegisterFileType)value, diagnostics, context);
			case _2009Package.REGISTER_TYPE:
				return validateRegisterType((RegisterType)value, diagnostics, context);
			case _2009Package.REMAP_ADDRESS_TYPE:
				return validateRemapAddressType((RemapAddressType)value, diagnostics, context);
			case _2009Package.REMAP_PORTS_TYPE:
				return validateRemapPortsType((RemapPortsType)value, diagnostics, context);
			case _2009Package.REMAP_PORT_TYPE:
				return validateRemapPortType((RemapPortType)value, diagnostics, context);
			case _2009Package.REMAP_STATES_TYPE:
				return validateRemapStatesType((RemapStatesType)value, diagnostics, context);
			case _2009Package.REMAP_STATE_TYPE:
				return validateRemapStateType((RemapStateType)value, diagnostics, context);
			case _2009Package.REPLACE_DEFAULT_FLAGS_TYPE:
				return validateReplaceDefaultFlagsType((ReplaceDefaultFlagsType)value, diagnostics, context);
			case _2009Package.REPLACE_DEFAULT_FLAGS_TYPE1:
				return validateReplaceDefaultFlagsType1((ReplaceDefaultFlagsType1)value, diagnostics, context);
			case _2009Package.REPLACE_DEFAULT_FLAGS_TYPE2:
				return validateReplaceDefaultFlagsType2((ReplaceDefaultFlagsType2)value, diagnostics, context);
			case _2009Package.REQUIRES_DRIVER_TYPE:
				return validateRequiresDriverType((RequiresDriverType)value, diagnostics, context);
			case _2009Package.RESET_TYPE:
				return validateResetType((ResetType)value, diagnostics, context);
			case _2009Package.RESET_TYPE1:
				return validateResetType1((ResetType1)value, diagnostics, context);
			case _2009Package.RESOLVED_LIBRARY_REF_TYPE:
				return validateResolvedLibraryRefType((ResolvedLibraryRefType)value, diagnostics, context);
			case _2009Package.RIGHT_TYPE:
				return validateRightType((RightType)value, diagnostics, context);
			case _2009Package.RIGHT_TYPE1:
				return validateRightType1((RightType1)value, diagnostics, context);
			case _2009Package.RIGHT_TYPE2:
				return validateRightType2((RightType2)value, diagnostics, context);
			case _2009Package.RIGHT_TYPE11:
				return validateRightType11((RightType11)value, diagnostics, context);
			case _2009Package.SEGMENTS_TYPE:
				return validateSegmentsType((SegmentsType)value, diagnostics, context);
			case _2009Package.SEGMENT_TYPE:
				return validateSegmentType((SegmentType)value, diagnostics, context);
			case _2009Package.SERVICE_TYPE:
				return validateServiceType((ServiceType)value, diagnostics, context);
			case _2009Package.SERVICE_TYPE1:
				return validateServiceType1((ServiceType1)value, diagnostics, context);
			case _2009Package.SERVICE_TYPE_DEFS_TYPE:
				return validateServiceTypeDefsType((ServiceTypeDefsType)value, diagnostics, context);
			case _2009Package.SERVICE_TYPE_DEF_TYPE:
				return validateServiceTypeDefType((ServiceTypeDefType)value, diagnostics, context);
			case _2009Package.SINGLE_SHOT_DRIVER_TYPE:
				return validateSingleShotDriverType((SingleShotDriverType)value, diagnostics, context);
			case _2009Package.SINGLE_SHOT_DURATION_TYPE:
				return validateSingleShotDurationType((SingleShotDurationType)value, diagnostics, context);
			case _2009Package.SINGLE_SHOT_OFFSET_TYPE:
				return validateSingleShotOffsetType((SingleShotOffsetType)value, diagnostics, context);
			case _2009Package.SINGLE_SHOT_VALUE_TYPE:
				return validateSingleShotValueType((SingleShotValueType)value, diagnostics, context);
			case _2009Package.SIZE_TYPE:
				return validateSizeType((SizeType)value, diagnostics, context);
			case _2009Package.SLAVE_TYPE:
				return validateSlaveType((SlaveType)value, diagnostics, context);
			case _2009Package.SOURCE_FILE_TYPE:
				return validateSourceFileType((SourceFileType)value, diagnostics, context);
			case _2009Package.SOURCE_NAME_TYPE:
				return validateSourceNameType((SourceNameType)value, diagnostics, context);
			case _2009Package.SUBSPACE_REF_TYPE:
				return validateSubspaceRefType((SubspaceRefType)value, diagnostics, context);
			case _2009Package.SYSTEM_GROUP_NAMES_TYPE:
				return validateSystemGroupNamesType((SystemGroupNamesType)value, diagnostics, context);
			case _2009Package.SYSTEM_TYPE:
				return validateSystemType((SystemType)value, diagnostics, context);
			case _2009Package.TARGET_NAME_TYPE:
				return validateTargetNameType((TargetNameType)value, diagnostics, context);
			case _2009Package.TESTABLE_TYPE:
				return validateTestableType((TestableType)value, diagnostics, context);
			case _2009Package.TIMING_CONSTRAINT_TYPE:
				return validateTimingConstraintType((TimingConstraintType)value, diagnostics, context);
			case _2009Package.TRANSACTIONAL_TYPE:
				return validateTransactionalType((TransactionalType)value, diagnostics, context);
			case _2009Package.TRANSPORT_METHODS_TYPE:
				return validateTransportMethodsType((TransportMethodsType)value, diagnostics, context);
			case _2009Package.TRANS_TYPE_DEF_TYPE:
				return validateTransTypeDefType((TransTypeDefType)value, diagnostics, context);
			case _2009Package.TYPE_NAME_TYPE:
				return validateTypeNameType((TypeNameType)value, diagnostics, context);
			case _2009Package.TYPE_NAME_TYPE1:
				return validateTypeNameType1((TypeNameType1)value, diagnostics, context);
			case _2009Package.TYPE_NAME_TYPE2:
				return validateTypeNameType2((TypeNameType2)value, diagnostics, context);
			case _2009Package.TYPE_NAME_TYPE3:
				return validateTypeNameType3((TypeNameType3)value, diagnostics, context);
			case _2009Package.VALUE_MASK_CONFIG_TYPE:
				return validateValueMaskConfigType((ValueMaskConfigType)value, diagnostics, context);
			case _2009Package.VALUE_TYPE:
				return validateValueType((ValueType)value, diagnostics, context);
			case _2009Package.VALUE_TYPE1:
				return validateValueType1((ValueType1)value, diagnostics, context);
			case _2009Package.VALUE_TYPE2:
				return validateValueType2((ValueType2)value, diagnostics, context);
			case _2009Package.VECTOR_TYPE:
				return validateVectorType((VectorType)value, diagnostics, context);
			case _2009Package.VECTOR_TYPE1:
				return validateVectorType1((VectorType1)value, diagnostics, context);
			case _2009Package.VECTOR_TYPE2:
				return validateVectorType2((VectorType2)value, diagnostics, context);
			case _2009Package.VECTOR_TYPE11:
				return validateVectorType11((VectorType11)value, diagnostics, context);
			case _2009Package.VENDOR_EXTENSIONS_TYPE:
				return validateVendorExtensionsType((VendorExtensionsType)value, diagnostics, context);
			case _2009Package.VIEW_CONFIGURATION_TYPE:
				return validateViewConfigurationType((ViewConfigurationType)value, diagnostics, context);
			case _2009Package.VIEWS_TYPE:
				return validateViewsType((ViewsType)value, diagnostics, context);
			case _2009Package.VIEWS_TYPE1:
				return validateViewsType1((ViewsType1)value, diagnostics, context);
			case _2009Package.VIEW_TYPE:
				return validateViewType((ViewType)value, diagnostics, context);
			case _2009Package.WHITEBOX_ELEMENT_REFS_TYPE:
				return validateWhiteboxElementRefsType((WhiteboxElementRefsType)value, diagnostics, context);
			case _2009Package.WHITEBOX_ELEMENT_REF_TYPE:
				return validateWhiteboxElementRefType((WhiteboxElementRefType)value, diagnostics, context);
			case _2009Package.WHITEBOX_ELEMENTS_TYPE:
				return validateWhiteboxElementsType((WhiteboxElementsType)value, diagnostics, context);
			case _2009Package.WHITEBOX_ELEMENT_TYPE:
				return validateWhiteboxElementType((WhiteboxElementType)value, diagnostics, context);
			case _2009Package.WHITEBOX_PATH_TYPE:
				return validateWhiteboxPathType((WhiteboxPathType)value, diagnostics, context);
			case _2009Package.WIDTH_TYPE:
				return validateWidthType((WidthType)value, diagnostics, context);
			case _2009Package.WIRE_TYPE:
				return validateWireType((WireType)value, diagnostics, context);
			case _2009Package.WIRE_TYPE_DEFS_TYPE:
				return validateWireTypeDefsType((WireTypeDefsType)value, diagnostics, context);
			case _2009Package.WIRE_TYPE_DEF_TYPE:
				return validateWireTypeDefType((WireTypeDefType)value, diagnostics, context);
			case _2009Package.WRITE_VALUE_CONSTRAINT_TYPE:
				return validateWriteValueConstraintType((WriteValueConstraintType)value, diagnostics, context);
			case _2009Package.ABSTRACTOR_MODE_TYPE:
				return validateAbstractorModeType((AbstractorModeType)value, diagnostics, context);
			case _2009Package.ACCESS_TYPE:
				return validateAccessType((AccessType)value, diagnostics, context);
			case _2009Package.API_TYPE_TYPE:
				return validateApiTypeType((ApiTypeType)value, diagnostics, context);
			case _2009Package.BANK_ALIGNMENT_TYPE:
				return validateBankAlignmentType((BankAlignmentType)value, diagnostics, context);
			case _2009Package.BIT_STEERING_TYPE:
				return validateBitSteeringType((BitSteeringType)value, diagnostics, context);
			case _2009Package.CELL_CLASS_VALUE_TYPE:
				return validateCellClassValueType((CellClassValueType)value, diagnostics, context);
			case _2009Package.CELL_FUNCTION_VALUE_TYPE:
				return validateCellFunctionValueType((CellFunctionValueType)value, diagnostics, context);
			case _2009Package.CELL_STRENGTH_VALUE_TYPE:
				return validateCellStrengthValueType((CellStrengthValueType)value, diagnostics, context);
			case _2009Package.COMPONENT_PORT_DIRECTION_TYPE:
				return validateComponentPortDirectionType((ComponentPortDirectionType)value, diagnostics, context);
			case _2009Package.DATA_TYPE_TYPE:
				return validateDataTypeType((DataTypeType)value, diagnostics, context);
			case _2009Package.DELAY_VALUE_TYPE:
				return validateDelayValueType((DelayValueType)value, diagnostics, context);
			case _2009Package.DELAY_VALUE_UNIT_TYPE:
				return validateDelayValueUnitType((DelayValueUnitType)value, diagnostics, context);
			case _2009Package.DIRECTION_TYPE:
				return validateDirectionType((DirectionType)value, diagnostics, context);
			case _2009Package.DRIVER_TYPE_TYPE:
				return validateDriverTypeType((DriverTypeType)value, diagnostics, context);
			case _2009Package.EDGE_VALUE_TYPE:
				return validateEdgeValueType((EdgeValueType)value, diagnostics, context);
			case _2009Package.ENDIANESS_TYPE:
				return validateEndianessType((EndianessType)value, diagnostics, context);
			case _2009Package.FILE_TYPE_TYPE:
				return validateFileTypeType((FileTypeType)value, diagnostics, context);
			case _2009Package.FORMAT_TYPE:
				return validateFormatType((FormatType)value, diagnostics, context);
			case _2009Package.INITIATIVE_TYPE:
				return validateInitiativeType((InitiativeType)value, diagnostics, context);
			case _2009Package.INITIATIVE_TYPE1:
				return validateInitiativeType1((InitiativeType1)value, diagnostics, context);
			case _2009Package.INTERFACE_MODE_TYPE:
				return validateInterfaceModeType((InterfaceModeType)value, diagnostics, context);
			case _2009Package.MODIFIED_WRITE_VALUE_TYPE:
				return validateModifiedWriteValueType((ModifiedWriteValueType)value, diagnostics, context);
			case _2009Package.MULTIPLE_GROUP_SELECTION_OPERATOR_TYPE:
				return validateMultipleGroupSelectionOperatorType((MultipleGroupSelectionOperatorType)value, diagnostics, context);
			case _2009Package.PORT_ACCESS_TYPE_TYPE:
				return validatePortAccessTypeType((PortAccessTypeType)value, diagnostics, context);
			case _2009Package.PRESENCE_TYPE:
				return validatePresenceType((PresenceType)value, diagnostics, context);
			case _2009Package.RANGE_TYPE_TYPE:
				return validateRangeTypeType((RangeTypeType)value, diagnostics, context);
			case _2009Package.READ_ACTION_TYPE:
				return validateReadActionType((ReadActionType)value, diagnostics, context);
			case _2009Package.RESOLVE_TYPE:
				return validateResolveType((ResolveType)value, diagnostics, context);
			case _2009Package.RETURN_TYPE_TYPE:
				return validateReturnTypeType((ReturnTypeType)value, diagnostics, context);
			case _2009Package.SCOPE_TYPE:
				return validateScopeType((ScopeType)value, diagnostics, context);
			case _2009Package.TEST_CONSTRAINT_TYPE:
				return validateTestConstraintType((TestConstraintType)value, diagnostics, context);
			case _2009Package.TRANSPORT_METHOD_TYPE:
				return validateTransportMethodType((TransportMethodType)value, diagnostics, context);
			case _2009Package.USAGE_TYPE:
				return validateUsageType((UsageType)value, diagnostics, context);
			case _2009Package.USAGE_TYPE1:
				return validateUsageType1((UsageType1)value, diagnostics, context);
			case _2009Package.USAGE_TYPE_TYPE:
				return validateUsageTypeType((UsageTypeType)value, diagnostics, context);
			case _2009Package.WHITEBOX_TYPE_TYPE:
				return validateWhiteboxTypeType((WhiteboxTypeType)value, diagnostics, context);
			case _2009Package.ABSTRACTOR_MODE_TYPE_OBJECT:
				return validateAbstractorModeTypeObject((AbstractorModeType)value, diagnostics, context);
			case _2009Package.ACCESS_TYPE1:
				return validateAccessType1((AccessType)value, diagnostics, context);
			case _2009Package.ACCESS_TYPE_OBJECT:
				return validateAccessTypeObject((AccessType)value, diagnostics, context);
			case _2009Package.API_TYPE_TYPE_OBJECT:
				return validateApiTypeTypeObject((ApiTypeType)value, diagnostics, context);
			case _2009Package.BANK_ALIGNMENT_TYPE_OBJECT:
				return validateBankAlignmentTypeObject((BankAlignmentType)value, diagnostics, context);
			case _2009Package.BIT_STEERING_TYPE_OBJECT:
				return validateBitSteeringTypeObject((BitSteeringType)value, diagnostics, context);
			case _2009Package.CELL_CLASS_VALUE_TYPE_OBJECT:
				return validateCellClassValueTypeObject((CellClassValueType)value, diagnostics, context);
			case _2009Package.CELL_FUNCTION_VALUE_TYPE_OBJECT:
				return validateCellFunctionValueTypeObject((CellFunctionValueType)value, diagnostics, context);
			case _2009Package.CELL_STRENGTH_VALUE_TYPE_OBJECT:
				return validateCellStrengthValueTypeObject((CellStrengthValueType)value, diagnostics, context);
			case _2009Package.COMPONENT_PORT_DIRECTION_TYPE_OBJECT:
				return validateComponentPortDirectionTypeObject((ComponentPortDirectionType)value, diagnostics, context);
			case _2009Package.CONFIGURABLE_DOUBLE:
				return validateConfigurableDouble((List<?>)value, diagnostics, context);
			case _2009Package.DATA_TYPE_TYPE_OBJECT:
				return validateDataTypeTypeObject((DataTypeType)value, diagnostics, context);
			case _2009Package.DELAY_PERCENTAGE_TYPE:
				return validateDelayPercentageType((Float)value, diagnostics, context);
			case _2009Package.DELAY_PERCENTAGE_TYPE_OBJECT:
				return validateDelayPercentageTypeObject((Float)value, diagnostics, context);
			case _2009Package.DELAY_VALUE_TYPE_OBJECT:
				return validateDelayValueTypeObject((DelayValueType)value, diagnostics, context);
			case _2009Package.DELAY_VALUE_UNIT_TYPE_OBJECT:
				return validateDelayValueUnitTypeObject((DelayValueUnitType)value, diagnostics, context);
			case _2009Package.DIRECTION_TYPE_OBJECT:
				return validateDirectionTypeObject((DirectionType)value, diagnostics, context);
			case _2009Package.DOUBLE_LIST:
				return validateDoubleList((List<?>)value, diagnostics, context);
			case _2009Package.DRIVER_TYPE_TYPE_OBJECT:
				return validateDriverTypeTypeObject((DriverTypeType)value, diagnostics, context);
			case _2009Package.EDGE_VALUE_TYPE_OBJECT:
				return validateEdgeValueTypeObject((EdgeValueType)value, diagnostics, context);
			case _2009Package.ENDIANESS_TYPE_OBJECT:
				return validateEndianessTypeObject((EndianessType)value, diagnostics, context);
			case _2009Package.ENV_IDENTIFIER_TYPE:
				return validateEnvIdentifierType((String)value, diagnostics, context);
			case _2009Package.ENV_IDENTIFIER_TYPE1:
				return validateEnvIdentifierType1((String)value, diagnostics, context);
			case _2009Package.FILE_TYPE_TYPE_OBJECT:
				return validateFileTypeTypeObject((FileTypeType)value, diagnostics, context);
			case _2009Package.FORMAT_TYPE_OBJECT:
				return validateFormatTypeObject((FormatType)value, diagnostics, context);
			case _2009Package.INITIATIVE_TYPE_OBJECT:
				return validateInitiativeTypeObject((InitiativeType)value, diagnostics, context);
			case _2009Package.INITIATIVE_TYPE_OBJECT1:
				return validateInitiativeTypeObject1((InitiativeType1)value, diagnostics, context);
			case _2009Package.INSTANCE_PATH:
				return validateInstancePath((String)value, diagnostics, context);
			case _2009Package.INTERFACE_MODE_TYPE_OBJECT:
				return validateInterfaceModeTypeObject((InterfaceModeType)value, diagnostics, context);
			case _2009Package.MODIFIED_WRITE_VALUE_TYPE_OBJECT:
				return validateModifiedWriteValueTypeObject((ModifiedWriteValueType)value, diagnostics, context);
			case _2009Package.MULTIPLE_GROUP_SELECTION_OPERATOR_TYPE_OBJECT:
				return validateMultipleGroupSelectionOperatorTypeObject((MultipleGroupSelectionOperatorType)value, diagnostics, context);
			case _2009Package.NON_NEGATIVE_FLOAT:
				return validateNonNegativeFloat((Float)value, diagnostics, context);
			case _2009Package.NON_NEGATIVE_FLOAT_OBJECT:
				return validateNonNegativeFloatObject((Float)value, diagnostics, context);
			case _2009Package.PORT_ACCESS_TYPE_TYPE_OBJECT:
				return validatePortAccessTypeTypeObject((PortAccessTypeType)value, diagnostics, context);
			case _2009Package.PORT_NAME:
				return validatePortName((String)value, diagnostics, context);
			case _2009Package.PRESENCE_TYPE_OBJECT:
				return validatePresenceTypeObject((PresenceType)value, diagnostics, context);
			case _2009Package.RANGE_TYPE_TYPE_OBJECT:
				return validateRangeTypeTypeObject((RangeTypeType)value, diagnostics, context);
			case _2009Package.READ_ACTION_TYPE_OBJECT:
				return validateReadActionTypeObject((ReadActionType)value, diagnostics, context);
			case _2009Package.RESOLVE_TYPE_OBJECT:
				return validateResolveTypeObject((ResolveType)value, diagnostics, context);
			case _2009Package.RETURN_TYPE_TYPE_OBJECT:
				return validateReturnTypeTypeObject((ReturnTypeType)value, diagnostics, context);
			case _2009Package.SCALED_INTEGER:
				return validateScaledInteger((String)value, diagnostics, context);
			case _2009Package.SCALED_NON_NEGATIVE_INTEGER:
				return validateScaledNonNegativeInteger((String)value, diagnostics, context);
			case _2009Package.SCALED_POSITIVE_INTEGER:
				return validateScaledPositiveInteger((String)value, diagnostics, context);
			case _2009Package.SCOPE_TYPE_OBJECT:
				return validateScopeTypeObject((ScopeType)value, diagnostics, context);
			case _2009Package.SPIRIT_URI:
				return validateSpiritURI((String)value, diagnostics, context);
			case _2009Package.TEST_CONSTRAINT_TYPE_OBJECT:
				return validateTestConstraintTypeObject((TestConstraintType)value, diagnostics, context);
			case _2009Package.TRANSPORT_METHOD_TYPE_OBJECT:
				return validateTransportMethodTypeObject((TransportMethodType)value, diagnostics, context);
			case _2009Package.USAGE_TYPE_OBJECT:
				return validateUsageTypeObject((UsageType)value, diagnostics, context);
			case _2009Package.USAGE_TYPE_OBJECT1:
				return validateUsageTypeObject1((UsageType1)value, diagnostics, context);
			case _2009Package.USAGE_TYPE_TYPE_OBJECT:
				return validateUsageTypeTypeObject((UsageTypeType)value, diagnostics, context);
			case _2009Package.WHITEBOX_TYPE_TYPE_OBJECT:
				return validateWhiteboxTypeTypeObject((WhiteboxTypeType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractionDefinitionType(AbstractionDefinitionType abstractionDefinitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractionDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractionDefPortConstraintsType(AbstractionDefPortConstraintsType abstractionDefPortConstraintsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractionDefPortConstraintsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractorBusInterfaceType(AbstractorBusInterfaceType abstractorBusInterfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractorBusInterfaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractorGeneratorsType(AbstractorGeneratorsType abstractorGeneratorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractorGeneratorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractorInterfacesType(AbstractorInterfacesType abstractorInterfacesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractorInterfacesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractorModelType(AbstractorModelType abstractorModelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractorModelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractorModeType1(AbstractorModeType1 abstractorModeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractorModeType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractorPortType(AbstractorPortType abstractorPortType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractorPortType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractorPortWireType(AbstractorPortWireType abstractorPortWireType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractorPortWireType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractorsType(AbstractorsType abstractorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractorType(AbstractorType abstractorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractorType1(AbstractorType1 abstractorType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractorType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractorViewType(AbstractorViewType abstractorViewType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractorViewType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressBankType(AddressBankType addressBankType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressBankType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressBlockType(AddressBlockType addressBlockType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressBlockType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressOffsetType(AddressOffsetType addressOffsetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressOffsetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressSpaceRefType(AddressSpaceRefType addressSpaceRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressSpaceRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressSpacesType(AddressSpacesType addressSpacesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressSpacesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressSpaceType(AddressSpaceType addressSpaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressSpaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddrSpaceRefType(AddrSpaceRefType addrSpaceRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addrSpaceRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdHocConnectionsType(AdHocConnectionsType adHocConnectionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(adHocConnectionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdHocConnectionType(AdHocConnectionType adHocConnectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(adHocConnectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlternateGroupsType(AlternateGroupsType alternateGroupsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alternateGroupsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlternateRegistersType(AlternateRegistersType alternateRegistersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alternateRegistersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlternateRegisterType(AlternateRegisterType alternateRegisterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alternateRegisterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgumentType(ArgumentType argumentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(argumentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBankedBankType(BankedBankType bankedBankType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bankedBankType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBankedBlockType(BankedBlockType bankedBlockType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bankedBlockType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBankedSubspaceType(BankedSubspaceType bankedSubspaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bankedSubspaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseAddressesType(BaseAddressesType baseAddressesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseAddressesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseAddressType(BaseAddressType baseAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseAddressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseAddressType1(BaseAddressType1 baseAddressType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseAddressType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitSteeringType1(BitSteeringType1 bitSteeringType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bitSteeringType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitWidthType(BitWidthType bitWidthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bitWidthType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBridgeType(BridgeType bridgeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bridgeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuildCommandType(BuildCommandType buildCommandType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buildCommandType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusDefinitionType(BusDefinitionType busDefinitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(busDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusInterfacesType(BusInterfacesType busInterfacesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(busInterfacesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusInterfaceType(BusInterfaceType busInterfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(busInterfaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellClassType(CellClassType cellClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cellClassType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellFunctionType(CellFunctionType cellFunctionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cellFunctionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellSpecificationType(CellSpecificationType cellSpecificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cellSpecificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelsType(ChannelsType channelsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(channelsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelType(ChannelType channelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(channelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChoicesType(ChoicesType choicesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(choicesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChoiceType(ChoiceType choiceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(choiceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockDriverType(ClockDriverType clockDriverType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clockDriverType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockDriverType1(ClockDriverType1 clockDriverType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clockDriverType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockPeriodType(ClockPeriodType clockPeriodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clockPeriodType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockPulseDurationType(ClockPulseDurationType clockPulseDurationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clockPulseDurationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockPulseOffsetType(ClockPulseOffsetType clockPulseOffsetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clockPulseOffsetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockPulseValueType(ClockPulseValueType clockPulseValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clockPulseValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandLineSwitchType(CommandLineSwitchType commandLineSwitchType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commandLineSwitchType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandType(CommandType commandType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commandType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandType1(CommandType1 commandType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commandType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandType2(CommandType2 commandType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commandType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentGeneratorsType(ComponentGeneratorsType componentGeneratorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentGeneratorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentGeneratorType(ComponentGeneratorType componentGeneratorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentGeneratorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentInstancesType(ComponentInstancesType componentInstancesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentInstancesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentInstanceType(ComponentInstanceType componentInstanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentInstanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentType(ComponentType componentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurableElementValuesType(ConfigurableElementValuesType configurableElementValuesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configurableElementValuesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurableElementValueType(ConfigurableElementValueType configurableElementValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configurableElementValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionType(ConnectionType connectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintSetsType(ConstraintSetsType constraintSetsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraintSetsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintSetType(ConstraintSetType constraintSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraintSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCpusType(CpusType cpusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cpusType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCpuType(CpuType cpuType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cpuType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultValueType(DefaultValueType defaultValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(defaultValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesignConfigurationType(DesignConfigurationType designConfigurationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(designConfigurationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesignType(DesignType designType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(designType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisabledType(DisabledType disabledType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(disabledType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDriveConstraintType(DriveConstraintType driveConstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(driveConstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDriverType(DriverType driverType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(driverType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnableType(EnableType enableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeratedValuesType(EnumeratedValuesType enumeratedValuesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumeratedValuesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeratedValueType(EnumeratedValueType enumeratedValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumeratedValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationType(EnumerationType enumerationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutableImageType(ExecutableImageType executableImageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(executableImageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalPortReferenceType(ExternalPortReferenceType externalPortReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalPortReferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFieldType(FieldType fieldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fieldType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileBuilderType(FileBuilderType fileBuilderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileBuilderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileBuilderType1(FileBuilderType1 fileBuilderType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileBuilderType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileSetRefGroupType(FileSetRefGroupType fileSetRefGroupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileSetRefGroupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileSetRefGroupType1(FileSetRefGroupType1 fileSetRefGroupType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileSetRefGroupType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileSetRefType(FileSetRefType fileSetRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileSetRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileSetsType(FileSetsType fileSetsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileSetsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileSetType(FileSetType fileSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileType(FileType fileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlagsType(FlagsType flagsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flagsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlagsType1(FlagsType1 flagsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flagsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlagsType2(FlagsType2 flagsType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flagsType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionType(FunctionType functionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneratorChainConfigurationType(GeneratorChainConfigurationType generatorChainConfigurationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generatorChainConfigurationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneratorChainSelectorType(GeneratorChainSelectorType generatorChainSelectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generatorChainSelectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneratorChainType(GeneratorChainType generatorChainType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generatorChainType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneratorSelectorType(GeneratorSelectorType generatorSelectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generatorSelectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneratorType(GeneratorType generatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneratorType1(GeneratorType1 generatorType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generatorType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupSelectorType(GroupSelectorType groupSelectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groupSelectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHierConnectionsType(HierConnectionsType hierConnectionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hierConnectionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHierConnectionType(HierConnectionType hierConnectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hierConnectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHierInterface(HierInterface hierInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hierInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceGeneratorType(InstanceGeneratorType instanceGeneratorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instanceGeneratorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterconnectionConfigurationType(InterconnectionConfigurationType interconnectionConfigurationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interconnectionConfigurationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterconnectionsType(InterconnectionsType interconnectionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interconnectionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterconnectionType(InterconnectionType interconnectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interconnectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interface_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalPortReferenceType(InternalPortReferenceType internalPortReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(internalPortReferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsIncludeFileType(IsIncludeFileType isIncludeFileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(isIncludeFileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageToolsType(LanguageToolsType languageToolsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(languageToolsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageType(LanguageType languageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(languageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageType1(LanguageType1 languageType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(languageType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeftType(LeftType leftType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leftType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeftType1(LeftType1 leftType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leftType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeftType2(LeftType2 leftType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leftType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeftType11(LeftType11 leftType11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leftType11, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibraryRefType(LibraryRefType libraryRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(libraryRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkerCommandFileType(LinkerCommandFileType linkerCommandFileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkerCommandFileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkerFlagsType(LinkerFlagsType linkerFlagsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkerFlagsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkerType(LinkerType linkerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadConstraintType(LoadConstraintType loadConstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadConstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalMemoryMapType(LocalMemoryMapType localMemoryMapType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localMemoryMapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicalNameType(LogicalNameType logicalNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logicalNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicalPortType(LogicalPortType logicalPortType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logicalPortType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicalPortType1(LogicalPortType1 logicalPortType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logicalPortType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskType(MaskType maskType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(maskType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskType1(MaskType1 maskType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(maskType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterType(MasterType masterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(masterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaximumType(MaximumType maximumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(maximumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryMapRefType(MemoryMapRefType memoryMapRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memoryMapRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryMapsType(MemoryMapsType memoryMapsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memoryMapsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryMapType(MemoryMapType memoryMapType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memoryMapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryRemapType(MemoryRemapType memoryRemapType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memoryRemapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinimumType(MinimumType minimumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(minimumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirroredMasterType(MirroredMasterType mirroredMasterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mirroredMasterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirroredSlaveType(MirroredSlaveType mirroredSlaveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mirroredSlaveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirroredSystemType(MirroredSystemType mirroredSystemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mirroredSystemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelParametersType(ModelParametersType modelParametersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelParametersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelParametersType1(ModelParametersType1 modelParametersType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelParametersType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelType(ModelType modelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonitorInterconnectionType(MonitorInterconnectionType monitorInterconnectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(monitorInterconnectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonitorType(MonitorType monitorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(monitorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType(NameType nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType1(NameType1 nameType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType2(NameType2 nameType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameValuePairType(NameValuePairType nameValuePairType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameValuePairType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameValueTypeType(NameValueTypeType nameValueTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameValueTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnMasterType(OnMasterType onMasterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onMasterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnMasterType1(OnMasterType1 onMasterType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onMasterType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnSlaveType(OnSlaveType onSlaveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onSlaveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnSlaveType1(OnSlaveType1 onSlaveType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onSlaveType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnSystemType(OnSystemType onSystemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onSystemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnSystemType1(OnSystemType1 onSystemType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(onSystemType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherClockDriverType(OtherClockDriverType otherClockDriverType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(otherClockDriverType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherClocks(OtherClocks otherClocks, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(otherClocks, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParametersType(ParametersType parametersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parametersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParametersType1(ParametersType1 parametersType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parametersType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhaseType(PhaseType phaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(phaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalPortType(PhysicalPortType physicalPortType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(physicalPortType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalPortType1(PhysicalPortType1 physicalPortType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(physicalPortType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortAccessType(PortAccessType portAccessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portAccessType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortDeclarationType(PortDeclarationType portDeclarationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portDeclarationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortMapsType(PortMapsType portMapsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portMapsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortMapsType1(PortMapsType1 portMapsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portMapsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortMapType(PortMapType portMapType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portMapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortMapType1(PortMapType1 portMapType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portMapType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortsType(PortsType portsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortsType1(PortsType1 portsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortsType2(PortsType2 portsType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portsType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortTransactionalType(PortTransactionalType portTransactionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portTransactionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortType(PortType portType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortType1(PortType1 portType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortWireType(PortWireType portWireType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portWireType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifierType(QualifierType qualifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(qualifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifierType1(QualifierType1 qualifierType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(qualifierType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeType(RangeType rangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeType1(RangeType1 rangeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rangeType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeType2(RangeType2 rangeType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rangeType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeType3(RangeType3 rangeType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rangeType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegisterFileType(RegisterFileType registerFileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(registerFileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegisterType(RegisterType registerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(registerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemapAddressType(RemapAddressType remapAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remapAddressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemapPortsType(RemapPortsType remapPortsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remapPortsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemapPortType(RemapPortType remapPortType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remapPortType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemapStatesType(RemapStatesType remapStatesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remapStatesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemapStateType(RemapStateType remapStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remapStateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReplaceDefaultFlagsType(ReplaceDefaultFlagsType replaceDefaultFlagsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(replaceDefaultFlagsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReplaceDefaultFlagsType1(ReplaceDefaultFlagsType1 replaceDefaultFlagsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(replaceDefaultFlagsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReplaceDefaultFlagsType2(ReplaceDefaultFlagsType2 replaceDefaultFlagsType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(replaceDefaultFlagsType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiresDriverType(RequiresDriverType requiresDriverType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requiresDriverType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResetType(ResetType resetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResetType1(ResetType1 resetType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resetType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResolvedLibraryRefType(ResolvedLibraryRefType resolvedLibraryRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resolvedLibraryRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRightType(RightType rightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rightType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRightType1(RightType1 rightType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rightType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRightType2(RightType2 rightType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rightType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRightType11(RightType11 rightType11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rightType11, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSegmentsType(SegmentsType segmentsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(segmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSegmentType(SegmentType segmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(segmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceType(ServiceType serviceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceType1(ServiceType1 serviceType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceTypeDefsType(ServiceTypeDefsType serviceTypeDefsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceTypeDefsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceTypeDefType(ServiceTypeDefType serviceTypeDefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceTypeDefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleShotDriverType(SingleShotDriverType singleShotDriverType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singleShotDriverType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleShotDurationType(SingleShotDurationType singleShotDurationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singleShotDurationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleShotOffsetType(SingleShotOffsetType singleShotOffsetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singleShotOffsetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleShotValueType(SingleShotValueType singleShotValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singleShotValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSizeType(SizeType sizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sizeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlaveType(SlaveType slaveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slaveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceFileType(SourceFileType sourceFileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sourceFileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceNameType(SourceNameType sourceNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sourceNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubspaceRefType(SubspaceRefType subspaceRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subspaceRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemGroupNamesType(SystemGroupNamesType systemGroupNamesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemGroupNamesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemType(SystemType systemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetNameType(TargetNameType targetNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestableType(TestableType testableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimingConstraintType(TimingConstraintType timingConstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timingConstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionalType(TransactionalType transactionalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transactionalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportMethodsType(TransportMethodsType transportMethodsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transportMethodsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransTypeDefType(TransTypeDefType transTypeDefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transTypeDefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeNameType(TypeNameType typeNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeNameType1(TypeNameType1 typeNameType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeNameType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeNameType2(TypeNameType2 typeNameType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeNameType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeNameType3(TypeNameType3 typeNameType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeNameType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueMaskConfigType(ValueMaskConfigType valueMaskConfigType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueMaskConfigType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType(ValueType valueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType1(ValueType1 valueType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType2(ValueType2 valueType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVectorType(VectorType vectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVectorType1(VectorType1 vectorType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vectorType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVectorType2(VectorType2 vectorType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vectorType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVectorType11(VectorType11 vectorType11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vectorType11, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVendorExtensionsType(VendorExtensionsType vendorExtensionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vendorExtensionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewConfigurationType(ViewConfigurationType viewConfigurationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viewConfigurationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewsType(ViewsType viewsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viewsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewsType1(ViewsType1 viewsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viewsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewType(ViewType viewType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viewType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhiteboxElementRefsType(WhiteboxElementRefsType whiteboxElementRefsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(whiteboxElementRefsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhiteboxElementRefType(WhiteboxElementRefType whiteboxElementRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(whiteboxElementRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhiteboxElementsType(WhiteboxElementsType whiteboxElementsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(whiteboxElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhiteboxElementType(WhiteboxElementType whiteboxElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(whiteboxElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhiteboxPathType(WhiteboxPathType whiteboxPathType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(whiteboxPathType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWidthType(WidthType widthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(widthType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWireType(WireType wireType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wireType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWireTypeDefsType(WireTypeDefsType wireTypeDefsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wireTypeDefsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWireTypeDefType(WireTypeDefType wireTypeDefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wireTypeDefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteValueConstraintType(WriteValueConstraintType writeValueConstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(writeValueConstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractorModeType(AbstractorModeType abstractorModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessType(AccessType accessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApiTypeType(ApiTypeType apiTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBankAlignmentType(BankAlignmentType bankAlignmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitSteeringType(BitSteeringType bitSteeringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellClassValueType(CellClassValueType cellClassValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellFunctionValueType(CellFunctionValueType cellFunctionValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellStrengthValueType(CellStrengthValueType cellStrengthValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentPortDirectionType(ComponentPortDirectionType componentPortDirectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeType(DataTypeType dataTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelayValueType(DelayValueType delayValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelayValueUnitType(DelayValueUnitType delayValueUnitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectionType(DirectionType directionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDriverTypeType(DriverTypeType driverTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdgeValueType(EdgeValueType edgeValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndianessType(EndianessType endianessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileTypeType(FileTypeType fileTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormatType(FormatType formatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitiativeType(InitiativeType initiativeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitiativeType1(InitiativeType1 initiativeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceModeType(InterfaceModeType interfaceModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModifiedWriteValueType(ModifiedWriteValueType modifiedWriteValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleGroupSelectionOperatorType(MultipleGroupSelectionOperatorType multipleGroupSelectionOperatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortAccessTypeType(PortAccessTypeType portAccessTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresenceType(PresenceType presenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeTypeType(RangeTypeType rangeTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadActionType(ReadActionType readActionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResolveType(ResolveType resolveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnTypeType(ReturnTypeType returnTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScopeType(ScopeType scopeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestConstraintType(TestConstraintType testConstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportMethodType(TransportMethodType transportMethodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageType(UsageType usageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageType1(UsageType1 usageType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageTypeType(UsageTypeType usageTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhiteboxTypeType(WhiteboxTypeType whiteboxTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractorModeTypeObject(AbstractorModeType abstractorModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessType1(AccessType accessType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessTypeObject(AccessType accessTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApiTypeTypeObject(ApiTypeType apiTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBankAlignmentTypeObject(BankAlignmentType bankAlignmentTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitSteeringTypeObject(BitSteeringType bitSteeringTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellClassValueTypeObject(CellClassValueType cellClassValueTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellFunctionValueTypeObject(CellFunctionValueType cellFunctionValueTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellStrengthValueTypeObject(CellStrengthValueType cellStrengthValueTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentPortDirectionTypeObject(ComponentPortDirectionType componentPortDirectionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurableDouble(List<?> configurableDouble, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDoubleList_ItemType(configurableDouble, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfigurableDouble_MinLength(configurableDouble, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfigurableDouble_MaxLength(configurableDouble, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Configurable Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurableDouble_MinLength(List<?> configurableDouble, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = configurableDouble.size();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_2009Package.eINSTANCE.getConfigurableDouble(), configurableDouble, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Configurable Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurableDouble_MaxLength(List<?> configurableDouble, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = configurableDouble.size();
		boolean result = length <= 1;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_2009Package.eINSTANCE.getConfigurableDouble(), configurableDouble, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeTypeObject(DataTypeType dataTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelayPercentageType(float delayPercentageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDelayPercentageType_Min(delayPercentageType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelayPercentageType_Max(delayPercentageType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDelayPercentageType_Min
	 */
	public static final float DELAY_PERCENTAGE_TYPE__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Delay Percentage Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelayPercentageType_Min(float delayPercentageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = delayPercentageType >= DELAY_PERCENTAGE_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(_2009Package.eINSTANCE.getDelayPercentageType(), delayPercentageType, DELAY_PERCENTAGE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDelayPercentageType_Max
	 */
	public static final float DELAY_PERCENTAGE_TYPE__MAX__VALUE = 100.0F;

	/**
	 * Validates the Max constraint of '<em>Delay Percentage Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelayPercentageType_Max(float delayPercentageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = delayPercentageType <= DELAY_PERCENTAGE_TYPE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(_2009Package.eINSTANCE.getDelayPercentageType(), delayPercentageType, DELAY_PERCENTAGE_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelayPercentageTypeObject(Float delayPercentageTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDelayPercentageType_Min(delayPercentageTypeObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelayPercentageType_Max(delayPercentageTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelayValueTypeObject(DelayValueType delayValueTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelayValueUnitTypeObject(DelayValueUnitType delayValueUnitTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectionTypeObject(DirectionType directionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleList(List<?> doubleList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDoubleList_ItemType(doubleList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Double List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleList_ItemType(List<?> doubleList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = doubleList.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.DOUBLE.isInstance(item)) {
				result &= xmlTypeValidator.validateDouble((Double)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.DOUBLE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDriverTypeTypeObject(DriverTypeType driverTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdgeValueTypeObject(EdgeValueType edgeValueTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndianessTypeObject(EndianessType endianessTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvIdentifierType(String envIdentifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEnvIdentifierType_Pattern(envIdentifierType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateEnvIdentifierType_Pattern
	 */
	public static final  PatternMatcher [][] ENV_IDENTIFIER_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z0-9_+\\*\\.]*:[a-zA-Z0-9_+\\*\\.]*:[a-zA-Z0-9_+\\*\\.]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Env Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvIdentifierType_Pattern(String envIdentifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_2009Package.eINSTANCE.getEnvIdentifierType(), envIdentifierType, ENV_IDENTIFIER_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvIdentifierType1(String envIdentifierType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEnvIdentifierType1_Pattern(envIdentifierType1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateEnvIdentifierType1_Pattern
	 */
	public static final  PatternMatcher [][] ENV_IDENTIFIER_TYPE1__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z0-9_+\\*\\.]*:[a-zA-Z0-9_+\\*\\.]*:[a-zA-Z0-9_+\\*\\.]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Env Identifier Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvIdentifierType1_Pattern(String envIdentifierType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_2009Package.eINSTANCE.getEnvIdentifierType1(), envIdentifierType1, ENV_IDENTIFIER_TYPE1__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileTypeTypeObject(FileTypeType fileTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormatTypeObject(FormatType formatTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitiativeTypeObject(InitiativeType initiativeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitiativeTypeObject1(InitiativeType1 initiativeTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstancePath(String instancePath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInstancePath_Pattern(instancePath, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateInstancePath_Pattern
	 */
	public static final  PatternMatcher [][] INSTANCE_PATH__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i[\\p{L}\\p{N}\\.\\-:_]*"),
				XMLTypeUtil.createPatternMatcher("\\i[\\p{L}\\p{N}\\.\\-:_]*/\\i[\\p{L}\\p{N}\\.\\-:_]*"),
				XMLTypeUtil.createPatternMatcher("(\\i[\\p{L}\\p{N}\\.\\-:_]*/)+[\\i\\p{L}\\p{N}\\.\\-:_]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Instance Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstancePath_Pattern(String instancePath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_2009Package.eINSTANCE.getInstancePath(), instancePath, INSTANCE_PATH__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceModeTypeObject(InterfaceModeType interfaceModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModifiedWriteValueTypeObject(ModifiedWriteValueType modifiedWriteValueTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleGroupSelectionOperatorTypeObject(MultipleGroupSelectionOperatorType multipleGroupSelectionOperatorTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeFloat(float nonNegativeFloat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonNegativeFloat_Min(nonNegativeFloat, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNonNegativeFloat_Min
	 */
	public static final float NON_NEGATIVE_FLOAT__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Non Negative Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeFloat_Min(float nonNegativeFloat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = nonNegativeFloat >= NON_NEGATIVE_FLOAT__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(_2009Package.eINSTANCE.getNonNegativeFloat(), nonNegativeFloat, NON_NEGATIVE_FLOAT__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeFloatObject(Float nonNegativeFloatObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonNegativeFloat_Min(nonNegativeFloatObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortAccessTypeTypeObject(PortAccessTypeType portAccessTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortName(String portName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePortName_Pattern(portName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePortName_Pattern
	 */
	public static final  PatternMatcher [][] PORT_NAME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i[\\p{L}\\p{N}\\.\\-:_]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Port Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortName_Pattern(String portName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_2009Package.eINSTANCE.getPortName(), portName, PORT_NAME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresenceTypeObject(PresenceType presenceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeTypeTypeObject(RangeTypeType rangeTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadActionTypeObject(ReadActionType readActionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResolveTypeObject(ResolveType resolveTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnTypeTypeObject(ReturnTypeType returnTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScaledInteger(String scaledInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateScaledInteger_Pattern(scaledInteger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateScaledInteger_Pattern
	 */
	public static final  PatternMatcher [][] SCALED_INTEGER__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[+\\-]?(0x|0X|#)?[0-9a-fA-F]+[kmgtKMGT]?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Scaled Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScaledInteger_Pattern(String scaledInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_2009Package.eINSTANCE.getScaledInteger(), scaledInteger, SCALED_INTEGER__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScaledNonNegativeInteger(String scaledNonNegativeInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateScaledNonNegativeInteger_Pattern(scaledNonNegativeInteger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateScaledNonNegativeInteger_Pattern
	 */
	public static final  PatternMatcher [][] SCALED_NON_NEGATIVE_INTEGER__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[+]?(0x|0X|#)?[0-9a-fA-F]+[kmgtKMGT]?")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[+\\-]?(0x|0X|#)?[0-9a-fA-F]+[kmgtKMGT]?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Scaled Non Negative Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScaledNonNegativeInteger_Pattern(String scaledNonNegativeInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_2009Package.eINSTANCE.getScaledNonNegativeInteger(), scaledNonNegativeInteger, SCALED_NON_NEGATIVE_INTEGER__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScaledPositiveInteger(String scaledPositiveInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateScaledPositiveInteger_Pattern(scaledPositiveInteger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateScaledPositiveInteger_Pattern
	 */
	public static final  PatternMatcher [][] SCALED_POSITIVE_INTEGER__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[+]?(0x|0X|#)?[0]*[1-9a-fA-F][0-9a-fA-F]*[kmgtKMGT]?")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[+]?(0x|0X|#)?[0-9a-fA-F]+[kmgtKMGT]?")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[+\\-]?(0x|0X|#)?[0-9a-fA-F]+[kmgtKMGT]?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Scaled Positive Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScaledPositiveInteger_Pattern(String scaledPositiveInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_2009Package.eINSTANCE.getScaledPositiveInteger(), scaledPositiveInteger, SCALED_POSITIVE_INTEGER__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScopeTypeObject(ScopeType scopeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpiritURI(String spiritURI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSpiritURI_MemberTypes(spiritURI, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Spirit URI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpiritURI_MemberTypes(String spiritURI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.STRING.isInstance(spiritURI)) {
				if (xmlTypeValidator.validateString(spiritURI, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.STRING.isInstance(spiritURI)) {
				if (xmlTypeValidator.validateString(spiritURI, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestConstraintTypeObject(TestConstraintType testConstraintTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportMethodTypeObject(TransportMethodType transportMethodTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageTypeObject(UsageType usageTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageTypeObject1(UsageType1 usageTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageTypeTypeObject(UsageTypeType usageTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhiteboxTypeTypeObject(WhiteboxTypeType whiteboxTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //_2009Validator
