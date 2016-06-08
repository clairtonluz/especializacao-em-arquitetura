package br.com.clairtonluz.layoutexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.clairtonluz.layoutexample.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Pessoa> pessoas = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            pessoas.add(new Pessoa("Clairton Luz " + i, R.mipmap.ic_launcher));
        }

        MyAdapter adapter = new MyAdapter(this, pessoas);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.findViewById(R.id.main_recycleview);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}
