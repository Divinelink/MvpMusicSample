package gr.discogs.mvp.demo.handreolas.mvpsamplemusicapp.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import gr.discogs.mvp.demo.handreolas.mvpsamplemusicapp.R;
import gr.discogs.mvp.demo.handreolas.mvpsamplemusicapp.features.albums.AlbumFragment;
import gr.discogs.mvp.demo.handreolas.mvpsamplemusicapp.features.tracks.TracksFragment;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.homeRoot, TracksFragment.newInstance())
                .commit();
    }
}
