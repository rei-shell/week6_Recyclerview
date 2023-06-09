package sg.edu.np.mad.week6_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myCustomAdapter extends RecyclerView.Adapter<myCustomViewHolder> {

    private ArrayList<myObject> list_objects;

    public myCustomAdapter(ArrayList<myObject> list_objects) {

        this.list_objects = list_objects;
    }

    public myCustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.customlayout,parent,false);
    myCustomViewHolder holder = new myCustomViewHolder(view);
    return holder;
    }

    public void onBindViewHolder(myCustomViewHolder holder, int position){
        myObject list_items = list_objects.get(position);
        holder.txt.setText(list_items.getMyText());
        holder.image.setImageResource(list_items.getMyImageID());
    }

    public int getItemCount(){
        return list_objects.size();
    }
}
