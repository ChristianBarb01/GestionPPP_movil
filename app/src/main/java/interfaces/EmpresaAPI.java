package interfaces;

import java.util.List;

import model.Empresa;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface EmpresaAPI {
    @GET("/api/empresa/listar")
    Call<List<Empresa>> obtenerLista();

    @GET("/api/empresa/buscar/{id}")
    Call<Empresa> getById(@Path("id") Integer id);
}
