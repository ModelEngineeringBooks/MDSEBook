
/*
 * 
 */
package swml.diagram.sheet;

import org.eclipse.gmf.tooling.runtime.sheet.DefaultPropertySection;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

/**
 * @generated
 */
public class SwmlPropertySection extends DefaultPropertySection implements IPropertySourceProvider {

	/**
	* Modify/unwrap selection.
	* @generated
	*/
	@Override
	protected Object transformSelection(Object selected) {
		selected = /*super.*/transformSelectionToDomain(selected);
		return selected;
	}

}
