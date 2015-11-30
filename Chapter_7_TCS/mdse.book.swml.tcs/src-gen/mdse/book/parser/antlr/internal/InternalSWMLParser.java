package mdse.book.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import mdse.book.services.SWMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSWMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_RESULTSPERPAGE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'webapp'", "'{'", "'}'", "'hypertext {'", "'index'", "'shows'", "'['", "']'", "'content {'", "'class'", "'att'", "':'", "';'", "'String'", "'Integer'", "'Float'", "'Email'", "'Boolean'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_RESULTSPERPAGE=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalSWMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSWMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSWMLParser.tokenNames; }
    public String getGrammarFileName() { return "../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g"; }



     	private SWMLGrammarAccess grammarAccess;
     	
        public InternalSWMLParser(TokenStream input, SWMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "WebModel";	
       	}
       	
       	@Override
       	protected SWMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleWebModel"
    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:68:1: entryRuleWebModel returns [EObject current=null] : iv_ruleWebModel= ruleWebModel EOF ;
    public final EObject entryRuleWebModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebModel = null;


        try {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:69:2: (iv_ruleWebModel= ruleWebModel EOF )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:70:2: iv_ruleWebModel= ruleWebModel EOF
            {
             newCompositeNode(grammarAccess.getWebModelRule()); 
            pushFollow(FOLLOW_ruleWebModel_in_entryRuleWebModel75);
            iv_ruleWebModel=ruleWebModel();

            state._fsp--;

             current =iv_ruleWebModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWebModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWebModel"


    // $ANTLR start "ruleWebModel"
    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:77:1: ruleWebModel returns [EObject current=null] : (otherlv_0= 'webapp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hypertext_3_0= ruleHypertextLayer ) ) ( (lv_content_4_0= ruleContentLayer ) ) otherlv_5= '}' ) ;
    public final EObject ruleWebModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_hypertext_3_0 = null;

        EObject lv_content_4_0 = null;


         enterRule(); 
            
        try {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:80:28: ( (otherlv_0= 'webapp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hypertext_3_0= ruleHypertextLayer ) ) ( (lv_content_4_0= ruleContentLayer ) ) otherlv_5= '}' ) )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:81:1: (otherlv_0= 'webapp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hypertext_3_0= ruleHypertextLayer ) ) ( (lv_content_4_0= ruleContentLayer ) ) otherlv_5= '}' )
            {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:81:1: (otherlv_0= 'webapp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hypertext_3_0= ruleHypertextLayer ) ) ( (lv_content_4_0= ruleContentLayer ) ) otherlv_5= '}' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:81:3: otherlv_0= 'webapp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hypertext_3_0= ruleHypertextLayer ) ) ( (lv_content_4_0= ruleContentLayer ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleWebModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getWebModelAccess().getWebappKeyword_0());
                
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:85:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:86:1: (lv_name_1_0= RULE_ID )
            {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:86:1: (lv_name_1_0= RULE_ID )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:87:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWebModel139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWebModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWebModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleWebModel156); 

                	newLeafNode(otherlv_2, grammarAccess.getWebModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:107:1: ( (lv_hypertext_3_0= ruleHypertextLayer ) )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:108:1: (lv_hypertext_3_0= ruleHypertextLayer )
            {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:108:1: (lv_hypertext_3_0= ruleHypertextLayer )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:109:3: lv_hypertext_3_0= ruleHypertextLayer
            {
             
            	        newCompositeNode(grammarAccess.getWebModelAccess().getHypertextHypertextLayerParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleHypertextLayer_in_ruleWebModel177);
            lv_hypertext_3_0=ruleHypertextLayer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWebModelRule());
            	        }
                   		set(
                   			current, 
                   			"hypertext",
                    		lv_hypertext_3_0, 
                    		"HypertextLayer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:125:2: ( (lv_content_4_0= ruleContentLayer ) )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:126:1: (lv_content_4_0= ruleContentLayer )
            {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:126:1: (lv_content_4_0= ruleContentLayer )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:127:3: lv_content_4_0= ruleContentLayer
            {
             
            	        newCompositeNode(grammarAccess.getWebModelAccess().getContentContentLayerParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleContentLayer_in_ruleWebModel198);
            lv_content_4_0=ruleContentLayer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWebModelRule());
            	        }
                   		set(
                   			current, 
                   			"content",
                    		lv_content_4_0, 
                    		"ContentLayer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleWebModel210); 

                	newLeafNode(otherlv_5, grammarAccess.getWebModelAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWebModel"


    // $ANTLR start "entryRuleHypertextLayer"
    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:155:1: entryRuleHypertextLayer returns [EObject current=null] : iv_ruleHypertextLayer= ruleHypertextLayer EOF ;
    public final EObject entryRuleHypertextLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHypertextLayer = null;


        try {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:156:2: (iv_ruleHypertextLayer= ruleHypertextLayer EOF )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:157:2: iv_ruleHypertextLayer= ruleHypertextLayer EOF
            {
             newCompositeNode(grammarAccess.getHypertextLayerRule()); 
            pushFollow(FOLLOW_ruleHypertextLayer_in_entryRuleHypertextLayer246);
            iv_ruleHypertextLayer=ruleHypertextLayer();

            state._fsp--;

             current =iv_ruleHypertextLayer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHypertextLayer256); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHypertextLayer"


    // $ANTLR start "ruleHypertextLayer"
    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:164:1: ruleHypertextLayer returns [EObject current=null] : (otherlv_0= 'hypertext {' ( (lv_pages_1_0= ruleIndexPage ) )+ otherlv_2= '}' ) ;
    public final EObject ruleHypertextLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_pages_1_0 = null;


         enterRule(); 
            
        try {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:167:28: ( (otherlv_0= 'hypertext {' ( (lv_pages_1_0= ruleIndexPage ) )+ otherlv_2= '}' ) )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:168:1: (otherlv_0= 'hypertext {' ( (lv_pages_1_0= ruleIndexPage ) )+ otherlv_2= '}' )
            {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:168:1: (otherlv_0= 'hypertext {' ( (lv_pages_1_0= ruleIndexPage ) )+ otherlv_2= '}' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:168:3: otherlv_0= 'hypertext {' ( (lv_pages_1_0= ruleIndexPage ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleHypertextLayer293); 

                	newLeafNode(otherlv_0, grammarAccess.getHypertextLayerAccess().getHypertextKeyword_0());
                
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:172:1: ( (lv_pages_1_0= ruleIndexPage ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:173:1: (lv_pages_1_0= ruleIndexPage )
            	    {
            	    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:173:1: (lv_pages_1_0= ruleIndexPage )
            	    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:174:3: lv_pages_1_0= ruleIndexPage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHypertextLayerAccess().getPagesIndexPageParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIndexPage_in_ruleHypertextLayer314);
            	    lv_pages_1_0=ruleIndexPage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHypertextLayerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pages",
            	            		lv_pages_1_0, 
            	            		"IndexPage");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleHypertextLayer327); 

                	newLeafNode(otherlv_2, grammarAccess.getHypertextLayerAccess().getRightCurlyBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHypertextLayer"


    // $ANTLR start "entryRuleIndexPage"
    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:202:1: entryRuleIndexPage returns [EObject current=null] : iv_ruleIndexPage= ruleIndexPage EOF ;
    public final EObject entryRuleIndexPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexPage = null;


        try {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:203:2: (iv_ruleIndexPage= ruleIndexPage EOF )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:204:2: iv_ruleIndexPage= ruleIndexPage EOF
            {
             newCompositeNode(grammarAccess.getIndexPageRule()); 
            pushFollow(FOLLOW_ruleIndexPage_in_entryRuleIndexPage363);
            iv_ruleIndexPage=ruleIndexPage();

            state._fsp--;

             current =iv_ruleIndexPage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexPage373); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndexPage"


    // $ANTLR start "ruleIndexPage"
    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:211:1: ruleIndexPage returns [EObject current=null] : (otherlv_0= 'index' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'shows' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_size_5_0= RULE_RESULTSPERPAGE ) ) otherlv_6= ']' otherlv_7= '{' otherlv_8= '}' ) ;
    public final EObject ruleIndexPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_size_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:214:28: ( (otherlv_0= 'index' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'shows' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_size_5_0= RULE_RESULTSPERPAGE ) ) otherlv_6= ']' otherlv_7= '{' otherlv_8= '}' ) )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:215:1: (otherlv_0= 'index' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'shows' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_size_5_0= RULE_RESULTSPERPAGE ) ) otherlv_6= ']' otherlv_7= '{' otherlv_8= '}' )
            {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:215:1: (otherlv_0= 'index' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'shows' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_size_5_0= RULE_RESULTSPERPAGE ) ) otherlv_6= ']' otherlv_7= '{' otherlv_8= '}' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:215:3: otherlv_0= 'index' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'shows' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_size_5_0= RULE_RESULTSPERPAGE ) ) otherlv_6= ']' otherlv_7= '{' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleIndexPage410); 

                	newLeafNode(otherlv_0, grammarAccess.getIndexPageAccess().getIndexKeyword_0());
                
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:219:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:220:1: (lv_name_1_0= RULE_ID )
            {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:220:1: (lv_name_1_0= RULE_ID )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:221:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexPage427); 

            			newLeafNode(lv_name_1_0, grammarAccess.getIndexPageAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIndexPageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleIndexPage444); 

                	newLeafNode(otherlv_2, grammarAccess.getIndexPageAccess().getShowsKeyword_2());
                
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:241:1: ( (otherlv_3= RULE_ID ) )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:242:1: (otherlv_3= RULE_ID )
            {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:242:1: (otherlv_3= RULE_ID )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:243:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIndexPageRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexPage464); 

            		newLeafNode(otherlv_3, grammarAccess.getIndexPageAccess().getDisplayedClassClassCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleIndexPage476); 

                	newLeafNode(otherlv_4, grammarAccess.getIndexPageAccess().getLeftSquareBracketKeyword_4());
                
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:258:1: ( (lv_size_5_0= RULE_RESULTSPERPAGE ) )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:259:1: (lv_size_5_0= RULE_RESULTSPERPAGE )
            {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:259:1: (lv_size_5_0= RULE_RESULTSPERPAGE )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:260:3: lv_size_5_0= RULE_RESULTSPERPAGE
            {
            lv_size_5_0=(Token)match(input,RULE_RESULTSPERPAGE,FOLLOW_RULE_RESULTSPERPAGE_in_ruleIndexPage493); 

            			newLeafNode(lv_size_5_0, grammarAccess.getIndexPageAccess().getSizeResultsPerPageTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIndexPageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"size",
                    		lv_size_5_0, 
                    		"resultsPerPage");
            	    

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleIndexPage510); 

                	newLeafNode(otherlv_6, grammarAccess.getIndexPageAccess().getRightSquareBracketKeyword_6());
                
            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleIndexPage522); 

                	newLeafNode(otherlv_7, grammarAccess.getIndexPageAccess().getLeftCurlyBracketKeyword_7());
                
            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleIndexPage534); 

                	newLeafNode(otherlv_8, grammarAccess.getIndexPageAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndexPage"


    // $ANTLR start "entryRuleContentLayer"
    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:296:1: entryRuleContentLayer returns [EObject current=null] : iv_ruleContentLayer= ruleContentLayer EOF ;
    public final EObject entryRuleContentLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentLayer = null;


        try {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:297:2: (iv_ruleContentLayer= ruleContentLayer EOF )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:298:2: iv_ruleContentLayer= ruleContentLayer EOF
            {
             newCompositeNode(grammarAccess.getContentLayerRule()); 
            pushFollow(FOLLOW_ruleContentLayer_in_entryRuleContentLayer570);
            iv_ruleContentLayer=ruleContentLayer();

            state._fsp--;

             current =iv_ruleContentLayer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentLayer580); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContentLayer"


    // $ANTLR start "ruleContentLayer"
    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:305:1: ruleContentLayer returns [EObject current=null] : (otherlv_0= 'content {' ( (lv_classes_1_0= ruleClass ) )+ otherlv_2= '}' ) ;
    public final EObject ruleContentLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_classes_1_0 = null;


         enterRule(); 
            
        try {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:308:28: ( (otherlv_0= 'content {' ( (lv_classes_1_0= ruleClass ) )+ otherlv_2= '}' ) )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:309:1: (otherlv_0= 'content {' ( (lv_classes_1_0= ruleClass ) )+ otherlv_2= '}' )
            {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:309:1: (otherlv_0= 'content {' ( (lv_classes_1_0= ruleClass ) )+ otherlv_2= '}' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:309:3: otherlv_0= 'content {' ( (lv_classes_1_0= ruleClass ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleContentLayer617); 

                	newLeafNode(otherlv_0, grammarAccess.getContentLayerAccess().getContentKeyword_0());
                
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:313:1: ( (lv_classes_1_0= ruleClass ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:314:1: (lv_classes_1_0= ruleClass )
            	    {
            	    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:314:1: (lv_classes_1_0= ruleClass )
            	    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:315:3: lv_classes_1_0= ruleClass
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContentLayerAccess().getClassesClassParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleClass_in_ruleContentLayer638);
            	    lv_classes_1_0=ruleClass();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContentLayerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"classes",
            	            		lv_classes_1_0, 
            	            		"Class");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleContentLayer651); 

                	newLeafNode(otherlv_2, grammarAccess.getContentLayerAccess().getRightCurlyBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContentLayer"


    // $ANTLR start "entryRuleClass"
    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:343:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:344:2: (iv_ruleClass= ruleClass EOF )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:345:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass687);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass697); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:352:1: ruleClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:355:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= '}' ) )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:356:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= '}' )
            {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:356:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= '}' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:356:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleClass734); 

                	newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
                
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:360:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:361:1: (lv_name_1_0= RULE_ID )
            {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:361:1: (lv_name_1_0= RULE_ID )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:362:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass751); 

            			newLeafNode(lv_name_1_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleClass768); 

                	newLeafNode(otherlv_2, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2());
                
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:382:1: ( (lv_attributes_3_0= ruleAttribute ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:383:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:383:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:384:3: lv_attributes_3_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleClass789);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_3_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleClass802); 

                	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAttribute"
    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:412:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:413:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:414:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute838);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute848); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:421:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'att' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleSWMLTypes ) ) otherlv_4= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:424:28: ( (otherlv_0= 'att' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleSWMLTypes ) ) otherlv_4= ';' ) )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:425:1: (otherlv_0= 'att' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleSWMLTypes ) ) otherlv_4= ';' )
            {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:425:1: (otherlv_0= 'att' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleSWMLTypes ) ) otherlv_4= ';' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:425:3: otherlv_0= 'att' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleSWMLTypes ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleAttribute885); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttKeyword_0());
                
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:429:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:430:1: (lv_name_1_0= RULE_ID )
            {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:430:1: (lv_name_1_0= RULE_ID )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:431:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute902); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleAttribute919); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
                
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:451:1: ( (lv_type_3_0= ruleSWMLTypes ) )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:452:1: (lv_type_3_0= ruleSWMLTypes )
            {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:452:1: (lv_type_3_0= ruleSWMLTypes )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:453:3: lv_type_3_0= ruleSWMLTypes
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeSWMLTypesEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSWMLTypes_in_ruleAttribute940);
            lv_type_3_0=ruleSWMLTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"SWMLTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleAttribute952); 

                	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "ruleSWMLTypes"
    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:481:1: ruleSWMLTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Email' ) | (enumLiteral_4= 'Boolean' ) ) ;
    public final Enumerator ruleSWMLTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:483:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Email' ) | (enumLiteral_4= 'Boolean' ) ) )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:484:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Email' ) | (enumLiteral_4= 'Boolean' ) )
            {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:484:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Email' ) | (enumLiteral_4= 'Boolean' ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 27:
                {
                alt4=3;
                }
                break;
            case 28:
                {
                alt4=4;
                }
                break;
            case 29:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:484:2: (enumLiteral_0= 'String' )
                    {
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:484:2: (enumLiteral_0= 'String' )
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:484:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_25_in_ruleSWMLTypes1002); 

                            current = grammarAccess.getSWMLTypesAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSWMLTypesAccess().getStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:490:6: (enumLiteral_1= 'Integer' )
                    {
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:490:6: (enumLiteral_1= 'Integer' )
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:490:8: enumLiteral_1= 'Integer'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_26_in_ruleSWMLTypes1019); 

                            current = grammarAccess.getSWMLTypesAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSWMLTypesAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:496:6: (enumLiteral_2= 'Float' )
                    {
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:496:6: (enumLiteral_2= 'Float' )
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:496:8: enumLiteral_2= 'Float'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_27_in_ruleSWMLTypes1036); 

                            current = grammarAccess.getSWMLTypesAccess().getFloatEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSWMLTypesAccess().getFloatEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:502:6: (enumLiteral_3= 'Email' )
                    {
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:502:6: (enumLiteral_3= 'Email' )
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:502:8: enumLiteral_3= 'Email'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_28_in_ruleSWMLTypes1053); 

                            current = grammarAccess.getSWMLTypesAccess().getEmailEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getSWMLTypesAccess().getEmailEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:508:6: (enumLiteral_4= 'Boolean' )
                    {
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:508:6: (enumLiteral_4= 'Boolean' )
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:508:8: enumLiteral_4= 'Boolean'
                    {
                    enumLiteral_4=(Token)match(input,29,FOLLOW_29_in_ruleSWMLTypes1070); 

                            current = grammarAccess.getSWMLTypesAccess().getBooleanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getSWMLTypesAccess().getBooleanEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSWMLTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleWebModel_in_entryRuleWebModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWebModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleWebModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWebModel139 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleWebModel156 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleHypertextLayer_in_ruleWebModel177 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleContentLayer_in_ruleWebModel198 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleWebModel210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHypertextLayer_in_entryRuleHypertextLayer246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHypertextLayer256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleHypertextLayer293 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleIndexPage_in_ruleHypertextLayer314 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_ruleHypertextLayer327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexPage_in_entryRuleIndexPage363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexPage373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleIndexPage410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexPage427 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIndexPage444 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexPage464 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndexPage476 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_RESULTSPERPAGE_in_ruleIndexPage493 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndexPage510 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleIndexPage522 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleIndexPage534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentLayer_in_entryRuleContentLayer570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentLayer580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleContentLayer617 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleClass_in_ruleContentLayer638 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_14_in_ruleContentLayer651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleClass734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass751 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleClass768 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleClass789 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_14_in_ruleClass802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAttribute885 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute902 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAttribute919 = new BitSet(new long[]{0x000000003E000000L});
    public static final BitSet FOLLOW_ruleSWMLTypes_in_ruleAttribute940 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAttribute952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSWMLTypes1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSWMLTypes1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSWMLTypes1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleSWMLTypes1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSWMLTypes1070 = new BitSet(new long[]{0x0000000000000002L});

}