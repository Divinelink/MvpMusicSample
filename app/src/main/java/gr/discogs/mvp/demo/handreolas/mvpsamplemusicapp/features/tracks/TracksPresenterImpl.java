package gr.discogs.mvp.demo.handreolas.mvpsamplemusicapp.features.tracks;

import java.util.ArrayList;

public class TracksPresenterImpl implements TracksPresenter, TracksInteractor.TracksOnFinishListener{

    private TracksView tracksView;
    private TracksInteractor interactor;

    public TracksPresenterImpl(TracksView tracksView) {
        this.tracksView = tracksView;
        interactor = new TracksInteractorImpl();
    }



    @Override
    public void getTracks() {
        interactor.getTracks(this);
    }

    @Override
    public void onSuccess(ArrayList<Tracks> tracks) {



        tracksView.showTracks(tracks);

    }

    @Override
    public void onError() {

    }
}
