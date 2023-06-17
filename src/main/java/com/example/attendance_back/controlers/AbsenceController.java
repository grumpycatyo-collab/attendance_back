package com.example.attendance_back.controlers;

import com.example.attendance_back.Absente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/absente")
public class AbsenceController {

    private final AbsenceService absenceService;

    @Autowired
    public AbsenceController(AbsenceService absenceService) {
        this.absenceService = absenceService;
    }

    @GetMapping("/{numeStudent}")
    public ResponseEntity<List<Absente>> getAbsencesByStudent(
            @PathVariable String numeStudent,
            @RequestParam(value = "sortBy", required = false) String sortBy,
            @RequestParam(value = "status", required = false) String status
    ) {
        List<Absente> absences;

        if (sortBy != null && status != null) {
            // Both sortBy and status parameters are provided
            absences = absenceService.getAbsencesByStudent(numeStudent, sortBy, status);
        } else if (sortBy != null) {
            // Only sortBy parameter is provided
            absences = absenceService.getAbsencesByStudentSorted(numeStudent, sortBy);
        } else if (status != null) {
            // Only status parameter is provided
            absences = absenceService.getAbsencesByStudentFiltered(numeStudent, status);
        } else {
            // No additional parameters provided
            absences = absenceService.getAbsencesByStudent(numeStudent, null, null);
        }

        return ResponseEntity.ok(absences);
    }
}

