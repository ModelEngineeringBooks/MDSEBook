/*
 * 
 */
package swml.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import swml.WebModel;
import swml.diagram.edit.parts.CLinkEditPart;
import swml.diagram.edit.parts.ClassEditPart;
import swml.diagram.edit.parts.ClassNameEditPart;
import swml.diagram.edit.parts.ContentLayerEditPart;
import swml.diagram.edit.parts.DetailsPageEditPart;
import swml.diagram.edit.parts.DetailsPageNameEditPart;
import swml.diagram.edit.parts.HypertextLayerEditPart;
import swml.diagram.edit.parts.IndexPageEditPart;
import swml.diagram.edit.parts.IndexPageNameEditPart;
import swml.diagram.edit.parts.NCLinkEditPart;
import swml.diagram.edit.parts.StaticPageEditPart;
import swml.diagram.edit.parts.StaticPageNameEditPart;
import swml.diagram.edit.parts.WebModelEditPart;
import swml.diagram.edit.parts.WrappingLabel2EditPart;
import swml.diagram.edit.parts.WrappingLabelEditPart;
import swml.diagram.part.SwmlDiagramEditorPlugin;
import swml.diagram.part.SwmlVisualIDRegistry;
import swml.diagram.providers.SwmlElementTypes;
import swml.diagram.providers.SwmlParserProvider;

/**
 * @generated
 */
public class SwmlNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		SwmlDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		SwmlDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof SwmlNavigatorItem
				&& !isOwnView(((SwmlNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof SwmlNavigatorGroup) {
			SwmlNavigatorGroup group = (SwmlNavigatorGroup) element;
			return SwmlDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof SwmlNavigatorItem) {
			SwmlNavigatorItem navigatorItem = (SwmlNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (SwmlVisualIDRegistry.getVisualID(view)) {
		case HypertextLayerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.mdse-book.org/swml/?HypertextLayer", SwmlElementTypes.HypertextLayer_2001); //$NON-NLS-1$
		case ClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mdse-book.org/swml/?Class", SwmlElementTypes.Class_3004); //$NON-NLS-1$
		case DetailsPageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mdse-book.org/swml/?DetailsPage", SwmlElementTypes.DetailsPage_3002); //$NON-NLS-1$
		case WebModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.mdse-book.org/swml/?WebModel", SwmlElementTypes.WebModel_1000); //$NON-NLS-1$
		case CLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.mdse-book.org/swml/?CLink", SwmlElementTypes.CLink_4002); //$NON-NLS-1$
		case NCLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.mdse-book.org/swml/?NCLink", SwmlElementTypes.NCLink_4001); //$NON-NLS-1$
		case StaticPageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mdse-book.org/swml/?StaticPage", SwmlElementTypes.StaticPage_3003); //$NON-NLS-1$
		case IndexPageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.mdse-book.org/swml/?IndexPage", SwmlElementTypes.IndexPage_3001); //$NON-NLS-1$
		case ContentLayerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.mdse-book.org/swml/?ContentLayer", SwmlElementTypes.ContentLayer_2002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = SwmlDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& SwmlElementTypes.isKnownElementType(elementType)) {
			image = SwmlElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof SwmlNavigatorGroup) {
			SwmlNavigatorGroup group = (SwmlNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof SwmlNavigatorItem) {
			SwmlNavigatorItem navigatorItem = (SwmlNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (SwmlVisualIDRegistry.getVisualID(view)) {
		case HypertextLayerEditPart.VISUAL_ID:
			return getHypertextLayer_2001Text(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_3004Text(view);
		case DetailsPageEditPart.VISUAL_ID:
			return getDetailsPage_3002Text(view);
		case WebModelEditPart.VISUAL_ID:
			return getWebModel_1000Text(view);
		case CLinkEditPart.VISUAL_ID:
			return getCLink_4002Text(view);
		case NCLinkEditPart.VISUAL_ID:
			return getNCLink_4001Text(view);
		case StaticPageEditPart.VISUAL_ID:
			return getStaticPage_3003Text(view);
		case IndexPageEditPart.VISUAL_ID:
			return getIndexPage_3001Text(view);
		case ContentLayerEditPart.VISUAL_ID:
			return getContentLayer_2002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getStaticPage_3003Text(View view) {
		IParser parser = SwmlParserProvider.getParser(
				SwmlElementTypes.StaticPage_3003,
				view.getElement() != null ? view.getElement() : view,
				SwmlVisualIDRegistry.getType(StaticPageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SwmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWebModel_1000Text(View view) {
		WebModel domainModelElement = (WebModel) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			SwmlDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDetailsPage_3002Text(View view) {
		IParser parser = SwmlParserProvider
				.getParser(SwmlElementTypes.DetailsPage_3002,
						view.getElement() != null ? view.getElement() : view,
						SwmlVisualIDRegistry
								.getType(DetailsPageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SwmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNCLink_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHypertextLayer_2001Text(View view) {
		IParser parser = SwmlParserProvider.getParser(
				SwmlElementTypes.HypertextLayer_2001,
				view.getElement() != null ? view.getElement() : view,
				SwmlVisualIDRegistry.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SwmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClass_3004Text(View view) {
		IParser parser = SwmlParserProvider.getParser(
				SwmlElementTypes.Class_3004,
				view.getElement() != null ? view.getElement() : view,
				SwmlVisualIDRegistry.getType(ClassNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SwmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCLink_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getContentLayer_2002Text(View view) {
		IParser parser = SwmlParserProvider.getParser(
				SwmlElementTypes.ContentLayer_2002,
				view.getElement() != null ? view.getElement() : view,
				SwmlVisualIDRegistry.getType(WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SwmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndexPage_3001Text(View view) {
		IParser parser = SwmlParserProvider.getParser(
				SwmlElementTypes.IndexPage_3001,
				view.getElement() != null ? view.getElement() : view,
				SwmlVisualIDRegistry.getType(IndexPageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SwmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return WebModelEditPart.MODEL_ID.equals(SwmlVisualIDRegistry
				.getModelID(view));
	}

}
