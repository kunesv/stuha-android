package net.stuha.android;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ConversationAdapter extends RecyclerView.Adapter<ConversationHolder> {

    private String[] conversations;

    public ConversationAdapter(String[] conversations) {
        this.conversations = conversations;
    }

    @NonNull
    @Override
    public ConversationHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.conversations_menu_item, parent, false);
        ConversationHolder holder = new ConversationHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ConversationHolder holder, int position) {
        holder.name.setText(conversations[position]);
    }

    @Override
    public int getItemCount() {
        return conversations.length;
    }
}
