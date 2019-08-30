package net.stuha.android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessagesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MessagesAdapter messageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);

        List<Message> messages = new ArrayList<>();
        messages.add(new Message("Prvni message.", new User("a", "Jim Jarmush", ""), new Date()));
        messages.add(new Message("Druha message.", new User("a", "Tonny Everest", ""), new Date()));
        messages.add(new Message("Treti message.", new User("guest", "Guest", ""), new Date()));
        messages.add(new Message("Ctvrta message.", new User("a", "James Hinley", ""), new Date()));
        messages.add(new Message("Pata message.", new User("a", "Edward Cook", ""), new Date()));

        recyclerView = findViewById(R.id.messages_recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        messageAdapter = new MessagesAdapter(messages);
        recyclerView.setAdapter(messageAdapter);

        System.out.println("Number of messages: " + messageAdapter.getItemCount());
    }
}
