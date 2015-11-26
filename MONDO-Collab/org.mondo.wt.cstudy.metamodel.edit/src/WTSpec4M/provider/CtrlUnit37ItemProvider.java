/**
 */
package WTSpec4M.provider;


import WTSpec4M.CtrlUnit37;
import WTSpec4M.WTSpec4MPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link WTSpec4M.CtrlUnit37} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit37ItemProvider extends wtcItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CtrlUnit37ItemProvider(AdapterFactory adapterFactory) {
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
            addFault__fFault1PropertyDescriptor(object);
            addTimer__tTimer1PropertyDescriptor(object);
            addBhvParam__BhvParam1PropertyDescriptor(object);
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
                 getString("_UI_CtrlUnit37_Input__iInput1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit37_Input__iInput1_feature", "_UI_CtrlUnit37_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT37__INPUT_IINPUT1,
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
                 getString("_UI_CtrlUnit37_Input__iInput2_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit37_Input__iInput2_feature", "_UI_CtrlUnit37_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT37__INPUT_IINPUT2,
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
                 getString("_UI_CtrlUnit37_Input__iInput3_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit37_Input__iInput3_feature", "_UI_CtrlUnit37_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT37__INPUT_IINPUT3,
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
                 getString("_UI_CtrlUnit37_Output__oOutput1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit37_Output__oOutput1_feature", "_UI_CtrlUnit37_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT37__OUTPUT_OOUTPUT1,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Fault fFault1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFault__fFault1PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CtrlUnit37_Fault__fFault1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit37_Fault__fFault1_feature", "_UI_CtrlUnit37_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT37__FAULT_FFAULT1,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Timer tTimer1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTimer__tTimer1PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CtrlUnit37_Timer__tTimer1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit37_Timer__tTimer1_feature", "_UI_CtrlUnit37_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT37__TIMER_TTIMER1,
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
                 getString("_UI_CtrlUnit37_BhvParam__BhvParam1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit37_BhvParam__BhvParam1_feature", "_UI_CtrlUnit37_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT37__BHV_PARAM_BHV_PARAM1,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns CtrlUnit37.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit37"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CtrlUnit37)object).getSysId();
        return label == null || label.length() == 0 ?
            getString("_UI_CtrlUnit37_type") :
            getString("_UI_CtrlUnit37_type") + " " + label;
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

        switch (notification.getFeatureID(CtrlUnit37.class)) {
            case WTSpec4MPackage.CTRL_UNIT37__BHV_PARAM_BHV_PARAM1:
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
