/*
 * 
 */
package swml.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import swml.CLink;
import swml.Class;
import swml.ContentLayer;
import swml.DetailsPage;
import swml.HypertextLayer;
import swml.IndexPage;
import swml.NCLink;
import swml.Page;
import swml.StaticPage;
import swml.SwmlPackage;
import swml.WebModel;
import swml.diagram.edit.parts.CLinkEditPart;
import swml.diagram.edit.parts.ClassEditPart;
import swml.diagram.edit.parts.ContentLayerContentLayerClassesCompartmentEditPart;
import swml.diagram.edit.parts.ContentLayerEditPart;
import swml.diagram.edit.parts.DetailsPageEditPart;
import swml.diagram.edit.parts.HypertextLayerEditPart;
import swml.diagram.edit.parts.HypertextLayerHypertextLayerPagesCompartmentEditPart;
import swml.diagram.edit.parts.IndexPageEditPart;
import swml.diagram.edit.parts.NCLinkEditPart;
import swml.diagram.edit.parts.StaticPageEditPart;
import swml.diagram.edit.parts.WebModelEditPart;
import swml.diagram.providers.SwmlElementTypes;

/**
 * @generated
 */
public class SwmlDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<SwmlNodeDescriptor> getSemanticChildren(View view) {
		switch (SwmlVisualIDRegistry.getVisualID(view)) {
		case WebModelEditPart.VISUAL_ID:
			return getWebModel_1000SemanticChildren(view);
		case HypertextLayerHypertextLayerPagesCompartmentEditPart.VISUAL_ID:
			return getHypertextLayerHypertextLayerPagesCompartment_7001SemanticChildren(view);
		case ContentLayerContentLayerClassesCompartmentEditPart.VISUAL_ID:
			return getContentLayerContentLayerClassesCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SwmlNodeDescriptor> getWebModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		WebModel modelElement = (WebModel) view.getElement();
		LinkedList<SwmlNodeDescriptor> result = new LinkedList<SwmlNodeDescriptor>();
		{
			HypertextLayer childElement = modelElement.getHypertext();
			int visualID = SwmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == HypertextLayerEditPart.VISUAL_ID) {
				result.add(new SwmlNodeDescriptor(childElement, visualID));
			}
		}
		{
			ContentLayer childElement = modelElement.getContent();
			int visualID = SwmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ContentLayerEditPart.VISUAL_ID) {
				result.add(new SwmlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SwmlNodeDescriptor> getHypertextLayerHypertextLayerPagesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		HypertextLayer modelElement = (HypertextLayer) containerView
				.getElement();
		LinkedList<SwmlNodeDescriptor> result = new LinkedList<SwmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPages().iterator(); it.hasNext();) {
			Page childElement = (Page) it.next();
			int visualID = SwmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IndexPageEditPart.VISUAL_ID) {
				result.add(new SwmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DetailsPageEditPart.VISUAL_ID) {
				result.add(new SwmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StaticPageEditPart.VISUAL_ID) {
				result.add(new SwmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SwmlNodeDescriptor> getContentLayerContentLayerClassesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ContentLayer modelElement = (ContentLayer) containerView.getElement();
		LinkedList<SwmlNodeDescriptor> result = new LinkedList<SwmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getClasses().iterator(); it
				.hasNext();) {
			Class childElement = (Class) it.next();
			int visualID = SwmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ClassEditPart.VISUAL_ID) {
				result.add(new SwmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getContainedLinks(View view) {
		switch (SwmlVisualIDRegistry.getVisualID(view)) {
		case WebModelEditPart.VISUAL_ID:
			return getWebModel_1000ContainedLinks(view);
		case HypertextLayerEditPart.VISUAL_ID:
			return getHypertextLayer_2001ContainedLinks(view);
		case ContentLayerEditPart.VISUAL_ID:
			return getContentLayer_2002ContainedLinks(view);
		case IndexPageEditPart.VISUAL_ID:
			return getIndexPage_3001ContainedLinks(view);
		case DetailsPageEditPart.VISUAL_ID:
			return getDetailsPage_3002ContainedLinks(view);
		case StaticPageEditPart.VISUAL_ID:
			return getStaticPage_3003ContainedLinks(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_3004ContainedLinks(view);
		case NCLinkEditPart.VISUAL_ID:
			return getNCLink_4001ContainedLinks(view);
		case CLinkEditPart.VISUAL_ID:
			return getCLink_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getIncomingLinks(View view) {
		switch (SwmlVisualIDRegistry.getVisualID(view)) {
		case HypertextLayerEditPart.VISUAL_ID:
			return getHypertextLayer_2001IncomingLinks(view);
		case ContentLayerEditPart.VISUAL_ID:
			return getContentLayer_2002IncomingLinks(view);
		case IndexPageEditPart.VISUAL_ID:
			return getIndexPage_3001IncomingLinks(view);
		case DetailsPageEditPart.VISUAL_ID:
			return getDetailsPage_3002IncomingLinks(view);
		case StaticPageEditPart.VISUAL_ID:
			return getStaticPage_3003IncomingLinks(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_3004IncomingLinks(view);
		case NCLinkEditPart.VISUAL_ID:
			return getNCLink_4001IncomingLinks(view);
		case CLinkEditPart.VISUAL_ID:
			return getCLink_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getOutgoingLinks(View view) {
		switch (SwmlVisualIDRegistry.getVisualID(view)) {
		case HypertextLayerEditPart.VISUAL_ID:
			return getHypertextLayer_2001OutgoingLinks(view);
		case ContentLayerEditPart.VISUAL_ID:
			return getContentLayer_2002OutgoingLinks(view);
		case IndexPageEditPart.VISUAL_ID:
			return getIndexPage_3001OutgoingLinks(view);
		case DetailsPageEditPart.VISUAL_ID:
			return getDetailsPage_3002OutgoingLinks(view);
		case StaticPageEditPart.VISUAL_ID:
			return getStaticPage_3003OutgoingLinks(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_3004OutgoingLinks(view);
		case NCLinkEditPart.VISUAL_ID:
			return getNCLink_4001OutgoingLinks(view);
		case CLinkEditPart.VISUAL_ID:
			return getCLink_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getWebModel_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getHypertextLayer_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getContentLayer_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getIndexPage_3001ContainedLinks(
			View view) {
		IndexPage modelElement = (IndexPage) view.getElement();
		LinkedList<SwmlLinkDescriptor> result = new LinkedList<SwmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_NCLink_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CLink_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getDetailsPage_3002ContainedLinks(
			View view) {
		DetailsPage modelElement = (DetailsPage) view.getElement();
		LinkedList<SwmlLinkDescriptor> result = new LinkedList<SwmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_NCLink_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CLink_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getStaticPage_3003ContainedLinks(
			View view) {
		StaticPage modelElement = (StaticPage) view.getElement();
		LinkedList<SwmlLinkDescriptor> result = new LinkedList<SwmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_NCLink_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CLink_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getClass_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getNCLink_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getCLink_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getHypertextLayer_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getContentLayer_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getIndexPage_3001IncomingLinks(
			View view) {
		IndexPage modelElement = (IndexPage) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SwmlLinkDescriptor> result = new LinkedList<SwmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NCLink_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CLink_4002(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getDetailsPage_3002IncomingLinks(
			View view) {
		DetailsPage modelElement = (DetailsPage) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SwmlLinkDescriptor> result = new LinkedList<SwmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NCLink_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CLink_4002(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getStaticPage_3003IncomingLinks(
			View view) {
		StaticPage modelElement = (StaticPage) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SwmlLinkDescriptor> result = new LinkedList<SwmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NCLink_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CLink_4002(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getClass_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getNCLink_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getCLink_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getHypertextLayer_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getContentLayer_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getIndexPage_3001OutgoingLinks(
			View view) {
		IndexPage modelElement = (IndexPage) view.getElement();
		LinkedList<SwmlLinkDescriptor> result = new LinkedList<SwmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_NCLink_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CLink_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getDetailsPage_3002OutgoingLinks(
			View view) {
		DetailsPage modelElement = (DetailsPage) view.getElement();
		LinkedList<SwmlLinkDescriptor> result = new LinkedList<SwmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_NCLink_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CLink_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getStaticPage_3003OutgoingLinks(
			View view) {
		StaticPage modelElement = (StaticPage) view.getElement();
		LinkedList<SwmlLinkDescriptor> result = new LinkedList<SwmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_NCLink_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CLink_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getClass_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getNCLink_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SwmlLinkDescriptor> getCLink_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<SwmlLinkDescriptor> getContainedTypeModelFacetLinks_NCLink_4001(
			Page container) {
		LinkedList<SwmlLinkDescriptor> result = new LinkedList<SwmlLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NCLink) {
				continue;
			}
			NCLink link = (NCLink) linkObject;
			if (NCLinkEditPart.VISUAL_ID != SwmlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Page dst = link.getTarget();
			result.add(new SwmlLinkDescriptor(container, dst, link,
					SwmlElementTypes.NCLink_4001, NCLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SwmlLinkDescriptor> getContainedTypeModelFacetLinks_CLink_4002(
			Page container) {
		LinkedList<SwmlLinkDescriptor> result = new LinkedList<SwmlLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof CLink) {
				continue;
			}
			CLink link = (CLink) linkObject;
			if (CLinkEditPart.VISUAL_ID != SwmlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Page dst = link.getTarget();
			result.add(new SwmlLinkDescriptor(container, dst, link,
					SwmlElementTypes.CLink_4002, CLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SwmlLinkDescriptor> getIncomingTypeModelFacetLinks_NCLink_4001(
			Page target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SwmlLinkDescriptor> result = new LinkedList<SwmlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SwmlPackage.eINSTANCE
					.getLink_Target()
					|| false == setting.getEObject() instanceof NCLink) {
				continue;
			}
			NCLink link = (NCLink) setting.getEObject();
			if (NCLinkEditPart.VISUAL_ID != SwmlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Page) {
				continue;
			}
			Page container = (Page) link.eContainer();
			result.add(new SwmlLinkDescriptor(container, target, link,
					SwmlElementTypes.NCLink_4001, NCLinkEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SwmlLinkDescriptor> getIncomingTypeModelFacetLinks_CLink_4002(
			Page target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SwmlLinkDescriptor> result = new LinkedList<SwmlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SwmlPackage.eINSTANCE
					.getLink_Target()
					|| false == setting.getEObject() instanceof CLink) {
				continue;
			}
			CLink link = (CLink) setting.getEObject();
			if (CLinkEditPart.VISUAL_ID != SwmlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Page) {
				continue;
			}
			Page container = (Page) link.eContainer();
			result.add(new SwmlLinkDescriptor(container, target, link,
					SwmlElementTypes.CLink_4002, CLinkEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<SwmlNodeDescriptor> getSemanticChildren(View view) {
			return SwmlDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SwmlLinkDescriptor> getContainedLinks(View view) {
			return SwmlDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SwmlLinkDescriptor> getIncomingLinks(View view) {
			return SwmlDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SwmlLinkDescriptor> getOutgoingLinks(View view) {
			return SwmlDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
