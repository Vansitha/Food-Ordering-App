package com.example.foodapp.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.example.foodapp.models.FoodItem;

public class DBCursor extends CursorWrapper {

    public DBCursor(Cursor cursor) {
        super(cursor);
    }

    public FoodItem getFoodItem() {
        int resturantID = getInt(getColumnIndex(FoodDeliverySchema.ResturantTable.Cols.RESTURANT_ID));
        String resturantName = getString(getColumnIndex(FoodDeliverySchema.ResturantTable.Cols.RESTURANT_NAME));
        String foodName = getString(getColumnIndex(FoodDeliverySchema.ResturantTable.Cols.FOOD_ITEM));
        int price = getInt(getColumnIndex(FoodDeliverySchema.ResturantTable.Cols.PRICE));
        String foodDesc = getString(getColumnIndex(FoodDeliverySchema.ResturantTable.Cols.DESCRIPTION));
        int foodImageRef = getInt(getColumnIndex(FoodDeliverySchema.ResturantTable.Cols.FOOD_IMAGE_REF));
        int resturantImageRef = getInt(getColumnIndex(FoodDeliverySchema.ResturantTable.Cols.RESTURANT_LOGO_REF));

        return new FoodItem(resturantID, resturantName, foodName, price, foodDesc, foodImageRef, resturantImageRef);
    }


}
