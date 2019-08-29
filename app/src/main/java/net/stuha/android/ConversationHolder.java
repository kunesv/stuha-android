package net.stuha.android;

import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ConversationHolder extends RecyclerView.ViewHolder {
    public TextView name;

    public ConversationHolder(@NonNull LinearLayout view) {
        super(view);
        name = view.findViewById(R.id.textView2);
    }
}
