import gen.OracleSqlLexer;
import gen.OracleSqlParser;
import listener.OracleListenerImpl;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OracleSqlListenerTest {

    @Test
    public void shouldParseSqlStatement(){
        String sqlStatementToTest ="select col1,col2 from tab1,tab2 ;";

        OracleSqlLexer sqlLexer  = new OracleSqlLexer(CharStreams.fromString(sqlStatementToTest));
        CommonTokenStream tokens = new CommonTokenStream(sqlLexer);
        OracleSqlParser parser = new OracleSqlParser(tokens);
        ParseTreeWalker walker  = new ParseTreeWalker();

        OracleListenerImpl listener = new OracleListenerImpl();
        walker.walk(listener,parser.statement());

       assertThat(listener.getStmt()).isNotNull();
       assertThat(listener.getStmt().getColumList().trim()).isEqualTo("col1,col2");
        assertThat(listener.getStmt().getTableList().trim()).isEqualTo("tab1,tab2");
    }

}
