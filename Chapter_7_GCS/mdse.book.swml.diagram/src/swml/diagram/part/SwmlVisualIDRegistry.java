/*
 * 
 */
package swml.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import swml.SwmlPackage;
import swml.WebModel;
import swml.diagram.edit.parts.CLinkEditPart;
import swml.diagram.edit.parts.ClassEditPart;
import swml.diagram.edit.parts.ClassNameEditPart;
import swml.diagram.edit.parts.ContentLayerContentLayerClassesCompartmentEditPart;
import swml.diagram.edit.parts.ContentLayerEditPart;
import swml.diagram.edit.parts.DetailsPageEditPart;
import swml.diagram.edit.parts.DetailsPageNameEditPart;
import swml.diagram.edit.parts.HypertextLayerEditPart;
import swml.diagram.edit.parts.HypertextLayerHypertextLayerPagesCompartmentEditPart;
import swml.diagram.edit.parts.IndexPageEditPart;
import swml.diagram.edit.parts.IndexPageNameEditPart;
import swml.diagram.edit.parts.NCLinkEditPart;
import swml.diagram.edit.parts.StaticPageEditPart;
import swml.diagram.edit.parts.StaticPageNameEditPart;
import swml.diagram.edit.parts.WebModelEditPart;
import swml.diagram.edit.parts.WrappingLabel2EditPart;
import swml.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class SwmlVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "mdse.book.swml.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (WebModelEditPart.MODEL_ID.equals(view.getType())) {
				return WebModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return swml.diagram.part.SwmlVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				SwmlDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (SwmlPackage.eINSTANCE.getWebModel().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((WebModel) domainElement)) {
			return WebModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = swml.diagram.part.SwmlVisualIDRegistry
				.getModelID(containerView);
		if (!WebModelEditPart.MODEL_ID.equals(containerModelID)
				&& !"swml".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (WebModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = swml.diagram.part.SwmlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WebModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case WebModelEditPart.VISUAL_ID:
			if (SwmlPackage.eINSTANCE.getHypertextLayer().isSuperTypeOf(
					domainElement.eClass())) {
				return HypertextLayerEditPart.VISUAL_ID;
			}
			if (SwmlPackage.eINSTANCE.getContentLayer().isSuperTypeOf(
					domainElement.eClass())) {
				return ContentLayerEditPart.VISUAL_ID;
			}
			break;
		case HypertextLayerHypertextLayerPagesCompartmentEditPart.VISUAL_ID:
			if (SwmlPackage.eINSTANCE.getIndexPage().isSuperTypeOf(
					domainElement.eClass())) {
				return IndexPageEditPart.VISUAL_ID;
			}
			if (SwmlPackage.eINSTANCE.getDetailsPage().isSuperTypeOf(
					domainElement.eClass())) {
				return DetailsPageEditPart.VISUAL_ID;
			}
			if (SwmlPackage.eINSTANCE.getStaticPage().isSuperTypeOf(
					domainElement.eClass())) {
				return StaticPageEditPart.VISUAL_ID;
			}
			break;
		case ContentLayerContentLayerClassesCompartmentEditPart.VISUAL_ID:
			if (SwmlPackage.eINSTANCE.getClass_().isSuperTypeOf(
					domainElement.eClass())) {
				return ClassEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = swml.diagram.part.SwmlVisualIDRegistry
				.getModelID(containerView);
		if (!WebModelEditPart.MODEL_ID.equals(containerModelID)
				&& !"swml".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (WebModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = swml.diagram.part.SwmlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WebModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case WebModelEditPart.VISUAL_ID:
			if (HypertextLayerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContentLayerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HypertextLayerEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HypertextLayerHypertextLayerPagesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContentLayerEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContentLayerContentLayerClassesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexPageEditPart.VISUAL_ID:
			if (IndexPageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetailsPageEditPart.VISUAL_ID:
			if (DetailsPageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StaticPageEditPart.VISUAL_ID:
			if (StaticPageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassEditPart.VISUAL_ID:
			if (ClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HypertextLayerHypertextLayerPagesCompartmentEditPart.VISUAL_ID:
			if (IndexPageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DetailsPageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StaticPageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContentLayerContentLayerClassesCompartmentEditPart.VISUAL_ID:
			if (ClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (SwmlPackage.eINSTANCE.getNCLink().isSuperTypeOf(
				domainElement.eClass())) {
			return NCLinkEditPart.VISUAL_ID;
		}
		if (SwmlPackage.eINSTANCE.getCLink().isSuperTypeOf(
				domainElement.eClass())) {
			return CLinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(WebModel element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case HypertextLayerHypertextLayerPagesCompartmentEditPart.VISUAL_ID:
		case ContentLayerContentLayerClassesCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case WebModelEditPart.VISUAL_ID:
			return false;
		case IndexPageEditPart.VISUAL_ID:
		case DetailsPageEditPart.VISUAL_ID:
		case StaticPageEditPart.VISUAL_ID:
		case ClassEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return swml.diagram.part.SwmlVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return swml.diagram.part.SwmlVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return swml.diagram.part.SwmlVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return swml.diagram.part.SwmlVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return swml.diagram.part.SwmlVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return swml.diagram.part.SwmlVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
