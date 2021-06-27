package com.demoApp.whatsappclone.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.demoApp.whatsappclone.CallModel;
import com.demoApp.whatsappclone.R;

import java.util.List;

public class CallRecyclerAdapter extends RecyclerView.Adapter<CallRecyclerAdapter.CallViewHolder> {

    private Context mContext;
    private List<CallModel> callModelList;


    public CallRecyclerAdapter(Context mContext, List<CallModel> callModelList) {
        this.mContext = mContext;
        this.callModelList = callModelList;
    }

    @NonNull
    @Override
    public CallViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new CallViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.call_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull  CallRecyclerAdapter.CallViewHolder holder, int position) {

        CallModel currentModel = callModelList.get(position);

        holder.name.setText(currentModel.getName());
        holder.time.setText(currentModel.getTime());


        if(currentModel.isVideoCall()){
            holder.callType.setImageResource(R.drawable.ic_baseline_videocam_24);
        }


    }

    @Override
    public int getItemCount() {
        return callModelList.size();
    }

    public class CallViewHolder extends RecyclerView.ViewHolder{

        public TextView name, time ;
        public ImageView image , callType;


        public CallViewHolder(@NonNull  View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            time = itemView.findViewById(R.id.time);
            image = itemView.findViewById(R.id.image);
            callType = itemView.findViewById(R.id.type);


        }

    }

}
