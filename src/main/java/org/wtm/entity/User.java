package org.wtm.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Darkart on 08.02.14.
 */
public class User {

    private String id;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;
    private Integer sex;
    private String domain;
    private String bdate;
    @SerializedName("cityEntity")
    private CityEntity city;
    @SerializedName("country")
    private CountryEntity country;

    @SerializedName("photo_50")
    private String photo50;
    @SerializedName("photo_100")
    private String photo100;
    @SerializedName("photo_200")
    private String photo200;
    @SerializedName("photo_max")
    private String photoMax;
    @SerializedName("photo_200_orig")
    private String photo200Orig;
    @SerializedName("photo_400_orig")
    private String photo400Orig;
    @SerializedName("photo_max_orig")
    private String photoMaxOrig;
    @SerializedName("has_mobile")
    private Integer hasMobile;
    private Integer online;
    @SerializedName("can_post")
    private Integer canPost;
    @SerializedName("can_see_all_posts")
    private Integer canSeeAllPosts;
    @SerializedName("can_see_audio")
    private Integer canSeeAudio;
    @SerializedName("can_write_private_message")
    private Integer canWritePrivateMessage;
    @SerializedName("mobile_phone")
    private String mobilePhone;
    @SerializedName("home_phone")
    private String homePhone;
    private String site;
    private String status;
    @SerializedName("last_seen")
    private LastSeen lastSeen;
    @SerializedName("common_count")
    private Integer commonCount;
    private Counters counters;
    private Integer university;
    @SerializedName("university_name")
    private String universityName;
    private Integer faculty;
    @SerializedName("faculty_name")
    private String facultyName;
    private Integer graduation;
    @SerializedName("education_form")
    private String educationForm;
    private Integer relation;

    private List<University> universities;
    private List<School> schools;
    private List<Relative> relatives;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public CityEntity getCityEntity() {
        return city;
    }

    public void setCityEntity(CityEntity city) {
        this.city = city;
    }

    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(CountryEntity country) {
        this.country = country;
    }

    public String getPhoto50() {
        return photo50;
    }

    public void setPhoto50(String photo50) {
        this.photo50 = photo50;
    }

    public String getPhoto100() {
        return photo100;
    }

    public void setPhoto100(String photo100) {
        this.photo100 = photo100;
    }

    public String getPhoto200() {
        return photo200;
    }

    public void setPhoto200(String photo200) {
        this.photo200 = photo200;
    }

    public String getPhotoMax() {
        return photoMax;
    }

    public void setPhotoMax(String photoMax) {
        this.photoMax = photoMax;
    }

    public String getPhoto200Orig() {
        return photo200Orig;
    }

    public void setPhoto200Orig(String photo200Orig) {
        this.photo200Orig = photo200Orig;
    }

    public String getPhoto400Orig() {
        return photo400Orig;
    }

    public void setPhoto400Orig(String photo400Orig) {
        this.photo400Orig = photo400Orig;
    }

    public String getPhotoMaxOrig() {
        return photoMaxOrig;
    }

    public void setPhotoMaxOrig(String photoMaxOrig) {
        this.photoMaxOrig = photoMaxOrig;
    }

    public Integer getHasMobile() {
        return hasMobile;
    }

    public void setHasMobile(Integer hasMobile) {
        this.hasMobile = hasMobile;
    }

    public Integer getOnline() {
        return online;
    }

    public void setOnline(Integer online) {
        this.online = online;
    }

    public Integer getCanPost() {
        return canPost;
    }

    public void setCanPost(Integer canPost) {
        this.canPost = canPost;
    }

    public Integer getCanSeeAllPosts() {
        return canSeeAllPosts;
    }

    public void setCanSeeAllPosts(Integer canSeeAllPosts) {
        this.canSeeAllPosts = canSeeAllPosts;
    }

    public Integer getCanSeeAudio() {
        return canSeeAudio;
    }

    public void setCanSeeAudio(Integer canSeeAudio) {
        this.canSeeAudio = canSeeAudio;
    }

    public Integer getCanWritePrivateMessage() {
        return canWritePrivateMessage;
    }

    public void setCanWritePrivateMessage(Integer canWritePrivateMessage) {
        this.canWritePrivateMessage = canWritePrivateMessage;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LastSeen getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(LastSeen lastSeen) {
        this.lastSeen = lastSeen;
    }

    public Integer getCommonCount() {
        return commonCount;
    }

    public void setCommonCount(Integer commonCount) {
        this.commonCount = commonCount;
    }

    public Counters getCounters() {
        return counters;
    }

    public void setCounters(Counters counters) {
        this.counters = counters;
    }

    public Integer getUniversity() {
        return university;
    }

    public void setUniversity(Integer university) {
        this.university = university;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
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

    public Integer getGraduation() {
        return graduation;
    }

    public void setGraduation(Integer graduation) {
        this.graduation = graduation;
    }

    public String getEducationForm() {
        return educationForm;
    }

    public void setEducationForm(String educationForm) {
        this.educationForm = educationForm;
    }

    public Integer getRelation() {
        return relation;
    }

    public void setRelation(Integer relation) {
        this.relation = relation;
    }

    public List<University> getUniversities() {
        return universities;
    }

    public void setUniversities(List<University> universities) {
        this.universities = universities;
    }

    public List<School> getSchools() {
        return schools;
    }

    public void setSchools(List<School> schools) {
        this.schools = schools;
    }

    public List<Relative> getRelatives() {
        return relatives;
    }

    public void setRelatives(List<Relative> relatives) {
        this.relatives = relatives;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", sex=").append(sex);
        sb.append(", domain='").append(domain).append('\'');
        sb.append(", bdate='").append(bdate).append('\'');
        sb.append(", city=").append(city);
        sb.append(", country=").append(country);
        sb.append(", photo50='").append(photo50).append('\'');
        sb.append(", photo100='").append(photo100).append('\'');
        sb.append(", photo200='").append(photo200).append('\'');
        sb.append(", photoMax='").append(photoMax).append('\'');
        sb.append(", photo200Orig='").append(photo200Orig).append('\'');
        sb.append(", photo400Orig='").append(photo400Orig).append('\'');
        sb.append(", photoMaxOrig='").append(photoMaxOrig).append('\'');
        sb.append(", hasMobile=").append(hasMobile);
        sb.append(", online=").append(online);
        sb.append(", canPost=").append(canPost);
        sb.append(", canSeeAllPosts=").append(canSeeAllPosts);
        sb.append(", canSeeAudio=").append(canSeeAudio);
        sb.append(", canWritePrivateMessage=").append(canWritePrivateMessage);
        sb.append(", mobilePhone='").append(mobilePhone).append('\'');
        sb.append(", homePhone='").append(homePhone).append('\'');
        sb.append(", site='").append(site).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", lastSeen=").append(lastSeen);
        sb.append(", commonCount=").append(commonCount);
        sb.append(", counters=").append(counters);
        sb.append(", university=").append(university);
        sb.append(", universityName='").append(universityName).append('\'');
        sb.append(", faculty=").append(faculty);
        sb.append(", facultyName='").append(facultyName).append('\'');
        sb.append(", graduation=").append(graduation);
        sb.append(", educationForm='").append(educationForm).append('\'');
        sb.append(", relation=").append(relation);
        sb.append(", universities=").append(universities);
        sb.append(", schools=").append(schools);
        sb.append(", relatives=").append(relatives);
        sb.append('}');
        return sb.toString();
    }
}
