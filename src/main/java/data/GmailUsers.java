package data;

public enum GmailUsers {
    VALIDUSER("validUser"),
    INVALIDUSER1("invalidUser1"),
    INVALIDUSER2("invalidUser2"),
    INVALIDUSER3("invalidUser3"),
    INVALIDUSER4("invalidUser4");
    private String type;

    public String getType() {
        return type;
    }

    GmailUsers(String type) {
        this.type = type;
    }
}
