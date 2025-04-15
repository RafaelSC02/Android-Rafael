package Model;

import androidx.room.Database;

@Database(entities = {Pessoa.class}, version = 1)
public abstract class AppDatabase {

    public abstract PessoaDao pessoadao();

}
