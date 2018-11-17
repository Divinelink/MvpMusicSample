package gr.discogs.mvp.demo.handreolas.mvpsamplemusicapp.features.albums;

import java.sql.Array;
import java.util.ArrayList;

import gr.discogs.mvp.demo.handreolas.mvpsamplemusicapp.R;

public class AlbumsPresenterImpl implements AlbumsPresenter, AlbumsInteractor.OnAlbumFinishListener {


    private AlbumsView albumsView;
    private AlbumsInteractor interactor;


    public AlbumsPresenterImpl(AlbumsView albumsView) {
        this.albumsView = albumsView;
        interactor = new AlbumsInteractorImpl();

    }

    @Override
    public void getAlbums() {

        interactor.getAlbums(this);

    }

    //Bussiness Logic
    @Override
    public void onSuccess(ArrayList<AlbumDomain> albums) {

        ArrayList<AlbumUI> albumsToShow = new ArrayList<>();

        for (AlbumDomain albumObject : albums)
        {
            AlbumUI albumUI = new AlbumUI(albumObject.getAlbumName(),
                    albumObject.getArtistName(),
                    R.color.colorPrimaryDark);
            // Set Color on RV adapter

            albumsToShow.add(albumUI);
        }



         albumsView.showAlbums(albumsToShow);

    }

    @Override
    public void onError() {

    }
}
