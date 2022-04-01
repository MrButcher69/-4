package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {

		boolean rez = true;
		int count = 0;

		for(Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()){

				if(entry.getKey() == null){
				    rez = false;
				}
				if(entry.getValue() == null){
					rez = false;
				}

				for(Class<?> enumClass : SearchCriteria.class.getDeclaredClasses()){

					Set<String> enumFields = new HashSet<>();

					if(enumClass.getSimpleName().equals(criteria.getGroupSearchName())){

						enumFields = getInitialSizeOfEnumFields(enumClass);

						for(String item : enumFields){
							if(item.equals(entry.getKey())){
								count++;
							}
						}
					}
				}
		}

		if(!(count == criteria.getCriteria().size())){
			rez = false;
		}

		return rez;
	}


	private static Set<String> getInitialSizeOfEnumFields(Class<?> enumClass) {
		Set<String> enumFields = new HashSet<>();

		for (Field enumField : enumClass.getDeclaredFields()) {
			enumFields.add(enumField.getName());
		}
		return enumFields;
	}
}
/*while (criteria.getCriteria() != null){
			String value = (String) criteria.getCriteria().get();

			if (value != null) {
				throw new RuntimeException("Название характеристики отсутвует.");
			}else{

				if(criteria.getCriteria().containsKey(criteria.getGroupSearchName())) {
					rez = true;
					//ключ имеется,но отсутвует значение,не вижу смысл кидать экспшн.
				}
				throw new RuntimeException("Характеристика и значение отсутвуют.");

			}
		}*/