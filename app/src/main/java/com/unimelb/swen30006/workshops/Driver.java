package com.unimelb.swen30006.workshops;

public class Driver {
    public static void main(String[] args) {
        // Create a submission with a name
        Submission submission = new Submission("Homework 1");

        // Add a valid file
        submission.addFile(new File("/path/to/homework.pdf"));

        // Create the validator
        SubmissionValidator validator = new SampleValidator();

        // Validate
        boolean isValid = validator.validateSubmission(submission);

        // Print results
        if (isValid) {
            System.out.println("Submission is valid!");
        } else {
            System.out.println("Submission is invalid: " + validator.validationErrorMessage());
        }

        // You could test edge cases by removing the file or changing the submission name
        // submission.setSubmissionName("");
        // submission.addFile(new File(""));
        // etc.
    }
}
