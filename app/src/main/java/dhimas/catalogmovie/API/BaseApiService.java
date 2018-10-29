package dhimas.catalogmovie.API;

import dhimas.catalogmovie.Entity.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BaseApiService {

    @GET("3/movie/now_playing")
    Call<MovieResponse> getNowPlayingMovie(@Query("api_key") String apiKey);

}
