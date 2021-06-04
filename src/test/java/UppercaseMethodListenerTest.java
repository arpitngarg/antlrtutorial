import gen.Java8Lexer;
import gen.Java8Parser;
import listener.UppercaseMethodListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UppercaseMethodListenerTest {

    @Test
    public void testEnterMethodDeclarator(){
        //we construct the lexer:
        String javaClassContent = "public class SampleClass { void DoSomething(){} }";
        Java8Lexer java8Lexer = new Java8Lexer(CharStreams.fromString(javaClassContent));

        //we instantiate the parser:
        CommonTokenStream tokens = new CommonTokenStream(java8Lexer);
        Java8Parser parser = new Java8Parser(tokens);
        ParseTree tree = parser.compilationUnit();

        //the walker and the listener:
        ParseTreeWalker walker = new ParseTreeWalker();
        UppercaseMethodListener listener= new UppercaseMethodListener();

        //we tell ANTLR to walk through our sample class
        walker.walk(listener, tree);

        assertThat(listener.getErrors().size()).isEqualTo(1);
        assertThat(listener.getErrors().get(0)).isEqualTo("Method DoSomething is uppercased!");
    }

}
