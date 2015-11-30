/*
 * 
 */
package swml.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import swml.diagram.edit.commands.CLinkCreateCommand;
import swml.diagram.edit.commands.CLinkReorientCommand;
import swml.diagram.edit.commands.NCLinkCreateCommand;
import swml.diagram.edit.commands.NCLinkReorientCommand;
import swml.diagram.edit.parts.CLinkEditPart;
import swml.diagram.edit.parts.NCLinkEditPart;
import swml.diagram.part.SwmlVisualIDRegistry;
import swml.diagram.providers.SwmlElementTypes;

/**
 * @generated
 */
public class StaticPageItemSemanticEditPolicy extends
		SwmlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StaticPageItemSemanticEditPolicy() {
		super(SwmlElementTypes.StaticPage_3003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (SwmlVisualIDRegistry.getVisualID(incomingLink) == NCLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (SwmlVisualIDRegistry.getVisualID(incomingLink) == CLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (SwmlVisualIDRegistry.getVisualID(outgoingLink) == NCLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (SwmlVisualIDRegistry.getVisualID(outgoingLink) == CLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (SwmlElementTypes.NCLink_4001 == req.getElementType()) {
			return getGEFWrapper(new NCLinkCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (SwmlElementTypes.CLink_4002 == req.getElementType()) {
			return getGEFWrapper(new CLinkCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (SwmlElementTypes.NCLink_4001 == req.getElementType()) {
			return getGEFWrapper(new NCLinkCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (SwmlElementTypes.CLink_4002 == req.getElementType()) {
			return getGEFWrapper(new CLinkCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case NCLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new NCLinkReorientCommand(req));
		case CLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new CLinkReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
