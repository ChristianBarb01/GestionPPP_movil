package network;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {
    private static Retrofit retrofit;
    public static Retrofit getStudents(){
        retrofit = new Retrofit.Builder()
                .baseUrl("")//api
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
