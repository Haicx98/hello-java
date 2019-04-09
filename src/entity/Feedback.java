package entity;

public class Feedback {
    private String feedback;
    private String username;
    private String email;

    public Feedback(String feedback, String username, String email) {
        this.feedback = feedback;
        this.username = username;
        this.email = email;
    }

    public Feedback() {
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
