/**
 */
package WTSpec4M.provider;

import WTSpec4M.util.WTSpec4MAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WTSpec4MItemProviderAdapterFactory extends WTSpec4MAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTSpec4MItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.WT} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WTItemProvider wtItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.WT}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWTAdapter() {
		if (wtItemProvider == null) {
			wtItemProvider = new WTItemProvider(this);
		}

		return wtItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.SystemInput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemInputItemProvider systemInputItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.SystemInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemInputAdapter() {
		if (systemInputItemProvider == null) {
			systemInputItemProvider = new SystemInputItemProvider(this);
		}

		return systemInputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.SystemOutput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemOutputItemProvider systemOutputItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.SystemOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemOutputAdapter() {
		if (systemOutputItemProvider == null) {
			systemOutputItemProvider = new SystemOutputItemProvider(this);
		}

		return systemOutputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.SystemFault} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemFaultItemProvider systemFaultItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.SystemFault}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemFaultAdapter() {
		if (systemFaultItemProvider == null) {
			systemFaultItemProvider = new SystemFaultItemProvider(this);
		}

		return systemFaultItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.SystemParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemParamItemProvider systemParamItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.SystemParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemParamAdapter() {
		if (systemParamItemProvider == null) {
			systemParamItemProvider = new SystemParamItemProvider(this);
		}

		return systemParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.SystemTimer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemTimerItemProvider systemTimerItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.SystemTimer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemTimerAdapter() {
		if (systemTimerItemProvider == null) {
			systemTimerItemProvider = new SystemTimerItemProvider(this);
		}

		return systemTimerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.SystemVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemVariableItemProvider systemVariableItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.SystemVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemVariableAdapter() {
		if (systemVariableItemProvider == null) {
			systemVariableItemProvider = new SystemVariableItemProvider(this);
		}

		return systemVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.Subsystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubsystemItemProvider subsystemItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.Subsystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubsystemAdapter() {
		if (subsystemItemProvider == null) {
			subsystemItemProvider = new SubsystemItemProvider(this);
		}

		return subsystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit5} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit5ItemProvider ctrlUnit5ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit5}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit5Adapter() {
		if (ctrlUnit5ItemProvider == null) {
			ctrlUnit5ItemProvider = new CtrlUnit5ItemProvider(this);
		}

		return ctrlUnit5ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit9} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit9ItemProvider ctrlUnit9ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit9}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit9Adapter() {
		if (ctrlUnit9ItemProvider == null) {
			ctrlUnit9ItemProvider = new CtrlUnit9ItemProvider(this);
		}

		return ctrlUnit9ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit10} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit10ItemProvider ctrlUnit10ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit10}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit10Adapter() {
		if (ctrlUnit10ItemProvider == null) {
			ctrlUnit10ItemProvider = new CtrlUnit10ItemProvider(this);
		}

		return ctrlUnit10ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit11} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit11ItemProvider ctrlUnit11ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit11}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit11Adapter() {
		if (ctrlUnit11ItemProvider == null) {
			ctrlUnit11ItemProvider = new CtrlUnit11ItemProvider(this);
		}

		return ctrlUnit11ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit13} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit13ItemProvider ctrlUnit13ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit13}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit13Adapter() {
		if (ctrlUnit13ItemProvider == null) {
			ctrlUnit13ItemProvider = new CtrlUnit13ItemProvider(this);
		}

		return ctrlUnit13ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit15} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit15ItemProvider ctrlUnit15ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit15}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit15Adapter() {
		if (ctrlUnit15ItemProvider == null) {
			ctrlUnit15ItemProvider = new CtrlUnit15ItemProvider(this);
		}

		return ctrlUnit15ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit18} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit18ItemProvider ctrlUnit18ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit18}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit18Adapter() {
		if (ctrlUnit18ItemProvider == null) {
			ctrlUnit18ItemProvider = new CtrlUnit18ItemProvider(this);
		}

		return ctrlUnit18ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit27} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit27ItemProvider ctrlUnit27ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit27}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit27Adapter() {
		if (ctrlUnit27ItemProvider == null) {
			ctrlUnit27ItemProvider = new CtrlUnit27ItemProvider(this);
		}

		return ctrlUnit27ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit29} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit29ItemProvider ctrlUnit29ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit29}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit29Adapter() {
		if (ctrlUnit29ItemProvider == null) {
			ctrlUnit29ItemProvider = new CtrlUnit29ItemProvider(this);
		}

		return ctrlUnit29ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit31} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit31ItemProvider ctrlUnit31ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit31}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit31Adapter() {
		if (ctrlUnit31ItemProvider == null) {
			ctrlUnit31ItemProvider = new CtrlUnit31ItemProvider(this);
		}

		return ctrlUnit31ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit34} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit34ItemProvider ctrlUnit34ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit34}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit34Adapter() {
		if (ctrlUnit34ItemProvider == null) {
			ctrlUnit34ItemProvider = new CtrlUnit34ItemProvider(this);
		}

		return ctrlUnit34ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit36} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit36ItemProvider ctrlUnit36ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit36}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit36Adapter() {
		if (ctrlUnit36ItemProvider == null) {
			ctrlUnit36ItemProvider = new CtrlUnit36ItemProvider(this);
		}

		return ctrlUnit36ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit37} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit37ItemProvider ctrlUnit37ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit37}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit37Adapter() {
		if (ctrlUnit37ItemProvider == null) {
			ctrlUnit37ItemProvider = new CtrlUnit37ItemProvider(this);
		}

		return ctrlUnit37ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit39} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit39ItemProvider ctrlUnit39ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit39}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit39Adapter() {
		if (ctrlUnit39ItemProvider == null) {
			ctrlUnit39ItemProvider = new CtrlUnit39ItemProvider(this);
		}

		return ctrlUnit39ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit40} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit40ItemProvider ctrlUnit40ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit40}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit40Adapter() {
		if (ctrlUnit40ItemProvider == null) {
			ctrlUnit40ItemProvider = new CtrlUnit40ItemProvider(this);
		}

		return ctrlUnit40ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit44} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit44ItemProvider ctrlUnit44ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit44}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit44Adapter() {
		if (ctrlUnit44ItemProvider == null) {
			ctrlUnit44ItemProvider = new CtrlUnit44ItemProvider(this);
		}

		return ctrlUnit44ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit46} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit46ItemProvider ctrlUnit46ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit46}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit46Adapter() {
		if (ctrlUnit46ItemProvider == null) {
			ctrlUnit46ItemProvider = new CtrlUnit46ItemProvider(this);
		}

		return ctrlUnit46ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit47} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit47ItemProvider ctrlUnit47ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit47}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit47Adapter() {
		if (ctrlUnit47ItemProvider == null) {
			ctrlUnit47ItemProvider = new CtrlUnit47ItemProvider(this);
		}

		return ctrlUnit47ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit49} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit49ItemProvider ctrlUnit49ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit49}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit49Adapter() {
		if (ctrlUnit49ItemProvider == null) {
			ctrlUnit49ItemProvider = new CtrlUnit49ItemProvider(this);
		}

		return ctrlUnit49ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit50} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit50ItemProvider ctrlUnit50ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit50}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit50Adapter() {
		if (ctrlUnit50ItemProvider == null) {
			ctrlUnit50ItemProvider = new CtrlUnit50ItemProvider(this);
		}

		return ctrlUnit50ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit58} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit58ItemProvider ctrlUnit58ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit58}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit58Adapter() {
		if (ctrlUnit58ItemProvider == null) {
			ctrlUnit58ItemProvider = new CtrlUnit58ItemProvider(this);
		}

		return ctrlUnit58ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit59} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit59ItemProvider ctrlUnit59ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit59}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit59Adapter() {
		if (ctrlUnit59ItemProvider == null) {
			ctrlUnit59ItemProvider = new CtrlUnit59ItemProvider(this);
		}

		return ctrlUnit59ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit65} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit65ItemProvider ctrlUnit65ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit65}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit65Adapter() {
		if (ctrlUnit65ItemProvider == null) {
			ctrlUnit65ItemProvider = new CtrlUnit65ItemProvider(this);
		}

		return ctrlUnit65ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit68} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit68ItemProvider ctrlUnit68ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit68}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit68Adapter() {
		if (ctrlUnit68ItemProvider == null) {
			ctrlUnit68ItemProvider = new CtrlUnit68ItemProvider(this);
		}

		return ctrlUnit68ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit71} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit71ItemProvider ctrlUnit71ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit71}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit71Adapter() {
		if (ctrlUnit71ItemProvider == null) {
			ctrlUnit71ItemProvider = new CtrlUnit71ItemProvider(this);
		}

		return ctrlUnit71ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit73} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit73ItemProvider ctrlUnit73ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit73}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit73Adapter() {
		if (ctrlUnit73ItemProvider == null) {
			ctrlUnit73ItemProvider = new CtrlUnit73ItemProvider(this);
		}

		return ctrlUnit73ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit78} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit78ItemProvider ctrlUnit78ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit78}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit78Adapter() {
		if (ctrlUnit78ItemProvider == null) {
			ctrlUnit78ItemProvider = new CtrlUnit78ItemProvider(this);
		}

		return ctrlUnit78ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit80} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit80ItemProvider ctrlUnit80ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit80}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit80Adapter() {
		if (ctrlUnit80ItemProvider == null) {
			ctrlUnit80ItemProvider = new CtrlUnit80ItemProvider(this);
		}

		return ctrlUnit80ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit92} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit92ItemProvider ctrlUnit92ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit92}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit92Adapter() {
		if (ctrlUnit92ItemProvider == null) {
			ctrlUnit92ItemProvider = new CtrlUnit92ItemProvider(this);
		}

		return ctrlUnit92ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit94} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit94ItemProvider ctrlUnit94ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit94}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit94Adapter() {
		if (ctrlUnit94ItemProvider == null) {
			ctrlUnit94ItemProvider = new CtrlUnit94ItemProvider(this);
		}

		return ctrlUnit94ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit102} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit102ItemProvider ctrlUnit102ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit102}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit102Adapter() {
		if (ctrlUnit102ItemProvider == null) {
			ctrlUnit102ItemProvider = new CtrlUnit102ItemProvider(this);
		}

		return ctrlUnit102ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit124} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit124ItemProvider ctrlUnit124ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit124}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit124Adapter() {
		if (ctrlUnit124ItemProvider == null) {
			ctrlUnit124ItemProvider = new CtrlUnit124ItemProvider(this);
		}

		return ctrlUnit124ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit125} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit125ItemProvider ctrlUnit125ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit125}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit125Adapter() {
		if (ctrlUnit125ItemProvider == null) {
			ctrlUnit125ItemProvider = new CtrlUnit125ItemProvider(this);
		}

		return ctrlUnit125ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.CtrlUnit126} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit126ItemProvider ctrlUnit126ItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.CtrlUnit126}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCtrlUnit126Adapter() {
		if (ctrlUnit126ItemProvider == null) {
			ctrlUnit126ItemProvider = new CtrlUnit126ItemProvider(this);
		}

		return ctrlUnit126ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link WTSpec4M.MainSubsystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainSubsystemItemProvider mainSubsystemItemProvider;

	/**
	 * This creates an adapter for a {@link WTSpec4M.MainSubsystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMainSubsystemAdapter() {
		if (mainSubsystemItemProvider == null) {
			mainSubsystemItemProvider = new MainSubsystemItemProvider(this);
		}

		return mainSubsystemItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (wtItemProvider != null) wtItemProvider.dispose();
		if (systemInputItemProvider != null) systemInputItemProvider.dispose();
		if (systemOutputItemProvider != null) systemOutputItemProvider.dispose();
		if (systemFaultItemProvider != null) systemFaultItemProvider.dispose();
		if (systemParamItemProvider != null) systemParamItemProvider.dispose();
		if (systemTimerItemProvider != null) systemTimerItemProvider.dispose();
		if (systemVariableItemProvider != null) systemVariableItemProvider.dispose();
		if (subsystemItemProvider != null) subsystemItemProvider.dispose();
		if (ctrlUnit5ItemProvider != null) ctrlUnit5ItemProvider.dispose();
		if (ctrlUnit9ItemProvider != null) ctrlUnit9ItemProvider.dispose();
		if (ctrlUnit10ItemProvider != null) ctrlUnit10ItemProvider.dispose();
		if (ctrlUnit11ItemProvider != null) ctrlUnit11ItemProvider.dispose();
		if (ctrlUnit13ItemProvider != null) ctrlUnit13ItemProvider.dispose();
		if (ctrlUnit15ItemProvider != null) ctrlUnit15ItemProvider.dispose();
		if (ctrlUnit18ItemProvider != null) ctrlUnit18ItemProvider.dispose();
		if (ctrlUnit27ItemProvider != null) ctrlUnit27ItemProvider.dispose();
		if (ctrlUnit29ItemProvider != null) ctrlUnit29ItemProvider.dispose();
		if (ctrlUnit31ItemProvider != null) ctrlUnit31ItemProvider.dispose();
		if (ctrlUnit34ItemProvider != null) ctrlUnit34ItemProvider.dispose();
		if (ctrlUnit36ItemProvider != null) ctrlUnit36ItemProvider.dispose();
		if (ctrlUnit37ItemProvider != null) ctrlUnit37ItemProvider.dispose();
		if (ctrlUnit39ItemProvider != null) ctrlUnit39ItemProvider.dispose();
		if (ctrlUnit40ItemProvider != null) ctrlUnit40ItemProvider.dispose();
		if (ctrlUnit44ItemProvider != null) ctrlUnit44ItemProvider.dispose();
		if (ctrlUnit46ItemProvider != null) ctrlUnit46ItemProvider.dispose();
		if (ctrlUnit47ItemProvider != null) ctrlUnit47ItemProvider.dispose();
		if (ctrlUnit49ItemProvider != null) ctrlUnit49ItemProvider.dispose();
		if (ctrlUnit50ItemProvider != null) ctrlUnit50ItemProvider.dispose();
		if (ctrlUnit58ItemProvider != null) ctrlUnit58ItemProvider.dispose();
		if (ctrlUnit59ItemProvider != null) ctrlUnit59ItemProvider.dispose();
		if (ctrlUnit65ItemProvider != null) ctrlUnit65ItemProvider.dispose();
		if (ctrlUnit68ItemProvider != null) ctrlUnit68ItemProvider.dispose();
		if (ctrlUnit71ItemProvider != null) ctrlUnit71ItemProvider.dispose();
		if (ctrlUnit73ItemProvider != null) ctrlUnit73ItemProvider.dispose();
		if (ctrlUnit78ItemProvider != null) ctrlUnit78ItemProvider.dispose();
		if (ctrlUnit80ItemProvider != null) ctrlUnit80ItemProvider.dispose();
		if (ctrlUnit92ItemProvider != null) ctrlUnit92ItemProvider.dispose();
		if (ctrlUnit94ItemProvider != null) ctrlUnit94ItemProvider.dispose();
		if (ctrlUnit102ItemProvider != null) ctrlUnit102ItemProvider.dispose();
		if (ctrlUnit124ItemProvider != null) ctrlUnit124ItemProvider.dispose();
		if (ctrlUnit125ItemProvider != null) ctrlUnit125ItemProvider.dispose();
		if (ctrlUnit126ItemProvider != null) ctrlUnit126ItemProvider.dispose();
		if (mainSubsystemItemProvider != null) mainSubsystemItemProvider.dispose();
	}

}
