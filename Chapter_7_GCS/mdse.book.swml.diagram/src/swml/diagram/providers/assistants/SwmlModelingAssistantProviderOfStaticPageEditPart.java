/*
 * 
 */
package swml.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import swml.diagram.edit.parts.DetailsPageEditPart;
import swml.diagram.edit.parts.IndexPageEditPart;
import swml.diagram.edit.parts.StaticPageEditPart;
import swml.diagram.providers.SwmlElementTypes;
import swml.diagram.providers.SwmlModelingAssistantProvider;

/**
 * @generated
 */
public class SwmlModelingAssistantProviderOfStaticPageEditPart extends SwmlModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((StaticPageEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(StaticPageEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SwmlElementTypes.NCLink_4001);
		types.add(SwmlElementTypes.CLink_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((StaticPageEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(StaticPageEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof IndexPageEditPart) {
			types.add(SwmlElementTypes.NCLink_4001);
		}
		if (targetEditPart instanceof DetailsPageEditPart) {
			types.add(SwmlElementTypes.NCLink_4001);
		}
		if (targetEditPart instanceof StaticPageEditPart) {
			types.add(SwmlElementTypes.NCLink_4001);
		}
		if (targetEditPart instanceof IndexPageEditPart) {
			types.add(SwmlElementTypes.CLink_4002);
		}
		if (targetEditPart instanceof DetailsPageEditPart) {
			types.add(SwmlElementTypes.CLink_4002);
		}
		if (targetEditPart instanceof StaticPageEditPart) {
			types.add(SwmlElementTypes.CLink_4002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((StaticPageEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(StaticPageEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == SwmlElementTypes.NCLink_4001) {
			types.add(SwmlElementTypes.IndexPage_3001);
			types.add(SwmlElementTypes.DetailsPage_3002);
			types.add(SwmlElementTypes.StaticPage_3003);
		} else if (relationshipType == SwmlElementTypes.CLink_4002) {
			types.add(SwmlElementTypes.IndexPage_3001);
			types.add(SwmlElementTypes.DetailsPage_3002);
			types.add(SwmlElementTypes.StaticPage_3003);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((StaticPageEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(StaticPageEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SwmlElementTypes.NCLink_4001);
		types.add(SwmlElementTypes.CLink_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((StaticPageEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(StaticPageEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == SwmlElementTypes.NCLink_4001) {
			types.add(SwmlElementTypes.IndexPage_3001);
			types.add(SwmlElementTypes.DetailsPage_3002);
			types.add(SwmlElementTypes.StaticPage_3003);
		} else if (relationshipType == SwmlElementTypes.CLink_4002) {
			types.add(SwmlElementTypes.IndexPage_3001);
			types.add(SwmlElementTypes.DetailsPage_3002);
			types.add(SwmlElementTypes.StaticPage_3003);
		}
		return types;
	}

}
