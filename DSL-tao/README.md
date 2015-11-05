Installation:

	1.	Install DSL-tao [1]. 
	2.	Install EMF-Splitter [2].

Description of the folders:

	DSL-tao:
		•	org.mondo.wt.cstudy:  which contains a slightly modified version of the WTSpec4M50.ecore meta-model.
		It is annotated with a fragmentation strategy. Added one class (CollectionInputOutput) to be able to put
		inputs and outputs in the same file.
		•	org.mondo.wt.cstudy.edit: Edit Project
		•	org.mondo.wt.cstudy.editor: Editor Project
		•	org.mondo.wt.cstudy.modular: Modular Project generated according to Modularity Pattern.
		•	runtime-WTModels: Folder that collects the Eclipse Runtime Application.
			o	WindPower4MONDO: Project that corresponds to the fragmented model WindPower4MONDO.wtspec4m. 
			o	Test: Project to check the tool.
			o	WindTurbinesCS: Project which in the folder model you can find the original model (WindPower4MONDO.wtspec4m).

[1] http://jdelara.github.io/DSL-tao/update-site/
[2] http://antoniogarmendia.github.io/EMF-Splitter/
