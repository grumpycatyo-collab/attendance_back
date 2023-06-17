package com.example.attendance_back.controlers;

import com.example.attendance_back.Absente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AbsenceService {

    private final List<Absente> absenceList;

    public AbsenceService() {
        // Initialize the absence list or fetch it from somewhere else
        Absente.startAbsente();
        absenceList = Absente.list;
    }

    public List<Absente> getAbsencesByStudent(String numeStudent, String sortBy, String status) {
        List<Absente> filteredAbsences = filterAbsencesByStudent(absenceList, numeStudent);

        if (status != null) {
            filteredAbsences = filterAbsencesByStatus(filteredAbsences, status);
        }

        if (sortBy != null) {
            sortAbsences(filteredAbsences, sortBy);
        }

        return filteredAbsences;
    }

    public List<Absente> getAbsencesByStudentFiltered(String numeStudent, String status) {
        List<Absente> filteredAbsences = filterAbsencesByStudent(absenceList, numeStudent);
        return filterAbsencesByStatus(filteredAbsences, status);
    }

    public List<Absente> getAbsencesByStudentSorted(String numeStudent, String sortBy) {
        List<Absente> filteredAbsences = filterAbsencesByStudent(absenceList, numeStudent);
        return sortAbsences(filteredAbsences, sortBy);
    }

    private List<Absente> filterAbsencesByStudent(List<Absente> absences, String numeStudent) {
        return absences.stream()
                .filter(absence -> absence.getNumeStudent().equals(numeStudent))
                .collect(Collectors.toList());
    }

    private List<Absente> filterAbsencesByStatus(List<Absente> absences, String status) {
        return absences.stream()
                .filter(absence -> absence.getStatus().equals(status))
                .collect(Collectors.toList());
    }

    private List<Absente> sortAbsences(List<Absente> absences, String sortBy) {
        if (sortBy.equals("newest")) {
            absences.sort((absence1, absence2) -> {
                Date latestDate1 = absence1.getDatesAbsenta().stream().max(Date::compareTo).orElse(null);
                Date latestDate2 = absence2.getDatesAbsenta().stream().max(Date::compareTo).orElse(null);
                if (latestDate1 != null && latestDate2 != null) {
                    return latestDate2.compareTo(latestDate1);
                } else if (latestDate1 != null) {
                    return -1;
                } else if (latestDate2 != null) {
                    return 1;
                } else {
                    return 0;
                }
            });
        }
        return absences;
    }
    public Absente updateAbsence(String numeStudent, String status, ArrayList<Date> newDatesAbsenta) {
        Absente absenceToUpdate = getAbsenceByStudentName(numeStudent);
        if (absenceToUpdate != null) {
            absenceToUpdate.setStatus(status);
            absenceToUpdate.setDatesAbsenta(newDatesAbsenta);
            return absenceToUpdate;
        }
        return null; // Absence not found
    }

    public List<Absente> getAbsencesByStudent(String numeStudent) {
        return filterAbsencesByStudent2(absenceList, numeStudent);
    }
    private List<Absente> filterAbsencesByStudent2(List<Absente> absences, String numeStudent) {
        return absences.stream()
                .filter(absence -> absence.getNumeStudent().equals(numeStudent))
                .collect(Collectors.toList());
    }

    private Absente getAbsenceByStudentName(String numeStudent) {
        return absenceList.stream()
                .filter(absence -> absence.getNumeStudent().equals(numeStudent))
                .findFirst()
                .orElse(null);
    }
}