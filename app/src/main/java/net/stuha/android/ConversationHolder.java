package net.stuha.android;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class ConversationHolder extends RecyclerView.ViewHolder {
    public TextView name;

    public ConversationHolder(@NonNull ConstraintLayout view) {
        super(view);
        name = view.findViewById(R.id.textView2);
    }
}
