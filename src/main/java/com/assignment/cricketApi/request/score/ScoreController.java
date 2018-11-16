package com.assignment.cricketApi.request.score;

import com.assignment.cricketApi.response.score.ScoreApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class ScoreController {

    private static final Logger logger = LoggerFactory.getLogger(ScoreController.class.getName());


    private ScoreService scoreService;

    @Autowired
    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @RequestMapping(value = "/score/{match_id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ScoreApiResponse getScoreDetailsForMatch (@PathVariable("match_id") String match_id, @RequestParam("apiKey") String apiKey){

        logger.info("getting details for matchId :" +match_id);

        return scoreService.getMatchDetailsById(match_id,apiKey);
    }
}
