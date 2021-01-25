package Clases;

/**
 * Esta clase extiende de Record e incorpora otras cosas
 *
 * @author Kendall Salazar
 */
public class Incident extends Record {

    private boolean urgency;
    private Severity severity;

    public boolean isUrgency() {
        return urgency;
    }

    public void setUrgency(boolean urgency) {
        this.urgency = urgency;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    // Este enum nos servira para definir la severidad de este incidente
    private enum Severity {
        LOW, MID, HIGH;
    }

    public Incident(boolean urgency, Severity severity, int issueID, String title, String description) {
        super(issueID, title, description);
        this.urgency = urgency;
        this.severity = severity;
    }

    
    
}
