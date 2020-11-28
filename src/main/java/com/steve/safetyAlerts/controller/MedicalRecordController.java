package com.steve.safetyAlerts.controller;

import com.steve.safetyAlerts.model.MedicalRecord;
import com.steve.safetyAlerts.service.IMedicalRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class MedicalRecordController {

    @Autowired
    private IMedicalRecord medicalRecordService;

    @PostMapping(path = "medicalRecord")
    @ResponseStatus(HttpStatus.CREATED)
    public void createFireStation(@RequestBody @Valid MedicalRecord medicalRecord) {
        medicalRecordService.createMedicalRecord(medicalRecord);
    }


    @PutMapping(path = "medicalRecord")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateMedicalRecord(@RequestBody @Valid MedicalRecord medicalRecord) {
        medicalRecordService.updateMedicalRecord(medicalRecord);
    }

    @DeleteMapping(path = "medicalRecord")
    @ResponseStatus(HttpStatus.RESET_CONTENT)
    public void deleteMedicalRecord(@RequestBody @Valid MedicalRecord firestation) {
        medicalRecordService.deleteMedicalRecord(firestation);
    }

}