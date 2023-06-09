package sg.edu.np.mad.week6_recyclerview;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class viewholder extends RecyclerView.ViewHolder {
    String TAG = "View Holder";
    TextView txt;

    public viewholder(View itemView){
        super(itemView);
        txt = itemView.findViewById(R.id.textView);
        Log.i("TAG", "viewholder linked!");
    }
}
