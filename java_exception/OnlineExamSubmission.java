import java.time.LocalDateTime;

class LateSubmissionException extends Exception { public LateSubmissionException(String msg){ super(msg);} }
class InvalidFileFormatException extends Exception { public InvalidFileFormatException(String msg){ super(msg);} }

class ExamSubmission {
    LocalDateTime deadline = LocalDateTime.of(2024, 10, 1, 12, 0);

    public void submitExam(String fileName, LocalDateTime submissionTime) throws LateSubmissionException, InvalidFileFormatException {
        if (!fileName.endsWith(".pdf")) throw new InvalidFileFormatException("Invalid file format!");
        if (submissionTime.isAfter(deadline)) throw new LateSubmissionException("Submission is late!");
        System.out.println("Submission successful!");
    }
}

public class OnlineExamSubmission {
    public static void main(String[] args) {
        ExamSubmission e = new ExamSubmission();
        try {
            e.submitExam("exam.docx", LocalDateTime.now());
        } catch (Exception ex) {
            System.out.println("Submission failed: " + ex.getMessage());
        }
    }
}