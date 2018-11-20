package gr.discogs.mvp.demo.handreolas.mvpsamplemusicapp.features.tracks;

import java.util.ArrayList;

public interface TracksInteractor {

    void getTracks(TracksOnFinishListener listener);

    interface TracksOnFinishListener{

        void onSuccess(ArrayList<Tracks> tracks);

        void onError();

    }

}
