package ims.imsnotificationsystem;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

//Bantuan SQL Lite
public class AlarmReminderDbHelper extends SQLiteOpenHelper {
    //Nama database
    private static final String DATABASE_NAME = "imsnotif.db";

    private static final int DATABASE_VERSION = 1;

    public AlarmReminderDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //Create tabel database+tipe data
        String SQL_CREATE_ALARM_TABLE =  "CREATE TABLE " + AlarmReminderContract.AlarmReminderEntry.TABLE_NAME + " ("
                + AlarmReminderContract.AlarmReminderEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + AlarmReminderContract.AlarmReminderEntry.KEY_TITLE + " TEXT NOT NULL, "
                + AlarmReminderContract.AlarmReminderEntry.KEY_DATE + " TEXT NOT NULL, "
                + AlarmReminderContract.AlarmReminderEntry.KEY_TIME + " TEXT NOT NULL, "
                + AlarmReminderContract.AlarmReminderEntry.KEY_REPEAT + " TEXT NOT NULL, "
                + AlarmReminderContract.AlarmReminderEntry.KEY_REPEAT_NO + " TEXT NOT NULL, "
                + AlarmReminderContract.AlarmReminderEntry.KEY_REPEAT_TYPE + " TEXT NOT NULL, "
                + AlarmReminderContract.AlarmReminderEntry.KEY_ACTIVE + " TEXT NOT NULL " + " );";

        //Eksekusi SQL
        sqLiteDatabase.execSQL(SQL_CREATE_ALARM_TABLE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
