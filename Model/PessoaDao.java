package Model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
@Dao
public interface PessoaDao {

    @Query("SELECT * FROM pessoa")
    List<Pessoa> getTodos();

    @Insert
    void InsertTodos(Pessoa... pessoas);

    @Delete
    void DeletarTodos(Pessoa...pessoas);

}
