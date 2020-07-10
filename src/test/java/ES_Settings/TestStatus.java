package ES_Settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.testng.IResultMap;
import org.testng.annotations.AfterTest;

public class TestStatus {

    @JsonProperty("testClass")
    private String testClass;

    @JsonProperty("description")
    private String description;

    @JsonProperty("status")
    private String status;

    @JsonProperty("executionTime")
    private String executionTime;

  /*  @JsonProperty("title")
    private String title;*/

    @JsonProperty("username")
    private String username;

    @JsonProperty("total")
    private int total;

    @JsonProperty("passed")
    private int passed;

    @JsonProperty("failed")
    private int failed;

    @JsonProperty("skipped")
    private int skipped;

    public void setTotal(int total) {
        this.total = total;
    }

    public void setPassed(int passed) {
        this.passed = passed;
    }

    public void setFailed(int failed) {
        this.failed = failed;
    }


    public void setSkipped(int skipped) {
        this.skipped = skipped;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setExecutionDate(String executionTime) {
        this.executionTime = executionTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTestClass(String testClass) {
        this.testClass = testClass;
    }

    public void setUserName(String username) {
        this.username = username;
    }

  /*  public void setTitle(String title) {
        this.title = title;
    }*/



}