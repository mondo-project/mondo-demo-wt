This repository contains the **Wind Turbine** demonstrator of the **MONDO Collaboration Framework**.

The MONDO Collaboration Framework, initially developed by Work Package 4 of the MONDO project ([main website](http://www.mondo-project.org/), [source code artifacts](http://mondo-project.github.io/)), enables online and offline collaboration of engineers on models hosted in a repository (currently SVN), with support for seamless access control for security and property-based locking for coordination.

The Wind Turbine industrial case study features a sample modeling language aimed at the model-driven design of Wind Turbine Control Systems. The case study serves to motivate and demonstrate several MONDO results, including the collaboration capabilities described here. 
 
Design, configuration and usage is presented in the MONDO report [D4.4 "Prototype Tool for Collaborative Modeling"](http://api.ning.com/files/zxy*xRp5iQ6LLKU5M6eSyBVlaao5Ny7RJkjcW3*jy-ifXPp-aEnLUWxO0vhL4-FC*HDkG0tp33xFcGZAGT5MBBhg49QwWiB2/D4.4Prototypetoolforcollaboration.pdf).

Relevant repository layout:
 * *Metamodel/* holds the version of the Wind Turbine metamodel used for the demonstrators, as a standard EMF .ecore file.
 * *Model/* holds corresponding sample instance models as standard EMF serialized XMI files. 
 * *Demo/* holds two Eclipse projects as sample repository contents:
  * *demo.project* is a model project that can be edited using MONDO tools 
  * *macl.project* defines the access control and locking rules, along with associated queries.
 * *MONDO-Collab* contains the plugins for the MONDO Collaboration Framework that are specific to the Wind Turbine case study. These are OSGi bundle projects that need to be deployed into the collaboration server and/or the client IDE (for the offline collaboration scenario):
  * Common bundles: *org.mondo.wt.cstudy.metamodel*, *org.mondo.wt.cstudy.metamodel.edit*, *org.mondo.wt.cstudy.metamodel.validation*
  * Client-only bundles: *org.mondo.wt.cstudy.metamodel.merge*, *org.mondo.wt.cstudy.metamodel.offline.editor*, 
  * Server-only components: *org.mondo.wt.cstudy.lens*, *org.mondo.wt.cstudy.metamodel.online.editor*,   *org.mondo.wt.cstudy.online.rap*, and finally *org.mondo.wt.cstudy.online.rap.war* as a web application project.
 
The following external repositories are code dependencies:
 * The [MONDO Collaboration Framework](https://github.com/FTSRG/mondo-collab-framework) is a required core component of the demonstrator. 
 * The optional management interface plugs into the MONDO Server and MONDO Clients of the [MONDO Integrated Platform](https://github.com/mondo-project/mondo-integration).
 
