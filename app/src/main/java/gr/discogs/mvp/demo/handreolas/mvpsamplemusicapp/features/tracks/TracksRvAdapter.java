package gr.discogs.mvp.demo.handreolas.mvpsamplemusicapp.features.tracks;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import gr.discogs.mvp.demo.handreolas.mvpsamplemusicapp.R;
import gr.discogs.mvp.demo.handreolas.mvpsamplemusicapp.features.albums.AlbumUI;

public class TracksRvAdapter extends RecyclerView.Adapter<TracksRvAdapter.TrackViewHolder> {

    private ArrayList<Tracks> tracks;
    private Context context;

    public TracksRvAdapter(ArrayList<Tracks> tracks, Context context) {
        this.tracks = tracks;
        this.context = context;
    }


    public static class TrackViewHolder extends RecyclerView.ViewHolder {

        private TextView trackName;
        private TextView albumName;
        private ImageView trackImage;

        public TrackViewHolder(View v) {
            super(v);
            this.trackName = v.findViewById(R.id.trackName);
            this.albumName = v.findViewById(R.id.trackAlbumName);
            this.trackImage = v.findViewById(R.id.trackImage);
        }

    }


    @NonNull
    @Override
    public TrackViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.view_track_item, viewGroup, false);
        TrackViewHolder vh = new TrackViewHolder(v);

        return vh;
    }
    @Override
    public void onBindViewHolder(@NonNull TrackViewHolder trackViewHolder, int i) {

        final int position = i;
        final Tracks track = tracks.get(position);

        trackViewHolder.trackName.setText(track.getTrackName());
        track
        trackViewHolder.albumName.setText(track.getAlbumName());
        trackViewHolder.trackImage.setImageResource(R.mipmap.ic_launcher);

    }

    @Override
    public int getItemCount() {
        return tracks.size();
    }
}
