package com.ivin.classroomREST;


import com.ivin.classroomREST.model.Assignment;
import com.ivin.classroomREST.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AssignmentRESTController {

    @Autowired
    private AssignmentService service;

    @GetMapping("assignments")
    public List<Assignment> getAllAssignments(){
        return service.returnAllAssignments();
    }

    @GetMapping("assignment/{assignmentId}")
    public Assignment getAssignmentbyId(@PathVariable("assignmentId") int assignmentId){
        return service.returnAssignment(assignmentId);
    }

    @PostMapping("assignment")
    public Assignment addAssignment(@RequestBody Assignment assignment){
        service.addAssignment(assignment);
        return service.returnAssignment(assignment.getAsgId());
    }

    @PutMapping("assignment")
    public Assignment updateAssignment(@RequestBody Assignment assignment){
        service.updateAssignment(assignment);
        return service.returnAssignment(assignment.getAsgId());
    }

    @DeleteMapping("assignment/{assignmentId}")
    public int deleteAssignment(@PathVariable int assignmentId){
        return service.deleteAssignment(assignmentId);
    }
}
