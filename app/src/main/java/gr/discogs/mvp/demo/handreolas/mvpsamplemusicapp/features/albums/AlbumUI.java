package gr.discogs.mvp.demo.handreolas.mvpsamplemusicapp.features.albums;

public class AlbumUI {

    private String photoUrl;

    private String albumName;
    private String artistName;

    private int albumNameColorID;

    private int itemCount;

    public AlbumUI(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
    }

    public AlbumUI(String albumName, String artistName, int albumNameColorID) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.albumNameColorID = albumNameColorID;
    }

    public AlbumUI(String photoUrl, String albumName, String artistName, int itemCount) {
        this.photoUrl = photoUrl;
        this.albumName = albumName;
        this.artistName = artistName;
        this.itemCount = itemCount;
    }

    public int getAlbumNameColorID() {
        return albumNameColorID;
    }

    public void setAlbumNameColorID(int albumNameColorID) {
        this.albumNameColorID = albumNameColorID;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
}
