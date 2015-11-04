/**
 */
package WTSpec4M.provider;


import WTSpec4M.Subsystem;
import WTSpec4M.WTSpec4MFactory;
import WTSpec4M.WTSpec4MPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link WTSpec4M.Subsystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsystemItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubsystemItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSysIdPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sys Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSysIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subsystem_sysId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subsystem_sysId_feature", "_UI_Subsystem_type"),
				 WTSpec4MPackage.Literals.SUBSYSTEM__SYS_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subsystem_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subsystem_description_feature", "_UI_Subsystem_type"),
				 WTSpec4MPackage.Literals.SUBSYSTEM__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS);
			childrenFeatures.add(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_SUBSYSTEMS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Subsystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Subsystem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Subsystem)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_Subsystem_type") :
			getString("_UI_Subsystem_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Subsystem.class)) {
			case WTSpec4MPackage.SUBSYSTEM__SYS_ID:
			case WTSpec4MPackage.SUBSYSTEM__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WTSpec4MPackage.SUBSYSTEM__ITS_WT_CS:
			case WTSpec4MPackage.SUBSYSTEM__ITS_SUBSYSTEMS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit5()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit9()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit10()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit11()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit13()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit15()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit18()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit27()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit29()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit31()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit34()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit36()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit37()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit39()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit40()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit44()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit46()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit47()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit49()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit50()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit58()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit59()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit65()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit68()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit71()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit73()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit78()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit80()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit92()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit94()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit102()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit124()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit125()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_WT_CS,
				 WTSpec4MFactory.eINSTANCE.createCtrlUnit126()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_SUBSYSTEMS,
				 WTSpec4MFactory.eINSTANCE.createSubsystem()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpec4MPackage.Literals.SUBSYSTEM__ITS_SUBSYSTEMS,
				 WTSpec4MFactory.eINSTANCE.createMainSubsystem()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return WTSpec4M50EditPlugin.INSTANCE;
	}

}
