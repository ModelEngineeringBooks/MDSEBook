/*
 * 
 */
package swml.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import swml.diagram.edit.parts.SwmlEditPartFactory;
import swml.diagram.edit.parts.WebModelEditPart;
import swml.diagram.part.SwmlVisualIDRegistry;

/**
 * @generated
 */
public class SwmlEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public SwmlEditPartProvider() {
		super(new SwmlEditPartFactory(), SwmlVisualIDRegistry.TYPED_INSTANCE, WebModelEditPart.MODEL_ID);
	}

}
