/*
 * 
 */
package swml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import swml.diagram.providers.SwmlElementTypes;

/**
 * @generated
 */
public class NCLinkItemSemanticEditPolicy extends
		SwmlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public NCLinkItemSemanticEditPolicy() {
		super(SwmlElementTypes.NCLink_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
