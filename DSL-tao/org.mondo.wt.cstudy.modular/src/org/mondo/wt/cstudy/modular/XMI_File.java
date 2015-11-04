
package org.mondo.wt.cstudy.modular;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

public class XMI_File {
	
	private URI fileURI;
	private ResourceSet file_reset;
	private Resource file_res;
	private EObject root;

	public XMI_File(){
		fileURI=null;
		file_reset=null;
		file_res=null;
		root=null;		
	}
	
	public XMI_File(URI fileURI, boolean onDemand){
		this.fileURI = fileURI;
		// Create a resource set
		this.file_reset = new ResourceSetImpl();
		//Create a Resource for this file
		this.file_res = file_reset.getResource(fileURI, onDemand);		
	}
	
	public void Create_XMI_File(URI fileURI) throws IOException{ 
		this.fileURI = fileURI;
		// Create a resource set
		this.file_reset = new ResourceSetImpl();
		//Create a Resource for this file
		this.file_res = file_reset.createResource(fileURI);	
		// Save the contents of the resource to the file system.
        Map<Object, Object> options = new HashMap<Object, Object>();
        options.put(XMLResource.OPTION_ENCODING, "UTF-8");
        this.file_res.save(options);
	}

	//To share the same ResourceSetImpl(Important for Cross-document References)
	public XMI_File(URI fileURI, ResourceSet rs) throws IOException{
		
		this.fileURI = fileURI;
		//Create a Resource for this file
		this.file_res = rs.getResource(fileURI, true);      		
	}
	
	//Create Resource
	public XMI_File(URI fileuri){
		this.fileURI = fileuri;
		// Create a resource set
		this.file_reset = new ResourceSetImpl();
		//Create a Resource for this file
		this.file_res = file_reset.createResource(fileURI);
	}
	
	
	public EObject Get_Root() throws IOException{
		
		if(root==null)
		{
			// Create a resource set
			file_reset = new ResourceSetImpl();
			//Create a Resource for this file
			file_res = file_reset.getResource(fileURI, true);			
			root = file_res.getAllContents().next();
		}
		return root;			
	}
	
	public void Save_XMI() throws IOException{
		file_res.save(null);		
	}
	
	static public XMI_File Get_Create_XMI(URI fileURI, EObject root) throws IOException{
		
		// Create a resource set
        ResourceSet resourceSet = new ResourceSetImpl();
		//Create a Resource for this file
		Resource res = resourceSet.createResource(fileURI);
		//Add root
		res.getContents().add(root);		
		// Save the contents of the resource to the file system.
        Map<Object, Object> options = new HashMap<Object, Object>();
        options.put(XMLResource.OPTION_ENCODING, "UTF-8");
        res.save(options);
        
        XMI_File fil = new XMI_File();
        //Set Objects
        fil.setFileURI(fileURI);
        fil.setFile_res(res);
        fil.setFile_reset(resourceSet);       
        
        return fil;		
	}	
	
	static public void Create(URI fileURI, EObject root) throws IOException{
		
		// Create a resource set
        ResourceSet resourceSet = new ResourceSetImpl();
		//Create a Resource for this file
		Resource res = resourceSet.createResource(fileURI);
		//Add root
		res.getContents().add(root);		
		// Save the contents of the resource to the file system.
        Map<Object, Object> options = new HashMap<Object, Object>();
        options.put(XMLResource.OPTION_ENCODING, "UTF-8");
        res.save(options);		
	}	
	
	//Getters y Setters 
	
	public URI getFileURI() {
		return fileURI;
	}

	public void setFileURI(URI fileURI) {
		this.fileURI = fileURI;
	}

	public ResourceSet getFile_reset() {		
		return file_res.getResourceSet();
	}

	public void setFile_reset(ResourceSet file_reset) {
		this.file_reset = file_reset;
	}

	public Resource getFile_res() {
		return file_res;
	}

	public void setFile_res(Resource file_res) {
		this.file_res = file_res;
	}		

}
	

