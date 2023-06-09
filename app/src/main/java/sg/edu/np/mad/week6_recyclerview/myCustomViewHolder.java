package sg.edu.np.mad.week6_recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myCustomViewHolder extends RecyclerView.ViewHolder {
    TextView txt;
    ImageView image;

    public myCustomViewHolder(View itemView) {
        super(itemView);
        txt = itemView.findViewById(R.id.textView3);
        image = itemView.findViewById(R.id.imageView2);

    }


}
