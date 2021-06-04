package listener;

import gen.LogParserBaseListener;
import gen.LogParserParser;
import model.LogEntry;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LogListenerImpl extends LogParserBaseListener {

    private List<LogEntry> logEnteries = new ArrayList<>();
    private LogEntry current;

    private static final DateTimeFormatter DEFAULT_DATETIME_FORMATTER
            = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm:ss", Locale.ENGLISH);


    @Override
    public void enterEntry(LogParserParser.EntryContext ctx){
        this.current = new LogEntry();
    }

    @Override
    public void enterTimestamp(LogParserParser.TimestampContext ctx){
        this.current.setTimestamp(LocalDateTime.parse(ctx.getText(), DEFAULT_DATETIME_FORMATTER));
    }

    @Override
    public void enterMessage(LogParserParser.MessageContext ctx){
        this.current.setMessage(ctx.getText());
    }

    @Override
    public void enterLevel(LogParserParser.LevelContext ctx){
        this.current.setLevel(ctx.getText());
    }

    @Override
    public  void  exitEntry(LogParserParser.EntryContext ctx){
        this.logEnteries.add(this.current);
    }

    public List<LogEntry> getLogEnteries() {
        return logEnteries;
    }

    public void setLogEnteries(List<LogEntry> logEnteries) {
        this.logEnteries = logEnteries;
    }
}
