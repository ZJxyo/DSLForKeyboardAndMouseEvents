// Generated from C:/Users/User/Desktop/CPSC410/410project/src/parser\firstParser.g4 by ANTLR 4.9.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link firstParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface firstParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link firstParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(firstParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link firstParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(firstParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link firstParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(firstParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link firstParser#hold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHold(firstParser.HoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link firstParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(firstParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link firstParser#waitFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitFor(firstParser.WaitForContext ctx);
	/**
	 * Visit a parse tree produced by {@link firstParser#press}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPress(firstParser.PressContext ctx);
	/**
	 * Visit a parse tree produced by {@link firstParser#hover}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHover(firstParser.HoverContext ctx);
	/**
	 * Visit a parse tree produced by {@link firstParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(firstParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link firstParser#mouse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMouse(firstParser.MouseContext ctx);
	/**
	 * Visit a parse tree produced by {@link firstParser#coord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoord(firstParser.CoordContext ctx);
	/**
	 * Visit a parse tree produced by {@link firstParser#keys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeys(firstParser.KeysContext ctx);
}