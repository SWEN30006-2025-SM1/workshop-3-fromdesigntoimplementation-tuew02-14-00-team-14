package com.unimelb.swen30006.workshops;
import java.util.ArrayList;
import java.util.List;

public class Submission {
    private String submissionName;
    private List<File> files;

    public Submission(String submissionName) {
        this.submissionName = submissionName;
        this.files = new ArrayList<>();
    }

    public String getSubmissionName() {
        return submissionName;
    }

    public void setSubmissionName(String submissionName) {
        this.submissionName = submissionName;
    }

    public List<File> getFiles() {
        return files;
    }

    public void addFile(File file) {
        this.files.add(file);
    }
}
