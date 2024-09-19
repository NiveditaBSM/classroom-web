package com.ivin.classroomREST.repo;

import com.ivin.classroomREST.model.Assignment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AssignmentRepo {

	// arrayList to store JobPost objects
	List<Assignment> assignmentList;

	// ****************************************************************************

	// constructor->injecting objects into ArrayList defined above.
	public AssignmentRepo() {
		 assignmentList = new ArrayList<>();
		 assignmentList.add( new Assignment(1, 1,  "Describe the basic properties of database", 10, List.of("Database", "ACID", "DBMS")));
		 assignmentList.add( new Assignment(2, 1, "Design a relational database for implementing assignment evaluation application", 40, List.of("Database Design", "Relational Database", "Normalization") ));
		 assignmentList.add( new Assignment(3, 1, "What is non-relational databse, give examples", 10, List.of("Non realtional databases", "NoSQL")));
		 assignmentList.add( new Assignment(4, 2, "What is Binary tree? list its applications", 10, List.of("Data Structure", "Trees", "applied DS")));
		 assignmentList.add( new Assignment(5, 2, "Give examples along with their applications of Linear Data Structure", 15, List.of("Data Structure", "Linear Data Structures", "types of data structures")));
		 assignmentList.add( new Assignment(6, 3, "What are benefits offered by docker? why should we use it?", 15, List.of("DevOps", "Deployment", "Containerization")));
		 assignmentList.add( new Assignment(7, 1, "What are different types of joint? What is view in database querying?", 20, List.of("Joins", "Views", "Querying", "SQL")));
	}

	// ****************************************************************************

	// method to return all Assignments
	public List<Assignment> returnAllAssignments() {
		return assignmentList;
	}

	// method to save a new assignment object into arrayList
	public void addAssignment(Assignment assignment) {
		assignmentList.add(assignment);
	}


	public Assignment returnAssignment(int assignmentId) {

		for (Assignment asg : assignmentList){
			if (asg.getAsgId() == assignmentId)
				return asg;
		}

		return null;
	}

	public void updateAssignment(Assignment assignment) {
		Assignment asgTarget = this.returnAssignment(assignment.getAsgId());

		asgTarget.setSubId(assignment.getSubId());
		asgTarget.setAsgDes(assignment.getAsgDes());
		asgTarget.setActualMarks(assignment.getActualMarks());
		asgTarget.setMaxMarks(assignment.getMaxMarks());
	}

	public int deleteAssignment(int assignmentId) {
		for (int i=0; i<assignmentList.size(); i++){
			if (assignmentList.get(i).getAsgId()==assignmentId) {
				assignmentList.remove(i);
				return 0;
			}
		}
		return 1;
	}
}
