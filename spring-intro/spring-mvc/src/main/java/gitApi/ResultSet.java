package gitApi.Model;

import java.util.Date;

public class ResultSet {
    
    public ResultSet(String repoName, String repoDesc, String cloneUrl, int starGazers, Date dateOfCreation) {
        this.repoName = repoName;
        this.repoDesc = repoDesc;
        this.cloneUrl = cloneUrl;
        this.starGazers = starGazers;
        this.dateOfCreation = dateOfCreation;
    }

    private String repoName;
    private String repoDesc;
    private String cloneUrl;
    private int starGazers;
    private Date dateOfCreation;
}
