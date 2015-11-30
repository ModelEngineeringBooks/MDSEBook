/*
 * 
 */
package swml.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import swml.SwmlPackage;
import swml.diagram.edit.parts.ClassNameEditPart;
import swml.diagram.edit.parts.DetailsPageNameEditPart;
import swml.diagram.edit.parts.IndexPageNameEditPart;
import swml.diagram.edit.parts.StaticPageNameEditPart;
import swml.diagram.edit.parts.WrappingLabel2EditPart;
import swml.diagram.edit.parts.WrappingLabelEditPart;
import swml.diagram.parsers.MessageFormatParser;
import swml.diagram.part.SwmlVisualIDRegistry;

/**
 * @generated
 */
public class SwmlParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser hypertextLayerLabel_5004Parser;

	/**
	 * @generated
	 */
	private IParser getHypertextLayerLabel_5004Parser() {
		if (hypertextLayerLabel_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {

			};
			MessageFormatParser parser = new MessageFormatParser(features);
			hypertextLayerLabel_5004Parser = parser;
		}
		return hypertextLayerLabel_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser contentLayerLabel_5006Parser;

	/**
	 * @generated
	 */
	private IParser getContentLayerLabel_5006Parser() {
		if (contentLayerLabel_5006Parser == null) {
			EAttribute[] features = new EAttribute[] {

			};
			MessageFormatParser parser = new MessageFormatParser(features);
			contentLayerLabel_5006Parser = parser;
		}
		return contentLayerLabel_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser indexPageName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getIndexPageName_5001Parser() {
		if (indexPageName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { SwmlPackage.eINSTANCE
					.getPage_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			indexPageName_5001Parser = parser;
		}
		return indexPageName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser detailsPageName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getDetailsPageName_5002Parser() {
		if (detailsPageName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { SwmlPackage.eINSTANCE
					.getPage_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			detailsPageName_5002Parser = parser;
		}
		return detailsPageName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser staticPageName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getStaticPageName_5003Parser() {
		if (staticPageName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { SwmlPackage.eINSTANCE
					.getPage_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			staticPageName_5003Parser = parser;
		}
		return staticPageName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser className_5005Parser;

	/**
	 * @generated
	 */
	private IParser getClassName_5005Parser() {
		if (className_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { SwmlPackage.eINSTANCE
					.getClass_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			className_5005Parser = parser;
		}
		return className_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case WrappingLabelEditPart.VISUAL_ID:
			return getHypertextLayerLabel_5004Parser();
		case WrappingLabel2EditPart.VISUAL_ID:
			return getContentLayerLabel_5006Parser();
		case IndexPageNameEditPart.VISUAL_ID:
			return getIndexPageName_5001Parser();
		case DetailsPageNameEditPart.VISUAL_ID:
			return getDetailsPageName_5002Parser();
		case StaticPageNameEditPart.VISUAL_ID:
			return getStaticPageName_5003Parser();
		case ClassNameEditPart.VISUAL_ID:
			return getClassName_5005Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(SwmlVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(SwmlVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (SwmlElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
