/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.spiritconsortium.xml.schema.spirit._1685._2009.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package
 * @generated
 */
public class _2009Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _2009Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _2009Switch() {
		if (modelPackage == null) {
			modelPackage = _2009Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case _2009Package.ABSTRACTION_DEFINITION_TYPE: {
				AbstractionDefinitionType abstractionDefinitionType = (AbstractionDefinitionType)theEObject;
				T result = caseAbstractionDefinitionType(abstractionDefinitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE: {
				AbstractionDefPortConstraintsType abstractionDefPortConstraintsType = (AbstractionDefPortConstraintsType)theEObject;
				T result = caseAbstractionDefPortConstraintsType(abstractionDefPortConstraintsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ABSTRACTOR_BUS_INTERFACE_TYPE: {
				AbstractorBusInterfaceType abstractorBusInterfaceType = (AbstractorBusInterfaceType)theEObject;
				T result = caseAbstractorBusInterfaceType(abstractorBusInterfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ABSTRACTOR_GENERATORS_TYPE: {
				AbstractorGeneratorsType abstractorGeneratorsType = (AbstractorGeneratorsType)theEObject;
				T result = caseAbstractorGeneratorsType(abstractorGeneratorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ABSTRACTOR_INTERFACES_TYPE: {
				AbstractorInterfacesType abstractorInterfacesType = (AbstractorInterfacesType)theEObject;
				T result = caseAbstractorInterfacesType(abstractorInterfacesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ABSTRACTOR_MODEL_TYPE: {
				AbstractorModelType abstractorModelType = (AbstractorModelType)theEObject;
				T result = caseAbstractorModelType(abstractorModelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ABSTRACTOR_MODE_TYPE1: {
				AbstractorModeType1 abstractorModeType1 = (AbstractorModeType1)theEObject;
				T result = caseAbstractorModeType1(abstractorModeType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ABSTRACTOR_PORT_TYPE: {
				AbstractorPortType abstractorPortType = (AbstractorPortType)theEObject;
				T result = caseAbstractorPortType(abstractorPortType);
				if (result == null) result = casePortType(abstractorPortType);
				if (result == null) result = casePortDeclarationType(abstractorPortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ABSTRACTOR_PORT_WIRE_TYPE: {
				AbstractorPortWireType abstractorPortWireType = (AbstractorPortWireType)theEObject;
				T result = caseAbstractorPortWireType(abstractorPortWireType);
				if (result == null) result = casePortWireType(abstractorPortWireType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ABSTRACTORS_TYPE: {
				AbstractorsType abstractorsType = (AbstractorsType)theEObject;
				T result = caseAbstractorsType(abstractorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ABSTRACTOR_TYPE: {
				AbstractorType abstractorType = (AbstractorType)theEObject;
				T result = caseAbstractorType(abstractorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ABSTRACTOR_TYPE1: {
				AbstractorType1 abstractorType1 = (AbstractorType1)theEObject;
				T result = caseAbstractorType1(abstractorType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ABSTRACTOR_VIEW_TYPE: {
				AbstractorViewType abstractorViewType = (AbstractorViewType)theEObject;
				T result = caseAbstractorViewType(abstractorViewType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ADDRESS_BANK_TYPE: {
				AddressBankType addressBankType = (AddressBankType)theEObject;
				T result = caseAddressBankType(addressBankType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ADDRESS_BLOCK_TYPE: {
				AddressBlockType addressBlockType = (AddressBlockType)theEObject;
				T result = caseAddressBlockType(addressBlockType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ADDRESS_OFFSET_TYPE: {
				AddressOffsetType addressOffsetType = (AddressOffsetType)theEObject;
				T result = caseAddressOffsetType(addressOffsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ADDRESS_SPACE_REF_TYPE: {
				AddressSpaceRefType addressSpaceRefType = (AddressSpaceRefType)theEObject;
				T result = caseAddressSpaceRefType(addressSpaceRefType);
				if (result == null) result = caseAddrSpaceRefType(addressSpaceRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ADDRESS_SPACES_TYPE: {
				AddressSpacesType addressSpacesType = (AddressSpacesType)theEObject;
				T result = caseAddressSpacesType(addressSpacesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ADDRESS_SPACE_TYPE: {
				AddressSpaceType addressSpaceType = (AddressSpaceType)theEObject;
				T result = caseAddressSpaceType(addressSpaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ADDR_SPACE_REF_TYPE: {
				AddrSpaceRefType addrSpaceRefType = (AddrSpaceRefType)theEObject;
				T result = caseAddrSpaceRefType(addrSpaceRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.AD_HOC_CONNECTIONS_TYPE: {
				AdHocConnectionsType adHocConnectionsType = (AdHocConnectionsType)theEObject;
				T result = caseAdHocConnectionsType(adHocConnectionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.AD_HOC_CONNECTION_TYPE: {
				AdHocConnectionType adHocConnectionType = (AdHocConnectionType)theEObject;
				T result = caseAdHocConnectionType(adHocConnectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ALTERNATE_GROUPS_TYPE: {
				AlternateGroupsType alternateGroupsType = (AlternateGroupsType)theEObject;
				T result = caseAlternateGroupsType(alternateGroupsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ALTERNATE_REGISTERS_TYPE: {
				AlternateRegistersType alternateRegistersType = (AlternateRegistersType)theEObject;
				T result = caseAlternateRegistersType(alternateRegistersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ALTERNATE_REGISTER_TYPE: {
				AlternateRegisterType alternateRegisterType = (AlternateRegisterType)theEObject;
				T result = caseAlternateRegisterType(alternateRegisterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ARGUMENT_TYPE: {
				ArgumentType argumentType = (ArgumentType)theEObject;
				T result = caseArgumentType(argumentType);
				if (result == null) result = caseNameValuePairType(argumentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.BANKED_BANK_TYPE: {
				BankedBankType bankedBankType = (BankedBankType)theEObject;
				T result = caseBankedBankType(bankedBankType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.BANKED_BLOCK_TYPE: {
				BankedBlockType bankedBlockType = (BankedBlockType)theEObject;
				T result = caseBankedBlockType(bankedBlockType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.BANKED_SUBSPACE_TYPE: {
				BankedSubspaceType bankedSubspaceType = (BankedSubspaceType)theEObject;
				T result = caseBankedSubspaceType(bankedSubspaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.BASE_ADDRESSES_TYPE: {
				BaseAddressesType baseAddressesType = (BaseAddressesType)theEObject;
				T result = caseBaseAddressesType(baseAddressesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.BASE_ADDRESS_TYPE: {
				BaseAddressType baseAddressType = (BaseAddressType)theEObject;
				T result = caseBaseAddressType(baseAddressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.BASE_ADDRESS_TYPE1: {
				BaseAddressType1 baseAddressType1 = (BaseAddressType1)theEObject;
				T result = caseBaseAddressType1(baseAddressType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.BIT_STEERING_TYPE1: {
				BitSteeringType1 bitSteeringType1 = (BitSteeringType1)theEObject;
				T result = caseBitSteeringType1(bitSteeringType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.BIT_WIDTH_TYPE: {
				BitWidthType bitWidthType = (BitWidthType)theEObject;
				T result = caseBitWidthType(bitWidthType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.BRIDGE_TYPE: {
				BridgeType bridgeType = (BridgeType)theEObject;
				T result = caseBridgeType(bridgeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.BUILD_COMMAND_TYPE: {
				BuildCommandType buildCommandType = (BuildCommandType)theEObject;
				T result = caseBuildCommandType(buildCommandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.BUS_DEFINITION_TYPE: {
				BusDefinitionType busDefinitionType = (BusDefinitionType)theEObject;
				T result = caseBusDefinitionType(busDefinitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.BUS_INTERFACES_TYPE: {
				BusInterfacesType busInterfacesType = (BusInterfacesType)theEObject;
				T result = caseBusInterfacesType(busInterfacesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.BUS_INTERFACE_TYPE: {
				BusInterfaceType busInterfaceType = (BusInterfaceType)theEObject;
				T result = caseBusInterfaceType(busInterfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.CELL_CLASS_TYPE: {
				CellClassType cellClassType = (CellClassType)theEObject;
				T result = caseCellClassType(cellClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.CELL_FUNCTION_TYPE: {
				CellFunctionType cellFunctionType = (CellFunctionType)theEObject;
				T result = caseCellFunctionType(cellFunctionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.CELL_SPECIFICATION_TYPE: {
				CellSpecificationType cellSpecificationType = (CellSpecificationType)theEObject;
				T result = caseCellSpecificationType(cellSpecificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.CHANNELS_TYPE: {
				ChannelsType channelsType = (ChannelsType)theEObject;
				T result = caseChannelsType(channelsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.CHANNEL_TYPE: {
				ChannelType channelType = (ChannelType)theEObject;
				T result = caseChannelType(channelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.CHOICES_TYPE: {
				ChoicesType choicesType = (ChoicesType)theEObject;
				T result = caseChoicesType(choicesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.CHOICE_TYPE: {
				ChoiceType choiceType = (ChoiceType)theEObject;
				T result = caseChoiceType(choiceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.CLOCK_DRIVER_TYPE: {
				ClockDriverType clockDriverType = (ClockDriverType)theEObject;
				T result = caseClockDriverType(clockDriverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.CLOCK_DRIVER_TYPE1: {
				ClockDriverType1 clockDriverType1 = (ClockDriverType1)theEObject;
				T result = caseClockDriverType1(clockDriverType1);
				if (result == null) result = caseClockDriverType(clockDriverType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.CLOCK_PERIOD_TYPE: {
				ClockPeriodType clockPeriodType = (ClockPeriodType)theEObject;
				T result = caseClockPeriodType(clockPeriodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.CLOCK_PULSE_DURATION_TYPE: {
				ClockPulseDurationType clockPulseDurationType = (ClockPulseDurationType)theEObject;
				T result = caseClockPulseDurationType(clockPulseDurationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.CLOCK_PULSE_OFFSET_TYPE: {
				ClockPulseOffsetType clockPulseOffsetType = (ClockPulseOffsetType)theEObject;
				T result = caseClockPulseOffsetType(clockPulseOffsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.CLOCK_PULSE_VALUE_TYPE: {
				ClockPulseValueType clockPulseValueType = (ClockPulseValueType)theEObject;
				T result = caseClockPulseValueType(clockPulseValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.COMMAND_LINE_SWITCH_TYPE: {
				CommandLineSwitchType commandLineSwitchType = (CommandLineSwitchType)theEObject;
				T result = caseCommandLineSwitchType(commandLineSwitchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.COMMAND_TYPE: {
				CommandType commandType = (CommandType)theEObject;
				T result = caseCommandType(commandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.COMMAND_TYPE1: {
				CommandType1 commandType1 = (CommandType1)theEObject;
				T result = caseCommandType1(commandType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.COMMAND_TYPE2: {
				CommandType2 commandType2 = (CommandType2)theEObject;
				T result = caseCommandType2(commandType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.COMPONENT_GENERATORS_TYPE: {
				ComponentGeneratorsType componentGeneratorsType = (ComponentGeneratorsType)theEObject;
				T result = caseComponentGeneratorsType(componentGeneratorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.COMPONENT_GENERATOR_TYPE: {
				ComponentGeneratorType componentGeneratorType = (ComponentGeneratorType)theEObject;
				T result = caseComponentGeneratorType(componentGeneratorType);
				if (result == null) result = caseInstanceGeneratorType(componentGeneratorType);
				if (result == null) result = caseGeneratorType1(componentGeneratorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.COMPONENT_INSTANCES_TYPE: {
				ComponentInstancesType componentInstancesType = (ComponentInstancesType)theEObject;
				T result = caseComponentInstancesType(componentInstancesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.COMPONENT_INSTANCE_TYPE: {
				ComponentInstanceType componentInstanceType = (ComponentInstanceType)theEObject;
				T result = caseComponentInstanceType(componentInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.COMPONENT_TYPE: {
				ComponentType componentType = (ComponentType)theEObject;
				T result = caseComponentType(componentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.CONFIGURABLE_ELEMENT_VALUES_TYPE: {
				ConfigurableElementValuesType configurableElementValuesType = (ConfigurableElementValuesType)theEObject;
				T result = caseConfigurableElementValuesType(configurableElementValuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.CONFIGURABLE_ELEMENT_VALUE_TYPE: {
				ConfigurableElementValueType configurableElementValueType = (ConfigurableElementValueType)theEObject;
				T result = caseConfigurableElementValueType(configurableElementValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.CONNECTION_TYPE: {
				ConnectionType connectionType = (ConnectionType)theEObject;
				T result = caseConnectionType(connectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.CONSTRAINT_SETS_TYPE: {
				ConstraintSetsType constraintSetsType = (ConstraintSetsType)theEObject;
				T result = caseConstraintSetsType(constraintSetsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.CONSTRAINT_SET_TYPE: {
				ConstraintSetType constraintSetType = (ConstraintSetType)theEObject;
				T result = caseConstraintSetType(constraintSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.CPUS_TYPE: {
				CpusType cpusType = (CpusType)theEObject;
				T result = caseCpusType(cpusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.CPU_TYPE: {
				CpuType cpuType = (CpuType)theEObject;
				T result = caseCpuType(cpuType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.DEFAULT_VALUE_TYPE: {
				DefaultValueType defaultValueType = (DefaultValueType)theEObject;
				T result = caseDefaultValueType(defaultValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.DESIGN_CONFIGURATION_TYPE: {
				DesignConfigurationType designConfigurationType = (DesignConfigurationType)theEObject;
				T result = caseDesignConfigurationType(designConfigurationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.DESIGN_TYPE: {
				DesignType designType = (DesignType)theEObject;
				T result = caseDesignType(designType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.DISABLED_TYPE: {
				DisabledType disabledType = (DisabledType)theEObject;
				T result = caseDisabledType(disabledType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.DRIVE_CONSTRAINT_TYPE: {
				DriveConstraintType driveConstraintType = (DriveConstraintType)theEObject;
				T result = caseDriveConstraintType(driveConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.DRIVER_TYPE: {
				DriverType driverType = (DriverType)theEObject;
				T result = caseDriverType(driverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ENABLE_TYPE: {
				EnableType enableType = (EnableType)theEObject;
				T result = caseEnableType(enableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ENUMERATED_VALUES_TYPE: {
				EnumeratedValuesType enumeratedValuesType = (EnumeratedValuesType)theEObject;
				T result = caseEnumeratedValuesType(enumeratedValuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ENUMERATED_VALUE_TYPE: {
				EnumeratedValueType enumeratedValueType = (EnumeratedValueType)theEObject;
				T result = caseEnumeratedValueType(enumeratedValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ENUMERATION_TYPE: {
				EnumerationType enumerationType = (EnumerationType)theEObject;
				T result = caseEnumerationType(enumerationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.EXECUTABLE_IMAGE_TYPE: {
				ExecutableImageType executableImageType = (ExecutableImageType)theEObject;
				T result = caseExecutableImageType(executableImageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.EXTERNAL_PORT_REFERENCE_TYPE: {
				ExternalPortReferenceType externalPortReferenceType = (ExternalPortReferenceType)theEObject;
				T result = caseExternalPortReferenceType(externalPortReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.FIELD_TYPE: {
				FieldType fieldType = (FieldType)theEObject;
				T result = caseFieldType(fieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.FILE_BUILDER_TYPE: {
				FileBuilderType fileBuilderType = (FileBuilderType)theEObject;
				T result = caseFileBuilderType(fileBuilderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.FILE_BUILDER_TYPE1: {
				FileBuilderType1 fileBuilderType1 = (FileBuilderType1)theEObject;
				T result = caseFileBuilderType1(fileBuilderType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.FILE_SET_REF_GROUP_TYPE: {
				FileSetRefGroupType fileSetRefGroupType = (FileSetRefGroupType)theEObject;
				T result = caseFileSetRefGroupType(fileSetRefGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.FILE_SET_REF_GROUP_TYPE1: {
				FileSetRefGroupType1 fileSetRefGroupType1 = (FileSetRefGroupType1)theEObject;
				T result = caseFileSetRefGroupType1(fileSetRefGroupType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.FILE_SET_REF_TYPE: {
				FileSetRefType fileSetRefType = (FileSetRefType)theEObject;
				T result = caseFileSetRefType(fileSetRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.FILE_SETS_TYPE: {
				FileSetsType fileSetsType = (FileSetsType)theEObject;
				T result = caseFileSetsType(fileSetsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.FILE_SET_TYPE: {
				FileSetType fileSetType = (FileSetType)theEObject;
				T result = caseFileSetType(fileSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.FILE_TYPE: {
				FileType fileType = (FileType)theEObject;
				T result = caseFileType(fileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.FLAGS_TYPE: {
				FlagsType flagsType = (FlagsType)theEObject;
				T result = caseFlagsType(flagsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.FLAGS_TYPE1: {
				FlagsType1 flagsType1 = (FlagsType1)theEObject;
				T result = caseFlagsType1(flagsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.FLAGS_TYPE2: {
				FlagsType2 flagsType2 = (FlagsType2)theEObject;
				T result = caseFlagsType2(flagsType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.FUNCTION_TYPE: {
				FunctionType functionType = (FunctionType)theEObject;
				T result = caseFunctionType(functionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.GENERATOR_CHAIN_CONFIGURATION_TYPE: {
				GeneratorChainConfigurationType generatorChainConfigurationType = (GeneratorChainConfigurationType)theEObject;
				T result = caseGeneratorChainConfigurationType(generatorChainConfigurationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.GENERATOR_CHAIN_SELECTOR_TYPE: {
				GeneratorChainSelectorType generatorChainSelectorType = (GeneratorChainSelectorType)theEObject;
				T result = caseGeneratorChainSelectorType(generatorChainSelectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.GENERATOR_CHAIN_TYPE: {
				GeneratorChainType generatorChainType = (GeneratorChainType)theEObject;
				T result = caseGeneratorChainType(generatorChainType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.GENERATOR_SELECTOR_TYPE: {
				GeneratorSelectorType generatorSelectorType = (GeneratorSelectorType)theEObject;
				T result = caseGeneratorSelectorType(generatorSelectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.GENERATOR_TYPE: {
				GeneratorType generatorType = (GeneratorType)theEObject;
				T result = caseGeneratorType(generatorType);
				if (result == null) result = caseGeneratorType1(generatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.GENERATOR_TYPE1: {
				GeneratorType1 generatorType1 = (GeneratorType1)theEObject;
				T result = caseGeneratorType1(generatorType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.GROUP_SELECTOR_TYPE: {
				GroupSelectorType groupSelectorType = (GroupSelectorType)theEObject;
				T result = caseGroupSelectorType(groupSelectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.HIER_CONNECTIONS_TYPE: {
				HierConnectionsType hierConnectionsType = (HierConnectionsType)theEObject;
				T result = caseHierConnectionsType(hierConnectionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.HIER_CONNECTION_TYPE: {
				HierConnectionType hierConnectionType = (HierConnectionType)theEObject;
				T result = caseHierConnectionType(hierConnectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.HIER_INTERFACE: {
				HierInterface hierInterface = (HierInterface)theEObject;
				T result = caseHierInterface(hierInterface);
				if (result == null) result = caseInterface(hierInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.INSTANCE_GENERATOR_TYPE: {
				InstanceGeneratorType instanceGeneratorType = (InstanceGeneratorType)theEObject;
				T result = caseInstanceGeneratorType(instanceGeneratorType);
				if (result == null) result = caseGeneratorType1(instanceGeneratorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.INTERCONNECTION_CONFIGURATION_TYPE: {
				InterconnectionConfigurationType interconnectionConfigurationType = (InterconnectionConfigurationType)theEObject;
				T result = caseInterconnectionConfigurationType(interconnectionConfigurationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.INTERCONNECTIONS_TYPE: {
				InterconnectionsType interconnectionsType = (InterconnectionsType)theEObject;
				T result = caseInterconnectionsType(interconnectionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.INTERCONNECTION_TYPE: {
				InterconnectionType interconnectionType = (InterconnectionType)theEObject;
				T result = caseInterconnectionType(interconnectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.INTERNAL_PORT_REFERENCE_TYPE: {
				InternalPortReferenceType internalPortReferenceType = (InternalPortReferenceType)theEObject;
				T result = caseInternalPortReferenceType(internalPortReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.IS_INCLUDE_FILE_TYPE: {
				IsIncludeFileType isIncludeFileType = (IsIncludeFileType)theEObject;
				T result = caseIsIncludeFileType(isIncludeFileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.LANGUAGE_TOOLS_TYPE: {
				LanguageToolsType languageToolsType = (LanguageToolsType)theEObject;
				T result = caseLanguageToolsType(languageToolsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.LANGUAGE_TYPE: {
				LanguageType languageType = (LanguageType)theEObject;
				T result = caseLanguageType(languageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.LANGUAGE_TYPE1: {
				LanguageType1 languageType1 = (LanguageType1)theEObject;
				T result = caseLanguageType1(languageType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.LEFT_TYPE: {
				LeftType leftType = (LeftType)theEObject;
				T result = caseLeftType(leftType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.LEFT_TYPE1: {
				LeftType1 leftType1 = (LeftType1)theEObject;
				T result = caseLeftType1(leftType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.LEFT_TYPE2: {
				LeftType2 leftType2 = (LeftType2)theEObject;
				T result = caseLeftType2(leftType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.LEFT_TYPE11: {
				LeftType11 leftType11 = (LeftType11)theEObject;
				T result = caseLeftType11(leftType11);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.LIBRARY_REF_TYPE: {
				LibraryRefType libraryRefType = (LibraryRefType)theEObject;
				T result = caseLibraryRefType(libraryRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.LINKER_COMMAND_FILE_TYPE: {
				LinkerCommandFileType linkerCommandFileType = (LinkerCommandFileType)theEObject;
				T result = caseLinkerCommandFileType(linkerCommandFileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.LINKER_FLAGS_TYPE: {
				LinkerFlagsType linkerFlagsType = (LinkerFlagsType)theEObject;
				T result = caseLinkerFlagsType(linkerFlagsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.LINKER_TYPE: {
				LinkerType linkerType = (LinkerType)theEObject;
				T result = caseLinkerType(linkerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.LOAD_CONSTRAINT_TYPE: {
				LoadConstraintType loadConstraintType = (LoadConstraintType)theEObject;
				T result = caseLoadConstraintType(loadConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.LOCAL_MEMORY_MAP_TYPE: {
				LocalMemoryMapType localMemoryMapType = (LocalMemoryMapType)theEObject;
				T result = caseLocalMemoryMapType(localMemoryMapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.LOGICAL_NAME_TYPE: {
				LogicalNameType logicalNameType = (LogicalNameType)theEObject;
				T result = caseLogicalNameType(logicalNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.LOGICAL_PORT_TYPE: {
				LogicalPortType logicalPortType = (LogicalPortType)theEObject;
				T result = caseLogicalPortType(logicalPortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.LOGICAL_PORT_TYPE1: {
				LogicalPortType1 logicalPortType1 = (LogicalPortType1)theEObject;
				T result = caseLogicalPortType1(logicalPortType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.MASK_TYPE: {
				MaskType maskType = (MaskType)theEObject;
				T result = caseMaskType(maskType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.MASK_TYPE1: {
				MaskType1 maskType1 = (MaskType1)theEObject;
				T result = caseMaskType1(maskType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.MASTER_TYPE: {
				MasterType masterType = (MasterType)theEObject;
				T result = caseMasterType(masterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.MAXIMUM_TYPE: {
				MaximumType maximumType = (MaximumType)theEObject;
				T result = caseMaximumType(maximumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.MEMORY_MAP_REF_TYPE: {
				MemoryMapRefType memoryMapRefType = (MemoryMapRefType)theEObject;
				T result = caseMemoryMapRefType(memoryMapRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.MEMORY_MAPS_TYPE: {
				MemoryMapsType memoryMapsType = (MemoryMapsType)theEObject;
				T result = caseMemoryMapsType(memoryMapsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.MEMORY_MAP_TYPE: {
				MemoryMapType memoryMapType = (MemoryMapType)theEObject;
				T result = caseMemoryMapType(memoryMapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.MEMORY_REMAP_TYPE: {
				MemoryRemapType memoryRemapType = (MemoryRemapType)theEObject;
				T result = caseMemoryRemapType(memoryRemapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.MINIMUM_TYPE: {
				MinimumType minimumType = (MinimumType)theEObject;
				T result = caseMinimumType(minimumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.MIRRORED_MASTER_TYPE: {
				MirroredMasterType mirroredMasterType = (MirroredMasterType)theEObject;
				T result = caseMirroredMasterType(mirroredMasterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.MIRRORED_SLAVE_TYPE: {
				MirroredSlaveType mirroredSlaveType = (MirroredSlaveType)theEObject;
				T result = caseMirroredSlaveType(mirroredSlaveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.MIRRORED_SYSTEM_TYPE: {
				MirroredSystemType mirroredSystemType = (MirroredSystemType)theEObject;
				T result = caseMirroredSystemType(mirroredSystemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.MODEL_PARAMETERS_TYPE: {
				ModelParametersType modelParametersType = (ModelParametersType)theEObject;
				T result = caseModelParametersType(modelParametersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.MODEL_PARAMETERS_TYPE1: {
				ModelParametersType1 modelParametersType1 = (ModelParametersType1)theEObject;
				T result = caseModelParametersType1(modelParametersType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.MODEL_TYPE: {
				ModelType modelType = (ModelType)theEObject;
				T result = caseModelType(modelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.MONITOR_INTERCONNECTION_TYPE: {
				MonitorInterconnectionType monitorInterconnectionType = (MonitorInterconnectionType)theEObject;
				T result = caseMonitorInterconnectionType(monitorInterconnectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.MONITOR_TYPE: {
				MonitorType monitorType = (MonitorType)theEObject;
				T result = caseMonitorType(monitorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.NAME_TYPE: {
				NameType nameType = (NameType)theEObject;
				T result = caseNameType(nameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.NAME_TYPE1: {
				NameType1 nameType1 = (NameType1)theEObject;
				T result = caseNameType1(nameType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.NAME_TYPE2: {
				NameType2 nameType2 = (NameType2)theEObject;
				T result = caseNameType2(nameType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.NAME_VALUE_PAIR_TYPE: {
				NameValuePairType nameValuePairType = (NameValuePairType)theEObject;
				T result = caseNameValuePairType(nameValuePairType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.NAME_VALUE_TYPE_TYPE: {
				NameValueTypeType nameValueTypeType = (NameValueTypeType)theEObject;
				T result = caseNameValueTypeType(nameValueTypeType);
				if (result == null) result = caseNameValuePairType(nameValueTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ON_MASTER_TYPE: {
				OnMasterType onMasterType = (OnMasterType)theEObject;
				T result = caseOnMasterType(onMasterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ON_MASTER_TYPE1: {
				OnMasterType1 onMasterType1 = (OnMasterType1)theEObject;
				T result = caseOnMasterType1(onMasterType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ON_SLAVE_TYPE: {
				OnSlaveType onSlaveType = (OnSlaveType)theEObject;
				T result = caseOnSlaveType(onSlaveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ON_SLAVE_TYPE1: {
				OnSlaveType1 onSlaveType1 = (OnSlaveType1)theEObject;
				T result = caseOnSlaveType1(onSlaveType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ON_SYSTEM_TYPE: {
				OnSystemType onSystemType = (OnSystemType)theEObject;
				T result = caseOnSystemType(onSystemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.ON_SYSTEM_TYPE1: {
				OnSystemType1 onSystemType1 = (OnSystemType1)theEObject;
				T result = caseOnSystemType1(onSystemType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.OTHER_CLOCK_DRIVER_TYPE: {
				OtherClockDriverType otherClockDriverType = (OtherClockDriverType)theEObject;
				T result = caseOtherClockDriverType(otherClockDriverType);
				if (result == null) result = caseClockDriverType(otherClockDriverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.OTHER_CLOCKS: {
				OtherClocks otherClocks = (OtherClocks)theEObject;
				T result = caseOtherClocks(otherClocks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.PARAMETERS_TYPE: {
				ParametersType parametersType = (ParametersType)theEObject;
				T result = caseParametersType(parametersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.PARAMETERS_TYPE1: {
				ParametersType1 parametersType1 = (ParametersType1)theEObject;
				T result = caseParametersType1(parametersType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.PHASE_TYPE: {
				PhaseType phaseType = (PhaseType)theEObject;
				T result = casePhaseType(phaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.PHYSICAL_PORT_TYPE: {
				PhysicalPortType physicalPortType = (PhysicalPortType)theEObject;
				T result = casePhysicalPortType(physicalPortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.PHYSICAL_PORT_TYPE1: {
				PhysicalPortType1 physicalPortType1 = (PhysicalPortType1)theEObject;
				T result = casePhysicalPortType1(physicalPortType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.PORT_ACCESS_TYPE: {
				PortAccessType portAccessType = (PortAccessType)theEObject;
				T result = casePortAccessType(portAccessType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.PORT_DECLARATION_TYPE: {
				PortDeclarationType portDeclarationType = (PortDeclarationType)theEObject;
				T result = casePortDeclarationType(portDeclarationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.PORT_MAPS_TYPE: {
				PortMapsType portMapsType = (PortMapsType)theEObject;
				T result = casePortMapsType(portMapsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.PORT_MAPS_TYPE1: {
				PortMapsType1 portMapsType1 = (PortMapsType1)theEObject;
				T result = casePortMapsType1(portMapsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.PORT_MAP_TYPE: {
				PortMapType portMapType = (PortMapType)theEObject;
				T result = casePortMapType(portMapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.PORT_MAP_TYPE1: {
				PortMapType1 portMapType1 = (PortMapType1)theEObject;
				T result = casePortMapType1(portMapType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.PORTS_TYPE: {
				PortsType portsType = (PortsType)theEObject;
				T result = casePortsType(portsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.PORTS_TYPE1: {
				PortsType1 portsType1 = (PortsType1)theEObject;
				T result = casePortsType1(portsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.PORTS_TYPE2: {
				PortsType2 portsType2 = (PortsType2)theEObject;
				T result = casePortsType2(portsType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.PORT_TRANSACTIONAL_TYPE: {
				PortTransactionalType portTransactionalType = (PortTransactionalType)theEObject;
				T result = casePortTransactionalType(portTransactionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.PORT_TYPE: {
				PortType portType = (PortType)theEObject;
				T result = casePortType(portType);
				if (result == null) result = casePortDeclarationType(portType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.PORT_TYPE1: {
				PortType1 portType1 = (PortType1)theEObject;
				T result = casePortType1(portType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.PORT_WIRE_TYPE: {
				PortWireType portWireType = (PortWireType)theEObject;
				T result = casePortWireType(portWireType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.QUALIFIER_TYPE: {
				QualifierType qualifierType = (QualifierType)theEObject;
				T result = caseQualifierType(qualifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.QUALIFIER_TYPE1: {
				QualifierType1 qualifierType1 = (QualifierType1)theEObject;
				T result = caseQualifierType1(qualifierType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.RANGE_TYPE: {
				RangeType rangeType = (RangeType)theEObject;
				T result = caseRangeType(rangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.RANGE_TYPE1: {
				RangeType1 rangeType1 = (RangeType1)theEObject;
				T result = caseRangeType1(rangeType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.RANGE_TYPE2: {
				RangeType2 rangeType2 = (RangeType2)theEObject;
				T result = caseRangeType2(rangeType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.RANGE_TYPE3: {
				RangeType3 rangeType3 = (RangeType3)theEObject;
				T result = caseRangeType3(rangeType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.REGISTER_FILE_TYPE: {
				RegisterFileType registerFileType = (RegisterFileType)theEObject;
				T result = caseRegisterFileType(registerFileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.REGISTER_TYPE: {
				RegisterType registerType = (RegisterType)theEObject;
				T result = caseRegisterType(registerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.REMAP_ADDRESS_TYPE: {
				RemapAddressType remapAddressType = (RemapAddressType)theEObject;
				T result = caseRemapAddressType(remapAddressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.REMAP_PORTS_TYPE: {
				RemapPortsType remapPortsType = (RemapPortsType)theEObject;
				T result = caseRemapPortsType(remapPortsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.REMAP_PORT_TYPE: {
				RemapPortType remapPortType = (RemapPortType)theEObject;
				T result = caseRemapPortType(remapPortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.REMAP_STATES_TYPE: {
				RemapStatesType remapStatesType = (RemapStatesType)theEObject;
				T result = caseRemapStatesType(remapStatesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.REMAP_STATE_TYPE: {
				RemapStateType remapStateType = (RemapStateType)theEObject;
				T result = caseRemapStateType(remapStateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.REPLACE_DEFAULT_FLAGS_TYPE: {
				ReplaceDefaultFlagsType replaceDefaultFlagsType = (ReplaceDefaultFlagsType)theEObject;
				T result = caseReplaceDefaultFlagsType(replaceDefaultFlagsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.REPLACE_DEFAULT_FLAGS_TYPE1: {
				ReplaceDefaultFlagsType1 replaceDefaultFlagsType1 = (ReplaceDefaultFlagsType1)theEObject;
				T result = caseReplaceDefaultFlagsType1(replaceDefaultFlagsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.REPLACE_DEFAULT_FLAGS_TYPE2: {
				ReplaceDefaultFlagsType2 replaceDefaultFlagsType2 = (ReplaceDefaultFlagsType2)theEObject;
				T result = caseReplaceDefaultFlagsType2(replaceDefaultFlagsType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.REQUIRES_DRIVER_TYPE: {
				RequiresDriverType requiresDriverType = (RequiresDriverType)theEObject;
				T result = caseRequiresDriverType(requiresDriverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.RESET_TYPE: {
				ResetType resetType = (ResetType)theEObject;
				T result = caseResetType(resetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.RESET_TYPE1: {
				ResetType1 resetType1 = (ResetType1)theEObject;
				T result = caseResetType1(resetType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.RESOLVED_LIBRARY_REF_TYPE: {
				ResolvedLibraryRefType resolvedLibraryRefType = (ResolvedLibraryRefType)theEObject;
				T result = caseResolvedLibraryRefType(resolvedLibraryRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.RIGHT_TYPE: {
				RightType rightType = (RightType)theEObject;
				T result = caseRightType(rightType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.RIGHT_TYPE1: {
				RightType1 rightType1 = (RightType1)theEObject;
				T result = caseRightType1(rightType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.RIGHT_TYPE2: {
				RightType2 rightType2 = (RightType2)theEObject;
				T result = caseRightType2(rightType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.RIGHT_TYPE11: {
				RightType11 rightType11 = (RightType11)theEObject;
				T result = caseRightType11(rightType11);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.SEGMENTS_TYPE: {
				SegmentsType segmentsType = (SegmentsType)theEObject;
				T result = caseSegmentsType(segmentsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.SEGMENT_TYPE: {
				SegmentType segmentType = (SegmentType)theEObject;
				T result = caseSegmentType(segmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.SERVICE_TYPE: {
				ServiceType serviceType = (ServiceType)theEObject;
				T result = caseServiceType(serviceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.SERVICE_TYPE1: {
				ServiceType1 serviceType1 = (ServiceType1)theEObject;
				T result = caseServiceType1(serviceType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.SERVICE_TYPE_DEFS_TYPE: {
				ServiceTypeDefsType serviceTypeDefsType = (ServiceTypeDefsType)theEObject;
				T result = caseServiceTypeDefsType(serviceTypeDefsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.SERVICE_TYPE_DEF_TYPE: {
				ServiceTypeDefType serviceTypeDefType = (ServiceTypeDefType)theEObject;
				T result = caseServiceTypeDefType(serviceTypeDefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.SINGLE_SHOT_DRIVER_TYPE: {
				SingleShotDriverType singleShotDriverType = (SingleShotDriverType)theEObject;
				T result = caseSingleShotDriverType(singleShotDriverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.SINGLE_SHOT_DURATION_TYPE: {
				SingleShotDurationType singleShotDurationType = (SingleShotDurationType)theEObject;
				T result = caseSingleShotDurationType(singleShotDurationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.SINGLE_SHOT_OFFSET_TYPE: {
				SingleShotOffsetType singleShotOffsetType = (SingleShotOffsetType)theEObject;
				T result = caseSingleShotOffsetType(singleShotOffsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.SINGLE_SHOT_VALUE_TYPE: {
				SingleShotValueType singleShotValueType = (SingleShotValueType)theEObject;
				T result = caseSingleShotValueType(singleShotValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.SIZE_TYPE: {
				SizeType sizeType = (SizeType)theEObject;
				T result = caseSizeType(sizeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.SLAVE_TYPE: {
				SlaveType slaveType = (SlaveType)theEObject;
				T result = caseSlaveType(slaveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.SOURCE_FILE_TYPE: {
				SourceFileType sourceFileType = (SourceFileType)theEObject;
				T result = caseSourceFileType(sourceFileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.SOURCE_NAME_TYPE: {
				SourceNameType sourceNameType = (SourceNameType)theEObject;
				T result = caseSourceNameType(sourceNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.SUBSPACE_REF_TYPE: {
				SubspaceRefType subspaceRefType = (SubspaceRefType)theEObject;
				T result = caseSubspaceRefType(subspaceRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.SYSTEM_GROUP_NAMES_TYPE: {
				SystemGroupNamesType systemGroupNamesType = (SystemGroupNamesType)theEObject;
				T result = caseSystemGroupNamesType(systemGroupNamesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.SYSTEM_TYPE: {
				SystemType systemType = (SystemType)theEObject;
				T result = caseSystemType(systemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.TARGET_NAME_TYPE: {
				TargetNameType targetNameType = (TargetNameType)theEObject;
				T result = caseTargetNameType(targetNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.TESTABLE_TYPE: {
				TestableType testableType = (TestableType)theEObject;
				T result = caseTestableType(testableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.TIMING_CONSTRAINT_TYPE: {
				TimingConstraintType timingConstraintType = (TimingConstraintType)theEObject;
				T result = caseTimingConstraintType(timingConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.TRANSACTIONAL_TYPE: {
				TransactionalType transactionalType = (TransactionalType)theEObject;
				T result = caseTransactionalType(transactionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.TRANSPORT_METHODS_TYPE: {
				TransportMethodsType transportMethodsType = (TransportMethodsType)theEObject;
				T result = caseTransportMethodsType(transportMethodsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.TRANS_TYPE_DEF_TYPE: {
				TransTypeDefType transTypeDefType = (TransTypeDefType)theEObject;
				T result = caseTransTypeDefType(transTypeDefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.TYPE_NAME_TYPE: {
				TypeNameType typeNameType = (TypeNameType)theEObject;
				T result = caseTypeNameType(typeNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.TYPE_NAME_TYPE1: {
				TypeNameType1 typeNameType1 = (TypeNameType1)theEObject;
				T result = caseTypeNameType1(typeNameType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.TYPE_NAME_TYPE2: {
				TypeNameType2 typeNameType2 = (TypeNameType2)theEObject;
				T result = caseTypeNameType2(typeNameType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.TYPE_NAME_TYPE3: {
				TypeNameType3 typeNameType3 = (TypeNameType3)theEObject;
				T result = caseTypeNameType3(typeNameType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.VALUE_MASK_CONFIG_TYPE: {
				ValueMaskConfigType valueMaskConfigType = (ValueMaskConfigType)theEObject;
				T result = caseValueMaskConfigType(valueMaskConfigType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				T result = caseValueType(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.VALUE_TYPE1: {
				ValueType1 valueType1 = (ValueType1)theEObject;
				T result = caseValueType1(valueType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.VALUE_TYPE2: {
				ValueType2 valueType2 = (ValueType2)theEObject;
				T result = caseValueType2(valueType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.VECTOR_TYPE: {
				VectorType vectorType = (VectorType)theEObject;
				T result = caseVectorType(vectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.VECTOR_TYPE1: {
				VectorType1 vectorType1 = (VectorType1)theEObject;
				T result = caseVectorType1(vectorType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.VECTOR_TYPE2: {
				VectorType2 vectorType2 = (VectorType2)theEObject;
				T result = caseVectorType2(vectorType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.VECTOR_TYPE11: {
				VectorType11 vectorType11 = (VectorType11)theEObject;
				T result = caseVectorType11(vectorType11);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.VENDOR_EXTENSIONS_TYPE: {
				VendorExtensionsType vendorExtensionsType = (VendorExtensionsType)theEObject;
				T result = caseVendorExtensionsType(vendorExtensionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.VIEW_CONFIGURATION_TYPE: {
				ViewConfigurationType viewConfigurationType = (ViewConfigurationType)theEObject;
				T result = caseViewConfigurationType(viewConfigurationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.VIEWS_TYPE: {
				ViewsType viewsType = (ViewsType)theEObject;
				T result = caseViewsType(viewsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.VIEWS_TYPE1: {
				ViewsType1 viewsType1 = (ViewsType1)theEObject;
				T result = caseViewsType1(viewsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.VIEW_TYPE: {
				ViewType viewType = (ViewType)theEObject;
				T result = caseViewType(viewType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.WHITEBOX_ELEMENT_REFS_TYPE: {
				WhiteboxElementRefsType whiteboxElementRefsType = (WhiteboxElementRefsType)theEObject;
				T result = caseWhiteboxElementRefsType(whiteboxElementRefsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.WHITEBOX_ELEMENT_REF_TYPE: {
				WhiteboxElementRefType whiteboxElementRefType = (WhiteboxElementRefType)theEObject;
				T result = caseWhiteboxElementRefType(whiteboxElementRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.WHITEBOX_ELEMENTS_TYPE: {
				WhiteboxElementsType whiteboxElementsType = (WhiteboxElementsType)theEObject;
				T result = caseWhiteboxElementsType(whiteboxElementsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.WHITEBOX_ELEMENT_TYPE: {
				WhiteboxElementType whiteboxElementType = (WhiteboxElementType)theEObject;
				T result = caseWhiteboxElementType(whiteboxElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.WHITEBOX_PATH_TYPE: {
				WhiteboxPathType whiteboxPathType = (WhiteboxPathType)theEObject;
				T result = caseWhiteboxPathType(whiteboxPathType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.WIDTH_TYPE: {
				WidthType widthType = (WidthType)theEObject;
				T result = caseWidthType(widthType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.WIRE_TYPE: {
				WireType wireType = (WireType)theEObject;
				T result = caseWireType(wireType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.WIRE_TYPE_DEFS_TYPE: {
				WireTypeDefsType wireTypeDefsType = (WireTypeDefsType)theEObject;
				T result = caseWireTypeDefsType(wireTypeDefsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.WIRE_TYPE_DEF_TYPE: {
				WireTypeDefType wireTypeDefType = (WireTypeDefType)theEObject;
				T result = caseWireTypeDefType(wireTypeDefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2009Package.WRITE_VALUE_CONSTRAINT_TYPE: {
				WriteValueConstraintType writeValueConstraintType = (WriteValueConstraintType)theEObject;
				T result = caseWriteValueConstraintType(writeValueConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstraction Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstraction Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractionDefinitionType(AbstractionDefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstraction Def Port Constraints Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstraction Def Port Constraints Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractionDefPortConstraintsType(AbstractionDefPortConstraintsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstractor Bus Interface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstractor Bus Interface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractorBusInterfaceType(AbstractorBusInterfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstractor Generators Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstractor Generators Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractorGeneratorsType(AbstractorGeneratorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstractor Interfaces Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstractor Interfaces Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractorInterfacesType(AbstractorInterfacesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstractor Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstractor Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractorModelType(AbstractorModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstractor Mode Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstractor Mode Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractorModeType1(AbstractorModeType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstractor Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstractor Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractorPortType(AbstractorPortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstractor Port Wire Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstractor Port Wire Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractorPortWireType(AbstractorPortWireType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstractors Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstractors Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractorsType(AbstractorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstractor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstractor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractorType(AbstractorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstractor Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstractor Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractorType1(AbstractorType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstractor View Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstractor View Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractorViewType(AbstractorViewType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Bank Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Bank Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressBankType(AddressBankType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Block Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Block Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressBlockType(AddressBlockType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Offset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Offset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressOffsetType(AddressOffsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Space Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Space Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressSpaceRefType(AddressSpaceRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Spaces Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Spaces Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressSpacesType(AddressSpacesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Space Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Space Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressSpaceType(AddressSpaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addr Space Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addr Space Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddrSpaceRefType(AddrSpaceRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ad Hoc Connections Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ad Hoc Connections Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdHocConnectionsType(AdHocConnectionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ad Hoc Connection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ad Hoc Connection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdHocConnectionType(AdHocConnectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternate Groups Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternate Groups Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternateGroupsType(AlternateGroupsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternate Registers Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternate Registers Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternateRegistersType(AlternateRegistersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternate Register Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternate Register Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternateRegisterType(AlternateRegisterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentType(ArgumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Banked Bank Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Banked Bank Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBankedBankType(BankedBankType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Banked Block Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Banked Block Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBankedBlockType(BankedBlockType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Banked Subspace Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Banked Subspace Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBankedSubspaceType(BankedSubspaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Addresses Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Addresses Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseAddressesType(BaseAddressesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseAddressType(BaseAddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Address Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Address Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseAddressType1(BaseAddressType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Steering Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Steering Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitSteeringType1(BitSteeringType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Width Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Width Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitWidthType(BitWidthType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bridge Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bridge Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBridgeType(BridgeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Command Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Command Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildCommandType(BuildCommandType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusDefinitionType(BusDefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Interfaces Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Interfaces Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusInterfacesType(BusInterfacesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Interface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Interface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusInterfaceType(BusInterfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellClassType(CellClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellFunctionType(CellFunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Specification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Specification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellSpecificationType(CellSpecificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channels Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channels Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelsType(ChannelsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelType(ChannelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choices Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choices Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoicesType(ChoicesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoiceType(ChoiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Driver Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Driver Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockDriverType(ClockDriverType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Driver Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Driver Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockDriverType1(ClockDriverType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Period Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Period Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockPeriodType(ClockPeriodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Pulse Duration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Pulse Duration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockPulseDurationType(ClockPulseDurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Pulse Offset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Pulse Offset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockPulseOffsetType(ClockPulseOffsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Pulse Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Pulse Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockPulseValueType(ClockPulseValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Line Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Line Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandLineSwitchType(CommandLineSwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandType(CommandType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandType1(CommandType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandType2(CommandType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Generators Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Generators Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentGeneratorsType(ComponentGeneratorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Generator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Generator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentGeneratorType(ComponentGeneratorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instances Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instances Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInstancesType(ComponentInstancesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInstanceType(ComponentInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentType(ComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configurable Element Values Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configurable Element Values Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurableElementValuesType(ConfigurableElementValuesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configurable Element Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configurable Element Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurableElementValueType(ConfigurableElementValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionType(ConnectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Sets Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Sets Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintSetsType(ConstraintSetsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintSetType(ConstraintSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cpus Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cpus Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCpusType(CpusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cpu Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cpu Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCpuType(CpuType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultValueType(DefaultValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Configuration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Configuration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignConfigurationType(DesignConfigurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignType(DesignType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disabled Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disabled Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisabledType(DisabledType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drive Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drive Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDriveConstraintType(DriveConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Driver Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Driver Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDriverType(DriverType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnableType(EnableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Values Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Values Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedValuesType(EnumeratedValuesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedValueType(EnumeratedValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationType(EnumerationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Image Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Image Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableImageType(ExecutableImageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Port Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Port Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalPortReferenceType(ExternalPortReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldType(FieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Builder Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Builder Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileBuilderType(FileBuilderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Builder Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Builder Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileBuilderType1(FileBuilderType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Set Ref Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Set Ref Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSetRefGroupType(FileSetRefGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Set Ref Group Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Set Ref Group Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSetRefGroupType1(FileSetRefGroupType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Set Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Set Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSetRefType(FileSetRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Sets Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Sets Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSetsType(FileSetsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSetType(FileSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileType(FileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flags Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flags Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlagsType(FlagsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flags Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flags Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlagsType1(FlagsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flags Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flags Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlagsType2(FlagsType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionType(FunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Chain Configuration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Chain Configuration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorChainConfigurationType(GeneratorChainConfigurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Chain Selector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Chain Selector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorChainSelectorType(GeneratorChainSelectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Chain Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Chain Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorChainType(GeneratorChainType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Selector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Selector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorSelectorType(GeneratorSelectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorType(GeneratorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorType1(GeneratorType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Selector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Selector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupSelectorType(GroupSelectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hier Connections Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hier Connections Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHierConnectionsType(HierConnectionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hier Connection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hier Connection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHierConnectionType(HierConnectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hier Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hier Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHierInterface(HierInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Generator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Generator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceGeneratorType(InstanceGeneratorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interconnection Configuration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interconnection Configuration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterconnectionConfigurationType(InterconnectionConfigurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interconnections Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interconnections Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterconnectionsType(InterconnectionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interconnection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interconnection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterconnectionType(InterconnectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Port Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Port Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalPortReferenceType(InternalPortReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Include File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Include File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsIncludeFileType(IsIncludeFileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Tools Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Tools Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageToolsType(LanguageToolsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageType(LanguageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageType1(LanguageType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftType(LeftType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftType1(LeftType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftType2(LeftType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Type11</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Type11</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftType11(LeftType11 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryRefType(LibraryRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linker Command File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linker Command File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkerCommandFileType(LinkerCommandFileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linker Flags Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linker Flags Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkerFlagsType(LinkerFlagsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linker Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linker Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkerType(LinkerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadConstraintType(LoadConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Memory Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Memory Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalMemoryMapType(LocalMemoryMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalNameType(LogicalNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalPortType(LogicalPortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Port Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Port Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalPortType1(LogicalPortType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mask Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mask Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaskType(MaskType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mask Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mask Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaskType1(MaskType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Master Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Master Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMasterType(MasterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maximum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maximum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaximumType(MaximumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Map Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Map Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryMapRefType(MemoryMapRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Maps Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Maps Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryMapsType(MemoryMapsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryMapType(MemoryMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Remap Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Remap Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryRemapType(MemoryRemapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minimum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minimum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinimumType(MinimumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mirrored Master Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mirrored Master Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMirroredMasterType(MirroredMasterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mirrored Slave Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mirrored Slave Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMirroredSlaveType(MirroredSlaveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mirrored System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mirrored System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMirroredSystemType(MirroredSystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Parameters Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelParametersType(ModelParametersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Parameters Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Parameters Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelParametersType1(ModelParametersType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelType(ModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitor Interconnection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitor Interconnection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitorInterconnectionType(MonitorInterconnectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitorType(MonitorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameType(NameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameType1(NameType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameType2(NameType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Value Pair Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Value Pair Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameValuePairType(NameValuePairType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Value Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Value Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameValueTypeType(NameValueTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Master Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Master Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnMasterType(OnMasterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Master Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Master Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnMasterType1(OnMasterType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Slave Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Slave Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnSlaveType(OnSlaveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Slave Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Slave Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnSlaveType1(OnSlaveType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnSystemType(OnSystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On System Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On System Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnSystemType1(OnSystemType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Clock Driver Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Clock Driver Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherClockDriverType(OtherClockDriverType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Clocks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Clocks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherClocks(OtherClocks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametersType(ParametersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametersType1(ParametersType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phase Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phase Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhaseType(PhaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalPortType(PhysicalPortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Port Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Port Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalPortType1(PhysicalPortType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Access Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Access Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortAccessType(PortAccessType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Declaration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Declaration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortDeclarationType(PortDeclarationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Maps Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Maps Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortMapsType(PortMapsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Maps Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Maps Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortMapsType1(PortMapsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortMapType(PortMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Map Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Map Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortMapType1(PortMapType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ports Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ports Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortsType(PortsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ports Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ports Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortsType1(PortsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ports Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ports Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortsType2(PortsType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Transactional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Transactional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortTransactionalType(PortTransactionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortType(PortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortType1(PortType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Wire Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Wire Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortWireType(PortWireType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifierType(QualifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualifier Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualifier Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifierType1(QualifierType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeType(RangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeType1(RangeType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeType2(RangeType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeType3(RangeType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisterFileType(RegisterFileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisterType(RegisterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remap Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remap Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemapAddressType(RemapAddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remap Ports Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remap Ports Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemapPortsType(RemapPortsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remap Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remap Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemapPortType(RemapPortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remap States Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remap States Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemapStatesType(RemapStatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remap State Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remap State Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemapStateType(RemapStateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replace Default Flags Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replace Default Flags Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplaceDefaultFlagsType(ReplaceDefaultFlagsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replace Default Flags Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replace Default Flags Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplaceDefaultFlagsType1(ReplaceDefaultFlagsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replace Default Flags Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replace Default Flags Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplaceDefaultFlagsType2(ReplaceDefaultFlagsType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requires Driver Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requires Driver Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiresDriverType(RequiresDriverType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResetType(ResetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reset Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResetType1(ResetType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolved Library Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolved Library Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolvedLibraryRefType(ResolvedLibraryRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightType(RightType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightType1(RightType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightType2(RightType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Type11</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Type11</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightType11(RightType11 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegmentsType(SegmentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegmentType(SegmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceType(ServiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceType1(ServiceType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Type Defs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Type Defs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceTypeDefsType(ServiceTypeDefsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Type Def Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Type Def Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceTypeDefType(ServiceTypeDefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Shot Driver Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Shot Driver Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleShotDriverType(SingleShotDriverType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Shot Duration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Shot Duration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleShotDurationType(SingleShotDurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Shot Offset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Shot Offset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleShotOffsetType(SingleShotOffsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Shot Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Shot Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleShotValueType(SingleShotValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSizeType(SizeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slave Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slave Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlaveType(SlaveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceFileType(SourceFileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceNameType(SourceNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subspace Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subspace Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubspaceRefType(SubspaceRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Group Names Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Group Names Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemGroupNamesType(SystemGroupNamesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemType(SystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetNameType(TargetNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Testable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Testable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestableType(TestableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingConstraintType(TimingConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transactional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transactional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionalType(TransactionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Methods Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Methods Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportMethodsType(TransportMethodsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trans Type Def Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trans Type Def Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransTypeDefType(TransTypeDefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeNameType(TypeNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Name Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Name Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeNameType1(TypeNameType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Name Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Name Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeNameType2(TypeNameType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Name Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Name Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeNameType3(TypeNameType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Mask Config Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Mask Config Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueMaskConfigType(ValueMaskConfigType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType1(ValueType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType2(ValueType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVectorType(VectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVectorType1(VectorType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVectorType2(VectorType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector Type11</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector Type11</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVectorType11(VectorType11 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vendor Extensions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vendor Extensions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVendorExtensionsType(VendorExtensionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Configuration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Configuration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewConfigurationType(ViewConfigurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Views Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Views Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewsType(ViewsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Views Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Views Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewsType1(ViewsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewType(ViewType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Whitebox Element Refs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Whitebox Element Refs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhiteboxElementRefsType(WhiteboxElementRefsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Whitebox Element Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Whitebox Element Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhiteboxElementRefType(WhiteboxElementRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Whitebox Elements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Whitebox Elements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhiteboxElementsType(WhiteboxElementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Whitebox Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Whitebox Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhiteboxElementType(WhiteboxElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Whitebox Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Whitebox Path Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhiteboxPathType(WhiteboxPathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Width Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Width Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidthType(WidthType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wire Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wire Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWireType(WireType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wire Type Defs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wire Type Defs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWireTypeDefsType(WireTypeDefsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wire Type Def Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wire Type Def Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWireTypeDefType(WireTypeDefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Value Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Value Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteValueConstraintType(WriteValueConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //_2009Switch
