// Generated from C:/Users/User/Desktop/CPSC410/410Project1Group17/src/parser\firstParser.g4 by ANTLR 4.9.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link firstParser}.
 */
public interface firstParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link firstParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(firstParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link firstParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(firstParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link firstParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(firstParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link firstParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(firstParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link firstParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(firstParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link firstParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(firstParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link firstParser#hold}.
	 * @param ctx the parse tree
	 */
	void enterHold(firstParser.HoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link firstParser#hold}.
	 * @param ctx the parse tree
	 */
	void exitHold(firstParser.HoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link firstParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(firstParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link firstParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(firstParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link firstParser#waitFor}.
	 * @param ctx the parse tree
	 */
	void enterWaitFor(firstParser.WaitForContext ctx);
	/**
	 * Exit a parse tree produced by {@link firstParser#waitFor}.
	 * @param ctx the parse tree
	 */
	void exitWaitFor(firstParser.WaitForContext ctx);
	/**
	 * Enter a parse tree produced by {@link firstParser#press}.
	 * @param ctx the parse tree
	 */
	void enterPress(firstParser.PressContext ctx);
	/**
	 * Exit a parse tree produced by {@link firstParser#press}.
	 * @param ctx the parse tree
	 */
	void exitPress(firstParser.PressContext ctx);
	/**
	 * Enter a parse tree produced by {@link firstParser#hover}.
	 * @param ctx the parse tree
	 */
	void enterHover(firstParser.HoverContext ctx);
	/**
	 * Exit a parse tree produced by {@link firstParser#hover}.
	 * @param ctx the parse tree
	 */
	void exitHover(firstParser.HoverContext ctx);
	/**
	 * Enter a parse tree produced by {@link firstParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(firstParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link firstParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(firstParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link firstParser#mouse}.
	 * @param ctx the parse tree
	 */
	void enterMouse(firstParser.MouseContext ctx);
	/**
	 * Exit a parse tree produced by {@link firstParser#mouse}.
	 * @param ctx the parse tree
	 */
	void exitMouse(firstParser.MouseContext ctx);
	/**
	 * Enter a parse tree produced by {@link firstParser#coord}.
	 * @param ctx the parse tree
	 */
	void enterCoord(firstParser.CoordContext ctx);
	/**
	 * Exit a parse tree produced by {@link firstParser#coord}.
	 * @param ctx the parse tree
	 */
	void exitCoord(firstParser.CoordContext ctx);
	/**
	 * Enter a parse tree produced by {@link firstParser#keys}.
	 * @param ctx the parse tree
	 */
	void enterKeys(firstParser.KeysContext ctx);
	/**
	 * Exit a parse tree produced by {@link firstParser#keys}.
	 * @param ctx the parse tree
	 */
	void exitKeys(firstParser.KeysContext ctx);
	/**
	 * Enter a parse tree produced by {@link firstParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(firstParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link firstParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(firstParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link firstParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(firstParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link firstParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(firstParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link firstParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(firstParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link firstParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(firstParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link firstParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(firstParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link firstParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(firstParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link firstParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(firstParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link firstParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(firstParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link firstParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(firstParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link firstParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(firstParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link firstParser#usage}.
	 * @param ctx the parse tree
	 */
	void enterUsage(firstParser.UsageContext ctx);
	/**
	 * Exit a parse tree produced by {@link firstParser#usage}.
	 * @param ctx the parse tree
	 */
	void exitUsage(firstParser.UsageContext ctx);
}