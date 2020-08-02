package gitApi.Model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.Date;

public class ResultSet {
    @JsonSetter("name")
    private String repoName;
    @JsonSetter("description")
    private String repoDesc;
    @JsonSetter("clone_url")
    private String cloneUrl;
    @JsonSetter("stargazers_count")
    private int starGazers;
    @JsonSetter("created_at")
    private Date dateOfCreation;

    public ResultSet() {
    }

    public String getRepoName() {
        return repoName;
    }

    public String getRepoDesc() {
        return repoDesc;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }
    public int getStarGazers() {
        return starGazers;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }
}
