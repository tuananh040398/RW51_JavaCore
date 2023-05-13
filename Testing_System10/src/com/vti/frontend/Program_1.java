package com.vti.frontend;

import java.sql.Connection;

import com.vti.backend.Exercise_1;
import com.vti.backend.SqlFunctions;
import com.vti.entity.Position;

public class Program_1 {

	public static void main(String[] args) {
//		Connection connection = SqlFunctions.Q1_getConnection();	

//		Exercise_1.Q2_ShowPosition();

//		Position position = new Position("HCNS");
//		Exercise_1.Q3_AddPosition(position);

//		Position position = new Position("Dev");
//		position.setPositionID(5);
//		Exercise_1.Q4_UpdatePosition(position);

		Position position = new Position("Dev");
		position.setPositionID(5);
		Exercise_1.Q5_DeletePosition(position);

	}

}
