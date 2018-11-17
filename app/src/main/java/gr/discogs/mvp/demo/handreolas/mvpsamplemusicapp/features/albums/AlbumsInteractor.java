package gr.discogs.mvp.demo.handreolas.mvpsamplemusicapp.features.albums;

import java.util.ArrayList;

public interface AlbumsInteractor {

    void getAlbums(OnAlbumFinishListener listener);

    interface OnAlbumFinishListener{

        void onSuccess(ArrayList<AlbumDomain> albums);

        void onError();
    }

}
