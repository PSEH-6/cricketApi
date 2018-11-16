package com.assignment.cricketApi.request.score;

import com.assignment.cricketApi.response.score.ScoreApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name="CricketApiScore",url = "http://cricapi.com/api/cricketScore/")
public interface CricketScoreClient {

    @RequestMapping(method = RequestMethod.GET, produces  = {
            MediaType.APPLICATION_JSON_VALUE
    })
    ScoreApiResponse getScoreDetails(@RequestParam("apikey") String apiKey  , @RequestParam("unique_id") String match_id);
}
