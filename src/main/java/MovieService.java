import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

import java.io.IOException;
import java.util.List;

public class MovieService {
    public static String title;
    public static  String API_URL = "https://imdb8.p.rapidapi.com";
    public static void enterTitleUrl(){
//        Scanner scanner = new Scanner(System.in);
//        title = scanner.nextLine();
        title = "inception";
    }
    public interface Movie{
        @Headers({
                "X-RapidAPI-Key: 74dc76cf0dmsh5086c65d2f8de38p1f18fdjsn53810525ff06",
                "X-RapidAPI-Host: imdb8.p.rapidapi.com"
        })
        @GET("/auto-complete")
        Call<MovieResponse> movies(@Query("q") String title);
    }
    public static void main(String[] args) throws IOException {
        enterTitleUrl();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        Movie movie = retrofit.create(Movie.class);

        Call<MovieResponse> call = movie.movies(title);

        MovieResponse movies = call.execute().body();
        System.out.println(movies.d[0]);

    }
}

