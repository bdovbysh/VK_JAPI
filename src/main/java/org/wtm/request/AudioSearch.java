//package org.wtm.request;
//
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
//import org.wtm.entity.Audio;
//import org.wtm.exceptions.RequestException;
//import org.wtm.response.ResponseWithItems;
//
//import java.lang.reflect.Type;
//import java.util.List;
//
///**
// * Created by dovbysh on 12.08.14.
// */
//public class AudioSearch extends Request {
//
//    private static final String AUDIO_SEARCH = "audio.search";
//    private Gson gson;
//    private Type responseType;
//
//    public AudioSearch(String token){
//       super(AUDIO_SEARCH,token);
//       gson = new Gson();
//       responseType = new TypeToken<ResponseWithItems<Audio>>(){}.getType();
//    }
//
//    private String q; // текст поискового запроса, например, The Beatles.
//    private Integer autoComplete;// Если этот параметр равен 1, возможные ошибки в поисковом запросе будут исправлены.
//    // Например, при поисковом запросе Иуфдуы поиск будет осуществляться по строке Beatles.прапор, може приймати значення 1 або 0
//    private Integer lyrics;// Если этот параметр равен 1, поиск будет производиться только по тем аудиозаписям, которые содержат тексты.
//    private Integer performerOnly; // Если этот параметр равен 1, поиск будет осуществляться только по названию исполнителя.
//    private Integer sort;// Вид сортировки. 2 — по популярности, 1 — по длительности аудиозаписи, 0 — по дате добавления.
//    private Integer searchOwn;// 1 – искать по аудиозаписям пользователя, 0 – не искать по аудиозаписям пользователя (по умолчанию).
//    private Integer offset;// смещение, необходимое для выборки определенного подмножетсва аудиозаписей. По умолчанию — 0.
//    private Integer count;//   count количество аудиозаписей, информацию о которых необходимо вернуть
//
//
//    public AudioSearch setQ(String q) {
//        this.q = q;
//        addParameter("q",q);
//        return this;
//    }
//
//    public AudioSearch setAutoComplete(Integer autoComplete) {
//        this.autoComplete = autoComplete;
//        addParameter("auto_complete",autoComplete);
//        return this;
//    }
//
//    public AudioSearch setLyrics(Integer lyrics) {
//        this.lyrics = lyrics;
//        addParameter("lyrics",lyrics);
//        return this;
//    }
//
//    public AudioSearch setPerformerOnly(Integer performerOnly) {
//        this.performerOnly = performerOnly;
//        addParameter("performer_only",performerOnly);
//        return this;
//    }
//
//    public AudioSearch setSort(Integer sort) {
//        this.sort = sort;
//        addParameter("sort",sort);
//        return this;
//    }
//
//    public AudioSearch setSearchOwn(Integer searchOwn) {
//        this.searchOwn = searchOwn;
//        addParameter("search_own",searchOwn);
//        return this;
//    }
//
//    public AudioSearch setOffset(Integer offset) {
//        this.offset = offset;
//        addParameter("offset",offset);
//        return this;
//    }
//
//    public AudioSearch setCount(Integer count) {
//        this.count = count;
//        addParameter("count",count);
//        return this;
//    }
//
//
//    public List<Audio> search() throws RequestException{
//        ResponseWithItems<Audio> responseWithItems = gson.fromJson(makeRequest(), responseType);
//        return responseWithItems.getResponse().getItems();
//    }
//}
