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
public class CLinkItemSemanticEditPolicy extends SwmlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CLinkItemSemanticEditPolicy() {
		super(SwmlElementTypes.CLink_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
