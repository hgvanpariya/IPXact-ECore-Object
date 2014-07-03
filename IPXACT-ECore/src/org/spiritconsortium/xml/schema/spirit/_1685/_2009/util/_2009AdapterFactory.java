/**
 */
package org.spiritconsortium.xml.schema.spirit._1685._2009.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.spiritconsortium.xml.schema.spirit._1685._2009.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.spiritconsortium.xml.schema.spirit._1685._2009._2009Package
 * @generated
 */
public class _2009AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _2009Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _2009AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = _2009Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected _2009Switch<Adapter> modelSwitch =
		new _2009Switch<Adapter>() {
			@Override
			public Adapter caseAbstractionDefinitionType(AbstractionDefinitionType object) {
				return createAbstractionDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseAbstractionDefPortConstraintsType(AbstractionDefPortConstraintsType object) {
				return createAbstractionDefPortConstraintsTypeAdapter();
			}
			@Override
			public Adapter caseAbstractorBusInterfaceType(AbstractorBusInterfaceType object) {
				return createAbstractorBusInterfaceTypeAdapter();
			}
			@Override
			public Adapter caseAbstractorGeneratorsType(AbstractorGeneratorsType object) {
				return createAbstractorGeneratorsTypeAdapter();
			}
			@Override
			public Adapter caseAbstractorInterfacesType(AbstractorInterfacesType object) {
				return createAbstractorInterfacesTypeAdapter();
			}
			@Override
			public Adapter caseAbstractorModelType(AbstractorModelType object) {
				return createAbstractorModelTypeAdapter();
			}
			@Override
			public Adapter caseAbstractorModeType1(AbstractorModeType1 object) {
				return createAbstractorModeType1Adapter();
			}
			@Override
			public Adapter caseAbstractorPortType(AbstractorPortType object) {
				return createAbstractorPortTypeAdapter();
			}
			@Override
			public Adapter caseAbstractorPortWireType(AbstractorPortWireType object) {
				return createAbstractorPortWireTypeAdapter();
			}
			@Override
			public Adapter caseAbstractorsType(AbstractorsType object) {
				return createAbstractorsTypeAdapter();
			}
			@Override
			public Adapter caseAbstractorType(AbstractorType object) {
				return createAbstractorTypeAdapter();
			}
			@Override
			public Adapter caseAbstractorType1(AbstractorType1 object) {
				return createAbstractorType1Adapter();
			}
			@Override
			public Adapter caseAbstractorViewType(AbstractorViewType object) {
				return createAbstractorViewTypeAdapter();
			}
			@Override
			public Adapter caseAddressBankType(AddressBankType object) {
				return createAddressBankTypeAdapter();
			}
			@Override
			public Adapter caseAddressBlockType(AddressBlockType object) {
				return createAddressBlockTypeAdapter();
			}
			@Override
			public Adapter caseAddressOffsetType(AddressOffsetType object) {
				return createAddressOffsetTypeAdapter();
			}
			@Override
			public Adapter caseAddressSpaceRefType(AddressSpaceRefType object) {
				return createAddressSpaceRefTypeAdapter();
			}
			@Override
			public Adapter caseAddressSpacesType(AddressSpacesType object) {
				return createAddressSpacesTypeAdapter();
			}
			@Override
			public Adapter caseAddressSpaceType(AddressSpaceType object) {
				return createAddressSpaceTypeAdapter();
			}
			@Override
			public Adapter caseAddrSpaceRefType(AddrSpaceRefType object) {
				return createAddrSpaceRefTypeAdapter();
			}
			@Override
			public Adapter caseAdHocConnectionsType(AdHocConnectionsType object) {
				return createAdHocConnectionsTypeAdapter();
			}
			@Override
			public Adapter caseAdHocConnectionType(AdHocConnectionType object) {
				return createAdHocConnectionTypeAdapter();
			}
			@Override
			public Adapter caseAlternateGroupsType(AlternateGroupsType object) {
				return createAlternateGroupsTypeAdapter();
			}
			@Override
			public Adapter caseAlternateRegistersType(AlternateRegistersType object) {
				return createAlternateRegistersTypeAdapter();
			}
			@Override
			public Adapter caseAlternateRegisterType(AlternateRegisterType object) {
				return createAlternateRegisterTypeAdapter();
			}
			@Override
			public Adapter caseArgumentType(ArgumentType object) {
				return createArgumentTypeAdapter();
			}
			@Override
			public Adapter caseBankedBankType(BankedBankType object) {
				return createBankedBankTypeAdapter();
			}
			@Override
			public Adapter caseBankedBlockType(BankedBlockType object) {
				return createBankedBlockTypeAdapter();
			}
			@Override
			public Adapter caseBankedSubspaceType(BankedSubspaceType object) {
				return createBankedSubspaceTypeAdapter();
			}
			@Override
			public Adapter caseBaseAddressesType(BaseAddressesType object) {
				return createBaseAddressesTypeAdapter();
			}
			@Override
			public Adapter caseBaseAddressType(BaseAddressType object) {
				return createBaseAddressTypeAdapter();
			}
			@Override
			public Adapter caseBaseAddressType1(BaseAddressType1 object) {
				return createBaseAddressType1Adapter();
			}
			@Override
			public Adapter caseBitSteeringType1(BitSteeringType1 object) {
				return createBitSteeringType1Adapter();
			}
			@Override
			public Adapter caseBitWidthType(BitWidthType object) {
				return createBitWidthTypeAdapter();
			}
			@Override
			public Adapter caseBridgeType(BridgeType object) {
				return createBridgeTypeAdapter();
			}
			@Override
			public Adapter caseBuildCommandType(BuildCommandType object) {
				return createBuildCommandTypeAdapter();
			}
			@Override
			public Adapter caseBusDefinitionType(BusDefinitionType object) {
				return createBusDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseBusInterfacesType(BusInterfacesType object) {
				return createBusInterfacesTypeAdapter();
			}
			@Override
			public Adapter caseBusInterfaceType(BusInterfaceType object) {
				return createBusInterfaceTypeAdapter();
			}
			@Override
			public Adapter caseCellClassType(CellClassType object) {
				return createCellClassTypeAdapter();
			}
			@Override
			public Adapter caseCellFunctionType(CellFunctionType object) {
				return createCellFunctionTypeAdapter();
			}
			@Override
			public Adapter caseCellSpecificationType(CellSpecificationType object) {
				return createCellSpecificationTypeAdapter();
			}
			@Override
			public Adapter caseChannelsType(ChannelsType object) {
				return createChannelsTypeAdapter();
			}
			@Override
			public Adapter caseChannelType(ChannelType object) {
				return createChannelTypeAdapter();
			}
			@Override
			public Adapter caseChoicesType(ChoicesType object) {
				return createChoicesTypeAdapter();
			}
			@Override
			public Adapter caseChoiceType(ChoiceType object) {
				return createChoiceTypeAdapter();
			}
			@Override
			public Adapter caseClockDriverType(ClockDriverType object) {
				return createClockDriverTypeAdapter();
			}
			@Override
			public Adapter caseClockDriverType1(ClockDriverType1 object) {
				return createClockDriverType1Adapter();
			}
			@Override
			public Adapter caseClockPeriodType(ClockPeriodType object) {
				return createClockPeriodTypeAdapter();
			}
			@Override
			public Adapter caseClockPulseDurationType(ClockPulseDurationType object) {
				return createClockPulseDurationTypeAdapter();
			}
			@Override
			public Adapter caseClockPulseOffsetType(ClockPulseOffsetType object) {
				return createClockPulseOffsetTypeAdapter();
			}
			@Override
			public Adapter caseClockPulseValueType(ClockPulseValueType object) {
				return createClockPulseValueTypeAdapter();
			}
			@Override
			public Adapter caseCommandLineSwitchType(CommandLineSwitchType object) {
				return createCommandLineSwitchTypeAdapter();
			}
			@Override
			public Adapter caseCommandType(CommandType object) {
				return createCommandTypeAdapter();
			}
			@Override
			public Adapter caseCommandType1(CommandType1 object) {
				return createCommandType1Adapter();
			}
			@Override
			public Adapter caseCommandType2(CommandType2 object) {
				return createCommandType2Adapter();
			}
			@Override
			public Adapter caseComponentGeneratorsType(ComponentGeneratorsType object) {
				return createComponentGeneratorsTypeAdapter();
			}
			@Override
			public Adapter caseComponentGeneratorType(ComponentGeneratorType object) {
				return createComponentGeneratorTypeAdapter();
			}
			@Override
			public Adapter caseComponentInstancesType(ComponentInstancesType object) {
				return createComponentInstancesTypeAdapter();
			}
			@Override
			public Adapter caseComponentInstanceType(ComponentInstanceType object) {
				return createComponentInstanceTypeAdapter();
			}
			@Override
			public Adapter caseComponentType(ComponentType object) {
				return createComponentTypeAdapter();
			}
			@Override
			public Adapter caseConfigurableElementValuesType(ConfigurableElementValuesType object) {
				return createConfigurableElementValuesTypeAdapter();
			}
			@Override
			public Adapter caseConfigurableElementValueType(ConfigurableElementValueType object) {
				return createConfigurableElementValueTypeAdapter();
			}
			@Override
			public Adapter caseConnectionType(ConnectionType object) {
				return createConnectionTypeAdapter();
			}
			@Override
			public Adapter caseConstraintSetsType(ConstraintSetsType object) {
				return createConstraintSetsTypeAdapter();
			}
			@Override
			public Adapter caseConstraintSetType(ConstraintSetType object) {
				return createConstraintSetTypeAdapter();
			}
			@Override
			public Adapter caseCpusType(CpusType object) {
				return createCpusTypeAdapter();
			}
			@Override
			public Adapter caseCpuType(CpuType object) {
				return createCpuTypeAdapter();
			}
			@Override
			public Adapter caseDefaultValueType(DefaultValueType object) {
				return createDefaultValueTypeAdapter();
			}
			@Override
			public Adapter caseDesignConfigurationType(DesignConfigurationType object) {
				return createDesignConfigurationTypeAdapter();
			}
			@Override
			public Adapter caseDesignType(DesignType object) {
				return createDesignTypeAdapter();
			}
			@Override
			public Adapter caseDisabledType(DisabledType object) {
				return createDisabledTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDriveConstraintType(DriveConstraintType object) {
				return createDriveConstraintTypeAdapter();
			}
			@Override
			public Adapter caseDriverType(DriverType object) {
				return createDriverTypeAdapter();
			}
			@Override
			public Adapter caseEnableType(EnableType object) {
				return createEnableTypeAdapter();
			}
			@Override
			public Adapter caseEnumeratedValuesType(EnumeratedValuesType object) {
				return createEnumeratedValuesTypeAdapter();
			}
			@Override
			public Adapter caseEnumeratedValueType(EnumeratedValueType object) {
				return createEnumeratedValueTypeAdapter();
			}
			@Override
			public Adapter caseEnumerationType(EnumerationType object) {
				return createEnumerationTypeAdapter();
			}
			@Override
			public Adapter caseExecutableImageType(ExecutableImageType object) {
				return createExecutableImageTypeAdapter();
			}
			@Override
			public Adapter caseExternalPortReferenceType(ExternalPortReferenceType object) {
				return createExternalPortReferenceTypeAdapter();
			}
			@Override
			public Adapter caseFieldType(FieldType object) {
				return createFieldTypeAdapter();
			}
			@Override
			public Adapter caseFileBuilderType(FileBuilderType object) {
				return createFileBuilderTypeAdapter();
			}
			@Override
			public Adapter caseFileBuilderType1(FileBuilderType1 object) {
				return createFileBuilderType1Adapter();
			}
			@Override
			public Adapter caseFileSetRefGroupType(FileSetRefGroupType object) {
				return createFileSetRefGroupTypeAdapter();
			}
			@Override
			public Adapter caseFileSetRefGroupType1(FileSetRefGroupType1 object) {
				return createFileSetRefGroupType1Adapter();
			}
			@Override
			public Adapter caseFileSetRefType(FileSetRefType object) {
				return createFileSetRefTypeAdapter();
			}
			@Override
			public Adapter caseFileSetsType(FileSetsType object) {
				return createFileSetsTypeAdapter();
			}
			@Override
			public Adapter caseFileSetType(FileSetType object) {
				return createFileSetTypeAdapter();
			}
			@Override
			public Adapter caseFileType(FileType object) {
				return createFileTypeAdapter();
			}
			@Override
			public Adapter caseFlagsType(FlagsType object) {
				return createFlagsTypeAdapter();
			}
			@Override
			public Adapter caseFlagsType1(FlagsType1 object) {
				return createFlagsType1Adapter();
			}
			@Override
			public Adapter caseFlagsType2(FlagsType2 object) {
				return createFlagsType2Adapter();
			}
			@Override
			public Adapter caseFunctionType(FunctionType object) {
				return createFunctionTypeAdapter();
			}
			@Override
			public Adapter caseGeneratorChainConfigurationType(GeneratorChainConfigurationType object) {
				return createGeneratorChainConfigurationTypeAdapter();
			}
			@Override
			public Adapter caseGeneratorChainSelectorType(GeneratorChainSelectorType object) {
				return createGeneratorChainSelectorTypeAdapter();
			}
			@Override
			public Adapter caseGeneratorChainType(GeneratorChainType object) {
				return createGeneratorChainTypeAdapter();
			}
			@Override
			public Adapter caseGeneratorSelectorType(GeneratorSelectorType object) {
				return createGeneratorSelectorTypeAdapter();
			}
			@Override
			public Adapter caseGeneratorType(GeneratorType object) {
				return createGeneratorTypeAdapter();
			}
			@Override
			public Adapter caseGeneratorType1(GeneratorType1 object) {
				return createGeneratorType1Adapter();
			}
			@Override
			public Adapter caseGroupSelectorType(GroupSelectorType object) {
				return createGroupSelectorTypeAdapter();
			}
			@Override
			public Adapter caseHierConnectionsType(HierConnectionsType object) {
				return createHierConnectionsTypeAdapter();
			}
			@Override
			public Adapter caseHierConnectionType(HierConnectionType object) {
				return createHierConnectionTypeAdapter();
			}
			@Override
			public Adapter caseHierInterface(HierInterface object) {
				return createHierInterfaceAdapter();
			}
			@Override
			public Adapter caseInstanceGeneratorType(InstanceGeneratorType object) {
				return createInstanceGeneratorTypeAdapter();
			}
			@Override
			public Adapter caseInterconnectionConfigurationType(InterconnectionConfigurationType object) {
				return createInterconnectionConfigurationTypeAdapter();
			}
			@Override
			public Adapter caseInterconnectionsType(InterconnectionsType object) {
				return createInterconnectionsTypeAdapter();
			}
			@Override
			public Adapter caseInterconnectionType(InterconnectionType object) {
				return createInterconnectionTypeAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseInternalPortReferenceType(InternalPortReferenceType object) {
				return createInternalPortReferenceTypeAdapter();
			}
			@Override
			public Adapter caseIsIncludeFileType(IsIncludeFileType object) {
				return createIsIncludeFileTypeAdapter();
			}
			@Override
			public Adapter caseLanguageToolsType(LanguageToolsType object) {
				return createLanguageToolsTypeAdapter();
			}
			@Override
			public Adapter caseLanguageType(LanguageType object) {
				return createLanguageTypeAdapter();
			}
			@Override
			public Adapter caseLanguageType1(LanguageType1 object) {
				return createLanguageType1Adapter();
			}
			@Override
			public Adapter caseLeftType(LeftType object) {
				return createLeftTypeAdapter();
			}
			@Override
			public Adapter caseLeftType1(LeftType1 object) {
				return createLeftType1Adapter();
			}
			@Override
			public Adapter caseLeftType2(LeftType2 object) {
				return createLeftType2Adapter();
			}
			@Override
			public Adapter caseLeftType11(LeftType11 object) {
				return createLeftType11Adapter();
			}
			@Override
			public Adapter caseLibraryRefType(LibraryRefType object) {
				return createLibraryRefTypeAdapter();
			}
			@Override
			public Adapter caseLinkerCommandFileType(LinkerCommandFileType object) {
				return createLinkerCommandFileTypeAdapter();
			}
			@Override
			public Adapter caseLinkerFlagsType(LinkerFlagsType object) {
				return createLinkerFlagsTypeAdapter();
			}
			@Override
			public Adapter caseLinkerType(LinkerType object) {
				return createLinkerTypeAdapter();
			}
			@Override
			public Adapter caseLoadConstraintType(LoadConstraintType object) {
				return createLoadConstraintTypeAdapter();
			}
			@Override
			public Adapter caseLocalMemoryMapType(LocalMemoryMapType object) {
				return createLocalMemoryMapTypeAdapter();
			}
			@Override
			public Adapter caseLogicalNameType(LogicalNameType object) {
				return createLogicalNameTypeAdapter();
			}
			@Override
			public Adapter caseLogicalPortType(LogicalPortType object) {
				return createLogicalPortTypeAdapter();
			}
			@Override
			public Adapter caseLogicalPortType1(LogicalPortType1 object) {
				return createLogicalPortType1Adapter();
			}
			@Override
			public Adapter caseMaskType(MaskType object) {
				return createMaskTypeAdapter();
			}
			@Override
			public Adapter caseMaskType1(MaskType1 object) {
				return createMaskType1Adapter();
			}
			@Override
			public Adapter caseMasterType(MasterType object) {
				return createMasterTypeAdapter();
			}
			@Override
			public Adapter caseMaximumType(MaximumType object) {
				return createMaximumTypeAdapter();
			}
			@Override
			public Adapter caseMemoryMapRefType(MemoryMapRefType object) {
				return createMemoryMapRefTypeAdapter();
			}
			@Override
			public Adapter caseMemoryMapsType(MemoryMapsType object) {
				return createMemoryMapsTypeAdapter();
			}
			@Override
			public Adapter caseMemoryMapType(MemoryMapType object) {
				return createMemoryMapTypeAdapter();
			}
			@Override
			public Adapter caseMemoryRemapType(MemoryRemapType object) {
				return createMemoryRemapTypeAdapter();
			}
			@Override
			public Adapter caseMinimumType(MinimumType object) {
				return createMinimumTypeAdapter();
			}
			@Override
			public Adapter caseMirroredMasterType(MirroredMasterType object) {
				return createMirroredMasterTypeAdapter();
			}
			@Override
			public Adapter caseMirroredSlaveType(MirroredSlaveType object) {
				return createMirroredSlaveTypeAdapter();
			}
			@Override
			public Adapter caseMirroredSystemType(MirroredSystemType object) {
				return createMirroredSystemTypeAdapter();
			}
			@Override
			public Adapter caseModelParametersType(ModelParametersType object) {
				return createModelParametersTypeAdapter();
			}
			@Override
			public Adapter caseModelParametersType1(ModelParametersType1 object) {
				return createModelParametersType1Adapter();
			}
			@Override
			public Adapter caseModelType(ModelType object) {
				return createModelTypeAdapter();
			}
			@Override
			public Adapter caseMonitorInterconnectionType(MonitorInterconnectionType object) {
				return createMonitorInterconnectionTypeAdapter();
			}
			@Override
			public Adapter caseMonitorType(MonitorType object) {
				return createMonitorTypeAdapter();
			}
			@Override
			public Adapter caseNameType(NameType object) {
				return createNameTypeAdapter();
			}
			@Override
			public Adapter caseNameType1(NameType1 object) {
				return createNameType1Adapter();
			}
			@Override
			public Adapter caseNameType2(NameType2 object) {
				return createNameType2Adapter();
			}
			@Override
			public Adapter caseNameValuePairType(NameValuePairType object) {
				return createNameValuePairTypeAdapter();
			}
			@Override
			public Adapter caseNameValueTypeType(NameValueTypeType object) {
				return createNameValueTypeTypeAdapter();
			}
			@Override
			public Adapter caseOnMasterType(OnMasterType object) {
				return createOnMasterTypeAdapter();
			}
			@Override
			public Adapter caseOnMasterType1(OnMasterType1 object) {
				return createOnMasterType1Adapter();
			}
			@Override
			public Adapter caseOnSlaveType(OnSlaveType object) {
				return createOnSlaveTypeAdapter();
			}
			@Override
			public Adapter caseOnSlaveType1(OnSlaveType1 object) {
				return createOnSlaveType1Adapter();
			}
			@Override
			public Adapter caseOnSystemType(OnSystemType object) {
				return createOnSystemTypeAdapter();
			}
			@Override
			public Adapter caseOnSystemType1(OnSystemType1 object) {
				return createOnSystemType1Adapter();
			}
			@Override
			public Adapter caseOtherClockDriverType(OtherClockDriverType object) {
				return createOtherClockDriverTypeAdapter();
			}
			@Override
			public Adapter caseOtherClocks(OtherClocks object) {
				return createOtherClocksAdapter();
			}
			@Override
			public Adapter caseParametersType(ParametersType object) {
				return createParametersTypeAdapter();
			}
			@Override
			public Adapter caseParametersType1(ParametersType1 object) {
				return createParametersType1Adapter();
			}
			@Override
			public Adapter casePhaseType(PhaseType object) {
				return createPhaseTypeAdapter();
			}
			@Override
			public Adapter casePhysicalPortType(PhysicalPortType object) {
				return createPhysicalPortTypeAdapter();
			}
			@Override
			public Adapter casePhysicalPortType1(PhysicalPortType1 object) {
				return createPhysicalPortType1Adapter();
			}
			@Override
			public Adapter casePortAccessType(PortAccessType object) {
				return createPortAccessTypeAdapter();
			}
			@Override
			public Adapter casePortDeclarationType(PortDeclarationType object) {
				return createPortDeclarationTypeAdapter();
			}
			@Override
			public Adapter casePortMapsType(PortMapsType object) {
				return createPortMapsTypeAdapter();
			}
			@Override
			public Adapter casePortMapsType1(PortMapsType1 object) {
				return createPortMapsType1Adapter();
			}
			@Override
			public Adapter casePortMapType(PortMapType object) {
				return createPortMapTypeAdapter();
			}
			@Override
			public Adapter casePortMapType1(PortMapType1 object) {
				return createPortMapType1Adapter();
			}
			@Override
			public Adapter casePortsType(PortsType object) {
				return createPortsTypeAdapter();
			}
			@Override
			public Adapter casePortsType1(PortsType1 object) {
				return createPortsType1Adapter();
			}
			@Override
			public Adapter casePortsType2(PortsType2 object) {
				return createPortsType2Adapter();
			}
			@Override
			public Adapter casePortTransactionalType(PortTransactionalType object) {
				return createPortTransactionalTypeAdapter();
			}
			@Override
			public Adapter casePortType(PortType object) {
				return createPortTypeAdapter();
			}
			@Override
			public Adapter casePortType1(PortType1 object) {
				return createPortType1Adapter();
			}
			@Override
			public Adapter casePortWireType(PortWireType object) {
				return createPortWireTypeAdapter();
			}
			@Override
			public Adapter caseQualifierType(QualifierType object) {
				return createQualifierTypeAdapter();
			}
			@Override
			public Adapter caseQualifierType1(QualifierType1 object) {
				return createQualifierType1Adapter();
			}
			@Override
			public Adapter caseRangeType(RangeType object) {
				return createRangeTypeAdapter();
			}
			@Override
			public Adapter caseRangeType1(RangeType1 object) {
				return createRangeType1Adapter();
			}
			@Override
			public Adapter caseRangeType2(RangeType2 object) {
				return createRangeType2Adapter();
			}
			@Override
			public Adapter caseRangeType3(RangeType3 object) {
				return createRangeType3Adapter();
			}
			@Override
			public Adapter caseRegisterFileType(RegisterFileType object) {
				return createRegisterFileTypeAdapter();
			}
			@Override
			public Adapter caseRegisterType(RegisterType object) {
				return createRegisterTypeAdapter();
			}
			@Override
			public Adapter caseRemapAddressType(RemapAddressType object) {
				return createRemapAddressTypeAdapter();
			}
			@Override
			public Adapter caseRemapPortsType(RemapPortsType object) {
				return createRemapPortsTypeAdapter();
			}
			@Override
			public Adapter caseRemapPortType(RemapPortType object) {
				return createRemapPortTypeAdapter();
			}
			@Override
			public Adapter caseRemapStatesType(RemapStatesType object) {
				return createRemapStatesTypeAdapter();
			}
			@Override
			public Adapter caseRemapStateType(RemapStateType object) {
				return createRemapStateTypeAdapter();
			}
			@Override
			public Adapter caseReplaceDefaultFlagsType(ReplaceDefaultFlagsType object) {
				return createReplaceDefaultFlagsTypeAdapter();
			}
			@Override
			public Adapter caseReplaceDefaultFlagsType1(ReplaceDefaultFlagsType1 object) {
				return createReplaceDefaultFlagsType1Adapter();
			}
			@Override
			public Adapter caseReplaceDefaultFlagsType2(ReplaceDefaultFlagsType2 object) {
				return createReplaceDefaultFlagsType2Adapter();
			}
			@Override
			public Adapter caseRequiresDriverType(RequiresDriverType object) {
				return createRequiresDriverTypeAdapter();
			}
			@Override
			public Adapter caseResetType(ResetType object) {
				return createResetTypeAdapter();
			}
			@Override
			public Adapter caseResetType1(ResetType1 object) {
				return createResetType1Adapter();
			}
			@Override
			public Adapter caseResolvedLibraryRefType(ResolvedLibraryRefType object) {
				return createResolvedLibraryRefTypeAdapter();
			}
			@Override
			public Adapter caseRightType(RightType object) {
				return createRightTypeAdapter();
			}
			@Override
			public Adapter caseRightType1(RightType1 object) {
				return createRightType1Adapter();
			}
			@Override
			public Adapter caseRightType2(RightType2 object) {
				return createRightType2Adapter();
			}
			@Override
			public Adapter caseRightType11(RightType11 object) {
				return createRightType11Adapter();
			}
			@Override
			public Adapter caseSegmentsType(SegmentsType object) {
				return createSegmentsTypeAdapter();
			}
			@Override
			public Adapter caseSegmentType(SegmentType object) {
				return createSegmentTypeAdapter();
			}
			@Override
			public Adapter caseServiceType(ServiceType object) {
				return createServiceTypeAdapter();
			}
			@Override
			public Adapter caseServiceType1(ServiceType1 object) {
				return createServiceType1Adapter();
			}
			@Override
			public Adapter caseServiceTypeDefsType(ServiceTypeDefsType object) {
				return createServiceTypeDefsTypeAdapter();
			}
			@Override
			public Adapter caseServiceTypeDefType(ServiceTypeDefType object) {
				return createServiceTypeDefTypeAdapter();
			}
			@Override
			public Adapter caseSingleShotDriverType(SingleShotDriverType object) {
				return createSingleShotDriverTypeAdapter();
			}
			@Override
			public Adapter caseSingleShotDurationType(SingleShotDurationType object) {
				return createSingleShotDurationTypeAdapter();
			}
			@Override
			public Adapter caseSingleShotOffsetType(SingleShotOffsetType object) {
				return createSingleShotOffsetTypeAdapter();
			}
			@Override
			public Adapter caseSingleShotValueType(SingleShotValueType object) {
				return createSingleShotValueTypeAdapter();
			}
			@Override
			public Adapter caseSizeType(SizeType object) {
				return createSizeTypeAdapter();
			}
			@Override
			public Adapter caseSlaveType(SlaveType object) {
				return createSlaveTypeAdapter();
			}
			@Override
			public Adapter caseSourceFileType(SourceFileType object) {
				return createSourceFileTypeAdapter();
			}
			@Override
			public Adapter caseSourceNameType(SourceNameType object) {
				return createSourceNameTypeAdapter();
			}
			@Override
			public Adapter caseSubspaceRefType(SubspaceRefType object) {
				return createSubspaceRefTypeAdapter();
			}
			@Override
			public Adapter caseSystemGroupNamesType(SystemGroupNamesType object) {
				return createSystemGroupNamesTypeAdapter();
			}
			@Override
			public Adapter caseSystemType(SystemType object) {
				return createSystemTypeAdapter();
			}
			@Override
			public Adapter caseTargetNameType(TargetNameType object) {
				return createTargetNameTypeAdapter();
			}
			@Override
			public Adapter caseTestableType(TestableType object) {
				return createTestableTypeAdapter();
			}
			@Override
			public Adapter caseTimingConstraintType(TimingConstraintType object) {
				return createTimingConstraintTypeAdapter();
			}
			@Override
			public Adapter caseTransactionalType(TransactionalType object) {
				return createTransactionalTypeAdapter();
			}
			@Override
			public Adapter caseTransportMethodsType(TransportMethodsType object) {
				return createTransportMethodsTypeAdapter();
			}
			@Override
			public Adapter caseTransTypeDefType(TransTypeDefType object) {
				return createTransTypeDefTypeAdapter();
			}
			@Override
			public Adapter caseTypeNameType(TypeNameType object) {
				return createTypeNameTypeAdapter();
			}
			@Override
			public Adapter caseTypeNameType1(TypeNameType1 object) {
				return createTypeNameType1Adapter();
			}
			@Override
			public Adapter caseTypeNameType2(TypeNameType2 object) {
				return createTypeNameType2Adapter();
			}
			@Override
			public Adapter caseTypeNameType3(TypeNameType3 object) {
				return createTypeNameType3Adapter();
			}
			@Override
			public Adapter caseValueMaskConfigType(ValueMaskConfigType object) {
				return createValueMaskConfigTypeAdapter();
			}
			@Override
			public Adapter caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			@Override
			public Adapter caseValueType1(ValueType1 object) {
				return createValueType1Adapter();
			}
			@Override
			public Adapter caseValueType2(ValueType2 object) {
				return createValueType2Adapter();
			}
			@Override
			public Adapter caseVectorType(VectorType object) {
				return createVectorTypeAdapter();
			}
			@Override
			public Adapter caseVectorType1(VectorType1 object) {
				return createVectorType1Adapter();
			}
			@Override
			public Adapter caseVectorType2(VectorType2 object) {
				return createVectorType2Adapter();
			}
			@Override
			public Adapter caseVectorType11(VectorType11 object) {
				return createVectorType11Adapter();
			}
			@Override
			public Adapter caseVendorExtensionsType(VendorExtensionsType object) {
				return createVendorExtensionsTypeAdapter();
			}
			@Override
			public Adapter caseViewConfigurationType(ViewConfigurationType object) {
				return createViewConfigurationTypeAdapter();
			}
			@Override
			public Adapter caseViewsType(ViewsType object) {
				return createViewsTypeAdapter();
			}
			@Override
			public Adapter caseViewsType1(ViewsType1 object) {
				return createViewsType1Adapter();
			}
			@Override
			public Adapter caseViewType(ViewType object) {
				return createViewTypeAdapter();
			}
			@Override
			public Adapter caseWhiteboxElementRefsType(WhiteboxElementRefsType object) {
				return createWhiteboxElementRefsTypeAdapter();
			}
			@Override
			public Adapter caseWhiteboxElementRefType(WhiteboxElementRefType object) {
				return createWhiteboxElementRefTypeAdapter();
			}
			@Override
			public Adapter caseWhiteboxElementsType(WhiteboxElementsType object) {
				return createWhiteboxElementsTypeAdapter();
			}
			@Override
			public Adapter caseWhiteboxElementType(WhiteboxElementType object) {
				return createWhiteboxElementTypeAdapter();
			}
			@Override
			public Adapter caseWhiteboxPathType(WhiteboxPathType object) {
				return createWhiteboxPathTypeAdapter();
			}
			@Override
			public Adapter caseWidthType(WidthType object) {
				return createWidthTypeAdapter();
			}
			@Override
			public Adapter caseWireType(WireType object) {
				return createWireTypeAdapter();
			}
			@Override
			public Adapter caseWireTypeDefsType(WireTypeDefsType object) {
				return createWireTypeDefsTypeAdapter();
			}
			@Override
			public Adapter caseWireTypeDefType(WireTypeDefType object) {
				return createWireTypeDefTypeAdapter();
			}
			@Override
			public Adapter caseWriteValueConstraintType(WriteValueConstraintType object) {
				return createWriteValueConstraintTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractionDefinitionType <em>Abstraction Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractionDefinitionType
	 * @generated
	 */
	public Adapter createAbstractionDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractionDefPortConstraintsType <em>Abstraction Def Port Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractionDefPortConstraintsType
	 * @generated
	 */
	public Adapter createAbstractionDefPortConstraintsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorBusInterfaceType <em>Abstractor Bus Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorBusInterfaceType
	 * @generated
	 */
	public Adapter createAbstractorBusInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorGeneratorsType <em>Abstractor Generators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorGeneratorsType
	 * @generated
	 */
	public Adapter createAbstractorGeneratorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorInterfacesType <em>Abstractor Interfaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorInterfacesType
	 * @generated
	 */
	public Adapter createAbstractorInterfacesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorModelType <em>Abstractor Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorModelType
	 * @generated
	 */
	public Adapter createAbstractorModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorModeType1 <em>Abstractor Mode Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorModeType1
	 * @generated
	 */
	public Adapter createAbstractorModeType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorPortType <em>Abstractor Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorPortType
	 * @generated
	 */
	public Adapter createAbstractorPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorPortWireType <em>Abstractor Port Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorPortWireType
	 * @generated
	 */
	public Adapter createAbstractorPortWireTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorsType <em>Abstractors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorsType
	 * @generated
	 */
	public Adapter createAbstractorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType <em>Abstractor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType
	 * @generated
	 */
	public Adapter createAbstractorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1 <em>Abstractor Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorType1
	 * @generated
	 */
	public Adapter createAbstractorType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorViewType <em>Abstractor View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AbstractorViewType
	 * @generated
	 */
	public Adapter createAbstractorViewTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AddressBankType <em>Address Bank Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AddressBankType
	 * @generated
	 */
	public Adapter createAddressBankTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AddressBlockType <em>Address Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AddressBlockType
	 * @generated
	 */
	public Adapter createAddressBlockTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AddressOffsetType <em>Address Offset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AddressOffsetType
	 * @generated
	 */
	public Adapter createAddressOffsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AddressSpaceRefType <em>Address Space Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AddressSpaceRefType
	 * @generated
	 */
	public Adapter createAddressSpaceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AddressSpacesType <em>Address Spaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AddressSpacesType
	 * @generated
	 */
	public Adapter createAddressSpacesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AddressSpaceType <em>Address Space Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AddressSpaceType
	 * @generated
	 */
	public Adapter createAddressSpaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AddrSpaceRefType <em>Addr Space Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AddrSpaceRefType
	 * @generated
	 */
	public Adapter createAddrSpaceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AdHocConnectionsType <em>Ad Hoc Connections Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AdHocConnectionsType
	 * @generated
	 */
	public Adapter createAdHocConnectionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AdHocConnectionType <em>Ad Hoc Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AdHocConnectionType
	 * @generated
	 */
	public Adapter createAdHocConnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AlternateGroupsType <em>Alternate Groups Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AlternateGroupsType
	 * @generated
	 */
	public Adapter createAlternateGroupsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AlternateRegistersType <em>Alternate Registers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AlternateRegistersType
	 * @generated
	 */
	public Adapter createAlternateRegistersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.AlternateRegisterType <em>Alternate Register Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.AlternateRegisterType
	 * @generated
	 */
	public Adapter createAlternateRegisterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ArgumentType <em>Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ArgumentType
	 * @generated
	 */
	public Adapter createArgumentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BankedBankType <em>Banked Bank Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.BankedBankType
	 * @generated
	 */
	public Adapter createBankedBankTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BankedBlockType <em>Banked Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.BankedBlockType
	 * @generated
	 */
	public Adapter createBankedBlockTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BankedSubspaceType <em>Banked Subspace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.BankedSubspaceType
	 * @generated
	 */
	public Adapter createBankedSubspaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BaseAddressesType <em>Base Addresses Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.BaseAddressesType
	 * @generated
	 */
	public Adapter createBaseAddressesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BaseAddressType <em>Base Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.BaseAddressType
	 * @generated
	 */
	public Adapter createBaseAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BaseAddressType1 <em>Base Address Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.BaseAddressType1
	 * @generated
	 */
	public Adapter createBaseAddressType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BitSteeringType1 <em>Bit Steering Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.BitSteeringType1
	 * @generated
	 */
	public Adapter createBitSteeringType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BitWidthType <em>Bit Width Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.BitWidthType
	 * @generated
	 */
	public Adapter createBitWidthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BridgeType <em>Bridge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.BridgeType
	 * @generated
	 */
	public Adapter createBridgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BuildCommandType <em>Build Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.BuildCommandType
	 * @generated
	 */
	public Adapter createBuildCommandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType <em>Bus Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.BusDefinitionType
	 * @generated
	 */
	public Adapter createBusDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfacesType <em>Bus Interfaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfacesType
	 * @generated
	 */
	public Adapter createBusInterfacesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType <em>Bus Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.BusInterfaceType
	 * @generated
	 */
	public Adapter createBusInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.CellClassType <em>Cell Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.CellClassType
	 * @generated
	 */
	public Adapter createCellClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.CellFunctionType <em>Cell Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.CellFunctionType
	 * @generated
	 */
	public Adapter createCellFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.CellSpecificationType <em>Cell Specification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.CellSpecificationType
	 * @generated
	 */
	public Adapter createCellSpecificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ChannelsType <em>Channels Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ChannelsType
	 * @generated
	 */
	public Adapter createChannelsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ChannelType <em>Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ChannelType
	 * @generated
	 */
	public Adapter createChannelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ChoicesType <em>Choices Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ChoicesType
	 * @generated
	 */
	public Adapter createChoicesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ChoiceType <em>Choice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ChoiceType
	 * @generated
	 */
	public Adapter createChoiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ClockDriverType <em>Clock Driver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ClockDriverType
	 * @generated
	 */
	public Adapter createClockDriverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ClockDriverType1 <em>Clock Driver Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ClockDriverType1
	 * @generated
	 */
	public Adapter createClockDriverType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ClockPeriodType <em>Clock Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ClockPeriodType
	 * @generated
	 */
	public Adapter createClockPeriodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ClockPulseDurationType <em>Clock Pulse Duration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ClockPulseDurationType
	 * @generated
	 */
	public Adapter createClockPulseDurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ClockPulseOffsetType <em>Clock Pulse Offset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ClockPulseOffsetType
	 * @generated
	 */
	public Adapter createClockPulseOffsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ClockPulseValueType <em>Clock Pulse Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ClockPulseValueType
	 * @generated
	 */
	public Adapter createClockPulseValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.CommandLineSwitchType <em>Command Line Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.CommandLineSwitchType
	 * @generated
	 */
	public Adapter createCommandLineSwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.CommandType <em>Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.CommandType
	 * @generated
	 */
	public Adapter createCommandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.CommandType1 <em>Command Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.CommandType1
	 * @generated
	 */
	public Adapter createCommandType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.CommandType2 <em>Command Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.CommandType2
	 * @generated
	 */
	public Adapter createCommandType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentGeneratorsType <em>Component Generators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentGeneratorsType
	 * @generated
	 */
	public Adapter createComponentGeneratorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentGeneratorType <em>Component Generator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentGeneratorType
	 * @generated
	 */
	public Adapter createComponentGeneratorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentInstancesType <em>Component Instances Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentInstancesType
	 * @generated
	 */
	public Adapter createComponentInstancesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentInstanceType <em>Component Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentInstanceType
	 * @generated
	 */
	public Adapter createComponentInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ComponentType
	 * @generated
	 */
	public Adapter createComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConfigurableElementValuesType <em>Configurable Element Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ConfigurableElementValuesType
	 * @generated
	 */
	public Adapter createConfigurableElementValuesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConfigurableElementValueType <em>Configurable Element Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ConfigurableElementValueType
	 * @generated
	 */
	public Adapter createConfigurableElementValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ConnectionType
	 * @generated
	 */
	public Adapter createConnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetsType <em>Constraint Sets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetsType
	 * @generated
	 */
	public Adapter createConstraintSetsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetType <em>Constraint Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ConstraintSetType
	 * @generated
	 */
	public Adapter createConstraintSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.CpusType <em>Cpus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.CpusType
	 * @generated
	 */
	public Adapter createCpusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.CpuType <em>Cpu Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.CpuType
	 * @generated
	 */
	public Adapter createCpuTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DefaultValueType <em>Default Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.DefaultValueType
	 * @generated
	 */
	public Adapter createDefaultValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DesignConfigurationType <em>Design Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.DesignConfigurationType
	 * @generated
	 */
	public Adapter createDesignConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType <em>Design Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.DesignType
	 * @generated
	 */
	public Adapter createDesignTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DisabledType <em>Disabled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.DisabledType
	 * @generated
	 */
	public Adapter createDisabledTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DriveConstraintType <em>Drive Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.DriveConstraintType
	 * @generated
	 */
	public Adapter createDriveConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.DriverType <em>Driver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.DriverType
	 * @generated
	 */
	public Adapter createDriverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.EnableType <em>Enable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.EnableType
	 * @generated
	 */
	public Adapter createEnableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.EnumeratedValuesType <em>Enumerated Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.EnumeratedValuesType
	 * @generated
	 */
	public Adapter createEnumeratedValuesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.EnumeratedValueType <em>Enumerated Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.EnumeratedValueType
	 * @generated
	 */
	public Adapter createEnumeratedValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.EnumerationType
	 * @generated
	 */
	public Adapter createEnumerationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ExecutableImageType <em>Executable Image Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ExecutableImageType
	 * @generated
	 */
	public Adapter createExecutableImageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ExternalPortReferenceType <em>External Port Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ExternalPortReferenceType
	 * @generated
	 */
	public Adapter createExternalPortReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.FieldType
	 * @generated
	 */
	public Adapter createFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType <em>File Builder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType
	 * @generated
	 */
	public Adapter createFileBuilderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType1 <em>File Builder Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.FileBuilderType1
	 * @generated
	 */
	public Adapter createFileBuilderType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetRefGroupType <em>File Set Ref Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetRefGroupType
	 * @generated
	 */
	public Adapter createFileSetRefGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetRefGroupType1 <em>File Set Ref Group Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetRefGroupType1
	 * @generated
	 */
	public Adapter createFileSetRefGroupType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetRefType <em>File Set Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetRefType
	 * @generated
	 */
	public Adapter createFileSetRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetsType <em>File Sets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetsType
	 * @generated
	 */
	public Adapter createFileSetsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetType <em>File Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.FileSetType
	 * @generated
	 */
	public Adapter createFileSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.FileType
	 * @generated
	 */
	public Adapter createFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FlagsType <em>Flags Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.FlagsType
	 * @generated
	 */
	public Adapter createFlagsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FlagsType1 <em>Flags Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.FlagsType1
	 * @generated
	 */
	public Adapter createFlagsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FlagsType2 <em>Flags Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.FlagsType2
	 * @generated
	 */
	public Adapter createFlagsType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.FunctionType
	 * @generated
	 */
	public Adapter createFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainConfigurationType <em>Generator Chain Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainConfigurationType
	 * @generated
	 */
	public Adapter createGeneratorChainConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainSelectorType <em>Generator Chain Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainSelectorType
	 * @generated
	 */
	public Adapter createGeneratorChainSelectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainType <em>Generator Chain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorChainType
	 * @generated
	 */
	public Adapter createGeneratorChainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorSelectorType <em>Generator Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorSelectorType
	 * @generated
	 */
	public Adapter createGeneratorSelectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorType <em>Generator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorType
	 * @generated
	 */
	public Adapter createGeneratorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorType1 <em>Generator Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.GeneratorType1
	 * @generated
	 */
	public Adapter createGeneratorType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.GroupSelectorType <em>Group Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.GroupSelectorType
	 * @generated
	 */
	public Adapter createGroupSelectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.HierConnectionsType <em>Hier Connections Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.HierConnectionsType
	 * @generated
	 */
	public Adapter createHierConnectionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.HierConnectionType <em>Hier Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.HierConnectionType
	 * @generated
	 */
	public Adapter createHierConnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.HierInterface <em>Hier Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.HierInterface
	 * @generated
	 */
	public Adapter createHierInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.InstanceGeneratorType <em>Instance Generator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.InstanceGeneratorType
	 * @generated
	 */
	public Adapter createInstanceGeneratorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.InterconnectionConfigurationType <em>Interconnection Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.InterconnectionConfigurationType
	 * @generated
	 */
	public Adapter createInterconnectionConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.InterconnectionsType <em>Interconnections Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.InterconnectionsType
	 * @generated
	 */
	public Adapter createInterconnectionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.InterconnectionType <em>Interconnection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.InterconnectionType
	 * @generated
	 */
	public Adapter createInterconnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.InternalPortReferenceType <em>Internal Port Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.InternalPortReferenceType
	 * @generated
	 */
	public Adapter createInternalPortReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.IsIncludeFileType <em>Is Include File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.IsIncludeFileType
	 * @generated
	 */
	public Adapter createIsIncludeFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LanguageToolsType <em>Language Tools Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.LanguageToolsType
	 * @generated
	 */
	public Adapter createLanguageToolsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LanguageType <em>Language Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.LanguageType
	 * @generated
	 */
	public Adapter createLanguageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LanguageType1 <em>Language Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.LanguageType1
	 * @generated
	 */
	public Adapter createLanguageType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LeftType <em>Left Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.LeftType
	 * @generated
	 */
	public Adapter createLeftTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LeftType1 <em>Left Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.LeftType1
	 * @generated
	 */
	public Adapter createLeftType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LeftType2 <em>Left Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.LeftType2
	 * @generated
	 */
	public Adapter createLeftType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LeftType11 <em>Left Type11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.LeftType11
	 * @generated
	 */
	public Adapter createLeftType11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LibraryRefType <em>Library Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.LibraryRefType
	 * @generated
	 */
	public Adapter createLibraryRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LinkerCommandFileType <em>Linker Command File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.LinkerCommandFileType
	 * @generated
	 */
	public Adapter createLinkerCommandFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LinkerFlagsType <em>Linker Flags Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.LinkerFlagsType
	 * @generated
	 */
	public Adapter createLinkerFlagsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LinkerType <em>Linker Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.LinkerType
	 * @generated
	 */
	public Adapter createLinkerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LoadConstraintType <em>Load Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.LoadConstraintType
	 * @generated
	 */
	public Adapter createLoadConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LocalMemoryMapType <em>Local Memory Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.LocalMemoryMapType
	 * @generated
	 */
	public Adapter createLocalMemoryMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LogicalNameType <em>Logical Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.LogicalNameType
	 * @generated
	 */
	public Adapter createLogicalNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LogicalPortType <em>Logical Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.LogicalPortType
	 * @generated
	 */
	public Adapter createLogicalPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.LogicalPortType1 <em>Logical Port Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.LogicalPortType1
	 * @generated
	 */
	public Adapter createLogicalPortType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MaskType <em>Mask Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.MaskType
	 * @generated
	 */
	public Adapter createMaskTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MaskType1 <em>Mask Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.MaskType1
	 * @generated
	 */
	public Adapter createMaskType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MasterType <em>Master Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.MasterType
	 * @generated
	 */
	public Adapter createMasterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MaximumType <em>Maximum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.MaximumType
	 * @generated
	 */
	public Adapter createMaximumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MemoryMapRefType <em>Memory Map Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.MemoryMapRefType
	 * @generated
	 */
	public Adapter createMemoryMapRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MemoryMapsType <em>Memory Maps Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.MemoryMapsType
	 * @generated
	 */
	public Adapter createMemoryMapsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MemoryMapType <em>Memory Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.MemoryMapType
	 * @generated
	 */
	public Adapter createMemoryMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MemoryRemapType <em>Memory Remap Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.MemoryRemapType
	 * @generated
	 */
	public Adapter createMemoryRemapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MinimumType <em>Minimum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.MinimumType
	 * @generated
	 */
	public Adapter createMinimumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MirroredMasterType <em>Mirrored Master Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.MirroredMasterType
	 * @generated
	 */
	public Adapter createMirroredMasterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MirroredSlaveType <em>Mirrored Slave Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.MirroredSlaveType
	 * @generated
	 */
	public Adapter createMirroredSlaveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MirroredSystemType <em>Mirrored System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.MirroredSystemType
	 * @generated
	 */
	public Adapter createMirroredSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ModelParametersType <em>Model Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ModelParametersType
	 * @generated
	 */
	public Adapter createModelParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ModelParametersType1 <em>Model Parameters Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ModelParametersType1
	 * @generated
	 */
	public Adapter createModelParametersType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ModelType
	 * @generated
	 */
	public Adapter createModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorInterconnectionType <em>Monitor Interconnection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorInterconnectionType
	 * @generated
	 */
	public Adapter createMonitorInterconnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorType <em>Monitor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.MonitorType
	 * @generated
	 */
	public Adapter createMonitorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.NameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.NameType
	 * @generated
	 */
	public Adapter createNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.NameType1 <em>Name Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.NameType1
	 * @generated
	 */
	public Adapter createNameType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.NameType2 <em>Name Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.NameType2
	 * @generated
	 */
	public Adapter createNameType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.NameValuePairType <em>Name Value Pair Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.NameValuePairType
	 * @generated
	 */
	public Adapter createNameValuePairTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.NameValueTypeType <em>Name Value Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.NameValueTypeType
	 * @generated
	 */
	public Adapter createNameValueTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OnMasterType <em>On Master Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.OnMasterType
	 * @generated
	 */
	public Adapter createOnMasterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OnMasterType1 <em>On Master Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.OnMasterType1
	 * @generated
	 */
	public Adapter createOnMasterType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OnSlaveType <em>On Slave Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.OnSlaveType
	 * @generated
	 */
	public Adapter createOnSlaveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OnSlaveType1 <em>On Slave Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.OnSlaveType1
	 * @generated
	 */
	public Adapter createOnSlaveType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OnSystemType <em>On System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.OnSystemType
	 * @generated
	 */
	public Adapter createOnSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OnSystemType1 <em>On System Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.OnSystemType1
	 * @generated
	 */
	public Adapter createOnSystemType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OtherClockDriverType <em>Other Clock Driver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.OtherClockDriverType
	 * @generated
	 */
	public Adapter createOtherClockDriverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.OtherClocks <em>Other Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.OtherClocks
	 * @generated
	 */
	public Adapter createOtherClocksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ParametersType <em>Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ParametersType
	 * @generated
	 */
	public Adapter createParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ParametersType1 <em>Parameters Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ParametersType1
	 * @generated
	 */
	public Adapter createParametersType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PhaseType <em>Phase Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.PhaseType
	 * @generated
	 */
	public Adapter createPhaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PhysicalPortType <em>Physical Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.PhysicalPortType
	 * @generated
	 */
	public Adapter createPhysicalPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PhysicalPortType1 <em>Physical Port Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.PhysicalPortType1
	 * @generated
	 */
	public Adapter createPhysicalPortType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortAccessType <em>Port Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.PortAccessType
	 * @generated
	 */
	public Adapter createPortAccessTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortDeclarationType <em>Port Declaration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.PortDeclarationType
	 * @generated
	 */
	public Adapter createPortDeclarationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortMapsType <em>Port Maps Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.PortMapsType
	 * @generated
	 */
	public Adapter createPortMapsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortMapsType1 <em>Port Maps Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.PortMapsType1
	 * @generated
	 */
	public Adapter createPortMapsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortMapType <em>Port Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.PortMapType
	 * @generated
	 */
	public Adapter createPortMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortMapType1 <em>Port Map Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.PortMapType1
	 * @generated
	 */
	public Adapter createPortMapType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortsType <em>Ports Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.PortsType
	 * @generated
	 */
	public Adapter createPortsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortsType1 <em>Ports Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.PortsType1
	 * @generated
	 */
	public Adapter createPortsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortsType2 <em>Ports Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.PortsType2
	 * @generated
	 */
	public Adapter createPortsType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortTransactionalType <em>Port Transactional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.PortTransactionalType
	 * @generated
	 */
	public Adapter createPortTransactionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.PortType
	 * @generated
	 */
	public Adapter createPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortType1 <em>Port Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.PortType1
	 * @generated
	 */
	public Adapter createPortType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.PortWireType <em>Port Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.PortWireType
	 * @generated
	 */
	public Adapter createPortWireTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.QualifierType <em>Qualifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.QualifierType
	 * @generated
	 */
	public Adapter createQualifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.QualifierType1 <em>Qualifier Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.QualifierType1
	 * @generated
	 */
	public Adapter createQualifierType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType
	 * @generated
	 */
	public Adapter createRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType1 <em>Range Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType1
	 * @generated
	 */
	public Adapter createRangeType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType2 <em>Range Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType2
	 * @generated
	 */
	public Adapter createRangeType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3 <em>Range Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.RangeType3
	 * @generated
	 */
	public Adapter createRangeType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType <em>Register File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterFileType
	 * @generated
	 */
	public Adapter createRegisterFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterType <em>Register Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.RegisterType
	 * @generated
	 */
	public Adapter createRegisterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RemapAddressType <em>Remap Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.RemapAddressType
	 * @generated
	 */
	public Adapter createRemapAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RemapPortsType <em>Remap Ports Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.RemapPortsType
	 * @generated
	 */
	public Adapter createRemapPortsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RemapPortType <em>Remap Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.RemapPortType
	 * @generated
	 */
	public Adapter createRemapPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RemapStatesType <em>Remap States Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.RemapStatesType
	 * @generated
	 */
	public Adapter createRemapStatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RemapStateType <em>Remap State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.RemapStateType
	 * @generated
	 */
	public Adapter createRemapStateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ReplaceDefaultFlagsType <em>Replace Default Flags Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ReplaceDefaultFlagsType
	 * @generated
	 */
	public Adapter createReplaceDefaultFlagsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ReplaceDefaultFlagsType1 <em>Replace Default Flags Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ReplaceDefaultFlagsType1
	 * @generated
	 */
	public Adapter createReplaceDefaultFlagsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ReplaceDefaultFlagsType2 <em>Replace Default Flags Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ReplaceDefaultFlagsType2
	 * @generated
	 */
	public Adapter createReplaceDefaultFlagsType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RequiresDriverType <em>Requires Driver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.RequiresDriverType
	 * @generated
	 */
	public Adapter createRequiresDriverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ResetType <em>Reset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ResetType
	 * @generated
	 */
	public Adapter createResetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ResetType1 <em>Reset Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ResetType1
	 * @generated
	 */
	public Adapter createResetType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ResolvedLibraryRefType <em>Resolved Library Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ResolvedLibraryRefType
	 * @generated
	 */
	public Adapter createResolvedLibraryRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RightType <em>Right Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.RightType
	 * @generated
	 */
	public Adapter createRightTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RightType1 <em>Right Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.RightType1
	 * @generated
	 */
	public Adapter createRightType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RightType2 <em>Right Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.RightType2
	 * @generated
	 */
	public Adapter createRightType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.RightType11 <em>Right Type11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.RightType11
	 * @generated
	 */
	public Adapter createRightType11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SegmentsType <em>Segments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.SegmentsType
	 * @generated
	 */
	public Adapter createSegmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SegmentType <em>Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.SegmentType
	 * @generated
	 */
	public Adapter createSegmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceType
	 * @generated
	 */
	public Adapter createServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceType1 <em>Service Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceType1
	 * @generated
	 */
	public Adapter createServiceType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceTypeDefsType <em>Service Type Defs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceTypeDefsType
	 * @generated
	 */
	public Adapter createServiceTypeDefsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceTypeDefType <em>Service Type Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ServiceTypeDefType
	 * @generated
	 */
	public Adapter createServiceTypeDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SingleShotDriverType <em>Single Shot Driver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.SingleShotDriverType
	 * @generated
	 */
	public Adapter createSingleShotDriverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SingleShotDurationType <em>Single Shot Duration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.SingleShotDurationType
	 * @generated
	 */
	public Adapter createSingleShotDurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SingleShotOffsetType <em>Single Shot Offset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.SingleShotOffsetType
	 * @generated
	 */
	public Adapter createSingleShotOffsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SingleShotValueType <em>Single Shot Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.SingleShotValueType
	 * @generated
	 */
	public Adapter createSingleShotValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SizeType <em>Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.SizeType
	 * @generated
	 */
	public Adapter createSizeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SlaveType <em>Slave Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.SlaveType
	 * @generated
	 */
	public Adapter createSlaveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SourceFileType <em>Source File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.SourceFileType
	 * @generated
	 */
	public Adapter createSourceFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SourceNameType <em>Source Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.SourceNameType
	 * @generated
	 */
	public Adapter createSourceNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SubspaceRefType <em>Subspace Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.SubspaceRefType
	 * @generated
	 */
	public Adapter createSubspaceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SystemGroupNamesType <em>System Group Names Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.SystemGroupNamesType
	 * @generated
	 */
	public Adapter createSystemGroupNamesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.SystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.SystemType
	 * @generated
	 */
	public Adapter createSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TargetNameType <em>Target Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.TargetNameType
	 * @generated
	 */
	public Adapter createTargetNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TestableType <em>Testable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.TestableType
	 * @generated
	 */
	public Adapter createTestableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TimingConstraintType <em>Timing Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.TimingConstraintType
	 * @generated
	 */
	public Adapter createTimingConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TransactionalType <em>Transactional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.TransactionalType
	 * @generated
	 */
	public Adapter createTransactionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TransportMethodsType <em>Transport Methods Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.TransportMethodsType
	 * @generated
	 */
	public Adapter createTransportMethodsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TransTypeDefType <em>Trans Type Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.TransTypeDefType
	 * @generated
	 */
	public Adapter createTransTypeDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TypeNameType <em>Type Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.TypeNameType
	 * @generated
	 */
	public Adapter createTypeNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TypeNameType1 <em>Type Name Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.TypeNameType1
	 * @generated
	 */
	public Adapter createTypeNameType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TypeNameType2 <em>Type Name Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.TypeNameType2
	 * @generated
	 */
	public Adapter createTypeNameType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.TypeNameType3 <em>Type Name Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.TypeNameType3
	 * @generated
	 */
	public Adapter createTypeNameType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ValueMaskConfigType <em>Value Mask Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ValueMaskConfigType
	 * @generated
	 */
	public Adapter createValueMaskConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ValueType1 <em>Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ValueType1
	 * @generated
	 */
	public Adapter createValueType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ValueType2 <em>Value Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ValueType2
	 * @generated
	 */
	public Adapter createValueType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.VectorType <em>Vector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.VectorType
	 * @generated
	 */
	public Adapter createVectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.VectorType1 <em>Vector Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.VectorType1
	 * @generated
	 */
	public Adapter createVectorType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.VectorType2 <em>Vector Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.VectorType2
	 * @generated
	 */
	public Adapter createVectorType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.VectorType11 <em>Vector Type11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.VectorType11
	 * @generated
	 */
	public Adapter createVectorType11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.VendorExtensionsType <em>Vendor Extensions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.VendorExtensionsType
	 * @generated
	 */
	public Adapter createVendorExtensionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewConfigurationType <em>View Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ViewConfigurationType
	 * @generated
	 */
	public Adapter createViewConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewsType <em>Views Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ViewsType
	 * @generated
	 */
	public Adapter createViewsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewsType1 <em>Views Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ViewsType1
	 * @generated
	 */
	public Adapter createViewsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType <em>View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.ViewType
	 * @generated
	 */
	public Adapter createViewTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementRefsType <em>Whitebox Element Refs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementRefsType
	 * @generated
	 */
	public Adapter createWhiteboxElementRefsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementRefType <em>Whitebox Element Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementRefType
	 * @generated
	 */
	public Adapter createWhiteboxElementRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementsType <em>Whitebox Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementsType
	 * @generated
	 */
	public Adapter createWhiteboxElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementType <em>Whitebox Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxElementType
	 * @generated
	 */
	public Adapter createWhiteboxElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxPathType <em>Whitebox Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.WhiteboxPathType
	 * @generated
	 */
	public Adapter createWhiteboxPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WidthType <em>Width Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.WidthType
	 * @generated
	 */
	public Adapter createWidthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WireType <em>Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.WireType
	 * @generated
	 */
	public Adapter createWireTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WireTypeDefsType <em>Wire Type Defs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.WireTypeDefsType
	 * @generated
	 */
	public Adapter createWireTypeDefsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WireTypeDefType <em>Wire Type Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.WireTypeDefType
	 * @generated
	 */
	public Adapter createWireTypeDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit._1685._2009.WriteValueConstraintType <em>Write Value Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit._1685._2009.WriteValueConstraintType
	 * @generated
	 */
	public Adapter createWriteValueConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //_2009AdapterFactory
