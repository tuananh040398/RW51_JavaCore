package com.vti.frontend;

import java.sql.Connection;
import java.util.function.Function;

import com.vti.backend.Functions;
import com.vti.backend.SqlFunctions;
import com.vti.entity.City;

public class Program {

	public static void main(String[] args) {
//		Connection connection = SqlFunctions.GetConnection();

//		City city = new City("Hoi An", 1400);
//		Functions.AddCity(city);
		
//		City city = new City("Hoi An", 3000);
//		city.setId(4080);
//		Functions.UpdateCity(city);
		
		City city = new City("Hoi An", 3000);
		city.setId(4080);
		Functions.DeleteCity(city);

	}

}
