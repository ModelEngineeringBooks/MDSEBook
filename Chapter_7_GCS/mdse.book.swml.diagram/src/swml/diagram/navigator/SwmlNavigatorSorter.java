/*
 * 
 */
package swml.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import swml.diagram.part.SwmlVisualIDRegistry;

/**
 * @generated
 */
public class SwmlNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7004;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof SwmlNavigatorItem) {
			SwmlNavigatorItem item = (SwmlNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return SwmlVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
