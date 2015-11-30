/*
 * 
 */
package swml.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import swml.diagram.providers.SwmlElementTypes;

/**
 * @generated
 */
public class SwmlPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createClass1CreationTool());
		paletteContainer.add(createContentLayer2CreationTool());
		paletteContainer.add(createDetailsPage3CreationTool());
		paletteContainer.add(createHypertextLayer4CreationTool());
		paletteContainer.add(createIndexPage5CreationTool());
		paletteContainer.add(createStaticPage6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createCLink1CreationTool());
		paletteContainer.add(createNCLink2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClass1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Class1CreationTool_title,
				Messages.Class1CreationTool_desc,
				Collections.singletonList(SwmlElementTypes.Class_3004));
		entry.setId("createClass1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SwmlElementTypes
				.getImageDescriptor(SwmlElementTypes.Class_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContentLayer2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ContentLayer2CreationTool_title,
				Messages.ContentLayer2CreationTool_desc,
				Collections.singletonList(SwmlElementTypes.ContentLayer_2002));
		entry.setId("createContentLayer2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SwmlElementTypes
				.getImageDescriptor(SwmlElementTypes.ContentLayer_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDetailsPage3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DetailsPage3CreationTool_title,
				Messages.DetailsPage3CreationTool_desc,
				Collections.singletonList(SwmlElementTypes.DetailsPage_3002));
		entry.setId("createDetailsPage3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SwmlElementTypes
				.getImageDescriptor(SwmlElementTypes.DetailsPage_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHypertextLayer4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.HypertextLayer4CreationTool_title,
				Messages.HypertextLayer4CreationTool_desc,
				Collections.singletonList(SwmlElementTypes.HypertextLayer_2001));
		entry.setId("createHypertextLayer4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SwmlElementTypes
				.getImageDescriptor(SwmlElementTypes.HypertextLayer_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIndexPage5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IndexPage5CreationTool_title,
				Messages.IndexPage5CreationTool_desc,
				Collections.singletonList(SwmlElementTypes.IndexPage_3001));
		entry.setId("createIndexPage5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SwmlElementTypes
				.getImageDescriptor(SwmlElementTypes.IndexPage_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStaticPage6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StaticPage6CreationTool_title,
				Messages.StaticPage6CreationTool_desc,
				Collections.singletonList(SwmlElementTypes.StaticPage_3003));
		entry.setId("createStaticPage6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SwmlElementTypes
				.getImageDescriptor(SwmlElementTypes.StaticPage_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCLink1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.CLink1CreationTool_title,
				Messages.CLink1CreationTool_desc,
				Collections.singletonList(SwmlElementTypes.CLink_4002));
		entry.setId("createCLink1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SwmlElementTypes
				.getImageDescriptor(SwmlElementTypes.CLink_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNCLink2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.NCLink2CreationTool_title,
				Messages.NCLink2CreationTool_desc,
				Collections.singletonList(SwmlElementTypes.NCLink_4001));
		entry.setId("createNCLink2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SwmlElementTypes
				.getImageDescriptor(SwmlElementTypes.NCLink_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
