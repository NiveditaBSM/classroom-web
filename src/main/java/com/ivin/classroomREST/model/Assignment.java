package com.ivin.classroomREST.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Assignment {

	private int asgId;
	private int subId;
	private String asgDes;
	private int maxMarks;
	private int actualMarks;
	private List<String> topicsCovered;

	public Assignment(int asgId, int subId, String asgDes, int maxMarks, List<String> topicsCovered) {
		this.asgId = asgId;
		this.subId = subId;
		this.asgDes = asgDes;
		this.maxMarks = maxMarks;
		this.topicsCovered = topicsCovered;
	}
}
