package org.wtm.entity;

/**
 * Created by dovbysh on 01.10.14.
 */
public interface Constants {

    enum NameCase  {
        NOM,  // именительный
        GEN,  // родительный
        DAT,  // дательный
        ACC,  // винительный
        INS,  // творительный
        ABL   // предложный
    }

     enum Status {
        EMPTY,
        Single,
        Occurs,
        Engaged,
        Married,
        InLove,
        Complicated,
        ActivelySearching
    }

    enum Sex {
        ALL,
        WOMAN,
        MEN
    }

    String FIELDS_PARAM = "sex,bdate,city,country,photo_50,photo_100,photo_200_orig," +
            "photo_200,photo_400_orig,photo_max,photo_max_orig,online,online_mobile,domain,has_mobile," +
            "contacts,connections,site,education,universities,schools,can_post,can_see_all_posts," +
            "can_see_audio,can_write_private_message,status,last_seen,common_count,relation,relatives," +
            "counters,screen_name,maiden_name,timezone,occupation,activities,interests,music,movies," +
            "tv,books,games,about,quotes";

    String FIELDS_NO_TOKEN = "nickname,screen_name,"
    		+ "sex,bdate,city,country,timezone,"
    		+ "photo_50,photo_100,photo_200_orig,"
    		+ "has_mobile,contacts,education,online,"
    		+ "counters,relation,last_seen,status,"
    		+ "can_write_private_message,can_see_all_posts,"
    		+ "can_post,universities";
    
}
