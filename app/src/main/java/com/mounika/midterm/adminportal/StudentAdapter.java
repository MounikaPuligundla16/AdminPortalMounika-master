package com.mounika.midterm.adminportal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {
    Context context;
    List<Students> studentList;

    public StudentAdapter(Context context, List<Students> studentList) {
        this.context = context;
        this.studentList = studentList;
    }

    class StudentViewHolder extends RecyclerView.ViewHolder {
        TextView studentName, studentTotalGrades;

        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);

            studentName = itemView.findViewById(R.id.studentName);
            studentTotalGrades = itemView.findViewById(R.id.studentTotalGrades);
        }
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.student_adapter_layout, parent, false);

        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Students student = studentList.get(position);

        holder.studentName.setText(student.getStudentName());
        double total = student.getSubject1Marks() + student.getSubject2Marks() + student.getSubject3Marks();
        if (total < 250.00)
            holder.studentTotalGrades.setTextColor(ContextCompat.getColor(context, android.R.color.holo_red_dark));
        else
            holder.studentTotalGrades.setTextColor(ContextCompat.getColor(context, android.R.color.black));

        holder.studentTotalGrades.setText("Total: " + total);
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
}
