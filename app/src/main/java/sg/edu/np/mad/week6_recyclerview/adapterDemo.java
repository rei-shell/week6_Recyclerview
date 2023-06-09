package sg.edu.np.mad.week6_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapterDemo extends RecyclerView.Adapter<viewholder> {
    ArrayList<String> data;

    public adapterDemo(ArrayList<String> input){
        data = input;
    }

    public viewholder onCreateViewHolder(ViewGroup parent, int viewType){
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout, parent, false);
        return new viewholder(item);
    }

    public void onBindViewHolder(viewholder holder, int position){
        String s = data.get(position);
        holder.txt.setText(s);
    }

    public int getItemCount(){
        return data.size();
    }

}
