package gr.discogs.mvp.demo.handreolas.mvpsamplemusicapp.features.tracks;


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
public class TracksFragment extends Fragment implements TracksView {


    @BindView(R.id.tracks_rv)
    RecyclerView tracksRv;

    private TracksPresenter presenter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_tracks, container, false);

        ButterKnife.bind(this, v);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        tracksRv.setLayoutManager(layoutManager);



        presenter = new TracksPresenterImpl(this);
        presenter.getTracks();

        return v;
    }

    public static TracksFragment newInstance() {

        Bundle args = new Bundle();
        TracksFragment fragment = new TracksFragment();
//        args.putSerializable("home_view", homeView);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void showTracks(ArrayList<Tracks> tracks) {

        TracksRvAdapter tracksRvAdapter = new TracksRvAdapter(tracks, getActivity());

        tracksRv.setAdapter(tracksRvAdapter);

    }
}
