package com.example.job;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<MyData> myDataArrayList;

    public MyAdapter(Context context, ArrayList<MyData> myDataArrayList) {
        this.context = context;
        this.myDataArrayList = myDataArrayList;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        MyData myData=myDataArrayList.get(position);
        holder.job_tittle_tv.setText(myData.getJob_tittle());
        holder.job_location_tv.setText(myData.getJob_location());
        holder.job_salary_tv.setText(myData.getJob_salary());
        holder.job_vacancies_tv.setText(myData.getJob_vacancies());
        holder.due_date_tv.setText(myData.getSelect_due_date());

        String name=holder.job_tittle_tv.getText().toString();

        holder.more_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view =new View(context);
                view.getContext();
                Intent intent=new Intent(context,ApplyJob.class);
                intent.putExtra("",name);
                view.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return myDataArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView job_tittle_tv,job_location_tv,job_salary_tv,job_vacancies_tv,due_date_tv, more_details;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            job_tittle_tv=itemView.findViewById(R.id.job_tittle_tv);
            job_location_tv=itemView.findViewById(R.id.job_location_tv);
            job_salary_tv=itemView.findViewById(R.id.job_salary_tv);
            job_vacancies_tv=itemView.findViewById(R.id.job_vacancies_tv);
            due_date_tv=itemView.findViewById(R.id.due_date_tv);
            more_details=itemView.findViewById(R.id.more_details);


        }
    }
}
