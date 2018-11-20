package gr.discogs.mvp.demo.handreolas.mvpsamplemusicapp.features.tracks;

public class Tracks {

    private String photoUrl;
    private String trackName;
    private String albumName;


    public Tracks(String photoUrl, String trackName, String albumName) {
        this.photoUrl = photoUrl;
        this.trackName = trackName;
        this.albumName = albumName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
}
