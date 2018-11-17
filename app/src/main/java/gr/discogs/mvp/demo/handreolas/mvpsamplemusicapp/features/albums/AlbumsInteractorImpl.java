package gr.discogs.mvp.demo.handreolas.mvpsamplemusicapp.features.albums;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AlbumsInteractorImpl implements AlbumsInteractor {

    @Override
    public void getAlbums(OnAlbumFinishListener listener) {

        ArrayList<AlbumDomain> albums = addMockAlbums();

        listener.onSuccess(albums);

    }

    private ArrayList<AlbumDomain> addMockAlbums() {
        ArrayList<AlbumDomain> tracks = new ArrayList<>();
        for (int i = 1; i < 20; i++) {
            AlbumDomain track = new AlbumDomain("Album "+i, "Artist "+i);
            tracks.add(track);
        }
        return tracks;
    }



}
