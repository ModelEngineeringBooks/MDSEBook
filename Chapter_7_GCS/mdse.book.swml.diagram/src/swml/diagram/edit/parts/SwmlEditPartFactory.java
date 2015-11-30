/*
 * 
 */
package swml.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import swml.diagram.part.SwmlVisualIDRegistry;

/**
 * @generated
 */
public class SwmlEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (SwmlVisualIDRegistry.getVisualID(view)) {

			case WebModelEditPart.VISUAL_ID:
				return new WebModelEditPart(view);

			case HypertextLayerEditPart.VISUAL_ID:
				return new HypertextLayerEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case ContentLayerEditPart.VISUAL_ID:
				return new ContentLayerEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case IndexPageEditPart.VISUAL_ID:
				return new IndexPageEditPart(view);

			case IndexPageNameEditPart.VISUAL_ID:
				return new IndexPageNameEditPart(view);

			case DetailsPageEditPart.VISUAL_ID:
				return new DetailsPageEditPart(view);

			case DetailsPageNameEditPart.VISUAL_ID:
				return new DetailsPageNameEditPart(view);

			case StaticPageEditPart.VISUAL_ID:
				return new StaticPageEditPart(view);

			case StaticPageNameEditPart.VISUAL_ID:
				return new StaticPageNameEditPart(view);

			case ClassEditPart.VISUAL_ID:
				return new ClassEditPart(view);

			case ClassNameEditPart.VISUAL_ID:
				return new ClassNameEditPart(view);

			case HypertextLayerHypertextLayerPagesCompartmentEditPart.VISUAL_ID:
				return new HypertextLayerHypertextLayerPagesCompartmentEditPart(
						view);

			case ContentLayerContentLayerClassesCompartmentEditPart.VISUAL_ID:
				return new ContentLayerContentLayerClassesCompartmentEditPart(
						view);

			case NCLinkEditPart.VISUAL_ID:
				return new NCLinkEditPart(view);

			case CLinkEditPart.VISUAL_ID:
				return new CLinkEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
