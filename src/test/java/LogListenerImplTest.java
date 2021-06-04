import gen.LogParserParser;
import listener.LogListenerImpl;
import model.LogEntry;
import model.Loglevel;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import gen.LogParserLexer;

import static org.assertj.core.api.Assertions.assertThat;

public class LogListenerImplTest {
    @Test
    public void shouldLogListenerParse() throws Exception{
        String logLine="2018-May-05 14:20:21 DEBUG entering awesome method\r\n" +
                "2018-May-05 14:20:24 ERROR Bad thing happened\r\n";

        // instantiate lexer and parser
        LogParserLexer loglexer = new LogParserLexer(CharStreams.fromString(logLine));
        CommonTokenStream tokens = new CommonTokenStream(loglexer);
        LogParserParser parser = new LogParserParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();

        LogListenerImpl listener = new LogListenerImpl();
        walker.walk(listener,parser.log());

        //
        assertThat(listener.getLogEnteries().size()).isEqualTo(2);
        LogEntry error = listener.getLogEnteries().get(1);
        assertThat(error.getLevel()).isEqualTo(Loglevel.ERROR.name());
        assertThat(error.getMessage()).isEqualTo("Bad thing happened");
        //assertThat(error.getTimestamp()).isEqualTo(LocalDateTime.of(2018,5,5,14,20,24));
    }
}
