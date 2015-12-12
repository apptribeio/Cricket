package io.apptribe.cricket.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.apptribe.cricket.R;

/**
 * Created by kerry on 12/12/15.
 */
public class CricketViewHolder extends RecyclerView.ViewHolder{

    @Bind(R.id.name)
    TextView name;
    @Bind(R.id.play_button)
    ImageView playButton;
    @Bind(R.id.pause_button)
    ImageView pauseButton;

    public CricketViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(String text, boolean showPlayButton){
        name.setText(text);
        showPlayButton(showPlayButton);
    }

    public void showPlayButton(boolean showPlayButton) {
        if(showPlayButton) {
            playButton.setVisibility(View.VISIBLE);
            pauseButton.setVisibility(View.INVISIBLE);
        }
        else{
            playButton.setVisibility(View.INVISIBLE);
            pauseButton.setVisibility(View.VISIBLE);
        }
    }
}
