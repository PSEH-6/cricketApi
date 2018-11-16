package com.assignment.cricketApi.request.score;

import com.assignment.cricketApi.response.score.MatchDetails;
import com.assignment.cricketApi.response.score.ScoreApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {

    private CricketScoreClient scoreClient;

    @Autowired
    public ScoreService(CricketScoreClient scoreClient) {
        this.scoreClient = scoreClient;
    }

    public ScoreApiResponse getMatchDetailsById(String match_id, String apiKey)  {

        ScoreApiResponse scoreDetails = scoreClient.getScoreDetails(apiKey,match_id);
        return scoreDetails;

    }
}
