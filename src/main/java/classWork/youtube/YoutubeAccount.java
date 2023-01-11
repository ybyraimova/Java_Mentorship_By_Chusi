package classWork.youtube;

public abstract class YoutubeAccount {

    boolean canWatch = true;
    boolean viewChannelInfo = true;
    String videoName;
    String channelName ;
    int views;

    public YoutubeAccount(String videoName, String channelName, int views) {
        this.videoName = videoName;
        this.channelName = channelName;
        this.views = views;
    }

    public abstract String subscribe(String channelName);

    public abstract void like(String videoName);

    public  abstract void dislike();

    public abstract String comment();

    public abstract void postVideo();





}
