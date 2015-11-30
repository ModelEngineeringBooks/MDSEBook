package mdse.book.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import mdse.book.services.SWMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSWMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_RESULTSPERPAGE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Integer'", "'Float'", "'Email'", "'Boolean'", "'webapp'", "'{'", "'}'", "'hypertext {'", "'index'", "'shows'", "'['", "']'", "'content {'", "'class'", "'att'", "':'", "';'"
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
    public String getGrammarFileName() { return "../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g"; }


     
     	private SWMLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SWMLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleWebModel"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:60:1: entryRuleWebModel : ruleWebModel EOF ;
    public final void entryRuleWebModel() throws RecognitionException {
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:61:1: ( ruleWebModel EOF )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:62:1: ruleWebModel EOF
            {
             before(grammarAccess.getWebModelRule()); 
            pushFollow(FOLLOW_ruleWebModel_in_entryRuleWebModel61);
            ruleWebModel();

            state._fsp--;

             after(grammarAccess.getWebModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWebModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWebModel"


    // $ANTLR start "ruleWebModel"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:69:1: ruleWebModel : ( ( rule__WebModel__Group__0 ) ) ;
    public final void ruleWebModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:73:2: ( ( ( rule__WebModel__Group__0 ) ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:74:1: ( ( rule__WebModel__Group__0 ) )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:74:1: ( ( rule__WebModel__Group__0 ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:75:1: ( rule__WebModel__Group__0 )
            {
             before(grammarAccess.getWebModelAccess().getGroup()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:76:1: ( rule__WebModel__Group__0 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:76:2: rule__WebModel__Group__0
            {
            pushFollow(FOLLOW_rule__WebModel__Group__0_in_ruleWebModel94);
            rule__WebModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWebModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWebModel"


    // $ANTLR start "entryRuleHypertextLayer"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:88:1: entryRuleHypertextLayer : ruleHypertextLayer EOF ;
    public final void entryRuleHypertextLayer() throws RecognitionException {
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:89:1: ( ruleHypertextLayer EOF )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:90:1: ruleHypertextLayer EOF
            {
             before(grammarAccess.getHypertextLayerRule()); 
            pushFollow(FOLLOW_ruleHypertextLayer_in_entryRuleHypertextLayer121);
            ruleHypertextLayer();

            state._fsp--;

             after(grammarAccess.getHypertextLayerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHypertextLayer128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHypertextLayer"


    // $ANTLR start "ruleHypertextLayer"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:97:1: ruleHypertextLayer : ( ( rule__HypertextLayer__Group__0 ) ) ;
    public final void ruleHypertextLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:101:2: ( ( ( rule__HypertextLayer__Group__0 ) ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:102:1: ( ( rule__HypertextLayer__Group__0 ) )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:102:1: ( ( rule__HypertextLayer__Group__0 ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:103:1: ( rule__HypertextLayer__Group__0 )
            {
             before(grammarAccess.getHypertextLayerAccess().getGroup()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:104:1: ( rule__HypertextLayer__Group__0 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:104:2: rule__HypertextLayer__Group__0
            {
            pushFollow(FOLLOW_rule__HypertextLayer__Group__0_in_ruleHypertextLayer154);
            rule__HypertextLayer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHypertextLayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHypertextLayer"


    // $ANTLR start "entryRuleIndexPage"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:116:1: entryRuleIndexPage : ruleIndexPage EOF ;
    public final void entryRuleIndexPage() throws RecognitionException {
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:117:1: ( ruleIndexPage EOF )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:118:1: ruleIndexPage EOF
            {
             before(grammarAccess.getIndexPageRule()); 
            pushFollow(FOLLOW_ruleIndexPage_in_entryRuleIndexPage181);
            ruleIndexPage();

            state._fsp--;

             after(grammarAccess.getIndexPageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexPage188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIndexPage"


    // $ANTLR start "ruleIndexPage"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:125:1: ruleIndexPage : ( ( rule__IndexPage__Group__0 ) ) ;
    public final void ruleIndexPage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:129:2: ( ( ( rule__IndexPage__Group__0 ) ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:130:1: ( ( rule__IndexPage__Group__0 ) )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:130:1: ( ( rule__IndexPage__Group__0 ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:131:1: ( rule__IndexPage__Group__0 )
            {
             before(grammarAccess.getIndexPageAccess().getGroup()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:132:1: ( rule__IndexPage__Group__0 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:132:2: rule__IndexPage__Group__0
            {
            pushFollow(FOLLOW_rule__IndexPage__Group__0_in_ruleIndexPage214);
            rule__IndexPage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndexPageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIndexPage"


    // $ANTLR start "entryRuleContentLayer"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:144:1: entryRuleContentLayer : ruleContentLayer EOF ;
    public final void entryRuleContentLayer() throws RecognitionException {
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:145:1: ( ruleContentLayer EOF )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:146:1: ruleContentLayer EOF
            {
             before(grammarAccess.getContentLayerRule()); 
            pushFollow(FOLLOW_ruleContentLayer_in_entryRuleContentLayer241);
            ruleContentLayer();

            state._fsp--;

             after(grammarAccess.getContentLayerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentLayer248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContentLayer"


    // $ANTLR start "ruleContentLayer"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:153:1: ruleContentLayer : ( ( rule__ContentLayer__Group__0 ) ) ;
    public final void ruleContentLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:157:2: ( ( ( rule__ContentLayer__Group__0 ) ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:158:1: ( ( rule__ContentLayer__Group__0 ) )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:158:1: ( ( rule__ContentLayer__Group__0 ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:159:1: ( rule__ContentLayer__Group__0 )
            {
             before(grammarAccess.getContentLayerAccess().getGroup()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:160:1: ( rule__ContentLayer__Group__0 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:160:2: rule__ContentLayer__Group__0
            {
            pushFollow(FOLLOW_rule__ContentLayer__Group__0_in_ruleContentLayer274);
            rule__ContentLayer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentLayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContentLayer"


    // $ANTLR start "entryRuleClass"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:172:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:173:1: ( ruleClass EOF )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:174:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass301);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:181:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:185:2: ( ( ( rule__Class__Group__0 ) ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:186:1: ( ( rule__Class__Group__0 ) )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:186:1: ( ( rule__Class__Group__0 ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:187:1: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:188:1: ( rule__Class__Group__0 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:188:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_rule__Class__Group__0_in_ruleClass334);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAttribute"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:200:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:201:1: ( ruleAttribute EOF )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:202:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute361);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:209:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:213:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:214:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:214:1: ( ( rule__Attribute__Group__0 ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:215:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:216:1: ( rule__Attribute__Group__0 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:216:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute394);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "ruleSWMLTypes"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:229:1: ruleSWMLTypes : ( ( rule__SWMLTypes__Alternatives ) ) ;
    public final void ruleSWMLTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:233:1: ( ( ( rule__SWMLTypes__Alternatives ) ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:234:1: ( ( rule__SWMLTypes__Alternatives ) )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:234:1: ( ( rule__SWMLTypes__Alternatives ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:235:1: ( rule__SWMLTypes__Alternatives )
            {
             before(grammarAccess.getSWMLTypesAccess().getAlternatives()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:236:1: ( rule__SWMLTypes__Alternatives )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:236:2: rule__SWMLTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__SWMLTypes__Alternatives_in_ruleSWMLTypes431);
            rule__SWMLTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSWMLTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSWMLTypes"


    // $ANTLR start "rule__SWMLTypes__Alternatives"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:247:1: rule__SWMLTypes__Alternatives : ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Float' ) ) | ( ( 'Email' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__SWMLTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:251:1: ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Float' ) ) | ( ( 'Email' ) ) | ( ( 'Boolean' ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            case 15:
                {
                alt1=4;
                }
                break;
            case 16:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:252:1: ( ( 'String' ) )
                    {
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:252:1: ( ( 'String' ) )
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:253:1: ( 'String' )
                    {
                     before(grammarAccess.getSWMLTypesAccess().getStringEnumLiteralDeclaration_0()); 
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:254:1: ( 'String' )
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:254:3: 'String'
                    {
                    match(input,12,FOLLOW_12_in_rule__SWMLTypes__Alternatives467); 

                    }

                     after(grammarAccess.getSWMLTypesAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:259:6: ( ( 'Integer' ) )
                    {
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:259:6: ( ( 'Integer' ) )
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:260:1: ( 'Integer' )
                    {
                     before(grammarAccess.getSWMLTypesAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:261:1: ( 'Integer' )
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:261:3: 'Integer'
                    {
                    match(input,13,FOLLOW_13_in_rule__SWMLTypes__Alternatives488); 

                    }

                     after(grammarAccess.getSWMLTypesAccess().getIntegerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:266:6: ( ( 'Float' ) )
                    {
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:266:6: ( ( 'Float' ) )
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:267:1: ( 'Float' )
                    {
                     before(grammarAccess.getSWMLTypesAccess().getFloatEnumLiteralDeclaration_2()); 
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:268:1: ( 'Float' )
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:268:3: 'Float'
                    {
                    match(input,14,FOLLOW_14_in_rule__SWMLTypes__Alternatives509); 

                    }

                     after(grammarAccess.getSWMLTypesAccess().getFloatEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:273:6: ( ( 'Email' ) )
                    {
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:273:6: ( ( 'Email' ) )
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:274:1: ( 'Email' )
                    {
                     before(grammarAccess.getSWMLTypesAccess().getEmailEnumLiteralDeclaration_3()); 
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:275:1: ( 'Email' )
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:275:3: 'Email'
                    {
                    match(input,15,FOLLOW_15_in_rule__SWMLTypes__Alternatives530); 

                    }

                     after(grammarAccess.getSWMLTypesAccess().getEmailEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:280:6: ( ( 'Boolean' ) )
                    {
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:280:6: ( ( 'Boolean' ) )
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:281:1: ( 'Boolean' )
                    {
                     before(grammarAccess.getSWMLTypesAccess().getBooleanEnumLiteralDeclaration_4()); 
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:282:1: ( 'Boolean' )
                    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:282:3: 'Boolean'
                    {
                    match(input,16,FOLLOW_16_in_rule__SWMLTypes__Alternatives551); 

                    }

                     after(grammarAccess.getSWMLTypesAccess().getBooleanEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SWMLTypes__Alternatives"


    // $ANTLR start "rule__WebModel__Group__0"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:294:1: rule__WebModel__Group__0 : rule__WebModel__Group__0__Impl rule__WebModel__Group__1 ;
    public final void rule__WebModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:298:1: ( rule__WebModel__Group__0__Impl rule__WebModel__Group__1 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:299:2: rule__WebModel__Group__0__Impl rule__WebModel__Group__1
            {
            pushFollow(FOLLOW_rule__WebModel__Group__0__Impl_in_rule__WebModel__Group__0584);
            rule__WebModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebModel__Group__1_in_rule__WebModel__Group__0587);
            rule__WebModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebModel__Group__0"


    // $ANTLR start "rule__WebModel__Group__0__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:306:1: rule__WebModel__Group__0__Impl : ( 'webapp' ) ;
    public final void rule__WebModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:310:1: ( ( 'webapp' ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:311:1: ( 'webapp' )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:311:1: ( 'webapp' )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:312:1: 'webapp'
            {
             before(grammarAccess.getWebModelAccess().getWebappKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__WebModel__Group__0__Impl615); 
             after(grammarAccess.getWebModelAccess().getWebappKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebModel__Group__0__Impl"


    // $ANTLR start "rule__WebModel__Group__1"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:325:1: rule__WebModel__Group__1 : rule__WebModel__Group__1__Impl rule__WebModel__Group__2 ;
    public final void rule__WebModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:329:1: ( rule__WebModel__Group__1__Impl rule__WebModel__Group__2 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:330:2: rule__WebModel__Group__1__Impl rule__WebModel__Group__2
            {
            pushFollow(FOLLOW_rule__WebModel__Group__1__Impl_in_rule__WebModel__Group__1646);
            rule__WebModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebModel__Group__2_in_rule__WebModel__Group__1649);
            rule__WebModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebModel__Group__1"


    // $ANTLR start "rule__WebModel__Group__1__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:337:1: rule__WebModel__Group__1__Impl : ( ( rule__WebModel__NameAssignment_1 ) ) ;
    public final void rule__WebModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:341:1: ( ( ( rule__WebModel__NameAssignment_1 ) ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:342:1: ( ( rule__WebModel__NameAssignment_1 ) )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:342:1: ( ( rule__WebModel__NameAssignment_1 ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:343:1: ( rule__WebModel__NameAssignment_1 )
            {
             before(grammarAccess.getWebModelAccess().getNameAssignment_1()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:344:1: ( rule__WebModel__NameAssignment_1 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:344:2: rule__WebModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__WebModel__NameAssignment_1_in_rule__WebModel__Group__1__Impl676);
            rule__WebModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWebModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebModel__Group__1__Impl"


    // $ANTLR start "rule__WebModel__Group__2"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:354:1: rule__WebModel__Group__2 : rule__WebModel__Group__2__Impl rule__WebModel__Group__3 ;
    public final void rule__WebModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:358:1: ( rule__WebModel__Group__2__Impl rule__WebModel__Group__3 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:359:2: rule__WebModel__Group__2__Impl rule__WebModel__Group__3
            {
            pushFollow(FOLLOW_rule__WebModel__Group__2__Impl_in_rule__WebModel__Group__2706);
            rule__WebModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebModel__Group__3_in_rule__WebModel__Group__2709);
            rule__WebModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebModel__Group__2"


    // $ANTLR start "rule__WebModel__Group__2__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:366:1: rule__WebModel__Group__2__Impl : ( '{' ) ;
    public final void rule__WebModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:370:1: ( ( '{' ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:371:1: ( '{' )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:371:1: ( '{' )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:372:1: '{'
            {
             before(grammarAccess.getWebModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__WebModel__Group__2__Impl737); 
             after(grammarAccess.getWebModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebModel__Group__2__Impl"


    // $ANTLR start "rule__WebModel__Group__3"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:385:1: rule__WebModel__Group__3 : rule__WebModel__Group__3__Impl rule__WebModel__Group__4 ;
    public final void rule__WebModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:389:1: ( rule__WebModel__Group__3__Impl rule__WebModel__Group__4 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:390:2: rule__WebModel__Group__3__Impl rule__WebModel__Group__4
            {
            pushFollow(FOLLOW_rule__WebModel__Group__3__Impl_in_rule__WebModel__Group__3768);
            rule__WebModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebModel__Group__4_in_rule__WebModel__Group__3771);
            rule__WebModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebModel__Group__3"


    // $ANTLR start "rule__WebModel__Group__3__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:397:1: rule__WebModel__Group__3__Impl : ( ( rule__WebModel__HypertextAssignment_3 ) ) ;
    public final void rule__WebModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:401:1: ( ( ( rule__WebModel__HypertextAssignment_3 ) ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:402:1: ( ( rule__WebModel__HypertextAssignment_3 ) )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:402:1: ( ( rule__WebModel__HypertextAssignment_3 ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:403:1: ( rule__WebModel__HypertextAssignment_3 )
            {
             before(grammarAccess.getWebModelAccess().getHypertextAssignment_3()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:404:1: ( rule__WebModel__HypertextAssignment_3 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:404:2: rule__WebModel__HypertextAssignment_3
            {
            pushFollow(FOLLOW_rule__WebModel__HypertextAssignment_3_in_rule__WebModel__Group__3__Impl798);
            rule__WebModel__HypertextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWebModelAccess().getHypertextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebModel__Group__3__Impl"


    // $ANTLR start "rule__WebModel__Group__4"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:414:1: rule__WebModel__Group__4 : rule__WebModel__Group__4__Impl rule__WebModel__Group__5 ;
    public final void rule__WebModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:418:1: ( rule__WebModel__Group__4__Impl rule__WebModel__Group__5 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:419:2: rule__WebModel__Group__4__Impl rule__WebModel__Group__5
            {
            pushFollow(FOLLOW_rule__WebModel__Group__4__Impl_in_rule__WebModel__Group__4828);
            rule__WebModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebModel__Group__5_in_rule__WebModel__Group__4831);
            rule__WebModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebModel__Group__4"


    // $ANTLR start "rule__WebModel__Group__4__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:426:1: rule__WebModel__Group__4__Impl : ( ( rule__WebModel__ContentAssignment_4 ) ) ;
    public final void rule__WebModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:430:1: ( ( ( rule__WebModel__ContentAssignment_4 ) ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:431:1: ( ( rule__WebModel__ContentAssignment_4 ) )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:431:1: ( ( rule__WebModel__ContentAssignment_4 ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:432:1: ( rule__WebModel__ContentAssignment_4 )
            {
             before(grammarAccess.getWebModelAccess().getContentAssignment_4()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:433:1: ( rule__WebModel__ContentAssignment_4 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:433:2: rule__WebModel__ContentAssignment_4
            {
            pushFollow(FOLLOW_rule__WebModel__ContentAssignment_4_in_rule__WebModel__Group__4__Impl858);
            rule__WebModel__ContentAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWebModelAccess().getContentAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebModel__Group__4__Impl"


    // $ANTLR start "rule__WebModel__Group__5"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:443:1: rule__WebModel__Group__5 : rule__WebModel__Group__5__Impl ;
    public final void rule__WebModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:447:1: ( rule__WebModel__Group__5__Impl )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:448:2: rule__WebModel__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__WebModel__Group__5__Impl_in_rule__WebModel__Group__5888);
            rule__WebModel__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebModel__Group__5"


    // $ANTLR start "rule__WebModel__Group__5__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:454:1: rule__WebModel__Group__5__Impl : ( '}' ) ;
    public final void rule__WebModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:458:1: ( ( '}' ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:459:1: ( '}' )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:459:1: ( '}' )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:460:1: '}'
            {
             before(grammarAccess.getWebModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__WebModel__Group__5__Impl916); 
             after(grammarAccess.getWebModelAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebModel__Group__5__Impl"


    // $ANTLR start "rule__HypertextLayer__Group__0"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:485:1: rule__HypertextLayer__Group__0 : rule__HypertextLayer__Group__0__Impl rule__HypertextLayer__Group__1 ;
    public final void rule__HypertextLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:489:1: ( rule__HypertextLayer__Group__0__Impl rule__HypertextLayer__Group__1 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:490:2: rule__HypertextLayer__Group__0__Impl rule__HypertextLayer__Group__1
            {
            pushFollow(FOLLOW_rule__HypertextLayer__Group__0__Impl_in_rule__HypertextLayer__Group__0959);
            rule__HypertextLayer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HypertextLayer__Group__1_in_rule__HypertextLayer__Group__0962);
            rule__HypertextLayer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HypertextLayer__Group__0"


    // $ANTLR start "rule__HypertextLayer__Group__0__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:497:1: rule__HypertextLayer__Group__0__Impl : ( 'hypertext {' ) ;
    public final void rule__HypertextLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:501:1: ( ( 'hypertext {' ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:502:1: ( 'hypertext {' )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:502:1: ( 'hypertext {' )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:503:1: 'hypertext {'
            {
             before(grammarAccess.getHypertextLayerAccess().getHypertextKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__HypertextLayer__Group__0__Impl990); 
             after(grammarAccess.getHypertextLayerAccess().getHypertextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HypertextLayer__Group__0__Impl"


    // $ANTLR start "rule__HypertextLayer__Group__1"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:516:1: rule__HypertextLayer__Group__1 : rule__HypertextLayer__Group__1__Impl rule__HypertextLayer__Group__2 ;
    public final void rule__HypertextLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:520:1: ( rule__HypertextLayer__Group__1__Impl rule__HypertextLayer__Group__2 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:521:2: rule__HypertextLayer__Group__1__Impl rule__HypertextLayer__Group__2
            {
            pushFollow(FOLLOW_rule__HypertextLayer__Group__1__Impl_in_rule__HypertextLayer__Group__11021);
            rule__HypertextLayer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HypertextLayer__Group__2_in_rule__HypertextLayer__Group__11024);
            rule__HypertextLayer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HypertextLayer__Group__1"


    // $ANTLR start "rule__HypertextLayer__Group__1__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:528:1: rule__HypertextLayer__Group__1__Impl : ( ( ( rule__HypertextLayer__PagesAssignment_1 ) ) ( ( rule__HypertextLayer__PagesAssignment_1 )* ) ) ;
    public final void rule__HypertextLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:532:1: ( ( ( ( rule__HypertextLayer__PagesAssignment_1 ) ) ( ( rule__HypertextLayer__PagesAssignment_1 )* ) ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:533:1: ( ( ( rule__HypertextLayer__PagesAssignment_1 ) ) ( ( rule__HypertextLayer__PagesAssignment_1 )* ) )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:533:1: ( ( ( rule__HypertextLayer__PagesAssignment_1 ) ) ( ( rule__HypertextLayer__PagesAssignment_1 )* ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:534:1: ( ( rule__HypertextLayer__PagesAssignment_1 ) ) ( ( rule__HypertextLayer__PagesAssignment_1 )* )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:534:1: ( ( rule__HypertextLayer__PagesAssignment_1 ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:535:1: ( rule__HypertextLayer__PagesAssignment_1 )
            {
             before(grammarAccess.getHypertextLayerAccess().getPagesAssignment_1()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:536:1: ( rule__HypertextLayer__PagesAssignment_1 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:536:2: rule__HypertextLayer__PagesAssignment_1
            {
            pushFollow(FOLLOW_rule__HypertextLayer__PagesAssignment_1_in_rule__HypertextLayer__Group__1__Impl1053);
            rule__HypertextLayer__PagesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHypertextLayerAccess().getPagesAssignment_1()); 

            }

            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:539:1: ( ( rule__HypertextLayer__PagesAssignment_1 )* )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:540:1: ( rule__HypertextLayer__PagesAssignment_1 )*
            {
             before(grammarAccess.getHypertextLayerAccess().getPagesAssignment_1()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:541:1: ( rule__HypertextLayer__PagesAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:541:2: rule__HypertextLayer__PagesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__HypertextLayer__PagesAssignment_1_in_rule__HypertextLayer__Group__1__Impl1065);
            	    rule__HypertextLayer__PagesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getHypertextLayerAccess().getPagesAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HypertextLayer__Group__1__Impl"


    // $ANTLR start "rule__HypertextLayer__Group__2"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:552:1: rule__HypertextLayer__Group__2 : rule__HypertextLayer__Group__2__Impl ;
    public final void rule__HypertextLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:556:1: ( rule__HypertextLayer__Group__2__Impl )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:557:2: rule__HypertextLayer__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__HypertextLayer__Group__2__Impl_in_rule__HypertextLayer__Group__21098);
            rule__HypertextLayer__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HypertextLayer__Group__2"


    // $ANTLR start "rule__HypertextLayer__Group__2__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:563:1: rule__HypertextLayer__Group__2__Impl : ( '}' ) ;
    public final void rule__HypertextLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:567:1: ( ( '}' ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:568:1: ( '}' )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:568:1: ( '}' )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:569:1: '}'
            {
             before(grammarAccess.getHypertextLayerAccess().getRightCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__HypertextLayer__Group__2__Impl1126); 
             after(grammarAccess.getHypertextLayerAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HypertextLayer__Group__2__Impl"


    // $ANTLR start "rule__IndexPage__Group__0"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:588:1: rule__IndexPage__Group__0 : rule__IndexPage__Group__0__Impl rule__IndexPage__Group__1 ;
    public final void rule__IndexPage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:592:1: ( rule__IndexPage__Group__0__Impl rule__IndexPage__Group__1 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:593:2: rule__IndexPage__Group__0__Impl rule__IndexPage__Group__1
            {
            pushFollow(FOLLOW_rule__IndexPage__Group__0__Impl_in_rule__IndexPage__Group__01163);
            rule__IndexPage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IndexPage__Group__1_in_rule__IndexPage__Group__01166);
            rule__IndexPage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexPage__Group__0"


    // $ANTLR start "rule__IndexPage__Group__0__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:600:1: rule__IndexPage__Group__0__Impl : ( 'index' ) ;
    public final void rule__IndexPage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:604:1: ( ( 'index' ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:605:1: ( 'index' )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:605:1: ( 'index' )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:606:1: 'index'
            {
             before(grammarAccess.getIndexPageAccess().getIndexKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__IndexPage__Group__0__Impl1194); 
             after(grammarAccess.getIndexPageAccess().getIndexKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexPage__Group__0__Impl"


    // $ANTLR start "rule__IndexPage__Group__1"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:619:1: rule__IndexPage__Group__1 : rule__IndexPage__Group__1__Impl rule__IndexPage__Group__2 ;
    public final void rule__IndexPage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:623:1: ( rule__IndexPage__Group__1__Impl rule__IndexPage__Group__2 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:624:2: rule__IndexPage__Group__1__Impl rule__IndexPage__Group__2
            {
            pushFollow(FOLLOW_rule__IndexPage__Group__1__Impl_in_rule__IndexPage__Group__11225);
            rule__IndexPage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IndexPage__Group__2_in_rule__IndexPage__Group__11228);
            rule__IndexPage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexPage__Group__1"


    // $ANTLR start "rule__IndexPage__Group__1__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:631:1: rule__IndexPage__Group__1__Impl : ( ( rule__IndexPage__NameAssignment_1 ) ) ;
    public final void rule__IndexPage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:635:1: ( ( ( rule__IndexPage__NameAssignment_1 ) ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:636:1: ( ( rule__IndexPage__NameAssignment_1 ) )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:636:1: ( ( rule__IndexPage__NameAssignment_1 ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:637:1: ( rule__IndexPage__NameAssignment_1 )
            {
             before(grammarAccess.getIndexPageAccess().getNameAssignment_1()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:638:1: ( rule__IndexPage__NameAssignment_1 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:638:2: rule__IndexPage__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__IndexPage__NameAssignment_1_in_rule__IndexPage__Group__1__Impl1255);
            rule__IndexPage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIndexPageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexPage__Group__1__Impl"


    // $ANTLR start "rule__IndexPage__Group__2"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:648:1: rule__IndexPage__Group__2 : rule__IndexPage__Group__2__Impl rule__IndexPage__Group__3 ;
    public final void rule__IndexPage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:652:1: ( rule__IndexPage__Group__2__Impl rule__IndexPage__Group__3 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:653:2: rule__IndexPage__Group__2__Impl rule__IndexPage__Group__3
            {
            pushFollow(FOLLOW_rule__IndexPage__Group__2__Impl_in_rule__IndexPage__Group__21285);
            rule__IndexPage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IndexPage__Group__3_in_rule__IndexPage__Group__21288);
            rule__IndexPage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexPage__Group__2"


    // $ANTLR start "rule__IndexPage__Group__2__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:660:1: rule__IndexPage__Group__2__Impl : ( 'shows' ) ;
    public final void rule__IndexPage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:664:1: ( ( 'shows' ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:665:1: ( 'shows' )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:665:1: ( 'shows' )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:666:1: 'shows'
            {
             before(grammarAccess.getIndexPageAccess().getShowsKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__IndexPage__Group__2__Impl1316); 
             after(grammarAccess.getIndexPageAccess().getShowsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexPage__Group__2__Impl"


    // $ANTLR start "rule__IndexPage__Group__3"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:679:1: rule__IndexPage__Group__3 : rule__IndexPage__Group__3__Impl rule__IndexPage__Group__4 ;
    public final void rule__IndexPage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:683:1: ( rule__IndexPage__Group__3__Impl rule__IndexPage__Group__4 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:684:2: rule__IndexPage__Group__3__Impl rule__IndexPage__Group__4
            {
            pushFollow(FOLLOW_rule__IndexPage__Group__3__Impl_in_rule__IndexPage__Group__31347);
            rule__IndexPage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IndexPage__Group__4_in_rule__IndexPage__Group__31350);
            rule__IndexPage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexPage__Group__3"


    // $ANTLR start "rule__IndexPage__Group__3__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:691:1: rule__IndexPage__Group__3__Impl : ( ( rule__IndexPage__DisplayedClassAssignment_3 ) ) ;
    public final void rule__IndexPage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:695:1: ( ( ( rule__IndexPage__DisplayedClassAssignment_3 ) ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:696:1: ( ( rule__IndexPage__DisplayedClassAssignment_3 ) )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:696:1: ( ( rule__IndexPage__DisplayedClassAssignment_3 ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:697:1: ( rule__IndexPage__DisplayedClassAssignment_3 )
            {
             before(grammarAccess.getIndexPageAccess().getDisplayedClassAssignment_3()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:698:1: ( rule__IndexPage__DisplayedClassAssignment_3 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:698:2: rule__IndexPage__DisplayedClassAssignment_3
            {
            pushFollow(FOLLOW_rule__IndexPage__DisplayedClassAssignment_3_in_rule__IndexPage__Group__3__Impl1377);
            rule__IndexPage__DisplayedClassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIndexPageAccess().getDisplayedClassAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexPage__Group__3__Impl"


    // $ANTLR start "rule__IndexPage__Group__4"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:708:1: rule__IndexPage__Group__4 : rule__IndexPage__Group__4__Impl rule__IndexPage__Group__5 ;
    public final void rule__IndexPage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:712:1: ( rule__IndexPage__Group__4__Impl rule__IndexPage__Group__5 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:713:2: rule__IndexPage__Group__4__Impl rule__IndexPage__Group__5
            {
            pushFollow(FOLLOW_rule__IndexPage__Group__4__Impl_in_rule__IndexPage__Group__41407);
            rule__IndexPage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IndexPage__Group__5_in_rule__IndexPage__Group__41410);
            rule__IndexPage__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexPage__Group__4"


    // $ANTLR start "rule__IndexPage__Group__4__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:720:1: rule__IndexPage__Group__4__Impl : ( '[' ) ;
    public final void rule__IndexPage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:724:1: ( ( '[' ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:725:1: ( '[' )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:725:1: ( '[' )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:726:1: '['
            {
             before(grammarAccess.getIndexPageAccess().getLeftSquareBracketKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__IndexPage__Group__4__Impl1438); 
             after(grammarAccess.getIndexPageAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexPage__Group__4__Impl"


    // $ANTLR start "rule__IndexPage__Group__5"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:739:1: rule__IndexPage__Group__5 : rule__IndexPage__Group__5__Impl rule__IndexPage__Group__6 ;
    public final void rule__IndexPage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:743:1: ( rule__IndexPage__Group__5__Impl rule__IndexPage__Group__6 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:744:2: rule__IndexPage__Group__5__Impl rule__IndexPage__Group__6
            {
            pushFollow(FOLLOW_rule__IndexPage__Group__5__Impl_in_rule__IndexPage__Group__51469);
            rule__IndexPage__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IndexPage__Group__6_in_rule__IndexPage__Group__51472);
            rule__IndexPage__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexPage__Group__5"


    // $ANTLR start "rule__IndexPage__Group__5__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:751:1: rule__IndexPage__Group__5__Impl : ( ( rule__IndexPage__SizeAssignment_5 ) ) ;
    public final void rule__IndexPage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:755:1: ( ( ( rule__IndexPage__SizeAssignment_5 ) ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:756:1: ( ( rule__IndexPage__SizeAssignment_5 ) )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:756:1: ( ( rule__IndexPage__SizeAssignment_5 ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:757:1: ( rule__IndexPage__SizeAssignment_5 )
            {
             before(grammarAccess.getIndexPageAccess().getSizeAssignment_5()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:758:1: ( rule__IndexPage__SizeAssignment_5 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:758:2: rule__IndexPage__SizeAssignment_5
            {
            pushFollow(FOLLOW_rule__IndexPage__SizeAssignment_5_in_rule__IndexPage__Group__5__Impl1499);
            rule__IndexPage__SizeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIndexPageAccess().getSizeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexPage__Group__5__Impl"


    // $ANTLR start "rule__IndexPage__Group__6"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:768:1: rule__IndexPage__Group__6 : rule__IndexPage__Group__6__Impl rule__IndexPage__Group__7 ;
    public final void rule__IndexPage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:772:1: ( rule__IndexPage__Group__6__Impl rule__IndexPage__Group__7 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:773:2: rule__IndexPage__Group__6__Impl rule__IndexPage__Group__7
            {
            pushFollow(FOLLOW_rule__IndexPage__Group__6__Impl_in_rule__IndexPage__Group__61529);
            rule__IndexPage__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IndexPage__Group__7_in_rule__IndexPage__Group__61532);
            rule__IndexPage__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexPage__Group__6"


    // $ANTLR start "rule__IndexPage__Group__6__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:780:1: rule__IndexPage__Group__6__Impl : ( ']' ) ;
    public final void rule__IndexPage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:784:1: ( ( ']' ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:785:1: ( ']' )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:785:1: ( ']' )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:786:1: ']'
            {
             before(grammarAccess.getIndexPageAccess().getRightSquareBracketKeyword_6()); 
            match(input,24,FOLLOW_24_in_rule__IndexPage__Group__6__Impl1560); 
             after(grammarAccess.getIndexPageAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexPage__Group__6__Impl"


    // $ANTLR start "rule__IndexPage__Group__7"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:799:1: rule__IndexPage__Group__7 : rule__IndexPage__Group__7__Impl rule__IndexPage__Group__8 ;
    public final void rule__IndexPage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:803:1: ( rule__IndexPage__Group__7__Impl rule__IndexPage__Group__8 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:804:2: rule__IndexPage__Group__7__Impl rule__IndexPage__Group__8
            {
            pushFollow(FOLLOW_rule__IndexPage__Group__7__Impl_in_rule__IndexPage__Group__71591);
            rule__IndexPage__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IndexPage__Group__8_in_rule__IndexPage__Group__71594);
            rule__IndexPage__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexPage__Group__7"


    // $ANTLR start "rule__IndexPage__Group__7__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:811:1: rule__IndexPage__Group__7__Impl : ( '{' ) ;
    public final void rule__IndexPage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:815:1: ( ( '{' ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:816:1: ( '{' )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:816:1: ( '{' )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:817:1: '{'
            {
             before(grammarAccess.getIndexPageAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_18_in_rule__IndexPage__Group__7__Impl1622); 
             after(grammarAccess.getIndexPageAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexPage__Group__7__Impl"


    // $ANTLR start "rule__IndexPage__Group__8"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:830:1: rule__IndexPage__Group__8 : rule__IndexPage__Group__8__Impl ;
    public final void rule__IndexPage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:834:1: ( rule__IndexPage__Group__8__Impl )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:835:2: rule__IndexPage__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__IndexPage__Group__8__Impl_in_rule__IndexPage__Group__81653);
            rule__IndexPage__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexPage__Group__8"


    // $ANTLR start "rule__IndexPage__Group__8__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:841:1: rule__IndexPage__Group__8__Impl : ( '}' ) ;
    public final void rule__IndexPage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:845:1: ( ( '}' ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:846:1: ( '}' )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:846:1: ( '}' )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:847:1: '}'
            {
             before(grammarAccess.getIndexPageAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_19_in_rule__IndexPage__Group__8__Impl1681); 
             after(grammarAccess.getIndexPageAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexPage__Group__8__Impl"


    // $ANTLR start "rule__ContentLayer__Group__0"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:878:1: rule__ContentLayer__Group__0 : rule__ContentLayer__Group__0__Impl rule__ContentLayer__Group__1 ;
    public final void rule__ContentLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:882:1: ( rule__ContentLayer__Group__0__Impl rule__ContentLayer__Group__1 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:883:2: rule__ContentLayer__Group__0__Impl rule__ContentLayer__Group__1
            {
            pushFollow(FOLLOW_rule__ContentLayer__Group__0__Impl_in_rule__ContentLayer__Group__01730);
            rule__ContentLayer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContentLayer__Group__1_in_rule__ContentLayer__Group__01733);
            rule__ContentLayer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentLayer__Group__0"


    // $ANTLR start "rule__ContentLayer__Group__0__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:890:1: rule__ContentLayer__Group__0__Impl : ( 'content {' ) ;
    public final void rule__ContentLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:894:1: ( ( 'content {' ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:895:1: ( 'content {' )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:895:1: ( 'content {' )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:896:1: 'content {'
            {
             before(grammarAccess.getContentLayerAccess().getContentKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__ContentLayer__Group__0__Impl1761); 
             after(grammarAccess.getContentLayerAccess().getContentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentLayer__Group__0__Impl"


    // $ANTLR start "rule__ContentLayer__Group__1"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:909:1: rule__ContentLayer__Group__1 : rule__ContentLayer__Group__1__Impl rule__ContentLayer__Group__2 ;
    public final void rule__ContentLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:913:1: ( rule__ContentLayer__Group__1__Impl rule__ContentLayer__Group__2 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:914:2: rule__ContentLayer__Group__1__Impl rule__ContentLayer__Group__2
            {
            pushFollow(FOLLOW_rule__ContentLayer__Group__1__Impl_in_rule__ContentLayer__Group__11792);
            rule__ContentLayer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContentLayer__Group__2_in_rule__ContentLayer__Group__11795);
            rule__ContentLayer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentLayer__Group__1"


    // $ANTLR start "rule__ContentLayer__Group__1__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:921:1: rule__ContentLayer__Group__1__Impl : ( ( ( rule__ContentLayer__ClassesAssignment_1 ) ) ( ( rule__ContentLayer__ClassesAssignment_1 )* ) ) ;
    public final void rule__ContentLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:925:1: ( ( ( ( rule__ContentLayer__ClassesAssignment_1 ) ) ( ( rule__ContentLayer__ClassesAssignment_1 )* ) ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:926:1: ( ( ( rule__ContentLayer__ClassesAssignment_1 ) ) ( ( rule__ContentLayer__ClassesAssignment_1 )* ) )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:926:1: ( ( ( rule__ContentLayer__ClassesAssignment_1 ) ) ( ( rule__ContentLayer__ClassesAssignment_1 )* ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:927:1: ( ( rule__ContentLayer__ClassesAssignment_1 ) ) ( ( rule__ContentLayer__ClassesAssignment_1 )* )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:927:1: ( ( rule__ContentLayer__ClassesAssignment_1 ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:928:1: ( rule__ContentLayer__ClassesAssignment_1 )
            {
             before(grammarAccess.getContentLayerAccess().getClassesAssignment_1()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:929:1: ( rule__ContentLayer__ClassesAssignment_1 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:929:2: rule__ContentLayer__ClassesAssignment_1
            {
            pushFollow(FOLLOW_rule__ContentLayer__ClassesAssignment_1_in_rule__ContentLayer__Group__1__Impl1824);
            rule__ContentLayer__ClassesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContentLayerAccess().getClassesAssignment_1()); 

            }

            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:932:1: ( ( rule__ContentLayer__ClassesAssignment_1 )* )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:933:1: ( rule__ContentLayer__ClassesAssignment_1 )*
            {
             before(grammarAccess.getContentLayerAccess().getClassesAssignment_1()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:934:1: ( rule__ContentLayer__ClassesAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:934:2: rule__ContentLayer__ClassesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ContentLayer__ClassesAssignment_1_in_rule__ContentLayer__Group__1__Impl1836);
            	    rule__ContentLayer__ClassesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getContentLayerAccess().getClassesAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentLayer__Group__1__Impl"


    // $ANTLR start "rule__ContentLayer__Group__2"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:945:1: rule__ContentLayer__Group__2 : rule__ContentLayer__Group__2__Impl ;
    public final void rule__ContentLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:949:1: ( rule__ContentLayer__Group__2__Impl )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:950:2: rule__ContentLayer__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ContentLayer__Group__2__Impl_in_rule__ContentLayer__Group__21869);
            rule__ContentLayer__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentLayer__Group__2"


    // $ANTLR start "rule__ContentLayer__Group__2__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:956:1: rule__ContentLayer__Group__2__Impl : ( '}' ) ;
    public final void rule__ContentLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:960:1: ( ( '}' ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:961:1: ( '}' )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:961:1: ( '}' )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:962:1: '}'
            {
             before(grammarAccess.getContentLayerAccess().getRightCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__ContentLayer__Group__2__Impl1897); 
             after(grammarAccess.getContentLayerAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentLayer__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:981:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:985:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:986:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01934);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01937);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:993:1: rule__Class__Group__0__Impl : ( 'class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:997:1: ( ( 'class' ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:998:1: ( 'class' )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:998:1: ( 'class' )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:999:1: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Class__Group__0__Impl1965); 
             after(grammarAccess.getClassAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1012:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1016:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1017:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11996);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11999);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1024:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1028:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1029:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1029:1: ( ( rule__Class__NameAssignment_1 ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1030:1: ( rule__Class__NameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1031:1: ( rule__Class__NameAssignment_1 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1031:2: rule__Class__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl2026);
            rule__Class__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1041:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1045:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1046:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__22056);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__22059);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1053:1: rule__Class__Group__2__Impl : ( '{' ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1057:1: ( ( '{' ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1058:1: ( '{' )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1058:1: ( '{' )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1059:1: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Class__Group__2__Impl2087); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1072:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1076:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1077:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__32118);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__32121);
            rule__Class__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1084:1: rule__Class__Group__3__Impl : ( ( ( rule__Class__AttributesAssignment_3 ) ) ( ( rule__Class__AttributesAssignment_3 )* ) ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1088:1: ( ( ( ( rule__Class__AttributesAssignment_3 ) ) ( ( rule__Class__AttributesAssignment_3 )* ) ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1089:1: ( ( ( rule__Class__AttributesAssignment_3 ) ) ( ( rule__Class__AttributesAssignment_3 )* ) )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1089:1: ( ( ( rule__Class__AttributesAssignment_3 ) ) ( ( rule__Class__AttributesAssignment_3 )* ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1090:1: ( ( rule__Class__AttributesAssignment_3 ) ) ( ( rule__Class__AttributesAssignment_3 )* )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1090:1: ( ( rule__Class__AttributesAssignment_3 ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1091:1: ( rule__Class__AttributesAssignment_3 )
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_3()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1092:1: ( rule__Class__AttributesAssignment_3 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1092:2: rule__Class__AttributesAssignment_3
            {
            pushFollow(FOLLOW_rule__Class__AttributesAssignment_3_in_rule__Class__Group__3__Impl2150);
            rule__Class__AttributesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAttributesAssignment_3()); 

            }

            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1095:1: ( ( rule__Class__AttributesAssignment_3 )* )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1096:1: ( rule__Class__AttributesAssignment_3 )*
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_3()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1097:1: ( rule__Class__AttributesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1097:2: rule__Class__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Class__AttributesAssignment_3_in_rule__Class__Group__3__Impl2162);
            	    rule__Class__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getAttributesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1108:1: rule__Class__Group__4 : rule__Class__Group__4__Impl ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1112:1: ( rule__Class__Group__4__Impl )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1113:2: rule__Class__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__42195);
            rule__Class__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1119:1: rule__Class__Group__4__Impl : ( '}' ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1123:1: ( ( '}' ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1124:1: ( '}' )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1124:1: ( '}' )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1125:1: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Class__Group__4__Impl2223); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1148:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1152:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1153:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02264);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02267);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1160:1: rule__Attribute__Group__0__Impl : ( 'att' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1164:1: ( ( 'att' ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1165:1: ( 'att' )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1165:1: ( 'att' )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1166:1: 'att'
            {
             before(grammarAccess.getAttributeAccess().getAttKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Attribute__Group__0__Impl2295); 
             after(grammarAccess.getAttributeAccess().getAttKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1179:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1183:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1184:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12326);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12329);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1191:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1195:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1196:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1196:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1197:1: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1198:1: ( rule__Attribute__NameAssignment_1 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1198:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl2356);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1208:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1212:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1213:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22386);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__22389);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1220:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1224:1: ( ( ':' ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1225:1: ( ':' )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1225:1: ( ':' )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1226:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Attribute__Group__2__Impl2417); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1239:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1243:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1244:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__32448);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__32451);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1251:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1255:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1256:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1256:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1257:1: ( rule__Attribute__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1258:1: ( rule__Attribute__TypeAssignment_3 )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1258:2: rule__Attribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_3_in_rule__Attribute__Group__3__Impl2478);
            rule__Attribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1268:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1272:1: ( rule__Attribute__Group__4__Impl )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1273:2: rule__Attribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__42508);
            rule__Attribute__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1279:1: rule__Attribute__Group__4__Impl : ( ';' ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1283:1: ( ( ';' ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1284:1: ( ';' )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1284:1: ( ';' )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1285:1: ';'
            {
             before(grammarAccess.getAttributeAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__Attribute__Group__4__Impl2536); 
             after(grammarAccess.getAttributeAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__WebModel__NameAssignment_1"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1309:1: rule__WebModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WebModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1313:1: ( ( RULE_ID ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1314:1: ( RULE_ID )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1314:1: ( RULE_ID )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1315:1: RULE_ID
            {
             before(grammarAccess.getWebModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WebModel__NameAssignment_12582); 
             after(grammarAccess.getWebModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebModel__NameAssignment_1"


    // $ANTLR start "rule__WebModel__HypertextAssignment_3"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1324:1: rule__WebModel__HypertextAssignment_3 : ( ruleHypertextLayer ) ;
    public final void rule__WebModel__HypertextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1328:1: ( ( ruleHypertextLayer ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1329:1: ( ruleHypertextLayer )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1329:1: ( ruleHypertextLayer )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1330:1: ruleHypertextLayer
            {
             before(grammarAccess.getWebModelAccess().getHypertextHypertextLayerParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleHypertextLayer_in_rule__WebModel__HypertextAssignment_32613);
            ruleHypertextLayer();

            state._fsp--;

             after(grammarAccess.getWebModelAccess().getHypertextHypertextLayerParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebModel__HypertextAssignment_3"


    // $ANTLR start "rule__WebModel__ContentAssignment_4"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1339:1: rule__WebModel__ContentAssignment_4 : ( ruleContentLayer ) ;
    public final void rule__WebModel__ContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1343:1: ( ( ruleContentLayer ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1344:1: ( ruleContentLayer )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1344:1: ( ruleContentLayer )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1345:1: ruleContentLayer
            {
             before(grammarAccess.getWebModelAccess().getContentContentLayerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleContentLayer_in_rule__WebModel__ContentAssignment_42644);
            ruleContentLayer();

            state._fsp--;

             after(grammarAccess.getWebModelAccess().getContentContentLayerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebModel__ContentAssignment_4"


    // $ANTLR start "rule__HypertextLayer__PagesAssignment_1"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1354:1: rule__HypertextLayer__PagesAssignment_1 : ( ruleIndexPage ) ;
    public final void rule__HypertextLayer__PagesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1358:1: ( ( ruleIndexPage ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1359:1: ( ruleIndexPage )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1359:1: ( ruleIndexPage )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1360:1: ruleIndexPage
            {
             before(grammarAccess.getHypertextLayerAccess().getPagesIndexPageParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIndexPage_in_rule__HypertextLayer__PagesAssignment_12675);
            ruleIndexPage();

            state._fsp--;

             after(grammarAccess.getHypertextLayerAccess().getPagesIndexPageParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HypertextLayer__PagesAssignment_1"


    // $ANTLR start "rule__IndexPage__NameAssignment_1"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1369:1: rule__IndexPage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IndexPage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1373:1: ( ( RULE_ID ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1374:1: ( RULE_ID )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1374:1: ( RULE_ID )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1375:1: RULE_ID
            {
             before(grammarAccess.getIndexPageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IndexPage__NameAssignment_12706); 
             after(grammarAccess.getIndexPageAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexPage__NameAssignment_1"


    // $ANTLR start "rule__IndexPage__DisplayedClassAssignment_3"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1384:1: rule__IndexPage__DisplayedClassAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__IndexPage__DisplayedClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1388:1: ( ( ( RULE_ID ) ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1389:1: ( ( RULE_ID ) )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1389:1: ( ( RULE_ID ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1390:1: ( RULE_ID )
            {
             before(grammarAccess.getIndexPageAccess().getDisplayedClassClassCrossReference_3_0()); 
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1391:1: ( RULE_ID )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1392:1: RULE_ID
            {
             before(grammarAccess.getIndexPageAccess().getDisplayedClassClassIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IndexPage__DisplayedClassAssignment_32741); 
             after(grammarAccess.getIndexPageAccess().getDisplayedClassClassIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getIndexPageAccess().getDisplayedClassClassCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexPage__DisplayedClassAssignment_3"


    // $ANTLR start "rule__IndexPage__SizeAssignment_5"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1403:1: rule__IndexPage__SizeAssignment_5 : ( RULE_RESULTSPERPAGE ) ;
    public final void rule__IndexPage__SizeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1407:1: ( ( RULE_RESULTSPERPAGE ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1408:1: ( RULE_RESULTSPERPAGE )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1408:1: ( RULE_RESULTSPERPAGE )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1409:1: RULE_RESULTSPERPAGE
            {
             before(grammarAccess.getIndexPageAccess().getSizeResultsPerPageTerminalRuleCall_5_0()); 
            match(input,RULE_RESULTSPERPAGE,FOLLOW_RULE_RESULTSPERPAGE_in_rule__IndexPage__SizeAssignment_52776); 
             after(grammarAccess.getIndexPageAccess().getSizeResultsPerPageTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexPage__SizeAssignment_5"


    // $ANTLR start "rule__ContentLayer__ClassesAssignment_1"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1418:1: rule__ContentLayer__ClassesAssignment_1 : ( ruleClass ) ;
    public final void rule__ContentLayer__ClassesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1422:1: ( ( ruleClass ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1423:1: ( ruleClass )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1423:1: ( ruleClass )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1424:1: ruleClass
            {
             before(grammarAccess.getContentLayerAccess().getClassesClassParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClass_in_rule__ContentLayer__ClassesAssignment_12807);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getContentLayerAccess().getClassesClassParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentLayer__ClassesAssignment_1"


    // $ANTLR start "rule__Class__NameAssignment_1"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1433:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1437:1: ( ( RULE_ID ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1438:1: ( RULE_ID )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1438:1: ( RULE_ID )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1439:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__NameAssignment_12838); 
             after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_1"


    // $ANTLR start "rule__Class__AttributesAssignment_3"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1448:1: rule__Class__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1452:1: ( ( ruleAttribute ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1453:1: ( ruleAttribute )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1453:1: ( ruleAttribute )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1454:1: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Class__AttributesAssignment_32869);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AttributesAssignment_3"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1463:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1467:1: ( ( RULE_ID ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1468:1: ( RULE_ID )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1468:1: ( RULE_ID )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1469:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_12900); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_3"
    // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1478:1: rule__Attribute__TypeAssignment_3 : ( ruleSWMLTypes ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1482:1: ( ( ruleSWMLTypes ) )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1483:1: ( ruleSWMLTypes )
            {
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1483:1: ( ruleSWMLTypes )
            // ../mdse.book.swml.tcs.ui/src-gen/mdse/book/ui/contentassist/antlr/internal/InternalSWML.g:1484:1: ruleSWMLTypes
            {
             before(grammarAccess.getAttributeAccess().getTypeSWMLTypesEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSWMLTypes_in_rule__Attribute__TypeAssignment_32931);
            ruleSWMLTypes();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeSWMLTypesEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleWebModel_in_entryRuleWebModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWebModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebModel__Group__0_in_ruleWebModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHypertextLayer_in_entryRuleHypertextLayer121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHypertextLayer128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HypertextLayer__Group__0_in_ruleHypertextLayer154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexPage_in_entryRuleIndexPage181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexPage188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexPage__Group__0_in_ruleIndexPage214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentLayer_in_entryRuleContentLayer241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentLayer248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentLayer__Group__0_in_ruleContentLayer274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SWMLTypes__Alternatives_in_ruleSWMLTypes431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SWMLTypes__Alternatives467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SWMLTypes__Alternatives488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SWMLTypes__Alternatives509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SWMLTypes__Alternatives530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SWMLTypes__Alternatives551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebModel__Group__0__Impl_in_rule__WebModel__Group__0584 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WebModel__Group__1_in_rule__WebModel__Group__0587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__WebModel__Group__0__Impl615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebModel__Group__1__Impl_in_rule__WebModel__Group__1646 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__WebModel__Group__2_in_rule__WebModel__Group__1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebModel__NameAssignment_1_in_rule__WebModel__Group__1__Impl676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebModel__Group__2__Impl_in_rule__WebModel__Group__2706 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__WebModel__Group__3_in_rule__WebModel__Group__2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__WebModel__Group__2__Impl737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebModel__Group__3__Impl_in_rule__WebModel__Group__3768 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__WebModel__Group__4_in_rule__WebModel__Group__3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebModel__HypertextAssignment_3_in_rule__WebModel__Group__3__Impl798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebModel__Group__4__Impl_in_rule__WebModel__Group__4828 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__WebModel__Group__5_in_rule__WebModel__Group__4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebModel__ContentAssignment_4_in_rule__WebModel__Group__4__Impl858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebModel__Group__5__Impl_in_rule__WebModel__Group__5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__WebModel__Group__5__Impl916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HypertextLayer__Group__0__Impl_in_rule__HypertextLayer__Group__0959 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__HypertextLayer__Group__1_in_rule__HypertextLayer__Group__0962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__HypertextLayer__Group__0__Impl990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HypertextLayer__Group__1__Impl_in_rule__HypertextLayer__Group__11021 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__HypertextLayer__Group__2_in_rule__HypertextLayer__Group__11024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HypertextLayer__PagesAssignment_1_in_rule__HypertextLayer__Group__1__Impl1053 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__HypertextLayer__PagesAssignment_1_in_rule__HypertextLayer__Group__1__Impl1065 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__HypertextLayer__Group__2__Impl_in_rule__HypertextLayer__Group__21098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__HypertextLayer__Group__2__Impl1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexPage__Group__0__Impl_in_rule__IndexPage__Group__01163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IndexPage__Group__1_in_rule__IndexPage__Group__01166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__IndexPage__Group__0__Impl1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexPage__Group__1__Impl_in_rule__IndexPage__Group__11225 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__IndexPage__Group__2_in_rule__IndexPage__Group__11228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexPage__NameAssignment_1_in_rule__IndexPage__Group__1__Impl1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexPage__Group__2__Impl_in_rule__IndexPage__Group__21285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IndexPage__Group__3_in_rule__IndexPage__Group__21288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__IndexPage__Group__2__Impl1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexPage__Group__3__Impl_in_rule__IndexPage__Group__31347 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__IndexPage__Group__4_in_rule__IndexPage__Group__31350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexPage__DisplayedClassAssignment_3_in_rule__IndexPage__Group__3__Impl1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexPage__Group__4__Impl_in_rule__IndexPage__Group__41407 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IndexPage__Group__5_in_rule__IndexPage__Group__41410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__IndexPage__Group__4__Impl1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexPage__Group__5__Impl_in_rule__IndexPage__Group__51469 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__IndexPage__Group__6_in_rule__IndexPage__Group__51472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexPage__SizeAssignment_5_in_rule__IndexPage__Group__5__Impl1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexPage__Group__6__Impl_in_rule__IndexPage__Group__61529 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__IndexPage__Group__7_in_rule__IndexPage__Group__61532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__IndexPage__Group__6__Impl1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexPage__Group__7__Impl_in_rule__IndexPage__Group__71591 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__IndexPage__Group__8_in_rule__IndexPage__Group__71594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__IndexPage__Group__7__Impl1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexPage__Group__8__Impl_in_rule__IndexPage__Group__81653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__IndexPage__Group__8__Impl1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentLayer__Group__0__Impl_in_rule__ContentLayer__Group__01730 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ContentLayer__Group__1_in_rule__ContentLayer__Group__01733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ContentLayer__Group__0__Impl1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentLayer__Group__1__Impl_in_rule__ContentLayer__Group__11792 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ContentLayer__Group__2_in_rule__ContentLayer__Group__11795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentLayer__ClassesAssignment_1_in_rule__ContentLayer__Group__1__Impl1824 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__ContentLayer__ClassesAssignment_1_in_rule__ContentLayer__Group__1__Impl1836 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__ContentLayer__Group__2__Impl_in_rule__ContentLayer__Group__21869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ContentLayer__Group__2__Impl1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Class__Group__0__Impl1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11996 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__22056 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__22059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Class__Group__2__Impl2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__32118 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__32121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__AttributesAssignment_3_in_rule__Class__Group__3__Impl2150 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Class__AttributesAssignment_3_in_rule__Class__Group__3__Impl2162 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__42195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Class__Group__4__Impl2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Attribute__Group__0__Impl2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12326 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22386 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__22389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Attribute__Group__2__Impl2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__32448 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__32451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_3_in_rule__Attribute__Group__3__Impl2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__42508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Attribute__Group__4__Impl2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WebModel__NameAssignment_12582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHypertextLayer_in_rule__WebModel__HypertextAssignment_32613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentLayer_in_rule__WebModel__ContentAssignment_42644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexPage_in_rule__HypertextLayer__PagesAssignment_12675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IndexPage__NameAssignment_12706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IndexPage__DisplayedClassAssignment_32741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RESULTSPERPAGE_in_rule__IndexPage__SizeAssignment_52776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__ContentLayer__ClassesAssignment_12807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__NameAssignment_12838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Class__AttributesAssignment_32869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_12900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSWMLTypes_in_rule__Attribute__TypeAssignment_32931 = new BitSet(new long[]{0x0000000000000002L});

}