package net.stuha.android;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ConversationAdapter extends RecyclerView.Adapter<ConversationHolder> {

    private List<String> conversations;

    public ConversationAdapter(List<String> conversations) {
        this.conversations = conversations;
    }

    @NonNull
    @Override
    public ConversationHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ConstraintLayout v = (ConstraintLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.conversations_menu_item, parent, false);
        ConversationHolder holder = new ConversationHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ConversationHolder holder, int position) {
        holder.name.setText(conversations.get(position));
    }

    @Override
    public int getItemCount() {
        return conversations.size();
    }
}
