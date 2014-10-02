package org.wtm.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Darkart on 17.02.14.
 */
public class School {

    private Integer id;
    private Integer country;
    private Integer city;
    private String name;
    @SerializedName("year_from")
    private Integer yearFrom;
    @SerializedName("year_to")
    private Integer yearTo;
    @SerializedName("year_graduated")
    private Integer yearGraduated;
    @SerializedName("class")
    private String className;
    private String speciality;
    private Integer type;
    @SerializedName("type_str")
    private String typeStr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeStr() {
        return typeStr;
    }

    public void setTypeStr(String typeStr) {
        this.typeStr = typeStr;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public Integer getYearFrom() {
        return yearFrom;
    }

    public void setYearFrom(Integer yearFrom) {
        this.yearFrom = yearFrom;
    }

    public Integer getYearTo() {
        return yearTo;
    }

    public void setYearTo(Integer yearTo) {
        this.yearTo = yearTo;
    }

    public Integer getYearGraduated() {
        return yearGraduated;
    }

    public void setYearGraduated(Integer yearGraduated) {
        this.yearGraduated = yearGraduated;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("School{");
        sb.append("id=").append(id);
        sb.append(", country=").append(country);
        sb.append(", city=").append(city);
        sb.append(", name='").append(name).append('\'');
        sb.append(", yearFrom=").append(yearFrom);
        sb.append(", yearTo=").append(yearTo);
        sb.append(", yearGraduated=").append(yearGraduated);
        sb.append(", className='").append(className).append('\'');
        sb.append(", speciality='").append(speciality).append('\'');
        sb.append(", type=").append(type);
        sb.append(", typeStr='").append(typeStr).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
