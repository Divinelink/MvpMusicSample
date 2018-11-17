package gr.discogs.mvp.demo.handreolas.mvpsamplemusicapp.features.albums;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import gr.discogs.mvp.demo.handreolas.mvpsamplemusicapp.R;

public class AlbumsRvAdapter extends RecyclerView.Adapter<AlbumsRvAdapter.AlbumViewHolder> {


    private ArrayList<AlbumUI> albums;
    private Context context;

    public AlbumsRvAdapter(ArrayList<AlbumUI> albums, Context context) {
        this.albums = albums;
        this.context = context;
    }

    public static class AlbumViewHolder extends RecyclerView.ViewHolder {
        TextView mAlbumName;
        TextView mArtistName;
        ImageView mAlbumLogo;

        public AlbumViewHolder(View v) {
            super(v);
            this.mAlbumName = v.findViewById(R.id.album_name);
            this.mArtistName = v.findViewById(R.id.album_artist_name);
            this.mAlbumLogo = v.findViewById(R.id.album_logo);
        }
    }

    @NonNull
    @Override
    public AlbumViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.view_album_item, viewGroup, false);
        AlbumViewHolder vh = new AlbumViewHolder(v);

        return vh;
    }


    @Override
    public void onBindViewHolder(@NonNull AlbumsRvAdapter.AlbumViewHolder viewHolder, int i) {

        final int position = i;
        final AlbumUI album = albums.get(position);

        viewHolder.mAlbumName.setText(album.getAlbumName());
        viewHolder.mArtistName.setText(album.getArtistName());
        viewHolder.mAlbumName.setTextColor(context.getResources().getColor(albums.get(position).getAlbumNameColorID()));
        viewHolder.mAlbumLogo.setImageResource(R.mipmap.ic_launcher);


    }

    @Override
    public int getItemCount() {
        return albums.size();
    }
}
