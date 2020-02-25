package cts.rabobank.glassdoorscheduler.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.util.Date;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookingInfo {
	
	private int roomId;
	//TODO Added this field newly to this class. Need to chk with others on the userId or UserName
	private int usrEmpId;
	private String userName;
	private Date bookingDate;
	private Time bookingStartTime;
	private Time bookingEndTime;

}