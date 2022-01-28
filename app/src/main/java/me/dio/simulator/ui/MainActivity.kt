package me.dio.simulator.ui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import me.dio.simulator.data.MatchesAPI
import me.dio.simulator.databinding.ActivityMainBinding
import me.dio.simulator.domain.Team
import retrofit.GsonConverterFactory
import retrofit.Retrofit

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main)

        //val tvHello = findViewById<TextView>(R.id.tvHello)

        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);
        //binding.tvHello.text = "Texto"

        setupMatchesList();
        setupMatchesRefresh();
        setupFloatActionButton();
        setuphttpClient();
    }

    private fun setuphttpClient() {
        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://artcamp03.github.io/Matches-Simulator-API/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

       matchesApi = retrofit.create(MatchesAPI.class);
    }

    private fun setupFloatActionButton() {
        //TODO:  Criar evento
    }

    private fun setupMatchesRefresh() {
        //TODO:  atualizar as partidas na açao de swip
    }

    private fun setupMatchesList(){
        matchesApi.get
    }
}