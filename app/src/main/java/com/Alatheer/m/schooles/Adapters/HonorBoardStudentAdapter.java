package com.Alatheer.m.schooles.Adapters;

import android.support.v7.widget.RecyclerView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.Alatheer.m.schooles.Models.HonerModel;
import com.Alatheer.m.schooles.R;
import java.util.List;


public class HonorBoardStudentAdapter extends RecyclerView.Adapter<HonorBoardStudentAdapter.Holder> {
    Context context;
    HonerModel mmodel;
    List<HonerModel> Array;

    public HonorBoardStudentAdapter(Context context, List<HonerModel> Array) {
        this.context = context;
        this.Array = Array;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_honorboard_student, parent, false);

        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        mmodel = Array.get(position);

        holder.lingrand.setTag(position);

        holder.student_name.setText(mmodel.getStudent_name());
        holder.student_degree.setText(mmodel.getDegree());


    }

    @Override
    public int getItemCount() {
        return Array.size();
    }

    class Holder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView student_name, student_degree;
        LinearLayout lingrand;

        public Holder(View itemView) {
            super(itemView);

            student_name = itemView.findViewById(R.id.txt_student_name);
            student_degree = itemView.findViewById(R.id.txt_student_degree);
            lingrand = itemView.findViewById(R.id.lin_houner);
            lingrand.setOnClickListener(this);


        }

        @Override
        public void onClick(View view) {

            int position = (int) view.getTag();

            mmodel = Array.get(position);

        }

    }




}
