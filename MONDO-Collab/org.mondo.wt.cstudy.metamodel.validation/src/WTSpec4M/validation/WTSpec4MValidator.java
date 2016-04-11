package WTSpec4M.validation;

import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;


public class WTSpec4MValidator extends EObjectValidator {

	private IBatchValidator batchValidator;
	
	public WTSpec4MValidator(){
		 super();
	        
	        batchValidator =
	            (IBatchValidator) ModelValidationService.getInstance().newValidator(
	                EvaluationMode.BATCH);
	       //includes the live validation constraints also
	        batchValidator.setIncludeLiveConstraints(true);
	        //there won't be any reports on the successfully validated constraints
	        batchValidator.setReportSuccesses(false);
	}

	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(eObject.eClass(), eObject, diagnostics, context);
	}

	@Override
	public boolean validate(EClass eClass, EObject eObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		super.validate(eClass, eObject, diagnostics, context);
		
		IStatus status = Status.OK_STATUS;
        
        if (diagnostics != null) {
            if (!hasProcessed(eObject, context)) {
                
            	ValidationDelegateClientSelector.setisRunning(true);

            	status = batchValidator.validate(
                    eObject,
                    new NullProgressMonitor());
                
            	ValidationDelegateClientSelector.setisRunning(false);

                processed(eObject, context, status);
                
                appendDiagnostics(status, diagnostics);
            }
        }
        
        return status.isOK();

	}
	
	/** Puts the eObject to the processed map
	 * @param eObject The object that has been processed
	 * @param context THe context of the validation
	 * @param status the status of the object
	 */
	private void processed(EObject eObject, Map<Object, Object> context, IStatus status) {
        if (context != null) {
            context.put(eObject, status);
        }
    }
    
    /** Returns true if the eObject or any of its container is in the context Map 
     * It means that it has been processed as the EMF Validation framework evaluates all constraints
     * on all elements of the subtree it is called on.
     * @param eObject The element to be checked that it has been processed
     * @param context the Map that contains the processed element (or their container)
     * @return
     */
    private boolean hasProcessed(EObject eObject, @SuppressWarnings("rawtypes") Map context) {
        boolean result = false;
        
        if (context != null) {
            while (eObject != null) {
                if (context.containsKey(eObject)) {
                    result = true;
                    eObject = null;
                } else {
                    eObject = eObject.eContainer();
                }
            }
        }
        
        return result;
    }

    /**Rewraps the status to the required format
     * @param status the status to be added to the diagnostic chain
     * @param diagnostics The chain that contains the status information
     */
    private void appendDiagnostics(IStatus status, DiagnosticChain diagnostics) {
        if (status.isMultiStatus()) {
            IStatus[] children = status.getChildren();
            
            for (int i = 0; i < children.length; i++) {
                appendDiagnostics(children[i], diagnostics);
            }
        } else if (status instanceof IConstraintStatus) {
            diagnostics.add(new BasicDiagnostic(
                status.getSeverity(),
                status.getPlugin(),
                status.getCode(),
                status.getMessage(),
                ((IConstraintStatus) status).getResultLocus().toArray()));
        }
    }
}