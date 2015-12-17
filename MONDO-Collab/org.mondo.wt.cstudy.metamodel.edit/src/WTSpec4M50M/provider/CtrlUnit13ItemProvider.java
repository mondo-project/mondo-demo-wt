/**
 */
package WTSpec4M50M.provider;


import WTSpec4M50M.CtrlUnit13;
import WTSpec4M50M.WTSpec4M50MPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link WTSpec4M50M.CtrlUnit13} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit13ItemProvider extends wtcItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CtrlUnit13ItemProvider(AdapterFactory adapterFactory) {
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

            addInput__iInput1PropertyDescriptor(object);
            addInput__iInput2PropertyDescriptor(object);
            addInput__iInput3PropertyDescriptor(object);
            addOutput__oOutput1PropertyDescriptor(object);
            addParameter__pParam1PropertyDescriptor(object);
            addParameter__pParam2PropertyDescriptor(object);
            addBhvParam__BhvParam1PropertyDescriptor(object);
            addBhvParam__BhvParam2PropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Input iInput1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInput__iInput1PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CtrlUnit13_Input__iInput1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit13_Input__iInput1_feature", "_UI_CtrlUnit13_type"),
                 WTSpec4M50MPackage.Literals.CTRL_UNIT13__INPUT_IINPUT1,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Input iInput2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInput__iInput2PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CtrlUnit13_Input__iInput2_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit13_Input__iInput2_feature", "_UI_CtrlUnit13_type"),
                 WTSpec4M50MPackage.Literals.CTRL_UNIT13__INPUT_IINPUT2,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Input iInput3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInput__iInput3PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CtrlUnit13_Input__iInput3_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit13_Input__iInput3_feature", "_UI_CtrlUnit13_type"),
                 WTSpec4M50MPackage.Literals.CTRL_UNIT13__INPUT_IINPUT3,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Output oOutput1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutput__oOutput1PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CtrlUnit13_Output__oOutput1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit13_Output__oOutput1_feature", "_UI_CtrlUnit13_type"),
                 WTSpec4M50MPackage.Literals.CTRL_UNIT13__OUTPUT_OOUTPUT1,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Parameter pParam1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addParameter__pParam1PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CtrlUnit13_Parameter__pParam1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit13_Parameter__pParam1_feature", "_UI_CtrlUnit13_type"),
                 WTSpec4M50MPackage.Literals.CTRL_UNIT13__PARAMETER_PPARAM1,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Parameter pParam2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addParameter__pParam2PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CtrlUnit13_Parameter__pParam2_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit13_Parameter__pParam2_feature", "_UI_CtrlUnit13_type"),
                 WTSpec4M50MPackage.Literals.CTRL_UNIT13__PARAMETER_PPARAM2,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Bhv Param Bhv Param1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBhvParam__BhvParam1PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CtrlUnit13_BhvParam__BhvParam1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit13_BhvParam__BhvParam1_feature", "_UI_CtrlUnit13_type"),
                 WTSpec4M50MPackage.Literals.CTRL_UNIT13__BHV_PARAM_BHV_PARAM1,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Bhv Param Bhv Param2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBhvParam__BhvParam2PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CtrlUnit13_BhvParam__BhvParam2_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit13_BhvParam__BhvParam2_feature", "_UI_CtrlUnit13_type"),
                 WTSpec4M50MPackage.Literals.CTRL_UNIT13__BHV_PARAM_BHV_PARAM2,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns CtrlUnit13.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit13"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CtrlUnit13)object).getSysId();
        return label == null || label.length() == 0 ?
            getString("_UI_CtrlUnit13_type") :
            getString("_UI_CtrlUnit13_type") + " " + label;
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

        switch (notification.getFeatureID(CtrlUnit13.class)) {
            case WTSpec4M50MPackage.CTRL_UNIT13__BHV_PARAM_BHV_PARAM1:
            case WTSpec4M50MPackage.CTRL_UNIT13__BHV_PARAM_BHV_PARAM2:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
    }

}
