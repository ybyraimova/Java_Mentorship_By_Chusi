package classWork.youtube;

public class Author extends YoutubeAccount{

    public Author(String videoName, String channelName, int views) {
        super(videoName, channelName, views);
    }

    @Override
    public String subscribe(String channelName) {
        return "You cannot subscribe to your own channel";
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
