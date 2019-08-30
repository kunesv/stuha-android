package net.stuha.android;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.time.LocalDateTime;

public class MessageHolder extends RecyclerView.ViewHolder {
    TextView messageText, timeText, nameText;
    ImageView profileImage;

    public MessageHolder(@NonNull ConstraintLayout itemView) {
        super(itemView);
        messageText = itemView.findViewById(R.id.message_body);
        timeText = itemView.findViewById(R.id.message_time);
        nameText = itemView.findViewById(R.id.message_name);
        profileImage = itemView.findViewById(R.id.image_message_profile);
    }

    void bind(Message message) {
        messageText.setText(message.getMessage());

        // Format the stored timestamp into a readable String using method.
        timeText.setText("10:15");
        nameText.setText(message.getSender().getNickname());

        // Insert the profile image from the URL into the ImageView.
        //Utils.displayRoundImageFromUrl(mContext, message.getSender().getProfileUrl(), profileImage);
    }
}

