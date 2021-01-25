package Clases;

/**
 * Esta es una clase abstracta que nos ayudara a generar tipos de incidentes
 * @author Kendall Salazar
 */

public abstract class Record {

    private int issueID;
    private String title;
    private String description;

    public Record(int issueID, String title, String description) {
        this.issueID = issueID;
        this.title = title;
        this.description = description;
    }

    public int getIssueID() {
        return issueID;
    }

    public void setIssueID(int issueID) {
        this.issueID = issueID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
