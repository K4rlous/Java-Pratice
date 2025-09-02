package Moderate;

public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, int year, int issueNumber) {
        super(title, year);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        if(issueNumber > 0){
            this.issueNumber = issueNumber;
        } else {
            System.out.println("[ERROR] The issue number must be valid");
        }
    }

    @Override
    String getDetails() {
        return "Title: " + title + ", Issue Number: " + issueNumber + ", Year: " + year;
    }
}
