/*
 * 
 */
package swml.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import swml.SwmlPackage;
import swml.diagram.edit.parts.CLinkEditPart;
import swml.diagram.edit.parts.ClassEditPart;
import swml.diagram.edit.parts.ContentLayerEditPart;
import swml.diagram.edit.parts.DetailsPageEditPart;
import swml.diagram.edit.parts.HypertextLayerEditPart;
import swml.diagram.edit.parts.IndexPageEditPart;
import swml.diagram.edit.parts.NCLinkEditPart;
import swml.diagram.edit.parts.StaticPageEditPart;
import swml.diagram.edit.parts.WebModelEditPart;
import swml.diagram.part.SwmlDiagramEditorPlugin;

/**
 * @generated
 */
public class SwmlElementTypes {

	/**
	* @generated
	*/
	private SwmlElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			SwmlDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType WebModel_1000 = getElementType("mdse.book.swml.diagram.WebModel_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType HypertextLayer_2001 = getElementType("mdse.book.swml.diagram.HypertextLayer_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContentLayer_2002 = getElementType("mdse.book.swml.diagram.ContentLayer_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IndexPage_3001 = getElementType("mdse.book.swml.diagram.IndexPage_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DetailsPage_3002 = getElementType("mdse.book.swml.diagram.DetailsPage_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType StaticPage_3003 = getElementType("mdse.book.swml.diagram.StaticPage_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Class_3004 = getElementType("mdse.book.swml.diagram.Class_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NCLink_4001 = getElementType("mdse.book.swml.diagram.NCLink_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CLink_4002 = getElementType("mdse.book.swml.diagram.CLink_4002"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(WebModel_1000, SwmlPackage.eINSTANCE.getWebModel());

			elements.put(HypertextLayer_2001, SwmlPackage.eINSTANCE.getHypertextLayer());

			elements.put(ContentLayer_2002, SwmlPackage.eINSTANCE.getContentLayer());

			elements.put(IndexPage_3001, SwmlPackage.eINSTANCE.getIndexPage());

			elements.put(DetailsPage_3002, SwmlPackage.eINSTANCE.getDetailsPage());

			elements.put(StaticPage_3003, SwmlPackage.eINSTANCE.getStaticPage());

			elements.put(Class_3004, SwmlPackage.eINSTANCE.getClass_());

			elements.put(NCLink_4001, SwmlPackage.eINSTANCE.getNCLink());

			elements.put(CLink_4002, SwmlPackage.eINSTANCE.getCLink());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(WebModel_1000);
			KNOWN_ELEMENT_TYPES.add(HypertextLayer_2001);
			KNOWN_ELEMENT_TYPES.add(ContentLayer_2002);
			KNOWN_ELEMENT_TYPES.add(IndexPage_3001);
			KNOWN_ELEMENT_TYPES.add(DetailsPage_3002);
			KNOWN_ELEMENT_TYPES.add(StaticPage_3003);
			KNOWN_ELEMENT_TYPES.add(Class_3004);
			KNOWN_ELEMENT_TYPES.add(NCLink_4001);
			KNOWN_ELEMENT_TYPES.add(CLink_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case WebModelEditPart.VISUAL_ID:
			return WebModel_1000;
		case HypertextLayerEditPart.VISUAL_ID:
			return HypertextLayer_2001;
		case ContentLayerEditPart.VISUAL_ID:
			return ContentLayer_2002;
		case IndexPageEditPart.VISUAL_ID:
			return IndexPage_3001;
		case DetailsPageEditPart.VISUAL_ID:
			return DetailsPage_3002;
		case StaticPageEditPart.VISUAL_ID:
			return StaticPage_3003;
		case ClassEditPart.VISUAL_ID:
			return Class_3004;
		case NCLinkEditPart.VISUAL_ID:
			return NCLink_4001;
		case CLinkEditPart.VISUAL_ID:
			return CLink_4002;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return swml.diagram.providers.SwmlElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return swml.diagram.providers.SwmlElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return swml.diagram.providers.SwmlElementTypes.getElement(elementTypeAdapter);
		}
	};

}
