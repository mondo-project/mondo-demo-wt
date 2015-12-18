/**
 */
package WTSpec4M.util;

import WTSpec4M.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see WTSpec4M.WTSpec4MPackage
 * @generated
 */
public class WTSpec4MAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WTSpec4MPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTSpec4MAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WTSpec4MPackage.eINSTANCE;
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
	protected WTSpec4MSwitch<Adapter> modelSwitch =
		new WTSpec4MSwitch<Adapter>() {
			@Override
			public Adapter caseWT(WT object) {
				return createWTAdapter();
			}
			@Override
			public Adapter caseSystemInput(SystemInput object) {
				return createSystemInputAdapter();
			}
			@Override
			public Adapter caseSystemOutput(SystemOutput object) {
				return createSystemOutputAdapter();
			}
			@Override
			public Adapter caseSystemFault(SystemFault object) {
				return createSystemFaultAdapter();
			}
			@Override
			public Adapter caseSystemParam(SystemParam object) {
				return createSystemParamAdapter();
			}
			@Override
			public Adapter caseSystemTimer(SystemTimer object) {
				return createSystemTimerAdapter();
			}
			@Override
			public Adapter caseSystemVariable(SystemVariable object) {
				return createSystemVariableAdapter();
			}
			@Override
			public Adapter caseWTCInput(WTCInput object) {
				return createWTCInputAdapter();
			}
			@Override
			public Adapter caseWTCOutput(WTCOutput object) {
				return createWTCOutputAdapter();
			}
			@Override
			public Adapter caseWTCParam(WTCParam object) {
				return createWTCParamAdapter();
			}
			@Override
			public Adapter caseWTCTimer(WTCTimer object) {
				return createWTCTimerAdapter();
			}
			@Override
			public Adapter caseWTCFault(WTCFault object) {
				return createWTCFaultAdapter();
			}
			@Override
			public Adapter caseSubsystem(Subsystem object) {
				return createSubsystemAdapter();
			}
			@Override
			public Adapter casewtc(wtc object) {
				return createwtcAdapter();
			}
			@Override
			public Adapter caseCtrlUnit5(CtrlUnit5 object) {
				return createCtrlUnit5Adapter();
			}
			@Override
			public Adapter caseCtrlUnit9(CtrlUnit9 object) {
				return createCtrlUnit9Adapter();
			}
			@Override
			public Adapter caseCtrlUnit10(CtrlUnit10 object) {
				return createCtrlUnit10Adapter();
			}
			@Override
			public Adapter caseCtrlUnit11(CtrlUnit11 object) {
				return createCtrlUnit11Adapter();
			}
			@Override
			public Adapter caseCtrlUnit13(CtrlUnit13 object) {
				return createCtrlUnit13Adapter();
			}
			@Override
			public Adapter caseCtrlUnit15(CtrlUnit15 object) {
				return createCtrlUnit15Adapter();
			}
			@Override
			public Adapter caseCtrlUnit18(CtrlUnit18 object) {
				return createCtrlUnit18Adapter();
			}
			@Override
			public Adapter caseCtrlUnit27(CtrlUnit27 object) {
				return createCtrlUnit27Adapter();
			}
			@Override
			public Adapter caseCtrlUnit29(CtrlUnit29 object) {
				return createCtrlUnit29Adapter();
			}
			@Override
			public Adapter caseCtrlUnit31(CtrlUnit31 object) {
				return createCtrlUnit31Adapter();
			}
			@Override
			public Adapter caseCtrlUnit34(CtrlUnit34 object) {
				return createCtrlUnit34Adapter();
			}
			@Override
			public Adapter caseCtrlUnit36(CtrlUnit36 object) {
				return createCtrlUnit36Adapter();
			}
			@Override
			public Adapter caseCtrlUnit37(CtrlUnit37 object) {
				return createCtrlUnit37Adapter();
			}
			@Override
			public Adapter caseCtrlUnit39(CtrlUnit39 object) {
				return createCtrlUnit39Adapter();
			}
			@Override
			public Adapter caseCtrlUnit40(CtrlUnit40 object) {
				return createCtrlUnit40Adapter();
			}
			@Override
			public Adapter caseCtrlUnit44(CtrlUnit44 object) {
				return createCtrlUnit44Adapter();
			}
			@Override
			public Adapter caseCtrlUnit46(CtrlUnit46 object) {
				return createCtrlUnit46Adapter();
			}
			@Override
			public Adapter caseCtrlUnit47(CtrlUnit47 object) {
				return createCtrlUnit47Adapter();
			}
			@Override
			public Adapter caseCtrlUnit49(CtrlUnit49 object) {
				return createCtrlUnit49Adapter();
			}
			@Override
			public Adapter caseCtrlUnit50(CtrlUnit50 object) {
				return createCtrlUnit50Adapter();
			}
			@Override
			public Adapter caseCtrlUnit58(CtrlUnit58 object) {
				return createCtrlUnit58Adapter();
			}
			@Override
			public Adapter caseCtrlUnit59(CtrlUnit59 object) {
				return createCtrlUnit59Adapter();
			}
			@Override
			public Adapter caseCtrlUnit65(CtrlUnit65 object) {
				return createCtrlUnit65Adapter();
			}
			@Override
			public Adapter caseCtrlUnit68(CtrlUnit68 object) {
				return createCtrlUnit68Adapter();
			}
			@Override
			public Adapter caseCtrlUnit71(CtrlUnit71 object) {
				return createCtrlUnit71Adapter();
			}
			@Override
			public Adapter caseCtrlUnit73(CtrlUnit73 object) {
				return createCtrlUnit73Adapter();
			}
			@Override
			public Adapter caseCtrlUnit78(CtrlUnit78 object) {
				return createCtrlUnit78Adapter();
			}
			@Override
			public Adapter caseCtrlUnit80(CtrlUnit80 object) {
				return createCtrlUnit80Adapter();
			}
			@Override
			public Adapter caseCtrlUnit92(CtrlUnit92 object) {
				return createCtrlUnit92Adapter();
			}
			@Override
			public Adapter caseCtrlUnit94(CtrlUnit94 object) {
				return createCtrlUnit94Adapter();
			}
			@Override
			public Adapter caseCtrlUnit102(CtrlUnit102 object) {
				return createCtrlUnit102Adapter();
			}
			@Override
			public Adapter caseCtrlUnit124(CtrlUnit124 object) {
				return createCtrlUnit124Adapter();
			}
			@Override
			public Adapter caseCtrlUnit125(CtrlUnit125 object) {
				return createCtrlUnit125Adapter();
			}
			@Override
			public Adapter caseCtrlUnit126(CtrlUnit126 object) {
				return createCtrlUnit126Adapter();
			}
			@Override
			public Adapter caseMainSubsystem(MainSubsystem object) {
				return createMainSubsystemAdapter();
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
	 * Creates a new adapter for an object of class '{@link WTSpec4M.WT <em>WT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.WT
	 * @generated
	 */
	public Adapter createWTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.SystemInput <em>System Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.SystemInput
	 * @generated
	 */
	public Adapter createSystemInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.SystemOutput <em>System Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.SystemOutput
	 * @generated
	 */
	public Adapter createSystemOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.SystemFault <em>System Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.SystemFault
	 * @generated
	 */
	public Adapter createSystemFaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.SystemParam <em>System Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.SystemParam
	 * @generated
	 */
	public Adapter createSystemParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.SystemTimer <em>System Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.SystemTimer
	 * @generated
	 */
	public Adapter createSystemTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.SystemVariable <em>System Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.SystemVariable
	 * @generated
	 */
	public Adapter createSystemVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.WTCInput <em>WTC Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.WTCInput
	 * @generated
	 */
	public Adapter createWTCInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.WTCOutput <em>WTC Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.WTCOutput
	 * @generated
	 */
	public Adapter createWTCOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.WTCParam <em>WTC Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.WTCParam
	 * @generated
	 */
	public Adapter createWTCParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.WTCTimer <em>WTC Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.WTCTimer
	 * @generated
	 */
	public Adapter createWTCTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.WTCFault <em>WTC Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.WTCFault
	 * @generated
	 */
	public Adapter createWTCFaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.Subsystem <em>Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.Subsystem
	 * @generated
	 */
	public Adapter createSubsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.wtc <em>wtc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.wtc
	 * @generated
	 */
	public Adapter createwtcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit5 <em>Ctrl Unit5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit5
	 * @generated
	 */
	public Adapter createCtrlUnit5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit9 <em>Ctrl Unit9</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit9
	 * @generated
	 */
	public Adapter createCtrlUnit9Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit10 <em>Ctrl Unit10</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit10
	 * @generated
	 */
	public Adapter createCtrlUnit10Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit11 <em>Ctrl Unit11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit11
	 * @generated
	 */
	public Adapter createCtrlUnit11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit13 <em>Ctrl Unit13</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit13
	 * @generated
	 */
	public Adapter createCtrlUnit13Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit15 <em>Ctrl Unit15</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit15
	 * @generated
	 */
	public Adapter createCtrlUnit15Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit18 <em>Ctrl Unit18</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit18
	 * @generated
	 */
	public Adapter createCtrlUnit18Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit27 <em>Ctrl Unit27</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit27
	 * @generated
	 */
	public Adapter createCtrlUnit27Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit29 <em>Ctrl Unit29</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit29
	 * @generated
	 */
	public Adapter createCtrlUnit29Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit31 <em>Ctrl Unit31</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit31
	 * @generated
	 */
	public Adapter createCtrlUnit31Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit34 <em>Ctrl Unit34</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit34
	 * @generated
	 */
	public Adapter createCtrlUnit34Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit36 <em>Ctrl Unit36</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit36
	 * @generated
	 */
	public Adapter createCtrlUnit36Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit37 <em>Ctrl Unit37</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit37
	 * @generated
	 */
	public Adapter createCtrlUnit37Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit39 <em>Ctrl Unit39</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit39
	 * @generated
	 */
	public Adapter createCtrlUnit39Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit40 <em>Ctrl Unit40</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit40
	 * @generated
	 */
	public Adapter createCtrlUnit40Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit44 <em>Ctrl Unit44</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit44
	 * @generated
	 */
	public Adapter createCtrlUnit44Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit46 <em>Ctrl Unit46</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit46
	 * @generated
	 */
	public Adapter createCtrlUnit46Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit47 <em>Ctrl Unit47</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit47
	 * @generated
	 */
	public Adapter createCtrlUnit47Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit49 <em>Ctrl Unit49</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit49
	 * @generated
	 */
	public Adapter createCtrlUnit49Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit50 <em>Ctrl Unit50</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit50
	 * @generated
	 */
	public Adapter createCtrlUnit50Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit58 <em>Ctrl Unit58</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit58
	 * @generated
	 */
	public Adapter createCtrlUnit58Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit59 <em>Ctrl Unit59</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit59
	 * @generated
	 */
	public Adapter createCtrlUnit59Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit65 <em>Ctrl Unit65</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit65
	 * @generated
	 */
	public Adapter createCtrlUnit65Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit68 <em>Ctrl Unit68</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit68
	 * @generated
	 */
	public Adapter createCtrlUnit68Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit71 <em>Ctrl Unit71</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit71
	 * @generated
	 */
	public Adapter createCtrlUnit71Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit73 <em>Ctrl Unit73</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit73
	 * @generated
	 */
	public Adapter createCtrlUnit73Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit78 <em>Ctrl Unit78</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit78
	 * @generated
	 */
	public Adapter createCtrlUnit78Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit80 <em>Ctrl Unit80</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit80
	 * @generated
	 */
	public Adapter createCtrlUnit80Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit92 <em>Ctrl Unit92</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit92
	 * @generated
	 */
	public Adapter createCtrlUnit92Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit94 <em>Ctrl Unit94</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit94
	 * @generated
	 */
	public Adapter createCtrlUnit94Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit102 <em>Ctrl Unit102</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit102
	 * @generated
	 */
	public Adapter createCtrlUnit102Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit124 <em>Ctrl Unit124</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit124
	 * @generated
	 */
	public Adapter createCtrlUnit124Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit125 <em>Ctrl Unit125</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit125
	 * @generated
	 */
	public Adapter createCtrlUnit125Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.CtrlUnit126 <em>Ctrl Unit126</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.CtrlUnit126
	 * @generated
	 */
	public Adapter createCtrlUnit126Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WTSpec4M.MainSubsystem <em>Main Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WTSpec4M.MainSubsystem
	 * @generated
	 */
	public Adapter createMainSubsystemAdapter() {
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

} //WTSpec4MAdapterFactory
