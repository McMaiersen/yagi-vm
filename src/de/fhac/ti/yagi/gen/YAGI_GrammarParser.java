// $ANTLR 3.4 /home/thens/yagi/yagi-vm/YAGI_Grammar.g 2013-06-23 23:03:31

  package de.fhac.ti.yagi.gen;
  
    import java.util.HashMap;
    import java.util.Map;
    import java.util.HashSet;
    import java.util.Set;
    import java.util.ArrayList;
    import java.util.List;
    import de.fhac.ti.yagi.vm.YagiVM;
    import de.fhac.ti.yagi.vm.memory.MemoryManagement;
    import de.fhac.ti.yagi.vm.memory.MemoryManagement.TermType;    
    import de.fhac.ti.yagi.vm.memory.SetType;
    import de.fhac.ti.yagi.vm.memory.models.Fluent;
    import de.fhac.ti.yagi.vm.memory.models.Fact;
    import de.fhac.ti.yagi.vm.memory.models.Value;
    import de.fhac.ti.yagi.vm.memory.models.Var;
    import de.fhac.ti.yagi.vm.memory.models.action.Action;
    import de.fhac.ti.yagi.vm.memory.models.action.Assign;
    import de.fhac.ti.yagi.vm.memory.models.action.Assign.AssignState;    
    import de.fhac.ti.yagi.vm.memory.models.action.Formula;
    import de.fhac.ti.yagi.vm.memory.models.action.Formula.FormulaRule;
    import de.fhac.ti.yagi.vm.memory.models.action.Atom;    
    import de.fhac.ti.yagi.vm.memory.models.action.Atom.AtomRule;
    import de.fhac.ti.yagi.vm.memory.models.action.Connective;    
    import de.fhac.ti.yagi.vm.memory.models.action.Connective.ConnectiveState;    
    import de.fhac.ti.yagi.vm.memory.models.action.CompOperator;
    import de.fhac.ti.yagi.vm.memory.SetItem;    
    import de.fhac.ti.yagi.vm.memory.models.AbstractSimpleModel;
    import de.fhac.ti.yagi.vm.exceptions.InvalidModelException;
    import de.fhac.ti.yagi.vm.exceptions.TermAlreadyDeclaredException;
    import de.fhac.ti.yagi.vm.exceptions.IncompatibleOperationException;
    import de.fhac.ti.yagi.vm.exceptions.ArgumentCountMismatchException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class YAGI_GrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ID", "INT", "STRING", "WHITESPACE", "'!='", "'$'", "'('", "')'", "'+='", "','", "'-='", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'action'", "'and'", "'effect:'", "'end action'", "'fact'", "'facts'", "'false'", "'fluent'", "'fluents'", "'in'", "'list'", "'not'", "'or'", "'precondition:'", "'signal:'", "'true'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int COMMENT=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int STRING=7;
    public static final int WHITESPACE=8;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public YAGI_GrammarParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public YAGI_GrammarParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return YAGI_GrammarParser.tokenNames; }
    public String getGrammarFileName() { return "/home/thens/yagi/yagi-vm/YAGI_Grammar.g"; }

        
    	YagiVM mInstance;
    	MemoryManagement mMemory;

        public YAGI_GrammarParser(YagiVM instance, TokenStream input) 
            throws Exception
        {
            this(input, new RecognizerSharedState());
            mInstance = instance;
            mMemory = mInstance.getMemoryModel();
        }  



    // $ANTLR start "line"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:64:1: line : ( declaration | block | term | list );
    public final void line() throws RecognitionException {
        YAGI_GrammarParser.term_return term1 =null;

        String list2 =null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:64:5: ( declaration | block | term | list )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 10:
            case 23:
            case 27:
            case 30:
                {
                alt1=1;
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case 11:
                    {
                    alt1=2;
                    }
                    break;
                case 13:
                case 15:
                case 19:
                    {
                    alt1=1;
                    }
                    break;
                case EOF:
                    {
                    alt1=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;

                }

                }
                break;
            case EOF:
                {
                alt1=2;
                }
                break;
            case 33:
                {
                alt1=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:64:10: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_line62);
                    declaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:66:10: block
                    {
                    pushFollow(FOLLOW_block_in_line84);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:69:10: term
                    {
                    pushFollow(FOLLOW_term_in_line117);
                    term1=term();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                           	     if ((term1!=null?term1.exists:false)) {
                           	         /* output the term's values here... */
                           	         // currently workaround for testing.. will crash if actions/procs are accessed
                           	         AbstractSimpleModel model = (AbstractSimpleModel)mMemory.getTerm((term1!=null?term1.id:null));
                           	         SetType setType = model.getSetType();
                    		 Set<SetItem> values = model.getValues();
                    		 for (SetItem item : values) {
                                	     // no need for type related conversions here.. just output the
                    	             // values's string representation
                    		     mInstance.output(item.toString());
                    		 }
                           	     } else {
                    	       	 mInstance.output("Term " + (term1!=null?term1.id:null) + " is not defined yet.");
                           	     }
                           	 }

                    }
                    break;
                case 4 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:86:10: list
                    {
                    pushFollow(FOLLOW_list_in_line142);
                    list2=list();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { 
                           	     if (list2 != null) {
                           	         mInstance.output(list2);
                           	     }
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
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line"



    // $ANTLR start "declaration"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:92:1: declaration : ( fluent_decl | fact_decl | action_decl | assignment[true] );
    public final void declaration() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:93:2: ( fluent_decl | fact_decl | action_decl | assignment[true] )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case ID:
            case 10:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:93:7: fluent_decl
                    {
                    pushFollow(FOLLOW_fluent_decl_in_declaration157);
                    fluent_decl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:94:14: fact_decl
                    {
                    pushFollow(FOLLOW_fact_decl_in_declaration172);
                    fact_decl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:95:11: action_decl
                    {
                    pushFollow(FOLLOW_action_decl_in_declaration184);
                    action_decl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:96:11: assignment[true]
                    {
                    pushFollow(FOLLOW_assignment_in_declaration196);
                    assignment(true);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declaration"



    // $ANTLR start "block"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:98:1: block : (s= statement | (s= statement )* );
    public final void block() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:99:2: (s= statement | (s= statement )* )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:99:4: s= statement
                    {
                    pushFollow(FOLLOW_statement_in_block217);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                    		}

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:101:4: (s= statement )*
                    {
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:101:4: (s= statement )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==EOF) ) {
                            int LA3_1 = input.LA(2);

                            if ( (synpred8_YAGI_Grammar()) ) {
                                alt3=1;
                            }


                        }
                        else if ( (LA3_0==ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:101:5: s= statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_block227);
                    	    statement();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    if ( state.backtracking==0 ) {
                    	    		}

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "block"



    // $ANTLR start "statement"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:104:1: statement : ( action_exec | pick | choose );
    public final void statement() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:105:2: ( action_exec | pick | choose )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred9_YAGI_Grammar()) ) {
                    alt5=1;
                }
                else if ( (synpred10_YAGI_Grammar()) ) {
                    alt5=2;
                }
                else if ( (true) ) {
                    alt5=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA5_0==EOF) ) {
                int LA5_2 = input.LA(2);

                if ( (synpred10_YAGI_Grammar()) ) {
                    alt5=2;
                }
                else if ( (true) ) {
                    alt5=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:105:4: action_exec
                    {
                    pushFollow(FOLLOW_action_exec_in_statement242);
                    action_exec();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                    		    // pretty much execute the specified action
                    		    // ...
                    		}

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:109:5: pick
                    {
                    pushFollow(FOLLOW_pick_in_statement250);
                    pick();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:110:5: choose
                    {
                    pushFollow(FOLLOW_choose_in_statement256);
                    choose();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "action_exec"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:112:1: action_exec : i= ID '(' a= arglist ')' ;
    public final void action_exec() throws RecognitionException {
        Token i=null;
        YAGI_GrammarParser.arglist_return a =null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:113:2: (i= ID '(' a= arglist ')' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:114:4: i= ID '(' a= arglist ')'
            {
            i=(Token)match(input,ID,FOLLOW_ID_in_action_exec272); if (state.failed) return ;

            match(input,11,FOLLOW_11_in_action_exec274); if (state.failed) return ;

            pushFollow(FOLLOW_arglist_in_action_exec278);
            a=arglist();

            state._fsp--;
            if (state.failed) return ;

            match(input,12,FOLLOW_12_in_action_exec280); if (state.failed) return ;

            if ( state.backtracking==0 ) {
            		    if ((a!=null?a.error:false)) {
            		    	mInstance.output("Argument is not declared yet.");
            		    } else { 
            		        // ouch, this could potentially crash...
            		        Action action = (Action)mMemory.getTerm((i!=null?i.getText():null));
            		        try {
            		            action.updateScope((a!=null?a.args:null));
            		            action.execute();
            		        } catch (ArgumentCountMismatchException e) {
            		            mInstance.output("Argument count mismatch.");
            		        } catch (Exception e) {
            		           mInstance.output("Passed argument is not valid."); 
            		        }
            		    }
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "action_exec"


    public static class arglist_return extends ParserRuleReturnScope {
        public List<Var> args;
        public boolean error;
    };


    // $ANTLR start "arglist"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:131:1: arglist returns [List<Var> args, boolean error] : v1= value[mMemory.getGlobalVar()] ( ',' v2= value[mMemory.getGlobalVar()] )* ;
    public final YAGI_GrammarParser.arglist_return arglist() throws RecognitionException {
        YAGI_GrammarParser.arglist_return retval = new YAGI_GrammarParser.arglist_return();
        retval.start = input.LT(1);


        YAGI_GrammarParser.value_return v1 =null;

        YAGI_GrammarParser.value_return v2 =null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:132:9: (v1= value[mMemory.getGlobalVar()] ( ',' v2= value[mMemory.getGlobalVar()] )* )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:133:11: v1= value[mMemory.getGlobalVar()] ( ',' v2= value[mMemory.getGlobalVar()] )*
            {
            pushFollow(FOLLOW_value_in_arglist317);
            v1=value(mMemory.getGlobalVar());

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {
                    	    retval.args = new ArrayList<Var>();
                    	    retval.error = false;
            	            Var newVar;
            		    if ((v1!=null?v1.type:null) == SetType.UNDEFINED) {
            		        // this means that we try to a access a non-declared variable
            		        retval.error = true;
            		    } else { 
            		        retval.error = false;
            		        newVar = new Var((v1!=null?v1.name:null), (v1!=null?v1.v:null), (v1!=null?v1.type:null));
            		        retval.args.add(newVar);
            		    }   	        
            		}

            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:146:3: ( ',' v2= value[mMemory.getGlobalVar()] )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:146:5: ',' v2= value[mMemory.getGlobalVar()]
            	    {
            	    match(input,14,FOLLOW_14_in_arglist326); if (state.failed) return retval;

            	    pushFollow(FOLLOW_value_in_arglist330);
            	    v2=value(mMemory.getGlobalVar());

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {
            	    		    retval.error = false;
            	    		    Map<String, Var> theScope = mMemory.getGlobalVar();
            	    	            Var newVar;
            	    		    if ((v2!=null?v2.type:null) == SetType.UNDEFINED) {
            	    		        // this means that we try to a access a non-declared variable
            	    		        retval.error = true;
            	    		    } else { 
            	    		        retval.error = false;
            	    		        newVar = new Var((v2!=null?v2.name:null), (v2!=null?v2.v:null), (v2!=null?v2.type:null));
            	    		        retval.args.add(newVar);
            	    		    }
            	    		}

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arglist"



    // $ANTLR start "pick"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:160:1: pick :;
    public final void pick() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:160:6: ()
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:160:8: 
            {
            }

        }
        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "pick"



    // $ANTLR start "choose"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:162:1: choose :;
    public final void choose() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:162:8: ()
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:162:10: 
            {
            }

        }
        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "choose"



    // $ANTLR start "action_decl"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:164:1: action_decl returns [Action tempAction] : 'action' ID '(' varlist ')' ( 'precondition:' f= formula[$tempAction.getScope()] )? ( 'effect:' a= assignment[false] )? ( 'signal:' valexpr[$tempAction.getScope()] )? 'end action' ;
    public final Action action_decl() throws RecognitionException {
        Action tempAction = null;


        Token ID3=null;
        Formula f =null;

        Assign a =null;

        List<Var> varlist4 =null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:165:9: ( 'action' ID '(' varlist ')' ( 'precondition:' f= formula[$tempAction.getScope()] )? ( 'effect:' a= assignment[false] )? ( 'signal:' valexpr[$tempAction.getScope()] )? 'end action' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:165:16: 'action' ID '(' varlist ')' ( 'precondition:' f= formula[$tempAction.getScope()] )? ( 'effect:' a= assignment[false] )? ( 'signal:' valexpr[$tempAction.getScope()] )? 'end action'
            {
            match(input,23,FOLLOW_23_in_action_decl376); if (state.failed) return tempAction;

            ID3=(Token)match(input,ID,FOLLOW_ID_in_action_decl378); if (state.failed) return tempAction;

            if ( state.backtracking==0 ) {
                                tempAction = new Action((ID3!=null?ID3.getText():null));
                            }

            match(input,11,FOLLOW_11_in_action_decl382); if (state.failed) return tempAction;

            pushFollow(FOLLOW_varlist_in_action_decl384);
            varlist4=varlist();

            state._fsp--;
            if (state.failed) return tempAction;

            match(input,12,FOLLOW_12_in_action_decl386); if (state.failed) return tempAction;

            if ( state.backtracking==0 ) {
            		    tempAction.setScope(varlist4);
            		}

            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:170:3: ( 'precondition:' f= formula[$tempAction.getScope()] )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==36) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:170:4: 'precondition:' f= formula[$tempAction.getScope()]
                    {
                    match(input,36,FOLLOW_36_in_action_decl393); if (state.failed) return tempAction;

                    pushFollow(FOLLOW_formula_in_action_decl397);
                    f=formula(tempAction.getScope());

                    state._fsp--;
                    if (state.failed) return tempAction;

                    if ( state.backtracking==0 ) {
                    		    tempAction.setFormula(f);
                    		}

                    }
                    break;

            }


            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:173:3: ( 'effect:' a= assignment[false] )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:173:4: 'effect:' a= assignment[false]
                    {
                    match(input,25,FOLLOW_25_in_action_decl408); if (state.failed) return tempAction;

                    pushFollow(FOLLOW_assignment_in_action_decl412);
                    a=assignment(false);

                    state._fsp--;
                    if (state.failed) return tempAction;

                    if ( state.backtracking==0 ) {
                    		    tempAction.setAssignment(a);
                    		}

                    }
                    break;

            }


            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:176:3: ( 'signal:' valexpr[$tempAction.getScope()] )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:176:4: 'signal:' valexpr[$tempAction.getScope()]
                    {
                    match(input,37,FOLLOW_37_in_action_decl423); if (state.failed) return tempAction;

                    pushFollow(FOLLOW_valexpr_in_action_decl425);
                    valexpr(tempAction.getScope());

                    state._fsp--;
                    if (state.failed) return tempAction;

                    }
                    break;

            }


            match(input,26,FOLLOW_26_in_action_decl432); if (state.failed) return tempAction;

            if ( state.backtracking==0 ) {
            		    // add the new action to the memory model...
            		    try {
            	                mMemory.addAction(tempAction);
            	            } catch (InvalidModelException e) {
            	                e.printStackTrace();	
            	            } catch (TermAlreadyDeclaredException e) {
            	                e.printStackTrace();
            	            }	
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return tempAction;
    }
    // $ANTLR end "action_decl"



    // $ANTLR start "assignment"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:188:1: assignment[boolean execute] returns [Assign assignObj] : assign[execute] ;
    public final Assign assignment(boolean execute) throws RecognitionException {
        Assign assignObj = null;


        Assign assign5 =null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:189:2: ( assign[execute] )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:189:4: assign[execute]
            {
            pushFollow(FOLLOW_assign_in_assignment448);
            assign5=assign(execute);

            state._fsp--;
            if (state.failed) return assignObj;

            if ( state.backtracking==0 ) { assignObj = assign5; }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return assignObj;
    }
    // $ANTLR end "assignment"



    // $ANTLR start "assign"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:191:1: assign[boolean execute] returns [Assign assignObj] : ( term '=' setexpr ';' | term '+=' setexpr ';' | term '-=' setexpr ';' | var[mMemory.getGlobalVar()] '=' valexpr[mMemory.getGlobalVar()] ';' );
    public final Assign assign(boolean execute) throws RecognitionException {
        Assign assignObj = null;


        YAGI_GrammarParser.term_return term6 =null;

        YAGI_GrammarParser.setexpr_return setexpr7 =null;

        YAGI_GrammarParser.term_return term8 =null;

        YAGI_GrammarParser.setexpr_return setexpr9 =null;

        YAGI_GrammarParser.term_return term10 =null;

        YAGI_GrammarParser.setexpr_return setexpr11 =null;

        YAGI_GrammarParser.var_return var12 =null;

        YAGI_GrammarParser.valexpr_return valexpr13 =null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:192:2: ( term '=' setexpr ';' | term '+=' setexpr ';' | term '-=' setexpr ';' | var[mMemory.getGlobalVar()] '=' valexpr[mMemory.getGlobalVar()] ';' )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                switch ( input.LA(2) ) {
                case 19:
                    {
                    alt10=1;
                    }
                    break;
                case 13:
                    {
                    alt10=2;
                    }
                    break;
                case 15:
                    {
                    alt10=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return assignObj;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }

            }
            else if ( (LA10_0==10) ) {
                alt10=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return assignObj;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:192:4: term '=' setexpr ';'
                    {
                    pushFollow(FOLLOW_term_in_assign470);
                    term6=term();

                    state._fsp--;
                    if (state.failed) return assignObj;

                    match(input,19,FOLLOW_19_in_assign472); if (state.failed) return assignObj;

                    pushFollow(FOLLOW_setexpr_in_assign474);
                    setexpr7=setexpr();

                    state._fsp--;
                    if (state.failed) return assignObj;

                    match(input,16,FOLLOW_16_in_assign476); if (state.failed) return assignObj;

                    if ( state.backtracking==0 ) {
                    	// directly execute this assignment
                    	if ((term6!=null?term6.exists:false) && (setexpr7!=null?setexpr7.valid:false) && execute) {
                    	    AbstractSimpleModel model = (AbstractSimpleModel)mMemory.getTerm((term6!=null?term6.id:null));
                    	    model.clear();
                    	    model.setSetType((setexpr7!=null?setexpr7.setType:null));
                    	    model.addAll((setexpr7!=null?setexpr7.elems:null));
                    	}
                    	// the execution is delayed (e.g. assignment in an action) 
                    	else if ((term6!=null?term6.exists:false) && (setexpr7!=null?setexpr7.valid:false) && !execute) {
                    	    AbstractSimpleModel model = (AbstractSimpleModel)mMemory.getTerm((term6!=null?term6.id:null));
                    	    assignObj = new Assign(AssignState.ASSIGN, model, (setexpr7!=null?setexpr7.setType:null), (setexpr7!=null?setexpr7.elems:null));
                    	}
                    	else {
                    	    mInstance.output("Error during assignment: ");
                    	    if (!(term6!=null?term6.exists:false)) {
                    	        mInstance.output((term6!=null?term6.error:null));
                    	    } else if (!(setexpr7!=null?setexpr7.valid:false)) {
                    	        mInstance.output((setexpr7!=null?setexpr7.error:null));
                    	    }
                    	}
                    	}

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:214:5: term '+=' setexpr ';'
                    {
                    pushFollow(FOLLOW_term_in_assign484);
                    term8=term();

                    state._fsp--;
                    if (state.failed) return assignObj;

                    match(input,13,FOLLOW_13_in_assign486); if (state.failed) return assignObj;

                    pushFollow(FOLLOW_setexpr_in_assign488);
                    setexpr9=setexpr();

                    state._fsp--;
                    if (state.failed) return assignObj;

                    match(input,16,FOLLOW_16_in_assign490); if (state.failed) return assignObj;

                    if ( state.backtracking==0 ) {
                    		if ((term8!=null?term8.exists:false) && (setexpr9!=null?setexpr9.valid:false) && execute) {
                    		    AbstractSimpleModel model = (AbstractSimpleModel)mMemory.getTerm((term8!=null?term8.id:null));
                    	    	    // this operation is only permitted if the set types are compatible
                    	    	    if (model.getSetType() == (setexpr9!=null?setexpr9.setType:null)) {
                    	    	        model.addAll((setexpr9!=null?setexpr9.elems:null));   
                    	    	    } else {
                    	    	        mInstance.output("Types are incompatible. Operation omitted.");
                    	    	    }
                        	    	} else if ((term8!=null?term8.exists:false) && (setexpr9!=null?setexpr9.valid:false) && !execute) {
                    		    AbstractSimpleModel model = (AbstractSimpleModel)mMemory.getTerm((term8!=null?term8.id:null));
                    		    assignObj = new Assign(AssignState.PLUS_ASSIGN, model, (setexpr9!=null?setexpr9.setType:null), (setexpr9!=null?setexpr9.elems:null));
                        	    	}
                    	}

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:228:5: term '-=' setexpr ';'
                    {
                    pushFollow(FOLLOW_term_in_assign498);
                    term10=term();

                    state._fsp--;
                    if (state.failed) return assignObj;

                    match(input,15,FOLLOW_15_in_assign500); if (state.failed) return assignObj;

                    pushFollow(FOLLOW_setexpr_in_assign502);
                    setexpr11=setexpr();

                    state._fsp--;
                    if (state.failed) return assignObj;

                    match(input,16,FOLLOW_16_in_assign504); if (state.failed) return assignObj;

                    if ( state.backtracking==0 ) {
                    		if ((term10!=null?term10.exists:false) && (setexpr11!=null?setexpr11.valid:false) && execute) {
                    		    AbstractSimpleModel model = (AbstractSimpleModel)mMemory.getTerm((term10!=null?term10.id:null));
                    	    	    // this operation is only permitted if the set types are compatible
                    	    	    if (model.getSetType() == (setexpr11!=null?setexpr11.setType:null)) {
                    	    	        model.removeAll((setexpr11!=null?setexpr11.elems:null));   
                    	    	    } else {
                    	    	        mInstance.output("Types are incompatible. Operation omitted.");
                    	    	    }
                        	        }
                        	        else if ((term10!=null?term10.exists:false) && (setexpr11!=null?setexpr11.valid:false) && !execute) {
                    	    		AbstractSimpleModel model = (AbstractSimpleModel)mMemory.getTerm((term10!=null?term10.id:null));
                    	    		assignObj = new Assign(AssignState.MINUS_ASSIGN, model, (setexpr11!=null?setexpr11.setType:null), (setexpr11!=null?setexpr11.elems:null));
                    		}
                    	}

                    }
                    break;
                case 4 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:248:5: var[mMemory.getGlobalVar()] '=' valexpr[mMemory.getGlobalVar()] ';'
                    {
                    pushFollow(FOLLOW_var_in_assign519);
                    var12=var(mMemory.getGlobalVar());

                    state._fsp--;
                    if (state.failed) return assignObj;

                    match(input,19,FOLLOW_19_in_assign522); if (state.failed) return assignObj;

                    pushFollow(FOLLOW_valexpr_in_assign524);
                    valexpr13=valexpr(mMemory.getGlobalVar());

                    state._fsp--;
                    if (state.failed) return assignObj;

                    match(input,16,FOLLOW_16_in_assign527); if (state.failed) return assignObj;

                    if ( state.backtracking==0 ) { 
                    	    Var newVar = new Var((var12!=null?var12.id:null), (valexpr13!=null?valexpr13.v:null), (valexpr13!=null?valexpr13.setType:null));
                    	    mMemory.addGlobalVar(newVar);       
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
        	// do for sure before leaving
        }
        return assignObj;
    }
    // $ANTLR end "assign"


    public static class term_return extends ParserRuleReturnScope {
        public boolean exists;
        public String output;
        public String error;
        public String id;
    };


    // $ANTLR start "term"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:256:1: term returns [boolean exists, String output, String error, String id] : ID ;
    public final YAGI_GrammarParser.term_return term() throws RecognitionException {
        YAGI_GrammarParser.term_return retval = new YAGI_GrammarParser.term_return();
        retval.start = input.LT(1);


        Token ID14=null;

        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:257:2: ( ID )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:257:4: ID
            {
            ID14=(Token)match(input,ID,FOLLOW_ID_in_term549); if (state.failed) return retval;

            if ( state.backtracking==0 ) {
            	retval.id = (ID14!=null?ID14.getText():null);
                    retval.exists = true;
            	if (!mMemory.containsTerm((ID14!=null?ID14.getText():null))) {
            	    retval.error = "Term '" + (ID14!=null?ID14.getText():null) + "' is not specified yet.";
            	    retval.exists = false;
            	} else {
            	    retval.output = "Term '" + (ID14!=null?ID14.getText():null) + "' exists.";
            	}
            	}

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"



    // $ANTLR start "varlist"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:268:1: varlist returns [List<Var> varList] : v1= var[mMemory.getGlobalVar()] ( ',' v2= var[mMemory.getGlobalVar()] )* ;
    public final List<Var> varlist() throws RecognitionException {
        List<Var> varList = null;


        YAGI_GrammarParser.var_return v1 =null;

        YAGI_GrammarParser.var_return v2 =null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:269:2: (v1= var[mMemory.getGlobalVar()] ( ',' v2= var[mMemory.getGlobalVar()] )* )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:269:4: v1= var[mMemory.getGlobalVar()] ( ',' v2= var[mMemory.getGlobalVar()] )*
            {
            pushFollow(FOLLOW_var_in_varlist568);
            v1=var(mMemory.getGlobalVar());

            state._fsp--;
            if (state.failed) return varList;

            if ( state.backtracking==0 ) {
            		    varList = new ArrayList<Var>();
            		    Var newVar = new Var((v1!=null?v1.id:null), null, (v1!=null?v1.setType:null)); 
            		    varList.add(newVar); 
            		}

            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:274:3: ( ',' v2= var[mMemory.getGlobalVar()] )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:274:5: ',' v2= var[mMemory.getGlobalVar()]
            	    {
            	    match(input,14,FOLLOW_14_in_varlist577); if (state.failed) return varList;

            	    pushFollow(FOLLOW_var_in_varlist581);
            	    v2=var(mMemory.getGlobalVar());

            	    state._fsp--;
            	    if (state.failed) return varList;

            	    if ( state.backtracking==0 ) {
            	    		    Var newVar = new Var((v2!=null?v2.id:null), null, (v2!=null?v2.setType:null)); 
            	    		    varList.add(newVar);
            	    		}

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return varList;
    }
    // $ANTLR end "varlist"



    // $ANTLR start "formula"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:279:1: formula[Map<String, Var> theScope] returns [Formula formula] : (a= atom[theScope] | 'not' '(' b= formula[theScope] ')' | '(' a= atom[theScope] c= connective b= formula[theScope] ')' );
    public final Formula formula(Map<String, Var> theScope) throws RecognitionException {
        Formula formula = null;


        Atom a =null;

        Formula b =null;

        ConnectiveState c =null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:280:2: (a= atom[theScope] | 'not' '(' b= formula[theScope] ')' | '(' a= atom[theScope] c= connective b= formula[theScope] ')' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case ID:
            case INT:
            case STRING:
            case 10:
            case 29:
            case 38:
            case 39:
                {
                alt12=1;
                }
                break;
            case 34:
                {
                alt12=2;
                }
                break;
            case 11:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return formula;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:280:6: a= atom[theScope]
                    {
                    pushFollow(FOLLOW_atom_in_formula608);
                    a=atom(theScope);

                    state._fsp--;
                    if (state.failed) return formula;

                    if ( state.backtracking==0 ) {
                    	    formula = new Formula(FormulaRule.FIRST, theScope);
                    	    formula.setAtom(a);          
                    	}

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:284:4: 'not' '(' b= formula[theScope] ')'
                    {
                    match(input,34,FOLLOW_34_in_formula619); if (state.failed) return formula;

                    match(input,11,FOLLOW_11_in_formula621); if (state.failed) return formula;

                    pushFollow(FOLLOW_formula_in_formula625);
                    b=formula(theScope);

                    state._fsp--;
                    if (state.failed) return formula;

                    match(input,12,FOLLOW_12_in_formula628); if (state.failed) return formula;

                    if ( state.backtracking==0 ) {
                    	    formula = new Formula(FormulaRule.SECOND, theScope);
                    	    formula.setFormula(b);
                    	}

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:288:4: '(' a= atom[theScope] c= connective b= formula[theScope] ')'
                    {
                    match(input,11,FOLLOW_11_in_formula638); if (state.failed) return formula;

                    pushFollow(FOLLOW_atom_in_formula642);
                    a=atom(theScope);

                    state._fsp--;
                    if (state.failed) return formula;

                    pushFollow(FOLLOW_connective_in_formula647);
                    c=connective();

                    state._fsp--;
                    if (state.failed) return formula;

                    pushFollow(FOLLOW_formula_in_formula651);
                    b=formula(theScope);

                    state._fsp--;
                    if (state.failed) return formula;

                    match(input,12,FOLLOW_12_in_formula654); if (state.failed) return formula;

                    if ( state.backtracking==0 ) {
                    	    formula = new Formula(FormulaRule.THIRD, theScope);
                    	    Connective conn = new Connective(c, a, b);
                    	    formula.setConnective(conn);
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
        	// do for sure before leaving
        }
        return formula;
    }
    // $ANTLR end "formula"



    // $ANTLR start "atom"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:298:1: atom[Map<String, Var> theScope] returns [Atom atomResult] : (e1= valexpr[theScope] c= comp_op e2= valexpr[theScope] |s1= setexpr c= comp_op s2= setexpr |v1= value[mMemory.getGlobalVar()] 'in' s2= setexpr | 'true' | 'false' );
    public final Atom atom(Map<String, Var> theScope) throws RecognitionException {
        Atom atomResult = null;


        YAGI_GrammarParser.valexpr_return e1 =null;

        CompOperator c =null;

        YAGI_GrammarParser.valexpr_return e2 =null;

        YAGI_GrammarParser.setexpr_return s1 =null;

        YAGI_GrammarParser.setexpr_return s2 =null;

        YAGI_GrammarParser.value_return v1 =null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:299:2: (e1= valexpr[theScope] c= comp_op e2= valexpr[theScope] |s1= setexpr c= comp_op s2= setexpr |v1= value[mMemory.getGlobalVar()] 'in' s2= setexpr | 'true' | 'false' )
            int alt13=5;
            switch ( input.LA(1) ) {
            case INT:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==9||(LA13_1 >= 17 && LA13_1 <= 18)||(LA13_1 >= 20 && LA13_1 <= 22)) ) {
                    alt13=1;
                }
                else if ( (LA13_1==32) ) {
                    alt13=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return atomResult;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
                }
                break;
            case STRING:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==9||(LA13_2 >= 17 && LA13_2 <= 18)||(LA13_2 >= 20 && LA13_2 <= 22)) ) {
                    alt13=1;
                }
                else if ( (LA13_2==32) ) {
                    alt13=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return atomResult;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;

                }
                }
                break;
            case 10:
                {
                int LA13_3 = input.LA(2);

                if ( (LA13_3==ID) ) {
                    int LA13_9 = input.LA(3);

                    if ( (LA13_9==9||(LA13_9 >= 17 && LA13_9 <= 18)||(LA13_9 >= 20 && LA13_9 <= 22)) ) {
                        alt13=1;
                    }
                    else if ( (LA13_9==32) ) {
                        alt13=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return atomResult;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 9, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return atomResult;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;

                }
                }
                break;
            case ID:
            case 39:
                {
                alt13=2;
                }
                break;
            case 38:
                {
                alt13=4;
                }
                break;
            case 29:
                {
                alt13=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return atomResult;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:299:4: e1= valexpr[theScope] c= comp_op e2= valexpr[theScope]
                    {
                    pushFollow(FOLLOW_valexpr_in_atom682);
                    e1=valexpr(theScope);

                    state._fsp--;
                    if (state.failed) return atomResult;

                    pushFollow(FOLLOW_comp_op_in_atom687);
                    c=comp_op();

                    state._fsp--;
                    if (state.failed) return atomResult;

                    pushFollow(FOLLOW_valexpr_in_atom691);
                    e2=valexpr(theScope);

                    state._fsp--;
                    if (state.failed) return atomResult;

                    if ( state.backtracking==0 ) {
                    	            atomResult = new Atom(AtomRule.FIRST, theScope);
                    	            Var first = new Var((e1!=null?e1.name:null), (e1!=null?e1.v:null), (e1!=null?e1.setType:null));
                    	    	    Var second = new Var((e2!=null?e2.name:null), (e2!=null?e2.v:null), (e2!=null?e2.setType:null));
                    	    	    CompOperator op = c;
                    	    	    atomResult.setFirstVar(first);
                        	    	    atomResult.setSecondVar(second);
                        	    	    atomResult.setCompOp(op);
                    	}

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:308:4: s1= setexpr c= comp_op s2= setexpr
                    {
                    pushFollow(FOLLOW_setexpr_in_atom701);
                    s1=setexpr();

                    state._fsp--;
                    if (state.failed) return atomResult;

                    pushFollow(FOLLOW_comp_op_in_atom705);
                    c=comp_op();

                    state._fsp--;
                    if (state.failed) return atomResult;

                    pushFollow(FOLLOW_setexpr_in_atom709);
                    s2=setexpr();

                    state._fsp--;
                    if (state.failed) return atomResult;

                    if ( state.backtracking==0 ) {
                    	}

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:310:4: v1= value[mMemory.getGlobalVar()] 'in' s2= setexpr
                    {
                    pushFollow(FOLLOW_value_in_atom718);
                    v1=value(mMemory.getGlobalVar());

                    state._fsp--;
                    if (state.failed) return atomResult;

                    match(input,32,FOLLOW_32_in_atom721); if (state.failed) return atomResult;

                    pushFollow(FOLLOW_setexpr_in_atom725);
                    s2=setexpr();

                    state._fsp--;
                    if (state.failed) return atomResult;

                    if ( state.backtracking==0 ) {
                    	}

                    }
                    break;
                case 4 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:312:4: 'true'
                    {
                    match(input,38,FOLLOW_38_in_atom733); if (state.failed) return atomResult;

                    }
                    break;
                case 5 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:313:5: 'false'
                    {
                    match(input,29,FOLLOW_29_in_atom739); if (state.failed) return atomResult;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return atomResult;
    }
    // $ANTLR end "atom"



    // $ANTLR start "connective"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:315:1: connective returns [ConnectiveState connState] : ( 'and' | 'or' );
    public final ConnectiveState connective() throws RecognitionException {
        ConnectiveState connState = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:316:2: ( 'and' | 'or' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            else if ( (LA14_0==35) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return connState;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:316:4: 'and'
                    {
                    match(input,24,FOLLOW_24_in_connective754); if (state.failed) return connState;

                    if ( state.backtracking==0 ) {connState = ConnectiveState.AND; }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:317:4: 'or'
                    {
                    match(input,35,FOLLOW_35_in_connective761); if (state.failed) return connState;

                    if ( state.backtracking==0 ) {connState = ConnectiveState.OR; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return connState;
    }
    // $ANTLR end "connective"



    // $ANTLR start "comp_op"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:319:1: comp_op returns [CompOperator op] : ( '==' | '!=' | '<=' | '>=' | '<' | '>' );
    public final CompOperator comp_op() throws RecognitionException {
        CompOperator op = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:320:2: ( '==' | '!=' | '<=' | '>=' | '<' | '>' )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt15=1;
                }
                break;
            case 9:
                {
                alt15=2;
                }
                break;
            case 18:
                {
                alt15=3;
                }
                break;
            case 22:
                {
                alt15=4;
                }
                break;
            case 17:
                {
                alt15=5;
                }
                break;
            case 21:
                {
                alt15=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return op;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:320:4: '=='
                    {
                    match(input,20,FOLLOW_20_in_comp_op780); if (state.failed) return op;

                    if ( state.backtracking==0 ) { op = CompOperator.EQUALS; }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:321:4: '!='
                    {
                    match(input,9,FOLLOW_9_in_comp_op788); if (state.failed) return op;

                    if ( state.backtracking==0 ) { op = CompOperator.NOT_EQUALS; }

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:322:4: '<='
                    {
                    match(input,18,FOLLOW_18_in_comp_op796); if (state.failed) return op;

                    if ( state.backtracking==0 ) { op = CompOperator.LESS_OR_EQUAL; }

                    }
                    break;
                case 4 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:323:4: '>='
                    {
                    match(input,22,FOLLOW_22_in_comp_op804); if (state.failed) return op;

                    if ( state.backtracking==0 ) { op = CompOperator.GREATER_OR_EQUAL; }

                    }
                    break;
                case 5 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:324:4: '<'
                    {
                    match(input,17,FOLLOW_17_in_comp_op813); if (state.failed) return op;

                    if ( state.backtracking==0 ) { op = CompOperator.LESS; }

                    }
                    break;
                case 6 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:325:4: '>'
                    {
                    match(input,21,FOLLOW_21_in_comp_op821); if (state.failed) return op;

                    if ( state.backtracking==0 ) { op = CompOperator.GREATER; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return op;
    }
    // $ANTLR end "comp_op"



    // $ANTLR start "list"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:327:1: list returns [String output] : 'list' list_term ';' ;
    public final String list() throws RecognitionException {
        String output = null;


        String list_term15 =null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:327:29: ( 'list' list_term ';' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:328:2: 'list' list_term ';'
            {
            match(input,33,FOLLOW_33_in_list838); if (state.failed) return output;

            pushFollow(FOLLOW_list_term_in_list840);
            list_term15=list_term();

            state._fsp--;
            if (state.failed) return output;

            match(input,16,FOLLOW_16_in_list842); if (state.failed) return output;

            if ( state.backtracking==0 ) { output = list_term15; }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return output;
    }
    // $ANTLR end "list"



    // $ANTLR start "list_term"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:330:1: list_term returns [String output] : ( 'fluents' | 'facts' );
    public final String list_term() throws RecognitionException {
        String output = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:330:35: ( 'fluents' | 'facts' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            else if ( (LA16_0==28) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return output;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:331:2: 'fluents'
                    {
                    match(input,31,FOLLOW_31_in_list_term861); if (state.failed) return output;

                    if ( state.backtracking==0 ) {
                    	    output = mMemory.listTerm(TermType.FLUENT);
                    	}

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:335:2: 'facts'
                    {
                    match(input,28,FOLLOW_28_in_list_term870); if (state.failed) return output;

                    if ( state.backtracking==0 ) {
                    	    output = mMemory.listTerm(TermType.FACT);
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
        	// do for sure before leaving
        }
        return output;
    }
    // $ANTLR end "list_term"


    public static class setexpr_return extends ParserRuleReturnScope {
        public List<SetItem> elems;
        public SetType setType;
        public boolean valid;
        public String error;
    };


    // $ANTLR start "setexpr"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:342:1: setexpr returns [List<SetItem> elems, SetType setType, boolean valid, String error] : set ;
    public final YAGI_GrammarParser.setexpr_return setexpr() throws RecognitionException {
        YAGI_GrammarParser.setexpr_return retval = new YAGI_GrammarParser.setexpr_return();
        retval.start = input.LT(1);


        YAGI_GrammarParser.set_return set16 =null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:342:85: ( set )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:343:2: set
            {
            pushFollow(FOLLOW_set_in_setexpr891);
            set16=set();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.valid = (set16!=null?set16.valid:false);
            	      retval.error = (set16!=null?set16.error:null);
            	      retval.elems = (set16!=null?set16.elems:null);
            	      retval.setType = (set16!=null?set16.setType:null);}

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "setexpr"


    public static class set_return extends ParserRuleReturnScope {
        public List<SetItem> elems;
        public SetType setType;
        public boolean valid;
        public String error;
    };


    // $ANTLR start "set"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:348:1: set returns [List<SetItem> elems, SetType setType, boolean valid, String error] : ( '{' a= value[mMemory.getGlobalVar()] ( ',' b= value[mMemory.getGlobalVar()] )* '}' |t= term );
    public final YAGI_GrammarParser.set_return set() throws RecognitionException {
        YAGI_GrammarParser.set_return retval = new YAGI_GrammarParser.set_return();
        retval.start = input.LT(1);


        YAGI_GrammarParser.value_return a =null;

        YAGI_GrammarParser.value_return b =null;

        YAGI_GrammarParser.term_return t =null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:348:81: ( '{' a= value[mMemory.getGlobalVar()] ( ',' b= value[mMemory.getGlobalVar()] )* '}' |t= term )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            else if ( (LA18_0==ID) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:349:2: '{' a= value[mMemory.getGlobalVar()] ( ',' b= value[mMemory.getGlobalVar()] )* '}'
                    {
                    match(input,39,FOLLOW_39_in_set907); if (state.failed) return retval;

                    pushFollow(FOLLOW_value_in_set911);
                    a=value(mMemory.getGlobalVar());

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {
                    	    retval.elems = new ArrayList<SetItem>();
                    	    SetItem item = new SetItem((a!=null?a.v:null));
                    	    retval.elems.add(item);
                    	    retval.setType = (a!=null?a.type:null);
                    	    retval.valid = true;
                    	}

                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:356:2: ( ',' b= value[mMemory.getGlobalVar()] )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:356:3: ',' b= value[mMemory.getGlobalVar()]
                    	    {
                    	    match(input,14,FOLLOW_14_in_set918); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_value_in_set922);
                    	    b=value(mMemory.getGlobalVar());

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) {
                    	    	    SetItem item = new SetItem((b!=null?b.v:null));
                    	    	    retval.elems.add(item);
                    	    	}

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    match(input,40,FOLLOW_40_in_set930); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:360:4: t= term
                    {
                    pushFollow(FOLLOW_term_in_set937);
                    t=term();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {
                    	    retval.valid = (t!=null?t.exists:false);
                    	    if (retval.valid) {
                    	        AbstractSimpleModel term = (AbstractSimpleModel)mMemory.getTerm((t!=null?t.id:null));
                    	        retval.elems = new ArrayList<SetItem>();
                    	        for (SetItem item : term.getValues()) {
                    	            retval.elems.add(item);
                    	        }
                    	        retval.setType = term.getSetType();
                    	    } else {
                    	        retval.error = (t!=null?t.error:null);
                    	    }
                    	}

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "set"


    public static class value_return extends ParserRuleReturnScope {
        public String name;
        public String v;
        public SetType type;
    };


    // $ANTLR start "value"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:374:1: value[Map<String, Var> theScope] returns [String name, String v, SetType type] : ( INT | STRING | var[theScope] );
    public final YAGI_GrammarParser.value_return value(Map<String, Var> theScope) throws RecognitionException {
        YAGI_GrammarParser.value_return retval = new YAGI_GrammarParser.value_return();
        retval.start = input.LT(1);


        Token INT17=null;
        Token STRING18=null;
        YAGI_GrammarParser.var_return var19 =null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:375:2: ( INT | STRING | var[theScope] )
            int alt19=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt19=1;
                }
                break;
            case STRING:
                {
                alt19=2;
                }
                break;
            case 10:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:375:4: INT
                    {
                    INT17=(Token)match(input,INT,FOLLOW_INT_in_value955); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.name = "primitive";
                    	 		 retval.v = (INT17!=null?INT17.getText():null);
                    			 retval.type = SetType.INT;}

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:378:4: STRING
                    {
                    STRING18=(Token)match(input,STRING,FOLLOW_STRING_in_value962); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.name = "primitive";
                    			 retval.v = (STRING18!=null?STRING18.getText():null);
                    			 retval.type = SetType.STRING;}

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:381:4: var[theScope]
                    {
                    pushFollow(FOLLOW_var_in_value970);
                    var19=var(theScope);

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.name = (var19!=null?var19.id:null);
                    			 retval.v = (var19!=null?var19.v:null);
                    			 retval.type = (var19!=null?var19.setType:null);}

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "value"


    public static class var_return extends ParserRuleReturnScope {
        public String id;
        public String v;
        public SetType setType;
    };


    // $ANTLR start "var"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:386:1: var[Map<String, Var> theScope] returns [String id, String v, SetType setType] : '$' ID ;
    public final YAGI_GrammarParser.var_return var(Map<String, Var> theScope) throws RecognitionException {
        YAGI_GrammarParser.var_return retval = new YAGI_GrammarParser.var_return();
        retval.start = input.LT(1);


        Token ID20=null;

        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:387:2: ( '$' ID )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:387:4: '$' ID
            {
            match(input,10,FOLLOW_10_in_var995); if (state.failed) return retval;

            ID20=(Token)match(input,ID,FOLLOW_ID_in_var997); if (state.failed) return retval;

            if ( state.backtracking==0 ) {
            	    if (theScope.containsKey((ID20!=null?ID20.getText():null))) {
                            retval.id = (ID20!=null?ID20.getText():null);
                            retval.v = theScope.get((ID20!=null?ID20.getText():null)).getmValue();
                            retval.setType = theScope.get((ID20!=null?ID20.getText():null)).getSetType();
                        } else {
                            retval.id = (ID20!=null?ID20.getText():null);
                            retval.v = null;
                            retval.setType = SetType.UNDEFINED;
                        }
            	}

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "var"


    public static class valexpr_return extends ParserRuleReturnScope {
        public String name;
        public String v;
        public SetType setType;
    };


    // $ANTLR start "valexpr"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:399:1: valexpr[Map<String, Var> theScope] returns [String name, String v, SetType setType] : value[theScope] ;
    public final YAGI_GrammarParser.valexpr_return valexpr(Map<String, Var> theScope) throws RecognitionException {
        YAGI_GrammarParser.valexpr_return retval = new YAGI_GrammarParser.valexpr_return();
        retval.start = input.LT(1);


        YAGI_GrammarParser.value_return value21 =null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:400:2: ( value[theScope] )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:404:2: value[theScope]
            {
            pushFollow(FOLLOW_value_in_valexpr1023);
            value21=value(theScope);

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {
            	    retval.name = (value21!=null?value21.name:null);
            	    retval.v = (value21!=null?value21.v:null);
            	    retval.setType = (value21!=null?value21.type:null);
            	}

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "valexpr"



    // $ANTLR start "fluent_decl"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:410:1: fluent_decl : 'fluent' ID ';' ;
    public final void fluent_decl() throws RecognitionException {
        Token ID22=null;

        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:410:12: ( 'fluent' ID ';' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:410:15: 'fluent' ID ';'
            {
            match(input,30,FOLLOW_30_in_fluent_decl1035); if (state.failed) return ;

            ID22=(Token)match(input,ID,FOLLOW_ID_in_fluent_decl1037); if (state.failed) return ;

            match(input,16,FOLLOW_16_in_fluent_decl1039); if (state.failed) return ;

            if ( state.backtracking==0 ) { 
            	Fluent fluent = new Fluent((ID22!=null?ID22.getText():null), TermType.FLUENT);
            	try {
            	    mMemory.addFluent(fluent); 
            	} catch (InvalidModelException e) {
            	    e.printStackTrace();	
            	} catch (TermAlreadyDeclaredException e) {
            	    e.printStackTrace();
            	}	
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "fluent_decl"



    // $ANTLR start "fact_decl"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:421:1: fact_decl : 'fact' ID ';' ;
    public final void fact_decl() throws RecognitionException {
        Token ID23=null;

        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:421:10: ( 'fact' ID ';' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:421:13: 'fact' ID ';'
            {
            match(input,27,FOLLOW_27_in_fact_decl1050); if (state.failed) return ;

            ID23=(Token)match(input,ID,FOLLOW_ID_in_fact_decl1052); if (state.failed) return ;

            match(input,16,FOLLOW_16_in_fact_decl1054); if (state.failed) return ;

            if ( state.backtracking==0 ) { 
            	Fact fact = new Fact((ID23!=null?ID23.getText():null), TermType.FACT);
            	try {
            	    mMemory.addFact(fact); 
            	} catch (InvalidModelException e) {
            	    e.printStackTrace();	
            	} catch (TermAlreadyDeclaredException e) {
            	    mInstance.output("Error. Term with the id '" + (ID23!=null?ID23.getText():null) + "' is already defined.");
            	}
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "fact_decl"

    // $ANTLR start synpred7_YAGI_Grammar
    public final void synpred7_YAGI_Grammar_fragment() throws RecognitionException {
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:99:4: (s= statement )
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:99:4: s= statement
        {
        pushFollow(FOLLOW_statement_in_synpred7_YAGI_Grammar217);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_YAGI_Grammar

    // $ANTLR start synpred8_YAGI_Grammar
    public final void synpred8_YAGI_Grammar_fragment() throws RecognitionException {
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:101:5: (s= statement )
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:101:5: s= statement
        {
        pushFollow(FOLLOW_statement_in_synpred8_YAGI_Grammar227);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_YAGI_Grammar

    // $ANTLR start synpred9_YAGI_Grammar
    public final void synpred9_YAGI_Grammar_fragment() throws RecognitionException {
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:105:4: ( action_exec )
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:105:4: action_exec
        {
        pushFollow(FOLLOW_action_exec_in_synpred9_YAGI_Grammar242);
        action_exec();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_YAGI_Grammar

    // $ANTLR start synpred10_YAGI_Grammar
    public final void synpred10_YAGI_Grammar_fragment() throws RecognitionException {
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:109:5: ( pick )
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:109:5: pick
        {
        pushFollow(FOLLOW_pick_in_synpred10_YAGI_Grammar250);
        pick();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_YAGI_Grammar

    // Delegated rules

    public final boolean synpred10_YAGI_Grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_YAGI_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_YAGI_Grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_YAGI_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_YAGI_Grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_YAGI_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_YAGI_Grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_YAGI_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\25\uffff";
    static final String DFA4_eofS =
        "\1\2\24\uffff";
    static final String DFA4_minS =
        "\1\5\1\13\1\0\1\6\2\uffff\2\14\1\5\1\6\2\0\3\14\1\5\3\0\1\14\1\0";
    static final String DFA4_maxS =
        "\1\5\1\13\1\0\1\12\2\uffff\2\16\1\5\1\12\2\0\3\16\1\5\3\0\1\16\1"+
        "\0";
    static final String DFA4_acceptS =
        "\4\uffff\1\1\1\2\17\uffff";
    static final String DFA4_specialS =
        "\2\uffff\1\6\7\uffff\1\4\1\5\4\uffff\1\3\1\2\1\1\1\uffff\1\0}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\3",
            "\1\uffff",
            "\1\6\1\7\2\uffff\1\10",
            "",
            "",
            "\1\12\1\uffff\1\11",
            "\1\13\1\uffff\1\11",
            "\1\14",
            "\1\15\1\16\2\uffff\1\17",
            "\1\uffff",
            "\1\uffff",
            "\1\20\1\uffff\1\11",
            "\1\21\1\uffff\1\11",
            "\1\22\1\uffff\1\11",
            "\1\23",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\24\1\uffff\1\11",
            "\1\uffff"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "98:1: block : (s= statement | (s= statement )* );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_20 = input.LA(1);

                         
                        int index4_20 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred7_YAGI_Grammar()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index4_20);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA4_18 = input.LA(1);

                         
                        int index4_18 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred7_YAGI_Grammar()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index4_18);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA4_17 = input.LA(1);

                         
                        int index4_17 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred7_YAGI_Grammar()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index4_17);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA4_16 = input.LA(1);

                         
                        int index4_16 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred7_YAGI_Grammar()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index4_16);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA4_10 = input.LA(1);

                         
                        int index4_10 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred7_YAGI_Grammar()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index4_10);

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA4_11 = input.LA(1);

                         
                        int index4_11 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred7_YAGI_Grammar()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index4_11);

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA4_2 = input.LA(1);

                         
                        int index4_2 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred7_YAGI_Grammar()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index4_2);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

    public static final BitSet FOLLOW_declaration_in_line62 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_line84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_line117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_line142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fluent_decl_in_declaration157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_decl_in_declaration172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_decl_in_declaration184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_declaration196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_block217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_block227 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_action_exec_in_statement242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pick_in_statement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_choose_in_statement256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_action_exec272 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_action_exec274 = new BitSet(new long[]{0x00000000000004C0L});
    public static final BitSet FOLLOW_arglist_in_action_exec278 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_action_exec280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_arglist317 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_arglist326 = new BitSet(new long[]{0x00000000000004C0L});
    public static final BitSet FOLLOW_value_in_arglist330 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_23_in_action_decl376 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_action_decl378 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_action_decl382 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_varlist_in_action_decl384 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_action_decl386 = new BitSet(new long[]{0x0000003006000000L});
    public static final BitSet FOLLOW_36_in_action_decl393 = new BitSet(new long[]{0x000000C420000CE0L});
    public static final BitSet FOLLOW_formula_in_action_decl397 = new BitSet(new long[]{0x0000002006000000L});
    public static final BitSet FOLLOW_25_in_action_decl408 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_assignment_in_action_decl412 = new BitSet(new long[]{0x0000002004000000L});
    public static final BitSet FOLLOW_37_in_action_decl423 = new BitSet(new long[]{0x00000000000004C0L});
    public static final BitSet FOLLOW_valexpr_in_action_decl425 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_action_decl432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_assignment448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_assign470 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_assign472 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_setexpr_in_assign474 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_assign476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_assign484 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_assign486 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_setexpr_in_assign488 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_assign490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_assign498 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_assign500 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_setexpr_in_assign502 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_assign504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_assign519 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_assign522 = new BitSet(new long[]{0x00000000000004C0L});
    public static final BitSet FOLLOW_valexpr_in_assign524 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_assign527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varlist568 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_varlist577 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_var_in_varlist581 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_atom_in_formula608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_formula619 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_formula621 = new BitSet(new long[]{0x000000C420000CE0L});
    public static final BitSet FOLLOW_formula_in_formula625 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_formula628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_formula638 = new BitSet(new long[]{0x000000C0200004E0L});
    public static final BitSet FOLLOW_atom_in_formula642 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_connective_in_formula647 = new BitSet(new long[]{0x000000C420000CE0L});
    public static final BitSet FOLLOW_formula_in_formula651 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_formula654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valexpr_in_atom682 = new BitSet(new long[]{0x0000000000760200L});
    public static final BitSet FOLLOW_comp_op_in_atom687 = new BitSet(new long[]{0x00000000000004C0L});
    public static final BitSet FOLLOW_valexpr_in_atom691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setexpr_in_atom701 = new BitSet(new long[]{0x0000000000760200L});
    public static final BitSet FOLLOW_comp_op_in_atom705 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_setexpr_in_atom709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_atom718 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_atom721 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_setexpr_in_atom725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_atom733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_atom739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_connective754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_connective761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_comp_op780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_comp_op788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_comp_op796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_comp_op804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_comp_op813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_comp_op821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_list838 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_list_term_in_list840 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_list842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_list_term861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_list_term870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_setexpr891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_set907 = new BitSet(new long[]{0x00000000000004C0L});
    public static final BitSet FOLLOW_value_in_set911 = new BitSet(new long[]{0x0000010000004000L});
    public static final BitSet FOLLOW_14_in_set918 = new BitSet(new long[]{0x00000000000004C0L});
    public static final BitSet FOLLOW_value_in_set922 = new BitSet(new long[]{0x0000010000004000L});
    public static final BitSet FOLLOW_40_in_set930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_set937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_value955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_value970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_var995 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_var997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_valexpr1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_fluent_decl1035 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_fluent_decl1037 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fluent_decl1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_fact_decl1050 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_fact_decl1052 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fact_decl1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_synpred7_YAGI_Grammar217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_synpred8_YAGI_Grammar227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_exec_in_synpred9_YAGI_Grammar242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pick_in_synpred10_YAGI_Grammar250 = new BitSet(new long[]{0x0000000000000002L});

}