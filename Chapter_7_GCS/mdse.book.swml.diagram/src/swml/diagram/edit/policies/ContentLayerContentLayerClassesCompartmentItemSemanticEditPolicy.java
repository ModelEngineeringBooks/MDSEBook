/*
 * 
 */
package swml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import swml.diagram.edit.commands.ClassCreateCommand;
import swml.diagram.providers.SwmlElementTypes;

/**
 * @generated
 */
public class ContentLayerContentLayerClassesCompartmentItemSemanticEditPolicy
		extends SwmlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContentLayerContentLayerClassesCompartmentItemSemanticEditPolicy() {
		super(SwmlElementTypes.ContentLayer_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SwmlElementTypes.Class_3004 == req.getElementType()) {
			return getGEFWrapper(new ClassCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
