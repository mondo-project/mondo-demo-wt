package org.mondo.wt.cstudy.modular.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class XMIModularResourceFactory extends XMIResourceFactoryImpl{
	
	@Override
	public Resource createResource(URI uri) {
		// TODO Auto-generated method stub
		return new XMIModularResource(uri);
	}
	
}

