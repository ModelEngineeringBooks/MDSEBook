package mdse.book.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import mdse.book.sWML.Attribute;
import mdse.book.sWML.ContentLayer;
import mdse.book.sWML.HypertextLayer;
import mdse.book.sWML.IndexPage;
import mdse.book.sWML.SWMLPackage;
import mdse.book.sWML.WebModel;
import mdse.book.services.SWMLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractSWMLSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected SWMLGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SWMLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SWMLPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case SWMLPackage.CLASS:
				if(context == grammarAccess.getClassRule()) {
					sequence_Class(context, (mdse.book.sWML.Class) semanticObject); 
					return; 
				}
				else break;
			case SWMLPackage.CONTENT_LAYER:
				if(context == grammarAccess.getContentLayerRule()) {
					sequence_ContentLayer(context, (ContentLayer) semanticObject); 
					return; 
				}
				else break;
			case SWMLPackage.HYPERTEXT_LAYER:
				if(context == grammarAccess.getHypertextLayerRule()) {
					sequence_HypertextLayer(context, (HypertextLayer) semanticObject); 
					return; 
				}
				else break;
			case SWMLPackage.INDEX_PAGE:
				if(context == grammarAccess.getIndexPageRule()) {
					sequence_IndexPage(context, (IndexPage) semanticObject); 
					return; 
				}
				else break;
			case SWMLPackage.WEB_MODEL:
				if(context == grammarAccess.getWebModelRule()) {
					sequence_WebModel(context, (WebModel) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID type=SWMLTypes)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SWMLPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SWMLPackage.Literals.ATTRIBUTE__NAME));
			if(transientValues.isValueTransient(semanticObject, SWMLPackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SWMLPackage.Literals.ATTRIBUTE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getTypeSWMLTypesEnumRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID attributes+=Attribute+)
	 */
	protected void sequence_Class(EObject context, mdse.book.sWML.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     classes+=Class+
	 */
	protected void sequence_ContentLayer(EObject context, ContentLayer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     pages+=IndexPage+
	 */
	protected void sequence_HypertextLayer(EObject context, HypertextLayer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID displayedClass=[Class|ID] size=resultsPerPage)
	 */
	protected void sequence_IndexPage(EObject context, IndexPage semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SWMLPackage.Literals.INDEX_PAGE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SWMLPackage.Literals.INDEX_PAGE__NAME));
			if(transientValues.isValueTransient(semanticObject, SWMLPackage.Literals.INDEX_PAGE__DISPLAYED_CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SWMLPackage.Literals.INDEX_PAGE__DISPLAYED_CLASS));
			if(transientValues.isValueTransient(semanticObject, SWMLPackage.Literals.INDEX_PAGE__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SWMLPackage.Literals.INDEX_PAGE__SIZE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIndexPageAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getIndexPageAccess().getDisplayedClassClassIDTerminalRuleCall_3_0_1(), semanticObject.getDisplayedClass());
		feeder.accept(grammarAccess.getIndexPageAccess().getSizeResultsPerPageTerminalRuleCall_5_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID hypertext=HypertextLayer content=ContentLayer)
	 */
	protected void sequence_WebModel(EObject context, WebModel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SWMLPackage.Literals.WEB_MODEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SWMLPackage.Literals.WEB_MODEL__NAME));
			if(transientValues.isValueTransient(semanticObject, SWMLPackage.Literals.WEB_MODEL__HYPERTEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SWMLPackage.Literals.WEB_MODEL__HYPERTEXT));
			if(transientValues.isValueTransient(semanticObject, SWMLPackage.Literals.WEB_MODEL__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SWMLPackage.Literals.WEB_MODEL__CONTENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWebModelAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getWebModelAccess().getHypertextHypertextLayerParserRuleCall_3_0(), semanticObject.getHypertext());
		feeder.accept(grammarAccess.getWebModelAccess().getContentContentLayerParserRuleCall_4_0(), semanticObject.getContent());
		feeder.finish();
	}
}
