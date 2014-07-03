/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.spiritconsortium.xml.schema.spirit._1685._2009.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _2009FactoryImpl extends EFactoryImpl implements _2009Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _2009Factory init() {
		try {
			_2009Factory the_2009Factory = (_2009Factory)EPackage.Registry.INSTANCE.getEFactory(_2009Package.eNS_URI);
			if (the_2009Factory != null) {
				return the_2009Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _2009FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _2009FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case _2009Package.ABSTRACTION_DEFINITION_TYPE: return createAbstractionDefinitionType();
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE: return createAbstractionDefPortConstraintsType();
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE: return createAbstractorBusInterfaceType();
			case _2009Package.ABSTRACTOR_GENERATORS_TYPE: return createAbstractorGeneratorsType();
			case _2009Package.ABSTRACTOR_INTERFACES_TYPE: return createAbstractorInterfacesType();
			case _2009Package.ABSTRACTOR_MODEL_TYPE: return createAbstractorModelType();
			case _2009Package.ABSTRACTOR_MODE_TYPE1: return createAbstractorModeType1();
			case _2009Package.ABSTRACTOR_PORT_TYPE: return createAbstractorPortType();
			case _2009Package.ABSTRACTOR_PORT_WIRE_TYPE: return createAbstractorPortWireType();
			case _2009Package.ABSTRACTORS_TYPE: return createAbstractorsType();
			case _2009Package.ABSTRACTOR_TYPE: return createAbstractorType();
			case _2009Package.ABSTRACTOR_TYPE1: return createAbstractorType1();
			case _2009Package.ABSTRACTOR_VIEW_TYPE: return createAbstractorViewType();
			case _2009Package.ADDRESS_BANK_TYPE: return createAddressBankType();
			case _2009Package.ADDRESS_BLOCK_TYPE: return createAddressBlockType();
			case _2009Package.ADDRESS_OFFSET_TYPE: return createAddressOffsetType();
			case _2009Package.ADDRESS_SPACE_REF_TYPE: return createAddressSpaceRefType();
			case _2009Package.ADDRESS_SPACES_TYPE: return createAddressSpacesType();
			case _2009Package.ADDRESS_SPACE_TYPE: return createAddressSpaceType();
			case _2009Package.ADDR_SPACE_REF_TYPE: return createAddrSpaceRefType();
			case _2009Package.AD_HOC_CONNECTIONS_TYPE: return createAdHocConnectionsType();
			case _2009Package.AD_HOC_CONNECTION_TYPE: return createAdHocConnectionType();
			case _2009Package.ALTERNATE_GROUPS_TYPE: return createAlternateGroupsType();
			case _2009Package.ALTERNATE_REGISTERS_TYPE: return createAlternateRegistersType();
			case _2009Package.ALTERNATE_REGISTER_TYPE: return createAlternateRegisterType();
			case _2009Package.ARGUMENT_TYPE: return createArgumentType();
			case _2009Package.BANKED_BANK_TYPE: return createBankedBankType();
			case _2009Package.BANKED_BLOCK_TYPE: return createBankedBlockType();
			case _2009Package.BANKED_SUBSPACE_TYPE: return createBankedSubspaceType();
			case _2009Package.BASE_ADDRESSES_TYPE: return createBaseAddressesType();
			case _2009Package.BASE_ADDRESS_TYPE: return createBaseAddressType();
			case _2009Package.BASE_ADDRESS_TYPE1: return createBaseAddressType1();
			case _2009Package.BIT_STEERING_TYPE1: return createBitSteeringType1();
			case _2009Package.BIT_WIDTH_TYPE: return createBitWidthType();
			case _2009Package.BRIDGE_TYPE: return createBridgeType();
			case _2009Package.BUILD_COMMAND_TYPE: return createBuildCommandType();
			case _2009Package.BUS_DEFINITION_TYPE: return createBusDefinitionType();
			case _2009Package.BUS_INTERFACES_TYPE: return createBusInterfacesType();
			case _2009Package.BUS_INTERFACE_TYPE: return createBusInterfaceType();
			case _2009Package.CELL_CLASS_TYPE: return createCellClassType();
			case _2009Package.CELL_FUNCTION_TYPE: return createCellFunctionType();
			case _2009Package.CELL_SPECIFICATION_TYPE: return createCellSpecificationType();
			case _2009Package.CHANNELS_TYPE: return createChannelsType();
			case _2009Package.CHANNEL_TYPE: return createChannelType();
			case _2009Package.CHOICES_TYPE: return createChoicesType();
			case _2009Package.CHOICE_TYPE: return createChoiceType();
			case _2009Package.CLOCK_DRIVER_TYPE: return createClockDriverType();
			case _2009Package.CLOCK_DRIVER_TYPE1: return createClockDriverType1();
			case _2009Package.CLOCK_PERIOD_TYPE: return createClockPeriodType();
			case _2009Package.CLOCK_PULSE_DURATION_TYPE: return createClockPulseDurationType();
			case _2009Package.CLOCK_PULSE_OFFSET_TYPE: return createClockPulseOffsetType();
			case _2009Package.CLOCK_PULSE_VALUE_TYPE: return createClockPulseValueType();
			case _2009Package.COMMAND_LINE_SWITCH_TYPE: return createCommandLineSwitchType();
			case _2009Package.COMMAND_TYPE: return createCommandType();
			case _2009Package.COMMAND_TYPE1: return createCommandType1();
			case _2009Package.COMMAND_TYPE2: return createCommandType2();
			case _2009Package.COMPONENT_GENERATORS_TYPE: return createComponentGeneratorsType();
			case _2009Package.COMPONENT_GENERATOR_TYPE: return createComponentGeneratorType();
			case _2009Package.COMPONENT_INSTANCES_TYPE: return createComponentInstancesType();
			case _2009Package.COMPONENT_INSTANCE_TYPE: return createComponentInstanceType();
			case _2009Package.COMPONENT_TYPE: return createComponentType();
			case _2009Package.CONFIGURABLE_ELEMENT_VALUES_TYPE: return createConfigurableElementValuesType();
			case _2009Package.CONFIGURABLE_ELEMENT_VALUE_TYPE: return createConfigurableElementValueType();
			case _2009Package.CONNECTION_TYPE: return createConnectionType();
			case _2009Package.CONSTRAINT_SETS_TYPE: return createConstraintSetsType();
			case _2009Package.CONSTRAINT_SET_TYPE: return createConstraintSetType();
			case _2009Package.CPUS_TYPE: return createCpusType();
			case _2009Package.CPU_TYPE: return createCpuType();
			case _2009Package.DEFAULT_VALUE_TYPE: return createDefaultValueType();
			case _2009Package.DESIGN_CONFIGURATION_TYPE: return createDesignConfigurationType();
			case _2009Package.DESIGN_TYPE: return createDesignType();
			case _2009Package.DISABLED_TYPE: return createDisabledType();
			case _2009Package.DOCUMENT_ROOT: return createDocumentRoot();
			case _2009Package.DRIVE_CONSTRAINT_TYPE: return createDriveConstraintType();
			case _2009Package.DRIVER_TYPE: return createDriverType();
			case _2009Package.ENABLE_TYPE: return createEnableType();
			case _2009Package.ENUMERATED_VALUES_TYPE: return createEnumeratedValuesType();
			case _2009Package.ENUMERATED_VALUE_TYPE: return createEnumeratedValueType();
			case _2009Package.ENUMERATION_TYPE: return createEnumerationType();
			case _2009Package.EXECUTABLE_IMAGE_TYPE: return createExecutableImageType();
			case _2009Package.EXTERNAL_PORT_REFERENCE_TYPE: return createExternalPortReferenceType();
			case _2009Package.FIELD_TYPE: return createFieldType();
			case _2009Package.FILE_BUILDER_TYPE: return createFileBuilderType();
			case _2009Package.FILE_BUILDER_TYPE1: return createFileBuilderType1();
			case _2009Package.FILE_SET_REF_GROUP_TYPE: return createFileSetRefGroupType();
			case _2009Package.FILE_SET_REF_GROUP_TYPE1: return createFileSetRefGroupType1();
			case _2009Package.FILE_SET_REF_TYPE: return createFileSetRefType();
			case _2009Package.FILE_SETS_TYPE: return createFileSetsType();
			case _2009Package.FILE_SET_TYPE: return createFileSetType();
			case _2009Package.FILE_TYPE: return createFileType();
			case _2009Package.FLAGS_TYPE: return createFlagsType();
			case _2009Package.FLAGS_TYPE1: return createFlagsType1();
			case _2009Package.FLAGS_TYPE2: return createFlagsType2();
			case _2009Package.FUNCTION_TYPE: return createFunctionType();
			case _2009Package.GENERATOR_CHAIN_CONFIGURATION_TYPE: return createGeneratorChainConfigurationType();
			case _2009Package.GENERATOR_CHAIN_SELECTOR_TYPE: return createGeneratorChainSelectorType();
			case _2009Package.GENERATOR_CHAIN_TYPE: return createGeneratorChainType();
			case _2009Package.GENERATOR_SELECTOR_TYPE: return createGeneratorSelectorType();
			case _2009Package.GENERATOR_TYPE: return createGeneratorType();
			case _2009Package.GENERATOR_TYPE1: return createGeneratorType1();
			case _2009Package.GROUP_SELECTOR_TYPE: return createGroupSelectorType();
			case _2009Package.HIER_CONNECTIONS_TYPE: return createHierConnectionsType();
			case _2009Package.HIER_CONNECTION_TYPE: return createHierConnectionType();
			case _2009Package.HIER_INTERFACE: return createHierInterface();
			case _2009Package.INSTANCE_GENERATOR_TYPE: return createInstanceGeneratorType();
			case _2009Package.INTERCONNECTION_CONFIGURATION_TYPE: return createInterconnectionConfigurationType();
			case _2009Package.INTERCONNECTIONS_TYPE: return createInterconnectionsType();
			case _2009Package.INTERCONNECTION_TYPE: return createInterconnectionType();
			case _2009Package.INTERFACE: return createInterface();
			case _2009Package.INTERNAL_PORT_REFERENCE_TYPE: return createInternalPortReferenceType();
			case _2009Package.IS_INCLUDE_FILE_TYPE: return createIsIncludeFileType();
			case _2009Package.LANGUAGE_TOOLS_TYPE: return createLanguageToolsType();
			case _2009Package.LANGUAGE_TYPE: return createLanguageType();
			case _2009Package.LANGUAGE_TYPE1: return createLanguageType1();
			case _2009Package.LEFT_TYPE: return createLeftType();
			case _2009Package.LEFT_TYPE1: return createLeftType1();
			case _2009Package.LEFT_TYPE2: return createLeftType2();
			case _2009Package.LEFT_TYPE11: return createLeftType11();
			case _2009Package.LIBRARY_REF_TYPE: return createLibraryRefType();
			case _2009Package.LINKER_COMMAND_FILE_TYPE: return createLinkerCommandFileType();
			case _2009Package.LINKER_FLAGS_TYPE: return createLinkerFlagsType();
			case _2009Package.LINKER_TYPE: return createLinkerType();
			case _2009Package.LOAD_CONSTRAINT_TYPE: return createLoadConstraintType();
			case _2009Package.LOCAL_MEMORY_MAP_TYPE: return createLocalMemoryMapType();
			case _2009Package.LOGICAL_NAME_TYPE: return createLogicalNameType();
			case _2009Package.LOGICAL_PORT_TYPE: return createLogicalPortType();
			case _2009Package.LOGICAL_PORT_TYPE1: return createLogicalPortType1();
			case _2009Package.MASK_TYPE: return createMaskType();
			case _2009Package.MASK_TYPE1: return createMaskType1();
			case _2009Package.MASTER_TYPE: return createMasterType();
			case _2009Package.MAXIMUM_TYPE: return createMaximumType();
			case _2009Package.MEMORY_MAP_REF_TYPE: return createMemoryMapRefType();
			case _2009Package.MEMORY_MAPS_TYPE: return createMemoryMapsType();
			case _2009Package.MEMORY_MAP_TYPE: return createMemoryMapType();
			case _2009Package.MEMORY_REMAP_TYPE: return createMemoryRemapType();
			case _2009Package.MINIMUM_TYPE: return createMinimumType();
			case _2009Package.MIRRORED_MASTER_TYPE: return createMirroredMasterType();
			case _2009Package.MIRRORED_SLAVE_TYPE: return createMirroredSlaveType();
			case _2009Package.MIRRORED_SYSTEM_TYPE: return createMirroredSystemType();
			case _2009Package.MODEL_PARAMETERS_TYPE: return createModelParametersType();
			case _2009Package.MODEL_PARAMETERS_TYPE1: return createModelParametersType1();
			case _2009Package.MODEL_TYPE: return createModelType();
			case _2009Package.MONITOR_INTERCONNECTION_TYPE: return createMonitorInterconnectionType();
			case _2009Package.MONITOR_TYPE: return createMonitorType();
			case _2009Package.NAME_TYPE: return createNameType();
			case _2009Package.NAME_TYPE1: return createNameType1();
			case _2009Package.NAME_TYPE2: return createNameType2();
			case _2009Package.NAME_VALUE_PAIR_TYPE: return createNameValuePairType();
			case _2009Package.NAME_VALUE_TYPE_TYPE: return createNameValueTypeType();
			case _2009Package.ON_MASTER_TYPE: return createOnMasterType();
			case _2009Package.ON_MASTER_TYPE1: return createOnMasterType1();
			case _2009Package.ON_SLAVE_TYPE: return createOnSlaveType();
			case _2009Package.ON_SLAVE_TYPE1: return createOnSlaveType1();
			case _2009Package.ON_SYSTEM_TYPE: return createOnSystemType();
			case _2009Package.ON_SYSTEM_TYPE1: return createOnSystemType1();
			case _2009Package.OTHER_CLOCK_DRIVER_TYPE: return createOtherClockDriverType();
			case _2009Package.OTHER_CLOCKS: return createOtherClocks();
			case _2009Package.PARAMETERS_TYPE: return createParametersType();
			case _2009Package.PARAMETERS_TYPE1: return createParametersType1();
			case _2009Package.PHASE_TYPE: return createPhaseType();
			case _2009Package.PHYSICAL_PORT_TYPE: return createPhysicalPortType();
			case _2009Package.PHYSICAL_PORT_TYPE1: return createPhysicalPortType1();
			case _2009Package.PORT_ACCESS_TYPE: return createPortAccessType();
			case _2009Package.PORT_DECLARATION_TYPE: return createPortDeclarationType();
			case _2009Package.PORT_MAPS_TYPE: return createPortMapsType();
			case _2009Package.PORT_MAPS_TYPE1: return createPortMapsType1();
			case _2009Package.PORT_MAP_TYPE: return createPortMapType();
			case _2009Package.PORT_MAP_TYPE1: return createPortMapType1();
			case _2009Package.PORTS_TYPE: return createPortsType();
			case _2009Package.PORTS_TYPE1: return createPortsType1();
			case _2009Package.PORTS_TYPE2: return createPortsType2();
			case _2009Package.PORT_TRANSACTIONAL_TYPE: return createPortTransactionalType();
			case _2009Package.PORT_TYPE: return createPortType();
			case _2009Package.PORT_TYPE1: return createPortType1();
			case _2009Package.PORT_WIRE_TYPE: return createPortWireType();
			case _2009Package.QUALIFIER_TYPE: return createQualifierType();
			case _2009Package.QUALIFIER_TYPE1: return createQualifierType1();
			case _2009Package.RANGE_TYPE: return createRangeType();
			case _2009Package.RANGE_TYPE1: return createRangeType1();
			case _2009Package.RANGE_TYPE2: return createRangeType2();
			case _2009Package.RANGE_TYPE3: return createRangeType3();
			case _2009Package.REGISTER_FILE_TYPE: return createRegisterFileType();
			case _2009Package.REGISTER_TYPE: return createRegisterType();
			case _2009Package.REMAP_ADDRESS_TYPE: return createRemapAddressType();
			case _2009Package.REMAP_PORTS_TYPE: return createRemapPortsType();
			case _2009Package.REMAP_PORT_TYPE: return createRemapPortType();
			case _2009Package.REMAP_STATES_TYPE: return createRemapStatesType();
			case _2009Package.REMAP_STATE_TYPE: return createRemapStateType();
			case _2009Package.REPLACE_DEFAULT_FLAGS_TYPE: return createReplaceDefaultFlagsType();
			case _2009Package.REPLACE_DEFAULT_FLAGS_TYPE1: return createReplaceDefaultFlagsType1();
			case _2009Package.REPLACE_DEFAULT_FLAGS_TYPE2: return createReplaceDefaultFlagsType2();
			case _2009Package.REQUIRES_DRIVER_TYPE: return createRequiresDriverType();
			case _2009Package.RESET_TYPE: return createResetType();
			case _2009Package.RESET_TYPE1: return createResetType1();
			case _2009Package.RESOLVED_LIBRARY_REF_TYPE: return createResolvedLibraryRefType();
			case _2009Package.RIGHT_TYPE: return createRightType();
			case _2009Package.RIGHT_TYPE1: return createRightType1();
			case _2009Package.RIGHT_TYPE2: return createRightType2();
			case _2009Package.RIGHT_TYPE11: return createRightType11();
			case _2009Package.SEGMENTS_TYPE: return createSegmentsType();
			case _2009Package.SEGMENT_TYPE: return createSegmentType();
			case _2009Package.SERVICE_TYPE: return createServiceType();
			case _2009Package.SERVICE_TYPE1: return createServiceType1();
			case _2009Package.SERVICE_TYPE_DEFS_TYPE: return createServiceTypeDefsType();
			case _2009Package.SERVICE_TYPE_DEF_TYPE: return createServiceTypeDefType();
			case _2009Package.SINGLE_SHOT_DRIVER_TYPE: return createSingleShotDriverType();
			case _2009Package.SINGLE_SHOT_DURATION_TYPE: return createSingleShotDurationType();
			case _2009Package.SINGLE_SHOT_OFFSET_TYPE: return createSingleShotOffsetType();
			case _2009Package.SINGLE_SHOT_VALUE_TYPE: return createSingleShotValueType();
			case _2009Package.SIZE_TYPE: return createSizeType();
			case _2009Package.SLAVE_TYPE: return createSlaveType();
			case _2009Package.SOURCE_FILE_TYPE: return createSourceFileType();
			case _2009Package.SOURCE_NAME_TYPE: return createSourceNameType();
			case _2009Package.SUBSPACE_REF_TYPE: return createSubspaceRefType();
			case _2009Package.SYSTEM_GROUP_NAMES_TYPE: return createSystemGroupNamesType();
			case _2009Package.SYSTEM_TYPE: return createSystemType();
			case _2009Package.TARGET_NAME_TYPE: return createTargetNameType();
			case _2009Package.TESTABLE_TYPE: return createTestableType();
			case _2009Package.TIMING_CONSTRAINT_TYPE: return createTimingConstraintType();
			case _2009Package.TRANSACTIONAL_TYPE: return createTransactionalType();
			case _2009Package.TRANSPORT_METHODS_TYPE: return createTransportMethodsType();
			case _2009Package.TRANS_TYPE_DEF_TYPE: return createTransTypeDefType();
			case _2009Package.TYPE_NAME_TYPE: return createTypeNameType();
			case _2009Package.TYPE_NAME_TYPE1: return createTypeNameType1();
			case _2009Package.TYPE_NAME_TYPE2: return createTypeNameType2();
			case _2009Package.TYPE_NAME_TYPE3: return createTypeNameType3();
			case _2009Package.VALUE_MASK_CONFIG_TYPE: return createValueMaskConfigType();
			case _2009Package.VALUE_TYPE: return createValueType();
			case _2009Package.VALUE_TYPE1: return createValueType1();
			case _2009Package.VALUE_TYPE2: return createValueType2();
			case _2009Package.VECTOR_TYPE: return createVectorType();
			case _2009Package.VECTOR_TYPE1: return createVectorType1();
			case _2009Package.VECTOR_TYPE2: return createVectorType2();
			case _2009Package.VECTOR_TYPE11: return createVectorType11();
			case _2009Package.VENDOR_EXTENSIONS_TYPE: return createVendorExtensionsType();
			case _2009Package.VIEW_CONFIGURATION_TYPE: return createViewConfigurationType();
			case _2009Package.VIEWS_TYPE: return createViewsType();
			case _2009Package.VIEWS_TYPE1: return createViewsType1();
			case _2009Package.VIEW_TYPE: return createViewType();
			case _2009Package.WHITEBOX_ELEMENT_REFS_TYPE: return createWhiteboxElementRefsType();
			case _2009Package.WHITEBOX_ELEMENT_REF_TYPE: return createWhiteboxElementRefType();
			case _2009Package.WHITEBOX_ELEMENTS_TYPE: return createWhiteboxElementsType();
			case _2009Package.WHITEBOX_ELEMENT_TYPE: return createWhiteboxElementType();
			case _2009Package.WHITEBOX_PATH_TYPE: return createWhiteboxPathType();
			case _2009Package.WIDTH_TYPE: return createWidthType();
			case _2009Package.WIRE_TYPE: return createWireType();
			case _2009Package.WIRE_TYPE_DEFS_TYPE: return createWireTypeDefsType();
			case _2009Package.WIRE_TYPE_DEF_TYPE: return createWireTypeDefType();
			case _2009Package.WRITE_VALUE_CONSTRAINT_TYPE: return createWriteValueConstraintType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case _2009Package.ABSTRACTOR_MODE_TYPE:
				return createAbstractorModeTypeFromString(eDataType, initialValue);
			case _2009Package.ACCESS_TYPE:
				return createAccessTypeFromString(eDataType, initialValue);
			case _2009Package.API_TYPE_TYPE:
				return createApiTypeTypeFromString(eDataType, initialValue);
			case _2009Package.BANK_ALIGNMENT_TYPE:
				return createBankAlignmentTypeFromString(eDataType, initialValue);
			case _2009Package.BIT_STEERING_TYPE:
				return createBitSteeringTypeFromString(eDataType, initialValue);
			case _2009Package.CELL_CLASS_VALUE_TYPE:
				return createCellClassValueTypeFromString(eDataType, initialValue);
			case _2009Package.CELL_FUNCTION_VALUE_TYPE:
				return createCellFunctionValueTypeFromString(eDataType, initialValue);
			case _2009Package.CELL_STRENGTH_VALUE_TYPE:
				return createCellStrengthValueTypeFromString(eDataType, initialValue);
			case _2009Package.COMPONENT_PORT_DIRECTION_TYPE:
				return createComponentPortDirectionTypeFromString(eDataType, initialValue);
			case _2009Package.DATA_TYPE_TYPE:
				return createDataTypeTypeFromString(eDataType, initialValue);
			case _2009Package.DELAY_VALUE_TYPE:
				return createDelayValueTypeFromString(eDataType, initialValue);
			case _2009Package.DELAY_VALUE_UNIT_TYPE:
				return createDelayValueUnitTypeFromString(eDataType, initialValue);
			case _2009Package.DIRECTION_TYPE:
				return createDirectionTypeFromString(eDataType, initialValue);
			case _2009Package.DRIVER_TYPE_TYPE:
				return createDriverTypeTypeFromString(eDataType, initialValue);
			case _2009Package.EDGE_VALUE_TYPE:
				return createEdgeValueTypeFromString(eDataType, initialValue);
			case _2009Package.ENDIANESS_TYPE:
				return createEndianessTypeFromString(eDataType, initialValue);
			case _2009Package.FILE_TYPE_TYPE:
				return createFileTypeTypeFromString(eDataType, initialValue);
			case _2009Package.FORMAT_TYPE:
				return createFormatTypeFromString(eDataType, initialValue);
			case _2009Package.INITIATIVE_TYPE:
				return createInitiativeTypeFromString(eDataType, initialValue);
			case _2009Package.INITIATIVE_TYPE1:
				return createInitiativeType1FromString(eDataType, initialValue);
			case _2009Package.INTERFACE_MODE_TYPE:
				return createInterfaceModeTypeFromString(eDataType, initialValue);
			case _2009Package.MODIFIED_WRITE_VALUE_TYPE:
				return createModifiedWriteValueTypeFromString(eDataType, initialValue);
			case _2009Package.MULTIPLE_GROUP_SELECTION_OPERATOR_TYPE:
				return createMultipleGroupSelectionOperatorTypeFromString(eDataType, initialValue);
			case _2009Package.PORT_ACCESS_TYPE_TYPE:
				return createPortAccessTypeTypeFromString(eDataType, initialValue);
			case _2009Package.PRESENCE_TYPE:
				return createPresenceTypeFromString(eDataType, initialValue);
			case _2009Package.RANGE_TYPE_TYPE:
				return createRangeTypeTypeFromString(eDataType, initialValue);
			case _2009Package.READ_ACTION_TYPE:
				return createReadActionTypeFromString(eDataType, initialValue);
			case _2009Package.RESOLVE_TYPE:
				return createResolveTypeFromString(eDataType, initialValue);
			case _2009Package.RETURN_TYPE_TYPE:
				return createReturnTypeTypeFromString(eDataType, initialValue);
			case _2009Package.SCOPE_TYPE:
				return createScopeTypeFromString(eDataType, initialValue);
			case _2009Package.TEST_CONSTRAINT_TYPE:
				return createTestConstraintTypeFromString(eDataType, initialValue);
			case _2009Package.TRANSPORT_METHOD_TYPE:
				return createTransportMethodTypeFromString(eDataType, initialValue);
			case _2009Package.USAGE_TYPE:
				return createUsageTypeFromString(eDataType, initialValue);
			case _2009Package.USAGE_TYPE1:
				return createUsageType1FromString(eDataType, initialValue);
			case _2009Package.USAGE_TYPE_TYPE:
				return createUsageTypeTypeFromString(eDataType, initialValue);
			case _2009Package.WHITEBOX_TYPE_TYPE:
				return createWhiteboxTypeTypeFromString(eDataType, initialValue);
			case _2009Package.ABSTRACTOR_MODE_TYPE_OBJECT:
				return createAbstractorModeTypeObjectFromString(eDataType, initialValue);
			case _2009Package.ACCESS_TYPE1:
				return createAccessType1FromString(eDataType, initialValue);
			case _2009Package.ACCESS_TYPE_OBJECT:
				return createAccessTypeObjectFromString(eDataType, initialValue);
			case _2009Package.API_TYPE_TYPE_OBJECT:
				return createApiTypeTypeObjectFromString(eDataType, initialValue);
			case _2009Package.BANK_ALIGNMENT_TYPE_OBJECT:
				return createBankAlignmentTypeObjectFromString(eDataType, initialValue);
			case _2009Package.BIT_STEERING_TYPE_OBJECT:
				return createBitSteeringTypeObjectFromString(eDataType, initialValue);
			case _2009Package.CELL_CLASS_VALUE_TYPE_OBJECT:
				return createCellClassValueTypeObjectFromString(eDataType, initialValue);
			case _2009Package.CELL_FUNCTION_VALUE_TYPE_OBJECT:
				return createCellFunctionValueTypeObjectFromString(eDataType, initialValue);
			case _2009Package.CELL_STRENGTH_VALUE_TYPE_OBJECT:
				return createCellStrengthValueTypeObjectFromString(eDataType, initialValue);
			case _2009Package.COMPONENT_PORT_DIRECTION_TYPE_OBJECT:
				return createComponentPortDirectionTypeObjectFromString(eDataType, initialValue);
			case _2009Package.CONFIGURABLE_DOUBLE:
				return createConfigurableDoubleFromString(eDataType, initialValue);
			case _2009Package.DATA_TYPE_TYPE_OBJECT:
				return createDataTypeTypeObjectFromString(eDataType, initialValue);
			case _2009Package.DELAY_PERCENTAGE_TYPE:
				return createDelayPercentageTypeFromString(eDataType, initialValue);
			case _2009Package.DELAY_PERCENTAGE_TYPE_OBJECT:
				return createDelayPercentageTypeObjectFromString(eDataType, initialValue);
			case _2009Package.DELAY_VALUE_TYPE_OBJECT:
				return createDelayValueTypeObjectFromString(eDataType, initialValue);
			case _2009Package.DELAY_VALUE_UNIT_TYPE_OBJECT:
				return createDelayValueUnitTypeObjectFromString(eDataType, initialValue);
			case _2009Package.DIRECTION_TYPE_OBJECT:
				return createDirectionTypeObjectFromString(eDataType, initialValue);
			case _2009Package.DOUBLE_LIST:
				return createDoubleListFromString(eDataType, initialValue);
			case _2009Package.DRIVER_TYPE_TYPE_OBJECT:
				return createDriverTypeTypeObjectFromString(eDataType, initialValue);
			case _2009Package.EDGE_VALUE_TYPE_OBJECT:
				return createEdgeValueTypeObjectFromString(eDataType, initialValue);
			case _2009Package.ENDIANESS_TYPE_OBJECT:
				return createEndianessTypeObjectFromString(eDataType, initialValue);
			case _2009Package.ENV_IDENTIFIER_TYPE:
				return createEnvIdentifierTypeFromString(eDataType, initialValue);
			case _2009Package.ENV_IDENTIFIER_TYPE1:
				return createEnvIdentifierType1FromString(eDataType, initialValue);
			case _2009Package.FILE_TYPE_TYPE_OBJECT:
				return createFileTypeTypeObjectFromString(eDataType, initialValue);
			case _2009Package.FORMAT_TYPE_OBJECT:
				return createFormatTypeObjectFromString(eDataType, initialValue);
			case _2009Package.INITIATIVE_TYPE_OBJECT:
				return createInitiativeTypeObjectFromString(eDataType, initialValue);
			case _2009Package.INITIATIVE_TYPE_OBJECT1:
				return createInitiativeTypeObject1FromString(eDataType, initialValue);
			case _2009Package.INSTANCE_PATH:
				return createInstancePathFromString(eDataType, initialValue);
			case _2009Package.INTERFACE_MODE_TYPE_OBJECT:
				return createInterfaceModeTypeObjectFromString(eDataType, initialValue);
			case _2009Package.MODIFIED_WRITE_VALUE_TYPE_OBJECT:
				return createModifiedWriteValueTypeObjectFromString(eDataType, initialValue);
			case _2009Package.MULTIPLE_GROUP_SELECTION_OPERATOR_TYPE_OBJECT:
				return createMultipleGroupSelectionOperatorTypeObjectFromString(eDataType, initialValue);
			case _2009Package.NON_NEGATIVE_FLOAT:
				return createNonNegativeFloatFromString(eDataType, initialValue);
			case _2009Package.NON_NEGATIVE_FLOAT_OBJECT:
				return createNonNegativeFloatObjectFromString(eDataType, initialValue);
			case _2009Package.PORT_ACCESS_TYPE_TYPE_OBJECT:
				return createPortAccessTypeTypeObjectFromString(eDataType, initialValue);
			case _2009Package.PORT_NAME:
				return createPortNameFromString(eDataType, initialValue);
			case _2009Package.PRESENCE_TYPE_OBJECT:
				return createPresenceTypeObjectFromString(eDataType, initialValue);
			case _2009Package.RANGE_TYPE_TYPE_OBJECT:
				return createRangeTypeTypeObjectFromString(eDataType, initialValue);
			case _2009Package.READ_ACTION_TYPE_OBJECT:
				return createReadActionTypeObjectFromString(eDataType, initialValue);
			case _2009Package.RESOLVE_TYPE_OBJECT:
				return createResolveTypeObjectFromString(eDataType, initialValue);
			case _2009Package.RETURN_TYPE_TYPE_OBJECT:
				return createReturnTypeTypeObjectFromString(eDataType, initialValue);
			case _2009Package.SCALED_INTEGER:
				return createScaledIntegerFromString(eDataType, initialValue);
			case _2009Package.SCALED_NON_NEGATIVE_INTEGER:
				return createScaledNonNegativeIntegerFromString(eDataType, initialValue);
			case _2009Package.SCALED_POSITIVE_INTEGER:
				return createScaledPositiveIntegerFromString(eDataType, initialValue);
			case _2009Package.SCOPE_TYPE_OBJECT:
				return createScopeTypeObjectFromString(eDataType, initialValue);
			case _2009Package.SPIRIT_URI:
				return createSpiritURIFromString(eDataType, initialValue);
			case _2009Package.TEST_CONSTRAINT_TYPE_OBJECT:
				return createTestConstraintTypeObjectFromString(eDataType, initialValue);
			case _2009Package.TRANSPORT_METHOD_TYPE_OBJECT:
				return createTransportMethodTypeObjectFromString(eDataType, initialValue);
			case _2009Package.USAGE_TYPE_OBJECT:
				return createUsageTypeObjectFromString(eDataType, initialValue);
			case _2009Package.USAGE_TYPE_OBJECT1:
				return createUsageTypeObject1FromString(eDataType, initialValue);
			case _2009Package.USAGE_TYPE_TYPE_OBJECT:
				return createUsageTypeTypeObjectFromString(eDataType, initialValue);
			case _2009Package.WHITEBOX_TYPE_TYPE_OBJECT:
				return createWhiteboxTypeTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case _2009Package.ABSTRACTOR_MODE_TYPE:
				return convertAbstractorModeTypeToString(eDataType, instanceValue);
			case _2009Package.ACCESS_TYPE:
				return convertAccessTypeToString(eDataType, instanceValue);
			case _2009Package.API_TYPE_TYPE:
				return convertApiTypeTypeToString(eDataType, instanceValue);
			case _2009Package.BANK_ALIGNMENT_TYPE:
				return convertBankAlignmentTypeToString(eDataType, instanceValue);
			case _2009Package.BIT_STEERING_TYPE:
				return convertBitSteeringTypeToString(eDataType, instanceValue);
			case _2009Package.CELL_CLASS_VALUE_TYPE:
				return convertCellClassValueTypeToString(eDataType, instanceValue);
			case _2009Package.CELL_FUNCTION_VALUE_TYPE:
				return convertCellFunctionValueTypeToString(eDataType, instanceValue);
			case _2009Package.CELL_STRENGTH_VALUE_TYPE:
				return convertCellStrengthValueTypeToString(eDataType, instanceValue);
			case _2009Package.COMPONENT_PORT_DIRECTION_TYPE:
				return convertComponentPortDirectionTypeToString(eDataType, instanceValue);
			case _2009Package.DATA_TYPE_TYPE:
				return convertDataTypeTypeToString(eDataType, instanceValue);
			case _2009Package.DELAY_VALUE_TYPE:
				return convertDelayValueTypeToString(eDataType, instanceValue);
			case _2009Package.DELAY_VALUE_UNIT_TYPE:
				return convertDelayValueUnitTypeToString(eDataType, instanceValue);
			case _2009Package.DIRECTION_TYPE:
				return convertDirectionTypeToString(eDataType, instanceValue);
			case _2009Package.DRIVER_TYPE_TYPE:
				return convertDriverTypeTypeToString(eDataType, instanceValue);
			case _2009Package.EDGE_VALUE_TYPE:
				return convertEdgeValueTypeToString(eDataType, instanceValue);
			case _2009Package.ENDIANESS_TYPE:
				return convertEndianessTypeToString(eDataType, instanceValue);
			case _2009Package.FILE_TYPE_TYPE:
				return convertFileTypeTypeToString(eDataType, instanceValue);
			case _2009Package.FORMAT_TYPE:
				return convertFormatTypeToString(eDataType, instanceValue);
			case _2009Package.INITIATIVE_TYPE:
				return convertInitiativeTypeToString(eDataType, instanceValue);
			case _2009Package.INITIATIVE_TYPE1:
				return convertInitiativeType1ToString(eDataType, instanceValue);
			case _2009Package.INTERFACE_MODE_TYPE:
				return convertInterfaceModeTypeToString(eDataType, instanceValue);
			case _2009Package.MODIFIED_WRITE_VALUE_TYPE:
				return convertModifiedWriteValueTypeToString(eDataType, instanceValue);
			case _2009Package.MULTIPLE_GROUP_SELECTION_OPERATOR_TYPE:
				return convertMultipleGroupSelectionOperatorTypeToString(eDataType, instanceValue);
			case _2009Package.PORT_ACCESS_TYPE_TYPE:
				return convertPortAccessTypeTypeToString(eDataType, instanceValue);
			case _2009Package.PRESENCE_TYPE:
				return convertPresenceTypeToString(eDataType, instanceValue);
			case _2009Package.RANGE_TYPE_TYPE:
				return convertRangeTypeTypeToString(eDataType, instanceValue);
			case _2009Package.READ_ACTION_TYPE:
				return convertReadActionTypeToString(eDataType, instanceValue);
			case _2009Package.RESOLVE_TYPE:
				return convertResolveTypeToString(eDataType, instanceValue);
			case _2009Package.RETURN_TYPE_TYPE:
				return convertReturnTypeTypeToString(eDataType, instanceValue);
			case _2009Package.SCOPE_TYPE:
				return convertScopeTypeToString(eDataType, instanceValue);
			case _2009Package.TEST_CONSTRAINT_TYPE:
				return convertTestConstraintTypeToString(eDataType, instanceValue);
			case _2009Package.TRANSPORT_METHOD_TYPE:
				return convertTransportMethodTypeToString(eDataType, instanceValue);
			case _2009Package.USAGE_TYPE:
				return convertUsageTypeToString(eDataType, instanceValue);
			case _2009Package.USAGE_TYPE1:
				return convertUsageType1ToString(eDataType, instanceValue);
			case _2009Package.USAGE_TYPE_TYPE:
				return convertUsageTypeTypeToString(eDataType, instanceValue);
			case _2009Package.WHITEBOX_TYPE_TYPE:
				return convertWhiteboxTypeTypeToString(eDataType, instanceValue);
			case _2009Package.ABSTRACTOR_MODE_TYPE_OBJECT:
				return convertAbstractorModeTypeObjectToString(eDataType, instanceValue);
			case _2009Package.ACCESS_TYPE1:
				return convertAccessType1ToString(eDataType, instanceValue);
			case _2009Package.ACCESS_TYPE_OBJECT:
				return convertAccessTypeObjectToString(eDataType, instanceValue);
			case _2009Package.API_TYPE_TYPE_OBJECT:
				return convertApiTypeTypeObjectToString(eDataType, instanceValue);
			case _2009Package.BANK_ALIGNMENT_TYPE_OBJECT:
				return convertBankAlignmentTypeObjectToString(eDataType, instanceValue);
			case _2009Package.BIT_STEERING_TYPE_OBJECT:
				return convertBitSteeringTypeObjectToString(eDataType, instanceValue);
			case _2009Package.CELL_CLASS_VALUE_TYPE_OBJECT:
				return convertCellClassValueTypeObjectToString(eDataType, instanceValue);
			case _2009Package.CELL_FUNCTION_VALUE_TYPE_OBJECT:
				return convertCellFunctionValueTypeObjectToString(eDataType, instanceValue);
			case _2009Package.CELL_STRENGTH_VALUE_TYPE_OBJECT:
				return convertCellStrengthValueTypeObjectToString(eDataType, instanceValue);
			case _2009Package.COMPONENT_PORT_DIRECTION_TYPE_OBJECT:
				return convertComponentPortDirectionTypeObjectToString(eDataType, instanceValue);
			case _2009Package.CONFIGURABLE_DOUBLE:
				return convertConfigurableDoubleToString(eDataType, instanceValue);
			case _2009Package.DATA_TYPE_TYPE_OBJECT:
				return convertDataTypeTypeObjectToString(eDataType, instanceValue);
			case _2009Package.DELAY_PERCENTAGE_TYPE:
				return convertDelayPercentageTypeToString(eDataType, instanceValue);
			case _2009Package.DELAY_PERCENTAGE_TYPE_OBJECT:
				return convertDelayPercentageTypeObjectToString(eDataType, instanceValue);
			case _2009Package.DELAY_VALUE_TYPE_OBJECT:
				return convertDelayValueTypeObjectToString(eDataType, instanceValue);
			case _2009Package.DELAY_VALUE_UNIT_TYPE_OBJECT:
				return convertDelayValueUnitTypeObjectToString(eDataType, instanceValue);
			case _2009Package.DIRECTION_TYPE_OBJECT:
				return convertDirectionTypeObjectToString(eDataType, instanceValue);
			case _2009Package.DOUBLE_LIST:
				return convertDoubleListToString(eDataType, instanceValue);
			case _2009Package.DRIVER_TYPE_TYPE_OBJECT:
				return convertDriverTypeTypeObjectToString(eDataType, instanceValue);
			case _2009Package.EDGE_VALUE_TYPE_OBJECT:
				return convertEdgeValueTypeObjectToString(eDataType, instanceValue);
			case _2009Package.ENDIANESS_TYPE_OBJECT:
				return convertEndianessTypeObjectToString(eDataType, instanceValue);
			case _2009Package.ENV_IDENTIFIER_TYPE:
				return convertEnvIdentifierTypeToString(eDataType, instanceValue);
			case _2009Package.ENV_IDENTIFIER_TYPE1:
				return convertEnvIdentifierType1ToString(eDataType, instanceValue);
			case _2009Package.FILE_TYPE_TYPE_OBJECT:
				return convertFileTypeTypeObjectToString(eDataType, instanceValue);
			case _2009Package.FORMAT_TYPE_OBJECT:
				return convertFormatTypeObjectToString(eDataType, instanceValue);
			case _2009Package.INITIATIVE_TYPE_OBJECT:
				return convertInitiativeTypeObjectToString(eDataType, instanceValue);
			case _2009Package.INITIATIVE_TYPE_OBJECT1:
				return convertInitiativeTypeObject1ToString(eDataType, instanceValue);
			case _2009Package.INSTANCE_PATH:
				return convertInstancePathToString(eDataType, instanceValue);
			case _2009Package.INTERFACE_MODE_TYPE_OBJECT:
				return convertInterfaceModeTypeObjectToString(eDataType, instanceValue);
			case _2009Package.MODIFIED_WRITE_VALUE_TYPE_OBJECT:
				return convertModifiedWriteValueTypeObjectToString(eDataType, instanceValue);
			case _2009Package.MULTIPLE_GROUP_SELECTION_OPERATOR_TYPE_OBJECT:
				return convertMultipleGroupSelectionOperatorTypeObjectToString(eDataType, instanceValue);
			case _2009Package.NON_NEGATIVE_FLOAT:
				return convertNonNegativeFloatToString(eDataType, instanceValue);
			case _2009Package.NON_NEGATIVE_FLOAT_OBJECT:
				return convertNonNegativeFloatObjectToString(eDataType, instanceValue);
			case _2009Package.PORT_ACCESS_TYPE_TYPE_OBJECT:
				return convertPortAccessTypeTypeObjectToString(eDataType, instanceValue);
			case _2009Package.PORT_NAME:
				return convertPortNameToString(eDataType, instanceValue);
			case _2009Package.PRESENCE_TYPE_OBJECT:
				return convertPresenceTypeObjectToString(eDataType, instanceValue);
			case _2009Package.RANGE_TYPE_TYPE_OBJECT:
				return convertRangeTypeTypeObjectToString(eDataType, instanceValue);
			case _2009Package.READ_ACTION_TYPE_OBJECT:
				return convertReadActionTypeObjectToString(eDataType, instanceValue);
			case _2009Package.RESOLVE_TYPE_OBJECT:
				return convertResolveTypeObjectToString(eDataType, instanceValue);
			case _2009Package.RETURN_TYPE_TYPE_OBJECT:
				return convertReturnTypeTypeObjectToString(eDataType, instanceValue);
			case _2009Package.SCALED_INTEGER:
				return convertScaledIntegerToString(eDataType, instanceValue);
			case _2009Package.SCALED_NON_NEGATIVE_INTEGER:
				return convertScaledNonNegativeIntegerToString(eDataType, instanceValue);
			case _2009Package.SCALED_POSITIVE_INTEGER:
				return convertScaledPositiveIntegerToString(eDataType, instanceValue);
			case _2009Package.SCOPE_TYPE_OBJECT:
				return convertScopeTypeObjectToString(eDataType, instanceValue);
			case _2009Package.SPIRIT_URI:
				return convertSpiritURIToString(eDataType, instanceValue);
			case _2009Package.TEST_CONSTRAINT_TYPE_OBJECT:
				return convertTestConstraintTypeObjectToString(eDataType, instanceValue);
			case _2009Package.TRANSPORT_METHOD_TYPE_OBJECT:
				return convertTransportMethodTypeObjectToString(eDataType, instanceValue);
			case _2009Package.USAGE_TYPE_OBJECT:
				return convertUsageTypeObjectToString(eDataType, instanceValue);
			case _2009Package.USAGE_TYPE_OBJECT1:
				return convertUsageTypeObject1ToString(eDataType, instanceValue);
			case _2009Package.USAGE_TYPE_TYPE_OBJECT:
				return convertUsageTypeTypeObjectToString(eDataType, instanceValue);
			case _2009Package.WHITEBOX_TYPE_TYPE_OBJECT:
				return convertWhiteboxTypeTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractionDefinitionType createAbstractionDefinitionType() {
		AbstractionDefinitionTypeImpl abstractionDefinitionType = new AbstractionDefinitionTypeImpl();
		return abstractionDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractionDefPortConstraintsType createAbstractionDefPortConstraintsType() {
		AbstractionDefPortConstraintsTypeImpl abstractionDefPortConstraintsType = new AbstractionDefPortConstraintsTypeImpl();
		return abstractionDefPortConstraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorBusInterfaceType createAbstractorBusInterfaceType() {
		AbstractorBusInterfaceTypeImpl abstractorBusInterfaceType = new AbstractorBusInterfaceTypeImpl();
		return abstractorBusInterfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorGeneratorsType createAbstractorGeneratorsType() {
		AbstractorGeneratorsTypeImpl abstractorGeneratorsType = new AbstractorGeneratorsTypeImpl();
		return abstractorGeneratorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorInterfacesType createAbstractorInterfacesType() {
		AbstractorInterfacesTypeImpl abstractorInterfacesType = new AbstractorInterfacesTypeImpl();
		return abstractorInterfacesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorModelType createAbstractorModelType() {
		AbstractorModelTypeImpl abstractorModelType = new AbstractorModelTypeImpl();
		return abstractorModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorModeType1 createAbstractorModeType1() {
		AbstractorModeType1Impl abstractorModeType1 = new AbstractorModeType1Impl();
		return abstractorModeType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorPortType createAbstractorPortType() {
		AbstractorPortTypeImpl abstractorPortType = new AbstractorPortTypeImpl();
		return abstractorPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorPortWireType createAbstractorPortWireType() {
		AbstractorPortWireTypeImpl abstractorPortWireType = new AbstractorPortWireTypeImpl();
		return abstractorPortWireType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorsType createAbstractorsType() {
		AbstractorsTypeImpl abstractorsType = new AbstractorsTypeImpl();
		return abstractorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorType createAbstractorType() {
		AbstractorTypeImpl abstractorType = new AbstractorTypeImpl();
		return abstractorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorType1 createAbstractorType1() {
		AbstractorType1Impl abstractorType1 = new AbstractorType1Impl();
		return abstractorType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorViewType createAbstractorViewType() {
		AbstractorViewTypeImpl abstractorViewType = new AbstractorViewTypeImpl();
		return abstractorViewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressBankType createAddressBankType() {
		AddressBankTypeImpl addressBankType = new AddressBankTypeImpl();
		return addressBankType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressBlockType createAddressBlockType() {
		AddressBlockTypeImpl addressBlockType = new AddressBlockTypeImpl();
		return addressBlockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressOffsetType createAddressOffsetType() {
		AddressOffsetTypeImpl addressOffsetType = new AddressOffsetTypeImpl();
		return addressOffsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSpaceRefType createAddressSpaceRefType() {
		AddressSpaceRefTypeImpl addressSpaceRefType = new AddressSpaceRefTypeImpl();
		return addressSpaceRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSpacesType createAddressSpacesType() {
		AddressSpacesTypeImpl addressSpacesType = new AddressSpacesTypeImpl();
		return addressSpacesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSpaceType createAddressSpaceType() {
		AddressSpaceTypeImpl addressSpaceType = new AddressSpaceTypeImpl();
		return addressSpaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddrSpaceRefType createAddrSpaceRefType() {
		AddrSpaceRefTypeImpl addrSpaceRefType = new AddrSpaceRefTypeImpl();
		return addrSpaceRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdHocConnectionsType createAdHocConnectionsType() {
		AdHocConnectionsTypeImpl adHocConnectionsType = new AdHocConnectionsTypeImpl();
		return adHocConnectionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdHocConnectionType createAdHocConnectionType() {
		AdHocConnectionTypeImpl adHocConnectionType = new AdHocConnectionTypeImpl();
		return adHocConnectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternateGroupsType createAlternateGroupsType() {
		AlternateGroupsTypeImpl alternateGroupsType = new AlternateGroupsTypeImpl();
		return alternateGroupsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternateRegistersType createAlternateRegistersType() {
		AlternateRegistersTypeImpl alternateRegistersType = new AlternateRegistersTypeImpl();
		return alternateRegistersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternateRegisterType createAlternateRegisterType() {
		AlternateRegisterTypeImpl alternateRegisterType = new AlternateRegisterTypeImpl();
		return alternateRegisterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentType createArgumentType() {
		ArgumentTypeImpl argumentType = new ArgumentTypeImpl();
		return argumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankedBankType createBankedBankType() {
		BankedBankTypeImpl bankedBankType = new BankedBankTypeImpl();
		return bankedBankType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankedBlockType createBankedBlockType() {
		BankedBlockTypeImpl bankedBlockType = new BankedBlockTypeImpl();
		return bankedBlockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankedSubspaceType createBankedSubspaceType() {
		BankedSubspaceTypeImpl bankedSubspaceType = new BankedSubspaceTypeImpl();
		return bankedSubspaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseAddressesType createBaseAddressesType() {
		BaseAddressesTypeImpl baseAddressesType = new BaseAddressesTypeImpl();
		return baseAddressesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseAddressType createBaseAddressType() {
		BaseAddressTypeImpl baseAddressType = new BaseAddressTypeImpl();
		return baseAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseAddressType1 createBaseAddressType1() {
		BaseAddressType1Impl baseAddressType1 = new BaseAddressType1Impl();
		return baseAddressType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitSteeringType1 createBitSteeringType1() {
		BitSteeringType1Impl bitSteeringType1 = new BitSteeringType1Impl();
		return bitSteeringType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitWidthType createBitWidthType() {
		BitWidthTypeImpl bitWidthType = new BitWidthTypeImpl();
		return bitWidthType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BridgeType createBridgeType() {
		BridgeTypeImpl bridgeType = new BridgeTypeImpl();
		return bridgeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildCommandType createBuildCommandType() {
		BuildCommandTypeImpl buildCommandType = new BuildCommandTypeImpl();
		return buildCommandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusDefinitionType createBusDefinitionType() {
		BusDefinitionTypeImpl busDefinitionType = new BusDefinitionTypeImpl();
		return busDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusInterfacesType createBusInterfacesType() {
		BusInterfacesTypeImpl busInterfacesType = new BusInterfacesTypeImpl();
		return busInterfacesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusInterfaceType createBusInterfaceType() {
		BusInterfaceTypeImpl busInterfaceType = new BusInterfaceTypeImpl();
		return busInterfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellClassType createCellClassType() {
		CellClassTypeImpl cellClassType = new CellClassTypeImpl();
		return cellClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellFunctionType createCellFunctionType() {
		CellFunctionTypeImpl cellFunctionType = new CellFunctionTypeImpl();
		return cellFunctionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellSpecificationType createCellSpecificationType() {
		CellSpecificationTypeImpl cellSpecificationType = new CellSpecificationTypeImpl();
		return cellSpecificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelsType createChannelsType() {
		ChannelsTypeImpl channelsType = new ChannelsTypeImpl();
		return channelsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelType createChannelType() {
		ChannelTypeImpl channelType = new ChannelTypeImpl();
		return channelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoicesType createChoicesType() {
		ChoicesTypeImpl choicesType = new ChoicesTypeImpl();
		return choicesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceType createChoiceType() {
		ChoiceTypeImpl choiceType = new ChoiceTypeImpl();
		return choiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockDriverType createClockDriverType() {
		ClockDriverTypeImpl clockDriverType = new ClockDriverTypeImpl();
		return clockDriverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockDriverType1 createClockDriverType1() {
		ClockDriverType1Impl clockDriverType1 = new ClockDriverType1Impl();
		return clockDriverType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockPeriodType createClockPeriodType() {
		ClockPeriodTypeImpl clockPeriodType = new ClockPeriodTypeImpl();
		return clockPeriodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockPulseDurationType createClockPulseDurationType() {
		ClockPulseDurationTypeImpl clockPulseDurationType = new ClockPulseDurationTypeImpl();
		return clockPulseDurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockPulseOffsetType createClockPulseOffsetType() {
		ClockPulseOffsetTypeImpl clockPulseOffsetType = new ClockPulseOffsetTypeImpl();
		return clockPulseOffsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockPulseValueType createClockPulseValueType() {
		ClockPulseValueTypeImpl clockPulseValueType = new ClockPulseValueTypeImpl();
		return clockPulseValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandLineSwitchType createCommandLineSwitchType() {
		CommandLineSwitchTypeImpl commandLineSwitchType = new CommandLineSwitchTypeImpl();
		return commandLineSwitchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandType createCommandType() {
		CommandTypeImpl commandType = new CommandTypeImpl();
		return commandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandType1 createCommandType1() {
		CommandType1Impl commandType1 = new CommandType1Impl();
		return commandType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandType2 createCommandType2() {
		CommandType2Impl commandType2 = new CommandType2Impl();
		return commandType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentGeneratorsType createComponentGeneratorsType() {
		ComponentGeneratorsTypeImpl componentGeneratorsType = new ComponentGeneratorsTypeImpl();
		return componentGeneratorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentGeneratorType createComponentGeneratorType() {
		ComponentGeneratorTypeImpl componentGeneratorType = new ComponentGeneratorTypeImpl();
		return componentGeneratorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstancesType createComponentInstancesType() {
		ComponentInstancesTypeImpl componentInstancesType = new ComponentInstancesTypeImpl();
		return componentInstancesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceType createComponentInstanceType() {
		ComponentInstanceTypeImpl componentInstanceType = new ComponentInstanceTypeImpl();
		return componentInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType createComponentType() {
		ComponentTypeImpl componentType = new ComponentTypeImpl();
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurableElementValuesType createConfigurableElementValuesType() {
		ConfigurableElementValuesTypeImpl configurableElementValuesType = new ConfigurableElementValuesTypeImpl();
		return configurableElementValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurableElementValueType createConfigurableElementValueType() {
		ConfigurableElementValueTypeImpl configurableElementValueType = new ConfigurableElementValueTypeImpl();
		return configurableElementValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType createConnectionType() {
		ConnectionTypeImpl connectionType = new ConnectionTypeImpl();
		return connectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSetsType createConstraintSetsType() {
		ConstraintSetsTypeImpl constraintSetsType = new ConstraintSetsTypeImpl();
		return constraintSetsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSetType createConstraintSetType() {
		ConstraintSetTypeImpl constraintSetType = new ConstraintSetTypeImpl();
		return constraintSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpusType createCpusType() {
		CpusTypeImpl cpusType = new CpusTypeImpl();
		return cpusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpuType createCpuType() {
		CpuTypeImpl cpuType = new CpuTypeImpl();
		return cpuType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultValueType createDefaultValueType() {
		DefaultValueTypeImpl defaultValueType = new DefaultValueTypeImpl();
		return defaultValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignConfigurationType createDesignConfigurationType() {
		DesignConfigurationTypeImpl designConfigurationType = new DesignConfigurationTypeImpl();
		return designConfigurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignType createDesignType() {
		DesignTypeImpl designType = new DesignTypeImpl();
		return designType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisabledType createDisabledType() {
		DisabledTypeImpl disabledType = new DisabledTypeImpl();
		return disabledType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriveConstraintType createDriveConstraintType() {
		DriveConstraintTypeImpl driveConstraintType = new DriveConstraintTypeImpl();
		return driveConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriverType createDriverType() {
		DriverTypeImpl driverType = new DriverTypeImpl();
		return driverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableType createEnableType() {
		EnableTypeImpl enableType = new EnableTypeImpl();
		return enableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedValuesType createEnumeratedValuesType() {
		EnumeratedValuesTypeImpl enumeratedValuesType = new EnumeratedValuesTypeImpl();
		return enumeratedValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedValueType createEnumeratedValueType() {
		EnumeratedValueTypeImpl enumeratedValueType = new EnumeratedValueTypeImpl();
		return enumeratedValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationType createEnumerationType() {
		EnumerationTypeImpl enumerationType = new EnumerationTypeImpl();
		return enumerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableImageType createExecutableImageType() {
		ExecutableImageTypeImpl executableImageType = new ExecutableImageTypeImpl();
		return executableImageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalPortReferenceType createExternalPortReferenceType() {
		ExternalPortReferenceTypeImpl externalPortReferenceType = new ExternalPortReferenceTypeImpl();
		return externalPortReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldType createFieldType() {
		FieldTypeImpl fieldType = new FieldTypeImpl();
		return fieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileBuilderType createFileBuilderType() {
		FileBuilderTypeImpl fileBuilderType = new FileBuilderTypeImpl();
		return fileBuilderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileBuilderType1 createFileBuilderType1() {
		FileBuilderType1Impl fileBuilderType1 = new FileBuilderType1Impl();
		return fileBuilderType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSetRefGroupType createFileSetRefGroupType() {
		FileSetRefGroupTypeImpl fileSetRefGroupType = new FileSetRefGroupTypeImpl();
		return fileSetRefGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSetRefGroupType1 createFileSetRefGroupType1() {
		FileSetRefGroupType1Impl fileSetRefGroupType1 = new FileSetRefGroupType1Impl();
		return fileSetRefGroupType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSetRefType createFileSetRefType() {
		FileSetRefTypeImpl fileSetRefType = new FileSetRefTypeImpl();
		return fileSetRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSetsType createFileSetsType() {
		FileSetsTypeImpl fileSetsType = new FileSetsTypeImpl();
		return fileSetsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSetType createFileSetType() {
		FileSetTypeImpl fileSetType = new FileSetTypeImpl();
		return fileSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType createFileType() {
		FileTypeImpl fileType = new FileTypeImpl();
		return fileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagsType createFlagsType() {
		FlagsTypeImpl flagsType = new FlagsTypeImpl();
		return flagsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagsType1 createFlagsType1() {
		FlagsType1Impl flagsType1 = new FlagsType1Impl();
		return flagsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagsType2 createFlagsType2() {
		FlagsType2Impl flagsType2 = new FlagsType2Impl();
		return flagsType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType createFunctionType() {
		FunctionTypeImpl functionType = new FunctionTypeImpl();
		return functionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorChainConfigurationType createGeneratorChainConfigurationType() {
		GeneratorChainConfigurationTypeImpl generatorChainConfigurationType = new GeneratorChainConfigurationTypeImpl();
		return generatorChainConfigurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorChainSelectorType createGeneratorChainSelectorType() {
		GeneratorChainSelectorTypeImpl generatorChainSelectorType = new GeneratorChainSelectorTypeImpl();
		return generatorChainSelectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorChainType createGeneratorChainType() {
		GeneratorChainTypeImpl generatorChainType = new GeneratorChainTypeImpl();
		return generatorChainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorSelectorType createGeneratorSelectorType() {
		GeneratorSelectorTypeImpl generatorSelectorType = new GeneratorSelectorTypeImpl();
		return generatorSelectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorType createGeneratorType() {
		GeneratorTypeImpl generatorType = new GeneratorTypeImpl();
		return generatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorType1 createGeneratorType1() {
		GeneratorType1Impl generatorType1 = new GeneratorType1Impl();
		return generatorType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupSelectorType createGroupSelectorType() {
		GroupSelectorTypeImpl groupSelectorType = new GroupSelectorTypeImpl();
		return groupSelectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierConnectionsType createHierConnectionsType() {
		HierConnectionsTypeImpl hierConnectionsType = new HierConnectionsTypeImpl();
		return hierConnectionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierConnectionType createHierConnectionType() {
		HierConnectionTypeImpl hierConnectionType = new HierConnectionTypeImpl();
		return hierConnectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierInterface createHierInterface() {
		HierInterfaceImpl hierInterface = new HierInterfaceImpl();
		return hierInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceGeneratorType createInstanceGeneratorType() {
		InstanceGeneratorTypeImpl instanceGeneratorType = new InstanceGeneratorTypeImpl();
		return instanceGeneratorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterconnectionConfigurationType createInterconnectionConfigurationType() {
		InterconnectionConfigurationTypeImpl interconnectionConfigurationType = new InterconnectionConfigurationTypeImpl();
		return interconnectionConfigurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterconnectionsType createInterconnectionsType() {
		InterconnectionsTypeImpl interconnectionsType = new InterconnectionsTypeImpl();
		return interconnectionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterconnectionType createInterconnectionType() {
		InterconnectionTypeImpl interconnectionType = new InterconnectionTypeImpl();
		return interconnectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalPortReferenceType createInternalPortReferenceType() {
		InternalPortReferenceTypeImpl internalPortReferenceType = new InternalPortReferenceTypeImpl();
		return internalPortReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsIncludeFileType createIsIncludeFileType() {
		IsIncludeFileTypeImpl isIncludeFileType = new IsIncludeFileTypeImpl();
		return isIncludeFileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageToolsType createLanguageToolsType() {
		LanguageToolsTypeImpl languageToolsType = new LanguageToolsTypeImpl();
		return languageToolsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageType createLanguageType() {
		LanguageTypeImpl languageType = new LanguageTypeImpl();
		return languageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageType1 createLanguageType1() {
		LanguageType1Impl languageType1 = new LanguageType1Impl();
		return languageType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftType createLeftType() {
		LeftTypeImpl leftType = new LeftTypeImpl();
		return leftType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftType1 createLeftType1() {
		LeftType1Impl leftType1 = new LeftType1Impl();
		return leftType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftType2 createLeftType2() {
		LeftType2Impl leftType2 = new LeftType2Impl();
		return leftType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftType11 createLeftType11() {
		LeftType11Impl leftType11 = new LeftType11Impl();
		return leftType11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryRefType createLibraryRefType() {
		LibraryRefTypeImpl libraryRefType = new LibraryRefTypeImpl();
		return libraryRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkerCommandFileType createLinkerCommandFileType() {
		LinkerCommandFileTypeImpl linkerCommandFileType = new LinkerCommandFileTypeImpl();
		return linkerCommandFileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkerFlagsType createLinkerFlagsType() {
		LinkerFlagsTypeImpl linkerFlagsType = new LinkerFlagsTypeImpl();
		return linkerFlagsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkerType createLinkerType() {
		LinkerTypeImpl linkerType = new LinkerTypeImpl();
		return linkerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadConstraintType createLoadConstraintType() {
		LoadConstraintTypeImpl loadConstraintType = new LoadConstraintTypeImpl();
		return loadConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalMemoryMapType createLocalMemoryMapType() {
		LocalMemoryMapTypeImpl localMemoryMapType = new LocalMemoryMapTypeImpl();
		return localMemoryMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalNameType createLogicalNameType() {
		LogicalNameTypeImpl logicalNameType = new LogicalNameTypeImpl();
		return logicalNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalPortType createLogicalPortType() {
		LogicalPortTypeImpl logicalPortType = new LogicalPortTypeImpl();
		return logicalPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalPortType1 createLogicalPortType1() {
		LogicalPortType1Impl logicalPortType1 = new LogicalPortType1Impl();
		return logicalPortType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaskType createMaskType() {
		MaskTypeImpl maskType = new MaskTypeImpl();
		return maskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaskType1 createMaskType1() {
		MaskType1Impl maskType1 = new MaskType1Impl();
		return maskType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterType createMasterType() {
		MasterTypeImpl masterType = new MasterTypeImpl();
		return masterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaximumType createMaximumType() {
		MaximumTypeImpl maximumType = new MaximumTypeImpl();
		return maximumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMapRefType createMemoryMapRefType() {
		MemoryMapRefTypeImpl memoryMapRefType = new MemoryMapRefTypeImpl();
		return memoryMapRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMapsType createMemoryMapsType() {
		MemoryMapsTypeImpl memoryMapsType = new MemoryMapsTypeImpl();
		return memoryMapsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMapType createMemoryMapType() {
		MemoryMapTypeImpl memoryMapType = new MemoryMapTypeImpl();
		return memoryMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryRemapType createMemoryRemapType() {
		MemoryRemapTypeImpl memoryRemapType = new MemoryRemapTypeImpl();
		return memoryRemapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinimumType createMinimumType() {
		MinimumTypeImpl minimumType = new MinimumTypeImpl();
		return minimumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MirroredMasterType createMirroredMasterType() {
		MirroredMasterTypeImpl mirroredMasterType = new MirroredMasterTypeImpl();
		return mirroredMasterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MirroredSlaveType createMirroredSlaveType() {
		MirroredSlaveTypeImpl mirroredSlaveType = new MirroredSlaveTypeImpl();
		return mirroredSlaveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MirroredSystemType createMirroredSystemType() {
		MirroredSystemTypeImpl mirroredSystemType = new MirroredSystemTypeImpl();
		return mirroredSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelParametersType createModelParametersType() {
		ModelParametersTypeImpl modelParametersType = new ModelParametersTypeImpl();
		return modelParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelParametersType1 createModelParametersType1() {
		ModelParametersType1Impl modelParametersType1 = new ModelParametersType1Impl();
		return modelParametersType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType createModelType() {
		ModelTypeImpl modelType = new ModelTypeImpl();
		return modelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorInterconnectionType createMonitorInterconnectionType() {
		MonitorInterconnectionTypeImpl monitorInterconnectionType = new MonitorInterconnectionTypeImpl();
		return monitorInterconnectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorType createMonitorType() {
		MonitorTypeImpl monitorType = new MonitorTypeImpl();
		return monitorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType createNameType() {
		NameTypeImpl nameType = new NameTypeImpl();
		return nameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType1 createNameType1() {
		NameType1Impl nameType1 = new NameType1Impl();
		return nameType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType2 createNameType2() {
		NameType2Impl nameType2 = new NameType2Impl();
		return nameType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameValuePairType createNameValuePairType() {
		NameValuePairTypeImpl nameValuePairType = new NameValuePairTypeImpl();
		return nameValuePairType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameValueTypeType createNameValueTypeType() {
		NameValueTypeTypeImpl nameValueTypeType = new NameValueTypeTypeImpl();
		return nameValueTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnMasterType createOnMasterType() {
		OnMasterTypeImpl onMasterType = new OnMasterTypeImpl();
		return onMasterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnMasterType1 createOnMasterType1() {
		OnMasterType1Impl onMasterType1 = new OnMasterType1Impl();
		return onMasterType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnSlaveType createOnSlaveType() {
		OnSlaveTypeImpl onSlaveType = new OnSlaveTypeImpl();
		return onSlaveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnSlaveType1 createOnSlaveType1() {
		OnSlaveType1Impl onSlaveType1 = new OnSlaveType1Impl();
		return onSlaveType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnSystemType createOnSystemType() {
		OnSystemTypeImpl onSystemType = new OnSystemTypeImpl();
		return onSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnSystemType1 createOnSystemType1() {
		OnSystemType1Impl onSystemType1 = new OnSystemType1Impl();
		return onSystemType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherClockDriverType createOtherClockDriverType() {
		OtherClockDriverTypeImpl otherClockDriverType = new OtherClockDriverTypeImpl();
		return otherClockDriverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherClocks createOtherClocks() {
		OtherClocksImpl otherClocks = new OtherClocksImpl();
		return otherClocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersType createParametersType() {
		ParametersTypeImpl parametersType = new ParametersTypeImpl();
		return parametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersType1 createParametersType1() {
		ParametersType1Impl parametersType1 = new ParametersType1Impl();
		return parametersType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseType createPhaseType() {
		PhaseTypeImpl phaseType = new PhaseTypeImpl();
		return phaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPortType createPhysicalPortType() {
		PhysicalPortTypeImpl physicalPortType = new PhysicalPortTypeImpl();
		return physicalPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPortType1 createPhysicalPortType1() {
		PhysicalPortType1Impl physicalPortType1 = new PhysicalPortType1Impl();
		return physicalPortType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortAccessType createPortAccessType() {
		PortAccessTypeImpl portAccessType = new PortAccessTypeImpl();
		return portAccessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDeclarationType createPortDeclarationType() {
		PortDeclarationTypeImpl portDeclarationType = new PortDeclarationTypeImpl();
		return portDeclarationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortMapsType createPortMapsType() {
		PortMapsTypeImpl portMapsType = new PortMapsTypeImpl();
		return portMapsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortMapsType1 createPortMapsType1() {
		PortMapsType1Impl portMapsType1 = new PortMapsType1Impl();
		return portMapsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortMapType createPortMapType() {
		PortMapTypeImpl portMapType = new PortMapTypeImpl();
		return portMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortMapType1 createPortMapType1() {
		PortMapType1Impl portMapType1 = new PortMapType1Impl();
		return portMapType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsType createPortsType() {
		PortsTypeImpl portsType = new PortsTypeImpl();
		return portsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsType1 createPortsType1() {
		PortsType1Impl portsType1 = new PortsType1Impl();
		return portsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsType2 createPortsType2() {
		PortsType2Impl portsType2 = new PortsType2Impl();
		return portsType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortTransactionalType createPortTransactionalType() {
		PortTransactionalTypeImpl portTransactionalType = new PortTransactionalTypeImpl();
		return portTransactionalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortType() {
		PortTypeImpl portType = new PortTypeImpl();
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType1 createPortType1() {
		PortType1Impl portType1 = new PortType1Impl();
		return portType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortWireType createPortWireType() {
		PortWireTypeImpl portWireType = new PortWireTypeImpl();
		return portWireType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierType createQualifierType() {
		QualifierTypeImpl qualifierType = new QualifierTypeImpl();
		return qualifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierType1 createQualifierType1() {
		QualifierType1Impl qualifierType1 = new QualifierType1Impl();
		return qualifierType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType createRangeType() {
		RangeTypeImpl rangeType = new RangeTypeImpl();
		return rangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType1 createRangeType1() {
		RangeType1Impl rangeType1 = new RangeType1Impl();
		return rangeType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType2 createRangeType2() {
		RangeType2Impl rangeType2 = new RangeType2Impl();
		return rangeType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType3 createRangeType3() {
		RangeType3Impl rangeType3 = new RangeType3Impl();
		return rangeType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterFileType createRegisterFileType() {
		RegisterFileTypeImpl registerFileType = new RegisterFileTypeImpl();
		return registerFileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterType createRegisterType() {
		RegisterTypeImpl registerType = new RegisterTypeImpl();
		return registerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemapAddressType createRemapAddressType() {
		RemapAddressTypeImpl remapAddressType = new RemapAddressTypeImpl();
		return remapAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemapPortsType createRemapPortsType() {
		RemapPortsTypeImpl remapPortsType = new RemapPortsTypeImpl();
		return remapPortsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemapPortType createRemapPortType() {
		RemapPortTypeImpl remapPortType = new RemapPortTypeImpl();
		return remapPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemapStatesType createRemapStatesType() {
		RemapStatesTypeImpl remapStatesType = new RemapStatesTypeImpl();
		return remapStatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemapStateType createRemapStateType() {
		RemapStateTypeImpl remapStateType = new RemapStateTypeImpl();
		return remapStateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceDefaultFlagsType createReplaceDefaultFlagsType() {
		ReplaceDefaultFlagsTypeImpl replaceDefaultFlagsType = new ReplaceDefaultFlagsTypeImpl();
		return replaceDefaultFlagsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceDefaultFlagsType1 createReplaceDefaultFlagsType1() {
		ReplaceDefaultFlagsType1Impl replaceDefaultFlagsType1 = new ReplaceDefaultFlagsType1Impl();
		return replaceDefaultFlagsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceDefaultFlagsType2 createReplaceDefaultFlagsType2() {
		ReplaceDefaultFlagsType2Impl replaceDefaultFlagsType2 = new ReplaceDefaultFlagsType2Impl();
		return replaceDefaultFlagsType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiresDriverType createRequiresDriverType() {
		RequiresDriverTypeImpl requiresDriverType = new RequiresDriverTypeImpl();
		return requiresDriverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetType createResetType() {
		ResetTypeImpl resetType = new ResetTypeImpl();
		return resetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetType1 createResetType1() {
		ResetType1Impl resetType1 = new ResetType1Impl();
		return resetType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolvedLibraryRefType createResolvedLibraryRefType() {
		ResolvedLibraryRefTypeImpl resolvedLibraryRefType = new ResolvedLibraryRefTypeImpl();
		return resolvedLibraryRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightType createRightType() {
		RightTypeImpl rightType = new RightTypeImpl();
		return rightType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightType1 createRightType1() {
		RightType1Impl rightType1 = new RightType1Impl();
		return rightType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightType2 createRightType2() {
		RightType2Impl rightType2 = new RightType2Impl();
		return rightType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightType11 createRightType11() {
		RightType11Impl rightType11 = new RightType11Impl();
		return rightType11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentsType createSegmentsType() {
		SegmentsTypeImpl segmentsType = new SegmentsTypeImpl();
		return segmentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentType createSegmentType() {
		SegmentTypeImpl segmentType = new SegmentTypeImpl();
		return segmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType createServiceType() {
		ServiceTypeImpl serviceType = new ServiceTypeImpl();
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType1 createServiceType1() {
		ServiceType1Impl serviceType1 = new ServiceType1Impl();
		return serviceType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTypeDefsType createServiceTypeDefsType() {
		ServiceTypeDefsTypeImpl serviceTypeDefsType = new ServiceTypeDefsTypeImpl();
		return serviceTypeDefsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTypeDefType createServiceTypeDefType() {
		ServiceTypeDefTypeImpl serviceTypeDefType = new ServiceTypeDefTypeImpl();
		return serviceTypeDefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleShotDriverType createSingleShotDriverType() {
		SingleShotDriverTypeImpl singleShotDriverType = new SingleShotDriverTypeImpl();
		return singleShotDriverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleShotDurationType createSingleShotDurationType() {
		SingleShotDurationTypeImpl singleShotDurationType = new SingleShotDurationTypeImpl();
		return singleShotDurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleShotOffsetType createSingleShotOffsetType() {
		SingleShotOffsetTypeImpl singleShotOffsetType = new SingleShotOffsetTypeImpl();
		return singleShotOffsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleShotValueType createSingleShotValueType() {
		SingleShotValueTypeImpl singleShotValueType = new SingleShotValueTypeImpl();
		return singleShotValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeType createSizeType() {
		SizeTypeImpl sizeType = new SizeTypeImpl();
		return sizeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlaveType createSlaveType() {
		SlaveTypeImpl slaveType = new SlaveTypeImpl();
		return slaveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFileType createSourceFileType() {
		SourceFileTypeImpl sourceFileType = new SourceFileTypeImpl();
		return sourceFileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceNameType createSourceNameType() {
		SourceNameTypeImpl sourceNameType = new SourceNameTypeImpl();
		return sourceNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubspaceRefType createSubspaceRefType() {
		SubspaceRefTypeImpl subspaceRefType = new SubspaceRefTypeImpl();
		return subspaceRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemGroupNamesType createSystemGroupNamesType() {
		SystemGroupNamesTypeImpl systemGroupNamesType = new SystemGroupNamesTypeImpl();
		return systemGroupNamesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemType createSystemType() {
		SystemTypeImpl systemType = new SystemTypeImpl();
		return systemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetNameType createTargetNameType() {
		TargetNameTypeImpl targetNameType = new TargetNameTypeImpl();
		return targetNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestableType createTestableType() {
		TestableTypeImpl testableType = new TestableTypeImpl();
		return testableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingConstraintType createTimingConstraintType() {
		TimingConstraintTypeImpl timingConstraintType = new TimingConstraintTypeImpl();
		return timingConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionalType createTransactionalType() {
		TransactionalTypeImpl transactionalType = new TransactionalTypeImpl();
		return transactionalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportMethodsType createTransportMethodsType() {
		TransportMethodsTypeImpl transportMethodsType = new TransportMethodsTypeImpl();
		return transportMethodsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransTypeDefType createTransTypeDefType() {
		TransTypeDefTypeImpl transTypeDefType = new TransTypeDefTypeImpl();
		return transTypeDefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeNameType createTypeNameType() {
		TypeNameTypeImpl typeNameType = new TypeNameTypeImpl();
		return typeNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeNameType1 createTypeNameType1() {
		TypeNameType1Impl typeNameType1 = new TypeNameType1Impl();
		return typeNameType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeNameType2 createTypeNameType2() {
		TypeNameType2Impl typeNameType2 = new TypeNameType2Impl();
		return typeNameType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeNameType3 createTypeNameType3() {
		TypeNameType3Impl typeNameType3 = new TypeNameType3Impl();
		return typeNameType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueMaskConfigType createValueMaskConfigType() {
		ValueMaskConfigTypeImpl valueMaskConfigType = new ValueMaskConfigTypeImpl();
		return valueMaskConfigType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType1 createValueType1() {
		ValueType1Impl valueType1 = new ValueType1Impl();
		return valueType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType2 createValueType2() {
		ValueType2Impl valueType2 = new ValueType2Impl();
		return valueType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorType createVectorType() {
		VectorTypeImpl vectorType = new VectorTypeImpl();
		return vectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorType1 createVectorType1() {
		VectorType1Impl vectorType1 = new VectorType1Impl();
		return vectorType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorType2 createVectorType2() {
		VectorType2Impl vectorType2 = new VectorType2Impl();
		return vectorType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorType11 createVectorType11() {
		VectorType11Impl vectorType11 = new VectorType11Impl();
		return vectorType11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorExtensionsType createVendorExtensionsType() {
		VendorExtensionsTypeImpl vendorExtensionsType = new VendorExtensionsTypeImpl();
		return vendorExtensionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewConfigurationType createViewConfigurationType() {
		ViewConfigurationTypeImpl viewConfigurationType = new ViewConfigurationTypeImpl();
		return viewConfigurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsType createViewsType() {
		ViewsTypeImpl viewsType = new ViewsTypeImpl();
		return viewsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsType1 createViewsType1() {
		ViewsType1Impl viewsType1 = new ViewsType1Impl();
		return viewsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewType createViewType() {
		ViewTypeImpl viewType = new ViewTypeImpl();
		return viewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteboxElementRefsType createWhiteboxElementRefsType() {
		WhiteboxElementRefsTypeImpl whiteboxElementRefsType = new WhiteboxElementRefsTypeImpl();
		return whiteboxElementRefsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteboxElementRefType createWhiteboxElementRefType() {
		WhiteboxElementRefTypeImpl whiteboxElementRefType = new WhiteboxElementRefTypeImpl();
		return whiteboxElementRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteboxElementsType createWhiteboxElementsType() {
		WhiteboxElementsTypeImpl whiteboxElementsType = new WhiteboxElementsTypeImpl();
		return whiteboxElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteboxElementType createWhiteboxElementType() {
		WhiteboxElementTypeImpl whiteboxElementType = new WhiteboxElementTypeImpl();
		return whiteboxElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteboxPathType createWhiteboxPathType() {
		WhiteboxPathTypeImpl whiteboxPathType = new WhiteboxPathTypeImpl();
		return whiteboxPathType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidthType createWidthType() {
		WidthTypeImpl widthType = new WidthTypeImpl();
		return widthType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireType createWireType() {
		WireTypeImpl wireType = new WireTypeImpl();
		return wireType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireTypeDefsType createWireTypeDefsType() {
		WireTypeDefsTypeImpl wireTypeDefsType = new WireTypeDefsTypeImpl();
		return wireTypeDefsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireTypeDefType createWireTypeDefType() {
		WireTypeDefTypeImpl wireTypeDefType = new WireTypeDefTypeImpl();
		return wireTypeDefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteValueConstraintType createWriteValueConstraintType() {
		WriteValueConstraintTypeImpl writeValueConstraintType = new WriteValueConstraintTypeImpl();
		return writeValueConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorModeType createAbstractorModeTypeFromString(EDataType eDataType, String initialValue) {
		AbstractorModeType result = AbstractorModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstractorModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType createAccessTypeFromString(EDataType eDataType, String initialValue) {
		AccessType result = AccessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiTypeType createApiTypeTypeFromString(EDataType eDataType, String initialValue) {
		ApiTypeType result = ApiTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApiTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankAlignmentType createBankAlignmentTypeFromString(EDataType eDataType, String initialValue) {
		BankAlignmentType result = BankAlignmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBankAlignmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitSteeringType createBitSteeringTypeFromString(EDataType eDataType, String initialValue) {
		BitSteeringType result = BitSteeringType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBitSteeringTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellClassValueType createCellClassValueTypeFromString(EDataType eDataType, String initialValue) {
		CellClassValueType result = CellClassValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellClassValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellFunctionValueType createCellFunctionValueTypeFromString(EDataType eDataType, String initialValue) {
		CellFunctionValueType result = CellFunctionValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellFunctionValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellStrengthValueType createCellStrengthValueTypeFromString(EDataType eDataType, String initialValue) {
		CellStrengthValueType result = CellStrengthValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellStrengthValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPortDirectionType createComponentPortDirectionTypeFromString(EDataType eDataType, String initialValue) {
		ComponentPortDirectionType result = ComponentPortDirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentPortDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeType createDataTypeTypeFromString(EDataType eDataType, String initialValue) {
		DataTypeType result = DataTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayValueType createDelayValueTypeFromString(EDataType eDataType, String initialValue) {
		DelayValueType result = DelayValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDelayValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayValueUnitType createDelayValueUnitTypeFromString(EDataType eDataType, String initialValue) {
		DelayValueUnitType result = DelayValueUnitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDelayValueUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType createDirectionTypeFromString(EDataType eDataType, String initialValue) {
		DirectionType result = DirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriverTypeType createDriverTypeTypeFromString(EDataType eDataType, String initialValue) {
		DriverTypeType result = DriverTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDriverTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeValueType createEdgeValueTypeFromString(EDataType eDataType, String initialValue) {
		EdgeValueType result = EdgeValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdgeValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndianessType createEndianessTypeFromString(EDataType eDataType, String initialValue) {
		EndianessType result = EndianessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndianessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileTypeType createFileTypeTypeFromString(EDataType eDataType, String initialValue) {
		FileTypeType result = FileTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatType createFormatTypeFromString(EDataType eDataType, String initialValue) {
		FormatType result = FormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiativeType createInitiativeTypeFromString(EDataType eDataType, String initialValue) {
		InitiativeType result = InitiativeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitiativeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiativeType1 createInitiativeType1FromString(EDataType eDataType, String initialValue) {
		InitiativeType1 result = InitiativeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitiativeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceModeType createInterfaceModeTypeFromString(EDataType eDataType, String initialValue) {
		InterfaceModeType result = InterfaceModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifiedWriteValueType createModifiedWriteValueTypeFromString(EDataType eDataType, String initialValue) {
		ModifiedWriteValueType result = ModifiedWriteValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModifiedWriteValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleGroupSelectionOperatorType createMultipleGroupSelectionOperatorTypeFromString(EDataType eDataType, String initialValue) {
		MultipleGroupSelectionOperatorType result = MultipleGroupSelectionOperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultipleGroupSelectionOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortAccessTypeType createPortAccessTypeTypeFromString(EDataType eDataType, String initialValue) {
		PortAccessTypeType result = PortAccessTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortAccessTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresenceType createPresenceTypeFromString(EDataType eDataType, String initialValue) {
		PresenceType result = PresenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeTypeType createRangeTypeTypeFromString(EDataType eDataType, String initialValue) {
		RangeTypeType result = RangeTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadActionType createReadActionTypeFromString(EDataType eDataType, String initialValue) {
		ReadActionType result = ReadActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReadActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveType createResolveTypeFromString(EDataType eDataType, String initialValue) {
		ResolveType result = ResolveType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResolveTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnTypeType createReturnTypeTypeFromString(EDataType eDataType, String initialValue) {
		ReturnTypeType result = ReturnTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReturnTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeType createScopeTypeFromString(EDataType eDataType, String initialValue) {
		ScopeType result = ScopeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestConstraintType createTestConstraintTypeFromString(EDataType eDataType, String initialValue) {
		TestConstraintType result = TestConstraintType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestConstraintTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportMethodType createTransportMethodTypeFromString(EDataType eDataType, String initialValue) {
		TransportMethodType result = TransportMethodType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransportMethodTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageType createUsageTypeFromString(EDataType eDataType, String initialValue) {
		UsageType result = UsageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageType1 createUsageType1FromString(EDataType eDataType, String initialValue) {
		UsageType1 result = UsageType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageTypeType createUsageTypeTypeFromString(EDataType eDataType, String initialValue) {
		UsageTypeType result = UsageTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteboxTypeType createWhiteboxTypeTypeFromString(EDataType eDataType, String initialValue) {
		WhiteboxTypeType result = WhiteboxTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWhiteboxTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorModeType createAbstractorModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAbstractorModeTypeFromString(_2009Package.eINSTANCE.getAbstractorModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstractorModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAbstractorModeTypeToString(_2009Package.eINSTANCE.getAbstractorModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType createAccessType1FromString(EDataType eDataType, String initialValue) {
		return createAccessTypeFromString(_2009Package.eINSTANCE.getAccessType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessType1ToString(EDataType eDataType, Object instanceValue) {
		return convertAccessTypeToString(_2009Package.eINSTANCE.getAccessType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType createAccessTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAccessTypeFromString(_2009Package.eINSTANCE.getAccessType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAccessTypeToString(_2009Package.eINSTANCE.getAccessType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiTypeType createApiTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createApiTypeTypeFromString(_2009Package.eINSTANCE.getApiTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApiTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertApiTypeTypeToString(_2009Package.eINSTANCE.getApiTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankAlignmentType createBankAlignmentTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBankAlignmentTypeFromString(_2009Package.eINSTANCE.getBankAlignmentType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBankAlignmentTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBankAlignmentTypeToString(_2009Package.eINSTANCE.getBankAlignmentType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitSteeringType createBitSteeringTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBitSteeringTypeFromString(_2009Package.eINSTANCE.getBitSteeringType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBitSteeringTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBitSteeringTypeToString(_2009Package.eINSTANCE.getBitSteeringType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellClassValueType createCellClassValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCellClassValueTypeFromString(_2009Package.eINSTANCE.getCellClassValueType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellClassValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCellClassValueTypeToString(_2009Package.eINSTANCE.getCellClassValueType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellFunctionValueType createCellFunctionValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCellFunctionValueTypeFromString(_2009Package.eINSTANCE.getCellFunctionValueType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellFunctionValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCellFunctionValueTypeToString(_2009Package.eINSTANCE.getCellFunctionValueType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellStrengthValueType createCellStrengthValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCellStrengthValueTypeFromString(_2009Package.eINSTANCE.getCellStrengthValueType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellStrengthValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCellStrengthValueTypeToString(_2009Package.eINSTANCE.getCellStrengthValueType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPortDirectionType createComponentPortDirectionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createComponentPortDirectionTypeFromString(_2009Package.eINSTANCE.getComponentPortDirectionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentPortDirectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertComponentPortDirectionTypeToString(_2009Package.eINSTANCE.getComponentPortDirectionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> createConfigurableDoubleFromString(EDataType eDataType, String initialValue) {
		return createDoubleListFromString(_2009Package.eINSTANCE.getDoubleList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfigurableDoubleToString(EDataType eDataType, Object instanceValue) {
		return convertDoubleListToString(_2009Package.eINSTANCE.getDoubleList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeType createDataTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDataTypeTypeFromString(_2009Package.eINSTANCE.getDataTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataTypeTypeToString(_2009Package.eINSTANCE.getDataTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createDelayPercentageTypeFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDelayPercentageTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createDelayPercentageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDelayPercentageTypeFromString(_2009Package.eINSTANCE.getDelayPercentageType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDelayPercentageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDelayPercentageTypeToString(_2009Package.eINSTANCE.getDelayPercentageType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayValueType createDelayValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDelayValueTypeFromString(_2009Package.eINSTANCE.getDelayValueType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDelayValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDelayValueTypeToString(_2009Package.eINSTANCE.getDelayValueType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayValueUnitType createDelayValueUnitTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDelayValueUnitTypeFromString(_2009Package.eINSTANCE.getDelayValueUnitType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDelayValueUnitTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDelayValueUnitTypeToString(_2009Package.eINSTANCE.getDelayValueUnitType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType createDirectionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDirectionTypeFromString(_2009Package.eINSTANCE.getDirectionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDirectionTypeToString(_2009Package.eINSTANCE.getDirectionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> createDoubleListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Double> result = new ArrayList<Double>();
		for (String item : split(initialValue)) {
			result.add((Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriverTypeType createDriverTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDriverTypeTypeFromString(_2009Package.eINSTANCE.getDriverTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDriverTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDriverTypeTypeToString(_2009Package.eINSTANCE.getDriverTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeValueType createEdgeValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEdgeValueTypeFromString(_2009Package.eINSTANCE.getEdgeValueType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdgeValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEdgeValueTypeToString(_2009Package.eINSTANCE.getEdgeValueType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndianessType createEndianessTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEndianessTypeFromString(_2009Package.eINSTANCE.getEndianessType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndianessTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEndianessTypeToString(_2009Package.eINSTANCE.getEndianessType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEnvIdentifierTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnvIdentifierTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEnvIdentifierType1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnvIdentifierType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileTypeType createFileTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFileTypeTypeFromString(_2009Package.eINSTANCE.getFileTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFileTypeTypeToString(_2009Package.eINSTANCE.getFileTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatType createFormatTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFormatTypeFromString(_2009Package.eINSTANCE.getFormatType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFormatTypeToString(_2009Package.eINSTANCE.getFormatType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiativeType createInitiativeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInitiativeTypeFromString(_2009Package.eINSTANCE.getInitiativeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitiativeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInitiativeTypeToString(_2009Package.eINSTANCE.getInitiativeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiativeType1 createInitiativeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createInitiativeType1FromString(_2009Package.eINSTANCE.getInitiativeType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitiativeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertInitiativeType1ToString(_2009Package.eINSTANCE.getInitiativeType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createInstancePathFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstancePathToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceModeType createInterfaceModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInterfaceModeTypeFromString(_2009Package.eINSTANCE.getInterfaceModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInterfaceModeTypeToString(_2009Package.eINSTANCE.getInterfaceModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifiedWriteValueType createModifiedWriteValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createModifiedWriteValueTypeFromString(_2009Package.eINSTANCE.getModifiedWriteValueType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModifiedWriteValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertModifiedWriteValueTypeToString(_2009Package.eINSTANCE.getModifiedWriteValueType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleGroupSelectionOperatorType createMultipleGroupSelectionOperatorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMultipleGroupSelectionOperatorTypeFromString(_2009Package.eINSTANCE.getMultipleGroupSelectionOperatorType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultipleGroupSelectionOperatorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMultipleGroupSelectionOperatorTypeToString(_2009Package.eINSTANCE.getMultipleGroupSelectionOperatorType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createNonNegativeFloatFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeFloatToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createNonNegativeFloatObjectFromString(EDataType eDataType, String initialValue) {
		return createNonNegativeFloatFromString(_2009Package.eINSTANCE.getNonNegativeFloat(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeFloatObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNonNegativeFloatToString(_2009Package.eINSTANCE.getNonNegativeFloat(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortAccessTypeType createPortAccessTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPortAccessTypeTypeFromString(_2009Package.eINSTANCE.getPortAccessTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortAccessTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPortAccessTypeTypeToString(_2009Package.eINSTANCE.getPortAccessTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPortNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresenceType createPresenceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPresenceTypeFromString(_2009Package.eINSTANCE.getPresenceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresenceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPresenceTypeToString(_2009Package.eINSTANCE.getPresenceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeTypeType createRangeTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRangeTypeTypeFromString(_2009Package.eINSTANCE.getRangeTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRangeTypeTypeToString(_2009Package.eINSTANCE.getRangeTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadActionType createReadActionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createReadActionTypeFromString(_2009Package.eINSTANCE.getReadActionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReadActionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReadActionTypeToString(_2009Package.eINSTANCE.getReadActionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveType createResolveTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createResolveTypeFromString(_2009Package.eINSTANCE.getResolveType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResolveTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResolveTypeToString(_2009Package.eINSTANCE.getResolveType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnTypeType createReturnTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createReturnTypeTypeFromString(_2009Package.eINSTANCE.getReturnTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReturnTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReturnTypeTypeToString(_2009Package.eINSTANCE.getReturnTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createScaledIntegerFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScaledIntegerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createScaledNonNegativeIntegerFromString(EDataType eDataType, String initialValue) {
		return createScaledIntegerFromString(_2009Package.eINSTANCE.getScaledInteger(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScaledNonNegativeIntegerToString(EDataType eDataType, Object instanceValue) {
		return convertScaledIntegerToString(_2009Package.eINSTANCE.getScaledInteger(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createScaledPositiveIntegerFromString(EDataType eDataType, String initialValue) {
		return createScaledNonNegativeIntegerFromString(_2009Package.eINSTANCE.getScaledNonNegativeInteger(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScaledPositiveIntegerToString(EDataType eDataType, Object instanceValue) {
		return convertScaledNonNegativeIntegerToString(_2009Package.eINSTANCE.getScaledNonNegativeInteger(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeType createScopeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createScopeTypeFromString(_2009Package.eINSTANCE.getScopeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScopeTypeToString(_2009Package.eINSTANCE.getScopeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSpiritURIFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpiritURIToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.STRING.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestConstraintType createTestConstraintTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTestConstraintTypeFromString(_2009Package.eINSTANCE.getTestConstraintType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestConstraintTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTestConstraintTypeToString(_2009Package.eINSTANCE.getTestConstraintType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportMethodType createTransportMethodTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTransportMethodTypeFromString(_2009Package.eINSTANCE.getTransportMethodType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransportMethodTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransportMethodTypeToString(_2009Package.eINSTANCE.getTransportMethodType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageType createUsageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUsageTypeFromString(_2009Package.eINSTANCE.getUsageType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUsageTypeToString(_2009Package.eINSTANCE.getUsageType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageType1 createUsageTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createUsageType1FromString(_2009Package.eINSTANCE.getUsageType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertUsageType1ToString(_2009Package.eINSTANCE.getUsageType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageTypeType createUsageTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUsageTypeTypeFromString(_2009Package.eINSTANCE.getUsageTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUsageTypeTypeToString(_2009Package.eINSTANCE.getUsageTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteboxTypeType createWhiteboxTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWhiteboxTypeTypeFromString(_2009Package.eINSTANCE.getWhiteboxTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWhiteboxTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWhiteboxTypeTypeToString(_2009Package.eINSTANCE.getWhiteboxTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _2009Package get_2009Package() {
		return (_2009Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _2009Package getPackage() {
		return _2009Package.eINSTANCE;
	}

} //_2009FactoryImpl
