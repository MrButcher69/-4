package by.tc.task01.service;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.IOException;
import java.net.URISyntaxException;

public interface ApplianceService {	
	
	Appliance find(Criteria criteria) throws IOException, URISyntaxException;
	
}
