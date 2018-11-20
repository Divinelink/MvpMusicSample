package gr.discogs.mvp.demo.handreolas.mvpsamplemusicapp.features.tracks;

import java.util.ArrayList;

public class TracksInteractorImpl implements TracksInteractor {


    @Override
    public void getTracks(TracksOnFinishListener listener) {

        ArrayList<Tracks> tracks = addMockTrack();

        listener.onSuccess(tracks);

    }


    private ArrayList<Tracks> addMockTrack() {
        ArrayList<Tracks> tracks = new ArrayList<>();
        for (int i = 1; i < 30; i++) {
            Tracks track = new Tracks("Photo", "TrackName"+i, "AlbumName");
            tracks.add(track);
        }
        return tracks;
    }




}
