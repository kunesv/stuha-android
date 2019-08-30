package net.stuha.android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MessagesAdapter extends RecyclerView.Adapter<MessageHolder> {

    private static final int VIEW_TYPE_MESSAGE_SENT = 1;
    private static final int VIEW_TYPE_MESSAGE_RECEIVED = 2;

    private List<Message> messages;

    public MessagesAdapter(List<Message> messages) {
        this.messages = messages;
    }

//    // Determines the appropriate ViewType according to the sender of the message.
//    @Override
//    public int getItemViewType(int position) {
//        Message message = (Message) messages.get(position);
//
//        if (message.getSender().getUsername().equals("guest")) {
//            // If the current user is the sender of the message
//            return VIEW_TYPE_MESSAGE_SENT;
//        } else {
//            // If some other user sent the message
//            return VIEW_TYPE_MESSAGE_RECEIVED;
//        }
//    }

    // Inflates the appropriate layout according to the ViewType.
    @NonNull
    @Override
    public MessageHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ConstraintLayout layout = null;
        System.out.println("-------------------------------------------------");
        System.out.println("View Type" + viewType);
//        if (viewType == VIEW_TYPE_MESSAGE_SENT) {
//            layout = (ConstraintLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.message_sent, parent, false);
//        } else if (viewType == VIEW_TYPE_MESSAGE_RECEIVED) {
            layout = (ConstraintLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.message_received, parent, false);
//        }

        if (layout == null) {
            System.out.println("VIEW IS NULL!");
            return null;
        } else {
            return new MessageHolder(layout);
        }
    }

    // Passes the message object to a ViewHolder so that the contents can be bound to UI.
    @Override
    public void onBindViewHolder(MessageHolder holder, int position) {
        Message message = messages.get(position);
        holder.bind(message);
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }
}
