// Generated from gen\OracleSql.g4 by ANTLR 4.7.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OracleSqlParser}.
 */
public interface OracleSqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(OracleSqlParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(OracleSqlParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(OracleSqlParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(OracleSqlParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#colList}.
	 * @param ctx the parse tree
	 */
	void enterColList(OracleSqlParser.ColListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#colList}.
	 * @param ctx the parse tree
	 */
	void exitColList(OracleSqlParser.ColListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#tableList}.
	 * @param ctx the parse tree
	 */
	void enterTableList(OracleSqlParser.TableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#tableList}.
	 * @param ctx the parse tree
	 */
	void exitTableList(OracleSqlParser.TableListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(OracleSqlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(OracleSqlParser.StatementContext ctx);
}