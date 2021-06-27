package com.demoApp.whatsappclone.Frags;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demoApp.whatsappclone.Adapters.CallRecyclerAdapter;
import com.demoApp.whatsappclone.CallModel;
import com.demoApp.whatsappclone.R;

import java.util.ArrayList;
import java.util.List;

public class CallFragment extends Fragment {

    RecyclerView recyclerView;

    List<CallModel> callModelList;
    CallRecyclerAdapter adapter;


    public CallFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v=inflater.inflate(R.layout.fragment_call, container, false);
        recyclerView = v.findViewById(R.id.callsRecycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

        getCallLIst();
        adapter = new CallRecyclerAdapter(getContext(), callModelList);
        recyclerView.setAdapter(adapter);



        return v;

    }

    private void getCallLIst() {

        callModelList = new ArrayList<>();
        callModelList.add(new CallModel("Paresh","22 July , 4:09AM",false));
        callModelList.add(new CallModel("Shivani","23 July , 4:09AM",true));
        callModelList.add(new CallModel("Ram","26 July , 8:09AM",false));
        callModelList.add(new CallModel("Ankita","22 July , 6:09AM",true));
        callModelList.add(new CallModel("Bhummi","21 July , 4:09AM",true));
        callModelList.add(new CallModel("Ayan","22 July , 12:09AM",true));
        callModelList.add(new CallModel("Arpita","26 July , 11:09AM",false));



    }
}