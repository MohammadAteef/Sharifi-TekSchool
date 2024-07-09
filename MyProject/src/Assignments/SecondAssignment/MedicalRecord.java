package Assignments.SecondAssignment;

public class MedicalRecord {
    private String PatientName;
    private String RecordNumber;

    public MedicalRecord(String patientName, String recordNumber) {
        PatientName = patientName;
        RecordNumber = recordNumber;
    }

    public String getPatientName() {
        return PatientName;
    }

    public String getRecordNumber() {
        return RecordNumber;
    }
}
