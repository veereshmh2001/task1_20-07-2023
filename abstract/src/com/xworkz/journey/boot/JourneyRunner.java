package com.xworkz.journey.boot;

import com.xworkz.journey.Journey;
import com.xworkz.journey.JourneyNonstop;

public class JourneyRunner {

	public static void main(String[] args) {
		
		Journey journey = new JourneyNonstop();
        journey.start();
        journey.performInitialize();
        journey.pause();
        journey.executeStep();
        journey.resume();
        journey.handleEvent();
        journey.stop();
        journey.logProgress();
        journey.end();
        journey.finalizeJourney();
    }
	}