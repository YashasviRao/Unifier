package com.example.homepage1;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    Dialog myDialog;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        myDialog = new Dialog(this);
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);


        List<ModelClass> modelClassList = new ArrayList<>();
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"first resident","Name:Rajesh"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"second resident","Name:Laxman"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"third resident","Name:Gopal"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"fourth resident","Name:Madhu"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"fifth resident","Name:Sampath"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"sixth resident","Name:Poorna"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"seventh resident","Name:BabuRao"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"eight resident","Name:Kamesh"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"ninth resident","Name:VasanthaRao"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"tenth resident","Name:Ravi"));

        Adapter adapter = new Adapter(modelClassList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
    public void ShowPopup(View v)
    {
        TextView exit;
        myDialog.setContentView(R.layout.custompopup);
        exit = (TextView) myDialog.findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }
}
