package me.dio.simulator.data;

import java.util.List;

import me.dio.simulator.domain.Match;
import retrofit.Call;

public interface MatchesAPI {
    GET(matches.json);
    Call<List<Match>> getMatches();
}
