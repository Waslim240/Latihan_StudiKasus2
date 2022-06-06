package waslim.binar.andlima.applikasinote.local

import androidx.room.*

@Dao
interface NoteDao {

    @Query("SELECT * FROM Note")
    fun getAllNoteTaking() : List<Note>

    @Insert
    fun insertNoteTaking(note: Note) : Long

}