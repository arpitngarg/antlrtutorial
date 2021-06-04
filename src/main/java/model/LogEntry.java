package model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class LogEntry {
    private String level;
    private String message;
    private LocalDateTime  timestamp;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime  getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }


    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
