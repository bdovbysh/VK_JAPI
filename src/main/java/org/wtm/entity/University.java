package org.wtm.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Darkart on 17.02.14.
 */
public class University {


    private Integer id;
    private Integer country;
    private Integer city;
    private String name;
    private Integer faculty;
    @SerializedName("faculty_name")
    private String  facultyName;
    private Integer chair;
    @SerializedName("chair_name")
    private String chairName;
    @SerializedName("education_form")
    private String educationForm;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFaculty() {
        return faculty;
    }

    public void setFaculty(Integer faculty) {
        this.faculty = faculty;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public Integer getChair() {
        return chair;
    }

    public void setChair(Integer chair) {
        this.chair = chair;
    }

    public String getChairName() {
        return chairName;
    }

    public void setChairName(String chairName) {
        this.chairName = chairName;
    }

    public String getEducationForm() {
        return educationForm;
    }

    public void setEducationForm(String educationForm) {
        this.educationForm = educationForm;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("University{");
        sb.append("id=").append(id);
        sb.append(", country=").append(country);
        sb.append(", city=").append(city);
        sb.append(", name='").append(name).append('\'');
        sb.append(", faculty=").append(faculty);
        sb.append(", facultyName='").append(facultyName).append('\'');
        sb.append(", chair=").append(chair);
        sb.append(", chairName='").append(chairName).append('\'');
        sb.append(", educationForm='").append(educationForm).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
