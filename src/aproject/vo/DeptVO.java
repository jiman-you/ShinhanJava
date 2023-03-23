package aproject.vo;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class DeptVO {
	private int DEPARTMENT_ID;
	private String DEPARTMENT_NAME;
	private int MANAGER_ID;
	private int LOCATION_ID;
}
