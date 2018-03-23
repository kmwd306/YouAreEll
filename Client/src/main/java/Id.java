public class Id {

    private String userId;
    private String name;
    private String github;

    public Id() throws UnirestException {
    }

    public Id(String name, String github) {
        this.name = name;
        this.github = github;
    }

    public Id(String userId, String name, String github) {
        this.userId = userId;
        this.name = name;
        this.github = github;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    private class UnirestException extends Exception {
    }

    @Override
    public String toString() {
        return "Id{" +
        "userId:'" + userId + '\'' +
        ", name:'" + name + '\'' +
        ", github:'" + github + '\'' +
        '}';
    }
}
