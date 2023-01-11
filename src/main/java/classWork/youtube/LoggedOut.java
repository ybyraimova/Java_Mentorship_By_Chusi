package classWork.youtube;

public class LoggedOut extends YoutubeAccount{
    public LoggedOut( String videoName, String channelName, int views) {
        super( videoName, channelName, views);
    }

    @Override
    public String subscribe(String channelName) {
        return "Please log in";
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
