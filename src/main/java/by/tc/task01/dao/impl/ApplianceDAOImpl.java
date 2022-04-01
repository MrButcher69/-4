package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ApplianceDAOImpl implements ApplianceDAO{

	final private String URL = "appliances_db.txt";

	@Override
	public Appliance find(Criteria criteria) throws URISyntaxException, IOException {

		URL res = getClass().getClassLoader().getResource(URL);
		File file = Paths.get(res.toURI()).toFile();
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

		Map<String, Object> criteriaMap = criteria.getCriteria();
		Map<String, Object> map = new HashMap<>();
		String strng;

		while ((strng = bufferedReader.readLine()) != null) {

			String[] criterias;
			String[] valueOfCriteria;
			boolean isTrue = false;
			int count = 0;

			String[] parts = strng.split(" : ");

			if(Objects.equals(parts[0], criteria.getGroupSearchName())){
				criterias = parts[1].split(", ");

				for(String item : criterias){
					valueOfCriteria = item.split("=");
					map.put(valueOfCriteria[0],valueOfCriteria[1]);
				}

				for(Map.Entry<String, Object> entry : criteriaMap.entrySet()){
					for(Map.Entry<String, Object> entry2 : map.entrySet()){
						if(entry.getKey().equals(entry2.getKey()) &&
								entry.getValue().toString().equalsIgnoreCase(entry2.getValue().toString())){
							isTrue = true;
							count++;
						}
					}
				}

				if(isTrue && (count == criteriaMap.size())){

					switch (parts[0]){
						case "Oven" -> {
							return new Oven(parts[0], map);
						}
						case "Laptop" -> {
							return new Laptop(parts[0], map);
						}
						case "Refrigerator" -> {
							return new Refrigerator(parts[0], map);
						}
						case "Speakers" -> {
							return new Speakers(parts[0], map);
						}
						case "TabletPC" -> {
							return new TabletPC(parts[0], map);
						}
						case "VacuumCleaner" -> {
							return new VacuumCleaner(parts[0], map);
						}
						default -> {
							return null;
						}

					}
				}
			}
		}
		return null;
	}
}
