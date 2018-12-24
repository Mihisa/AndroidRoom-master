package com.mihisa.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Person.class}, version = 2)
public abstract class PersonDatabase extends RoomDatabase {
    public abstract PersonDAO PersonDatabase();
}
