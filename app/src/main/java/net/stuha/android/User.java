package net.stuha.android;

class User {
    private String username;
    private String nickname;
    private String profileUrl;

    public User() {
    }

    public User(String username, String nickname, String profileUrl) {
        this.username = username;
        this.nickname = nickname;
        this.profileUrl = profileUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }
}
