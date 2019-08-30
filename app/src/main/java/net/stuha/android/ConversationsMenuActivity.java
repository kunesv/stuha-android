package net.stuha.android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class ConversationsMenuActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter conversationsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversations_menu);

        List<String> conversations = new ArrayList<>();
        conversations.add("DEFG");
        conversations.add("ABCD");
        conversations.add("Some Other Conversation");

        recyclerView = (RecyclerView) findViewById(R.id.conversations_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
//        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // specify an adapter (see also next example)
        conversationsAdapter = new ConversationAdapter(conversations);
        recyclerView.setAdapter(conversationsAdapter);

        System.out.println("Number of conversations: " + conversationsAdapter.getItemCount());

    }

    public void showConversation(View view) {
        Intent intent = new Intent(this, MessagesActivity.class);
        startActivity(intent);
    }
}
