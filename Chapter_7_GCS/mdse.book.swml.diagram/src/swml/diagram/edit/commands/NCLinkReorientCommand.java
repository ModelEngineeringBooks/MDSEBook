/*
 * 
 */
package swml.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import swml.NCLink;
import swml.Page;
import swml.diagram.edit.policies.SwmlBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class NCLinkReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public NCLinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof NCLink) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Page && newEnd instanceof Page)) {
			return false;
		}
		Page target = getLink().getTarget();
		return SwmlBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistNCLink_4001(getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Page && newEnd instanceof Page)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Page)) {
			return false;
		}
		Page source = (Page) getLink().eContainer();
		return SwmlBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistNCLink_4001(getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getLinks().remove(getLink());
		getNewSource().getLinks().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected NCLink getLink() {
		return (NCLink) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Page getOldSource() {
		return (Page) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Page getNewSource() {
		return (Page) newEnd;
	}

	/**
	 * @generated
	 */
	protected Page getOldTarget() {
		return (Page) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Page getNewTarget() {
		return (Page) newEnd;
	}
}
