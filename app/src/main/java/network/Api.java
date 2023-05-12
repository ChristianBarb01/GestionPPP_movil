package network;


import interfaces.EmpresaAPI;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {
    private static Retrofit retrofit;
    public static Retrofit getStudents(){
        retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.18.126:4200/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }


}

