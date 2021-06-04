// Generated from gen\LogParser.g4 by ANTLR 4.7.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogParserParser}.
 */
public interface LogParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogParserParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(LogParserParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogParserParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(LogParserParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogParserParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(LogParserParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogParserParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(LogParserParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogParserParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp(LogParserParser.TimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogParserParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp(LogParserParser.TimestampContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogParserParser#level}.
	 * @param ctx the parse tree
	 */
	void enterLevel(LogParserParser.LevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogParserParser#level}.
	 * @param ctx the parse tree
	 */
	void exitLevel(LogParserParser.LevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogParserParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(LogParserParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogParserParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(LogParserParser.MessageContext ctx);
}