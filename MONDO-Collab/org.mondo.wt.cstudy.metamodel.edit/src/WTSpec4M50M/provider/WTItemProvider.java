/**
 */
package WTSpec4M50M.provider;


import WTSpec4M50M.WT;
import WTSpec4M50M.WTSpec4M50MFactory;
import WTSpec4M50M.WTSpec4M50MPackage;

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
 * This is the item provider adapter for a {@link WTSpec4M50M.WT} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WTItemProvider 
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
    public WTItemProvider(AdapterFactory adapterFactory) {
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
            addModelPropertyDescriptor(object);
            addVersionPropertyDescriptor(object);
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
                 getString("_UI_WT_sysId_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_WT_sysId_feature", "_UI_WT_type"),
                 WTSpec4M50MPackage.Literals.WT__SYS_ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Model feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addModelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_WT_model_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_WT_model_feature", "_UI_WT_type"),
                 WTSpec4M50MPackage.Literals.WT__MODEL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Version feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVersionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_WT_version_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_WT_version_feature", "_UI_WT_type"),
                 WTSpec4M50MPackage.Literals.WT__VERSION,
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
            childrenFeatures.add(WTSpec4M50MPackage.Literals.WT__ITS_SUBSYSTEMS);
            childrenFeatures.add(WTSpec4M50MPackage.Literals.WT__ITS_INPUTS);
            childrenFeatures.add(WTSpec4M50MPackage.Literals.WT__ITS_OUTPUTS);
            childrenFeatures.add(WTSpec4M50MPackage.Literals.WT__ITS_PARAMS);
            childrenFeatures.add(WTSpec4M50MPackage.Literals.WT__ITS_TIMERS);
            childrenFeatures.add(WTSpec4M50MPackage.Literals.WT__ITS_FAULTS);
            childrenFeatures.add(WTSpec4M50MPackage.Literals.WT__ITS_VARIABLES);
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
     * This returns WT.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/WT"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((WT)object).getSysId();
        return label == null || label.length() == 0 ?
            getString("_UI_WT_type") :
            getString("_UI_WT_type") + " " + label;
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

        switch (notification.getFeatureID(WT.class)) {
            case WTSpec4M50MPackage.WT__SYS_ID:
            case WTSpec4M50MPackage.WT__MODEL:
            case WTSpec4M50MPackage.WT__VERSION:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case WTSpec4M50MPackage.WT__ITS_SUBSYSTEMS:
            case WTSpec4M50MPackage.WT__ITS_INPUTS:
            case WTSpec4M50MPackage.WT__ITS_OUTPUTS:
            case WTSpec4M50MPackage.WT__ITS_PARAMS:
            case WTSpec4M50MPackage.WT__ITS_TIMERS:
            case WTSpec4M50MPackage.WT__ITS_FAULTS:
            case WTSpec4M50MPackage.WT__ITS_VARIABLES:
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
                (WTSpec4M50MPackage.Literals.WT__ITS_SUBSYSTEMS,
                 WTSpec4M50MFactory.eINSTANCE.createMainSubsystem()));

        newChildDescriptors.add
            (createChildParameter
                (WTSpec4M50MPackage.Literals.WT__ITS_INPUTS,
                 WTSpec4M50MFactory.eINSTANCE.createSystemInput()));

        newChildDescriptors.add
            (createChildParameter
                (WTSpec4M50MPackage.Literals.WT__ITS_OUTPUTS,
                 WTSpec4M50MFactory.eINSTANCE.createSystemOutput()));

        newChildDescriptors.add
            (createChildParameter
                (WTSpec4M50MPackage.Literals.WT__ITS_PARAMS,
                 WTSpec4M50MFactory.eINSTANCE.createSystemParam()));

        newChildDescriptors.add
            (createChildParameter
                (WTSpec4M50MPackage.Literals.WT__ITS_TIMERS,
                 WTSpec4M50MFactory.eINSTANCE.createSystemTimer()));

        newChildDescriptors.add
            (createChildParameter
                (WTSpec4M50MPackage.Literals.WT__ITS_FAULTS,
                 WTSpec4M50MFactory.eINSTANCE.createSystemFault()));

        newChildDescriptors.add
            (createChildParameter
                (WTSpec4M50MPackage.Literals.WT__ITS_VARIABLES,
                 WTSpec4M50MFactory.eINSTANCE.createSystemVariable()));
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return WTSpec4M50MEditPlugin.INSTANCE;
    }

}
