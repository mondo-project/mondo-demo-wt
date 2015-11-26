/**
 */
package WTSpec4M.provider;


import WTSpec4M.CtrlUnit10;
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
 * This is the item provider adapter for a {@link WTSpec4M.CtrlUnit10} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit10ItemProvider extends wtcItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CtrlUnit10ItemProvider(AdapterFactory adapterFactory) {
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
            addOutput__oOutput1PropertyDescriptor(object);
            addParameter__pParam1PropertyDescriptor(object);
            addParameter__pParam2PropertyDescriptor(object);
            addParameter__pParam3PropertyDescriptor(object);
            addParameter__pParam4PropertyDescriptor(object);
            addParameter__pParam5PropertyDescriptor(object);
            addParameter__pParam6PropertyDescriptor(object);
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
                 getString("_UI_CtrlUnit10_Input__iInput1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit10_Input__iInput1_feature", "_UI_CtrlUnit10_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT10__INPUT_IINPUT1,
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
                 getString("_UI_CtrlUnit10_Output__oOutput1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit10_Output__oOutput1_feature", "_UI_CtrlUnit10_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT10__OUTPUT_OOUTPUT1,
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
                 getString("_UI_CtrlUnit10_Parameter__pParam1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit10_Parameter__pParam1_feature", "_UI_CtrlUnit10_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT10__PARAMETER_PPARAM1,
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
                 getString("_UI_CtrlUnit10_Parameter__pParam2_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit10_Parameter__pParam2_feature", "_UI_CtrlUnit10_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT10__PARAMETER_PPARAM2,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Parameter pParam3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addParameter__pParam3PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CtrlUnit10_Parameter__pParam3_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit10_Parameter__pParam3_feature", "_UI_CtrlUnit10_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT10__PARAMETER_PPARAM3,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Parameter pParam4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addParameter__pParam4PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CtrlUnit10_Parameter__pParam4_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit10_Parameter__pParam4_feature", "_UI_CtrlUnit10_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT10__PARAMETER_PPARAM4,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Parameter pParam5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addParameter__pParam5PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CtrlUnit10_Parameter__pParam5_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit10_Parameter__pParam5_feature", "_UI_CtrlUnit10_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT10__PARAMETER_PPARAM5,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Parameter pParam6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addParameter__pParam6PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CtrlUnit10_Parameter__pParam6_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit10_Parameter__pParam6_feature", "_UI_CtrlUnit10_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT10__PARAMETER_PPARAM6,
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
                 getString("_UI_CtrlUnit10_BhvParam__BhvParam1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit10_BhvParam__BhvParam1_feature", "_UI_CtrlUnit10_type"),
                 WTSpec4MPackage.Literals.CTRL_UNIT10__BHV_PARAM_BHV_PARAM1,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns CtrlUnit10.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit10"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CtrlUnit10)object).getSysId();
        return label == null || label.length() == 0 ?
            getString("_UI_CtrlUnit10_type") :
            getString("_UI_CtrlUnit10_type") + " " + label;
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

        switch (notification.getFeatureID(CtrlUnit10.class)) {
            case WTSpec4MPackage.CTRL_UNIT10__BHV_PARAM_BHV_PARAM1:
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
