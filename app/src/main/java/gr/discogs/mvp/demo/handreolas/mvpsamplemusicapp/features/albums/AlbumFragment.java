package gr.discogs.mvp.demo.handreolas.mvpsamplemusicapp.features.albums;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import gr.discogs.mvp.demo.handreolas.mvpsamplemusicapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlbumFragment extends Fragment implements AlbumsView {

    AlbumsPresenter presenter;

    @BindView(R.id.albums_rv)
    RecyclerView albumsRv;

    public AlbumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_album, container, false);
        ButterKnife.bind(this, v);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        albumsRv.setLayoutManager(layoutManager);


        presenter = new AlbumsPresenterImpl(this);
        presenter.getAlbums();

        return v;
    }


    public static AlbumFragment newInstance() {

        Bundle args = new Bundle();
        AlbumFragment fragment = new AlbumFragment();
//        args.putSerializable("home_view", homeView);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void showAlbums(ArrayList<AlbumUI> albums) {

        AlbumsRvAdapter albumsRvAdapter = new AlbumsRvAdapter(albums, getActivity());

        albumsRv.setAdapter(albumsRvAdapter);

    }
}
