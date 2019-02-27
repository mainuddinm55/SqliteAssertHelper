package com.kcirqueit.sqliteasserthelper;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.kcirqueit.sqliteasserthelper.asserthelper.SQLiteAssetHelper;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteAssetHelper {
    private static final String DATABASE_NAME = "info.db";
    private static final int DATABASE_VERSION = 1;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public List<Country> getAllCountry() {
        List<Country> countries = new ArrayList<>();
        String query = "SELECT * FROM CountryInfo ORDER BY country";
        SQLiteDatabase database = this.getWritableDatabase();
        Cursor cursor = database.rawQuery(query, null);
        if (cursor == null) return null;
        cursor.moveToFirst();
        do {
            int id = cursor.getInt(cursor.getColumnIndex("id"));
            String country = cursor.getString(cursor.getColumnIndex("country"));
            String capital = cursor.getString(cursor.getColumnIndex("capital"));
            String currency = cursor.getString(cursor.getColumnIndex("currency"));
            String language = cursor.getString(cursor.getColumnIndex("language"));
            String countryCode = cursor.getString(cursor.getColumnIndex("country_code"));
            String timezone = cursor.getString(cursor.getColumnIndex("timezone"));
            byte[] flag = cursor.getBlob(cursor.getColumnIndex("flag"));
            Country mCountry = new Country(id, country, capital, currency, language, countryCode, timezone, flag);
            countries.add(mCountry);
        } while (cursor.moveToNext());
        cursor.close();
        database.close();
        return countries;
    }
}
