/*
 * 
 */
package swml.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import swml.diagram.providers.SwmlElementTypes;
import swml.diagram.providers.SwmlModelingAssistantProvider;

/**
 * @generated
 */
public class SwmlModelingAssistantProviderOfWebModelEditPart extends SwmlModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SwmlElementTypes.HypertextLayer_2001);
		types.add(SwmlElementTypes.ContentLayer_2002);
		return types;
	}

}
