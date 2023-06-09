package sg.edu.np.mad.week6_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String TAG = "RecyclerView";
    //ArrayList<String> data = new ArrayList<>();
    ArrayList<myObject> myObject_List = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/* Previous simple RecylerView
        for(int i = 0; i<100; i++){
            data.add(String.valueOf(i));
        }

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        adapterDemo mAdapter = new adapterDemo(data);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
  */
        for(int i=0; i<100;i++) {
            myObject obj = new myObject();
            obj.setMyImageID(R.drawable.tnj);
            obj.setMyText(String.valueOf(i));

            myObject_List.add(obj);
        }

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        myCustomAdapter mycustomAdapter = new myCustomAdapter(myObject_List);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mycustomAdapter);
    }
}