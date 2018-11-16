package com.assignment.cricketApi;

import com.assignment.cricketApi.request.score.CricketScoreClient;
import com.assignment.cricketApi.response.score.ScoreApiResponse;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CricketApiApplicationTests {

	private final Logger logger = LoggerFactory.getLogger(CricketApiApplicationTests.class);

	@Autowired
	CricketScoreClient cricketScoreClient;

	@Test
	public void contextLoads() {
	}


	@Test
	public void getDataFromScoreApi() {

		ScoreApiResponse response = cricketScoreClient.getScoreDetails("WmPJrX2s3KMyZVPFwlm1vxXLXKw1", "	1136617");
		logger.info(response.getTeam1());
	}
}
