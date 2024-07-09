package Assignments.SecondAssignment;

public class VaccinationRecord extends MedicalRecord{
    private String VaccineType;
    public VaccinationRecord(String PatientName,String RecordNumber,String VaccineType){
        super(PatientName,RecordNumber);
        this.VaccineType=VaccineType;
    }
    public String getVaccineType(){
        return VaccineType;
    }
    public void DisplayMedecalRecord(){
        System.out.println(getPatientName());
        System.out.println(getRecordNumber());
        System.out.println(getVaccineType());

    }
}
