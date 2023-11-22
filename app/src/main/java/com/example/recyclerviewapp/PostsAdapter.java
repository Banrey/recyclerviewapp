package com.example.recyclerviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostsViewHolder>{


    private Context context;
    private List<Posts> postsList;

    public PostsAdapter(Context context, List<Posts> postsList) {
        this.context = context;
        this.postsList = postsList;
    }

    @NonNull
    @Override
    public PostsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_row, null);

        return new PostsViewHolder(view);
    }

    @Override
    public void onBindViewHolder( PostsViewHolder holder, int position) {
        Posts posts = postsList.get(position);

            holder.etTitle.setText(posts.getTitle());
            holder.tvContent.setText(posts.getContent());
            holder.tvAID.setText(posts.getAccID());
            holder.tvPID.setText(posts.getPostID());

    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }

    class PostsViewHolder extends RecyclerView.ViewHolder{

        EditText etTitle;
        TextView tvContent, tvPID, tvAID;

        public PostsViewHolder(@NonNull View itemView) {
            super(itemView);

            etTitle = (EditText) itemView.findViewById(R.id.editTextPostTitle);
            tvContent = (TextView) itemView.findViewById(R.id.textViewPostContent);
        }
    }
}
