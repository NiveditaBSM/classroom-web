package com.ivin.classroomREST.service;

import com.ivin.classroomREST.model.Assignment;
import com.ivin.classroomREST.repo.AssignmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentService {
	@Autowired
	public AssignmentRepo repo;

	//method to return all JobPosts
	public List<Assignment> returnAllAssignments() {
		return repo.returnAllAssignments();
	}

	// ***************************************************************************
	// method to add a jobPost
	public void addAssignment(Assignment assignment) {
		 repo.addAssignment(assignment);
	}


	public Assignment returnAssignment(int assignmentId) {
		return repo.returnAssignment(assignmentId);
	}

	public void updateAssignment(Assignment assignment) {
		repo.updateAssignment(assignment);
	}

	public int deleteAssignment(int assignmentId) {
		return repo.deleteAssignment(assignmentId);
	}
}
