package org.wtm.request;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.wtm.entity.Constants;
import org.wtm.entity.User;
import org.wtm.exceptions.RequestException;
import org.wtm.response.ResponseWithItems;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by dovbysh on 11.08.14.
 */
public class UserSearch extends Request {

    private final static String USERS_SEARCH = "users.search";
    private Integer sort;
    private Integer offset;
    private Integer count;
    private String fields;
    private Integer city;
    private Integer country; // City Name
    private String hometown;
    private Integer universityCountry;
    private Integer university;
    private Integer universityYear;  //год окончания ВУЗа.
    private Integer universityFaculty;   //идентификатор факультета.
    private Integer universityChair ;//идентификатор кафедры.
    private Constants.Sex sex ;    //пол, 1 — женщина, 2 — мужчина, 0 (по умолчанию) — любой.
    private Constants.Status status;   //семейное положение: 1 — Не женат, 2 — Встречается, 3 — Помолвлен, 4 — Женат, 7 — Влюблён, 5 — Всё сложно, 6 — В активном поиске.
    private Integer ageFrom; //начиная с какого возраста.
    private Integer ageTo;  // до какого возраста.
    private Integer birthDay; // день рождения.
    private Integer birthMonth;// месяц рождения.
    private Integer birthYear;// год рождения.
    private Integer online;  // 1 — только в сети, 0 — все пользователи.
    private Integer hasPhoto;// 1 — только с фотографией, 0 — все пользователи.
    private Integer schoolCountry;// идентификатор страны, в которой пользователи закончили школу.
    private Integer schoolCity;// идентификатор города, в котором пользователи закончили школу.
    private Integer schoolClass; // положительное число
    private Integer school; // идентификатор школы, которую закончили пользователи.
    private Integer schoolYear;// год окончания школы.
    private String religion;// религиозные взгляды.
    private String interests;// интересы.
    private String company; //название компании, в которой работают пользователи.
    private String position;// название должности.
    private Integer groupID; // идентификатор группы, среди пользователей которой необходимо проводить поиск.

    private Gson gson;
    private Type responseType;
    private String q;


    public UserSearch(String token) {
        super(USERS_SEARCH, token);
        gson = new Gson();
        responseType = new TypeToken<ResponseWithItems<User>>(){}.getType();
    }

    public UserSearch setQ(String q){
        this.q = q;
        addParameter("q",q);
        return this;
    }

    public UserSearch setSort(Integer sort) {
        this.sort = sort;
        addParameter("sort",sort);
        return this;
    }

    public UserSearch setOffset(Integer offset) {
        this.offset = offset;
        addParameter("offset",offset);
        return this;
    }

    public UserSearch setCount(Integer count) {
        this.count = count;
        addParameter("count",count);
        return this;
    }

    public UserSearch setFields(String fields) {
        this.fields = fields;
        addParameter("fields",fields);
        return this;
    }

    public UserSearch setCity(Integer city) {
        this.city = city;
        addParameter("city",city);
        return this;
    }

    public UserSearch setCountry(Integer country) {
        this.country = country;
        addParameter("country",country);
        return this;
    }

    public UserSearch setHometown(String hometown) {
        this.hometown = hometown;
        addParameter("hometown",hometown);
        return this;
    }

    public UserSearch setUniversityCountry(Integer universityCountry) {
        this.universityCountry = universityCountry;
        addParameter("university_country",universityCountry);
        return this;
    }

    public UserSearch setUniversity(Integer university) {
        this.university = university;
        addParameter("university",university);
        return this;
    }

    public UserSearch setUniversity_year(Integer universityYear) {
        this.universityYear = universityYear;
        addParameter("university_year",universityYear);
        return this;
    }

    public UserSearch setUniversity_faculty(Integer universityFaculty) {
        this.universityFaculty = universityFaculty;
        addParameter("university_faculty",universityFaculty);
        return this;
    }

    public UserSearch setUniversityChair(Integer universityChair) {
        this.universityChair = universityChair;
        addParameter("university_chair",universityChair);
        return this;
    }

    public UserSearch setSex(Constants.Sex sex) {
        this.sex = sex;
        addParameter("sex",sex.ordinal());
        return this;
    }

    public UserSearch setStatus(Constants.Status status) {
        this.status = status;
        addParameter("status",status.ordinal());
        return this;
    }

    public UserSearch setAgeFrom(Integer ageFrom) {
        this.ageFrom = ageFrom;
        addParameter("age_from",ageFrom);
        return this;
    }

    public UserSearch setAgeTo(Integer ageTo) {
        this.ageTo = ageTo;
        addParameter("age_to",ageTo);
        return this;
    }

    public UserSearch setBirthDay(Integer birthDay) {
        this.birthDay = birthDay;
        addParameter("birth_day",birthDay);
        return this;
    }

    public UserSearch setBirthMonth(Integer birthMonth) {
        this.birthMonth = birthMonth;
        addParameter("birth_month",birthMonth);
        return this;
    }

    public UserSearch setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
        addParameter("birth_year",birthYear);
        return this;
    }

    public UserSearch setOnline(Integer online) {
        this.online = online;
        addParameter("online",online);
        return this;
    }

    public UserSearch setHasPhoto(Integer hasPhoto) {
        this.hasPhoto = hasPhoto;
        addParameter("has_photo",hasPhoto);
        return this;
    }

    public UserSearch setSchoolCountry(Integer schoolCountry) {
        this.schoolCountry = schoolCountry;
        addParameter("school_country",schoolCountry);
        return this;
    }

    public UserSearch setSchoolCity(Integer schoolCity) {
        this.schoolCity = schoolCity;
        addParameter("school_city",schoolCity);
        return this;
    }

    public UserSearch setSchoolClass(Integer schoolClass) {
        this.schoolClass = schoolClass;
        addParameter("school_class",schoolClass);
        return this;
    }

    public UserSearch setSchool(Integer school) {
        this.school = school;
        addParameter("school",school);
        return this;
    }

    public UserSearch setSchoolYear(Integer schoolYear) {
        this.schoolYear = schoolYear;
        addParameter("school_year",schoolYear);
        return this;
    }

    public UserSearch setReligion(String religion) {
        this.religion = religion;
        addParameter("religion",religion);
        return this;
    }

    public UserSearch setInterests(String interests) {
        this.interests = interests;
        addParameter("interests",interests);
        return this;
    }

    public UserSearch setCompany(String company) {
        this.company = company;
        addParameter("company",company);
        return this;
    }

    public UserSearch setPosition(String position) {
        this.position = position;
        addParameter("position",position);
        return this;
    }

    public UserSearch setGroupID(Integer groupID) {
        this.groupID = groupID;
        addParameter("group_id",groupID);
        return this;
    }


    public List<User> search() throws RequestException {
        ResponseWithItems<User> responseWithItems = gson.fromJson(makeRequest(), responseType);
        return responseWithItems.getResponse().getItems();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserSearch{");
        sb.append(" sort=").append(sort);
        sb.append(", offset=").append(offset);
        sb.append(", count=").append(count);
        sb.append(", fields='").append(fields).append('\'');
        sb.append(", city=").append(city);
        sb.append(", country=").append(country);
        sb.append(", hometown='").append(hometown).append('\'');
        sb.append(", universityCountry=").append(universityCountry);
        sb.append(", university=").append(university);
        sb.append(", universityYear=").append(universityYear);
        sb.append(", universityFaculty=").append(universityFaculty);
        sb.append(", universityChair=").append(universityChair);
        sb.append(", sex=").append(sex);
        sb.append(", status=").append(status);
        sb.append(", ageFrom=").append(ageFrom);
        sb.append(", ageTo=").append(ageTo);
        sb.append(", birthDay=").append(birthDay);
        sb.append(", birthMonth=").append(birthMonth);
        sb.append(", birthYear=").append(birthYear);
        sb.append(", online=").append(online);
        sb.append(", hasPhoto=").append(hasPhoto);
        sb.append(", schoolCountry=").append(schoolCountry);
        sb.append(", schoolCity=").append(schoolCity);
        sb.append(", schoolClass=").append(schoolClass);
        sb.append(", school=").append(school);
        sb.append(", schoolYear=").append(schoolYear);
        sb.append(", religion='").append(religion).append('\'');
        sb.append(", interests='").append(interests).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append(", position='").append(position).append('\'');
        sb.append(", groupID=").append(groupID);
        sb.append('}');
        return sb.toString();
    }
}
