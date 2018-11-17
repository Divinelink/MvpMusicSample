package gr.discogs.mvp.demo.handreolas.mvpsamplemusicapp.features.albums;

public class AlbumDomain {

    private String artistName;
    private String albumName;

    public AlbumDomain(String artistName, String albumName) {
        this.artistName = artistName;
        this.albumName = albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
}
