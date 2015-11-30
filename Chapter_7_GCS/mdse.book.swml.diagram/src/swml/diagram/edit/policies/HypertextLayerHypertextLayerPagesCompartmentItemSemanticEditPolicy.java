/*
 * 
 */
package swml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import swml.diagram.edit.commands.DetailsPageCreateCommand;
import swml.diagram.edit.commands.IndexPageCreateCommand;
import swml.diagram.edit.commands.StaticPageCreateCommand;
import swml.diagram.providers.SwmlElementTypes;

/**
 * @generated
 */
public class HypertextLayerHypertextLayerPagesCompartmentItemSemanticEditPolicy
		extends SwmlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HypertextLayerHypertextLayerPagesCompartmentItemSemanticEditPolicy() {
		super(SwmlElementTypes.HypertextLayer_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SwmlElementTypes.IndexPage_3001 == req.getElementType()) {
			return getGEFWrapper(new IndexPageCreateCommand(req));
		}
		if (SwmlElementTypes.DetailsPage_3002 == req.getElementType()) {
			return getGEFWrapper(new DetailsPageCreateCommand(req));
		}
		if (SwmlElementTypes.StaticPage_3003 == req.getElementType()) {
			return getGEFWrapper(new StaticPageCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
