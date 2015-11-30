/*
 * 
 */
package swml.diagram.providers;

import swml.diagram.part.SwmlDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = SwmlDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			SwmlDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
