package org.wtm.request;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.wtm.response.ResponseWithItems;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by dovbysh on 01.09.14.
 */
public class Audio {

    private final static String AUDIO_GET = "audio.get";
    private final static Integer defaultCount = 50;
    private final static Integer maxCount = 6000;
    private final static Integer defaultOffset = 0;

    @Autowired
    private Gson gson;
    private Type responseType;


    @Autowired
    private ApplicationContext context;

    public Audio(){
        responseType = new TypeToken<ResponseWithItems<org.wtm.entity.Audio>>(){}.getType();
    }


    public List<org.wtm.entity.Audio> getAudio(String uid,Integer count) throws Exception{
      Request request = (Request) context.getBean("requset");
        request.setMethodName(AUDIO_GET)
      .addParameter("owner_id",uid) .addParameter("offset",95)
      .addParameter("count",count);
      ResponseWithItems<org.wtm.entity.Audio> responseWithItems = gson.fromJson(request.makeRequest(), responseType);
      return responseWithItems.getResponse().getItems();
    }
}
