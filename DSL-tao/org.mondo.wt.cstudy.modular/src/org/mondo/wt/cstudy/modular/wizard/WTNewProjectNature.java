
package org.mondo.wt.cstudy.modular.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

public class WTNewProjectNature implements IProjectNature {

    private IProject project;
	public static final String ID = "org.mondo.wt.cstudy.modular.ModularNature";

    public void configure() throws CoreException {
       // Add nature-specific information
       // for the project, such as adding a builder
       // to a project's build spec.
    }
    public void deconfigure() throws CoreException {
       // Remove the nature-specific information here.
    }
    public IProject getProject() {
       return project;
    }
    public void setProject(IProject value) {
       project = value;
    }

}
