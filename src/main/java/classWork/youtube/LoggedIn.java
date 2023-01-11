package classWork.youtube;

public class LoggedIn extends YoutubeAccount{
    public LoggedIn(boolean canWatch, boolean viewChannelInfo, String videoName, String channelName, int views) {
        super(videoName, channelName, views);
    }

    @Override
    public String subscribe(String channelName) {
        return "You are subscribed to " + channelName;
    }

    @Override
    public void like(String videoName) {

    }

    @Override
    public void dislike() {

    }

    @Override
    public String comment() {
        return null;
    }

    @Override
    public void postVideo() {

    }
}
